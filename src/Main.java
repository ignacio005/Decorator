public class Main {
    public static void main(String[] args) {
        Cafe cafeSolo = new CafeSolo();
        Cafe cafeLeche = new ConLeche(cafeSolo);
        Cafe cafeChocolate = new ConChocolate(cafeLeche);
        Cafe cafeEspuma = new ConEspuma(cafeLeche);

        System.out.println("El café solo cuesta " + cafeSolo.getPrecio() + " € y sus ingredientes son " + cafeSolo.getIngredientes());
        System.out.println("El café con leche cuesta " + cafeLeche.getPrecio() + " € y sus ingredientes son " + cafeLeche.getIngredientes());
        System.out.println("El café con chocolate cuesta " + cafeChocolate.getPrecio() + " € y sus ingredientes son " + cafeChocolate.getIngredientes());
        System.out.println("El café con espuma cuesta " + cafeEspuma.getPrecio() + " € y sus ingredientes son " + cafeEspuma.getIngredientes());
    }
}