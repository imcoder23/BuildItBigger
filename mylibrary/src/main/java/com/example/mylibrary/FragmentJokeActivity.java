package com.example.mylibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentJokeActivity extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

    View v = inflater.inflate(R.layout.fragment_jokes,container,false);
        String result = getActivity().getIntent().getStringExtra("Cloud");
        TextView result_show = v.findViewById(R.id.textView_jokes);
        result_show.setText(result);

        return v;
    }
}
