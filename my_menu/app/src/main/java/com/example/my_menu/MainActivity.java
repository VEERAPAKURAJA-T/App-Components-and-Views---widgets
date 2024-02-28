package com.example.my_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
     /*we need to inflate the menu.xml in main activity
         inflate--meaning In this context, Inflate means reading a layout XML (often given as parameter)
         to translate them in Java code. This process happens: in an activity (the main process) or a fragment.

        */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       //menu folder is  android resource directory its inbuilt directory so we use get
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    /*now let add the functionality to perform the actions when the menu item
      is selected,override the on option item selected method
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id = item.getItemId();
        if(item_id==R.id.home) {
            Toast.makeText(this, "you selected home", Toast.LENGTH_LONG).show();
        }
        else if (item_id==R.id.search){
            Toast.makeText(this,"you selected search",Toast.LENGTH_LONG).show();}
        return super.onOptionsItemSelected(item);
    }
}