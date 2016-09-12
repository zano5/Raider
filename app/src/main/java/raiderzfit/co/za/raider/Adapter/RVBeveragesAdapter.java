package raiderzfit.co.za.raider.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import raiderzfit.co.za.raider.Class.Beverages;

/**
 * Created by ProJava on 9/8/2016.
 */
public class RVBeveragesAdapter extends RecyclerView.Adapter<RVBeveragesAdapter.ViewHolder> {

    private Context context;
    private List<Beverages> beverages;

    public RVBeveragesAdapter(Context context, List<Beverages> beverages)
    {
        this.context = context;
        this.beverages = beverages;
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
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
