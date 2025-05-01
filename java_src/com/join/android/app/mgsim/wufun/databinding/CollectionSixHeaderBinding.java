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
/* loaded from: classes3.dex */
public final class CollectionSixHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18049b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f18050c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ViewPager f18051d;

    private CollectionSixHeaderBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull ViewPager viewPager) {
        this.f18049b = relativeLayout;
        this.f18050c = relativeLayout2;
        this.f18051d = viewPager;
    }

    @NonNull
    public static CollectionSixHeaderBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.view_pager);
        if (viewPager != null) {
            return new CollectionSixHeaderBinding(relativeLayout, relativeLayout, viewPager);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.view_pager)));
    }

    @NonNull
    public static CollectionSixHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18049b;
    }

    @NonNull
    public static CollectionSixHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.collection_six_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
