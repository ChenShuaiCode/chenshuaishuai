package com.bawei.chenshuaishuai20191129;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    private List<Bean.ListdataBean> list;

    public Adapter(List<Bean.ListdataBean> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Wo wo;
        convertView=View.inflate(parent.getContext(),R.layout.adapter,null);
        wo=new Wo();
        wo.im=convertView.findViewById(R.id.mi);
        wo.text_1=convertView.findViewById(R.id.text_1);
        convertView.setTag(wo);
        NetUtil.getInstance().getphoto(list.get(position).getAvatar(),wo.im);
        wo.text_1.setText(list.get(position).getContent());
        return convertView;
    }
    class Wo{
        ImageView im;
        TextView text_1;
    }
}
