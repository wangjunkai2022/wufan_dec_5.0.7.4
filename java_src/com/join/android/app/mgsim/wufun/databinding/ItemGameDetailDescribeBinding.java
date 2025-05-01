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
public final class ItemGameDetailDescribeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22257b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f22258c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f22259d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f22260e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22261f;

    private ItemGameDetailDescribeBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.f22257b = linearLayout;
        this.f22258c = imageView;
        this.f22259d = imageView2;
        this.f22260e = linearLayout2;
        this.f22261f = textView;
    }

    @NonNull
    public static ItemGameDetailDescribeBinding bind(@NonNull View view) {
        int i4 = R.id.iv_list;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_list);
        if (imageView != null) {
            i4 = R.id.iv_pc;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_pc);
            if (imageView2 != null) {
                i4 = R.id.ll_more;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_more);
                if (linearLayout != null) {
                    i4 = R.id.tv_text;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_text);
                    if (textView != null) {
                        return new ItemGameDetailDescribeBinding((LinearLayout) view, imageView, imageView2, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemGameDetailDescribeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22257b;
    }

    @NonNull
    public static ItemGameDetailDescribeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_game_detail_describe, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
