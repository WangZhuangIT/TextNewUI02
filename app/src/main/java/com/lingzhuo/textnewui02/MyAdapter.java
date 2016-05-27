package com.lingzhuo.textnewui02;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Wang on 2016/5/25.
 */
public class MyAdapter extends FragmentPagerAdapter {

    private Context context;
    private List<PeopleBean> dataList;

    public MyAdapter(FragmentManager fm, Context context, List<PeopleBean> dataList) {
        super(fm);
        this.context = context;
        this.dataList = dataList;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return dataList.get(position).getTitle();
    }

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return dataList.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return dataList.size();
    }
}
