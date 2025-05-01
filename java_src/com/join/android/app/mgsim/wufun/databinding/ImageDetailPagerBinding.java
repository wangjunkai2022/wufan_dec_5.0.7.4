package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.photoviewer.MultiTouchViewPager;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ImageDetailPagerBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f21490b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21491c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21492d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final MultiTouchViewPager f21493e;

    private ImageDetailPagerBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull MultiTouchViewPager multiTouchViewPager) {
        this.f21490b = frameLayout;
        this.f21491c = textView;
        this.f21492d = textView2;
        this.f21493e = multiTouchViewPager;
    }

    @NonNull
    public static ImageDetailPagerBinding bind(@NonNull View view) {
        int i4 = R.id.bottomLayout;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.bottomLayout);
        if (textView != null) {
            i4 = R.id.indicator;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.indicator);
            if (textView2 != null) {
                i4 = R.id.pager;
                MultiTouchViewPager multiTouchViewPager = (MultiTouchViewPager) ViewBindings.findChildViewById(view, R.id.pager);
                if (multiTouchViewPager != null) {
                    return new ImageDetailPagerBinding((FrameLayout) view, textView, textView2, multiTouchViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ImageDetailPagerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f21490b;
    }

    @NonNull
    public static ImageDetailPagerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.image_detail_pager, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
