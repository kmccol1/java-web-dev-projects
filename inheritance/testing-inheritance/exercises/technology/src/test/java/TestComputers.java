import org.example.Computer;
import org.example.Laptop;
import org.example.SmartPhone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestComputers
{
    @Test
    public void testComputerSounds()
    {
        Computer myPC = new Computer();
        assertEquals("Beeep!", myPC.makeSounds());
    }
    @Test
    public void testComputerDefaultOS()
    {
        Computer myPC = new Computer();
        assertEquals("TBD...", myPC.getOs());
    }

    @Test
    public void testComputerDefaultMake()
    {
        Computer myPC = new Computer();
        assertEquals("Unknown", myPC.getMake());
    }

    @Test
    public void testLaptopKeyboard()
    {
        Computer myPC = new Laptop("Microsoft", "Surface Pro", 21.6);
        assertEquals("Beeep!", myPC.makeSounds());
    }
    @Test
    public void testLaptopInheritance()
    {
        Computer myPC = new Laptop("Microsoft", "Surface Pro", 21.6);
        assertEquals("TBD...", myPC.getOs());
    }

    @Test
    public void testLaptopDefaultSize()
    {
        Computer myPC = new Laptop();
        assertEquals(0, ((Laptop) myPC).getDisplaySize());
    }

    @Test
    public void testSmartPhoneSwipe()
    {
        Computer myPC = new SmartPhone("Microsoft", "Surface Pro", 21.6);
        assertEquals("Beeep!", myPC.makeSounds());
    }
    @Test
    public void testSmartPhoneInheritance()
    {
        Computer myPC = new SmartPhone("Microsoft", "Surface Pro", 21.6);
        assertEquals("Swiped once.", ((SmartPhone) myPC).swipe());
    }

    @Test
    public void testSmartPhoneStorageSize()
    {
        Computer myPC = new SmartPhone();
        assertEquals(0, ((SmartPhone) myPC).getStorageSize());
    }



}
