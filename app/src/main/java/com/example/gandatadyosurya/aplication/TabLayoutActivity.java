package com.example.gandatadyosurya.aplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class TabLayoutActivity extends AppCompatActivity{
    private android.support.design.widget.TabLayout tabLayout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout);

        tabLayout1 = (TabLayout) findViewById(R.id.tablayout);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PageAdapter adapter = new PageAdapter(getSupportFragmentManager(), tabLayout1.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new android.support.design.widget.TabLayout.TabLayoutOnPageChangeListener(tabLayout1));
        tabLayout1.setOnTabSelectedListener(new android.support.design.widget.TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(android.support.design.widget.TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(android.support.design.widget.TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(android.support.design.widget.TabLayout.Tab tab) {

            }
        });
    }
}
