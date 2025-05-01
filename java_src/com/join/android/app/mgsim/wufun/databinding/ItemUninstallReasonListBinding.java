package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemUninstallReasonListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22901b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f22902c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22903d;

    private ItemUninstallReasonListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f22901b = constraintLayout;
        this.f22902c = imageView;
        this.f22903d = textView;
    }

    @NonNull
    public static ItemUninstallReasonListBinding bind(@NonNull View view) {
        int i4 = R.id.ivCheck;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivCheck);
        if (imageView != null) {
            i4 = R.id.tvReason;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvReason);
            if (textView != null) {
                return new ItemUninstallReasonListBinding((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemUninstallReasonListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22901b;
    }

    @NonNull
    public static ItemUninstallReasonListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_uninstall_reason_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
