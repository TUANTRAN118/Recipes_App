package vn.edu.dlu.ctk45.recipes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
public class HienListFoodTamThoi extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mon_cho_dah_muc);

        ListView listView = findViewById(R.id.listView);

        Intent intent = getIntent();
        if (intent != null) {
            FoodItem[] foodItems = (FoodItem[]) intent.getSerializableExtra("foodList");
            ListFoodTamThoi adapter = new ListFoodTamThoi(this, new ArrayList<>(Arrays.asList(foodItems)));
            listView.setAdapter(adapter);
        }
    }
}

