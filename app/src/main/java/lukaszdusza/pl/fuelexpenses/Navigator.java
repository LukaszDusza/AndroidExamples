package lukaszdusza.pl.fuelexpenses;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


public class Navigator {


    public void navigateToMainActivity(Context context, Bundle args) {
        if (null != context) {
            Intent intentToLaunch = new Intent(context, MainActivity.class);
            intentToLaunch.putExtra("MainActivity.key", args);
            context.startActivity(intentToLaunch);
        }
    }

     public void navigateToCalendarActivity(Context context, Bundle args) {

        if (null != context) {
            Intent intentToLaunch = new Intent(context, CalendarActivity.class);
            intentToLaunch.putExtra("CalendarActivity.key", args);
            context.startActivity(intentToLaunch);
        }
    }

    public void navigatetoExpencesActivity(Context context, Bundle args) {

        if (null != context) {
            Intent intentToLaunch = new Intent(context, ExpencesActivity.class);
            intentToLaunch.putExtra("ExpencesActivity.key", args);
            context.startActivity(intentToLaunch);
        }
    }


}


