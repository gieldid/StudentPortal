package giel.hva.nl.studentportal;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class ObjectHolder extends RecyclerView.ViewHolder {
    private Button button;
    private View view;

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public ObjectHolder(@NonNull View itemView) {
        super(itemView);
        button = itemView.findViewById(R.id.gridButton);
        view = itemView;

    }
}
