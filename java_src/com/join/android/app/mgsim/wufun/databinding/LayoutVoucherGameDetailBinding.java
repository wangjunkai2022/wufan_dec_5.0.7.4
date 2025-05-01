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
public final class LayoutVoucherGameDetailBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23436b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f23437c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f23438d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23439e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23440f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23441g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f23442h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f23443i;

    private LayoutVoucherGameDetailBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f23436b = linearLayout;
        this.f23437c = linearLayout2;
        this.f23438d = linearLayout3;
        this.f23439e = textView;
        this.f23440f = textView2;
        this.f23441g = textView3;
        this.f23442h = textView4;
        this.f23443i = textView5;
    }

    @NonNull
    public static LayoutVoucherGameDetailBinding bind(@NonNull View view) {
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
                                return new LayoutVoucherGameDetailBinding(linearLayout2, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutVoucherGameDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23436b;
    }

    @NonNull
    public static LayoutVoucherGameDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_voucher_game_detail, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
