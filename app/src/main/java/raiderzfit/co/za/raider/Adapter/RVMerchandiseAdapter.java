package raiderzfit.co.za.raider.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import raiderzfit.co.za.raider.Class.Merchandise;

/**
 * Created by ProJava on 9/8/2016.
 */
public class RVMerchandiseAdapter extends RecyclerView.Adapter<RVMerchandiseAdapter.ViewHolder> {

    private Context context;
    private List<Merchandise> merchandises;

    public RVMerchandiseAdapter(Context context, List<Merchandise> merchandises)
    {
        this.context = context;
        this.merchandises = merchandises;
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
