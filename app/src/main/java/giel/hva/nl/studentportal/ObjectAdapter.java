package giel.hva.nl.studentportal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ObjectAdapter extends RecyclerView.Adapter<ObjectHolder> {
    private Context context;
    private List<Portal> listPortal;

    public ObjectAdapter(Context context){
        this.context = context;
        Portals portals = new Portals();
        listPortal = Portals.getPortals();
    }

    @NonNull
    @Override
    public ObjectHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_cell, parent, false);
        return new ObjectHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ObjectHolder objectHolder, int position) {
        final Portal portal = listPortal.get(position);

        objectHolder.getButton().setText(portal.getTitle());
        objectHolder.getButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(portal.getUrl()));
                context.startActivity(browserIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPortal.size();
    }
}
