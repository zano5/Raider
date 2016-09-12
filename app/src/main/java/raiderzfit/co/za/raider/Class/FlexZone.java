package raiderzfit.co.za.raider.Class;

import android.graphics.Bitmap;

import java.io.File;
import java.io.Serializable;

/**
 * Created by ProJava on 9/8/2016.
 */
public class FlexZone implements Serializable {

    private String id;
    private String caption;
    private Bitmap bitmap;
    private String video;


    public FlexZone() {
    }

    public FlexZone(String id, String caption, Bitmap bitmap, String video) {
        this.id = id;
        this.caption = caption;
        this.bitmap = bitmap;
        this.video = video;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
