package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LuckdrawRuleLayoutItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23627b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23628c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f23629d;

    private LuckdrawRuleLayoutItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.f23627b = linearLayout;
        this.f23628c = textView;
        this.f23629d = linearLayout2;
    }

    @NonNull
    public static LuckdrawRuleLayoutItemBinding bind(@NonNull View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.describe);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new LuckdrawRuleLayoutItemBinding(linearLayout, textView, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.describe)));
    }

    @NonNull
    public static LuckdrawRuleLayoutItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23627b;
    }

    @NonNull
    public static LuckdrawRuleLayoutItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.luckdraw_rule_layout_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
