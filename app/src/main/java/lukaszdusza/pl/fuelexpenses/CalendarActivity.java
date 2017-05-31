package lukaszdusza.pl.fuelexpenses;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

public class CalendarActivity extends AppCompatActivity {
    private Button backToHomePageButtonFromCalendar;
    private Button calendarButton;
    private CalendarView calendarView;
    private String selectedDate;

    private Button dialogButton;
    private AlertDialog.Builder dialogButtonBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_layout);





        backToHomePageButtonFromCalendar =
                (Button) findViewById(R.id.backToHomePageButtonFromCalendar);
        calendarButton = (Button) findViewById(R.id.calendarButton);
        calendarView = (CalendarView) findViewById(R.id.calendarView);


        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                selectedDate = dayOfMonth + "/" + month + "/" + year;
                Toast.makeText(getApplicationContext(), selectedDate, Toast.LENGTH_SHORT).show();

            }
        });


        backToHomePageButtonFromCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToHomePageIntent = new Intent(CalendarActivity.this, MainActivity.class);
                startActivity(backToHomePageIntent);

                dialogButtonBuilder.create().show();
            }

        });


        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {


                Intent selectedDateFormCalendarIntent = new Intent(CalendarActivity.this,
                        ExpencesActivity.class);
                Bundle bundle = new Bundle();



                selectedDateFormCalendarIntent.putExtra("calendar.key", selectedDate);
                startActivity(selectedDateFormCalendarIntent);


            }




        });

        dialogButtonBuilder = new AlertDialog.Builder(this);
        dialogButtonBuilder.setTitle("test Dialog");

        dialogButtonBuilder.setPositiveButton("Nie klikam", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(CalendarActivity.this, "kliknąłeś!!!!!", Toast.LENGTH_LONG).show();
            }
        });

        dialogButtonBuilder.setNegativeButton("Tu Klikaj", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(CalendarActivity.this, "tu możesz klikać", Toast.LENGTH_LONG).show();
            }
        });

    }
}
