package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dto.AppBeanMain;
import com.join.mgps.dto.RecomDatabean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MGpapaMainGalleryAdapter.java */
/* loaded from: classes4.dex */
public class z1 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f46104b;

    /* renamed from: c  reason: collision with root package name */
    private List<RecomDatabean> f46105c;

    /* compiled from: MGpapaMainGalleryAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabean f46106b;

        a(RecomDatabean recomDatabean) {
            this.f46106b = recomDatabean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<AppBeanMain> sub = this.f46106b.getSub();
            if (sub == null || sub.size() <= 0) {
                return;
            }
            IntentUtil.getInstance().intentActivity(z1.this.f46104b, sub.get(0).getIntentDataBean());
        }
    }

    public z1(Context context, List<RecomDatabean> list) {
        this.f46104b = context;
        if (list == null) {
            this.f46105c = new ArrayList();
        } else {
            this.f46105c = list;
        }
    }

    public void b(List<RecomDatabean> list) {
        if (list == null) {
            this.f46105c = new ArrayList();
        } else {
            this.f46105c = list;
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f46105c.size() == 0 ? 0 : Integer.MAX_VALUE;
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
        if (view == null) {
            view = LayoutInflater.from(this.f46104b).inflate(R.layout.mgpapamain_gallery_item, viewGroup, false);
        }
        List<RecomDatabean> list = this.f46105c;
        RecomDatabean recomDatabean = list.get(i4 % list.size());
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) com.join.mgps.Util.s2.a(view, R.id.intersting_itemback);
        MyImageLoader.h(simpleDraweeView, recomDatabean.getMain().getPic_remote());
        simpleDraweeView.setOnClickListener(new a(recomDatabean));
        return view;
    }
}
