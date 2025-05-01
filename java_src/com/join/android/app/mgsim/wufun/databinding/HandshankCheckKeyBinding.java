package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class HandshankCheckKeyBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21372b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f21373c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f21374d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f21375e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f21376f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f21377g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f21378h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f21379i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f21380j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f21381k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f21382l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f21383m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f21384n;

    private HandshankCheckKeyBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull ImageView imageView8, @NonNull ImageView imageView9, @NonNull ImageView imageView10, @NonNull ImageView imageView11) {
        this.f21372b = linearLayout;
        this.f21373c = imageView;
        this.f21374d = imageView2;
        this.f21375e = imageView3;
        this.f21376f = frameLayout;
        this.f21377g = imageView4;
        this.f21378h = imageView5;
        this.f21379i = imageView6;
        this.f21380j = imageView7;
        this.f21381k = imageView8;
        this.f21382l = imageView9;
        this.f21383m = imageView10;
        this.f21384n = imageView11;
    }

    @NonNull
    public static HandshankCheckKeyBinding bind(@NonNull View view) {
        int i4 = R.id.f15589a;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.f15589a);
        if (imageView != null) {
            i4 = R.id.f15591b;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.f15591b);
            if (imageView2 != null) {
                i4 = R.id.handshank_check_cross;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.handshank_check_cross);
                if (imageView3 != null) {
                    i4 = R.id.handshank_check_layout;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.handshank_check_layout);
                    if (frameLayout != null) {
                        i4 = R.id.handshank_check_lb;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.handshank_check_lb);
                        if (imageView4 != null) {
                            i4 = R.id.handshank_check_ls;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.handshank_check_ls);
                            if (imageView5 != null) {
                                i4 = R.id.handshank_check_rb;
                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.handshank_check_rb);
                                if (imageView6 != null) {
                                    i4 = R.id.handshank_check_rs;
                                    ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.handshank_check_rs);
                                    if (imageView7 != null) {
                                        i4 = R.id.handshank_check_stick_l;
                                        ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.handshank_check_stick_l);
                                        if (imageView8 != null) {
                                            i4 = R.id.handshank_check_stick_r;
                                            ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.handshank_check_stick_r);
                                            if (imageView9 != null) {
                                                i4 = R.id.f15620x;
                                                ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(view, R.id.f15620x);
                                                if (imageView10 != null) {
                                                    i4 = R.id.f15621y;
                                                    ImageView imageView11 = (ImageView) ViewBindings.findChildViewById(view, R.id.f15621y);
                                                    if (imageView11 != null) {
                                                        return new HandshankCheckKeyBinding((LinearLayout) view, imageView, imageView2, imageView3, frameLayout, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11);
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
    public static HandshankCheckKeyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21372b;
    }

    @NonNull
    public static HandshankCheckKeyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.handshank_check_key, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
