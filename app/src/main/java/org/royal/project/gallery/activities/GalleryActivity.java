package org.royal.project.gallery.activities;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import org.royal.project.gallery.R;

public class GalleryActivity extends AppCompatActivity {

    private Button sendButton;
    private EditText nameEditText;
    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        initViews();
        sendToDetailFragment();
        fragmentManager = getSupportFragmentManager();
    }

    private void sendToDetailFragment() {

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nameEditText.getText().toString();
                if (!TextUtils.isEmpty(name)) {
                    sendName(name);
                } else {
                    Toast.makeText(GalleryActivity.this, "Please enter valid name", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    private void sendName(String name) {

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

    }

    private void initViews() {

        sendButton = findViewById(R.id.button_activity_galley_send);
        nameEditText = findViewById(R.id.editText_activity_galley_name);
    }


}
