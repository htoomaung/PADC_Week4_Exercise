package com.hmt.padc_week4_exercise.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hmt.padc_week4_exercise.R;

/**
 * Created by Dell on 02-Jul-16.
 */
public class PADC_LinkedIn extends Fragment {

    View view_padc_linkedin;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view_padc_linkedin = inflater.inflate(R.layout.padc_linkedin, container, false);


        return view_padc_linkedin;
    }
}
