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
public final class ItemCreateEndGameBossBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21872b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21873c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21874d;

    private ItemCreateEndGameBossBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f21872b = linearLayout;
        this.f21873c = textView;
        this.f21874d = textView2;
    }

    @NonNull
    public static ItemCreateEndGameBossBinding bind(@NonNull View view) {
        int i4 = R.id.tv_sub_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sub_title);
        if (textView != null) {
            i4 = R.id.tv_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
            if (textView2 != null) {
                return new ItemCreateEndGameBossBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemCreateEndGameBossBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21872b;
    }

    @NonNull
    public static ItemCreateEndGameBossBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_create_end_game_boss, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
