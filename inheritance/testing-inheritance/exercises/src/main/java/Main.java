public class Main
{
    public static void main(String[] args)
    {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());   // prints true

        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        System.out.println("Plain cat noise: " + plainCat.noise()); // prints "Meeeeeeooooowww!"
        System.out.println("Cheshire cat noise: " + cheshireCat.noise()); // prints "Hello, my name is Cheshire!"

        HouseCat mittens = new HouseCat(8.4);

        HouseCat spike = new HouseCat("Spike");
        System.out.println("Spike weight: " + spike.getWeight()); // prints 13
        System.out.println("Mittens weight: " + mittens.getWeight()); // prints 13
    }

}
