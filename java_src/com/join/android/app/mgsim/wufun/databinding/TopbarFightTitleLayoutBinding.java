package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.SlidingTabLayout;
/* loaded from: classes3.dex */
public final class TopbarFightTitleLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26748b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SlidingTabLayout f26749c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f26750d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f26751e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f26752f;

    private TopbarFightTitleLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.f26748b = relativeLayout;
        this.f26749c = slidingTabLayout;
        this.f26750d = linearLayout;
        this.f26751e = imageView;
        this.f26752f = imageView2;
    }

    @NonNull
    public static TopbarFightTitleLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.mSlidingTabLayout;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, R.id.mSlidingTabLayout);
        if (slidingTabLayout != null) {
            i4 = R.id.searchImage;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.searchImage);
            if (linearLayout != null) {
                i4 = R.id.title_normal_download_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.title_normal_download_img);
                if (imageView != null) {
                    i4 = R.id.title_normal_search_img;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.title_normal_search_img);
                    if (imageView2 != null) {
                        return new TopbarFightTitleLayoutBinding((RelativeLayout) view, slidingTabLayout, linearLayout, imageView, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static TopbarFightTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26748b;
    }

    @NonNull
    public static TopbarFightTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.topbar_fight_title_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
