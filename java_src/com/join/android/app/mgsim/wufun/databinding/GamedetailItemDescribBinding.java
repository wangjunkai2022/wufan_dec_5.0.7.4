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
public final class GamedetailItemDescribBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20531b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f20532c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f20533d;

    private GamedetailItemDescribBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f20531b = linearLayout;
        this.f20532c = textView;
        this.f20533d = textView2;
    }

    @NonNull
    public static GamedetailItemDescribBinding bind(@NonNull View view) {
        int i4 = R.id.htmlGameDescribe;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.htmlGameDescribe);
        if (textView != null) {
            i4 = R.id.textMore;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textMore);
            if (textView2 != null) {
                return new GamedetailItemDescribBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetailItemDescribBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20531b;
    }

    @NonNull
    public static GamedetailItemDescribBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_describ, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
