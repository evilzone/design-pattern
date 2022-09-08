public class Application {

  public static void main(String[] args) {
    BasePizza pizza = new Mushroom(new Extracheese(new Margherita()));
    System.out.println(pizza.cost());

    pizza = new Extracheese(new Mushroom(new Farmhouse()));
    System.out.println(pizza.cost());
  }
}
