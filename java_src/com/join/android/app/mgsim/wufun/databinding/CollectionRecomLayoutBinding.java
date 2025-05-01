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
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class CollectionRecomLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18046b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f18047c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ViewPager f18048d;

    private CollectionRecomLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull ViewPager viewPager) {
        this.f18046b = linearLayout;
        this.f18047c = relativeLayout;
        this.f18048d = viewPager;
    }

    @NonNull
    public static CollectionRecomLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.relateLayout;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.relateLayout);
        if (relativeLayout != null) {
            i4 = R.id.viewpager;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewpager);
            if (viewPager != null) {
                return new CollectionRecomLayoutBinding((LinearLayout) view, relativeLayout, viewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CollectionRecomLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18046b;
    }

    @NonNull
    public static CollectionRecomLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.collection_recom_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
