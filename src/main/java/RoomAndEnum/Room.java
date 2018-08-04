package RoomAndEnum;

import Guest.Guest;

import java.util.ArrayList;

//===========================================================
public abstract class Room {
    private int capacity;
    private int spacesLeft;
    private ArrayList<Guest> guestLIst;
    private ArrayList<String> roomInfo;

// CONSTRUCTOR:
    public Room(int capacity){
        this.capacity = capacity;
        this.spacesLeft = capacity;
        this.guestLIst = new ArrayList<Guest>();     //CREATING NEW EMPTY ARRAY-LIST
    }


// METHODS:

    public int getCapacity(){
        return this.capacity;
    }

    public void changeSpacesLeft(int numberOfPeople){
        this.spacesLeft -= numberOfPeople;
    }

    /** How many spaces left in the room?
     *
     * @return  int of free spaces
     */
    public int spacesLeft(){
        return this.spacesLeft;
    }

    /** Gets guests from this room.
     *
     * @return ArrayList
     */
    public ArrayList<Guest> getGuestList(){
        return guestLIst;
    }




}
