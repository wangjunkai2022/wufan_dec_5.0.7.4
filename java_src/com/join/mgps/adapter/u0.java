package com.join.mgps.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.ImageInfo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GameDetailImagesAdapter.java */
/* loaded from: classes4.dex */
public class u0 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f45855b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f45856c;

    /* renamed from: d  reason: collision with root package name */
    private List<ImageInfo> f45857d;

    /* renamed from: e  reason: collision with root package name */
    private int f45858e;

    /* renamed from: f  reason: collision with root package name */
    private int f45859f;

    /* compiled from: GameDetailImagesAdapter.java */
    /* loaded from: classes4.dex */
    private class b {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f45860a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f45861b;

        /* renamed from: c  reason: collision with root package name */
        SimpleDraweeView f45862c;

        /* renamed from: d  reason: collision with root package name */
        ImageView f45863d;

        /* renamed from: e  reason: collision with root package name */
        ImageView f45864e;

        private b() {
        }
    }

    public u0(Context context) {
        this.f45857d = new ArrayList();
        this.f45859f = -1;
        this.f45855b = context;
        this.f45856c = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public ImageInfo getItem(int i4) {
        return this.f45857d.get(i4);
    }

    public List<ImageInfo> b() {
        return this.f45857d;
    }

    public void c(int i4) {
        int i5 = this.f45859f;
        if (i5 == i4) {
            return;
        }
        if (i5 >= 0) {
            getItem(i5).setSelected(false);
        }
        this.f45859f = i4;
        getItem(i4).setSelected(true);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45857d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            view = this.f45856c.inflate(R.layout.item_game_detail_images, (ViewGroup) null);
            bVar = new b();
            bVar.f45860a = (SimpleDraweeView) view.findViewById(R.id.imageViewVPic);
            bVar.f45861b = (SimpleDraweeView) view.findViewById(R.id.imageViewHPic);
            bVar.f45863d = (ImageView) view.findViewById(R.id.imageViewPlay);
            bVar.f45862c = (SimpleDraweeView) view.findViewById(R.id.image_blur);
            bVar.f45864e = (ImageView) view.findViewById(R.id.iv_border);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        ImageInfo item = getItem(i4);
        if (item.isVideo()) {
            bVar.f45860a.setVisibility(8);
            bVar.f45861b.setVisibility(0);
            bVar.f45862c.setVisibility(8);
            if (item.isSelected()) {
                bVar.f45861b.clearColorFilter();
                bVar.f45864e.setVisibility(0);
            } else {
                bVar.f45861b.setColorFilter(Color.parseColor("#4D000000"), PorterDuff.Mode.SRC_ATOP);
                bVar.f45864e.setVisibility(8);
            }
            if (com.join.mgps.Util.g2.i(item.getVideoUrl())) {
                bVar.f45863d.setVisibility(0);
            } else {
                bVar.f45863d.setVisibility(8);
            }
            MyImageLoader.d(bVar.f45861b, R.drawable.banner_normal_icon, item.getUrl());
        } else {
            if (item.isSelected()) {
                if (this.f45858e == 1) {
                    bVar.f45860a.clearColorFilter();
                } else {
                    bVar.f45861b.clearColorFilter();
                }
                bVar.f45864e.setVisibility(0);
            } else {
                if (this.f45858e == 1) {
                    bVar.f45860a.setColorFilter(Color.parseColor("#4D000000"), PorterDuff.Mode.SRC_ATOP);
                } else {
                    bVar.f45861b.setColorFilter(Color.parseColor("#4D000000"), PorterDuff.Mode.SRC_ATOP);
                }
                bVar.f45864e.setVisibility(8);
            }
            bVar.f45863d.setVisibility(8);
            if (this.f45858e == 1) {
                bVar.f45862c.setVisibility(0);
                bVar.f45860a.setVisibility(0);
                MyImageLoader.L(bVar.f45862c, this.f45857d.get(i4).getUrl(), 6, 15);
                if (this.f45857d.get(i4).isGif()) {
                    MyImageLoader.n(bVar.f45860a, this.f45857d.get(i4).getUrl());
                } else {
                    SimpleDraweeView simpleDraweeView = bVar.f45860a;
                    String url = this.f45857d.get(i4).getUrl();
                    Context context = this.f45855b;
                    MyImageLoader.j(simpleDraweeView, url, MyImageLoader.E(context, context.getResources().getDimensionPixelOffset(R.dimen.wdp6)));
                }
                bVar.f45861b.setVisibility(8);
            } else {
                if (this.f45857d.get(i4).isGif()) {
                    MyImageLoader.n(bVar.f45861b, this.f45857d.get(i4).getUrl());
                } else {
                    SimpleDraweeView simpleDraweeView2 = bVar.f45861b;
                    String url2 = this.f45857d.get(i4).getUrl();
                    Context context2 = this.f45855b;
                    MyImageLoader.j(simpleDraweeView2, url2, MyImageLoader.E(context2, context2.getResources().getDimensionPixelOffset(R.dimen.wdp6)));
                }
                bVar.f45862c.setVisibility(8);
                bVar.f45861b.setVisibility(0);
                bVar.f45860a.setVisibility(8);
            }
        }
        return view;
    }

    public u0(Context context, int i4, List<ImageInfo> list) {
        this.f45857d = new ArrayList();
        this.f45859f = -1;
        this.f45855b = context;
        this.f45856c = LayoutInflater.from(context);
        this.f45857d = list;
        this.f45858e = i4;
    }
}
