package com.join.mgps.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.BannerImage;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public class BannerImageAdapter2 extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private String f39761a = getClass().getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private Context f39762b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<BannerImage> f39763c;

    /* renamed from: d  reason: collision with root package name */
    int f39764d;

    public BannerImageAdapter2(Context context, ArrayList<BannerImage> arrayList) {
        ArrayList<BannerImage> arrayList2 = new ArrayList<>();
        this.f39763c = arrayList2;
        this.f39762b = context;
        arrayList2.clear();
        this.f39763c.addAll(arrayList);
    }

    public void b(ArrayList<BannerImage> arrayList) {
        ArrayList<BannerImage> arrayList2 = this.f39763c;
        if (arrayList2 == null) {
            this.f39763c = new ArrayList<>();
        } else {
            arrayList2.clear();
        }
        this.f39763c.addAll(arrayList);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f39763c.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i4) {
        ArrayList<BannerImage> arrayList = this.f39763c;
        if (arrayList != null && arrayList.size() != 0) {
            BannerImage bannerImage = this.f39763c.get(i4);
            SimpleDraweeView imageView = bannerImage.getImageView();
            try {
                ViewGroup viewGroup2 = (ViewGroup) imageView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(imageView);
                }
                imageView = bannerImage.getImageView();
                MyImageLoader.e(imageView, R.drawable.banner_normal_icon, bannerImage.getUrl(), r.c.f11300g);
                viewGroup.addView(imageView);
                return imageView;
            } catch (Exception e5) {
                e5.printStackTrace();
                return imageView;
            }
        }
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(this.f39762b);
        MyImageLoader.h(simpleDraweeView, "http://xxx.com");
        return simpleDraweeView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        super.startUpdate(viewGroup);
    }
}
