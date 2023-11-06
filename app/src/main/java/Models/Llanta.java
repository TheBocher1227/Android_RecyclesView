package Models;

public class Llanta  {

    private  int psi;

    private  String marca;


    public Llanta(int psi, String marca){
        this.marca=marca;
        this.psi=psi;
    }

    public int getPsi() {
        return psi;
    }

    public void setPsi(int psi) {
        this.psi = psi;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
