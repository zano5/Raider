package raiderzfit.co.za.raider.Class;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by ProJava on 9/8/2016.
 */
public class Beverages extends  Merchandise implements Serializable{


    private String name;
    private String shop;
    private Bitmap bitmap;


    public Beverages() {

        super();
    }


    public Beverages(String name,String shop, String area, Bitmap bitmap) {

        this.name = name;
        this.shop = shop;
        this.bitmap = bitmap;
    }


    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }


    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
