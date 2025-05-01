package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GameDetailAdapter1.java */
/* loaded from: classes4.dex */
public class p0 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f45692b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f45693c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f45694d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f45695e;

    /* renamed from: f  reason: collision with root package name */
    private int f45696f;

    /* compiled from: GameDetailAdapter1.java */
    /* loaded from: classes4.dex */
    private class b {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f45697a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f45698b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f45699c;

        private b() {
        }
    }

    public p0(Context context) {
        this.f45694d = new ArrayList();
        this.f45692b = context;
        this.f45693c = LayoutInflater.from(context);
    }

    public List<String> a() {
        return this.f45694d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45694d.size();
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
        if (view == null) {
            view = this.f45693c.inflate(R.layout.game_detail_item1, (ViewGroup) null);
            bVar = new b();
            bVar.f45697a = (SimpleDraweeView) view.findViewById(R.id.imageViewVPic);
            bVar.f45698b = (SimpleDraweeView) view.findViewById(R.id.imageViewHPic);
            bVar.f45699c = (ImageView) view.findViewById(R.id.imageViewPlay);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        if (this.f45696f == 1) {
            bVar.f45697a.setVisibility(0);
            bVar.f45698b.setVisibility(8);
            MyImageLoader.h(bVar.f45697a, this.f45694d.get(i4));
        } else {
            bVar.f45698b.setVisibility(0);
            bVar.f45697a.setVisibility(8);
            MyImageLoader.h(bVar.f45698b, this.f45694d.get(i4));
        }
        if (i4 == 0 && this.f45695e) {
            bVar.f45699c.setVisibility(0);
        } else {
            bVar.f45699c.setVisibility(8);
        }
        return view;
    }

    public p0(Context context, int i4, List<String> list, boolean z4) {
        this.f45694d = new ArrayList();
        this.f45692b = context;
        this.f45693c = LayoutInflater.from(context);
        this.f45694d = list;
        this.f45696f = i4;
        this.f45695e = z4;
    }
}
