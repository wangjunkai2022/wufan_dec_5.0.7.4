package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class VipPopLayoutItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27104b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f27105c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f27106d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f27107e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f27108f;

    private VipPopLayoutItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2) {
        this.f27104b = linearLayout;
        this.f27105c = textView;
        this.f27106d = simpleDraweeView;
        this.f27107e = textView2;
        this.f27108f = linearLayout2;
    }

    @NonNull
    public static VipPopLayoutItemBinding bind(@NonNull View view) {
        int i4 = R.id.closeNotice;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.closeNotice);
        if (textView != null) {
            i4 = R.id.image;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.image);
            if (simpleDraweeView != null) {
                i4 = R.id.message;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.message);
                if (textView2 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new VipPopLayoutItemBinding(linearLayout, textView, simpleDraweeView, textView2, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static VipPopLayoutItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27104b;
    }

    @NonNull
    public static VipPopLayoutItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.vip_pop_layout_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
