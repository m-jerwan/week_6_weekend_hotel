package RoomAndEnum;

import Guest.Guest;

import static RoomAndEnum.BedroomType.SINGLE;

//===========================================================
public class Bedroom extends Room {
    private int roomNumber;
    private double ratePerNight;
    private BedroomType bedroomType;


// CONSTRUCTOR:
    public Bedroom(int roomNumber, double ratePerNight, BedroomType bedroomType){
        super(bedroomType.getCapacity());

        this.roomNumber  = roomNumber;
        this.ratePerNight = ratePerNight;
        this.bedroomType = bedroomType;
    }
// METHODS:

    public int getRoomNumber(){
        return this.roomNumber;
    }
    public double getRatePerNight(){
        return this.ratePerNight;
    }
    public Enum getBedroomType(){
        return this.bedroomType;
    }

    /**Adding guests to guestsList ArrayList.
     *
     * @param guest
     */
    public boolean checkIn(Guest guest){
        if (spacesLeft() > 0) {
            this.getGuestList().add(guest);
            this.changeSpacesLeft(1);
            return true;
        }
        return false;
    }

    /**Removes guest from guestList ArrayList.
     *
     * @param guest
     */
    public void checkOut(Guest guest){
        this.getGuestList().remove(guest);
    }

}
