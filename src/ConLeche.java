public class ConLeche extends BebidaDecorator{
    public ConLeche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 2.0;
    }
}
