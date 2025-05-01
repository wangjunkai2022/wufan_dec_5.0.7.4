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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LuckdrawPrizeLayoutItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23623b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f23624c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f23625d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23626e;

    private LuckdrawPrizeLayoutItemBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.f23623b = linearLayout;
        this.f23624c = simpleDraweeView;
        this.f23625d = linearLayout2;
        this.f23626e = textView;
    }

    @NonNull
    public static LuckdrawPrizeLayoutItemBinding bind(@NonNull View view) {
        int i4 = R.id.icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
        if (simpleDraweeView != null) {
            i4 = R.id.main;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main);
            if (linearLayout != null) {
                i4 = R.id.name;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                if (textView != null) {
                    return new LuckdrawPrizeLayoutItemBinding((LinearLayout) view, simpleDraweeView, linearLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LuckdrawPrizeLayoutItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23623b;
    }

    @NonNull
    public static LuckdrawPrizeLayoutItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.luckdraw_prize_layout_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
