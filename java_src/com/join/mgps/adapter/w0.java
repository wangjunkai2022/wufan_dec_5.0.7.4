package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.c;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.ImageInfo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GameDetailSimilarGameAdapterV1.java */
/* loaded from: classes4.dex */
public class w0 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f45933b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f45934c;

    /* renamed from: d  reason: collision with root package name */
    private List<ImageInfo> f45935d;

    /* renamed from: e  reason: collision with root package name */
    private int f45936e;

    /* renamed from: f  reason: collision with root package name */
    boolean f45937f;

    /* compiled from: GameDetailSimilarGameAdapterV1.java */
    /* loaded from: classes4.dex */
    private class b {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f45938a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f45939b;

        /* renamed from: c  reason: collision with root package name */
        FrameLayout f45940c;

        /* renamed from: d  reason: collision with root package name */
        ImageView f45941d;

        /* renamed from: e  reason: collision with root package name */
        RelativeLayout f45942e;

        /* renamed from: f  reason: collision with root package name */
        SimpleDraweeView f45943f;

        private b() {
        }
    }

    public w0(Context context) {
        this.f45935d = new ArrayList();
        this.f45937f = false;
        this.f45933b = context;
        this.f45934c = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public ImageInfo getItem(int i4) {
        return this.f45935d.get(i4);
    }

    public List<ImageInfo> b() {
        return this.f45935d;
    }

    public void c() {
        this.f45937f = true;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45935d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            view = this.f45934c.inflate(R.layout.game_detail_similar_game_item_v1, (ViewGroup) null);
            bVar = new b();
            bVar.f45938a = (SimpleDraweeView) view.findViewById(R.id.imageViewVPic);
            bVar.f45939b = (SimpleDraweeView) view.findViewById(R.id.imageViewHPic);
            bVar.f45941d = (ImageView) view.findViewById(R.id.imageViewPlay);
            bVar.f45940c = (FrameLayout) view.findViewById(R.id.videoContner);
            bVar.f45942e = (RelativeLayout) view.findViewById(R.id.rl_video);
            bVar.f45943f = (SimpleDraweeView) view.findViewById(R.id.bannerView);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        ImageInfo item = getItem(i4);
        bVar.f45943f.setTag(Integer.valueOf(i4));
        if (item.isVideo()) {
            bVar.f45938a.setVisibility(8);
            bVar.f45939b.setVisibility(8);
            bVar.f45941d.setVisibility(8);
            bVar.f45942e.setVisibility(0);
            String videoUrl = item.getVideoUrl();
            MyImageLoader.d(bVar.f45943f, R.drawable.banner_normal_icon, item.getUrl());
            new c.l(i4, videoUrl, item.getUrl());
        } else {
            bVar.f45941d.setVisibility(8);
            bVar.f45942e.setVisibility(8);
            if (this.f45936e == 1) {
                bVar.f45938a.setVisibility(0);
                if (this.f45937f) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) bVar.f45938a.getLayoutParams();
                    layoutParams.height = this.f45933b.getResources().getDimensionPixelOffset(R.dimen.wdp370);
                    layoutParams.width = this.f45933b.getResources().getDimensionPixelOffset(R.dimen.wdp200);
                    bVar.f45938a.setLayoutParams(layoutParams);
                    if (this.f45935d.get(i4).isGif()) {
                        MyImageLoader.n(bVar.f45938a, this.f45935d.get(i4).getUrl());
                    } else {
                        SimpleDraweeView simpleDraweeView = bVar.f45938a;
                        String url = this.f45935d.get(i4).getUrl();
                        Context context = this.f45933b;
                        MyImageLoader.j(simpleDraweeView, url, MyImageLoader.E(context, context.getResources().getDimensionPixelOffset(R.dimen.wdp3)));
                    }
                } else if (this.f45935d.get(i4).isGif()) {
                    MyImageLoader.n(bVar.f45938a, this.f45935d.get(i4).getUrl());
                } else {
                    SimpleDraweeView simpleDraweeView2 = bVar.f45938a;
                    String url2 = this.f45935d.get(i4).getUrl();
                    Context context2 = this.f45933b;
                    MyImageLoader.j(simpleDraweeView2, url2, MyImageLoader.E(context2, context2.getResources().getDimensionPixelOffset(R.dimen.wdp3)));
                }
                bVar.f45939b.setVisibility(8);
            } else {
                if (this.f45937f) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) bVar.f45939b.getLayoutParams();
                    layoutParams2.height = this.f45933b.getResources().getDimensionPixelOffset(R.dimen.wdp370);
                    layoutParams2.width = this.f45933b.getResources().getDimensionPixelOffset(R.dimen.wdp642);
                    bVar.f45939b.setLayoutParams(layoutParams2);
                    if (this.f45935d.get(i4).isGif()) {
                        MyImageLoader.n(bVar.f45939b, this.f45935d.get(i4).getUrl());
                    } else {
                        SimpleDraweeView simpleDraweeView3 = bVar.f45939b;
                        String url3 = this.f45935d.get(i4).getUrl();
                        Context context3 = this.f45933b;
                        MyImageLoader.j(simpleDraweeView3, url3, MyImageLoader.E(context3, context3.getResources().getDimensionPixelOffset(R.dimen.wdp12)));
                    }
                } else if (this.f45935d.get(i4).isGif()) {
                    MyImageLoader.n(bVar.f45939b, this.f45935d.get(i4).getUrl());
                } else {
                    SimpleDraweeView simpleDraweeView4 = bVar.f45939b;
                    String url4 = this.f45935d.get(i4).getUrl();
                    Context context4 = this.f45933b;
                    MyImageLoader.j(simpleDraweeView4, url4, MyImageLoader.E(context4, context4.getResources().getDimensionPixelOffset(R.dimen.wdp2)));
                }
                bVar.f45939b.setVisibility(0);
                bVar.f45938a.setVisibility(8);
            }
        }
        return view;
    }

    public w0(Context context, int i4, List<ImageInfo> list) {
        this.f45935d = new ArrayList();
        this.f45937f = false;
        this.f45933b = context;
        this.f45934c = LayoutInflater.from(context);
        this.f45935d = list;
        this.f45936e = i4;
    }
}
