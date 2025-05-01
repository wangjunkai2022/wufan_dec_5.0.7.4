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
public final class LayoutSheetGameResourceItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23316b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f23317c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f23318d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23319e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23320f;

    private LayoutSheetGameResourceItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23316b = constraintLayout;
        this.f23317c = view;
        this.f23318d = imageView;
        this.f23319e = textView;
        this.f23320f = textView2;
    }

    @NonNull
    public static LayoutSheetGameResourceItemBinding bind(@NonNull View view) {
        int i4 = R.id.divider;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
        if (findChildViewById != null) {
            i4 = R.id.ivOut;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivOut);
            if (imageView != null) {
                i4 = R.id.tvGameName;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameName);
                if (textView != null) {
                    i4 = R.id.tvGameUrl;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameUrl);
                    if (textView2 != null) {
                        return new LayoutSheetGameResourceItemBinding((ConstraintLayout) view, findChildViewById, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutSheetGameResourceItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23316b;
    }

    @NonNull
    public static LayoutSheetGameResourceItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_sheet_game_resource_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
