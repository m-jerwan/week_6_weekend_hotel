import Guest.Guest;
import RoomAndEnum.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom_01;
    Guest guest_01;


    @Before
    public void before(){
        conferenceRoom_01 = new ConferenceRoom(10, "Smith", 50);
        guest_01 = new Guest("John", "Smith", "American");
    }

    @Test
    public void hasCapacity(){
        assertEquals(10,conferenceRoom_01.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Smith", conferenceRoom_01.getName());
    }

    @Test
    public void hasRate(){
        assertEquals(50, conferenceRoom_01.getRate(),0);
    }
    @Test
    public void bookAndCheckHowManySpacesLeft() {
        conferenceRoom_01.book(guest_01, 8);
        assertEquals(2, conferenceRoom_01.spacesLeft());
    }
    @Test
    public void overbookReturnFalse(){
        conferenceRoom_01.book(guest_01, 7);
        boolean result = conferenceRoom_01.book(guest_01, 8);
        assertEquals(false, result);
    }


}
