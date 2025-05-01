package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.WrapContentGridView;
/* loaded from: classes3.dex */
public final class LayoutGameMainVipBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23085b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23086c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f23087d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23088e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final WrapContentGridView f23089f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f23090g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f23091h;

    private LayoutGameMainVipBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView2, @NonNull WrapContentGridView wrapContentGridView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView3) {
        this.f23085b = linearLayout;
        this.f23086c = textView;
        this.f23087d = constraintLayout;
        this.f23088e = textView2;
        this.f23089f = wrapContentGridView;
        this.f23090g = simpleDraweeView;
        this.f23091h = textView3;
    }

    @NonNull
    public static LayoutGameMainVipBinding bind(@NonNull View view) {
        int i4 = R.id.buyVip;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.buyVip);
        if (textView != null) {
            i4 = R.id.rl1;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.rl1);
            if (constraintLayout != null) {
                i4 = R.id.vipDesc;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.vipDesc);
                if (textView2 != null) {
                    i4 = R.id.vipFunc;
                    WrapContentGridView wrapContentGridView = (WrapContentGridView) ViewBindings.findChildViewById(view, R.id.vipFunc);
                    if (wrapContentGridView != null) {
                        i4 = R.id.vipIcon;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.vipIcon);
                        if (simpleDraweeView != null) {
                            i4 = R.id.vipTitle;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.vipTitle);
                            if (textView3 != null) {
                                return new LayoutGameMainVipBinding((LinearLayout) view, textView, constraintLayout, textView2, wrapContentGridView, simpleDraweeView, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutGameMainVipBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23085b;
    }

    @NonNull
    public static LayoutGameMainVipBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_game_main_vip, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
