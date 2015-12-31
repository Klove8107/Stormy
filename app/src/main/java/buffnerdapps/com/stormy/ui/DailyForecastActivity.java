package buffnerdapps.com.stormy.ui;

        import android.app.ListActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Parcelable;
        import android.widget.ArrayAdapter;

        import java.util.Arrays;

        import buffnerdapps.com.stormy.R;
        import buffnerdapps.com.stormy.Weather.Day;
        import buffnerdapps.com.stormy.adapters.DayAdapter;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.DAILY_FORECAST);
        mDays = Arrays.copyOf(parcelables, parcelables.length, Day[].class);

        DayAdapter adapter = new DayAdapter(this, mDays);
        setListAdapter(adapter);
    }
}

