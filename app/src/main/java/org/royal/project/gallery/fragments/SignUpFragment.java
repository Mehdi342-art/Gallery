package org.royal.project.gallery.fragments;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.royal.project.gallery.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {

    private BackwardListener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof BackwardListener) {
            listener = (BackwardListener) context;
        } else {
            throw new ClassCastException(context.toString() +
                    "Must Implement BackwardListener");
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.fragment_signup_option_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.fragment_som_backward: {
                listener.onBackwardClick();
                break;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "SignUpFragment";
    }

//    private void onBackPressed() {
//        Toast.makeText(getActivity(), "onBackPressed", Toast.LENGTH_SHORT).show();
//    }


    public interface BackwardListener {
        void onBackwardClick();
    }
}
