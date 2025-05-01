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
public final class AppListviewItem1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f17373b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17374c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f17375d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f17376e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f17377f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f17378g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f17379h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f17380i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f17381j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f17382k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final SimpleDraweeView f17383l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f17384m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f17385n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ProgressBar f17386o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ProgressBar f17387p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final RelativeLayout f17388q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final RelativeLayout f17389r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f17390s;

    private AppListviewItem1Binding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull LinearLayout linearLayout3) {
        this.f17373b = relativeLayout;
        this.f17374c = textView;
        this.f17375d = textView2;
        this.f17376e = imageView;
        this.f17377f = view;
        this.f17378g = linearLayout;
        this.f17379h = linearLayout2;
        this.f17380i = textView3;
        this.f17381j = textView4;
        this.f17382k = textView5;
        this.f17383l = simpleDraweeView;
        this.f17384m = textView6;
        this.f17385n = textView7;
        this.f17386o = progressBar;
        this.f17387p = progressBar2;
        this.f17388q = relativeLayout2;
        this.f17389r = relativeLayout3;
        this.f17390s = linearLayout3;
    }

    @NonNull
    public static AppListviewItem1Binding bind(@NonNull View view) {
        int i4 = R.id.adText;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.adText);
        if (textView != null) {
            i4 = R.id.appSize;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
            if (textView2 != null) {
                i4 = R.id.giftPackageSwich;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.giftPackageSwich);
                if (imageView != null) {
                    i4 = R.id.line;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                    if (findChildViewById != null) {
                        i4 = R.id.linearLayout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout);
                        if (linearLayout != null) {
                            i4 = R.id.linearLayout2;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout2);
                            if (linearLayout2 != null) {
                                i4 = R.id.loding_info;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.loding_info);
                                if (textView3 != null) {
                                    i4 = R.id.mgListviewItemAppname;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemAppname);
                                    if (textView4 != null) {
                                        i4 = R.id.mgListviewItemDescribe;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemDescribe);
                                        if (textView5 != null) {
                                            i4 = R.id.mgListviewItemIcon;
                                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.mgListviewItemIcon);
                                            if (simpleDraweeView != null) {
                                                i4 = R.id.mgListviewItemInstall;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemInstall);
                                                if (textView6 != null) {
                                                    i4 = R.id.moneyText;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                                                    if (textView7 != null) {
                                                        i4 = R.id.progressBar;
                                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                                        if (progressBar != null) {
                                                            i4 = R.id.progressBarZip;
                                                            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarZip);
                                                            if (progressBar2 != null) {
                                                                i4 = R.id.rLayoutRight;
                                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rLayoutRight);
                                                                if (relativeLayout != null) {
                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                                                    i4 = R.id.tipsLayout;
                                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                                                                    if (linearLayout3 != null) {
                                                                        return new AppListviewItem1Binding(relativeLayout2, textView, textView2, imageView, findChildViewById, linearLayout, linearLayout2, textView3, textView4, textView5, simpleDraweeView, textView6, textView7, progressBar, progressBar2, relativeLayout, relativeLayout2, linearLayout3);
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
    public static AppListviewItem1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f17373b;
    }

    @NonNull
    public static AppListviewItem1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.app_listview_item1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
