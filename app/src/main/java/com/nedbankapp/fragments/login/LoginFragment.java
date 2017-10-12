package com.nedbankapp.fragments.login;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.base_module.Activity.BaseActivity;
import com.nedbankapp.R;
import com.nedbankapp.fragments.common.BaseFragment;
import com.nedbankapp.fragments.dashboard.DashboardFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginFragment extends BaseFragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    @BindView(R.id.ed_profile)
    EditText edProfile;

    @BindView(R.id.ed_pin)
    EditText edPin;

    @BindView(R.id.ed_password)
    EditText edPassword;

    @BindView(R.id.btn_continue)
    Button btnContinue;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.btn_continue)
    public void onContinueClicked() {
        if (validateFields()) {
            mActivity.pushFragmentDontIgnoreCurrent(new DashboardFragment(), BaseActivity.FRAGMENT_JUST_REPLACE);
        }
    }

    private boolean validateFields() {
        if (TextUtils.isEmpty(edProfile.getText().toString())) {
            Toast.makeText(mActivity, getResources().getString(R.string.enter_profile), Toast.LENGTH_SHORT).show();
            return false;
        } else if (TextUtils.isEmpty(edPin.getText().toString())) {
            Toast.makeText(mActivity, getResources().getString(R.string.enter_pin), Toast.LENGTH_SHORT).show();
            return false;
        } else if (TextUtils.isEmpty(edPassword.getText().toString())) {
            Toast.makeText(mActivity, getResources().getString(R.string.enter_password), Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }

}
