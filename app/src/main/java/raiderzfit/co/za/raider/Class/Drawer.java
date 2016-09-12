package raiderzfit.co.za.raider.Class;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by ProJava on 9/5/2016.
 */
public class Drawer implements Serializable{

    private Bitmap image;
    private String name;

    public Drawer()
    {
        super();

    }

    public Drawer(Bitmap image, String name)
    {
        this.image = image;
        this.name = name;
    }


    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
