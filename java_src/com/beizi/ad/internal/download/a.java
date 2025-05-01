package com.beizi.ad.internal.download;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.beizi.ad.R;
import com.beizi.ad.lance.a.i;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BeiZiExpandableListviewAdapter.java */
/* loaded from: classes2.dex */
public class a extends BaseExpandableListAdapter {

    /* renamed from: a  reason: collision with root package name */
    private Context f5864a;

    /* renamed from: b  reason: collision with root package name */
    private List<com.beizi.ad.internal.download.b> f5865b;

    /* compiled from: BeiZiExpandableListviewAdapter.java */
    /* renamed from: com.beizi.ad.internal.download.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0177a {

        /* renamed from: a  reason: collision with root package name */
        TextView f5866a;

        /* renamed from: b  reason: collision with root package name */
        BeiZiWebView f5867b;

        public C0177a() {
        }
    }

    /* compiled from: BeiZiExpandableListviewAdapter.java */
    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        TextView f5869a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f5870b;

        /* renamed from: c  reason: collision with root package name */
        View f5871c;

        public b() {
        }
    }

    public a(Context context, List<com.beizi.ad.internal.download.b> list) {
        ArrayList arrayList = new ArrayList();
        this.f5865b = arrayList;
        this.f5864a = context;
        arrayList.clear();
        this.f5865b.addAll(list);
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getChild(int i4, int i5) {
        return this.f5865b.get(i4).c();
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i4, int i5) {
        return i5;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i4, int i5, boolean z4, View view, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f5864a).inflate(R.layout.beizi_download_dialog_expand_child_item, (ViewGroup) null);
        C0177a c0177a = new C0177a();
        c0177a.f5866a = (TextView) inflate.findViewById(R.id.beizi_addeci_content_tv);
        c0177a.f5867b = (BeiZiWebView) inflate.findViewById(R.id.beizi_addeci_content_wb);
        inflate.setTag(c0177a);
        if ("text".equals(this.f5865b.get(i4).b())) {
            c0177a.f5866a.setVisibility(0);
            c0177a.f5867b.setVisibility(8);
            c0177a.f5866a.setText(this.f5865b.get(i4).c());
        } else if ("h5".equals(this.f5865b.get(i4).b())) {
            c0177a.f5866a.setVisibility(8);
            c0177a.f5867b.setVisibility(0);
            c0177a.f5867b.loadUrl(this.f5865b.get(i4).c(), i.a());
        }
        return inflate;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i4) {
        return 1;
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getGroup(int i4) {
        return this.f5865b.get(i4);
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        return this.f5865b.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i4) {
        return i4;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i4, boolean z4, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            view = LayoutInflater.from(this.f5864a).inflate(R.layout.beizi_download_dialog_expand_parent_item, (ViewGroup) null);
            bVar = new b();
            bVar.f5869a = (TextView) view.findViewById(R.id.beizi_addep_title_tv);
            bVar.f5870b = (ImageView) view.findViewById(R.id.beizi_addep_fold_iv);
            bVar.f5871c = view.findViewById(R.id.beizi_addep_item_divider_view);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        bVar.f5869a.setText(this.f5865b.get(i4).a());
        if (z4) {
            bVar.f5869a.setTextColor(Color.parseColor("#FF8E15"));
            bVar.f5870b.setBackgroundResource(R.mipmap.beizi_icon_arrow_unfold);
        } else {
            bVar.f5869a.setTextColor(Color.parseColor("#333333"));
            bVar.f5870b.setBackgroundResource(R.mipmap.beizi_icon_arrow_fold);
        }
        if (i4 == 0) {
            bVar.f5871c.setVisibility(8);
        } else {
            bVar.f5871c.setVisibility(0);
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i4, int i5) {
        return false;
    }
}
