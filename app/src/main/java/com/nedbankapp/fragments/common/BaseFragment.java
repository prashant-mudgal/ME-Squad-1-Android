package com.nedbankapp.fragments.common;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.base_module.Activity.BaseActivity;
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

    public BaseActivity mActivity;
    public Context mContext;

    public BaseFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mActivity = (BaseActivity) getActivity();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext = context;
    }
}
