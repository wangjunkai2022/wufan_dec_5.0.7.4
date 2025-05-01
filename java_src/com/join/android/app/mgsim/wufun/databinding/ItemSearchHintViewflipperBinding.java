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
public final class ItemSearchHintViewflipperBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final TextView f22707b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22708c;

    private ItemSearchHintViewflipperBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.f22707b = textView;
        this.f22708c = textView2;
    }

    @NonNull
    public static ItemSearchHintViewflipperBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new ItemSearchHintViewflipperBinding(textView, textView);
    }

    @NonNull
    public static ItemSearchHintViewflipperBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public TextView getRoot() {
        return this.f22707b;
    }

    @NonNull
    public static ItemSearchHintViewflipperBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_search_hint_viewflipper, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
