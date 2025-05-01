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
/* compiled from: GameDetailAdapterV1.java */
/* loaded from: classes4.dex */
public class q0 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f45714b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f45715c;

    /* renamed from: d  reason: collision with root package name */
    private List<ImageInfo> f45716d;

    /* renamed from: e  reason: collision with root package name */
    private int f45717e;

    /* renamed from: f  reason: collision with root package name */
    com.join.android.app.component.video.c f45718f;

    /* renamed from: g  reason: collision with root package name */
    boolean f45719g;

    /* compiled from: GameDetailAdapterV1.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f45720b;

        a(int i4) {
            this.f45720b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q0.this.f45718f.F(this.f45720b);
        }
    }

    /* compiled from: GameDetailAdapterV1.java */
    /* loaded from: classes4.dex */
    private class b {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f45722a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f45723b;

        /* renamed from: c  reason: collision with root package name */
        FrameLayout f45724c;

        /* renamed from: d  reason: collision with root package name */
        ImageView f45725d;

        /* renamed from: e  reason: collision with root package name */
        RelativeLayout f45726e;

        /* renamed from: f  reason: collision with root package name */
        SimpleDraweeView f45727f;

        private b() {
        }

        /* synthetic */ b(q0 q0Var, a aVar) {
            this();
        }
    }

    public q0(Context context) {
        this.f45716d = new ArrayList();
        this.f45719g = false;
        this.f45714b = context;
        this.f45715c = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public ImageInfo getItem(int i4) {
        return this.f45716d.get(i4);
    }

    public List<ImageInfo> b() {
        return this.f45716d;
    }

    public void c() {
        this.f45719g = true;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45716d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            view = this.f45715c.inflate(R.layout.game_detail_item_v1, (ViewGroup) null);
            bVar = new b(this, null);
            bVar.f45722a = (SimpleDraweeView) view.findViewById(R.id.imageViewVPic);
            bVar.f45723b = (SimpleDraweeView) view.findViewById(R.id.imageViewHPic);
            bVar.f45725d = (ImageView) view.findViewById(R.id.imageViewPlay);
            bVar.f45724c = (FrameLayout) view.findViewById(R.id.videoContner);
            bVar.f45726e = (RelativeLayout) view.findViewById(R.id.rl_video);
            bVar.f45727f = (SimpleDraweeView) view.findViewById(R.id.bannerView);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        ImageInfo item = getItem(i4);
        bVar.f45727f.setTag(Integer.valueOf(i4));
        if (item.isVideo()) {
            bVar.f45722a.setVisibility(8);
            bVar.f45723b.setVisibility(8);
            bVar.f45725d.setVisibility(8);
            bVar.f45726e.setVisibility(0);
            String videoUrl = item.getVideoUrl();
            MyImageLoader.d(bVar.f45727f, R.drawable.banner_normal_icon, item.getUrl());
            c.l lVar = new c.l(i4, videoUrl, item.getUrl());
            com.join.android.app.component.video.c cVar = this.f45718f;
            if (cVar != null) {
                cVar.e(i4, lVar, false);
                bVar.f45724c.setOnClickListener(new a(i4));
            }
        } else {
            bVar.f45725d.setVisibility(8);
            bVar.f45726e.setVisibility(8);
            if (this.f45717e == 1) {
                bVar.f45722a.setVisibility(0);
                if (this.f45719g) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) bVar.f45722a.getLayoutParams();
                    layoutParams.height = this.f45714b.getResources().getDimensionPixelOffset(R.dimen.wdp312);
                    layoutParams.width = this.f45714b.getResources().getDimensionPixelOffset(R.dimen.wdp180);
                    bVar.f45722a.setLayoutParams(layoutParams);
                    if (this.f45716d.get(i4).isGif()) {
                        MyImageLoader.n(bVar.f45722a, this.f45716d.get(i4).getUrl());
                    } else {
                        SimpleDraweeView simpleDraweeView = bVar.f45722a;
                        String url = this.f45716d.get(i4).getUrl();
                        Context context = this.f45714b;
                        MyImageLoader.j(simpleDraweeView, url, MyImageLoader.E(context, context.getResources().getDimensionPixelOffset(R.dimen.wdp3)));
                    }
                } else if (this.f45716d.get(i4).isGif()) {
                    MyImageLoader.n(bVar.f45722a, this.f45716d.get(i4).getUrl());
                } else {
                    SimpleDraweeView simpleDraweeView2 = bVar.f45722a;
                    String url2 = this.f45716d.get(i4).getUrl();
                    Context context2 = this.f45714b;
                    MyImageLoader.j(simpleDraweeView2, url2, MyImageLoader.E(context2, context2.getResources().getDimensionPixelOffset(R.dimen.wdp3)));
                }
                bVar.f45723b.setVisibility(8);
            } else {
                if (this.f45719g) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) bVar.f45723b.getLayoutParams();
                    layoutParams2.height = this.f45714b.getResources().getDimensionPixelOffset(R.dimen.wdp210);
                    layoutParams2.width = this.f45714b.getResources().getDimensionPixelOffset(R.dimen.wdp372);
                    bVar.f45723b.setLayoutParams(layoutParams2);
                    if (this.f45716d.get(i4).isGif()) {
                        MyImageLoader.n(bVar.f45723b, this.f45716d.get(i4).getUrl());
                    } else {
                        SimpleDraweeView simpleDraweeView3 = bVar.f45723b;
                        String url3 = this.f45716d.get(i4).getUrl();
                        Context context3 = this.f45714b;
                        MyImageLoader.j(simpleDraweeView3, url3, MyImageLoader.E(context3, context3.getResources().getDimensionPixelOffset(R.dimen.wdp12)));
                    }
                } else if (this.f45716d.get(i4).isGif()) {
                    MyImageLoader.n(bVar.f45723b, this.f45716d.get(i4).getUrl());
                } else {
                    SimpleDraweeView simpleDraweeView4 = bVar.f45723b;
                    String url4 = this.f45716d.get(i4).getUrl();
                    Context context4 = this.f45714b;
                    MyImageLoader.j(simpleDraweeView4, url4, MyImageLoader.E(context4, context4.getResources().getDimensionPixelOffset(R.dimen.wdp12)));
                }
                bVar.f45723b.setVisibility(0);
                bVar.f45722a.setVisibility(8);
            }
        }
        return view;
    }

    public q0(Context context, int i4, List<ImageInfo> list, com.join.android.app.component.video.c cVar) {
        this.f45716d = new ArrayList();
        this.f45719g = false;
        this.f45714b = context;
        this.f45715c = LayoutInflater.from(context);
        this.f45716d = list;
        this.f45717e = i4;
        this.f45718f = cVar;
    }
}
