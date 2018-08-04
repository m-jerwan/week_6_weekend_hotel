package RoomAndEnum;

import Guest.Guest;

//===========================================================
public class Bedroom extends Room {
    private int roomNumber;
    private double ratePerNight;
    private BedroomType bedroomType;
    private int stay;


// CONSTRUCTOR:
    public Bedroom(int roomNumber, double ratePerNight, BedroomType bedroomType){
        super(bedroomType.getCapacity());

        this.roomNumber  = roomNumber;
        this.ratePerNight = ratePerNight;
        this.bedroomType = bedroomType;
        this.stay = 0;
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
    public int getStay(){
        return stay;
    }

    /**Adding guests to guestsList ArrayList.
     *
     * @param guest
     */
    public boolean checkIn(Guest guest, int stay){
        if (spacesLeft() > 0) {
            this.getGuestList().add(guest);
            this.changeSpacesLeft(1);
            this.stay = stay;
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


