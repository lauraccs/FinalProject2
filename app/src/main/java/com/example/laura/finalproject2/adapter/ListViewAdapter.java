package com.example.laura.finalproject2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.laura.finalproject2.R;

import java.util.ArrayList;

/**
 * Created by lauraccs on 4/9/17.
 */

public class ListViewAdapter extends BaseAdapter {

    private final ArrayList<String> listResult;
    private Context mContext;
    private final LayoutInflater mInflater;

    public ListViewAdapter(Context context, ArrayList<String> listResult) {

        mContext = context;
        this.listResult = listResult;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return listResult.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null){
            convertView = mInflater.inflate(R.layout.list_item,parent,false);
            holder = new ViewHolder();
            holder.textView1 = (TextView)convertView.findViewById(R.id.list_view_tv1);
            holder.textView2 = (TextView)convertView.findViewById(R.id.list_view_tv2);
            holder.textView3 = (TextView)convertView.findViewById(R.id.list_view_tv3);

            convertView.setTag(holder);

        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.textView1.setText("activity");
        holder.textView2.setText("yay");
        holder.textView3.setText("fun");

        if(position%2==0){
            holder.textView1.setVisibility(View.VISIBLE);
            holder.textView3.setVisibility(View.INVISIBLE);

        }else {

            holder.textView3.setVisibility(View.VISIBLE);
            holder.textView1.setVisibility(View.INVISIBLE);

        }


        return convertView;
    }
}
class ViewHolder {
    TextView textView1;
    TextView textView2;
    TextView textView3;
    RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT);
}
