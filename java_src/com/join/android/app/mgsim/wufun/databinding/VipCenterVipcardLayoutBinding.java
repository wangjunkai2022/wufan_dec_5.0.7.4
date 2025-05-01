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
public final class VipCenterVipcardLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27099b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f27100c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f27101d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f27102e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f27103f;

    private VipCenterVipcardLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f27099b = linearLayout;
        this.f27100c = textView;
        this.f27101d = simpleDraweeView;
        this.f27102e = textView2;
        this.f27103f = textView3;
    }

    @NonNull
    public static VipCenterVipcardLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.detail;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.detail);
        if (textView != null) {
            i4 = R.id.iv_user_avatar;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iv_user_avatar);
            if (simpleDraweeView != null) {
                i4 = R.id.time;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.time);
                if (textView2 != null) {
                    i4 = R.id.userName;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.userName);
                    if (textView3 != null) {
                        return new VipCenterVipcardLayoutBinding((LinearLayout) view, textView, simpleDraweeView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static VipCenterVipcardLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27099b;
    }

    @NonNull
    public static VipCenterVipcardLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.vip_center_vipcard_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
