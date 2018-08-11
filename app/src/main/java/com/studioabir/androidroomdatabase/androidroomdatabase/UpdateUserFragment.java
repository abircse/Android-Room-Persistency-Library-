package com.studioabir.androidroomdatabase.androidroomdatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class UpdateUserFragment extends Fragment {


    private EditText Userid, UserName, UserEmail;
    private Button BnUpdate;

    public UpdateUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_update_user, container, false);

        Userid = view.findViewById(R.id.editTextu1);
        UserName = view.findViewById(R.id.editTextu2);
        UserEmail = view.findViewById(R.id.editTextu3);
        BnUpdate = view.findViewById(R.id.buttonu);

        BnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int userid = Integer.parseInt(Userid.getText().toString());
                String username = UserName.getText().toString();
                String useremail = UserEmail.getText().toString();

                User user = new User();
                user.setId(userid);
                user.setName(username);
                user.setEmail(useremail);

                MainActivity.myAppDatabase.myDao().UpdateUser(user);
                Toast.makeText(getActivity(), "User Updated Successfully", Toast.LENGTH_LONG).show();
                Userid.setText("");
                UserName.setText("");
                UserEmail.setText("");



            }
        });

        return view;
    }

}
