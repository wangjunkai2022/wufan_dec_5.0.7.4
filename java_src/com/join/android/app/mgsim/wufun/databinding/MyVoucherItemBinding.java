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
public final class MyVoucherItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25353b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25354c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25355d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25356e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f25357f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25358g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25359h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25360i;

    private MyVoucherItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f25353b = linearLayout;
        this.f25354c = textView;
        this.f25355d = textView2;
        this.f25356e = textView3;
        this.f25357f = simpleDraweeView;
        this.f25358g = textView4;
        this.f25359h = textView5;
        this.f25360i = textView6;
    }

    @NonNull
    public static MyVoucherItemBinding bind(@NonNull View view) {
        int i4 = R.id.appName;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
        if (textView != null) {
            i4 = R.id.gameVoucherConsume;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.gameVoucherConsume);
            if (textView2 != null) {
                i4 = R.id.gameVoucherPrice;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.gameVoucherPrice);
                if (textView3 != null) {
                    i4 = R.id.mgListviewItemIcon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.mgListviewItemIcon);
                    if (simpleDraweeView != null) {
                        i4 = R.id.voucherHand;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.voucherHand);
                        if (textView4 != null) {
                            i4 = R.id.voucherIs;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.voucherIs);
                            if (textView5 != null) {
                                i4 = R.id.voucherOut;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.voucherOut);
                                if (textView6 != null) {
                                    return new MyVoucherItemBinding((LinearLayout) view, textView, textView2, textView3, simpleDraweeView, textView4, textView5, textView6);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MyVoucherItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25353b;
    }

    @NonNull
    public static MyVoucherItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.my_voucher_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
