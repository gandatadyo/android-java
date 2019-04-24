package com.example.gandatadyosurya.aplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Ganda Tadyo Surya on 13/04/2017.
 */

public class ImageAdapterGridView extends BaseAdapter {
    private Context mContext;
    int imageTotal = 7;
    public static String[] mThumbIds = {
            "http://www.halalmui.org/mui14/images/content/dove.jpg",
            "http://s28.postimg.org/n4d39rdbh/lifeboy_340_an_dandrf_copy.jpg",
            "http://cdn.elevenia.co.id/g/4/6/3/9/8/0/5463980_B_V79.jpg",
            "http://1.bp.blogspot.com/-JBQ5v9bDlSQ/VIa2nGIzL2I/AAAAAAAAAWw/uOaeELpOSHA/s1600/Produk%2BPonds.jpg",
            "http://antiketombe.clear.co.id/resources/images/image_bank/ib_shampo-anti-ketombe-terbaik-di-dunia_15042015123801.jpg",
            "https://sc02.alicdn.com/kf/HTB1njdEKpXXXXclXFXXq6xXFXXXb/Dove-Shampoo.jpg",
            "https://images.detik.com/content/2015/02/17/234/194647_sunsilklivelystraight.jpg?w=500&q=90",
    };

    public ImageAdapterGridView(Context c) {
        mContext = c;
    }

    public int getCount() {
        return imageTotal;
    }

    @Override
    public String getItem(int position) {
        return mThumbIds[position];
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(480, 480));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }
        String url = getItem(position);
        Picasso.get().load(url).into(imageView);
        return imageView;
    }
}
