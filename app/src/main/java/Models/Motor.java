package Models;

public class Motor {

    private String cilindros;
    private  int caballos;


    public Motor(String cilindros , int caballos){
        this.caballos=caballos;
        this.cilindros=cilindros;
    }

    public String getCilindros() {
        return cilindros;
    }

    public void setCilindros(String cilindros) {
        this.cilindros = cilindros;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }
}
