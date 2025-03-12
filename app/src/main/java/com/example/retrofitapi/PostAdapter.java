package com.example.retrofitapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.CustomViewHolder> {

    private Context context;
    private List<PostModel> postModelList;

    public PostAdapter(Context context, List<PostModel> postModelList) {
        this.context = context;
        this.postModelList = postModelList;
    }

    @NonNull
    @Override
    public PostAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_postdetails,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.CustomViewHolder holder, int position) {
        holder.txtuid.setText(String.valueOf((int) postModelList.get(position).getUserId()));
        holder.txtTitle.setText(postModelList.get(position).getTitle());
        holder.txtBody.setText(postModelList.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return postModelList.size();
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder{

        TextView txtTitle,txtBody,txtuid;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            txtuid=itemView.findViewById(R.id.txtUserId);
            txtTitle=itemView.findViewById(R.id.txtTitle);
            txtBody=itemView.findViewById(R.id.txtBody);

        }
    }
}
