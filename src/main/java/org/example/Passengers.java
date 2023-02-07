

public class Passengers {
    private String name;
    private int contactInfo;
    private int Id;

    public Passengers(String name, int contactInfo, int id) {
        this.name = name;
        this.contactInfo = contactInfo;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(int contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
