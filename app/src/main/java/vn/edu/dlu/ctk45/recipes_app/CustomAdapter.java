package vn.edu.dlu.ctk45.recipes_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private Context mContext;
    private int[] mImages;
    private String[] mFoodCategories;

    public CustomAdapter(Context context, int[] images, String[] foodCategories) {
        mContext = context;
        mImages = images;
        mFoodCategories = foodCategories;
    }

    @Override
    public int getCount() {
        return mImages.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridView;
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            gridView = new View(mContext);
            gridView = inflater.inflate(R.layout.ds_mon, null);

            ImageView imageView = gridView.findViewById(R.id.imageView);
            TextView textView = gridView.findViewById(R.id.textView);

            imageView.setImageResource(mImages[position]);
            textView.setText(mFoodCategories[position]);
        } else {
            gridView = convertView;
        }

        return gridView;
    }
}
