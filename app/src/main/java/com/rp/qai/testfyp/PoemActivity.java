package com.rp.qai.testfyp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class PoemActivity extends AppCompatActivity {

    private ListView lvPoemId;
    private ArrayList<Poems> alPoemId;
    private ArrayAdapter<Poems> aaPoemId;
    private Poems poem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);

        lvPoemId = findViewById(R.id.lvPoemId);
        alPoemId = new ArrayList<Poems>();
        aaPoemId = new ArrayAdapter<Poems>(this, android.R.layout.simple_list_item_1, alPoemId);
        lvPoemId.setAdapter(aaPoemId);

        //call getMenuCategories web service so that we can display list of Categories
        HttpRequest request = new HttpRequest
                ("https://literarytouristsingapore.000webhostapp.com/getPoem.php");
        request.setOnHttpResponseListener(mHttpResponseListener);
        request.setMethod("POST");
        request.addData("title", poem.getTitle());
        request.addData("author", poem.getAuthor());
        request.addData("photo_name", poem.getImage());
        request.addData("date", poem.getDate());
        request.addData("description", poem.getDescription());
        request.execute();

    }
    private HttpRequest.OnHttpResponseListener mHttpResponseListener =
            new HttpRequest.OnHttpResponseListener() {
                @Override
                public void onResponse(String response){
                    // process response here
                    try {
                        Log.i("JSON Results", response);
                        JSONArray jsonArray = new JSONArray(response);
                        for (int i=0; i<jsonArray.length(); i++){
                            JSONObject jsonObj = jsonArray.getJSONObject(i);

                            String poemId = jsonObj.getString("#");
                            String title = jsonObj.getString("title");
                            String author = jsonObj.getString("author");
                            String image = jsonObj.getString("photo_name");
                            String date = jsonObj.getString("date");
                            String description = jsonObj.getString("description");



                            Poems poem = new Poems(poemId, title, author, image, date, description);
                            alPoemId.add(poem);
                        }
                        aaPoemId.notifyDataSetChanged();

                    } catch(Exception e){
                        e.printStackTrace();
                    }

                }
            };
}
