package training.lab2.abstraccion;

public class EjemploAbstraccion {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra(6, "Eléctrica");
        guitarra.tocar();
        guitarra.afinarCuerdas();
    }
}
