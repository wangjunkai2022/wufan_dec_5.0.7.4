package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.FlowLayout;
/* loaded from: classes3.dex */
public final class ActivityPayStartBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16754b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16755c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f16756d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final FlowLayout f16757e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f16758f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f16759g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16760h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f16761i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f16762j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final Button f16763k;

    private ActivityPayStartBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull FlowLayout flowLayout, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull Button button) {
        this.f16754b = linearLayout;
        this.f16755c = imageView;
        this.f16756d = textView;
        this.f16757e = flowLayout;
        this.f16758f = textView2;
        this.f16759g = textView3;
        this.f16760h = textView4;
        this.f16761i = textView5;
        this.f16762j = textView6;
        this.f16763k = button;
    }

    @NonNull
    public static ActivityPayStartBinding bind(@NonNull View view) {
        int i4 = R.id.checkBoxPay;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.checkBoxPay);
        if (imageView != null) {
            i4 = R.id.openTalk;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.openTalk);
            if (textView != null) {
                i4 = R.id.papa_top_layout;
                FlowLayout flowLayout = (FlowLayout) ViewBindings.findChildViewById(view, R.id.papa_top_layout);
                if (flowLayout != null) {
                    i4 = R.id.papa_top_number;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.papa_top_number);
                    if (textView2 != null) {
                        i4 = R.id.papa_top_oto;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.papa_top_oto);
                        if (textView3 != null) {
                            i4 = R.id.papaTopPriceBig;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.papaTopPriceBig);
                            if (textView4 != null) {
                                i4 = R.id.readMsg;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.readMsg);
                                if (textView5 != null) {
                                    i4 = R.id.showPrice;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.showPrice);
                                    if (textView6 != null) {
                                        i4 = R.id.startPay;
                                        Button button = (Button) ViewBindings.findChildViewById(view, R.id.startPay);
                                        if (button != null) {
                                            return new ActivityPayStartBinding((LinearLayout) view, imageView, textView, flowLayout, textView2, textView3, textView4, textView5, textView6, button);
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
    public static ActivityPayStartBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16754b;
    }

    @NonNull
    public static ActivityPayStartBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_pay_start, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
