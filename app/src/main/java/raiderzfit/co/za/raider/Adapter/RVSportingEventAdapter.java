package raiderzfit.co.za.raider.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import raiderzfit.co.za.raider.Class.SportEvent;

/**
 * Created by ProJava on 9/5/2016.
 */
public class RVSportingEventAdapter extends RecyclerView.Adapter<RVSportingEventAdapter.ViewHolder> {

    private Context context;
    private List<SportEvent> sportEvents;

    public RVSportingEventAdapter(Context context, List<SportEvent> sportEvents)
    {
        this.context = context;
        this.sportEvents = sportEvents;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View view) {
            super(view);
        }
    }
}
