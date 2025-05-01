package com.papa91.arc.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.papa91.arc.interfaces.IOnItemClickListener;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public abstract class SimpleBaseAdapter<T> extends BaseAdapter {
    private IOnItemClickListener itemClickListener;
    private List<T> mDataList = new ArrayList();

    public void addData(T t4) {
        this.mDataList.add(t4);
    }

    public void addDatas(List<T> list) {
        if (list != null) {
            for (T t4 : list) {
                this.mDataList.add(t4);
            }
        }
        notifyDataSetChanged();
    }

    public void clear() {
        this.mDataList.clear();
        notifyDataSetChanged();
    }

    public abstract void convert(int i4, View view, ViewGroup viewGroup, boolean z4);

    @Override // android.widget.Adapter
    public int getCount() {
        List<T> list = this.mDataList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public T getItem(int i4) {
        if (i4 > this.mDataList.size() - 1) {
            return null;
        }
        return this.mDataList.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    public abstract int getLayoutId();

    @Override // android.widget.Adapter
    public View getView(final int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(getLayoutId(), (ViewGroup) null);
            convert(i4, view, viewGroup, true);
        } else {
            convert(i4, view, viewGroup, false);
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.papa91.arc.adapter.SimpleBaseAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (SimpleBaseAdapter.this.itemClickListener != null) {
                    SimpleBaseAdapter.this.itemClickListener.onItemClick(i4);
                }
            }
        });
        return view;
    }

    public boolean remove(T t4) {
        return this.mDataList.remove(t4);
    }

    public void setDatas(List<T> list) {
        this.mDataList.clear();
        addDatas(list);
    }

    public void setItemClickListener(IOnItemClickListener iOnItemClickListener) {
        this.itemClickListener = iOnItemClickListener;
    }

    public void addData(int i4, T t4) {
        this.mDataList.add(i4, t4);
    }

    public T remove(int i4) {
        return this.mDataList.remove(i4);
    }
}
