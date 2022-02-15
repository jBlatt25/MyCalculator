package wit.edu.moblieapp.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);




        //define the radio buttons
        RadioButton buttonFemale = (RadioButton)findViewById(R.id.radioFemale);
        RadioButton buttonMale = (RadioButton)findViewById(R.id.radioMale);

        TextView textFeet = (TextView)findViewById(R.id.textFeet);
        TextView textInches = (TextView)findViewById(R.id.textInches);

        //define the "calculate" button
        Button activity1_btn = (Button)findViewById(R.id.calbutton);
        //listener for the "calculate" button
        activity1_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

               //define the intent and information bundle
                Intent intent = new Intent();
                Bundle bundle = new Bundle();

                //check if the male or female button is checked
                if (buttonFemale.isChecked())
                {
                    bundle.putString("Gender","Female"); //sned female to bundle
                }
                else if (buttonMale.isChecked())
                {
                    bundle.putString("Gender","Male"); //send male to bundle
                }


                intent.putExtras(bundle); //send the information bundle
                intent.setClass(Calculator.this, Result.class); //switch the page ot the result page

                Log.v("MyApp","displaying result");

                startActivity(intent); //actually switches and activites the bundle when button is pressed

            }
        });
        }


        //for some fucking reason clicking a radio button crashes the app if this isnt here
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioFemale:
                if (checked)

                    break;
            case R.id.radioMale:
                if (checked)

                    break;
        }
    }

}
