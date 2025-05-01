package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GameDetailAdapter.java */
/* loaded from: classes4.dex */
public class o0 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f45017b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f45018c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f45019d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f45020e;

    /* renamed from: f  reason: collision with root package name */
    private int f45021f;

    /* renamed from: g  reason: collision with root package name */
    boolean f45022g;

    /* compiled from: GameDetailAdapter.java */
    /* loaded from: classes4.dex */
    private class b {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f45023a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f45024b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f45025c;

        private b() {
        }
    }

    public o0(Context context) {
        this.f45019d = new ArrayList();
        this.f45022g = false;
        this.f45017b = context;
        this.f45018c = LayoutInflater.from(context);
    }

    public List<String> a() {
        return this.f45019d;
    }

    public void b() {
        this.f45022g = true;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45019d.size();
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
            view = this.f45018c.inflate(R.layout.game_detail_item, (ViewGroup) null);
            bVar = new b();
            bVar.f45023a = (SimpleDraweeView) view.findViewById(R.id.imageViewVPic);
            bVar.f45024b = (SimpleDraweeView) view.findViewById(R.id.imageViewHPic);
            bVar.f45025c = (ImageView) view.findViewById(R.id.imageViewPlay);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        if (this.f45021f == 1) {
            bVar.f45023a.setVisibility(0);
            if (this.f45022g) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) bVar.f45023a.getLayoutParams();
                layoutParams.height = this.f45017b.getResources().getDimensionPixelOffset(R.dimen.wdp370);
                layoutParams.width = this.f45017b.getResources().getDimensionPixelOffset(R.dimen.wdp200);
                bVar.f45023a.setLayoutParams(layoutParams);
                if (this.f45019d.get(i4).endsWith(".gif")) {
                    MyImageLoader.n(bVar.f45023a, this.f45019d.get(i4));
                } else {
                    Context context = this.f45017b;
                    MyImageLoader.j(bVar.f45023a, this.f45019d.get(i4), MyImageLoader.E(context, context.getResources().getDimensionPixelOffset(R.dimen.wdp3)));
                }
            } else if (this.f45019d.get(i4).endsWith(".gif")) {
                MyImageLoader.n(bVar.f45023a, this.f45019d.get(i4));
            } else {
                Context context2 = this.f45017b;
                MyImageLoader.j(bVar.f45023a, this.f45019d.get(i4), MyImageLoader.E(context2, context2.getResources().getDimensionPixelOffset(R.dimen.wdp3)));
            }
            bVar.f45024b.setVisibility(8);
        } else {
            if (this.f45022g) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) bVar.f45024b.getLayoutParams();
                layoutParams2.height = this.f45017b.getResources().getDimensionPixelOffset(R.dimen.wdp370);
                layoutParams2.width = this.f45017b.getResources().getDimensionPixelOffset(R.dimen.wdp642);
                bVar.f45024b.setLayoutParams(layoutParams2);
                if (this.f45019d.get(i4).endsWith(".gif")) {
                    MyImageLoader.n(bVar.f45024b, this.f45019d.get(i4));
                } else {
                    Context context3 = this.f45017b;
                    MyImageLoader.j(bVar.f45024b, this.f45019d.get(i4), MyImageLoader.E(context3, context3.getResources().getDimensionPixelOffset(R.dimen.wdp12)));
                }
            } else if (this.f45019d.get(i4).endsWith(".gif")) {
                MyImageLoader.n(bVar.f45024b, this.f45019d.get(i4));
            } else {
                Context context4 = this.f45017b;
                MyImageLoader.j(bVar.f45024b, this.f45019d.get(i4), MyImageLoader.E(context4, context4.getResources().getDimensionPixelOffset(R.dimen.wdp12)));
            }
            bVar.f45024b.setVisibility(0);
            bVar.f45023a.setVisibility(8);
        }
        if (i4 == 0 && this.f45020e) {
            bVar.f45025c.setVisibility(0);
        } else {
            bVar.f45025c.setVisibility(8);
        }
        return view;
    }

    public o0(Context context, int i4, List<String> list, boolean z4) {
        this.f45019d = new ArrayList();
        this.f45022g = false;
        this.f45017b = context;
        this.f45018c = LayoutInflater.from(context);
        this.f45019d = list;
        this.f45021f = i4;
        this.f45020e = z4;
    }
}
