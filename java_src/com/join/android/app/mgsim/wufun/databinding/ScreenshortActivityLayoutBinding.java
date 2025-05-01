package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.screenshot.SlidingTabLayoutScreenShort;
/* loaded from: classes3.dex */
public final class ScreenshortActivityLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26288b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26289c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SlidingTabLayoutScreenShort f26290d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26291e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26292f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ViewPager f26293g;

    private ScreenshortActivityLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull SlidingTabLayoutScreenShort slidingTabLayoutScreenShort, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ViewPager viewPager) {
        this.f26288b = linearLayout;
        this.f26289c = imageView;
        this.f26290d = slidingTabLayoutScreenShort;
        this.f26291e = textView;
        this.f26292f = textView2;
        this.f26293g = viewPager;
    }

    @NonNull
    public static ScreenshortActivityLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
        if (imageView != null) {
            i4 = R.id.tableLayout;
            SlidingTabLayoutScreenShort slidingTabLayoutScreenShort = (SlidingTabLayoutScreenShort) ViewBindings.findChildViewById(view, R.id.tableLayout);
            if (slidingTabLayoutScreenShort != null) {
                i4 = R.id.title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                if (textView != null) {
                    i4 = R.id.upload;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.upload);
                    if (textView2 != null) {
                        i4 = R.id.viewpager;
                        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewpager);
                        if (viewPager != null) {
                            return new ScreenshortActivityLayoutBinding((LinearLayout) view, imageView, slidingTabLayoutScreenShort, textView, textView2, viewPager);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ScreenshortActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26288b;
    }

    @NonNull
    public static ScreenshortActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.screenshort_activity_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
