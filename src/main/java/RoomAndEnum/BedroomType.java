package RoomAndEnum;

public enum BedroomType {
    SINGLE(1,"Ideal for single travelers"),
    DOUBLE(2,"Great for couples with or without a child"),
    TWIN(2,"Good for traveling business colegues"),
    FAMILY(4,"Family up to four will sleep comftoably");

    private final int capacity;
    private final String description;

    BedroomType(int capacity,  String description){
        this.capacity = capacity;
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
    public int getCapacity(){
        return this.capacity;
    }

}
