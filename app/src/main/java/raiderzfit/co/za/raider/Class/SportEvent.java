package raiderzfit.co.za.raider.Class;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by ProJava on 9/5/2016.
 */
public class SportEvent implements Serializable {

    private String  id;
    private String name;
    private double fee;
    private String area;
    private String bitmap;



    public SportEvent()
    {
        super();
    }

    public SportEvent(String id, String name, double fee,String area , String bitmap) {
        this.id = id;
        this.name = name;
        this.fee = fee;
        this.bitmap = bitmap;
        this.area = area;
    }


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBitmap() {
        return bitmap;
    }

    public void setBitmap(String bitmap) {
        this.bitmap = bitmap;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
