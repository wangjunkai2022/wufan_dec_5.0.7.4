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
public final class GamedetailItemVideoBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20782b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f20783c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f20784d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final StandardVideoView f20785e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f20786f;

    private GamedetailItemVideoBinding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view, @NonNull StandardVideoView standardVideoView, @NonNull RelativeLayout relativeLayout2) {
        this.f20782b = relativeLayout;
        this.f20783c = simpleDraweeView;
        this.f20784d = view;
        this.f20785e = standardVideoView;
        this.f20786f = relativeLayout2;
    }

    @NonNull
    public static GamedetailItemVideoBinding bind(@NonNull View view) {
        int i4 = R.id.iv_book_bg;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iv_book_bg);
        if (simpleDraweeView != null) {
            i4 = R.id.nullView;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.nullView);
            if (findChildViewById != null) {
                i4 = R.id.videoPlayer;
                StandardVideoView standardVideoView = (StandardVideoView) ViewBindings.findChildViewById(view, R.id.videoPlayer);
                if (standardVideoView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return new GamedetailItemVideoBinding(relativeLayout, simpleDraweeView, findChildViewById, standardVideoView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetailItemVideoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20782b;
    }

    @NonNull
    public static GamedetailItemVideoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_video, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
