package vn.edu.dlu.ctk45.recipes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

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
    }
}