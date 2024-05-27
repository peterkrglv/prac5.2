package com.example.prac52;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RecyclerViewFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        com.example.prac52.databinding.FragmentRecyclerViewBinding binding = com.example.prac52.databinding.FragmentRecyclerViewBinding.inflate(inflater, container, false);

        List<AlbumModel> albums = new ArrayList<AlbumModel>();
        List<String> names = Arrays.asList(getResources().getStringArray(R.array.albums));
        for (int i = 0; i < names.size(); i++) {
            AlbumModel album = new AlbumModel();
            album.name = names.get(i);
            album.cover = getResources().getIdentifier(names.get(i).toLowerCase().replace(" ", "_"), "drawable", requireActivity().getPackageName());
            //album.cover = getResources().getIdentifier("showbiz", "drawable", requireActivity().getPackageName());
            albums.add(album);
        }
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.recyclerView.setAdapter(new SimpleAdapter(albums));
        return binding.getRoot();
    }
}