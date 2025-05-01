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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemGameDetailBtRankingTagBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22185b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f22186c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f22187d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22188e;

    private ItemGameDetailBtRankingTagBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView) {
        this.f22185b = linearLayout;
        this.f22186c = imageView;
        this.f22187d = imageView2;
        this.f22188e = textView;
    }

    @NonNull
    public static ItemGameDetailBtRankingTagBinding bind(@NonNull View view) {
        int i4 = R.id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon);
        if (imageView != null) {
            i4 = R.id.iv_more;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_more);
            if (imageView2 != null) {
                i4 = R.id.tv_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                if (textView != null) {
                    return new ItemGameDetailBtRankingTagBinding((LinearLayout) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemGameDetailBtRankingTagBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22185b;
    }

    @NonNull
    public static ItemGameDetailBtRankingTagBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_game_detail_bt_ranking_tag, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
