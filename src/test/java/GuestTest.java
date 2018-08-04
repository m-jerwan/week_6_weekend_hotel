import Guest.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest_01;

    @Before
    public void before(){
        guest_01 = new Guest("Bob", "Newman", "Canadian");
    }

    @Test
        public void hasFirstName() {
        assertEquals("Bob", guest_01.getFirstName());
    }

    @Test
        public void hasSecondName(){
        assertEquals("Newman", guest_01.getSecondName());
    }

    @Test
        public void hasNationaliy(){
        assertEquals("Canadian", guest_01.getNationality());
    }

}
