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
public final class GameolFirstListviewItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f21203b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21204c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f21205d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f21206e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f21207f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f21208g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f21209h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f21210i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f21211j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final SimpleDraweeView f21212k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f21213l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f21214m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f21215n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ProgressBar f21216o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ProgressBar f21217p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final RelativeLayout f21218q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final RelativeLayout f21219r;

    private GameolFirstListviewItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3) {
        this.f21203b = relativeLayout;
        this.f21204c = textView;
        this.f21205d = imageView;
        this.f21206e = view;
        this.f21207f = linearLayout;
        this.f21208g = linearLayout2;
        this.f21209h = textView2;
        this.f21210i = textView3;
        this.f21211j = textView4;
        this.f21212k = simpleDraweeView;
        this.f21213l = textView5;
        this.f21214m = textView6;
        this.f21215n = textView7;
        this.f21216o = progressBar;
        this.f21217p = progressBar2;
        this.f21218q = relativeLayout2;
        this.f21219r = relativeLayout3;
    }

    @NonNull
    public static GameolFirstListviewItemBinding bind(@NonNull View view) {
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
                                                    i4 = R.id.privilege;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.privilege);
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
                                                                    return new GameolFirstListviewItemBinding(relativeLayout2, textView, imageView, findChildViewById, linearLayout, linearLayout2, textView2, textView3, textView4, simpleDraweeView, textView5, textView6, textView7, progressBar, progressBar2, relativeLayout, relativeLayout2);
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
    public static GameolFirstListviewItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f21203b;
    }

    @NonNull
    public static GameolFirstListviewItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gameol_first_listview_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
