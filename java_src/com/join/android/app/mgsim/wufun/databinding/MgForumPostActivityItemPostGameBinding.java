package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
public final class MgForumPostActivityItemPostGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24063b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24064c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f24065d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f24066e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f24067f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f24068g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f24069h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f24070i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f24071j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final SimpleDraweeView f24072k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final Button f24073l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f24074m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f24075n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ProgressBar f24076o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ProgressBar f24077p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final RelativeLayout f24078q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final RelativeLayout f24079r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f24080s;

    private MgForumPostActivityItemPostGameBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull View view, @NonNull View view2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull Button button, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout4) {
        this.f24063b = linearLayout;
        this.f24064c = textView;
        this.f24065d = view;
        this.f24066e = view2;
        this.f24067f = linearLayout2;
        this.f24068g = linearLayout3;
        this.f24069h = textView2;
        this.f24070i = textView3;
        this.f24071j = textView4;
        this.f24072k = simpleDraweeView;
        this.f24073l = button;
        this.f24074m = textView5;
        this.f24075n = textView6;
        this.f24076o = progressBar;
        this.f24077p = progressBar2;
        this.f24078q = relativeLayout;
        this.f24079r = relativeLayout2;
        this.f24080s = linearLayout4;
    }

    @NonNull
    public static MgForumPostActivityItemPostGameBinding bind(@NonNull View view) {
        int i4 = R.id.appSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
        if (textView != null) {
            i4 = R.id.divider;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
            if (findChildViewById != null) {
                i4 = R.id.line;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.line);
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
                                            Button button = (Button) ViewBindings.findChildViewById(view, R.id.mgListviewItemInstall);
                                            if (button != null) {
                                                i4 = R.id.mgListviewItemSize;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemSize);
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
                                                                            return new MgForumPostActivityItemPostGameBinding((LinearLayout) view, textView, findChildViewById, findChildViewById2, linearLayout, linearLayout2, textView2, textView3, textView4, simpleDraweeView, button, textView5, textView6, progressBar, progressBar2, relativeLayout, relativeLayout2, linearLayout3);
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
    public static MgForumPostActivityItemPostGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24063b;
    }

    @NonNull
    public static MgForumPostActivityItemPostGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_activity_item_post_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
