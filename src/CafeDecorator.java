public abstract class CafeDecorator extends Cafe{
    protected Cafe cafeDecorated;
    public CafeDecorator(Cafe cafeDecorated) {
        this.cafeDecorated = cafeDecorated;
    }
    @Override
    public double getPrecio(){
        return cafeDecorated.getPrecio();
    }
    @Override
    public String getIngredientes(){
        return cafeDecorated.getIngredientes();
    }
}
