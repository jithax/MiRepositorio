package training.lab2.abstraccion;

public class Guitarra extends InstrumentoCuerda {
    String tipoGuitarra;

    public Guitarra(int numeroCuerdas, String tipoGuitarra) {
        super(numeroCuerdas);
        this.tipoGuitarra = tipoGuitarra;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando la guitarra " + tipoGuitarra);
    }

    @Override
    public void afinarCuerdas() {
        System.out.println("Afinando " + numeroCuerdas + " cuerdas de la guitarra");
    }
}