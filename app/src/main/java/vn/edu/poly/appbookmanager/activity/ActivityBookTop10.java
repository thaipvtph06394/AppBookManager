package vn.edu.poly.appbookmanager.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Spinner;

import vn.edu.poly.appbookmanager.R;
import vn.edu.poly.appbookmanager.adapter.AdapterBookTop10;
import vn.edu.poly.appbookmanager.model.SelectTop10Book;
import vn.edu.poly.appbookmanager.sqlite.DatabaseHelper;
import vn.edu.poly.appbookmanager.sqlitedao.BookDAO;

import java.util.List;

public class ActivityBookTop10 extends AppCompatActivity {
    Toolbar toolbarSachBanChay;
    RecyclerView recyclerView;
    private List<SelectTop10Book> bookList;
    private AdapterBookTop10 adapter;
    private DatabaseHelper databaseHelper;
    private BookDAO bookDAO;

    Spinner spinnerThang;
    String thang[] = new String[]{"Tháng 1","Tháng 2","Tháng 3","Tháng 4","Tháng 5","Tháng 6","Tháng 7",
            "Tháng 8","Tháng 9","Tháng 10","Tháng 11","Tháng 12"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_top10);
        databaseHelper = new DatabaseHelper(this);
        bookDAO = new BookDAO(databaseHelper);
        toolbarSachBanChay = findViewById(R.id.toolbarSachBanChay);
        setSupportActionBar(toolbarSachBanChay);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbarSachBanChay.setTitleTextColor(Color.WHITE);
        toolbarSachBanChay.setTitle("Top 10 Sách Bán Chạy");
      /*  spinnerThang = findViewById(R.id.spThang);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, thang);
        spinnerThang.setAdapter(adapter1);*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recyclerView = findViewById(R.id.RecyclerView_SachBanChay);
        bookList = bookDAO.getTop10Books();
        adapter = new AdapterBookTop10(bookList);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
    }

}
