package Models;

public class Lamborguini extends Auto{

    private String color;
    private String modelo;

    private Motor motor;

    private Llanta llanta;


    public Lamborguini(String color , String modelo , Motor motor , Llanta llanta ){
        this.color=color;
        this.modelo=modelo;
        this.llanta=llanta;
        this.motor=motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Llanta getLlanta() {
        return llanta;
    }

    public void setLlanta(Llanta llanta) {
        this.llanta = llanta;
    }
}
