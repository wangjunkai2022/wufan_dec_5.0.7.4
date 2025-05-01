package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class UpdateFeatureDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26837b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f26838c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26839d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26840e;

    private UpdateFeatureDialogBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f26837b = constraintLayout;
        this.f26838c = recyclerView;
        this.f26839d = textView;
        this.f26840e = textView2;
    }

    @NonNull
    public static UpdateFeatureDialogBinding bind(@NonNull View view) {
        int i4 = R.id.appList;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.appList);
        if (recyclerView != null) {
            i4 = R.id.describ;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.describ);
            if (textView != null) {
                i4 = R.id.tvClose;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvClose);
                if (textView2 != null) {
                    return new UpdateFeatureDialogBinding((ConstraintLayout) view, recyclerView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static UpdateFeatureDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26837b;
    }

    @NonNull
    public static UpdateFeatureDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.update_feature_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
