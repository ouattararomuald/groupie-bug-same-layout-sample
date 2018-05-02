package com.ouattararomuald.groupiebugsamelayout.adapters;

import android.support.annotation.NonNull;
import android.view.View;
import com.ouattararomuald.groupiebugsamelayout.R;
import com.xwray.groupie.Item;
import com.xwray.groupie.ViewHolder;

public class BottomItem extends Item<BottomItem.BottomItemViewHolder> {

  @Override public void bind(@NonNull BottomItemViewHolder viewHolder, int position) {
  }

  @Override public int getLayout() {
    return R.layout.common_layout;
  }

  @NonNull @Override public BottomItemViewHolder createViewHolder(@NonNull View itemView) {
    return new BottomItemViewHolder(itemView);
  }

  class BottomItemViewHolder extends ViewHolder {

    BottomItemViewHolder(@NonNull View rootView) {
      super(rootView);
    }
  }
}
