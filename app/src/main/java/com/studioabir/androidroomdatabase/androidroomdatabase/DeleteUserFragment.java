package com.studioabir.androidroomdatabase.androidroomdatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class DeleteUserFragment extends Fragment {

    private EditText DeleteUserid;
    private Button BnDelete;

    public DeleteUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete_user, container, false);

        DeleteUserid = view.findViewById(R.id.deleteedittext);
        BnDelete = view.findViewById(R.id.deletebutton);

        BnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int userid = Integer.parseInt(DeleteUserid.getText().toString());
                User user = new User();
                user.setId(userid);

                MainActivity.myAppDatabase.myDao().deleteUser(user);
                Toast.makeText(getActivity(), "User Removed Successfully", Toast.LENGTH_LONG).show();
                DeleteUserid.setText("");

            }
        });


        return view;
    }

}
