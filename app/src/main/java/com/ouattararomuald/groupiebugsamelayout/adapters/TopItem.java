package com.ouattararomuald.groupiebugsamelayout.adapters;

import android.support.annotation.NonNull;
import android.view.View;
import com.ouattararomuald.groupiebugsamelayout.R;
import com.xwray.groupie.Item;
import com.xwray.groupie.ViewHolder;

public class TopItem extends Item<TopItem.TopItemViewHolder> {

  @Override public void bind(@NonNull TopItem.TopItemViewHolder viewHolder, int position) {
  }

  @Override public int getLayout() {
    return R.layout.common_layout;
  }

  @NonNull @Override public TopItem.TopItemViewHolder createViewHolder(@NonNull View itemView) {
    return new TopItem.TopItemViewHolder(itemView);
  }

  class TopItemViewHolder extends ViewHolder {

    TopItemViewHolder(@NonNull View rootView) {
      super(rootView);
    }
  }
}
