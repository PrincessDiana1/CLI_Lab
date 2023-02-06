

public class Passenger {

    private String name;
    private int contactinfo;
    private int ID;

    public Passenger(String name, int contactinfo, int ID) {
        this.name = name;
        this.contactinfo = contactinfo;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(int contactinfo) {
        this.contactinfo = contactinfo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
