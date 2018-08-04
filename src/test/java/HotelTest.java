import Guest.Guest;
import Hotel.Hotel;
import RoomAndEnum.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;


public class HotelTest {
    Guest guest_01;
    Guest guest_02;
    Bedroom bedroom_01;
    Bedroom bedroom_02;
    ConferenceRoom conferenceRoom_01;
    DinningRoom dinningRoom_01;
    Hotel hotel_01;
    ArrayList<Room> allBedrooms;



    @Before
    public void before(){
        guest_01 = new Guest("John", "Newman", "Canadian");
        guest_02 = new Guest("Joanna", "Krupa", "Polish");

        bedroom_01 = new Bedroom(11, 29.99, BedroomType.SINGLE);
        bedroom_02 = new Bedroom(21, 60.99, BedroomType.DOUBLE);

        conferenceRoom_01 = new ConferenceRoom(10, "Smith", 50);

        dinningRoom_01 = new DinningRoom(100, "Monroe", 0);

        hotel_01 = new Hotel("Fawlty Towers", "Stirling", "H1 Hotels");
        hotel_01.getAllBedrooms().add(bedroom_01);
        hotel_01.getAllBedrooms().add(bedroom_02);
        hotel_01.getAllConferenceRooms().add(conferenceRoom_01);
    }
    @Test
    public void constructor(){
        assertEquals("Fawlty Towers", hotel_01.getName());
    }

    @Test
        public void constructorNameOfCheckedGuest(){
            bedroom_01.checkIn(guest_01,1);
            assertEquals("John", hotel_01.getGuestsFromBedroom(bedroom_01).get(0).getFirstName());
    }

    @Test
    public void listOfVacantBedrooms(){
        bedroom_01.checkIn(guest_01,1);
        assertEquals(1, hotel_01.listOfVacantBedrooms().size()); //TODO: change so returns room no.
    }

    @Test
    public void allHotelGuests(){
        bedroom_01.checkIn(guest_01,1);
        bedroom_02.checkIn(guest_02,1);
        assertEquals(2, hotel_01.allHotelGuests().size());
    }

    @Test
    public void checkInfor2Nights(){
        bedroom_02.checkIn(guest_02,2);
        assertEquals(2, bedroom_02.getStay());
    }

}
