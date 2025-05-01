package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MViewpagerV4;
import com.join.mgps.customview.SlidingTabLayout;
/* loaded from: classes3.dex */
public final class MyGameLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25307b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f25308c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f25309d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SlidingTabLayout f25310e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final MViewpagerV4 f25311f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TopbarFilterTitleLayoutBinding f25312g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f25313h;

    private MyGameLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull MViewpagerV4 mViewpagerV4, @NonNull TopbarFilterTitleLayoutBinding topbarFilterTitleLayoutBinding, @NonNull View view2) {
        this.f25307b = relativeLayout;
        this.f25308c = view;
        this.f25309d = linearLayout;
        this.f25310e = slidingTabLayout;
        this.f25311f = mViewpagerV4;
        this.f25312g = topbarFilterTitleLayoutBinding;
        this.f25313h = view2;
    }

    @NonNull
    public static MyGameLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.lineTop;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.lineTop);
        if (findChildViewById != null) {
            i4 = R.id.linearLayoutMain;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayoutMain);
            if (linearLayout != null) {
                i4 = R.id.mSlidingTabLayout;
                SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, R.id.mSlidingTabLayout);
                if (slidingTabLayout != null) {
                    i4 = R.id.mViewpagerV4;
                    MViewpagerV4 mViewpagerV4 = (MViewpagerV4) ViewBindings.findChildViewById(view, R.id.mViewpagerV4);
                    if (mViewpagerV4 != null) {
                        i4 = R.id.title_bar_layout;
                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.title_bar_layout);
                        if (findChildViewById2 != null) {
                            TopbarFilterTitleLayoutBinding bind = TopbarFilterTitleLayoutBinding.bind(findChildViewById2);
                            i4 = R.id.viewBg;
                            View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.viewBg);
                            if (findChildViewById3 != null) {
                                return new MyGameLayoutBinding((RelativeLayout) view, findChildViewById, linearLayout, slidingTabLayout, mViewpagerV4, bind, findChildViewById3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MyGameLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25307b;
    }

    @NonNull
    public static MyGameLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.my_game_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
