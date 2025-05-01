package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class CategoryCollectionRecomBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17674b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f17675c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f17676d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ViewPager f17677e;

    private CategoryCollectionRecomBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ViewPager viewPager) {
        this.f17674b = linearLayout;
        this.f17675c = relativeLayout;
        this.f17676d = textView;
        this.f17677e = viewPager;
    }

    @NonNull
    public static CategoryCollectionRecomBinding bind(@NonNull View view) {
        int i4 = R.id.relateLayout;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.relateLayout);
        if (relativeLayout != null) {
            i4 = R.id.textViewPosition;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textViewPosition);
            if (textView != null) {
                i4 = R.id.viewpager;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewpager);
                if (viewPager != null) {
                    return new CategoryCollectionRecomBinding((LinearLayout) view, relativeLayout, textView, viewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CategoryCollectionRecomBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17674b;
    }

    @NonNull
    public static CategoryCollectionRecomBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.category_collection_recom, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
