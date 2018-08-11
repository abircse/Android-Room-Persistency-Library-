package com.studioabir.androidroomdatabase.androidroomdatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {


    private Button BnAddUser;
    private Button BnReadUser;
    private Button BnDeleteUser;
    private Button BnUpdateUser;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        BnAddUser = view.findViewById(R.id.adduser);
        BnReadUser = view.findViewById(R.id.viewuser);
        BnDeleteUser = view.findViewById(R.id.deleteuser);
        BnUpdateUser = view.findViewById(R.id.updateuser);

        BnAddUser.setOnClickListener(this);
        BnReadUser.setOnClickListener(this);
        BnDeleteUser.setOnClickListener(this);
        BnUpdateUser.setOnClickListener(this);


        return view;
    }


    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.adduser:
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new AddUserFragment()).addToBackStack(null).commit();
            break;

            case R.id.viewuser:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ReadUserFragment()).addToBackStack(null).commit();
                break;

            case R.id.deleteuser:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new DeleteUserFragment()).addToBackStack(null).commit();
                break;

            case R.id.updateuser:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new UpdateUserFragment()).addToBackStack(null).commit();
                break;

        }

    }
}
