package com.introtoandroid.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnMovies;
    Button btnStock;
    Button btnBuildBigger;
    Button btnAppMat;
    Button btnUbiq;
    Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnMovies = (Button) findViewById(R.id.btnMovies);
        btnStock = (Button) findViewById(R.id.btnStock);
        btnBuildBigger = (Button) findViewById(R.id.btnBuildBigger);
        btnAppMat = (Button) findViewById(R.id.btnAppMat);
        btnUbiq = (Button) findViewById(R.id.btnUbiq);
        btnCapstone = (Button) findViewById(R.id.btnCapstone);

        setButton(btnMovies, "This button will launch my popular movies app!");
        setButton(btnStock, "This button will launch my stock hawk app!");
        setButton(btnBuildBigger, "This button will launch my build it bigger app!");
        setButton(btnAppMat, "This button will launch my make your app material app!");
        setButton(btnUbiq, "This button will launch my go ubiquitous app!");
        setButton(btnCapstone, "This button will launch my capstone app!");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void setButton(Button b, final String text) {
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}