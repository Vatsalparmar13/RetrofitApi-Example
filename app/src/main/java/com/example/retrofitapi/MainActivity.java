package com.example.retrofitapi;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;

    RecyclerView postrcview;

    List<PostModel> postModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Status Bar Customization
        View decorView = getWindow().getDecorView();
        WindowInsetsControllerCompat windowInsetsController = ViewCompat.getWindowInsetsController(decorView);
        if (windowInsetsController != null) {
            windowInsetsController.setAppearanceLightStatusBars(false);
        }
        getWindow().setStatusBarColor(getResources().getColor(R.color.blue));

        apiInterface= RetrofitInstance.getRetrofit().create(ApiInterface.class);

        postrcview=findViewById(R.id.postRecyView);



        apiInterface.getposts().enqueue(new Callback<List<PostModel>>() {
            @Override
            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {
                if (response.body().size()>0){
                    postModelList=response.body();
                    PostAdapter postAdapter=new PostAdapter(MainActivity.this,postModelList);
                    postrcview.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                    postrcview.setAdapter(postAdapter);

                    Toast.makeText(MainActivity.this, "List is unempty", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "List is empty", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<PostModel>> call, Throwable throwable) {
                Toast.makeText(MainActivity.this, throwable.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}