public class Extracheese extends ToppingDecorator {
    BasePizza basePizza;

    public Extracheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 15;
    }
}
