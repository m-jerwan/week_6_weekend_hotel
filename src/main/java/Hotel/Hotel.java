package Hotel;

import Guest.Guest;
import RoomAndEnum.Bedroom;
import RoomAndEnum.ConferenceRoom;
import RoomAndEnum.DinningRoom;

import java.lang.reflect.Array;
import java.util.ArrayList;

//===========================================================
public class Hotel {
    String name;
    String address;
    String brand;
    ArrayList<Bedroom> allBedrooms;
    ArrayList<DinningRoom> allDinningRooms;
    ArrayList<ConferenceRoom> allConferenceRooms;
    ArrayList<Guest> masterGuestList;



// CONSTRUCTOR:
    public Hotel(String name, String address, String brand){
        this.name = name;
        this.address = address;
        this.brand = brand;
        this.allBedrooms = new ArrayList<>();
//        this.allDinningRooms = ArrayList<>();
        this.allConferenceRooms = new ArrayList<>();
    }

// METHODS:
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getBrand(){
        return this.brand;
    }
    public ArrayList<Bedroom> getAllBedrooms(){
        return allBedrooms;
    }
    public ArrayList<DinningRoom> getAllDinningRooms(){
        return this.allDinningRooms;
    }
    public ArrayList<ConferenceRoom> getAllConferenceRooms(){
        return allConferenceRooms;
    }



    /** Gets list of guests from a bedroom
     *
     * @param bedroom
     * @return ArrayList<Guest>
     */
    public ArrayList<Guest> getGuestsFromBedroom(Bedroom bedroom){
        return bedroom.getGuestList();
    }


    /** Gets list of <b>empty</b> bedrooms
     *
     * @return ArrayList
     */

    public ArrayList<Bedroom> listOfVacantBedrooms(){
//TODO: WRITE
        ArrayList<Bedroom> listOfVacantBedrooms = new ArrayList<Bedroom>();
        for (Bedroom bedroom : this.allBedrooms){
            if (bedroom.spacesLeft() == 0) {
                listOfVacantBedrooms.add(bedroom);
            }
        }
        return listOfVacantBedrooms;
        }

    /**Gets list of <b>all</b> hotel guests.
     *
     * @return ArrayList
     */
    public ArrayList<Guest> allHotelGuests(){
        ArrayList<Guest> allHotelGuests = new ArrayList<Guest>();
        for (Bedroom bedroom : this.getAllBedrooms()){
            for (Guest guest : bedroom.getGuestList()){
                allHotelGuests.add(guest);
            }
        }
        return allHotelGuests;
    }

//    TODO: access bedrooom method checkIn thru HOTEL






}
