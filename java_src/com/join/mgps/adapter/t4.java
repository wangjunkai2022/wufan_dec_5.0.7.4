package com.join.mgps.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.papa91.arc.bean.PaiWeiDataBean;
import java.util.List;
/* compiled from: RankSelectRoloAdapter.java */
/* loaded from: classes4.dex */
public class t4 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    List<PaiWeiDataBean.RolesBean> f45839b;

    /* renamed from: c  reason: collision with root package name */
    private Context f45840c;

    /* renamed from: d  reason: collision with root package name */
    private LayoutInflater f45841d;

    /* renamed from: e  reason: collision with root package name */
    private a f45842e;

    /* renamed from: f  reason: collision with root package name */
    private int f45843f = 0;

    /* compiled from: RankSelectRoloAdapter.java */
    /* loaded from: classes4.dex */
    class a {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f45844a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f45845b;

        /* renamed from: c  reason: collision with root package name */
        TextView f45846c;

        a() {
        }
    }

    public t4(Context context, List<PaiWeiDataBean.RolesBean> list) {
        this.f45840c = context;
        this.f45839b = list;
        this.f45841d = LayoutInflater.from(context);
    }

    public void a(int i4) {
        this.f45843f = i4;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45839b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f45839b.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            this.f45842e = new a();
            view = this.f45841d.inflate(R.layout.item_roles_listview, (ViewGroup) null);
            this.f45842e.f45844a = (LinearLayout) view.findViewById(R.id.item_roles_ll);
            this.f45842e.f45845b = (ImageView) view.findViewById(R.id.item_select_iv);
            this.f45842e.f45846c = (TextView) view.findViewById(R.id.item_name_tx);
            view.setTag(this.f45842e);
        } else {
            this.f45842e = (a) view.getTag();
        }
        PaiWeiDataBean.RolesBean rolesBean = this.f45839b.get(i4);
        if (i4 == this.f45843f) {
            this.f45842e.f45845b.setVisibility(0);
            this.f45842e.f45846c.setTextColor(Color.parseColor("#6ee6fe"));
        } else {
            this.f45842e.f45845b.setVisibility(8);
            this.f45842e.f45846c.setTextColor(Color.parseColor("#156d84"));
        }
        this.f45842e.f45846c.setText(rolesBean.getRole());
        return view;
    }
}
