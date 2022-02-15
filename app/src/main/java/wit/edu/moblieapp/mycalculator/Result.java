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
        int feet = bundle.getInt("feet");
        int inches = bundle.getInt("inch");
        double weight = bundle.getDouble("weight");

        //display gender
        TextView textgender = (TextView)findViewById(R.id.textgender);
        textgender.setText("You are " + gender);
        //display height
        TextView textfeet = (TextView)findViewById(R.id.textfeet);
        textfeet.setText("Your height is " + feet + "'" + inches + '"' );
        //display weight
        TextView textinches = (TextView) findViewById(R.id.textinches);
        textinches.setText("The standard weight is " + weight + " kg");





    }
}