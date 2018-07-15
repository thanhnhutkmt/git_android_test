package git_project.com.nhut.software.git_test_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("MyTag", "This is a first line.");
        TextView textview = (TextView) findViewById(R.id.textview);
        textview.setText("This is a first line.");

    }
}