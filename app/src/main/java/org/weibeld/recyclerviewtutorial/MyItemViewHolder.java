package org.weibeld.recyclerviewtutorial;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dw on 22/02/17.
 */
public class MyItemViewHolder extends RecyclerView.ViewHolder {
    // each data item is just a string in this case
    public TextView txtHeader;
    public TextView txtFooter;
    public ImageView icon;

    // Create a viewHolder for the passed view (item view)
    public MyItemViewHolder(View view) {
        super(view);
        txtHeader = (TextView) view.findViewById(R.id.firstLine);
        txtFooter = (TextView) view.findViewById(R.id.secondLine);
        icon = (ImageView) view.findViewById(R.id.icon);
    }
}
