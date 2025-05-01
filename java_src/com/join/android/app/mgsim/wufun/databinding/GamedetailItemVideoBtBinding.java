package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GamedetailItemVideoBtBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20787b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f20788c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f20789d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f20790e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final StandardVideoView f20791f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f20792g;

    private GamedetailItemVideoBtBinding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view, @NonNull View view2, @NonNull StandardVideoView standardVideoView, @NonNull RelativeLayout relativeLayout2) {
        this.f20787b = relativeLayout;
        this.f20788c = simpleDraweeView;
        this.f20789d = view;
        this.f20790e = view2;
        this.f20791f = standardVideoView;
        this.f20792g = relativeLayout2;
    }

    @NonNull
    public static GamedetailItemVideoBtBinding bind(@NonNull View view) {
        int i4 = R.id.iv_book_bg;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iv_book_bg);
        if (simpleDraweeView != null) {
            i4 = R.id.nullView;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.nullView);
            if (findChildViewById != null) {
                i4 = R.id.v_mask;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.v_mask);
                if (findChildViewById2 != null) {
                    i4 = R.id.videoPlayer;
                    StandardVideoView standardVideoView = (StandardVideoView) ViewBindings.findChildViewById(view, R.id.videoPlayer);
                    if (standardVideoView != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        return new GamedetailItemVideoBtBinding(relativeLayout, simpleDraweeView, findChildViewById, findChildViewById2, standardVideoView, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetailItemVideoBtBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20787b;
    }

    @NonNull
    public static GamedetailItemVideoBtBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_video_bt, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
