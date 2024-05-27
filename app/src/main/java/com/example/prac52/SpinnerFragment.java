package com.example.prac52;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.prac52.databinding.FragmentSpinnerBinding;

public class SpinnerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentSpinnerBinding binding = FragmentSpinnerBinding.inflate(inflater, container, false);

        String[] albums = getResources().getStringArray(R.array.albums);
        ArrayAdapter<String> adapter = new ArrayAdapter(container.getContext(), android.R.layout.simple_spinner_item, albums);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinner.setAdapter(adapter);
        return binding.getRoot();
    }
}