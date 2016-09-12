package raiderzfit.co.za.raider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import raiderzfit.co.za.raider.Class.FirebaseHelper;

public class CreateSportingEventActivity extends AppCompatActivity {

    private Spinner spType, spMatch;
    private EditText etEventName,etEventArea;
    private Button btnSubmit;
    private String[] type;
    private String[] basketOptions;
    private  String[] soccerOptions;
    private ArrayAdapter<String> typeAdapter;
    private ArrayAdapter<String> matchAdapter;
    private LinearLayout llMatch;
    private String mUserId;
    private DatabaseReference db;
    private FirebaseHelper helper;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_sporting_event);

        spType = (Spinner) findViewById(R.id.spType);
        spMatch = (Spinner) findViewById(R.id.spMatch);
        etEventName = (EditText) findViewById(R.id.etEventName);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        etEventName = (EditText) findViewById(R.id.etEventName);
        etEventArea = (EditText) findViewById(R.id.etEventArea);
        llMatch = (LinearLayout) findViewById(R.id.llMatch);
        type = getResources().getStringArray(R.array.event_options);
        basketOptions = getResources().getStringArray(R.array.backetball_options);
        soccerOptions = getResources().getStringArray(R.array.soccer_options);
        typeAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,type);
        spType.setAdapter(typeAdapter);



        textWatch();
        spinnerType();


    }


    public void textWatch()
    {

        etEventName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                btnSubmit.setEnabled(!etEventName.getText().toString().trim().isEmpty());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    public void spinnerType()
    {

        spType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                if (type[position].equals(getResources().getString(R.string.backetball_title))) {

                    matchAdapter = new ArrayAdapter<String>(CreateSportingEventActivity.this, android.R.layout.simple_spinner_dropdown_item, basketOptions);
                    spMatch.setAdapter(matchAdapter);
                }else if(type[position].equals(getResources().getString(R.string.soccer_title)))
                {
                    matchAdapter = new ArrayAdapter<String>(CreateSportingEventActivity.this, android.R.layout.simple_spinner_dropdown_item, soccerOptions);
                    spMatch.setAdapter(matchAdapter);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.create_event_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_back) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
