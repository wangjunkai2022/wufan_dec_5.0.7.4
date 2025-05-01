package com.join.mgps.adapter;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.SquareLayout;
import com.join.mgps.db.tables.HeadPortraitTable;
import java.util.List;
/* compiled from: ChooseAdapter.java */
/* loaded from: classes4.dex */
public class a extends BaseAdapter {

    /* renamed from: c  reason: collision with root package name */
    private Context f44153c;

    /* renamed from: d  reason: collision with root package name */
    private List<HeadPortraitTable> f44154d;

    /* renamed from: f  reason: collision with root package name */
    private String f44156f;

    /* renamed from: b  reason: collision with root package name */
    String f44152b = getClass().getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    private int f44155e = 0;

    /* compiled from: ChooseAdapter.java */
    /* renamed from: com.join.mgps.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0340a {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f44157a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f44158b;

        /* renamed from: c  reason: collision with root package name */
        SquareLayout f44159c;

        C0340a() {
        }
    }

    public a(Context context, List<HeadPortraitTable> list, String str, boolean z4) {
        this.f44153c = context;
        this.f44154d = list;
        this.f44156f = str;
    }

    public int a() {
        return this.f44155e;
    }

    public void b(int i4) {
        if (i4 > 0) {
            this.f44155e = i4;
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44154d.size();
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
        View view2;
        C0340a c0340a;
        if (view == null) {
            c0340a = new C0340a();
            view2 = LayoutInflater.from(this.f44153c).inflate(R.layout.choose_grid_item, (ViewGroup) null);
            c0340a.f44157a = (SimpleDraweeView) view2.findViewById(R.id.itemImage);
            c0340a.f44159c = (SquareLayout) view2.findViewById(R.id.itemLayout);
            c0340a.f44158b = (ImageView) view2.findViewById(R.id.itemImageChoice);
            view2.setTag(c0340a);
        } else {
            view2 = view;
            c0340a = (C0340a) view.getTag();
        }
        if (i4 == 0) {
            c0340a.f44159c.setBackgroundResource(this.f44154d.get(i4).getId());
        } else {
            MyImageLoader.h(c0340a.f44157a, this.f44154d.get(i4).getHead_portrait_pic());
            if (com.join.mgps.Util.g2.i(this.f44156f) && com.join.mgps.Util.g2.i(this.f44154d.get(i4).getHead_portrait_pic())) {
                if (this.f44156f.equals(this.f44154d.get(i4).getHead_portrait_pic())) {
                    c0340a.f44158b.setBackgroundResource(R.drawable.icon_checked);
                }
            } else if (Build.VERSION.SDK_INT >= 16) {
                c0340a.f44158b.setBackground(new ColorDrawable(0));
            } else {
                c0340a.f44158b.setBackgroundDrawable(new ColorDrawable(0));
            }
            int i5 = this.f44155e;
            if (i5 > 0) {
                if (i5 == i4) {
                    c0340a.f44158b.setBackgroundResource(R.drawable.icon_checked);
                } else {
                    try {
                        if (Build.VERSION.SDK_INT >= 16) {
                            c0340a.f44158b.setBackground(new ColorDrawable(0));
                        } else {
                            c0340a.f44158b.setBackgroundDrawable(new ColorDrawable(0));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return view2;
    }
}
