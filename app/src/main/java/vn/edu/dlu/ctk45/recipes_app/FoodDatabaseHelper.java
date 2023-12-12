package vn.edu.dlu.ctk45.recipes_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class FoodDatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "food_database";
    private static final int DATABASE_VERSION = 1;

    public FoodDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Tạo bảng cho mỗi nhóm thức ăn
        createTableBanhNgot(db); // Ví dụ: Tạo bảng cho nhóm Bánh Ngọt
        // Tạo các bảng cho các nhóm thức ăn khác tương tự như trên
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Thực hiện các thay đổi khi cần nâng cấp cơ sở dữ liệu
    }

    private void createTableBanhNgot(SQLiteDatabase db) {
        String createTableQuery = "CREATE TABLE IF NOT EXISTS BanhNgot (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT, " +
                "image TEXT, " +
                "ingredients TEXT, " +
                "recipe TEXT)";

        db.execSQL(createTableQuery);
    }

    // Tạo các phương thức để thêm món ăn mới vào từng nhóm thức ăn (Bánh Mặn, Bún-Phở-Mì, v.v.)
    public void addFoodToCategory(String category, String foodName, String image, String ingredients, String recipe) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", foodName);
        values.put("image", image);
        values.put("ingredients", ingredients);
        values.put("recipe", recipe);
        db.insert(category, null, values);
        db.close();
    }


    // Tạo các phương thức tương tự cho từng nhóm thức ăn khác
}

