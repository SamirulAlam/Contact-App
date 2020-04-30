package com.example.kucse19;

public class Student {
    private String photo;
    private  String name;
    private  String id;
    private  String phone;
    private String home;
    private String hall;
    private String blood;

    public Student(String photo, String name, String id, String phone, String home, String hall, String blood) {
        this.photo = photo;
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.home = home;
        this.hall = hall;
        this.blood = blood;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
