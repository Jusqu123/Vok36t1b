package fi.jamk.vok36t1b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    AutoCompleteTextView actv = (AutoCompleteTextView)
            findViewById(R.id.login); // add stings to control
    ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
            android.R.layout.simple_dropdown_item_1line,
            new String[]
                    {"Juuso","Juha","Kari","Jouni","Esa","Hannu"});
actv.setAdapter(aa);}
        public void selectButtonClicked(View view) {
           AutoCompleteTextView login = (AutoCompleteTextView) findViewById(R.id.login);
        EditText password = (EditText)findViewById(R.id.password);

            String text = login.getText().toString() + " " + password.getText().toString();
            Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();
        }
}

