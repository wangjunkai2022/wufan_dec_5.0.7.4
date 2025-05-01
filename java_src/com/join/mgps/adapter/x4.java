package com.join.mgps.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.RecomWifiActivity;
import com.join.mgps.dto.CollectionBeanSub;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RecomWifiAdapter.java */
/* loaded from: classes4.dex */
public class x4 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    RecomWifiActivity f46021b;

    /* renamed from: c  reason: collision with root package name */
    List<CollectionBeanSub> f46022c;

    /* renamed from: d  reason: collision with root package name */
    List<CollectionBeanSub> f46023d;

    /* renamed from: e  reason: collision with root package name */
    LayoutInflater f46024e;

    /* renamed from: f  reason: collision with root package name */
    private c2.e f46025f;

    /* compiled from: RecomWifiAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CheckBox f46026b;

        a(CheckBox checkBox) {
            this.f46026b = checkBox;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f46026b.isChecked()) {
                this.f46026b.setChecked(false);
            } else {
                this.f46026b.setChecked(true);
            }
        }
    }

    /* compiled from: RecomWifiAdapter.java */
    /* loaded from: classes4.dex */
    class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f46028a;

        b(int i4) {
            this.f46028a = i4;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (z4) {
                x4 x4Var = x4.this;
                x4Var.f46023d.add(x4Var.f46022c.get(this.f46028a));
            } else {
                x4 x4Var2 = x4.this;
                x4Var2.f46023d.remove(x4Var2.f46022c.get(this.f46028a));
            }
            x4.this.f46025f.o(x4.this.f46023d);
        }
    }

    public x4(RecomWifiActivity recomWifiActivity, List<CollectionBeanSub> list) {
        this.f46021b = recomWifiActivity;
        this.f46022c = list;
        this.f46024e = LayoutInflater.from(recomWifiActivity);
        ArrayList arrayList = new ArrayList();
        this.f46023d = arrayList;
        arrayList.addAll(list);
        this.f46025f = recomWifiActivity.g0();
    }

    public List<CollectionBeanSub> b() {
        return this.f46023d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f46022c.size();
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
            view = this.f46024e.inflate(R.layout.recome_wifi_item, (ViewGroup) null);
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) com.join.mgps.Util.s2.a(view, R.id.icon);
        CheckBox checkBox = (CheckBox) com.join.mgps.Util.s2.a(view, R.id.box);
        ((TextView) com.join.mgps.Util.s2.a(view, R.id.appName)).setText(this.f46022c.get(i4).getGame_name());
        MyImageLoader.d(simpleDraweeView, R.drawable.main_normal_icon, this.f46022c.get(i4).getIco_remote());
        simpleDraweeView.setOnClickListener(new a(checkBox));
        checkBox.setOnCheckedChangeListener(new b(i4));
        return view;
    }
}
