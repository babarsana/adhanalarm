package islam.adhanalarm;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AdhanAlarm extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.main);
        Spinner methods = (Spinner)findViewById(R.id.method);
        methods.setAllowWrap(true);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
        		this, R.array.calculation_methods, android.R.layout.simple_spinner_item);
        		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        methods.setAdapter(adapter);
    }
}