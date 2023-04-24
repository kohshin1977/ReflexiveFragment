package com.example.reflexivefragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MainPagerAdapter extends FragmentStateAdapter {

    public MainPagerAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new NestedTabFragment();
        } else {
            // 他のタブのコンテンツを返します。必要に応じて変更してください。
            return new SampleContentFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3; // タブの数を指定
    }
}
