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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MyNoVoucherItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25322b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25323c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f25324d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25325e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25326f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25327g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25328h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25329i;

    private MyNoVoucherItemBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f25322b = linearLayout;
        this.f25323c = linearLayout2;
        this.f25324d = linearLayout3;
        this.f25325e = textView;
        this.f25326f = textView2;
        this.f25327g = textView3;
        this.f25328h = textView4;
        this.f25329i = textView5;
    }

    @NonNull
    public static MyNoVoucherItemBinding bind(@NonNull View view) {
        int i4 = R.id.gameVoucherRight;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.gameVoucherRight);
        if (linearLayout != null) {
            LinearLayout linearLayout2 = (LinearLayout) view;
            i4 = R.id.voucherContent;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.voucherContent);
            if (textView != null) {
                i4 = R.id.voucherGameGet;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.voucherGameGet);
                if (textView2 != null) {
                    i4 = R.id.voucherGameNumber;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.voucherGameNumber);
                    if (textView3 != null) {
                        i4 = R.id.voucherName;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.voucherName);
                        if (textView4 != null) {
                            i4 = R.id.voucherPrice;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.voucherPrice);
                            if (textView5 != null) {
                                return new MyNoVoucherItemBinding(linearLayout2, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MyNoVoucherItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25322b;
    }

    @NonNull
    public static MyNoVoucherItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.my_no_voucher_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
