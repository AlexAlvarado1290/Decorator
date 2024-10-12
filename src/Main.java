import javax.annotation.processing.SupportedSourceVersion;

public class Main {
    public static void main(String[] args) {
        Bebida cafe = new CafeSimple();
        System.out.println(cafe.getDescripcion() + " $" + cafe.getCosto());

        cafe = new ConAzucar(cafe);
        System.out.println(cafe.getDescripcion() + " $" + cafe.getCosto());

        cafe = new ConLeche(cafe);
        System.out.println(cafe.getDescripcion() + " $" + cafe.getCosto());
    }
}