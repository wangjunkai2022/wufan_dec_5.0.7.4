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
public final class VipCenterIcongameLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27076b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f27077c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f27078d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f27079e;

    private VipCenterIcongameLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.f27076b = linearLayout;
        this.f27077c = simpleDraweeView;
        this.f27078d = textView;
        this.f27079e = linearLayout2;
    }

    @NonNull
    public static VipCenterIcongameLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.cardImage;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.cardImage);
        if (simpleDraweeView != null) {
            i4 = R.id.gameName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.gameName);
            if (textView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new VipCenterIcongameLayoutBinding(linearLayout, simpleDraweeView, textView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static VipCenterIcongameLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27076b;
    }

    @NonNull
    public static VipCenterIcongameLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.vip_center_icongame_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
