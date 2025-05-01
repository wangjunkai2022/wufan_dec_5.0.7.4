package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class PurchasedListItemOrderIdBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final TextView f26160b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26161c;

    private PurchasedListItemOrderIdBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.f26160b = textView;
        this.f26161c = textView2;
    }

    @NonNull
    public static PurchasedListItemOrderIdBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new PurchasedListItemOrderIdBinding(textView, textView);
    }

    @NonNull
    public static PurchasedListItemOrderIdBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public TextView getRoot() {
        return this.f26160b;
    }

    @NonNull
    public static PurchasedListItemOrderIdBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.purchased_list_item_order_id, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
