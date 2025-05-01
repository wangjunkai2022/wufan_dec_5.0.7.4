package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.UploadDialogBean;
import java.util.List;
/* compiled from: UploadListAdapter.java */
/* loaded from: classes4.dex */
public class e6 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    Context f44352b;

    /* renamed from: c  reason: collision with root package name */
    List<UploadDialogBean> f44353c;

    public e6(Context context, List<UploadDialogBean> list) {
        this.f44352b = context;
        this.f44353c = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44353c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f44353c.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f44352b).inflate(R.layout.upload_dialog_item, (ViewGroup) null);
        }
        ((TextView) view.findViewById(R.id.name)).setText(this.f44353c.get(i4).getName());
        if (this.f44353c.get(i4).getIsSelect().booleanValue()) {
            ((ImageView) view.findViewById(R.id.img)).setImageResource(R.drawable.downpath_show_selected);
        } else {
            ((ImageView) view.findViewById(R.id.img)).setImageResource(R.drawable.downpath_show_normal);
        }
        return view;
    }
}
