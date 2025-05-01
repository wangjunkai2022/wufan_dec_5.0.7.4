package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MViewpagerV4;
import com.join.mgps.customview.SlidingTabLayoutGameDetailImage;
/* loaded from: classes3.dex */
public final class BtGamedetailItemImgNaviBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f17581b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f17582c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SlidingTabLayoutGameDetailImage f17583d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final MViewpagerV4 f17584e;

    private BtGamedetailItemImgNaviBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull SlidingTabLayoutGameDetailImage slidingTabLayoutGameDetailImage, @NonNull MViewpagerV4 mViewpagerV4) {
        this.f17581b = constraintLayout;
        this.f17582c = view;
        this.f17583d = slidingTabLayoutGameDetailImage;
        this.f17584e = mViewpagerV4;
    }

    @NonNull
    public static BtGamedetailItemImgNaviBinding bind(@NonNull View view) {
        int i4 = R.id.bottomLine;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.bottomLine);
        if (findChildViewById != null) {
            i4 = R.id.tabLayout1;
            SlidingTabLayoutGameDetailImage slidingTabLayoutGameDetailImage = (SlidingTabLayoutGameDetailImage) ViewBindings.findChildViewById(view, R.id.tabLayout1);
            if (slidingTabLayoutGameDetailImage != null) {
                i4 = R.id.viewPager1;
                MViewpagerV4 mViewpagerV4 = (MViewpagerV4) ViewBindings.findChildViewById(view, R.id.viewPager1);
                if (mViewpagerV4 != null) {
                    return new BtGamedetailItemImgNaviBinding((ConstraintLayout) view, findChildViewById, slidingTabLayoutGameDetailImage, mViewpagerV4);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static BtGamedetailItemImgNaviBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f17581b;
    }

    @NonNull
    public static BtGamedetailItemImgNaviBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.bt_gamedetail_item_img_navi, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
