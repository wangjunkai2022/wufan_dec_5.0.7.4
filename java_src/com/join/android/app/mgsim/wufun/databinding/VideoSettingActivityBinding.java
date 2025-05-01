package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class VideoSettingActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26983b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f26984c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26985d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f26986e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f26987f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f26988g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f26989h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TopbarLeftTitleLayoutBinding f26990i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RelativeLayout f26991j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f26992k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f26993l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f26994m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RelativeLayout f26995n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f26996o;

    private VideoSettingActivityBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout3, @NonNull ImageView imageView3, @NonNull TopbarLeftTitleLayoutBinding topbarLeftTitleLayoutBinding, @NonNull RelativeLayout relativeLayout4, @NonNull ImageView imageView4, @NonNull RelativeLayout relativeLayout5, @NonNull ImageView imageView5, @NonNull RelativeLayout relativeLayout6, @NonNull ImageView imageView6) {
        this.f26983b = linearLayout;
        this.f26984c = relativeLayout;
        this.f26985d = imageView;
        this.f26986e = relativeLayout2;
        this.f26987f = imageView2;
        this.f26988g = relativeLayout3;
        this.f26989h = imageView3;
        this.f26990i = topbarLeftTitleLayoutBinding;
        this.f26991j = relativeLayout4;
        this.f26992k = imageView4;
        this.f26993l = relativeLayout5;
        this.f26994m = imageView5;
        this.f26995n = relativeLayout6;
        this.f26996o = imageView6;
    }

    @NonNull
    public static VideoSettingActivityBinding bind(@NonNull View view) {
        int i4 = R.id.homevideoAllNet;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.homevideoAllNet);
        if (relativeLayout != null) {
            i4 = R.id.homevideoAllNetSwitch;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.homevideoAllNetSwitch);
            if (imageView != null) {
                i4 = R.id.homevideoNotPlay;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.homevideoNotPlay);
                if (relativeLayout2 != null) {
                    i4 = R.id.homevideoNotPlaySwitch;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.homevideoNotPlaySwitch);
                    if (imageView2 != null) {
                        i4 = R.id.homevideoOnlyWifi;
                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.homevideoOnlyWifi);
                        if (relativeLayout3 != null) {
                            i4 = R.id.homevideoOnlyWifiSwitch;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.homevideoOnlyWifiSwitch);
                            if (imageView3 != null) {
                                i4 = R.id.title_bar_layout;
                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar_layout);
                                if (findChildViewById != null) {
                                    TopbarLeftTitleLayoutBinding bind = TopbarLeftTitleLayoutBinding.bind(findChildViewById);
                                    i4 = R.id.videoAllNet;
                                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.videoAllNet);
                                    if (relativeLayout4 != null) {
                                        i4 = R.id.videoAllNetSwitch;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.videoAllNetSwitch);
                                        if (imageView4 != null) {
                                            i4 = R.id.videoNotPlay;
                                            RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.videoNotPlay);
                                            if (relativeLayout5 != null) {
                                                i4 = R.id.videoNotPlaySwitch;
                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.videoNotPlaySwitch);
                                                if (imageView5 != null) {
                                                    i4 = R.id.videoOnlyWifi;
                                                    RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.videoOnlyWifi);
                                                    if (relativeLayout6 != null) {
                                                        i4 = R.id.videoOnlyWifiSwitch;
                                                        ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.videoOnlyWifiSwitch);
                                                        if (imageView6 != null) {
                                                            return new VideoSettingActivityBinding((LinearLayout) view, relativeLayout, imageView, relativeLayout2, imageView2, relativeLayout3, imageView3, bind, relativeLayout4, imageView4, relativeLayout5, imageView5, relativeLayout6, imageView6);
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
    public static VideoSettingActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26983b;
    }

    @NonNull
    public static VideoSettingActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.video_setting_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
