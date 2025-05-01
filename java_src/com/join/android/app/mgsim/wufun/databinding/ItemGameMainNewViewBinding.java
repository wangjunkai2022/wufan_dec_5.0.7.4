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
public final class ItemGameMainNewViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22312b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f22313c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22314d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f22315e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22316f;

    private ItemGameMainNewViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView2) {
        this.f22312b = constraintLayout;
        this.f22313c = imageView;
        this.f22314d = textView;
        this.f22315e = constraintLayout2;
        this.f22316f = textView2;
    }

    @NonNull
    public static ItemGameMainNewViewBinding bind(@NonNull View view) {
        int i4 = R.id.imageView79;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView79);
        if (imageView != null) {
            i4 = R.id.itemGameMainNameTx;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.itemGameMainNameTx);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i4 = R.id.itemGameMainTipTv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.itemGameMainTipTv);
                if (textView2 != null) {
                    return new ItemGameMainNewViewBinding(constraintLayout, imageView, textView, constraintLayout, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemGameMainNewViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22312b;
    }

    @NonNull
    public static ItemGameMainNewViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_game_main_new_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
