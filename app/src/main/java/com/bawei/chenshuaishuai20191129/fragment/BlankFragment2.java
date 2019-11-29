package com.bawei.chenshuaishuai20191129.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bawei.chenshuaishuai20191129.MainActivity;
import com.bawei.chenshuaishuai20191129.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment {

    private Button btnn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivity= (MainActivity) getActivity();
                mainActivity.jump();
            }
        });



    }

    private void init() {
        btnn = (Button)getActivity(). findViewById(R.id.btnn);
    }
}
