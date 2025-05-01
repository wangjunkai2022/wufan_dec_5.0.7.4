package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.video.MyVideoView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class VideoLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26905b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26906c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f26907d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final VideoLoadingProgressBinding f26908e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f26909f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final MyVideoView f26910g;

    private VideoLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull VideoLoadingProgressBinding videoLoadingProgressBinding, @NonNull ImageView imageView2, @NonNull MyVideoView myVideoView) {
        this.f26905b = relativeLayout;
        this.f26906c = imageView;
        this.f26907d = simpleDraweeView;
        this.f26908e = videoLoadingProgressBinding;
        this.f26909f = imageView2;
        this.f26910g = myVideoView;
    }

    @NonNull
    public static VideoLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
        if (imageView != null) {
            i4 = R.id.cover;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.cover);
            if (simpleDraweeView != null) {
                i4 = R.id.loadingLayout;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.loadingLayout);
                if (findChildViewById != null) {
                    VideoLoadingProgressBinding bind = VideoLoadingProgressBinding.bind(findChildViewById);
                    i4 = R.id.play;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.play);
                    if (imageView2 != null) {
                        i4 = R.id.video;
                        MyVideoView myVideoView = (MyVideoView) ViewBindings.findChildViewById(view, R.id.video);
                        if (myVideoView != null) {
                            return new VideoLayoutBinding((RelativeLayout) view, imageView, simpleDraweeView, bind, imageView2, myVideoView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static VideoLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26905b;
    }

    @NonNull
    public static VideoLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.video_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
