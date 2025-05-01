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
public final class GamedeItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20470b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f20471c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f20472d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f20473e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20474f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f20475g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f20476h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f20477i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f20478j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f20479k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f20480l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f20481m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ProgressBar f20482n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ProgressBar f20483o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final RelativeLayout f20484p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final RelativeLayout f20485q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f20486r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f20487s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final LinearLayout f20488t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f20489u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final TextView f20490v;

    private GamedeItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull TextView textView9, @NonNull TextView textView10) {
        this.f20470b = linearLayout;
        this.f20471c = textView;
        this.f20472d = linearLayout2;
        this.f20473e = linearLayout3;
        this.f20474f = textView2;
        this.f20475g = textView3;
        this.f20476h = textView4;
        this.f20477i = simpleDraweeView;
        this.f20478j = textView5;
        this.f20479k = textView6;
        this.f20480l = textView7;
        this.f20481m = textView8;
        this.f20482n = progressBar;
        this.f20483o = progressBar2;
        this.f20484p = relativeLayout;
        this.f20485q = relativeLayout2;
        this.f20486r = linearLayout4;
        this.f20487s = linearLayout5;
        this.f20488t = linearLayout6;
        this.f20489u = textView9;
        this.f20490v = textView10;
    }

    @NonNull
    public static GamedeItemBinding bind(@NonNull View view) {
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
                                        i4 = R.id.moneyText;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                                        if (textView6 != null) {
                                            i4 = R.id.moneyText2;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText2);
                                            if (textView7 != null) {
                                                i4 = R.id.privilege;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.privilege);
                                                if (textView8 != null) {
                                                    i4 = R.id.progressBar;
                                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                                    if (progressBar != null) {
                                                        i4 = R.id.progressBarZip;
                                                        ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarZip);
                                                        if (progressBar2 != null) {
                                                            i4 = R.id.rLayoutRight;
                                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rLayoutRight);
                                                            if (relativeLayout != null) {
                                                                i4 = R.id.rLayoutRight2;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rLayoutRight2);
                                                                if (relativeLayout2 != null) {
                                                                    LinearLayout linearLayout3 = (LinearLayout) view;
                                                                    i4 = R.id.rl_item;
                                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.rl_item);
                                                                    if (linearLayout4 != null) {
                                                                        i4 = R.id.tipsLayout;
                                                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                                                                        if (linearLayout5 != null) {
                                                                            i4 = R.id.tv_content;
                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
                                                                            if (textView9 != null) {
                                                                                i4 = R.id.tv_delect_game;
                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_delect_game);
                                                                                if (textView10 != null) {
                                                                                    return new GamedeItemBinding(linearLayout3, textView, linearLayout, linearLayout2, textView2, textView3, textView4, simpleDraweeView, textView5, textView6, textView7, textView8, progressBar, progressBar2, relativeLayout, relativeLayout2, linearLayout3, linearLayout4, linearLayout5, textView9, textView10);
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
    public static GamedeItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20470b;
    }

    @NonNull
    public static GamedeItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamede_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
