package com.example.administrator.androidstudio2;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RightFragment extends Fragment {

    private TextView tvRightFg;

    public RightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_right, container, false);
        tvRightFg = (TextView) view.findViewById(R.id.tv_right_fg);
        return view;
    }

    public void updateTextView(String str){

        tvRightFg.setText(str);
        int b;
        b  = 1;
        b = 2;
    }
}
