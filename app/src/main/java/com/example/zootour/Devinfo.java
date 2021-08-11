package com.example.zootour;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class Devinfo extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle atoggle;


    @Override
    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.devinfo);

        drawerLayout = findViewById(R.id.infolay);
        atoggle = new ActionBarDrawerToggle(this,drawerLayout, R.string.open,R.string.close);
        drawerLayout.addDrawerListener(atoggle);
        atoggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final NavigationView nav = findViewById(R.id.nav);
        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id==R.id.exp)
                {
                    Intent intent = new Intent(Devinfo.this, Experience.class);
                    startActivity(intent);
                }
                else if (id==R.id.skills)
                {
                    Toast.makeText(Devinfo.this, "Skills", Toast.LENGTH_SHORT).show();
                }
                else if (id==R.id.views)
                {
                    Toast.makeText(Devinfo.this, "Views", Toast.LENGTH_SHORT).show();
                }
                else if (id==R.id.expts)
                {
                    Toast.makeText(Devinfo.this, "Expertise", Toast.LENGTH_SHORT).show();
                }
                else if (id==R.id.edu)
                {
                    Toast.makeText(Devinfo.this, "education", Toast.LENGTH_SHORT).show();
                }
                else if (id==R.id.ct)
                {
                    Toast.makeText(Devinfo.this, "Contact", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (atoggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
