package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.SearchAutoDataBean;
import java.util.List;
/* compiled from: SearchSimpleAdapter.java */
/* loaded from: classes4.dex */
public class m5 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f44883b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f44884c;

    /* renamed from: d  reason: collision with root package name */
    private List<SearchAutoDataBean> f44885d;

    /* compiled from: SearchSimpleAdapter.java */
    /* loaded from: classes4.dex */
    private class b {

        /* renamed from: a  reason: collision with root package name */
        ImageView f44886a;

        /* renamed from: b  reason: collision with root package name */
        TextView f44887b;

        private b() {
        }

        public ImageView a() {
            return this.f44886a;
        }

        public TextView b() {
            return this.f44887b;
        }

        public void c(ImageView imageView) {
            this.f44886a = imageView;
        }

        public void d(TextView textView) {
            this.f44887b = textView;
        }
    }

    public m5(Context context) {
        this.f44883b = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44885d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return Integer.valueOf(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        b bVar;
        SearchAutoDataBean searchAutoDataBean = this.f44885d.get(i4);
        if (view == null) {
            view = this.f44884c.inflate(R.layout.simple_listview_item, (ViewGroup) null);
            bVar = new b();
            bVar.f44887b = (TextView) view.findViewById(R.id.lv_tv_title);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        bVar.f44887b.setText(searchAutoDataBean.getGame_name());
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    public m5(Context context, List<SearchAutoDataBean> list) {
        this.f44883b = context;
        this.f44885d = list;
        this.f44884c = LayoutInflater.from(context);
    }
}
