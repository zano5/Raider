package raiderzfit.co.za.raider.Class;

import java.io.Serializable;

/**
 * Created by ProJava on 9/7/2016.
 */
public class Merchandise implements Serializable {

    private String id;
    private String type;
    private String area;
    private double price;
    private String contact;

    public Merchandise() {
        super();
    }

    public Merchandise(String id, String name, String area, double price,String contact) {
        this.id = id;
        this.type = name;
        this.area = area;
        this.contact = contact;
        this.price = price;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return type;
    }

    public void setName(String name) {
        this.type = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
