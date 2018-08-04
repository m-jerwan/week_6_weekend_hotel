package Guest;

//===========================================================
public class Guest {
    String firstName;
    String secondName;
    String nationality;

// CONSTRUCTOR:
    public Guest(String firstName, String secondName, String nationality){
        this.firstName = firstName;
        this.secondName = secondName;
        this.nationality = nationality;
    }


//METHODS:
    public String getFirstName(){
        return this.firstName;
    }

    public String getSecondName(){
        return this.secondName;
    }

    public String getNationality(){
        return this.nationality;
    }

}
