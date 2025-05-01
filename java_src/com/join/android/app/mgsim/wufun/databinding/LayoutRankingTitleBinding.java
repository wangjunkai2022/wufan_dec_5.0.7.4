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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutRankingTitleBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23295b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f23296c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23297d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f23298e;

    private LayoutRankingTitleBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout) {
        this.f23295b = linearLayout;
        this.f23296c = view;
        this.f23297d = textView;
        this.f23298e = relativeLayout;
    }

    @NonNull
    public static LayoutRankingTitleBinding bind(@NonNull View view) {
        int i4 = R.id.line;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
        if (findChildViewById != null) {
            i4 = R.id.ranking_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.ranking_title);
            if (textView != null) {
                i4 = R.id.ranking_title_right_rl;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.ranking_title_right_rl);
                if (relativeLayout != null) {
                    return new LayoutRankingTitleBinding((LinearLayout) view, findChildViewById, textView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutRankingTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23295b;
    }

    @NonNull
    public static LayoutRankingTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_ranking_title, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
