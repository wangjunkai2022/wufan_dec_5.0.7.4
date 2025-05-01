package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.ServiceState;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DetialimoreServiceAdapter.java */
/* loaded from: classes4.dex */
public class j extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f44445b;

    /* renamed from: c  reason: collision with root package name */
    private List<ServiceState> f44446c;

    /* compiled from: DetialimoreServiceAdapter.java */
    /* loaded from: classes4.dex */
    class a {

        /* renamed from: a  reason: collision with root package name */
        TextView f44447a;

        /* renamed from: b  reason: collision with root package name */
        TextView f44448b;

        /* renamed from: c  reason: collision with root package name */
        TextView f44449c;

        /* renamed from: d  reason: collision with root package name */
        TextView f44450d;

        a() {
        }
    }

    public j(Context context) {
        this.f44445b = context;
    }

    public List<ServiceState> a() {
        if (this.f44446c == null) {
            this.f44446c = new ArrayList();
        }
        return this.f44446c;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44446c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        a aVar;
        ServiceState serviceState = this.f44446c.get(i4);
        if (view == null) {
            view = LayoutInflater.from(this.f44445b).inflate(R.layout.gamedetial_bt_serviceinfo_item, (ViewGroup) null);
            aVar = new a();
            aVar.f44447a = (TextView) view.findViewById(R.id.tag);
            aVar.f44448b = (TextView) view.findViewById(R.id.day);
            aVar.f44449c = (TextView) view.findViewById(R.id.time);
            aVar.f44450d = (TextView) view.findViewById(R.id.serverName);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.f44447a.setText(serviceState.getType() == 1 ? "开服" : "合服");
        aVar.f44448b.setText(com.join.mgps.Util.y.D(serviceState.getAdd_time()));
        aVar.f44449c.setText(com.join.mgps.Util.y.y(serviceState.getAdd_time(), "HH:mm"));
        aVar.f44450d.setText(serviceState.getTitle());
        return view;
    }
}
