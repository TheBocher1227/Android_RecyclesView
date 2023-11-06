package Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.autosrecycleviews.R;

import java.util.List;

import Models.Lamborguini;

public class LamborguiniAdapter extends RecyclerView.Adapter<LamborguiniAdapter.ViewHolder> {
   private List<Lamborguini> lamborguinis;
    public LamborguiniAdapter(List<Lamborguini>lamborguinis)
    {
this.lamborguinis=lamborguinis;
    }

    @NonNull
    @Override
    public LamborguiniAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from((parent.getContext()));
        View v=layoutInflater.inflate(R.layout.lamborguiniitem,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull LamborguiniAdapter.ViewHolder holder, int position) {
  Lamborguini lambo = lamborguinis.get(position);
  holder.SetData(lambo);
    }

    @Override
    public int getItemCount() {
        return lamborguinis.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvcolor,tvmodelo,tvmotor,tvllantas;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvcolor=itemView.findViewById(R.id.tvcolor);
            tvmodelo=itemView.findViewById(R.id.tvmodelo);
            tvllantas=itemView.findViewById(R.id.tvllantas);
            tvmotor=itemView.findViewById(R.id.tvmotor);
        }

        public void SetData(Lamborguini lambo) {
            tvmodelo.setText(lambo.getModelo());
            tvcolor.setText(lambo.getColor());
            tvmotor.setText(lambo.getMotor().getCilindros());
            tvllantas.setText(lambo.getLlanta().getMarca());
        }
    }
}
