package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.photoviewer.MultiTouchViewPager;
import com.join.android.app.mgsim.wufun.R;
import me.relex.circleindicator.CircleIndicator;
/* loaded from: classes3.dex */
public final class InstallAppNoticeLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21581b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f21582c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CircleIndicator f21583d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21584e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f21585f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f21586g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final MultiTouchViewPager f21587h;

    private InstallAppNoticeLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull CircleIndicator circleIndicator, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout2, @NonNull MultiTouchViewPager multiTouchViewPager) {
        this.f21581b = linearLayout;
        this.f21582c = view;
        this.f21583d = circleIndicator;
        this.f21584e = textView;
        this.f21585f = simpleDraweeView;
        this.f21586g = linearLayout2;
        this.f21587h = multiTouchViewPager;
    }

    @NonNull
    public static InstallAppNoticeLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.holder;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.holder);
        if (findChildViewById != null) {
            i4 = R.id.indicator;
            CircleIndicator circleIndicator = (CircleIndicator) ViewBindings.findChildViewById(view, R.id.indicator);
            if (circleIndicator != null) {
                i4 = R.id.message;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.message);
                if (textView != null) {
                    i4 = R.id.more;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.more);
                    if (simpleDraweeView != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        i4 = R.id.viewPager;
                        MultiTouchViewPager multiTouchViewPager = (MultiTouchViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                        if (multiTouchViewPager != null) {
                            return new InstallAppNoticeLayoutBinding(linearLayout, findChildViewById, circleIndicator, textView, simpleDraweeView, linearLayout, multiTouchViewPager);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static InstallAppNoticeLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21581b;
    }

    @NonNull
    public static InstallAppNoticeLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.install_app_notice_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
