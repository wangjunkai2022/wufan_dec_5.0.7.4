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
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ScreenshortBigimagLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26294b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26295c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f26296d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26297e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26298f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26299g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ViewPager f26300h;

    private ScreenshortBigimagLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ViewPager viewPager) {
        this.f26294b = relativeLayout;
        this.f26295c = imageView;
        this.f26296d = linearLayout;
        this.f26297e = textView;
        this.f26298f = textView2;
        this.f26299g = textView3;
        this.f26300h = viewPager;
    }

    @NonNull
    public static ScreenshortBigimagLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
        if (imageView != null) {
            i4 = R.id.bottomLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.bottomLayout);
            if (linearLayout != null) {
                i4 = R.id.message;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.message);
                if (textView != null) {
                    i4 = R.id.nameAndDate;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.nameAndDate);
                    if (textView2 != null) {
                        i4 = R.id.positionShow;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.positionShow);
                        if (textView3 != null) {
                            i4 = R.id.viewPager;
                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                            if (viewPager != null) {
                                return new ScreenshortBigimagLayoutBinding((RelativeLayout) view, imageView, linearLayout, textView, textView2, textView3, viewPager);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ScreenshortBigimagLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26294b;
    }

    @NonNull
    public static ScreenshortBigimagLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.screenshort_bigimag_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
