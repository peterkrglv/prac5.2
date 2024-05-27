package com.example.prac52;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.prac52.databinding.FragmentScrollViewBinding;

import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ScrollViewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ScrollViewFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ScrollViewFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentScrollViewBinding binding = FragmentScrollViewBinding.inflate(inflater, container, false);

        List<String> names = Arrays.asList(getResources().getStringArray(R.array.albums));
        binding.textView1.setText(names.get(0));
        binding.textView2.setText(names.get(1));
        binding.textView3.setText(names.get(2));
        binding.textView4.setText(names.get(3));
        binding.textView5.setText(names.get(4));
        binding.textView6.setText(names.get(5));
        binding.textView7.setText(names.get(6));
        binding.textView8.setText(names.get(7));


        EditText editText = binding.editText;
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    binding.scrollView.post(new Runnable() {
                        @Override
                        public void run() {
                            binding.scrollView.fullScroll(View.FOCUS_DOWN);
                        }
                    });
                }
            }
        });

        return binding.getRoot();
    }
}