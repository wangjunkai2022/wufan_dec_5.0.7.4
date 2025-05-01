package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import me.relex.circleindicator.CircleIndicator;
/* loaded from: classes3.dex */
public final class AppdownFinishActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f17426b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CircleIndicator f17427c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f17428d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ViewPager f17429e;

    private AppdownFinishActivityBinding(@NonNull RelativeLayout relativeLayout, @NonNull CircleIndicator circleIndicator, @NonNull RelativeLayout relativeLayout2, @NonNull ViewPager viewPager) {
        this.f17426b = relativeLayout;
        this.f17427c = circleIndicator;
        this.f17428d = relativeLayout2;
        this.f17429e = viewPager;
    }

    @NonNull
    public static AppdownFinishActivityBinding bind(@NonNull View view) {
        int i4 = R.id.indicator;
        CircleIndicator circleIndicator = (CircleIndicator) ViewBindings.findChildViewById(view, R.id.indicator);
        if (circleIndicator != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
            if (viewPager != null) {
                return new AppdownFinishActivityBinding(relativeLayout, circleIndicator, relativeLayout, viewPager);
            }
            i4 = R.id.viewPager;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static AppdownFinishActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f17426b;
    }

    @NonNull
    public static AppdownFinishActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.appdown_finish_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
