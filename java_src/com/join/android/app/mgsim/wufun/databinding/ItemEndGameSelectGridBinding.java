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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemEndGameSelectGridBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22078b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22079c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f22080d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22081e;

    private ItemEndGameSelectGridBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view, @NonNull TextView textView) {
        this.f22078b = constraintLayout;
        this.f22079c = simpleDraweeView;
        this.f22080d = view;
        this.f22081e = textView;
    }

    @NonNull
    public static ItemEndGameSelectGridBinding bind(@NonNull View view) {
        int i4 = R.id.ivIcon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivIcon);
        if (simpleDraweeView != null) {
            i4 = R.id.selector;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.selector);
            if (findChildViewById != null) {
                i4 = R.id.tvGameName;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameName);
                if (textView != null) {
                    return new ItemEndGameSelectGridBinding((ConstraintLayout) view, simpleDraweeView, findChildViewById, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemEndGameSelectGridBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22078b;
    }

    @NonNull
    public static ItemEndGameSelectGridBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_end_game_select_grid, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
