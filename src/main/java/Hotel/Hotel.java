package Hotel;

import Guest.Guest;
import RoomAndEnum.Bedroom;
import RoomAndEnum.ConferenceRoom;
import RoomAndEnum.DinningRoom;
import java.util.ArrayList;

//===========================================================
public class Hotel {
    String name;
    String address;
    String brand;
    ArrayList<Bedroom> allBedrooms;
    ArrayList<DinningRoom> allDinningRooms;
    ArrayList<ConferenceRoom> allConferenceRooms;



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
     * @return ArrayList -String
     */
    public ArrayList<Guest> getGuestsFromBedroom(Bedroom bedroom){
        return bedroom.getGuestList();
    }


    /** Gets list of <b>empty</b> bedrooms numbers
     *
     * @return ArrayList -String
     */

    public ArrayList<Integer> listOfVacantBedrooms(){
        ArrayList<Integer> listOfVacantBedrooms = new ArrayList<Integer>();
        for (Bedroom bedroom : this.allBedrooms){
            if (bedroom.spacesLeft() == 0) {
                listOfVacantBedrooms.add(bedroom.getRoomNumber());
            }
        }
        return listOfVacantBedrooms;
        }

    /**Gets list of <b>all</b> hotel guest names.
     *
     * @return ArrayList
     */
    public ArrayList<String> allHotelGuests(){
        ArrayList<String> allHotelGuests = new ArrayList<String>();
        for (Bedroom bedroom : this.getAllBedrooms()){
            for (Guest guest : bedroom.getGuestList()){
                allHotelGuests.add(guest.getFirstName()+" "+guest.getSecondName());
            }
        }
        return allHotelGuests;
    }



//    TODO: should "checkIn" be a Bedrooms or Hotels method?






}
