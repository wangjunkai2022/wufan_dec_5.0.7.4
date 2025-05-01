package com.join.mgps.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dto.AppBeanMain;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.RecomDatabean;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class MGpapaMainViewPagerAdapter extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private Context f43739a;

    /* renamed from: b  reason: collision with root package name */
    private List<RecomDatabean> f43740b;

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabean f43741b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43742c;

        a(RecomDatabean recomDatabean, int i4) {
            this.f43741b = recomDatabean;
            this.f43742c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<AppBeanMain> sub = this.f43741b.getSub();
            if (sub == null || sub.size() <= 0) {
                return;
            }
            IntentDateBean intentDataBean = sub.get(0).getIntentDataBean();
            intentDataBean.setExtBean(new ExtBean("home", "6-1-" + (this.f43742c + 1)));
            IntentUtil.getInstance().intentActivity(MGpapaMainViewPagerAdapter.this.f43739a, intentDataBean);
        }
    }

    public MGpapaMainViewPagerAdapter(Context context, List<RecomDatabean> list) {
        this.f43739a = context;
        if (list == null) {
            this.f43740b = new ArrayList();
        } else {
            this.f43740b = list;
        }
    }

    public void c(List<RecomDatabean> list) {
        if (list == null) {
            this.f43740b = new ArrayList();
        } else {
            this.f43740b = list;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f43740b.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i4) {
        if (this.f43740b.size() == 0) {
            return null;
        }
        int size = i4 % this.f43740b.size();
        if (size < 0) {
            size += this.f43740b.size();
        }
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(this.f43739a);
        simpleDraweeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        simpleDraweeView.setScaleType(ImageView.ScaleType.FIT_XY);
        simpleDraweeView.setPadding(com.join.mgps.Util.c0.a(this.f43739a, 10.0f), 0, com.join.mgps.Util.c0.a(this.f43739a, 10.0f), 0);
        RecomDatabean recomDatabean = this.f43740b.get(size);
        MyImageLoader.h(simpleDraweeView, recomDatabean.getMain().getPic_remote());
        ViewParent parent = simpleDraweeView.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(simpleDraweeView);
            MyImageLoader.h(simpleDraweeView, recomDatabean.getMain().getPic_remote());
        }
        simpleDraweeView.setOnClickListener(new a(recomDatabean, size));
        viewGroup.addView(simpleDraweeView);
        return simpleDraweeView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
