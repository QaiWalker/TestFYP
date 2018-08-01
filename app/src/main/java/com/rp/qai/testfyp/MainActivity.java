package com.rp.qai.testfyp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    TextView tvTitle, tvAuthor, tvDate, tvDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = getIntent();
        PoemId poemId = (PoemId)i.getSerializableExtra("PoemId");

        iv = findViewById(R.id.iv);
        tvTitle = findViewById(R.id.tvTitle);
        tvAuthor = findViewById(R.id.tvAuthor);
        tvDate = findViewById(R.id.tvDate);
        tvDesc = findViewById(R.id.tvDesc);

//        //call getMenuCategories web service so that we can display list of Categories
//        HttpRequest request = new HttpRequest
//                ("http://10.0.2.2/C302_P09_mCafe/getMenuByItemId.php?categoryId=" + menuCategory.getCategoryId());
//        request.setOnHttpResponseListener(mHttpResponseListener);
//        request.setMethod("POST");
//        request.addData("loginId", loginId);
//        request.addData("apikey", apikey);
//        request.addData("categoryId", menuCategory.getCategoryId());
//        request.execute();

    }
}
