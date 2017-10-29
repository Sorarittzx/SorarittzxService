package app.chawapee.sorarittzx.sorarittzxservice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import app.chawapee.sorarittzx.sorarittzxservice.R;

/**
 * Created by Sorarittzx on 28-10-2017.
 */

public class MainFragment extends Fragment {

//    Create Main Method
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //Register Controller
        registerController();


    } //Main Medthod

    private void registerController() {
        //เอาค่า ในview xml มาใส่ ค่า  textview
        TextView textView = getView().findViewById(R.id.txtNewRegister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Move to RegisterFragment
                getActivity().getSupportFragmentManager().beginTransaction()
                             .replace(R.id.contentFragmentMain, new RegisterFragment())
                             .addToBackStack(null).commit();

            }
        });

    }

    //Creat View group  //alt + ins
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // xml มาทำ งาน บน java  ต้องใช้ inflate
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        return view;
    }
}   // Main Class
