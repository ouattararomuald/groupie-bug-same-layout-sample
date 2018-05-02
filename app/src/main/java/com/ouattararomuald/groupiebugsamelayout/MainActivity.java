package com.ouattararomuald.groupiebugsamelayout;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import com.ouattararomuald.groupiebugsamelayout.adapters.BottomItem;
import com.ouattararomuald.groupiebugsamelayout.adapters.TopItem;
import com.xwray.groupie.GroupAdapter;
import com.xwray.groupie.Item;
import com.xwray.groupie.OnItemClickListener;
import com.xwray.groupie.Section;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  private RecyclerView recyclerView;

  private GroupAdapter groupAdapter;
  private Section topSection;
  private Section bottomSection;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    recyclerView = findViewById(R.id.recycler_view);

    groupAdapter = new GroupAdapter();

    topSection = new Section();
    bottomSection = new Section();

    groupAdapter.add(topSection);
    groupAdapter.add(bottomSection);

    recyclerView.setHasFixedSize(true);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    recyclerView.setAdapter(groupAdapter);

    groupAdapter.setOnItemClickListener(new OnItemClickListener() {
      @Override public void onItemClick(@NonNull Item item, @NonNull View view) {
        if (item instanceof TopItem) {
          Log.d("TAG", "TopItem");
        } else if (item instanceof BottomItem) {
          Log.d("TAG", "BottomItem");
        }
      }
    });

    populateRecyclerView(50);
  }

  private void populateRecyclerView(final int size) {

    List<TopItem> topItems = new ArrayList<>(size);
    List<BottomItem> bottomItems = new ArrayList<>(size);

    for (int i = 0; i < size; i++) {
      topItems.add(new TopItem());
      bottomItems.add(new BottomItem());
    }

    topSection.addAll(topItems);
    bottomSection.addAll(bottomItems);
  }
}
