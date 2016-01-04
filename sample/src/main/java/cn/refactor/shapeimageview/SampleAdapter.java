package cn.refactor.shapeimageview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import cn.refactor.library.ShapeImageView;

/**
 * 作者 : andy
 * 日期 : 15/12/29 16:07
 * 邮箱 : andyxialm@gmail.com
 * 描述 :
 */
public class SampleAdapter extends BaseAdapter {

    private Context mContext;

    public SampleAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return 50;
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
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = View.inflate(mContext, R.layout.item_sample, null);
            holder.siv = (ShapeImageView) convertView.findViewById(R.id.siv);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        int mode = position % 3;
        switch (mode) {
            case 0:
                holder.siv.setImageResource(R.mipmap.a);
                holder.siv.setText(null);
                break;
            case 1:
                holder.siv.setImageResource(R.mipmap.b);
                holder.siv.setText(null);
                break;
            case 2:
                holder.siv.setImageResource(R.mipmap.c);
                holder.siv.setText(String.valueOf(position));
                break;
        }
        return convertView;
    }

    public static class ViewHolder {
        public ShapeImageView siv;
    }
}
