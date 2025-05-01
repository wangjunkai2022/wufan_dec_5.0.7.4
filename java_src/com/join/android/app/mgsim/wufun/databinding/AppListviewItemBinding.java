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
public final class AppListviewItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f17409b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17410c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f17411d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f17412e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f17413f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f17414g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17415h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f17416i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f17417j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final SimpleDraweeView f17418k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f17419l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f17420m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ProgressBar f17421n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ProgressBar f17422o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final RelativeLayout f17423p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final RelativeLayout f17424q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f17425r;

    private AppListviewItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull LinearLayout linearLayout3) {
        this.f17409b = relativeLayout;
        this.f17410c = textView;
        this.f17411d = imageView;
        this.f17412e = view;
        this.f17413f = linearLayout;
        this.f17414g = linearLayout2;
        this.f17415h = textView2;
        this.f17416i = textView3;
        this.f17417j = textView4;
        this.f17418k = simpleDraweeView;
        this.f17419l = textView5;
        this.f17420m = textView6;
        this.f17421n = progressBar;
        this.f17422o = progressBar2;
        this.f17423p = relativeLayout2;
        this.f17424q = relativeLayout3;
        this.f17425r = linearLayout3;
    }

    @NonNull
    public static AppListviewItemBinding bind(@NonNull View view) {
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
                                                                i4 = R.id.tipsLayout;
                                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                                                                if (linearLayout3 != null) {
                                                                    return new AppListviewItemBinding(relativeLayout2, textView, imageView, findChildViewById, linearLayout, linearLayout2, textView2, textView3, textView4, simpleDraweeView, textView5, textView6, progressBar, progressBar2, relativeLayout, relativeLayout2, linearLayout3);
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
    public static AppListviewItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f17409b;
    }

    @NonNull
    public static AppListviewItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.app_listview_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
