package com.activity.myapplication.model;

import com.activity.myapplication.R;

import java.util.ArrayList;

public class ListDetails6 {
    public static ArrayList<Model> getList(){
        ArrayList<Model> list = new ArrayList<>() ;




        list.add(new Model(R.mipmap.lien, " Giao hữu bóng đá với ĐH Bách Khoa Hà Nội", " Ngày 5-6 chúng ta có trận giao hữu bóng đá với đội bóng của ĐH Bách Khoa Hà Nội tại sân bóng trường ĐH Bách Khoa. "));
        list.add(new Model(R.mipmap.ccc, " Ngoại Khóa ", " Ngày 15-6 chúng ta có buổi dã ngoại tại Ba Vì-Sơn Tây-Hà Nội. "));
        list.add(new Model(R.mipmap.futsal, " Giao lưu bóng đá futsal với trẻ Thái Sơn Bắc", " Ngày 17-6 chúng ta có buổi giao bóng đá futsal tập luyện cùng đội trẻ Thái Sơn Bắc. "));
        list.add(new Model(R.mipmap.ho, " Quyên Góp", " Ngày 23-6 chúng ta có buổi quyên góp từ thiện giúp đỡ đồng bào vùng sâu, vùng xa. "));
        list.add(new Model(R.mipmap.n, " Tổng kết tháng 6", " Ngày 30-6 chúng ta có buổi giao liên hoan tổng kết tháng 6 tại  quán nước mía tại KTX Mỹ Đình. "));

        return list ;
    }
}