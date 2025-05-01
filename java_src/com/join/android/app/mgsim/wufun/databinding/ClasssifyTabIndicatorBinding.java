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
public final class ClasssifyTabIndicatorBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final TextView f17902b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17903c;

    private ClasssifyTabIndicatorBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.f17902b = textView;
        this.f17903c = textView2;
    }

    @NonNull
    public static ClasssifyTabIndicatorBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new ClasssifyTabIndicatorBinding(textView, textView);
    }

    @NonNull
    public static ClasssifyTabIndicatorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public TextView getRoot() {
        return this.f17902b;
    }

    @NonNull
    public static ClasssifyTabIndicatorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.classsify_tab_indicator, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
