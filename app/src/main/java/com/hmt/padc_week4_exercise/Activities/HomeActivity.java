package com.hmt.padc_week4_exercise.Activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.hmt.padc_week4_exercise.Fragments.PADC_Job_Search;
import com.hmt.padc_week4_exercise.Fragments.PADC_LinkedIn;
import com.hmt.padc_week4_exercise.Fragments.PADC_Movie;
import com.hmt.padc_week4_exercise.Fragments.PADC_Pulse;
import com.hmt.padc_week4_exercise.Fragments.PADC_Wanzim;
import com.hmt.padc_week4_exercise.R;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Bundle state = savedInstanceState;
        if(state == null){
            PADC_LinkedIn fragment = new PADC_LinkedIn();
            android.app.FragmentManager fragmentManager = getFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.content_frame, fragment)
                    .commit();
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        android.app.FragmentManager fragmentManager = getFragmentManager();


        if (id == R.id.nav_padc_linkedin) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, new PADC_LinkedIn())
                    .commit();


        } else if (id == R.id.nav_padc_job_search) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, new PADC_Job_Search())
                    .commit();


        } else if (id == R.id.nav_padc_pulse) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, new PADC_Pulse())
                    .commit();

        } else if (id == R.id.nav_padc_movie) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, new PADC_Movie())
                    .commit();

        } else if (id == R.id.nav_padc_wanzim) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, new PADC_Wanzim())
                    .commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
