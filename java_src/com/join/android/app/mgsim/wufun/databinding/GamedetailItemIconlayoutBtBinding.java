package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CircleProgressView;
import com.join.mgps.customview.MStarBar;
/* loaded from: classes3.dex */
public final class GamedetailItemIconlayoutBtBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20623b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f20624c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f20625d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f20626e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20627f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f20628g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final MStarBar f20629h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f20630i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f20631j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f20632k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final CircleProgressView f20633l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f20634m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f20635n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final RelativeLayout f20636o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f20637p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f20638q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f20639r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f20640s;

    private GamedetailItemIconlayoutBtBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull MStarBar mStarBar, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull LinearLayout linearLayout, @NonNull CircleProgressView circleProgressView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull LinearLayout linearLayout4) {
        this.f20623b = relativeLayout;
        this.f20624c = textView;
        this.f20625d = textView2;
        this.f20626e = simpleDraweeView;
        this.f20627f = textView3;
        this.f20628g = textView4;
        this.f20629h = mStarBar;
        this.f20630i = textView5;
        this.f20631j = textView6;
        this.f20632k = linearLayout;
        this.f20633l = circleProgressView;
        this.f20634m = imageView;
        this.f20635n = linearLayout2;
        this.f20636o = relativeLayout2;
        this.f20637p = linearLayout3;
        this.f20638q = textView7;
        this.f20639r = textView8;
        this.f20640s = linearLayout4;
    }

    @NonNull
    public static GamedetailItemIconlayoutBtBinding bind(@NonNull View view) {
        int i4 = R.id.appCompany;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appCompany);
        if (textView != null) {
            i4 = R.id.appDownloadCount;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appDownloadCount);
            if (textView2 != null) {
                i4 = R.id.appIcon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appIcon);
                if (simpleDraweeView != null) {
                    i4 = R.id.appName;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
                    if (textView3 != null) {
                        i4 = R.id.appSize;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
                        if (textView4 != null) {
                            i4 = R.id.comment_head_mstarBar;
                            MStarBar mStarBar = (MStarBar) ViewBindings.findChildViewById(view, R.id.comment_head_mstarBar);
                            if (mStarBar != null) {
                                i4 = R.id.comment_head_num_tx;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.comment_head_num_tx);
                                if (textView5 != null) {
                                    i4 = R.id.comment_head_point_tx;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.comment_head_point_tx);
                                    if (textView6 != null) {
                                        i4 = R.id.companyLayout;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.companyLayout);
                                        if (linearLayout != null) {
                                            i4 = R.id.gameScore;
                                            CircleProgressView circleProgressView = (CircleProgressView) ViewBindings.findChildViewById(view, R.id.gameScore);
                                            if (circleProgressView != null) {
                                                i4 = R.id.giftImagex;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.giftImagex);
                                                if (imageView != null) {
                                                    i4 = R.id.layoutGiftx;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutGiftx);
                                                    if (linearLayout2 != null) {
                                                        RelativeLayout relativeLayout = (RelativeLayout) view;
                                                        i4 = R.id.scoreLayout;
                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.scoreLayout);
                                                        if (linearLayout3 != null) {
                                                            i4 = R.id.textView47;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.textView47);
                                                            if (textView7 != null) {
                                                                i4 = R.id.textView72;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.textView72);
                                                                if (textView8 != null) {
                                                                    i4 = R.id.tipsLayout;
                                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                                                                    if (linearLayout4 != null) {
                                                                        return new GamedetailItemIconlayoutBtBinding(relativeLayout, textView, textView2, simpleDraweeView, textView3, textView4, mStarBar, textView5, textView6, linearLayout, circleProgressView, imageView, linearLayout2, relativeLayout, linearLayout3, textView7, textView8, linearLayout4);
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
    public static GamedetailItemIconlayoutBtBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20623b;
    }

    @NonNull
    public static GamedetailItemIconlayoutBtBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_iconlayout_bt, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
