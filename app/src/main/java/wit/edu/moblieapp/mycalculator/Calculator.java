package wit.edu.moblieapp.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Calculator extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        Button activity1_btn = (Button)findViewById(R.id.calbutton);
        activity1_btn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                Bundle bundle = new Bundle();


                intent.putExtras(bundle);
                intent.setClass(Calculator.this, Result.class);

                Log.v("MyApp","displaying result");

                startActivity(intent);

            }
        });
        }
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
