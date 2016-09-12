package raiderzfit.co.za.raider.Class;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by ProJava on 9/9/2016.
 */
public class FirebaseHelper {

    private DatabaseReference db;
    private Boolean saved = null;

    public FirebaseHelper(DatabaseReference db)
    {
        this.db = db;
    }

    public Boolean saveSportEvent(SportEvent sportEvent)
    {

        if(sportEvent == null)
        {
            saved = false;
        }else
        {

            try
            {
                db.child("SportEvents").setValue(sportEvent);
                saved = true;

            }catch(DatabaseException e)
            {
                e.printStackTrace();
            }
        }
        return saved;
    }

}
