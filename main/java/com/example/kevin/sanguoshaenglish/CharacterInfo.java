package com.example.kevin.sanguoshaenglish;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.w3c.dom.Text;

public class CharacterInfo extends AppCompatActivity {
    Context mContext;
    static Bitmap BitMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_info);
        mContext = getApplicationContext();

        Intent myIntent = getIntent();
        int characterPos = myIntent.getIntExtra("charPos", 0);
        int mode = myIntent.getIntExtra("mode",0);
        String thisChar = charText(characterPos,mode);

        final TextView charText = (TextView) findViewById(R.id.charText);
        charText.setText(thisChar);
        final ImageView charImg = (ImageView) findViewById(R.id.charImg);
        charImg.setImageBitmap(BitMap);

    }

    public String charText(int index,int mode){
        if(mode == 0) {
            switch (index) {
                case 0:
                    BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_liubei);
                    return TextFile("rshu_luibei.txt",0);
                case 1:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_elderzhugeliange);
                    return TextFile("rshu_elderzhugeliange.txt",0);
                case 2:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_zhaoyun);
                    return TextFile("rshu_zhaoyun.txt",0);
                case 3:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_guanyu);
                    return TextFile("rshu_guanyu.txt",0);
                case 4:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_huangyueying);
                    return TextFile("rshu_huangyueying.txt",0);
                case 5:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_machao);
                    return TextFile("rshu_machao.txt",0);
                case 6:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_zhangfei);
                    return TextFile("rshu_zhangfei.txt",0);
                case 7:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_youngerzhugeliang);
                    return TextFile("rshu_youngerzhugeliang.txt",0);
                case 8:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_pangtong);
                    return TextFile("rshu_pangtong.txt",0);
                case 9:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_huangzhong);
                    return TextFile("rshu_huangzhong.txt",0);
                case 10:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_weiyan);
                    return TextFile("rshu_weiyan.txt",0);
                case 11:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_menghuo);
                    return TextFile("rshu_menghuo.txt",0);
                case 12:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_zhurong);
                    return TextFile("rshu_zhurong.txt",0);
                case 13:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_fazheng);
                    return TextFile("rshu_fazheng.txt",0);
                case 14:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_masu);
                    return TextFile("rshu_masu.txt",0);
                case 15:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_xushu);
                    return TextFile("rshu_xushu.txt",0);
                case 16:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_liushan);
                    return TextFile("rshu_liushan.txt",0);
                case 17:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_jiangwei);
                    return TextFile("rshu_jiangwei.txt",0);
                case 18:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_sunshangxiang);
                    return TextFile("rshu_sunshangxiang.txt",0);
                case 19:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_madai);
                    return TextFile("rshu_madai.txt",0);
                case 20:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_liaohua);
                    return TextFile("rshu_liaohua.txt",0);
                case 21:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_guanxingzhangbao);
                    return TextFile("rshu_guanxingzhangbao.txt",0);
                case 22:
                    return TextFile("rshu_weiyan.txt",0);
                case 23:
                    return TextFile("rshu_weiyan.txt",0);
                case 24:
                    return TextFile("rshu_weiyan.txt",0);
                case 25:
                    return TextFile("rshu_weiyan.txt",0);
                case 26:
                    return TextFile("rshu_weiyan.txt",0);
                case 27:
                    return TextFile("rshu_weiyan.txt",0);
                case 28:
                    return TextFile("rshu_weiyan.txt",0);
                case 29:
                    return TextFile("rshu_weiyan.txt",0);
                case 30:
                    return TextFile("rshu_weiyan.txt",0);
                case 31:
                    return TextFile("rshu_weiyan.txt",0);
                case 32:
                    return TextFile("rshu_weiyan.txt",0);
                case 33:
                    return TextFile("rshu_weiyan.txt",0);
                case 34:
                    return TextFile("rshu_weiyan.txt",0);
                case 35:
                    return TextFile("rshu_weiyan.txt",0);
                case 36:
                    return TextFile("rshu_weiyan.txt",0);
                case 37:
                    return TextFile("rshu_weiyan.txt",0);
                case 38:
                    return TextFile("rshu_weiyan.txt",0);
                case 39:
                    return TextFile("rshu_weiyan.txt",0);
                case 40:
                    return TextFile("rshu_weiyan.txt",0);
                case 41:
                    return TextFile("rshu_weiyan.txt",0);
                case 42:
                    return TextFile("rshu_weiyan.txt",0);
                case 43:
                    return TextFile("rshu_weiyan.txt",0);
                case 44:
                    return TextFile("rshu_weiyan.txt",0);
                case 45:
                    return TextFile("rshu_weiyan.txt",0);
                case 46:
                    return TextFile("rshu_weiyan.txt",0);
            }
            return "Error Character NOT FOUND";
        }
        else if (mode == 1){
            switch (index) {
                case 0:
                    BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_liubei);
                    return TextFile("rshu_luibei.txt",0);
                case 1:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_elderzhugeliange);
                    return TextFile("rshu_elderzhugeliange.txt",0);
                case 2:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_zhaoyun);
                    return TextFile("rshu_zhaoyun.txt",0);
                case 3:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_guanyu);
                    return TextFile("rshu_guanyu.txt",0);
                case 4:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_huangyueying);
                    return TextFile("rshu_huangyueying.txt",0);
                case 5:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_machao);
                    return TextFile("rshu_machao.txt",0);
                case 6:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_zhangfei);
                    return TextFile("rshu_zhangfei.txt",0);
                case 7:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_youngerzhugeliang);
                    return TextFile("rshu_youngerzhugeliang.txt",0);
                case 8:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_pangtong);
                    return TextFile("rshu_pangtong.txt",0);
                case 9:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_huangzhong);
                    return TextFile("rshu_huangzhong.txt",0);
                case 10:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_weiyan);
                    return TextFile("rshu_weiyan.txt",0);
                case 11:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_menghuo);
                    return TextFile("rshu_menghuo.txt",0);
                case 12:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_zhurong);
                    return TextFile("rshu_zhurong.txt",0);
                case 13:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_fazheng);
                    return TextFile("rshu_fazheng.txt",0);
                case 14:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_masu);
                    return TextFile("rshu_masu.txt",0);
                case 15:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_xushu);
                    return TextFile("rshu_xushu.txt",0);
                case 16:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_liushan);
                    return TextFile("rshu_liushan.txt",0);
                case 17:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_jiangwei);
                    return TextFile("rshu_jiangwei.txt",0);
                case 18:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_sunshangxiang);
                    return TextFile("rshu_sunshangxiang.txt",0);
                case 19:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_madai);
                    return TextFile("rshu_madai.txt",0);
                case 20:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_liaohua);
                    return TextFile("rshu_liaohua.txt",0);
                case 21:BitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rshu_guanxingzhangbao);
                    return TextFile("rshu_guanxingzhangbao.txt",0);
            }
            return "Error Character NOT FOUND";

        }
        else
            return "ERROR NOT VALID OPTION";
    }

    public String TextFile(String fileName, int mode){
        String modeText="";
        if (mode ==0){
            modeText = "reg/";
        }
        else if(mode==1){
            modeText = "kingdom/";
        }

        StringBuilder text = new StringBuilder();
        try {
            InputStream is = mContext.getAssets().open(modeText+fileName);

            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line);
                text.append('\n');
            }
            br.close() ;
        }catch (IOException e) {
            e.printStackTrace();
        }
        return text.toString();
    }
}
