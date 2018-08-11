package com.studioabir.androidroomdatabase.androidroomdatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class AddUserFragment extends Fragment {


    private EditText Userid, UserName, UserEmail;
    private Button BnSave;

    public AddUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_user, container, false);


        Userid = view.findViewById(R.id.editText1);
        UserName = view.findViewById(R.id.editText2);
        UserEmail = view.findViewById(R.id.editText3);
        BnSave = view.findViewById(R.id.button);

        BnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int userid = Integer.parseInt(Userid.getText().toString());
                String username = UserName.getText().toString();
                String useremail = UserEmail.getText().toString();

                User user = new User();
                user.setId(userid);
                user.setName(username);
                user.setEmail(useremail);

                MainActivity.myAppDatabase.myDao().addUser(user);
                Toast.makeText(getActivity(), "User Added Successfully", Toast.LENGTH_LONG).show();
                Userid.setText("");
                UserName.setText("");
                UserEmail.setText("");


            }
        });



        return view;
    }

}
