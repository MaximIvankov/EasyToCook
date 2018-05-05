package com.lucky.max.easytocook;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button b_cook;
    private Button b_exit;
    private Button b_addRcp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_cook = findViewById(R.id.b_cook);
        b_exit = findViewById(R.id.b_exit);
        b_addRcp = findViewById(R.id.b_addRcp);


        b_exit.setOnClickListener(this);
        b_cook.setOnClickListener(this);
        b_addRcp.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.b_cook: Intent intentCook = new Intent(MainActivity.this, ListRecipes.class);
            startActivity(intentCook);
            break;

            case R.id.b_addRcp: Intent intentAddRcp = new Intent(MainActivity.this, AddYourOwnRecipe.class);
                startActivity(intentAddRcp);
                break;


            case R.id.b_exit: System.exit(0);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {
            case R.id.recipe_list:
                Intent intentCook
                        = new Intent(MainActivity.this, ListRecipes.class);
                startActivity(intentCook);
                break;
            case R.id.last_recipe:

                Context context = getApplicationContext();
                CharSequence text = "Здесь пока пусто";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                break;

            case R.id.about_us:
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}
