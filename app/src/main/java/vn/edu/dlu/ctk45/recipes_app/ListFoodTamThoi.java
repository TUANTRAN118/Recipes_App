package vn.edu.dlu.ctk45.recipes_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListFoodTamThoi extends ArrayAdapter<FoodItem> {
    public ListFoodTamThoi(Context context, ArrayList<FoodItem> foodItems) {
        super(context, 0, foodItems);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.ds_mon_cho_danh_muc, parent, false);
        }

        FoodItem currentItem = getItem(position);

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textView = convertView.findViewById(R.id.textView);

        if (currentItem != null) {
            imageView.setImageResource(currentItem.getImageId());
            textView.setText(currentItem.getName());
        }

        return convertView;
    }

}
