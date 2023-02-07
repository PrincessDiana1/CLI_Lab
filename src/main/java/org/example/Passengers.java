package org.example;

public class Passengers {
    private String name;
    private String contactInfo;
    private int id;

    public Passengers(String name, String contactInfo, int id) {
        this.name = name;
        this.contactInfo = contactInfo;
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }
}
