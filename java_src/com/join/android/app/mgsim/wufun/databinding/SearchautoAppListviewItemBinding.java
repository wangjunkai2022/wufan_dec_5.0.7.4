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
public final class SearchautoAppListviewItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26458b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26459c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26460d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f26461e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f26462f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f26463g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26464h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f26465i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26466j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final SimpleDraweeView f26467k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26468l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26469m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ProgressBar f26470n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ProgressBar f26471o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final RelativeLayout f26472p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final RelativeLayout f26473q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f26474r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f26475s;

    private SearchautoAppListviewItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView7, @NonNull LinearLayout linearLayout3) {
        this.f26458b = relativeLayout;
        this.f26459c = textView;
        this.f26460d = imageView;
        this.f26461e = view;
        this.f26462f = linearLayout;
        this.f26463g = linearLayout2;
        this.f26464h = textView2;
        this.f26465i = textView3;
        this.f26466j = textView4;
        this.f26467k = simpleDraweeView;
        this.f26468l = textView5;
        this.f26469m = textView6;
        this.f26470n = progressBar;
        this.f26471o = progressBar2;
        this.f26472p = relativeLayout2;
        this.f26473q = relativeLayout3;
        this.f26474r = textView7;
        this.f26475s = linearLayout3;
    }

    @NonNull
    public static SearchautoAppListviewItemBinding bind(@NonNull View view) {
        int i4 = R.id.appSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
        if (textView != null) {
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
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                                                i4 = R.id.tipSText;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tipSText);
                                                                if (textView7 != null) {
                                                                    i4 = R.id.tipsLayout;
                                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                                                                    if (linearLayout3 != null) {
                                                                        return new SearchautoAppListviewItemBinding(relativeLayout2, textView, imageView, findChildViewById, linearLayout, linearLayout2, textView2, textView3, textView4, simpleDraweeView, textView5, textView6, progressBar, progressBar2, relativeLayout, relativeLayout2, textView7, linearLayout3);
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
    public static SearchautoAppListviewItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26458b;
    }

    @NonNull
    public static SearchautoAppListviewItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.searchauto_app_listview_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
