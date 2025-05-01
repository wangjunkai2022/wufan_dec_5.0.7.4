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
import it.sephiroth.android.library.widget.HListView;
/* loaded from: classes3.dex */
public final class ItemGameDetailSimilarViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22283b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22284c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f22285d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f22286e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f22287f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f22288g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f22289h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f22290i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final SimpleDraweeView f22291j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f22292k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f22293l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f22294m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f22295n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ProgressBar f22296o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ProgressBar f22297p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final RelativeLayout f22298q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final RelativeLayout f22299r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f22300s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final HListView f22301t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final LinearLayout f22302u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final LinearLayout f22303v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final TextView f22304w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final TextView f22305x;

    private ItemGameDetailSimilarViewBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout5, @NonNull HListView hListView, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull TextView textView9, @NonNull TextView textView10) {
        this.f22283b = linearLayout;
        this.f22284c = textView;
        this.f22285d = linearLayout2;
        this.f22286e = linearLayout3;
        this.f22287f = linearLayout4;
        this.f22288g = textView2;
        this.f22289h = textView3;
        this.f22290i = textView4;
        this.f22291j = simpleDraweeView;
        this.f22292k = textView5;
        this.f22293l = textView6;
        this.f22294m = textView7;
        this.f22295n = textView8;
        this.f22296o = progressBar;
        this.f22297p = progressBar2;
        this.f22298q = relativeLayout;
        this.f22299r = relativeLayout2;
        this.f22300s = linearLayout5;
        this.f22301t = hListView;
        this.f22302u = linearLayout6;
        this.f22303v = linearLayout7;
        this.f22304w = textView9;
        this.f22305x = textView10;
    }

    @NonNull
    public static ItemGameDetailSimilarViewBinding bind(@NonNull View view) {
        int i4 = R.id.appSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
        if (textView != null) {
            i4 = R.id.backLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.backLayout);
            if (linearLayout != null) {
                i4 = R.id.linearLayout;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout);
                if (linearLayout2 != null) {
                    i4 = R.id.linearLayout2;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout2);
                    if (linearLayout3 != null) {
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
                                                                        i4 = R.id.rl_item;
                                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.rl_item);
                                                                        if (linearLayout4 != null) {
                                                                            i4 = R.id.screenListView;
                                                                            HListView hListView = (HListView) ViewBindings.findChildViewById(view, R.id.screenListView);
                                                                            if (hListView != null) {
                                                                                i4 = R.id.tipsLayout;
                                                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                                                                                if (linearLayout5 != null) {
                                                                                    i4 = R.id.tipsLayout1;
                                                                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout1);
                                                                                    if (linearLayout6 != null) {
                                                                                        i4 = R.id.tv_content;
                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
                                                                                        if (textView9 != null) {
                                                                                            i4 = R.id.tv_delect_game;
                                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_delect_game);
                                                                                            if (textView10 != null) {
                                                                                                return new ItemGameDetailSimilarViewBinding((LinearLayout) view, textView, linearLayout, linearLayout2, linearLayout3, textView2, textView3, textView4, simpleDraweeView, textView5, textView6, textView7, textView8, progressBar, progressBar2, relativeLayout, relativeLayout2, linearLayout4, hListView, linearLayout5, linearLayout6, textView9, textView10);
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
    public static ItemGameDetailSimilarViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22283b;
    }

    @NonNull
    public static ItemGameDetailSimilarViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_game_detail_similar_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
