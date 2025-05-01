package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GameDetailItemV1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20276b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f20277c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f20278d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f20279e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f20280f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f20281g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f20282h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final FrameLayout f20283i;

    private GameDetailItemV1Binding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull SimpleDraweeView simpleDraweeView4, @NonNull RelativeLayout relativeLayout2, @NonNull FrameLayout frameLayout) {
        this.f20276b = relativeLayout;
        this.f20277c = simpleDraweeView;
        this.f20278d = simpleDraweeView2;
        this.f20279e = imageView;
        this.f20280f = simpleDraweeView3;
        this.f20281g = simpleDraweeView4;
        this.f20282h = relativeLayout2;
        this.f20283i = frameLayout;
    }

    @NonNull
    public static GameDetailItemV1Binding bind(@NonNull View view) {
        int i4 = R.id.bannerView;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.bannerView);
        if (simpleDraweeView != null) {
            i4 = R.id.imageViewHPic;
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.imageViewHPic);
            if (simpleDraweeView2 != null) {
                i4 = R.id.imageViewPlay;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageViewPlay);
                if (imageView != null) {
                    i4 = R.id.imageViewVPic;
                    SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.imageViewVPic);
                    if (simpleDraweeView3 != null) {
                        i4 = R.id.loading;
                        SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.loading);
                        if (simpleDraweeView4 != null) {
                            i4 = R.id.rl_video;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_video);
                            if (relativeLayout != null) {
                                i4 = R.id.videoContner;
                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.videoContner);
                                if (frameLayout != null) {
                                    return new GameDetailItemV1Binding((RelativeLayout) view, simpleDraweeView, simpleDraweeView2, imageView, simpleDraweeView3, simpleDraweeView4, relativeLayout, frameLayout);
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
    public static GameDetailItemV1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20276b;
    }

    @NonNull
    public static GameDetailItemV1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.game_detail_item_v1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
