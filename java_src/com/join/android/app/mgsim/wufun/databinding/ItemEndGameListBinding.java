package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.video.MultiStandVideo;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MStarBar;
/* loaded from: classes3.dex */
public final class ItemEndGameListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22056b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22057c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22058d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f22059e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f22060f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f22061g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f22062h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final MStarBar f22063i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RelativeLayout f22064j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ConstraintLayout f22065k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f22066l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f22067m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f22068n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f22069o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f22070p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f22071q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final ImageView f22072r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final FrameLayout f22073s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final MultiStandVideo f22074t;

    private ItemEndGameListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull View view, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull MStarBar mStarBar, @NonNull RelativeLayout relativeLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull ImageView imageView2, @NonNull FrameLayout frameLayout, @NonNull MultiStandVideo multiStandVideo) {
        this.f22056b = constraintLayout;
        this.f22057c = simpleDraweeView;
        this.f22058d = textView;
        this.f22059e = view;
        this.f22060f = simpleDraweeView2;
        this.f22061g = imageView;
        this.f22062h = simpleDraweeView3;
        this.f22063i = mStarBar;
        this.f22064j = relativeLayout;
        this.f22065k = constraintLayout2;
        this.f22066l = textView2;
        this.f22067m = textView3;
        this.f22068n = textView4;
        this.f22069o = textView5;
        this.f22070p = textView6;
        this.f22071q = textView7;
        this.f22072r = imageView2;
        this.f22073s = frameLayout;
        this.f22074t = multiStandVideo;
    }

    @NonNull
    public static ItemEndGameListBinding bind(@NonNull View view) {
        int i4 = R.id.bannerView;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.bannerView);
        if (simpleDraweeView != null) {
            i4 = R.id.btnPlay;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btnPlay);
            if (textView != null) {
                i4 = R.id.divider;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
                if (findChildViewById != null) {
                    i4 = R.id.gameIcon;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gameIcon);
                    if (simpleDraweeView2 != null) {
                        i4 = R.id.ivTrophy;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivTrophy);
                        if (imageView != null) {
                            i4 = R.id.loading;
                            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.loading);
                            if (simpleDraweeView3 != null) {
                                i4 = R.id.mStarBar;
                                MStarBar mStarBar = (MStarBar) ViewBindings.findChildViewById(view, R.id.mStarBar);
                                if (mStarBar != null) {
                                    i4 = R.id.rlVideo;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rlVideo);
                                    if (relativeLayout != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i4 = R.id.tvGameName;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameName);
                                        if (textView2 != null) {
                                            i4 = R.id.tvHard;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvHard);
                                            if (textView3 != null) {
                                                i4 = R.id.tvHot;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvHot);
                                                if (textView4 != null) {
                                                    i4 = R.id.tvName;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvName);
                                                    if (textView5 != null) {
                                                        i4 = R.id.tvPassCount;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPassCount);
                                                        if (textView6 != null) {
                                                            i4 = R.id.tvPassRatio;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPassRatio);
                                                            if (textView7 != null) {
                                                                i4 = R.id.tvPassTag;
                                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.tvPassTag);
                                                                if (imageView2 != null) {
                                                                    i4 = R.id.videoContner;
                                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.videoContner);
                                                                    if (frameLayout != null) {
                                                                        i4 = R.id.wf_video;
                                                                        MultiStandVideo multiStandVideo = (MultiStandVideo) ViewBindings.findChildViewById(view, R.id.wf_video);
                                                                        if (multiStandVideo != null) {
                                                                            return new ItemEndGameListBinding(constraintLayout, simpleDraweeView, textView, findChildViewById, simpleDraweeView2, imageView, simpleDraweeView3, mStarBar, relativeLayout, constraintLayout, textView2, textView3, textView4, textView5, textView6, textView7, imageView2, frameLayout, multiStandVideo);
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
    public static ItemEndGameListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22056b;
    }

    @NonNull
    public static ItemEndGameListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_end_game_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
