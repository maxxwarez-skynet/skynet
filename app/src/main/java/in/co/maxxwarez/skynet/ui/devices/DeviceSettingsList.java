package in.co.maxxwarez.skynet.ui.devices;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.co.maxxwarez.skynet.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DeviceSettingsList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DeviceSettingsList extends Fragment {

    public DeviceSettingsList () {
        // Required empty public constructor
    }

    public static DeviceSettingsList newInstance () {
        DeviceSettingsList fragment = new DeviceSettingsList();
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
        View v = inflater.inflate(R.layout.fragment_device_settings_list, container, false);
        return v;
    }
}