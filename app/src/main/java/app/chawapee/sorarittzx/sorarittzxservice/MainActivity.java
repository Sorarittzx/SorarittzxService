package app.chawapee.sorarittzx.sorarittzxservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.zip.Adler32;

import app.chawapee.sorarittzx.sorarittzxservice.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Add Fragment to Activity
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentFragmentMain,new MainFragment()).commit();
        }


    } //Main Method
}  // Main Class
