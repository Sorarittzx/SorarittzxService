package app.chawapee.sorarittzx.sorarittzxservice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.chawapee.sorarittzx.sorarittzxservice.MainActivity;
import app.chawapee.sorarittzx.sorarittzxservice.R;


/**
 * Created by Sorarittzx on 28-10-2017.
 */

public class RegisterFragment extends Fragment{


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

       //Create toolbar
        createToolbar();

    }//Main Medthod

    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.toolbarRegister);

        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
        ((MainActivity)getActivity()).setTitle(getResources().getString(R.string.new_register));
        ((MainActivity)getActivity()).getSupportActionBar().setHomeButtonEnabled(true);// enable มองเห็นปุ้ม
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true); // event click


        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getActivity().getSupportFragmentManager().popBackStack();

            }
        });
    }

    //alt + ins
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_new_register, container, false);

        return view;
    }
} // Main Class
