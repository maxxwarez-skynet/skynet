package in.co.maxxwarez.skynet.ui.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.co.maxxwarez.skynet.R;

public class SettingsList extends Fragment {

    public SettingsList () {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static SettingsList newInstance () {
        SettingsList fragment = new SettingsList();
        return fragment;
    }

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings_list, container, false);
    }
}