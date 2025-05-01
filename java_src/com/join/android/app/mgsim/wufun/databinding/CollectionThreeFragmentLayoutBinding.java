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
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MViewpagerV4;
/* loaded from: classes3.dex */
public final class CollectionThreeFragmentLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18057b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18058c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f18059d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final MViewpagerV4 f18060e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f18061f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18062g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18063h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18064i;

    private CollectionThreeFragmentLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull MViewpagerV4 mViewpagerV4, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f18057b = relativeLayout;
        this.f18058c = imageView;
        this.f18059d = linearLayout;
        this.f18060e = mViewpagerV4;
        this.f18061f = relativeLayout2;
        this.f18062g = textView;
        this.f18063h = textView2;
        this.f18064i = textView3;
    }

    @NonNull
    public static CollectionThreeFragmentLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.img_iconback;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_iconback);
        if (imageView != null) {
            i4 = R.id.lLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.lLayout);
            if (linearLayout != null) {
                i4 = R.id.mBottomVIewPager;
                MViewpagerV4 mViewpagerV4 = (MViewpagerV4) ViewBindings.findChildViewById(view, R.id.mBottomVIewPager);
                if (mViewpagerV4 != null) {
                    i4 = R.id.relateLayoutRight;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.relateLayoutRight);
                    if (relativeLayout != null) {
                        i4 = R.id.textViewPosition;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textViewPosition);
                        if (textView != null) {
                            i4 = R.id.textViewTime;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textViewTime);
                            if (textView2 != null) {
                                i4 = R.id.textViewTitle;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textViewTitle);
                                if (textView3 != null) {
                                    return new CollectionThreeFragmentLayoutBinding((RelativeLayout) view, imageView, linearLayout, mViewpagerV4, relativeLayout, textView, textView2, textView3);
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
    public static CollectionThreeFragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18057b;
    }

    @NonNull
    public static CollectionThreeFragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.collection_three_fragment_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
