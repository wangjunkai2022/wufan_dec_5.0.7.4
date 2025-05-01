package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MyVoucherGameItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25343b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25344c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f25345d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f25346e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25347f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25348g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25349h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25350i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f25351j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f25352k;

    private MyVoucherGameItemBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.f25343b = linearLayout;
        this.f25344c = linearLayout2;
        this.f25345d = relativeLayout;
        this.f25346e = linearLayout3;
        this.f25347f = textView;
        this.f25348g = textView2;
        this.f25349h = textView3;
        this.f25350i = textView4;
        this.f25351j = imageView;
        this.f25352k = imageView2;
    }

    @NonNull
    public static MyVoucherGameItemBinding bind(@NonNull View view) {
        int i4 = R.id.layoutLeft;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutLeft);
        if (linearLayout != null) {
            i4 = R.id.layoutRight;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.layoutRight);
            if (relativeLayout != null) {
                i4 = R.id.layoutVoucherLeft;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutVoucherLeft);
                if (linearLayout2 != null) {
                    i4 = R.id.voucherDate;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.voucherDate);
                    if (textView != null) {
                        i4 = R.id.voucherName;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.voucherName);
                        if (textView2 != null) {
                            i4 = R.id.voucherNo;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.voucherNo);
                            if (textView3 != null) {
                                i4 = R.id.voucherPrice;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.voucherPrice);
                                if (textView4 != null) {
                                    i4 = R.id.voucherStateButtom;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.voucherStateButtom);
                                    if (imageView != null) {
                                        i4 = R.id.voucherStateTop;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.voucherStateTop);
                                        if (imageView2 != null) {
                                            return new MyVoucherGameItemBinding((LinearLayout) view, linearLayout, relativeLayout, linearLayout2, textView, textView2, textView3, textView4, imageView, imageView2);
                                        }
                                    }
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
    public static MyVoucherGameItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25343b;
    }

    @NonNull
    public static MyVoucherGameItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.my_voucher_game_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
