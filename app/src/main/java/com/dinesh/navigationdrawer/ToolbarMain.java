package com.dinesh.navigationdrawer;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ToolbarMain extends AppCompatActivity {
    public Toolbar toolbar;
    public TextView tvToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar_layout);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        tvToolbar = (TextView) findViewById(R.id.tvToolbar);

//        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(ToolbarMain.this, "This is last activity", Toast.LENGTH_SHORT).show();
//            }
//        });

        tvToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ToolbarMain.this, "Hello World", Toast.LENGTH_SHORT).show();
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.menuAdmin:
                Toast.makeText(this, "Item 1 Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menuUser:
                Toast.makeText(this, "Item 2 Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.logout:
                Toast.makeText(this, "Log Out", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}

/*
 <item name="windowActionBar">false</item>
 <item name="windowNoTitle">true</item>
 */

/*
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
 */

/*

    <include
        android:id="@+id/toolbarLayout"
        layout="@layout/toolbar_layout"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />


 */