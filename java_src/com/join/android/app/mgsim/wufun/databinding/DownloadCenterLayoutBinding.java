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
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.SlidingTabLayoutDownloadCenter;
/* loaded from: classes3.dex */
public final class DownloadCenterLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19146b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19147c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19148d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f19149e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ViewPager f19150f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19151g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f19152h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SlidingTabLayoutDownloadCenter f19153i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f19154j;

    private DownloadCenterLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2, @NonNull ViewPager viewPager, @NonNull TextView textView3, @NonNull LinearLayout linearLayout3, @NonNull SlidingTabLayoutDownloadCenter slidingTabLayoutDownloadCenter, @NonNull TextView textView4) {
        this.f19146b = linearLayout;
        this.f19147c = textView;
        this.f19148d = textView2;
        this.f19149e = linearLayout2;
        this.f19150f = viewPager;
        this.f19151g = textView3;
        this.f19152h = linearLayout3;
        this.f19153i = slidingTabLayoutDownloadCenter;
        this.f19154j = textView4;
    }

    @NonNull
    public static DownloadCenterLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.downMessage;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.downMessage);
        if (textView != null) {
            i4 = R.id.goVip;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.goVip);
            if (textView2 != null) {
                i4 = R.id.isVip;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.isVip);
                if (linearLayout != null) {
                    i4 = R.id.mViewpagerV4;
                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.mViewpagerV4);
                    if (viewPager != null) {
                        i4 = R.id.notMessage;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.notMessage);
                        if (textView3 != null) {
                            i4 = R.id.notVip;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.notVip);
                            if (linearLayout2 != null) {
                                i4 = R.id.pageIndicator;
                                SlidingTabLayoutDownloadCenter slidingTabLayoutDownloadCenter = (SlidingTabLayoutDownloadCenter) ViewBindings.findChildViewById(view, R.id.pageIndicator);
                                if (slidingTabLayoutDownloadCenter != null) {
                                    i4 = R.id.speedText;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.speedText);
                                    if (textView4 != null) {
                                        return new DownloadCenterLayoutBinding((LinearLayout) view, textView, textView2, linearLayout, viewPager, textView3, linearLayout2, slidingTabLayoutDownloadCenter, textView4);
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
    public static DownloadCenterLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19146b;
    }

    @NonNull
    public static DownloadCenterLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.download_center_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
