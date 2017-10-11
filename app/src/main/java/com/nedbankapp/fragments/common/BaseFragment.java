package com.nedbankapp.fragments.common;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.nedbankapp.activities.MainActivity;


/**
 * BaseFragment is base for all fragments which introduced some common instances of applications
 *
 * @author Kundan
 * @version 1.0
 * @created on 10-11-2017
 *
 */

public class BaseFragment extends Fragment {

    public MainActivity mActivity;
    public Context mContext;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext = context;
        this.mActivity = (MainActivity) getActivity();
    }
}
