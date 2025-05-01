package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.PapayHistoryInfo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PapayHistoryAdapter.java */
/* loaded from: classes4.dex */
public class s4 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    Context f45812b;

    /* renamed from: c  reason: collision with root package name */
    List<PapayHistoryInfo> f45813c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    LayoutInflater f45814d;

    public s4(Context context) {
        this.f45812b = context;
        this.f45814d = LayoutInflater.from(context);
    }

    public List<PapayHistoryInfo> a() {
        return this.f45813c;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45813c.size();
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
        if (view == null) {
            view = this.f45814d.inflate(R.layout.papay_history_item_layout, (ViewGroup) null);
        }
        PapayHistoryInfo papayHistoryInfo = this.f45813c.get(i4);
        ((TextView) com.join.mgps.Util.s2.a(view, R.id.payType)).setText(papayHistoryInfo.getTitle());
        ((TextView) com.join.mgps.Util.s2.a(view, R.id.payNumber)).setText(papayHistoryInfo.getMoney());
        ((TextView) com.join.mgps.Util.s2.a(view, R.id.paySuccess)).setText(papayHistoryInfo.getStatus());
        ((TextView) com.join.mgps.Util.s2.a(view, R.id.payTime)).setText(papayHistoryInfo.getPay_time());
        return view;
    }
}
