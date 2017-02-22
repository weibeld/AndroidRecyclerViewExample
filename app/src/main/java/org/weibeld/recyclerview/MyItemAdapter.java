package org.weibeld.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by dw on 22/02/17.
 */

public class MyItemAdapter extends RecyclerView.Adapter<MyItemViewHolder> {

    private ArrayList<String> mData;

    public MyItemAdapter(ArrayList<String> data) {
        mData = data;
    }

    // Called when a new view for an item must be created. This method does not return the view of
    // the item, but a ViewHolder, which holds references to all the elements of the view.
    @Override
    public MyItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // The view for the item
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle, parent, false);
        // Create a ViewHolder for this view and return it
        return new MyItemViewHolder(itemView);
    }

    // Populate the elements of the passed view (represented by the ViewHolder) with the data of
    // the item at the specified position.
    @Override
    public void onBindViewHolder(MyItemViewHolder holder, int position) {
        holder.txtHeader.setText(mData.get(position));
        holder.txtFooter.setText("Footer: " + mData.get(position));
        final String item = mData.get(position);
        holder.icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remove(item);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void add(int position, String item) {
        mData.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(String item) {
        int position = mData.indexOf(item);
        mData.remove(position);
        notifyItemRemoved(position);
    }

}
