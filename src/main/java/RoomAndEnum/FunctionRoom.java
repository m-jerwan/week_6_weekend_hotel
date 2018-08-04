package RoomAndEnum;


import Guest.Guest;

//===========================================================
public abstract class FunctionRoom  extends Room {
    private String name;
    private double rate;
    private int numberOfPeople;

// CONSTRUCTOR:

    public FunctionRoom(int capacity, String name, double ratePerDay) {
        super(capacity);
        this.name = name;
        this.rate = ratePerDay;
    }


// METHODS:

    public boolean bookRoom() {
        /* TODO: */
        return true;
    }

    public String getName() {
        return this.name;
    }

    public double getRate() {
        return this.rate;
    }

    public boolean book(Guest guest, int numberOfPeople) {
        if (spacesLeft() >= numberOfPeople){
            this.getGuestList().add(guest);
        changeSpacesLeft(numberOfPeople);
        return true;
        }
     return false;
    }




}