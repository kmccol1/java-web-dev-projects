import org.example.Computer;
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



}
