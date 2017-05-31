package lukaszdusza.pl.fuelexpenses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button addExpenceButton;
    private Button historyButton;
    private TextView summaryTextField;
    private String contentFromExpencesActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addExpenceButton = (Button) findViewById(R.id.addExpenceButton);

        addExpenceButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent toCalendarPage = new Intent(MainActivity.this, CalendarActivity.class);
                startActivity(toCalendarPage);
            }
        });

//        Intent intentFromExpencesActivity = getIntent();
//        contentFromExpencesActivity = intentFromExpencesActivity.getExtras().get("summary.key").toString();
//        summaryTextField.setText(contentFromExpencesActivity);

    }


}
