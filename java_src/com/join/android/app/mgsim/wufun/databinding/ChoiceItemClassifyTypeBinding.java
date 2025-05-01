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
public final class ChoiceItemClassifyTypeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final TextView f17818b;

    private ChoiceItemClassifyTypeBinding(@NonNull TextView textView) {
        this.f17818b = textView;
    }

    @NonNull
    public static ChoiceItemClassifyTypeBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new ChoiceItemClassifyTypeBinding((TextView) view);
    }

    @NonNull
    public static ChoiceItemClassifyTypeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public TextView getRoot() {
        return this.f17818b;
    }

    @NonNull
    public static ChoiceItemClassifyTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.choice_item_classify_type, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
