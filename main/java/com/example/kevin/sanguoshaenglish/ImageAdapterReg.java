package com.example.kevin.sanguoshaenglish;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapterReg extends BaseAdapter {
    private Context mContext;

    public ImageAdapterReg(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(185,185));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(18, 18, 18, 18);
        } else {
            imageView = (ImageView) convertView;
            imageView.setLayoutParams(new GridView.LayoutParams(185, 185));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(18, 18, 18, 18);
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.rshu_liubei,R.drawable.rshu_elderzhugeliange,R.drawable.rshu_zhaoyun,R.drawable.rshu_guanyu,
            R.drawable.rshu_huangyueying, R.drawable.rshu_machao,R.drawable.rshu_zhangfei,R.drawable.rshu_youngerzhugeliang,
            R.drawable.rshu_pangtong,R.drawable.rshu_huangzhong,R.drawable.rshu_weiyan,R.drawable.rshu_menghuo,
            R.drawable.rshu_zhurong,R.drawable.rshu_fazheng,R.drawable.rshu_masu,R.drawable.rshu_xushu,R.drawable.rshu_liushan,
            R.drawable.rshu_jiangwei,R.drawable.rshu_sunshangxiang,R.drawable.rshu_madai,R.drawable.rshu_liaohua,R.drawable.rshu_guanxingzhangbao
    };
}