public class ConEspuma extends CafeDecorator{
    public ConEspuma(Cafe cafe){
        super(cafe);
    }
    @Override
    public double getPrecio(){
        return cafeDecorated.getPrecio() + 0.25;
    }
    @Override
    public String getIngredientes(){
        return cafeDecorated.getIngredientes() + ", espuma";
    }
}
