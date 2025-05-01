package com.join.mgps.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.dto.CollectionBeanSub;
import java.util.List;
/* compiled from: PaPaGameInfoAdapter.java */
/* loaded from: classes4.dex */
public class a3 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private List<Object> f44194b;

    /* compiled from: PaPaGameInfoAdapter.java */
    /* loaded from: classes4.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f44195a;

        /* renamed from: b  reason: collision with root package name */
        TextView f44196b;

        /* renamed from: c  reason: collision with root package name */
        LinearLayout f44197c;

        /* renamed from: d  reason: collision with root package name */
        TextView f44198d;

        a() {
        }
    }

    public a3(List<Object> list) {
        this.f44194b = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44194b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f44194b.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_papa_gameinfo, (ViewGroup) null);
            aVar = new a();
            aVar.f44195a = (SimpleDraweeView) view.findViewById(R.id.icon);
            aVar.f44198d = (TextView) view.findViewById(R.id.appDesc);
            aVar.f44197c = (LinearLayout) view.findViewById(R.id.tipsLayout);
            aVar.f44196b = (TextView) view.findViewById(R.id.appName);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        Object obj = this.f44194b.get(i4);
        if (obj instanceof DownloadTask) {
            DownloadTask downloadTask = (DownloadTask) obj;
            MyImageLoader.h(aVar.f44195a, downloadTask.getPortraitURL());
            Double.parseDouble(downloadTask.getShowSize());
            UtilsMy.I(downloadTask.getScore(), downloadTask.getDown_count(), downloadTask.getShowSize(), downloadTask.getSp_tag_info(), downloadTask.getTipBeans(), aVar.f44197c, viewGroup.getContext());
            aVar.f44196b.setText(downloadTask.getShowName());
            aVar.f44198d.setText(downloadTask.getDescribe());
        } else if (obj instanceof CollectionBeanSub) {
            CollectionBeanSub collectionBeanSub = (CollectionBeanSub) obj;
            MyImageLoader.h(aVar.f44195a, collectionBeanSub.getIco_remote());
            Double.parseDouble(collectionBeanSub.getSize());
            UtilsMy.I(collectionBeanSub.getScore(), collectionBeanSub.getDown_count(), collectionBeanSub.getSize(), collectionBeanSub.getSp_tag_info(), collectionBeanSub.getTag_info(), aVar.f44197c, viewGroup.getContext());
            aVar.f44196b.setText(collectionBeanSub.getGame_name());
            aVar.f44198d.setText(collectionBeanSub.getInfo());
        }
        return view;
    }
}
