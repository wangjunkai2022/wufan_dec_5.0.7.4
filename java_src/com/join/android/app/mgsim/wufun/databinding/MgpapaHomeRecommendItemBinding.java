package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgpapaHomeRecommendItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24743b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f24744c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f24745d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f24746e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f24747f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f24748g;

    private MgpapaHomeRecommendItemBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f24743b = linearLayout;
        this.f24744c = frameLayout;
        this.f24745d = simpleDraweeView;
        this.f24746e = progressBar;
        this.f24747f = textView;
        this.f24748g = textView2;
    }

    @NonNull
    public static MgpapaHomeRecommendItemBinding bind(@NonNull View view) {
        int i4 = R.id.flBtn;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.flBtn);
        if (frameLayout != null) {
            i4 = R.id.ivGameIcon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivGameIcon);
            if (simpleDraweeView != null) {
                i4 = R.id.loading_progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.loading_progress);
                if (progressBar != null) {
                    i4 = R.id.tvBtn;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBtn);
                    if (textView != null) {
                        i4 = R.id.tvGameName;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameName);
                        if (textView2 != null) {
                            return new MgpapaHomeRecommendItemBinding((LinearLayout) view, frameLayout, simpleDraweeView, progressBar, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgpapaHomeRecommendItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24743b;
    }

    @NonNull
    public static MgpapaHomeRecommendItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mgpapa_home_recommend_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
