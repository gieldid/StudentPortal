package giel.hva.nl.studentportal;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AddPortalActivity extends AppCompatActivity  {

    TextInputLayout urlInput;
    TextInputLayout titleInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_portal);

        urlInput = findViewById(R.id.urlInputLayout);
        titleInput = findViewById(R.id.titleInputLayout);

        Button addPortalButton = findViewById(R.id.addPortalButton);
        addPortalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddPortal();
            }

        });

    }

    private void AddPortal() {
        CharSequence toastText;
        if(titleInput.getEditText()!= null && urlInput.getEditText() != null) {

            Portal portal = new Portal(titleInput.getEditText().getText().toString(), urlInput.getEditText().getText().toString());
            Portals portals = new Portals();
            portals.addPortal(portal);
            toastText = "Successfully added portal!";
        }else{
            toastText = "Failed to save portal check input!";
        }
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this,toastText,duration);
        toast.show();

    }
}
