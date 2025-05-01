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
import com.join.mgps.customview.CircleProgressView;
import com.join.mgps.customview.MStarBar;
/* loaded from: classes3.dex */
public final class GamedetailItemIconlayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20605b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f20606c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f20607d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f20608e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20609f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f20610g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f20611h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final MStarBar f20612i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f20613j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f20614k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f20615l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final CircleProgressView f20616m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f20617n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f20618o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f20619p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f20620q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f20621r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f20622s;

    private GamedetailItemIconlayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull LinearLayout linearLayout2, @NonNull MStarBar mStarBar, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull LinearLayout linearLayout3, @NonNull CircleProgressView circleProgressView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull LinearLayout linearLayout6) {
        this.f20605b = linearLayout;
        this.f20606c = textView;
        this.f20607d = textView2;
        this.f20608e = simpleDraweeView;
        this.f20609f = textView3;
        this.f20610g = textView4;
        this.f20611h = linearLayout2;
        this.f20612i = mStarBar;
        this.f20613j = textView5;
        this.f20614k = textView6;
        this.f20615l = linearLayout3;
        this.f20616m = circleProgressView;
        this.f20617n = imageView;
        this.f20618o = linearLayout4;
        this.f20619p = linearLayout5;
        this.f20620q = textView7;
        this.f20621r = textView8;
        this.f20622s = linearLayout6;
    }

    @NonNull
    public static GamedetailItemIconlayoutBinding bind(@NonNull View view) {
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
                            i4 = R.id.btTaglayout;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.btTaglayout);
                            if (linearLayout != null) {
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
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.companyLayout);
                                            if (linearLayout2 != null) {
                                                i4 = R.id.gameScore;
                                                CircleProgressView circleProgressView = (CircleProgressView) ViewBindings.findChildViewById(view, R.id.gameScore);
                                                if (circleProgressView != null) {
                                                    i4 = R.id.giftImagex;
                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.giftImagex);
                                                    if (imageView != null) {
                                                        i4 = R.id.layoutGiftx;
                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutGiftx);
                                                        if (linearLayout3 != null) {
                                                            i4 = R.id.scoreLayout;
                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.scoreLayout);
                                                            if (linearLayout4 != null) {
                                                                i4 = R.id.textView47;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.textView47);
                                                                if (textView7 != null) {
                                                                    i4 = R.id.textView72;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.textView72);
                                                                    if (textView8 != null) {
                                                                        i4 = R.id.tipsLayout;
                                                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                                                                        if (linearLayout5 != null) {
                                                                            return new GamedetailItemIconlayoutBinding((LinearLayout) view, textView, textView2, simpleDraweeView, textView3, textView4, linearLayout, mStarBar, textView5, textView6, linearLayout2, circleProgressView, imageView, linearLayout3, linearLayout4, textView7, textView8, linearLayout5);
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
    public static GamedetailItemIconlayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20605b;
    }

    @NonNull
    public static GamedetailItemIconlayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_iconlayout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
