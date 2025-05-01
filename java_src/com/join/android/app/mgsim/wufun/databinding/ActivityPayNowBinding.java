package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityPayNowBinding implements ViewBinding {
    @NonNull
    public final TextView A;
    @NonNull
    public final TextView B;
    @NonNull
    public final TextView C;
    @NonNull
    public final ImageView D;
    @NonNull
    public final ImageView E;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f16729b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16730c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f16731d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f16732e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f16733f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f16734g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f16735h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f16736i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f16737j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f16738k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f16739l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ProgressBar f16740m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final Button f16741n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f16742o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f16743p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final HorizontalScrollView f16744q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f16745r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f16746s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f16747t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f16748u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final TextView f16749v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final TextView f16750w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final TextView f16751x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final TextView f16752y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final TextView f16753z;

    private ActivityPayNowBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull ProgressBar progressBar, @NonNull Button button, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout7, @NonNull HorizontalScrollView horizontalScrollView, @NonNull LinearLayout linearLayout8, @NonNull LinearLayout linearLayout9, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull ImageView imageView5, @NonNull ImageView imageView6) {
        this.f16729b = relativeLayout;
        this.f16730c = imageView;
        this.f16731d = textView;
        this.f16732e = imageView2;
        this.f16733f = imageView3;
        this.f16734g = linearLayout;
        this.f16735h = linearLayout2;
        this.f16736i = linearLayout3;
        this.f16737j = linearLayout4;
        this.f16738k = linearLayout5;
        this.f16739l = linearLayout6;
        this.f16740m = progressBar;
        this.f16741n = button;
        this.f16742o = imageView4;
        this.f16743p = linearLayout7;
        this.f16744q = horizontalScrollView;
        this.f16745r = linearLayout8;
        this.f16746s = linearLayout9;
        this.f16747t = textView2;
        this.f16748u = textView3;
        this.f16749v = textView4;
        this.f16750w = textView5;
        this.f16751x = textView6;
        this.f16752y = textView7;
        this.f16753z = textView8;
        this.A = textView9;
        this.B = textView10;
        this.C = textView11;
        this.D = imageView5;
        this.E = imageView6;
    }

    @NonNull
    public static ActivityPayNowBinding bind(@NonNull View view) {
        int i4 = R.id.aliPay;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.aliPay);
        if (imageView != null) {
            i4 = R.id.anotherPayType;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.anotherPayType);
            if (textView != null) {
                i4 = R.id.creditCardPay;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.creditCardPay);
                if (imageView2 != null) {
                    i4 = R.id.hongbaoPay;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.hongbaoPay);
                    if (imageView3 != null) {
                        i4 = R.id.layoutAlipay;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutAlipay);
                        if (linearLayout != null) {
                            i4 = R.id.layoutCreditCardPay;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutCreditCardPay);
                            if (linearLayout2 != null) {
                                i4 = R.id.layoutPabiPay;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutPabiPay);
                                if (linearLayout3 != null) {
                                    i4 = R.id.layoutUnionpay;
                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutUnionpay);
                                    if (linearLayout4 != null) {
                                        i4 = R.id.layoutWeixin;
                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutWeixin);
                                        if (linearLayout5 != null) {
                                            i4 = R.id.layouthongbaoPay;
                                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layouthongbaoPay);
                                            if (linearLayout6 != null) {
                                                i4 = R.id.mg_loading;
                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.mg_loading);
                                                if (progressBar != null) {
                                                    i4 = R.id.ok;
                                                    Button button = (Button) ViewBindings.findChildViewById(view, R.id.ok);
                                                    if (button != null) {
                                                        i4 = R.id.pabiPay;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.pabiPay);
                                                        if (imageView4 != null) {
                                                            i4 = R.id.papa_pay;
                                                            LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.papa_pay);
                                                            if (linearLayout7 != null) {
                                                                i4 = R.id.payChoisePayType;
                                                                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, R.id.payChoisePayType);
                                                                if (horizontalScrollView != null) {
                                                                    i4 = R.id.payDefault;
                                                                    LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.payDefault);
                                                                    if (linearLayout8 != null) {
                                                                        i4 = R.id.payLoding;
                                                                        LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.payLoding);
                                                                        if (linearLayout9 != null) {
                                                                            i4 = R.id.payMoney;
                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.payMoney);
                                                                            if (textView2 != null) {
                                                                                i4 = R.id.payProduct;
                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.payProduct);
                                                                                if (textView3 != null) {
                                                                                    i4 = R.id.payTitle;
                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.payTitle);
                                                                                    if (textView4 != null) {
                                                                                        i4 = R.id.textView;
                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                                                                                        if (textView5 != null) {
                                                                                            i4 = R.id.textView16;
                                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.textView16);
                                                                                            if (textView6 != null) {
                                                                                                i4 = R.id.textView17;
                                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.textView17);
                                                                                                if (textView7 != null) {
                                                                                                    i4 = R.id.textView18;
                                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.textView18);
                                                                                                    if (textView8 != null) {
                                                                                                        i4 = R.id.textView21;
                                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.textView21);
                                                                                                        if (textView9 != null) {
                                                                                                            i4 = R.id.textView29;
                                                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.textView29);
                                                                                                            if (textView10 != null) {
                                                                                                                i4 = R.id.textView30;
                                                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.textView30);
                                                                                                                if (textView11 != null) {
                                                                                                                    i4 = R.id.unionpay;
                                                                                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.unionpay);
                                                                                                                    if (imageView5 != null) {
                                                                                                                        i4 = R.id.weichatPay;
                                                                                                                        ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.weichatPay);
                                                                                                                        if (imageView6 != null) {
                                                                                                                            return new ActivityPayNowBinding((RelativeLayout) view, imageView, textView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, progressBar, button, imageView4, linearLayout7, horizontalScrollView, linearLayout8, linearLayout9, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, imageView5, imageView6);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static ActivityPayNowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f16729b;
    }

    @NonNull
    public static ActivityPayNowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_pay_now, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
