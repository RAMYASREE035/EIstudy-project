public class Main {
    public static void main(String[] args) {
        Coffee basicCoffee = new BasicCoffee();
        System.out.println(basicCoffee.getDescription() + " $" + basicCoffee.getCost());

        Coffee milkCoffee = new MilkDecorator(new BasicCoffee());
        System.out.println(milkCoffee.getDescription() + " $" + milkCoffee.getCost());

        Coffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new BasicCoffee()));
        System.out.println(sugarMilkCoffee.getDescription() + " $" + sugarMilkCoffee.getCost());
    }
}
