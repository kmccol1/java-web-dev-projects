public class Main
{
    public static void main(String[] args)
    {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());   // prints true

        //HouseCat mittens = new HouseCat(8.4);

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight()); // prints 13
    }

}
