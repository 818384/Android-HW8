package edu.hcmus.hw08;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class NewsApp extends AppCompatActivity {

    TextView txtThanhNien;
    TextView txtTienPhong;
    TextView txtVNEXPRESS;
    TextView txtVNN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_news_app);

        txtThanhNien = (TextView) this.findViewById(R.id.txtThanhNien);
        txtVNEXPRESS = (TextView) this.findViewById(R.id.txtVNEXPRESS);
        txtTienPhong = (TextView) this.findViewById(R.id.txtTienPhong);
        txtVNN = (TextView) this.findViewById(R.id.txtVNN);

        txtThanhNien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[][] myUrlCaptionMenu = {
                        {"https://thanhnien.vn/rss/home.rss", "TRANG CHỦ"},
                        {"https://thanhnien.vn/rss/thoi-su.rss", "THỜI SỰ"},
                        {"https://thanhnien.vn/rss/giao-duc.rss", "GÍAO DỤC"},
                        {"https://thanhnien.vn/rss/the-gioi.rss", "THẾ GIỚI"},
                        {"https://thethao.thanhnien.vn/rss/bong-da-viet-nam.rss", "THỂ THAO"},
                        {"https://thanhnien.vn/rss/van-hoa-nghe-thuat.rss", "VĂN HÓA"},
                        {"https://thanhnien.vn/rss/kinh-doanh.rss", "KINH DOANH"},
                        {"https://thanhnien.vn/rss/the-gioi-tre.rss", "GIỚI TRẺ"},
                        {"https://thanhnien.vn/rss/du-lich/kham-pha.rss", "DU LỊCH"},

                };
                Intent callShowMain = new Intent(NewsApp.this, MainActivity.class);
                Bundle myData = new Bundle();
                myData.putSerializable("list", myUrlCaptionMenu);
                myData.putString("channel", "CHANNELS IN THANH NIÊN");
                callShowMain.putExtras(myData);
                startActivity(callShowMain);
            }
        });

        txtVNEXPRESS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[][] myUrlCaptionMenu = {
                        {"https://vnexpress.net/rss/tin-moi-nhat.rss", "TRANG CHỦ"},
                        {"https://vnexpress.net/rss/thoi-su.rss", "THỜI SỰ"},
                        {"https://vnexpress.net/rss/giao-duc.rss", "GIÁO DỤC"},
                        {"https://vnexpress.net/rss/the-gioi.rss", "THẾ GIỚI"},
                        {"https://vnexpress.net/rss/the-thao.rss", "THỂ THAO"},
                        {"https://vnexpress.net/rss/khoa-hoc.rss", "KHOA HỌC"},
                        {"https://vnexpress.net/rss/kinh-doanh.rss", "KINH DOANH"},
                        {"https://vnexpress.net/rss/du-lich.rss", "DU LỊCH"},
                        {"https://vnexpress.net/rss/suc-khoe.rss", "SỨC KHỎE"},

                };
                Intent callShowMain = new Intent(NewsApp.this, MainActivity.class);
                Bundle myData = new Bundle();
                myData.putSerializable("list", myUrlCaptionMenu);
                myData.putString("channel", "CHANELS IN VNEXPRESS");
                callShowMain.putExtras(myData);
                startActivity(callShowMain);
            }
        });

        txtTienPhong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[][] myUrlCaptionMenu = {
                        {"https://www.tienphong.vn/rss/infographics-287.rss", "TRANG CHỦ"},
                        {"https://www.tienphong.vn/rss/xa-hoi-2.rss", "XÃ HỘI"},
                        {"https://www.tienphong.vn/rss/giao-duc-71.rss", "GIÁO DỤC"},
                        {"https://www.tienphong.vn/rss/the-thao-11.rss", "THỂ THAO"},
                        {"https://www.tienphong.vn/rss/van-hoa-7.rss", "VĂN HÓA"},
                        {"https://www.tienphong.vn/rss/cong-nghe-45.rss", "KHOA HỌC"},
                        {"https://www.tienphong.vn/rss/giai-tri-36.rss", "GIẢI TRÍ"},
                        {"https://www.tienphong.vn/rss/the-gioi-5.rss", "THẾ GIỚI"},
                        {"https://www.tienphong.vn/rss/kinh-te-3.rss", "KINH TẾ"},
                        {"https://www.tienphong.vn/rss/xe-113.rss", "XE"},

                };
                Intent callShowMain = new Intent(NewsApp.this, MainActivity.class);
                Bundle myData = new Bundle();
                myData.putSerializable("list", myUrlCaptionMenu);
                myData.putString("channel", "CHANELS IN TIỀN PHONG");
                callShowMain.putExtras(myData);
                startActivity(callShowMain);
            }
        });

        txtVNN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[][] myUrlCaptionMenu = {
                        {"https://vietnamnet.vn/rss/thoi-su.rss", "THỜI SỰ"},
                        {"https://vietnamnet.vn/rss/the-gioi.rss", "THẾ GIỚI"},
                        {"https://vietnamnet.vn/rss/giao-duc.rss", "GIÁO DỤC"},
                        {"https://vietnamnet.vn/rss/doi-song.rss", "ĐỜI SỐNG"},
                        {"https://vietnamnet.vn/rss/bat-dong-san.rss", "BẤT ĐỘNG SẢN"},
                        {"https://vietnamnet.vn/rss/oto-xe-may.rss", "XE"},
                        {"https://vietnamnet.vn/rss/giai-tri.rss", "GIẢI TRÍ"},
                        {"https://vietnamnet.vn/rss/goc-nhin-thang.rss", "GÓC NHÌN THẲNG"},
                        {"https://vietnamnet.vn/rss/tuanvietnam.rss", "TUẦN VIỆT NAM"},
                };
                Intent callShowMain = new Intent(NewsApp.this, MainActivity.class);
                Bundle myData = new Bundle();
                myData.putSerializable("list", myUrlCaptionMenu);
                myData.putString("channel", "CHANELS IN VIETNAMNET");
                callShowMain.putExtras(myData);
                startActivity(callShowMain);
            }
        });
    }
}
