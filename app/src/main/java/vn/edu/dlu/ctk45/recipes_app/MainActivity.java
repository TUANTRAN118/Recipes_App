package vn.edu.dlu.ctk45.recipes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.content.Context;


public class MainActivity extends AppCompatActivity {
    private int[] imgs = {
            R.drawable.mon_banh_man,
            R.drawable.mon_banh_ngot,
            R.drawable.mon_bun_pho_mi,
            R.drawable.mon_canh,
            R.drawable.mon_chao_soup,
            R.drawable.mon_do_uong,
            R.drawable.mon_kem,
            R.drawable.mon_thit_cha_nem,
            R.drawable.mon_salad,
            R.drawable.mon_snacks};

    private String[] foodCategory = {
            "Bánh mặn",
            "Bánh ngọt",
            "Bún - Phở - Mì",
            "Canh",
            "Cháo - Soup",
            "Đồ uống",
            "Kem",
            "Thịt - Chả - Nem",
            "Salad",
            "Snacks",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridView);
        CustomAdapter adapter = new CustomAdapter(this, imgs, foodCategory);
        gridView.setAdapter(adapter);

        /*
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Lấy thông tin về nhóm món ăn khi nhấn vào item trong GridView
                String selectedCategory = foodCategory[position]; // Đây là tên nhóm món ăn được chọn

                // Tạo Intent để chuyển sang layout mới để hiển thị danh sách món ăn
                Intent intent = new Intent(MainActivity.this, ListFoodActivity.class);
                intent.putExtra("category", selectedCategory);
                startActivity(intent);
            }
        });
        */
        FoodDatabaseHelper dbHelper = new FoodDatabaseHelper(this);

        dbHelper.addFoodToCategory("BANH_NGOT", String.valueOf(R.string.flan_chocolate), "banh_ngot_flan_chocolate", String.valueOf(R.string.flan_chocolate_ing), String.valueOf(R.string.flan_chocolate));

    }
}