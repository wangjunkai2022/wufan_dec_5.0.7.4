package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PapaCouponItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25623b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CheckBox f25624c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25625d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25626e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25627f;

    private PapaCouponItemLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull CheckBox checkBox, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f25623b = linearLayout;
        this.f25624c = checkBox;
        this.f25625d = textView;
        this.f25626e = textView2;
        this.f25627f = textView3;
    }

    @NonNull
    public static PapaCouponItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.checkBox;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.checkBox);
        if (checkBox != null) {
            i4 = R.id.couponName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.couponName);
            if (textView != null) {
                i4 = R.id.expireDate;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.expireDate);
                if (textView2 != null) {
                    i4 = R.id.money;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.money);
                    if (textView3 != null) {
                        return new PapaCouponItemLayoutBinding((LinearLayout) view, checkBox, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PapaCouponItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25623b;
    }

    @NonNull
    public static PapaCouponItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papa_coupon_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
