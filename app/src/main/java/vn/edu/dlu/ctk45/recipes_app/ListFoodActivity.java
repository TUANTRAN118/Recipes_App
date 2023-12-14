package vn.edu.dlu.ctk45.recipes_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListFoodActivity extends AppCompatActivity {
    private ListView listViewFoods;
    private ArrayList<String> listOfFoods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mon_cho_dah_muc);

        // Lấy dữ liệu món ăn từ cơ sở dữ liệu hoặc nguồn dữ liệu khác
        listOfFoods = getFoodsForCategory("BANH_NGOT");


        // Hiển thị danh sách món ăn trong ListView
        listViewFoods = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listOfFoods);
        listViewFoods.setAdapter(adapter);

        // Xử lý sự kiện khi người dùng chọn một món ăn trong danh sách
        listViewFoods.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedFood = listOfFoods.get(position);

                // Chuyển sang layout mới để hiển thị thông tin chi tiết về món ăn được chọn
                Intent detailIntent = new Intent(ListFoodActivity.this, FoodDetailActivity.class);
                detailIntent.putExtra("selected_food", selectedFood);
                startActivity(detailIntent);
            }
        });
    }

    // Phương thức này sẽ lấy danh sách món ăn từ cơ sở dữ liệu của bạn
    private ArrayList<String> getFoodsForCategory(String category) {
        ArrayList<String> listOfFoods = new ArrayList<>();
        listOfFoods.add(getString(R.string.flan_chocolate)); // Thêm món flan_chocolate vào danh sách
        // Thêm các món khác từ cơ sở dữ liệu của bạn
        // ...

        return listOfFoods;
    }
}


