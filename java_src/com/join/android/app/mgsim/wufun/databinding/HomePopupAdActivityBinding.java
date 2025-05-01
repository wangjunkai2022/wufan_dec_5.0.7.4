package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.photoviewer.MultiTouchViewPager;
import com.join.android.app.mgsim.wufun.R;
import me.relex.circleindicator.CircleIndicator;
/* loaded from: classes3.dex */
public final class HomePopupAdActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21456b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f21457c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CircleIndicator f21458d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f21459e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f21460f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final MultiTouchViewPager f21461g;

    private HomePopupAdActivityBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull CircleIndicator circleIndicator, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout2, @NonNull MultiTouchViewPager multiTouchViewPager) {
        this.f21456b = linearLayout;
        this.f21457c = view;
        this.f21458d = circleIndicator;
        this.f21459e = simpleDraweeView;
        this.f21460f = linearLayout2;
        this.f21461g = multiTouchViewPager;
    }

    @NonNull
    public static HomePopupAdActivityBinding bind(@NonNull View view) {
        int i4 = R.id.holder;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.holder);
        if (findChildViewById != null) {
            i4 = R.id.indicator;
            CircleIndicator circleIndicator = (CircleIndicator) ViewBindings.findChildViewById(view, R.id.indicator);
            if (circleIndicator != null) {
                i4 = R.id.more;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.more);
                if (simpleDraweeView != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i4 = R.id.viewPager;
                    MultiTouchViewPager multiTouchViewPager = (MultiTouchViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                    if (multiTouchViewPager != null) {
                        return new HomePopupAdActivityBinding(linearLayout, findChildViewById, circleIndicator, simpleDraweeView, linearLayout, multiTouchViewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static HomePopupAdActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21456b;
    }

    @NonNull
    public static HomePopupAdActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.home_popup_ad_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
