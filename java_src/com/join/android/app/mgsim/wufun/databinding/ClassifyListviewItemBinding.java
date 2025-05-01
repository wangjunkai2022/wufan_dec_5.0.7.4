package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ClassifyListviewItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17875b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17876c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f17877d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f17878e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f17879f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f17880g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f17881h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f17882i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f17883j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f17884k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f17885l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final SimpleDraweeView f17886m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f17887n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f17888o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ProgressBar f17889p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final ProgressBar f17890q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final RelativeLayout f17891r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final RelativeLayout f17892s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final LinearLayout f17893t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f17894u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final RelativeLayout f17895v;

    private ClassifyListviewItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull View view2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout4, @NonNull TextView textView7, @NonNull RelativeLayout relativeLayout3) {
        this.f17875b = linearLayout;
        this.f17876c = textView;
        this.f17877d = imageView;
        this.f17878e = imageView2;
        this.f17879f = view;
        this.f17880g = view2;
        this.f17881h = linearLayout2;
        this.f17882i = linearLayout3;
        this.f17883j = textView2;
        this.f17884k = textView3;
        this.f17885l = textView4;
        this.f17886m = simpleDraweeView;
        this.f17887n = textView5;
        this.f17888o = textView6;
        this.f17889p = progressBar;
        this.f17890q = progressBar2;
        this.f17891r = relativeLayout;
        this.f17892s = relativeLayout2;
        this.f17893t = linearLayout4;
        this.f17894u = textView7;
        this.f17895v = relativeLayout3;
    }

    @NonNull
    public static ClassifyListviewItemBinding bind(@NonNull View view) {
        int i4 = R.id.appSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
        if (textView != null) {
            i4 = R.id.giftPackageSwich;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.giftPackageSwich);
            if (imageView != null) {
                i4 = R.id.ivNumber;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivNumber);
                if (imageView2 != null) {
                    i4 = R.id.line;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                    if (findChildViewById != null) {
                        i4 = R.id.lineTop;
                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.lineTop);
                        if (findChildViewById2 != null) {
                            i4 = R.id.linearLayout;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout);
                            if (linearLayout != null) {
                                i4 = R.id.linearLayout2;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout2);
                                if (linearLayout2 != null) {
                                    i4 = R.id.loding_info;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.loding_info);
                                    if (textView2 != null) {
                                        i4 = R.id.mgListviewItemAppname;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemAppname);
                                        if (textView3 != null) {
                                            i4 = R.id.mgListviewItemDescribe;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemDescribe);
                                            if (textView4 != null) {
                                                i4 = R.id.mgListviewItemIcon;
                                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.mgListviewItemIcon);
                                                if (simpleDraweeView != null) {
                                                    i4 = R.id.mgListviewItemInstall;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemInstall);
                                                    if (textView5 != null) {
                                                        i4 = R.id.moneyText;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                                                        if (textView6 != null) {
                                                            i4 = R.id.progressBar;
                                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                                            if (progressBar != null) {
                                                                i4 = R.id.progressBarZip;
                                                                ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarZip);
                                                                if (progressBar2 != null) {
                                                                    i4 = R.id.rLayoutRight;
                                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rLayoutRight);
                                                                    if (relativeLayout != null) {
                                                                        i4 = R.id.relateLayoutApp;
                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.relateLayoutApp);
                                                                        if (relativeLayout2 != null) {
                                                                            i4 = R.id.tipsLayout;
                                                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                                                                            if (linearLayout3 != null) {
                                                                                i4 = R.id.tvNumber;
                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNumber);
                                                                                if (textView7 != null) {
                                                                                    i4 = R.id.tvNumberRl;
                                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.tvNumberRl);
                                                                                    if (relativeLayout3 != null) {
                                                                                        return new ClassifyListviewItemBinding((LinearLayout) view, textView, imageView, imageView2, findChildViewById, findChildViewById2, linearLayout, linearLayout2, textView2, textView3, textView4, simpleDraweeView, textView5, textView6, progressBar, progressBar2, relativeLayout, relativeLayout2, linearLayout3, textView7, relativeLayout3);
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
    public static ClassifyListviewItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17875b;
    }

    @NonNull
    public static ClassifyListviewItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.classify_listview_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
