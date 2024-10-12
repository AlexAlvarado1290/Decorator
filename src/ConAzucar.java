public class ConAzucar extends BebidaDecorator{
    public ConAzucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Azúcar";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 1.0;
    }
}
