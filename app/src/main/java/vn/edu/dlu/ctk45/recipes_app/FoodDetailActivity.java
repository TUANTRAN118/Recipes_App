package vn.edu.dlu.ctk45.recipes_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FoodDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chi_tiet_mon);

        ImageView imageViewFoodDetail = findViewById(R.id.imageViewFoodDetail);
        TextView textViewFoodName = findViewById(R.id.textViewFoodName);
        TextView textViewIngredients = findViewById(R.id.textViewIngredients);
        TextView textViewRecipe = findViewById(R.id.textViewRecipe);

        // Lấy thông tin món ăn từ Intent
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("selected_food")) {
            String selectedFood = intent.getStringExtra("selected_food");

            // Hiển thị thông tin chi tiết của món ăn trong layout mới
            if (selectedFood.equals(getString(R.string.flan_chocolate))) {
                textViewFoodName.setText(selectedFood);
                // Thay hình ảnh bằng hình ảnh tương ứng từ resources
                imageViewFoodDetail.setImageResource(R.drawable.banh_ngot_flan_chocolate);
                textViewIngredients.setText(getString(R.string.flan_chocolate_ing));
                textViewRecipe.setText(getString(R.string.flan_chocolate_recipe));
            } else {
                // Xử lý các món ăn khác
            }
        }
    }
}
