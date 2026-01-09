package orientacaoObjetos.associacao.motocicleta;

public class Motocicleta {

    private String nomeMotocicleta;

    // atributo do tipo motor
    private Motor motor;



    public Motocicleta() {

    }

    public Motocicleta(Motor motor) {
        this.motor = motor;
    }

   public Motocicleta(int cilindradas, String nomeMotocicleta) {
        motor = new Motor(cilindradas);
        this.nomeMotocicleta = nomeMotocicleta;
   }


   public void mostrarCilindradas(){
       System.out.println("Motocicleta " + nomeMotocicleta + " com motor de "
               + motor.getCilindradas() + " cilindradas");
   }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getNomeMotocicleta() {
        return nomeMotocicleta;
    }

    public void setNomeMotocicleta(String nomeMotocicleta) {
        this.nomeMotocicleta = nomeMotocicleta;
    }
}
