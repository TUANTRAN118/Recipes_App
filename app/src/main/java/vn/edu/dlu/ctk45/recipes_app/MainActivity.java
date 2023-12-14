package vn.edu.dlu.ctk45.recipes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.content.Context;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


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

    FoodItem[] mon_banh_man = {
            new FoodItem("Bánh mì bơ tỏi", R.drawable.banh_mi_bo_toi),
            new FoodItem("Bánh đúc", R.drawable.banh_duc),
            new FoodItem("Bánh tráng cuộn trứng kiểu Đài Loan", R.drawable.banh_trang_cuon_trung_kieu_dai_loan),
            new FoodItem("Bánh gối bọc thịt gà", R.drawable.banh_goi_boc_thit_ga)
    };
    FoodItem[] mon_banh_ngot = {
            new FoodItem("Bánh khoai môn dẻo bọc dừa", R.drawable.banh_khoai_mon_deo_boc_dua),
            new FoodItem("Bánh que Pocky chocolate", R.drawable.banh_que_pocky_chocolate),
            new FoodItem("Bánh bí hấp táo đỏ", R.drawable.banh_bi_hap_tao_do),
            new FoodItem("Bánh táo bằng nồi cơm điện", R.drawable.banh_tao_bang_noi_com_dien)
            // Thêm các mục khác tương tự ở đây
    };

    FoodItem[] mon_bun_pho_mi = {
            new FoodItem("Sợi mì tươi", R.drawable.soi_mi_tuoi),
            new FoodItem("Mì bạch tuộc phô mai", R.drawable.mi_bach_tuoc_pho_mai),
            new FoodItem("Bún riêu cua đồng", R.drawable.bun_rieu_cua_dong),
            new FoodItem("Mì ốc hến bạch tuộc", R.drawable.mi_oc_hen_bach_tuoc)
            // Thêm các mục khác tương tự ở đây
    };

    FoodItem[] mon_canh = {
            new FoodItem("Canh đậu hũ non Nhật Bản", R.drawable.canh_dau_hu_non_nhat_ban),
            new FoodItem("Canh bắp cải cuộn thịt", R.drawable.canh_bap_cai_cuon_thit),
            new FoodItem("Canh xương bò hầm sữa", R.drawable.canh_xuong_bo_ham_sua),
            new FoodItem("Canh chua khô cá hố lá giang", R.drawable.canh_chua_kho_ca_ho_la_giang)
            // Thêm các mục khác tương tự ở đây
    };

    FoodItem[] mon_chao_soup = {
            new FoodItem("Súp cua thập cẩm", R.drawable.sup_cua_thap_cam),
            new FoodItem("Súp củ dền", R.drawable.sup_cu_den),
            new FoodItem("Súp cua biển", R.drawable.sup_cua_bien),
            new FoodItem("Cháo yến mạch thịt bò cần tây", R.drawable.chao_yen_mach_thit_bo_can_tay)
            // Thêm các mục khác tương tự ở đây
    };

    FoodItem[] mon_do_uong = {
            new FoodItem("Sữa yến mạch", R.drawable.sua_yen_mach),
            new FoodItem("Nước lê mật ong trị ho", R.drawable.nuoc_le_mat_ong_tri_ho),
            new FoodItem("Trà chanh túi lọc", R.drawable.tra_chanh_tui_loc),
            new FoodItem("Siro chanh leo", R.drawable.siro_chanh_leo)
            // Thêm các mục khác tương tự ở đây
    };

    FoodItem[] mon_kem = {
            new FoodItem("Kem dưa hoàng kim", R.drawable.kem_dua_hoang_kim),
            new FoodItem("Kem chocolate nước cốt dừa", R.drawable.kem_chocolate_nuoc_cot_dua),
            new FoodItem("Kem que dâu tây sữa", R.drawable.kem_que_dau_tay_sua),
            new FoodItem("Kem bơ sữa", R.drawable.kem_bo_sua)
            // Thêm các mục khác tương tự ở đây
    };

    FoodItem[] mon_salad = {
            new FoodItem("Salad bò chiên giòn", R.drawable.salad_bo_chien_gion),
            new FoodItem("Salad rau trộn sốt mayonnaise", R.drawable.salad_rau_tron_sot_mayonnaise),
            new FoodItem("Salad tổng hợp", R.drawable.salad_tong_hop),
            new FoodItem("Salad Nga truyền thống", R.drawable.salad_nga_truyen_thong)
            // Thêm các mục khác tương tự ở đây
    };

    FoodItem[] mon_snacks = {
            new FoodItem("Củ sen chiên giòn", R.drawable.cu_sen_chien_gion),
            new FoodItem("Kẹo dẻo cam", R.drawable.keo_deo_cam),
            new FoodItem("Khoai lang bò lắc muối", R.drawable.khoai_lang_bo_lac_muoi),
            new FoodItem("Khoai môn chiên nước mắm", R.drawable.khoai_mon_chien_nuoc_mam)
            // Thêm các mục khác tương tự ở đây
    };

    FoodItem[] mon_thit_cha_nen = {
            new FoodItem("Lòng heo chua ngọt", R.drawable.long_heo_chua_ngot),
            new FoodItem("Cá hú nướng nghệ", R.drawable.ca_hu_nuong_nghe),
            new FoodItem("Bắp bò gói giấy bạc nướng", R.drawable.bap_bo_goi_giay_bac_nuong),
            new FoodItem("Phi lê cá nướng", R.drawable.phi_le_ca_nuong)
            // Thêm các mục khác tương tự ở đây
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
        //FoodDatabaseHelper dbHelper = new FoodDatabaseHelper(this);

        //dbHelper.addFoodToCategory("BANH_NGOT", String.valueOf(R.string.flan_chocolate), "banh_ngot_flan_chocolate", String.valueOf(R.string.flan_chocolate_ing), String.valueOf(R.string.flan_chocolate));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, HienListFoodTamThoi.class);

                if (position == 0) {
                    intent.putExtra("foodList", mon_banh_man);
                } else if (position == 1){
                    intent.putExtra("foodList", mon_banh_ngot);
                } else if (position == 2){
                    intent.putExtra("foodList", mon_bun_pho_mi);
                } else if (position == 3){
                    intent.putExtra("foodList", mon_canh);
                } else if (position == 4){
                    intent.putExtra("foodList", mon_chao_soup);
                } else if (position == 5){
                    intent.putExtra("foodList", mon_do_uong);
                } else if (position == 6){
                    intent.putExtra("foodList", mon_kem);
                } else if (position == 7){
                    intent.putExtra("foodList", mon_salad);
                } else if (position == 8){
                    intent.putExtra("foodList", mon_snacks);
                } else{
                    intent.putExtra("foodList", mon_thit_cha_nen);
                }

                startActivity(intent);

            }
        });
    }
}