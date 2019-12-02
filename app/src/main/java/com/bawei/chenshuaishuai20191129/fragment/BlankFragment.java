package com.bawei.chenshuaishuai20191129.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bawei.chenshuaishuai20191129.Adapter;
import com.bawei.chenshuaishuai20191129.Bean;
import com.bawei.chenshuaishuai20191129.NetUtil;
import com.bawei.chenshuaishuai20191129.R;
import com.google.gson.Gson;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();
        NetUtil.getInstance().getjson("http://blog.zhaoliang5156.cn/api/news/lawyer", new NetUtil.MyCallBack() {
            @Override
            public void getjson(String json) {
                Bean bean = new Gson().fromJson(json, Bean.class);
                List<Bean.ListdataBean> listdata = bean.getListdata();
                listView.setAdapter(new Adapter(listdata));
            }
        });





    }

    private void init() {
        listView = (ListView)getActivity(). findViewById(R.id.listview);
    }
}
