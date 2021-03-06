/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rockon999.android.tv.settings.connectivity;

import com.rockon999.android.tv.settings.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Displays a UI for showing that the user must enter a PIN for WPS to continue
 */
public class WpsPinFragment extends Fragment {

    private static final String KEY_PIN = "pin";

    public static WpsPinFragment newInstance(String pin) {
        WpsPinFragment fragment = new WpsPinFragment();
        Bundle args = new Bundle();
        args.putString(KEY_PIN, pin);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle icicle) {
        View view = inflater.inflate(R.layout.wps_fragment, null);
        TextView titleView = (TextView) view.findViewById(R.id.title);
        titleView.setText(getActivity().getString(R.string.wifi_wps_onstart_pin,
                getArguments().getString(KEY_PIN)));
        TextView descriptionView = (TextView) view.findViewById(R.id.description);
        descriptionView.setText(getActivity().getString(R.string.wifi_wps_onstart_pin_description));
        return view;
    }
}
