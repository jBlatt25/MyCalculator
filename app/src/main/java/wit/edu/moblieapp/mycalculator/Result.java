package wit.edu.moblieapp.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        Bundle bundle = this.getIntent().getExtras();
        String gender = bundle.getString("Gender");
        String feet = bundle.getString("Feet");
        String inches = bundle.getString("Inches");

        TextView textfeet = (TextView)findViewById(R.id.textfeet);
        textfeet.setText("feet:" +feet );
        TextView textinches = (TextView)findViewById(R.id.textinches);
        textinches.setText("inches" + inches);

        TextView textgender = (TextView)findViewById(R.id.textgender);
        textgender.setText("Your gender is " + gender);



    }
}