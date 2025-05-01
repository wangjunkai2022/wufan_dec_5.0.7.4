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
public final class ItemGameDetailSimilarGameTagBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22280b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f22281c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22282d;

    private ItemGameDetailSimilarGameTagBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f22280b = linearLayout;
        this.f22281c = imageView;
        this.f22282d = textView;
    }

    @NonNull
    public static ItemGameDetailSimilarGameTagBinding bind(@NonNull View view) {
        int i4 = R.id.iv_label;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_label);
        if (imageView != null) {
            i4 = R.id.tv_text;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_text);
            if (textView != null) {
                return new ItemGameDetailSimilarGameTagBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemGameDetailSimilarGameTagBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22280b;
    }

    @NonNull
    public static ItemGameDetailSimilarGameTagBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_game_detail_similar_game_tag, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
