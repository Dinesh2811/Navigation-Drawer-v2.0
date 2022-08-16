package com.dinesh.navigationdrawer;


import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;

public class NavigationDrawer extends ToolbarMain implements NavigationView.OnNavigationItemSelectedListener {
    private final String TAG = "log_" + this.getClass().toString().split(this.getClass().getPackage().getName().split("\\.")[2] + ".")
            [this.getClass().toString().split(this.getClass().getPackage().getName().split("\\.")[2] + ".").length - 1];

    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;
    public NavigationView navigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_drawer);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawerLayout);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigationView);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);

        navigationView.setNavigationItemSelectedListener(this);

//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//
//
//        FragmentOne fragmentOne = new FragmentOne();
//        fragmentTransaction.replace(R.id.frameLayoutInflateAdapter,fragmentOne);
//        fragmentTransaction.commit();


    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.menuHome:
                Log.i(TAG, "onNavigationItemSelected: "+item.getTitle());
                break;
            case R.id.menuJava:
                Log.i(TAG, "onNavigationItemSelected: "+item.getTitle());
                break;
            case R.id.menuKotlin:
                Log.i(TAG, "onNavigationItemSelected: "+item.getTitle());
                break;
            case R.id.menuShortcut:
                Log.i(TAG, "onNavigationItemSelected: "+item.getTitle());
                break;
            case R.id.menuLogout:
                Log.i(TAG, "onNavigationItemSelected: "+item.getTitle());
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}



