package com.patriciasoto.continuousassessment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class PrincipalPageActivity extends AppCompatActivity {

    private Button SnackBarButton;
    private Button DialogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_page);

        SnackBarButton = findViewById(R.id.SnackBar_button);
        DialogButton = findViewById(R.id.Dialog_button);

        SnackBarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v,"It has been added to the list",Snackbar.LENGTH_LONG);
                snackbar.setDuration(10000);
                snackbar.setAction("Okay", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //
                    }
                });
                snackbar.show();
            }
        });

        DialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(PrincipalPageActivity.this);
                builder.setTitle("Alert Exit");
                builder.setMessage("Are you sure you want to go out?");
                builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //
                    }
                });
                builder.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Intent intent = new Intent(PrincipalPageActivity.this, HomePageActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
                builder.setNegativeButton("Decline", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //
                    }
                });
                builder.show();
            }
        });
    }
}