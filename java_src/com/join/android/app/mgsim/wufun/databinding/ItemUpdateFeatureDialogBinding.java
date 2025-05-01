package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemUpdateFeatureDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22909b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f22910c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22911d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22912e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22913f;

    private ItemUpdateFeatureDialogBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f22909b = constraintLayout;
        this.f22910c = view;
        this.f22911d = textView;
        this.f22912e = textView2;
        this.f22913f = textView3;
    }

    @NonNull
    public static ItemUpdateFeatureDialogBinding bind(@NonNull View view) {
        int i4 = R.id.divider;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
        if (findChildViewById != null) {
            i4 = R.id.tvBtn;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBtn);
            if (textView != null) {
                i4 = R.id.tvSubTitle;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSubTitle);
                if (textView2 != null) {
                    i4 = R.id.tvTitle;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                    if (textView3 != null) {
                        return new ItemUpdateFeatureDialogBinding((ConstraintLayout) view, findChildViewById, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemUpdateFeatureDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22909b;
    }

    @NonNull
    public static ItemUpdateFeatureDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_update_feature_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
