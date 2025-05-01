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
public final class ItemGoldFingerFuncBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22373b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f22374c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f22375d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22376e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22377f;

    private ItemGoldFingerFuncBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f22373b = constraintLayout;
        this.f22374c = view;
        this.f22375d = simpleDraweeView;
        this.f22376e = textView;
        this.f22377f = textView2;
    }

    @NonNull
    public static ItemGoldFingerFuncBinding bind(@NonNull View view) {
        int i4 = R.id.divder;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.divder);
        if (findChildViewById != null) {
            i4 = R.id.ivAvatar;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivAvatar);
            if (simpleDraweeView != null) {
                i4 = R.id.tvDesc;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDesc);
                if (textView != null) {
                    i4 = R.id.tvFunc;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFunc);
                    if (textView2 != null) {
                        return new ItemGoldFingerFuncBinding((ConstraintLayout) view, findChildViewById, simpleDraweeView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemGoldFingerFuncBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22373b;
    }

    @NonNull
    public static ItemGoldFingerFuncBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_gold_finger_func, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
