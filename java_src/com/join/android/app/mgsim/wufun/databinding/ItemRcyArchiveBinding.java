package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ClouldItemView;
/* loaded from: classes3.dex */
public final class ItemRcyArchiveBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22591b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ClouldItemView f22592c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f22593d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f22594e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f22595f;

    private ItemRcyArchiveBinding(@NonNull LinearLayout linearLayout, @NonNull ClouldItemView clouldItemView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout) {
        this.f22591b = linearLayout;
        this.f22592c = clouldItemView;
        this.f22593d = imageView;
        this.f22594e = imageView2;
        this.f22595f = relativeLayout;
    }

    @NonNull
    public static ItemRcyArchiveBinding bind(@NonNull View view) {
        int i4 = R.id.coulditem;
        ClouldItemView clouldItemView = (ClouldItemView) ViewBindings.findChildViewById(view, R.id.coulditem);
        if (clouldItemView != null) {
            i4 = R.id.iv_nor;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_nor);
            if (imageView != null) {
                i4 = R.id.iv_select;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_select);
                if (imageView2 != null) {
                    i4 = R.id.rl_image;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_image);
                    if (relativeLayout != null) {
                        return new ItemRcyArchiveBinding((LinearLayout) view, clouldItemView, imageView, imageView2, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemRcyArchiveBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22591b;
    }

    @NonNull
    public static ItemRcyArchiveBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_rcy_archive, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
