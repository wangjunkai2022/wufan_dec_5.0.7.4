package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.video.EmptyControlVideoView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SplashActivityLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26661b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f26662c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26663d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f26664e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26665f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f26666g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26667h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final EmptyControlVideoView f26668i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final SimpleDraweeView f26669j;

    private SplashActivityLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull TextView textView3, @NonNull EmptyControlVideoView emptyControlVideoView, @NonNull SimpleDraweeView simpleDraweeView) {
        this.f26661b = relativeLayout;
        this.f26662c = relativeLayout2;
        this.f26663d = textView;
        this.f26664e = relativeLayout3;
        this.f26665f = textView2;
        this.f26666g = imageView;
        this.f26667h = textView3;
        this.f26668i = emptyControlVideoView;
        this.f26669j = simpleDraweeView;
    }

    @NonNull
    public static SplashActivityLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.bottomImag;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.bottomImag);
        if (relativeLayout != null) {
            i4 = R.id.countdown;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.countdown);
            if (textView != null) {
                i4 = R.id.countdownLayout;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.countdownLayout);
                if (relativeLayout2 != null) {
                    i4 = R.id.countdownVideo;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.countdownVideo);
                    if (textView2 != null) {
                        i4 = R.id.imageView24;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView24);
                        if (imageView != null) {
                            i4 = R.id.textViewVersion;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textViewVersion);
                            if (textView3 != null) {
                                i4 = R.id.video_player;
                                EmptyControlVideoView emptyControlVideoView = (EmptyControlVideoView) ViewBindings.findChildViewById(view, R.id.video_player);
                                if (emptyControlVideoView != null) {
                                    i4 = R.id.viewImage;
                                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.viewImage);
                                    if (simpleDraweeView != null) {
                                        return new SplashActivityLayoutBinding((RelativeLayout) view, relativeLayout, textView, relativeLayout2, textView2, imageView, textView3, emptyControlVideoView, simpleDraweeView);
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
    public static SplashActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26661b;
    }

    @NonNull
    public static SplashActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.splash_activity_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
