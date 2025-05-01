package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.MyGameEditActivity;
import java.util.HashMap;
import java.util.List;
/* compiled from: MyGameEditAdapter.java */
/* loaded from: classes4.dex */
public class w2 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private List<DownloadTask> f45950b;

    /* renamed from: c  reason: collision with root package name */
    private Context f45951c;

    /* renamed from: d  reason: collision with root package name */
    public HashMap<Integer, Boolean> f45952d = new HashMap<>();

    /* compiled from: MyGameEditAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f45953b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f45954c;

        a(int i4, b bVar) {
            this.f45953b = i4;
            this.f45954c = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (w2.this.f45952d.get(Integer.valueOf(this.f45953b)).booleanValue()) {
                w2.this.f45952d.put(Integer.valueOf(this.f45953b), Boolean.FALSE);
                this.f45954c.f45956a.setSelected(false);
            } else {
                w2.this.f45952d.put(Integer.valueOf(this.f45953b), Boolean.TRUE);
                this.f45954c.f45956a.setSelected(true);
            }
            if (w2.this.f45951c instanceof MyGameEditActivity) {
                ((MyGameEditActivity) w2.this.f45951c).t0(w2.this.f45952d);
            }
        }
    }

    /* compiled from: MyGameEditAdapter.java */
    /* loaded from: classes4.dex */
    class b {

        /* renamed from: a  reason: collision with root package name */
        public ImageView f45956a;

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f45957b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f45958c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f45959d;

        /* renamed from: e  reason: collision with root package name */
        public LinearLayout f45960e;

        public b(View view) {
            this.f45957b = (SimpleDraweeView) view.findViewById(R.id.img);
            this.f45956a = (ImageView) view.findViewById(R.id.isSelector);
            this.f45958c = (TextView) view.findViewById(R.id.name);
            this.f45959d = (TextView) view.findViewById(R.id.appInfo);
            this.f45960e = (LinearLayout) view.findViewById(R.id.status);
        }
    }

    public w2(Context context, List<DownloadTask> list) {
        this.f45951c = context;
        this.f45950b = list;
        b();
    }

    private void b() {
        this.f45952d = new HashMap<>();
        for (int i4 = 0; i4 < this.f45950b.size(); i4++) {
            this.f45952d.put(Integer.valueOf(i4), Boolean.FALSE);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45950b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f45950b.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            view = LayoutInflater.from(this.f45951c).inflate(R.layout.layout_mygame_edit_item, (ViewGroup) null);
            bVar = new b(view);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        DownloadTask downloadTask = this.f45950b.get(i4);
        MyImageLoader.h(bVar.f45957b, downloadTask.getPortraitURL());
        Double.parseDouble(downloadTask.getShowSize());
        if (downloadTask.getExt1() != null && downloadTask.getExt1().equals("h5")) {
            bVar.f45960e.setVisibility(8);
        } else {
            UtilsMy.I(downloadTask.getScore(), downloadTask.getDown_count(), downloadTask.getShowSize(), downloadTask.getSp_tag_info(), downloadTask.getTipBeans(), bVar.f45960e, this.f45951c);
        }
        bVar.f45958c.setText(downloadTask.getShowName());
        bVar.f45959d.setText(downloadTask.getDescribe());
        bVar.f45956a.setSelected(this.f45952d.get(Integer.valueOf(i4)).booleanValue());
        view.setOnClickListener(new a(i4, bVar));
        return view;
    }
}
