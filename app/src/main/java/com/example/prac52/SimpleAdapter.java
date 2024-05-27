package com.example.prac52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class SimpleAdapter extends
        RecyclerView.Adapter<SimpleAdapter.ViewHolder> {
    private List<AlbumModel> items;
    public SimpleAdapter(List<AlbumModel> items) {
        this.items = items;
    }
    @NonNull
    @Override
    public SimpleAdapter.ViewHolder onCreateViewHolder(@NonNull
                                                       ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate
                (R.layout.album, parent, false);

        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull SimpleAdapter.ViewHolder
                                         holder, int position) {
        String item = items.get(position).name;
        holder.textView.setText(item);
        holder.imageView.setImageResource(items.get(position).cover);
    }
    @Override
    public int getItemCount() {
        return items.size();
    }
    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        ViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.textView);
            imageView = view.findViewById(R.id.imageView);
        }
    }
}