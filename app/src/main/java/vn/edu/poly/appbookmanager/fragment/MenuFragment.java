package vn.edu.poly.appbookmanager.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import vn.edu.poly.appbookmanager.R;
import vn.edu.poly.appbookmanager.activity.ActivityBill;
import vn.edu.poly.appbookmanager.activity.ActivityBook;
import vn.edu.poly.appbookmanager.activity.ActivityBookTop10;
import vn.edu.poly.appbookmanager.activity.ActivityStyleBook;
import vn.edu.poly.appbookmanager.activity.ActivityUser;
import vn.edu.poly.appbookmanager.activity.ActivtiyStatistics;


public class MenuFragment extends Fragment {
    private ImageView imgNguoidung;
    private ImageView imgTheloai;
    private ImageView imgSach;
    private ImageView imgHoadon;
    private ImageView imgSachBanChay;
    private ImageView imgThongke;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu,container,false);
        imgNguoidung = view.findViewById(R.id.imgNguoidung);
        imgTheloai =  view.findViewById(R.id.imgTheloai);
        imgSach =  view.findViewById(R.id.imgSach);
        imgHoadon =  view.findViewById(R.id.imgHoadon);
        imgSachBanChay =  view.findViewById(R.id.imgSachBanChay);
        imgThongke =  view.findViewById(R.id.imgThongke);

        imgNguoidung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ActivityUser.class));
            }
        });
        imgTheloai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ActivityStyleBook.class));
            }
        });
        imgSach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ActivityBook.class));
            }
        });
        imgHoadon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ActivityBill.class));
            }
        });
        imgSachBanChay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ActivityBookTop10.class));
            }
        });
        imgThongke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ActivtiyStatistics.class));
            }
        });
        return view;
    }

}
