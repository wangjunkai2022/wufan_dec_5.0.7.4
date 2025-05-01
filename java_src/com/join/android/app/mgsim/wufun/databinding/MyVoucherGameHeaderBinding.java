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
public final class MyVoucherGameHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25339b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25340c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25341d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f25342e;

    private MyVoucherGameHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2) {
        this.f25339b = linearLayout;
        this.f25340c = textView;
        this.f25341d = textView2;
        this.f25342e = linearLayout2;
    }

    @NonNull
    public static MyVoucherGameHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.gameVocherDetail;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.gameVocherDetail);
        if (textView != null) {
            i4 = R.id.gamrVoucherNumber;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.gamrVoucherNumber);
            if (textView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new MyVoucherGameHeaderBinding(linearLayout, textView, textView2, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MyVoucherGameHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25339b;
    }

    @NonNull
    public static MyVoucherGameHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.my_voucher_game_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
