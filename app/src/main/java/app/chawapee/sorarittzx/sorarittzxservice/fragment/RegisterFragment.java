package app.chawapee.sorarittzx.sorarittzxservice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.chawapee.sorarittzx.sorarittzxservice.R;


/**
 * Created by Sorarittzx on 28-10-2017.
 */

public class RegisterFragment extends Fragment{

    //alt + ins
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_new_register, container, false);

        return view;
    }
} // Main Class
