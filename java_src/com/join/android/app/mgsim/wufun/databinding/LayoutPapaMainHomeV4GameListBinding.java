package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class LayoutPapaMainHomeV4GameListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23198b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23199c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f23200d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f23201e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23202f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23203g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f23204h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f23205i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f23206j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ProgressBar f23207k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ProgressBar f23208l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f23209m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RelativeLayout f23210n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f23211o;

    private LayoutPapaMainHomeV4GameListBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView5, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull LinearLayout linearLayout3) {
        this.f23198b = relativeLayout;
        this.f23199c = textView;
        this.f23200d = linearLayout;
        this.f23201e = linearLayout2;
        this.f23202f = textView2;
        this.f23203g = textView3;
        this.f23204h = textView4;
        this.f23205i = simpleDraweeView;
        this.f23206j = textView5;
        this.f23207k = progressBar;
        this.f23208l = progressBar2;
        this.f23209m = relativeLayout2;
        this.f23210n = relativeLayout3;
        this.f23211o = linearLayout3;
    }

    @NonNull
    public static LayoutPapaMainHomeV4GameListBinding bind(@NonNull View view) {
        int i4 = R.id.appSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
        if (textView != null) {
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
                                                        return new LayoutPapaMainHomeV4GameListBinding(relativeLayout2, textView, linearLayout, linearLayout2, textView2, textView3, textView4, simpleDraweeView, textView5, progressBar, progressBar2, relativeLayout, relativeLayout2, linearLayout3);
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
    public static LayoutPapaMainHomeV4GameListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23198b;
    }

    @NonNull
    public static LayoutPapaMainHomeV4GameListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_papa_main_home_v4_game_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
