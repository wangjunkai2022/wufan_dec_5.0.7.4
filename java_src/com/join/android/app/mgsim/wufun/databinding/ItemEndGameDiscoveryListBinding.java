package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
/* loaded from: classes3.dex */
public final class ItemEndGameDiscoveryListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22036b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22037c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22038d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f22039e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f22040f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f22041g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f22042h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RelativeLayout f22043i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ConstraintLayout f22044j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f22045k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f22046l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f22047m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f22048n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f22049o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f22050p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final FrameLayout f22051q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final MultiStandVideo f22052r;

    private ItemEndGameDiscoveryListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull RelativeLayout relativeLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull FrameLayout frameLayout, @NonNull MultiStandVideo multiStandVideo) {
        this.f22036b = constraintLayout;
        this.f22037c = simpleDraweeView;
        this.f22038d = textView;
        this.f22039e = imageView;
        this.f22040f = imageView2;
        this.f22041g = linearLayout;
        this.f22042h = simpleDraweeView2;
        this.f22043i = relativeLayout;
        this.f22044j = constraintLayout2;
        this.f22045k = textView2;
        this.f22046l = textView3;
        this.f22047m = textView4;
        this.f22048n = textView5;
        this.f22049o = textView6;
        this.f22050p = textView7;
        this.f22051q = frameLayout;
        this.f22052r = multiStandVideo;
    }

    @NonNull
    public static ItemEndGameDiscoveryListBinding bind(@NonNull View view) {
        int i4 = R.id.bannerView;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.bannerView);
        if (simpleDraweeView != null) {
            i4 = R.id.btnPlay;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btnPlay);
            if (textView != null) {
                i4 = R.id.ivHot;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivHot);
                if (imageView != null) {
                    i4 = R.id.ivTrophy;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivTrophy);
                    if (imageView2 != null) {
                        i4 = R.id.llHot;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llHot);
                        if (linearLayout != null) {
                            i4 = R.id.loading;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.loading);
                            if (simpleDraweeView2 != null) {
                                i4 = R.id.rlVideo;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rlVideo);
                                if (relativeLayout != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                    i4 = R.id.tvGameName;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameName);
                                    if (textView2 != null) {
                                        i4 = R.id.tvHot;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvHot);
                                        if (textView3 != null) {
                                            i4 = R.id.tvName;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvName);
                                            if (textView4 != null) {
                                                i4 = R.id.tvPassCount;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPassCount);
                                                if (textView5 != null) {
                                                    i4 = R.id.tvPassRatio;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPassRatio);
                                                    if (textView6 != null) {
                                                        i4 = R.id.tvPassTag;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPassTag);
                                                        if (textView7 != null) {
                                                            i4 = R.id.videoContner;
                                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.videoContner);
                                                            if (frameLayout != null) {
                                                                i4 = R.id.wf_video;
                                                                MultiStandVideo multiStandVideo = (MultiStandVideo) ViewBindings.findChildViewById(view, R.id.wf_video);
                                                                if (multiStandVideo != null) {
                                                                    return new ItemEndGameDiscoveryListBinding(constraintLayout, simpleDraweeView, textView, imageView, imageView2, linearLayout, simpleDraweeView2, relativeLayout, constraintLayout, textView2, textView3, textView4, textView5, textView6, textView7, frameLayout, multiStandVideo);
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
    public static ItemEndGameDiscoveryListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22036b;
    }

    @NonNull
    public static ItemEndGameDiscoveryListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_end_game_discovery_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
