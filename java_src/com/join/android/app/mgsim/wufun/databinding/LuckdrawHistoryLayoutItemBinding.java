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
public final class LuckdrawHistoryLayoutItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23619b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f23620c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23621d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23622e;

    private LuckdrawHistoryLayoutItemBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23619b = linearLayout;
        this.f23620c = linearLayout2;
        this.f23621d = textView;
        this.f23622e = textView2;
    }

    @NonNull
    public static LuckdrawHistoryLayoutItemBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.name;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.name);
        if (textView != null) {
            i4 = R.id.time;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.time);
            if (textView2 != null) {
                return new LuckdrawHistoryLayoutItemBinding(linearLayout, linearLayout, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LuckdrawHistoryLayoutItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23619b;
    }

    @NonNull
    public static LuckdrawHistoryLayoutItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.luckdraw_history_layout_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
