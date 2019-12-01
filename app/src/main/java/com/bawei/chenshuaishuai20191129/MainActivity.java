package com.bawei.chenshuaishuai20191129;

import android.os.Bundle;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bawei.chenshuaishuai20191129.fragment.BlankFragment;
import com.bawei.chenshuaishuai20191129.fragment.BlankFragment2;
import com.bawei.chenshuaishuai20191129.fragment.BlankFragment3;

import java.util.ArrayList;
//第一次提交
//第二次提交
//第三次提交

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private RadioGroup radioGroup;
    private ArrayList<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        list = new ArrayList<>();
        list.add(new BlankFragment());
        list.add(new BlankFragment2());
        list.add(new BlankFragment3());
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position%list.size()){
                    case 0:
                        radioGroup.check(R.id.btn_1);
                        break;
                    case 1:
                        radioGroup.check(R.id.btn_2);
                        break;
                    case 2:
                        radioGroup.check(R.id.btn_3);
                        break;
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.btn_1:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.btn_2:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.btn_3:
                        viewPager.setCurrentItem(2);
                        break;
                }
            }
        });
    }
    private void init() {
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
    }
    public  void jump(){
        viewPager.setCurrentItem(2);
    }
}
