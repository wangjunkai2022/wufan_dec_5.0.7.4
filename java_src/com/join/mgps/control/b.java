package com.join.mgps.control;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.GameDiscoverBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RhythmAdapter.java */
/* loaded from: classes4.dex */
public class b extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private float f46313b;

    /* renamed from: c  reason: collision with root package name */
    private List<GameDiscoverBean> f46314c;

    /* renamed from: d  reason: collision with root package name */
    private LayoutInflater f46315d;

    /* renamed from: e  reason: collision with root package name */
    private Context f46316e;

    /* renamed from: f  reason: collision with root package name */
    private RhythmLayout f46317f;

    /* renamed from: g  reason: collision with root package name */
    int f46318g;

    /* renamed from: h  reason: collision with root package name */
    int f46319h;

    /* renamed from: i  reason: collision with root package name */
    int f46320i;

    public b(Context context, RhythmLayout rhythmLayout, List<GameDiscoverBean> list) {
        this.f46316e = context;
        this.f46317f = rhythmLayout;
        ArrayList arrayList = new ArrayList();
        this.f46314c = arrayList;
        arrayList.addAll(list);
        this.f46318g = this.f46316e.getResources().getDimensionPixelSize(R.dimen.rhythm_item_height);
        this.f46319h = this.f46316e.getResources().getDimensionPixelSize(R.dimen.rhythm_icon_margin);
        this.f46320i = (int) TypedValue.applyDimension(1, 8.0f, this.f46316e.getResources().getDisplayMetrics());
        if (context != null) {
            this.f46315d = LayoutInflater.from(context);
        }
    }

    public void a(List<GameDiscoverBean> list) {
        this.f46314c.addAll(list);
    }

    public List<GameDiscoverBean> b() {
        return this.f46314c;
    }

    public void c(List<GameDiscoverBean> list) {
        this.f46314c = list;
    }

    public void d(float f5) {
        this.f46313b = f5;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f46314c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f46314c.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        RelativeLayout relativeLayout = (RelativeLayout) this.f46315d.inflate(R.layout.adapter_rhythm_icon, (ViewGroup) null);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams((int) this.f46313b, this.f46318g));
        relativeLayout.setTranslationY(this.f46313b);
        relativeLayout.setPadding(0, this.f46320i, 0, 0);
        int i5 = ((int) this.f46313b) - this.f46319h;
        ((RelativeLayout) relativeLayout.getChildAt(0)).setLayoutParams(new RelativeLayout.LayoutParams(i5, this.f46318g - this.f46319h));
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) relativeLayout.findViewById(R.id.image_icon);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i5, i5);
        int i6 = this.f46319h;
        layoutParams.setMargins(i6 * 2, i6 * 2, i6 * 2, 0);
        layoutParams.addRule(14);
        simpleDraweeView.setLayoutParams(layoutParams);
        if (this.f46316e != null) {
            this.f46314c.get(i4).getIco_remote();
            MyImageLoader.f(simpleDraweeView, R.drawable.main_normal_icon, this.f46314c.get(i4).getIco_remote(), MyImageLoader.E(this.f46316e, 2.0f));
        }
        return relativeLayout;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f46317f.q();
    }
}
