package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.photoviewer.MultiTouchViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CustomCircleProgressBar;
import me.relex.circleindicator.CircleIndicator;
/* loaded from: classes3.dex */
public final class HomePopupAdqwActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21467b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f21468c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21469d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f21470e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f21471f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final CircleIndicator f21472g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f21473h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f21474i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f21475j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final CustomCircleProgressBar f21476k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final MultiTouchViewPager f21477l;

    private HomePopupAdqwActivityBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull CircleIndicator circleIndicator, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout2, @NonNull CustomCircleProgressBar customCircleProgressBar, @NonNull MultiTouchViewPager multiTouchViewPager) {
        this.f21467b = linearLayout;
        this.f21468c = imageView;
        this.f21469d = textView;
        this.f21470e = relativeLayout;
        this.f21471f = view;
        this.f21472g = circleIndicator;
        this.f21473h = textView2;
        this.f21474i = simpleDraweeView;
        this.f21475j = linearLayout2;
        this.f21476k = customCircleProgressBar;
        this.f21477l = multiTouchViewPager;
    }

    @NonNull
    public static HomePopupAdqwActivityBinding bind(@NonNull View view) {
        int i4 = R.id.close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.close);
        if (imageView != null) {
            i4 = R.id.downFileName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.downFileName);
            if (textView != null) {
                i4 = R.id.downLoadlayout;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.downLoadlayout);
                if (relativeLayout != null) {
                    i4 = R.id.holder;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.holder);
                    if (findChildViewById != null) {
                        i4 = R.id.indicator;
                        CircleIndicator circleIndicator = (CircleIndicator) ViewBindings.findChildViewById(view, R.id.indicator);
                        if (circleIndicator != null) {
                            i4 = R.id.install;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.install);
                            if (textView2 != null) {
                                i4 = R.id.more;
                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.more);
                                if (simpleDraweeView != null) {
                                    LinearLayout linearLayout = (LinearLayout) view;
                                    i4 = R.id.progressBar;
                                    CustomCircleProgressBar customCircleProgressBar = (CustomCircleProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                    if (customCircleProgressBar != null) {
                                        i4 = R.id.viewPager;
                                        MultiTouchViewPager multiTouchViewPager = (MultiTouchViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                                        if (multiTouchViewPager != null) {
                                            return new HomePopupAdqwActivityBinding(linearLayout, imageView, textView, relativeLayout, findChildViewById, circleIndicator, textView2, simpleDraweeView, linearLayout, customCircleProgressBar, multiTouchViewPager);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static HomePopupAdqwActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21467b;
    }

    @NonNull
    public static HomePopupAdqwActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.home_popup_adqw_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
