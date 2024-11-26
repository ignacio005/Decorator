public class ConChocolate extends CafeDecorator{
    public ConChocolate(Cafe cafe){
        super(cafe);
    }
    @Override
    public double getPrecio(){
        return cafeDecorated.getPrecio() + 0.30;
    }
    @Override
    public String getIngredientes(){
        return cafeDecorated.getIngredientes() + ", chocolate";
    }
}
