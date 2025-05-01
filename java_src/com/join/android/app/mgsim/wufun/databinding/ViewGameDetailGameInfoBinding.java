package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.papa91.arc.widget.htmltext.HtmlTextView;
/* loaded from: classes3.dex */
public final class ViewGameDetailGameInfoBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27048b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f27049c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f27050d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f27051e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final HtmlTextView f27052f;

    private ViewGameDetailGameInfoBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout, @NonNull HtmlTextView htmlTextView) {
        this.f27048b = linearLayout;
        this.f27049c = imageView;
        this.f27050d = imageView2;
        this.f27051e = relativeLayout;
        this.f27052f = htmlTextView;
    }

    @NonNull
    public static ViewGameDetailGameInfoBinding bind(@NonNull View view) {
        int i4 = R.id.iv_hot_type;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_hot_type);
        if (imageView != null) {
            i4 = R.id.iv_more;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_more);
            if (imageView2 != null) {
                i4 = R.id.rl_hot_rank;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_hot_rank);
                if (relativeLayout != null) {
                    i4 = R.id.tv_hot_title;
                    HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(view, R.id.tv_hot_title);
                    if (htmlTextView != null) {
                        return new ViewGameDetailGameInfoBinding((LinearLayout) view, imageView, imageView2, relativeLayout, htmlTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ViewGameDetailGameInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27048b;
    }

    @NonNull
    public static ViewGameDetailGameInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.view_game_detail_game_info, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
