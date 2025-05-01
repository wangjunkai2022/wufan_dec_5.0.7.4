package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MyAccountDetialLayoutBinding implements ViewBinding {
    @NonNull
    public final TextView A;
    @NonNull
    public final LinearLayout B;
    @NonNull
    public final TextView C;
    @NonNull
    public final ScrollView D;
    @NonNull
    public final TextView E;
    @NonNull
    public final TextView F;
    @NonNull
    public final TextView G;
    @NonNull
    public final TextView H;
    @NonNull
    public final TextView I;
    @NonNull
    public final TextView J;
    @NonNull
    public final TextView K;
    @NonNull
    public final LinearLayout L;
    @NonNull
    public final TextView M;
    @NonNull
    public final LinearLayout N;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25211b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25212c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25213d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f25214e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f25215f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f25216g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f25217h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25218i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25219j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25220k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f25221l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final SimpleDraweeView f25222m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f25223n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f25224o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f25225p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final ImageView f25226q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final ImageView f25227r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final ImageView f25228s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final LinearLayout f25229t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f25230u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final TextView f25231v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f25232w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final TextView f25233x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final LinearLayout f25234y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final LinearLayout f25235z;

    private MyAccountDetialLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout7, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull LinearLayout linearLayout8, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull LinearLayout linearLayout9, @NonNull TextView textView8, @NonNull LinearLayout linearLayout10, @NonNull LinearLayout linearLayout11, @NonNull TextView textView9, @NonNull LinearLayout linearLayout12, @NonNull TextView textView10, @NonNull ScrollView scrollView, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TextView textView13, @NonNull TextView textView14, @NonNull TextView textView15, @NonNull TextView textView16, @NonNull TextView textView17, @NonNull LinearLayout linearLayout13, @NonNull TextView textView18, @NonNull LinearLayout linearLayout14) {
        this.f25211b = linearLayout;
        this.f25212c = linearLayout2;
        this.f25213d = textView;
        this.f25214e = linearLayout3;
        this.f25215f = linearLayout4;
        this.f25216g = linearLayout5;
        this.f25217h = linearLayout6;
        this.f25218i = textView2;
        this.f25219j = textView3;
        this.f25220k = textView4;
        this.f25221l = textView5;
        this.f25222m = simpleDraweeView;
        this.f25223n = linearLayout7;
        this.f25224o = imageView;
        this.f25225p = imageView2;
        this.f25226q = imageView3;
        this.f25227r = imageView4;
        this.f25228s = imageView5;
        this.f25229t = linearLayout8;
        this.f25230u = textView6;
        this.f25231v = textView7;
        this.f25232w = linearLayout9;
        this.f25233x = textView8;
        this.f25234y = linearLayout10;
        this.f25235z = linearLayout11;
        this.A = textView9;
        this.B = linearLayout12;
        this.C = textView10;
        this.D = scrollView;
        this.E = textView11;
        this.F = textView12;
        this.G = textView13;
        this.H = textView14;
        this.I = textView15;
        this.J = textView16;
        this.K = textView17;
        this.L = linearLayout13;
        this.M = textView18;
        this.N = linearLayout14;
    }

    @NonNull
    public static MyAccountDetialLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.accountNameLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.accountNameLayout);
        if (linearLayout != null) {
            i4 = R.id.accountNameTv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.accountNameTv);
            if (textView != null) {
                i4 = R.id.bindQQLayout;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.bindQQLayout);
                if (linearLayout2 != null) {
                    i4 = R.id.bindWechartLayout;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.bindWechartLayout);
                    if (linearLayout3 != null) {
                        i4 = R.id.bindWeiboLayout;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.bindWeiboLayout);
                        if (linearLayout4 != null) {
                            i4 = R.id.exitLogin;
                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.exitLogin);
                            if (linearLayout5 != null) {
                                i4 = R.id.expTv;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.expTv);
                                if (textView2 != null) {
                                    i4 = R.id.hasBindQQ;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.hasBindQQ);
                                    if (textView3 != null) {
                                        i4 = R.id.hasBindWebo;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.hasBindWebo);
                                        if (textView4 != null) {
                                            i4 = R.id.hasBindWechat;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.hasBindWechat);
                                            if (textView5 != null) {
                                                i4 = R.id.iconImage;
                                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iconImage);
                                                if (simpleDraweeView != null) {
                                                    i4 = R.id.iconLayout;
                                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iconLayout);
                                                    if (linearLayout6 != null) {
                                                        i4 = R.id.imageView;
                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
                                                        if (imageView != null) {
                                                            i4 = R.id.imageView2;
                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView2);
                                                            if (imageView2 != null) {
                                                                i4 = R.id.imageView3;
                                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView3);
                                                                if (imageView3 != null) {
                                                                    i4 = R.id.imageView4;
                                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView4);
                                                                    if (imageView4 != null) {
                                                                        i4 = R.id.imageView5;
                                                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView5);
                                                                        if (imageView5 != null) {
                                                                            i4 = R.id.levelLayout;
                                                                            LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.levelLayout);
                                                                            if (linearLayout7 != null) {
                                                                                i4 = R.id.levelTv;
                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.levelTv);
                                                                                if (textView6 != null) {
                                                                                    i4 = R.id.name;
                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                                                                                    if (textView7 != null) {
                                                                                        i4 = R.id.nameLayout;
                                                                                        LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.nameLayout);
                                                                                        if (linearLayout8 != null) {
                                                                                            i4 = R.id.pabi;
                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.pabi);
                                                                                            if (textView8 != null) {
                                                                                                i4 = R.id.pabiLayout;
                                                                                                LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.pabiLayout);
                                                                                                if (linearLayout9 != null) {
                                                                                                    i4 = R.id.passwordLayout;
                                                                                                    LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.passwordLayout);
                                                                                                    if (linearLayout10 != null) {
                                                                                                        i4 = R.id.passwordTv;
                                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.passwordTv);
                                                                                                        if (textView9 != null) {
                                                                                                            i4 = R.id.phoneLayout;
                                                                                                            LinearLayout linearLayout11 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.phoneLayout);
                                                                                                            if (linearLayout11 != null) {
                                                                                                                i4 = R.id.phoneTv;
                                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.phoneTv);
                                                                                                                if (textView10 != null) {
                                                                                                                    i4 = R.id.scrollView;
                                                                                                                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                                                                                                    if (scrollView != null) {
                                                                                                                        i4 = R.id.textView;
                                                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                                                                                                                        if (textView11 != null) {
                                                                                                                            i4 = R.id.textView2;
                                                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
                                                                                                                            if (textView12 != null) {
                                                                                                                                i4 = R.id.textView3;
                                                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.textView3);
                                                                                                                                if (textView13 != null) {
                                                                                                                                    i4 = R.id.textView4;
                                                                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.textView4);
                                                                                                                                    if (textView14 != null) {
                                                                                                                                        i4 = R.id.textView5;
                                                                                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.textView5);
                                                                                                                                        if (textView15 != null) {
                                                                                                                                            i4 = R.id.textView6;
                                                                                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.textView6);
                                                                                                                                            if (textView16 != null) {
                                                                                                                                                i4 = R.id.tv_rank;
                                                                                                                                                TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_rank);
                                                                                                                                                if (textView17 != null) {
                                                                                                                                                    i4 = R.id.unSubscribe;
                                                                                                                                                    LinearLayout linearLayout12 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.unSubscribe);
                                                                                                                                                    if (linearLayout12 != null) {
                                                                                                                                                        i4 = R.id.xingbie;
                                                                                                                                                        TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.xingbie);
                                                                                                                                                        if (textView18 != null) {
                                                                                                                                                            i4 = R.id.xingbieLayout;
                                                                                                                                                            LinearLayout linearLayout13 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.xingbieLayout);
                                                                                                                                                            if (linearLayout13 != null) {
                                                                                                                                                                return new MyAccountDetialLayoutBinding((LinearLayout) view, linearLayout, textView, linearLayout2, linearLayout3, linearLayout4, linearLayout5, textView2, textView3, textView4, textView5, simpleDraweeView, linearLayout6, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout7, textView6, textView7, linearLayout8, textView8, linearLayout9, linearLayout10, textView9, linearLayout11, textView10, scrollView, textView11, textView12, textView13, textView14, textView15, textView16, textView17, linearLayout12, textView18, linearLayout13);
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
    public static MyAccountDetialLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25211b;
    }

    @NonNull
    public static MyAccountDetialLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.my_account_detial_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
