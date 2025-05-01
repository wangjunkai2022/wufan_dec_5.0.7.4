package com.join.mgps.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.join.android.app.mgsim.wufun.R;
import java.util.Vector;
/* compiled from: ImageAdapter.java */
/* loaded from: classes4.dex */
public class w1 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f45945b;

    /* renamed from: c  reason: collision with root package name */
    private Vector<Integer> f45946c = new Vector<>();

    /* renamed from: d  reason: collision with root package name */
    private Vector<Boolean> f45947d = new Vector<>();

    /* renamed from: e  reason: collision with root package name */
    private int f45948e = -1;

    /* renamed from: f  reason: collision with root package name */
    private boolean f45949f;

    public w1(Context context, boolean z4) {
        this.f45945b = context;
        this.f45949f = z4;
        Vector<Integer> vector = this.f45946c;
        Integer valueOf = Integer.valueOf((int) R.drawable.sfc);
        vector.add(valueOf);
        this.f45946c.add(Integer.valueOf((int) R.drawable.fc));
        this.f45946c.add(Integer.valueOf((int) R.drawable.gba));
        this.f45946c.add(valueOf);
        this.f45946c.add(Integer.valueOf((int) R.drawable.f15588android));
        for (int i4 = 0; i4 < 5; i4++) {
            this.f45947d.add(Boolean.FALSE);
        }
    }

    private LayerDrawable b(int i4, boolean z4) {
        Bitmap decodeResource;
        Bitmap bitmap = ((BitmapDrawable) this.f45945b.getResources().getDrawable(i4)).getBitmap();
        if (z4) {
            decodeResource = BitmapFactory.decodeResource(this.f45945b.getResources(), R.drawable.classify_checked);
        } else {
            decodeResource = BitmapFactory.decodeResource(this.f45945b.getResources(), R.drawable.classify_uncheck);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new BitmapDrawable(bitmap), new BitmapDrawable(decodeResource)});
        layerDrawable.setLayerInset(0, 0, 0, 0, 0);
        layerDrawable.setLayerInset(1, 0, -5, 60, 45);
        return layerDrawable;
    }

    public void a(int i4) {
        if (this.f45949f) {
            Vector<Boolean> vector = this.f45947d;
            vector.setElementAt(Boolean.valueOf(true ^ vector.elementAt(i4).booleanValue()), i4);
        } else {
            int i5 = this.f45948e;
            if (i5 != -1) {
                this.f45947d.setElementAt(Boolean.FALSE, i5);
            }
            Vector<Boolean> vector2 = this.f45947d;
            vector2.setElementAt(Boolean.valueOf(true ^ vector2.elementAt(i4).booleanValue()), i4);
            this.f45948e = i4;
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45946c.size();
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
        ImageView imageView;
        if (view == null) {
            imageView = new ImageView(this.f45945b);
            imageView.setLayoutParams(new AbsListView.LayoutParams(150, 150));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            imageView = (ImageView) view;
        }
        imageView.setImageDrawable(b(this.f45946c.elementAt(i4).intValue(), this.f45947d.elementAt(i4).booleanValue()));
        return imageView;
    }
}
