package com.example.gandatadyosurya.aplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ganda Tadyo Surya on 29/04/2017.
 */

public class GridViewCusAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater inflater;
    private Integer[] mThumbIds = {
            R.drawable.ic_menu_slideshow, R.drawable.ic_menu_share,
            R.drawable.ic_menu_gallery, R.drawable.ic_menu_camera,
            R.drawable.ic_menu_slideshow, R.drawable.ic_menu_share,
            R.drawable.ic_menu_gallery,
            R.drawable.ic_menu_slideshow, R.drawable.ic_menu_share,
            R.drawable.ic_menu_gallery, R.drawable.ic_menu_camera,
            R.drawable.ic_menu_slideshow, R.drawable.ic_menu_share,
            R.drawable.ic_menu_gallery
    };
    private String mTexts[]={"a","b","d","e","f","g","h i","a","b","d","e","f","g","h i"};



    public GridViewCusAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length; // adapter inflates the row according to the count of data given
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return mThumbIds.length;// inflates rows according to data given
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {


        NewHolder holder = null;
        ImageView imageView;

        if(convertView==null){//if convert view is null then only inflate the row
            inflater = (LayoutInflater) mContext.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            convertView = inflater.inflate(R.layout.activity_griditem,viewGroup,false);

            holder = new NewHolder();

            //find views in item row
            holder.imageView = (ImageView)convertView.findViewById(R.id.movieimage);
            holder.textView = (TextView) convertView.findViewById(R.id.textimagegrid);

            convertView.setTag(holder);
        }
        else { //otherwise get holder from tag
            holder = (NewHolder) convertView.getTag();
        }

        //set data here
        holder.imageView.setImageResource(mThumbIds[position]);
        holder.textView.setText(mTexts[position]);

        return convertView;
    }

    public class NewHolder {
        public ImageView imageView;
        public TextView textView;
    }
}