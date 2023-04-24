package com.example.reflexivefragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class NestedTabFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nested_tab, container, false);

        TabLayout nestedTabLayout = view.findViewById(R.id.nestedTabLayout);
        ViewPager2 nestedViewPager = view.findViewById(R.id.nestedViewPager);

        // タブとページャーアダプターを設定
        NestedPagerAdapter nestedPagerAdapter = new NestedPagerAdapter(getChildFragmentManager(), getLifecycle());
        nestedViewPager.setAdapter(nestedPagerAdapter);
        new TabLayoutMediator(nestedTabLayout, nestedViewPager, (tab, position) -> {
            tab.setText("Nested Tab " + (position + 1));
        }).attach();

        return view;
    }

}
