import Guest.Guest;
import RoomAndEnum.Bedroom;
import RoomAndEnum.BedroomType;
import org.junit.Before;
import org.junit.Test;

import static RoomAndEnum.BedroomType.FAMILY;
import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom_01;
    Bedroom bedroom_02;
    Bedroom bedroom_03;
    Bedroom bedroom_04;
    Guest guest_01;
    Guest guest_02;

    @Before
    public void before() {

        bedroom_01 = new Bedroom(11, 29.99, BedroomType.SINGLE);
        bedroom_02 = new Bedroom(21, 60.99, BedroomType.DOUBLE);
        bedroom_03 = new Bedroom(31, 62.99, BedroomType.TWIN);
        bedroom_04 = new Bedroom(41, 100.29, FAMILY);

        guest_01 = new Guest("Andrej", "Kozakiewicz", "Russian");
        guest_02 = new Guest("Andrew", "Weber", "American");
    }

    @Test
    public void hasRoomNo() {
        assertEquals(11, bedroom_01.getRoomNumber());
    }

    @Test
    public void hasRateDouble() {
        assertEquals(60.99, bedroom_02.getRatePerNight(), 0);
    }

    @Test
    public void hasRateTwin() {
        assertEquals(62.99, bedroom_03.getRatePerNight(), 0);
    }

    @Test
    public void hasType() {
        assertEquals(FAMILY, bedroom_04.getBedroomType());
    }

    @Test
    public void guestsListStartsEmpty() {
        assertEquals(0, bedroom_01.getGuestList().size());
    }

    @Test
    public void checkingIn() {
        bedroom_01.checkIn(guest_01,1);
        assertEquals(1, bedroom_01.getGuestList().size());
    }

    @Test
    public void checkingOut() {
        bedroom_01.checkIn(guest_01,1);
        bedroom_01.checkOut(guest_01);
        assertEquals(0, bedroom_01.getGuestList().size());
    }

    @Test
    public void checkingOverCapacity() {
        bedroom_01.checkIn(guest_01,1);
        bedroom_01.checkIn(guest_02,1);
        assertEquals(1, bedroom_01.getGuestList().size());
    }

    @Test
    public void checkingOverCapacityReturnFalse() {
        bedroom_01.checkIn(guest_01,1);
        Boolean error = bedroom_01.checkIn(guest_02,1);
        assertEquals(false, error);
    }
}
