package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MStarBar;
import it.sephiroth.android.library.widget.HListView;
/* loaded from: classes3.dex */
public final class GamelistDetialItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21151b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f21152c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21153d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f21154e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f21155f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f21156g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final HListView f21157h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final MStarBar f21158i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f21159j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f21160k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f21161l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f21162m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f21163n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f21164o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f21165p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final SimpleDraweeView f21166q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f21167r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final HListView f21168s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final LinearLayout f21169t;

    private GamelistDetialItemLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView2, @NonNull HListView hListView, @NonNull MStarBar mStarBar, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull LinearLayout linearLayout4, @NonNull TextView textView6, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout5, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull LinearLayout linearLayout6, @NonNull HListView hListView2, @NonNull LinearLayout linearLayout7) {
        this.f21151b = linearLayout;
        this.f21152c = simpleDraweeView;
        this.f21153d = textView;
        this.f21154e = linearLayout2;
        this.f21155f = linearLayout3;
        this.f21156g = textView2;
        this.f21157h = hListView;
        this.f21158i = mStarBar;
        this.f21159j = textView3;
        this.f21160k = textView4;
        this.f21161l = textView5;
        this.f21162m = linearLayout4;
        this.f21163n = textView6;
        this.f21164o = imageView;
        this.f21165p = linearLayout5;
        this.f21166q = simpleDraweeView2;
        this.f21167r = linearLayout6;
        this.f21168s = hListView2;
        this.f21169t = linearLayout7;
    }

    @NonNull
    public static GamelistDetialItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.appIcon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appIcon);
        if (simpleDraweeView != null) {
            i4 = R.id.appName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
            if (textView != null) {
                i4 = R.id.appRecomLayout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.appRecomLayout);
                if (linearLayout != null) {
                    i4 = R.id.backLayout;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.backLayout);
                    if (linearLayout2 != null) {
                        i4 = R.id.bottom;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.bottom);
                        if (textView2 != null) {
                            i4 = R.id.comment;
                            HListView hListView = (HListView) ViewBindings.findChildViewById(view, R.id.comment);
                            if (hListView != null) {
                                i4 = R.id.comment_head_mstarBar;
                                MStarBar mStarBar = (MStarBar) ViewBindings.findChildViewById(view, R.id.comment_head_mstarBar);
                                if (mStarBar != null) {
                                    i4 = R.id.comment_head_num_tx;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.comment_head_num_tx);
                                    if (textView3 != null) {
                                        i4 = R.id.comment_head_point_tx;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.comment_head_point_tx);
                                        if (textView4 != null) {
                                            i4 = R.id.describ;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.describ);
                                            if (textView5 != null) {
                                                i4 = R.id.describLayout;
                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.describLayout);
                                                if (linearLayout3 != null) {
                                                    i4 = R.id.downButnText;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.downButnText);
                                                    if (textView6 != null) {
                                                        i4 = R.id.downIcon;
                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.downIcon);
                                                        if (imageView != null) {
                                                            i4 = R.id.downloadButn;
                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.downloadButn);
                                                            if (linearLayout4 != null) {
                                                                i4 = R.id.moveImg;
                                                                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.moveImg);
                                                                if (simpleDraweeView2 != null) {
                                                                    i4 = R.id.scoreLayout;
                                                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.scoreLayout);
                                                                    if (linearLayout5 != null) {
                                                                        i4 = R.id.screenListView;
                                                                        HListView hListView2 = (HListView) ViewBindings.findChildViewById(view, R.id.screenListView);
                                                                        if (hListView2 != null) {
                                                                            i4 = R.id.tips;
                                                                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tips);
                                                                            if (linearLayout6 != null) {
                                                                                return new GamelistDetialItemLayoutBinding((LinearLayout) view, simpleDraweeView, textView, linearLayout, linearLayout2, textView2, hListView, mStarBar, textView3, textView4, textView5, linearLayout3, textView6, imageView, linearLayout4, simpleDraweeView2, linearLayout5, hListView2, linearLayout6);
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
    public static GamelistDetialItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21151b;
    }

    @NonNull
    public static GamelistDetialItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamelist_detial_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
