package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemModGameRecommendExpandBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22458b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22459c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f22460d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f22461e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f22462f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ProgressBar f22463g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ConstraintLayout f22464h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f22465i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f22466j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f22467k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f22468l;

    private ItemModGameRecommendExpandBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f22458b = constraintLayout;
        this.f22459c = simpleDraweeView;
        this.f22460d = simpleDraweeView2;
        this.f22461e = imageView;
        this.f22462f = linearLayout;
        this.f22463g = progressBar;
        this.f22464h = constraintLayout2;
        this.f22465i = textView;
        this.f22466j = textView2;
        this.f22467k = textView3;
        this.f22468l = textView4;
    }

    @NonNull
    public static ItemModGameRecommendExpandBinding bind(@NonNull View view) {
        int i4 = R.id.ivGameIcon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivGameIcon);
        if (simpleDraweeView != null) {
            i4 = R.id.ivGamePoster;
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivGamePoster);
            if (simpleDraweeView2 != null) {
                i4 = R.id.ivIconTag;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivIconTag);
                if (imageView != null) {
                    i4 = R.id.llTag;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llTag);
                    if (linearLayout != null) {
                        i4 = R.id.progress;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progress);
                        if (progressBar != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i4 = R.id.tvGameName;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameName);
                            if (textView != null) {
                                i4 = R.id.tvOption;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvOption);
                                if (textView2 != null) {
                                    i4 = R.id.tvTag;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTag);
                                    if (textView3 != null) {
                                        i4 = R.id.tvTags;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTags);
                                        if (textView4 != null) {
                                            return new ItemModGameRecommendExpandBinding(constraintLayout, simpleDraweeView, simpleDraweeView2, imageView, linearLayout, progressBar, constraintLayout, textView, textView2, textView3, textView4);
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
    public static ItemModGameRecommendExpandBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22458b;
    }

    @NonNull
    public static ItemModGameRecommendExpandBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_mod_game_recommend_expand, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
