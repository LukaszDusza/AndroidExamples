package lukaszdusza.pl.fuelexpenses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ExpencesActivity extends AppCompatActivity {

    private Button sumExpencesButton;
    private TextView selectedDateTextView;
    private String contentFromCalendar;
    private EditText enterExpenceTextView;
    private String newExpenceInformation;
    private String INFORMATION_USER = "Please complete all fields";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expence_layout);
        
        selectedDateTextView = (TextView) findViewById(R.id.selectedDateTextView); 
        enterExpenceTextView = (EditText) findViewById(R.id.enterExpenceTextView);
        sumExpencesButton = (Button) findViewById(R.id.expencesButton);


        Intent intentFromCalendar = getIntent();
        contentFromCalendar = intentFromCalendar.getExtras().getString("calendar.key");
        selectedDateTextView.setText(contentFromCalendar);


        sumExpencesButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                newExpenceInformation = "Data: " + contentFromCalendar + ", "+
                        enterExpenceTextView.getText() + "PLN";

                if (contentFromCalendar == null || enterExpenceTextView.equals("")){

                    Toast.makeText(getApplicationContext(), INFORMATION_USER, Toast.LENGTH_SHORT).show();

                } else Toast.makeText(getApplicationContext(), newExpenceInformation, Toast.LENGTH_SHORT).show();


//                Intent toSummaryField = new Intent(ExpencesActivity.this, MainActivity.class);
//                toSummaryField.putExtra("summary.key", enterExpenceTextView.getText().toString());

            }
        });

    }
}
