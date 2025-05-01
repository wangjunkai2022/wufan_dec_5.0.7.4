package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.screenshot.ScreenshotGamedetialBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GameDetailImageAdapterV1.java */
/* loaded from: classes4.dex */
public class t0 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f45819b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f45820c;

    /* renamed from: d  reason: collision with root package name */
    private List<ScreenshotGamedetialBean> f45821d;

    /* compiled from: GameDetailImageAdapterV1.java */
    /* loaded from: classes4.dex */
    private class b {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f45822a;

        /* renamed from: b  reason: collision with root package name */
        TextView f45823b;

        /* renamed from: c  reason: collision with root package name */
        TextView f45824c;

        private b() {
        }
    }

    public t0(Context context) {
        this.f45821d = new ArrayList();
        this.f45819b = context;
        this.f45820c = LayoutInflater.from(context);
    }

    public List<ScreenshotGamedetialBean> a() {
        return this.f45821d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45821d.size();
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
            view = this.f45820c.inflate(R.layout.game_detail_screenshot_item_v1, (ViewGroup) null);
            bVar = new b();
            bVar.f45823b = (TextView) view.findViewById(R.id.number);
            bVar.f45822a = (SimpleDraweeView) view.findViewById(R.id.imageViewHPic);
            bVar.f45824c = (TextView) view.findViewById(R.id.title);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        ScreenshotGamedetialBean screenshotGamedetialBean = this.f45821d.get(i4);
        bVar.f45824c.setText(screenshotGamedetialBean.getTitle());
        TextView textView = bVar.f45823b;
        textView.setText(screenshotGamedetialBean.getCount() + "");
        MyImageLoader.e(bVar.f45822a, R.drawable.rect_normal_icon, screenshotGamedetialBean.getPic(), r.c.f11300g);
        return view;
    }

    public t0(Context context, List<ScreenshotGamedetialBean> list) {
        this.f45821d = new ArrayList();
        this.f45819b = context;
        this.f45820c = LayoutInflater.from(context);
        this.f45821d = list;
    }
}
