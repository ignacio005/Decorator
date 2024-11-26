public class ConLeche extends CafeDecorator{
    public ConLeche(Cafe cafe){
        super(cafe);
    }

    @Override
    public double getPrecio(){
        return cafeDecorated.getPrecio() + 0.5;
    }
    @Override
    public String getIngredientes(){
        return cafeDecorated.getIngredientes() + ", leche";
    }
}
