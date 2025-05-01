package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SimulatorExitFriendItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26583b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f26584c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26585d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f26586e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f26587f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f26588g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f26589h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f26590i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f26591j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final View f26592k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final View f26593l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26594m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final View f26595n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f26596o;

    private SimulatorExitFriendItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView2, @NonNull ImageView imageView3, @NonNull View view2, @NonNull View view3, @NonNull TextView textView3, @NonNull View view4, @NonNull ImageView imageView4) {
        this.f26583b = constraintLayout;
        this.f26584c = simpleDraweeView;
        this.f26585d = textView;
        this.f26586e = view;
        this.f26587f = imageView;
        this.f26588g = imageView2;
        this.f26589h = simpleDraweeView2;
        this.f26590i = textView2;
        this.f26591j = imageView3;
        this.f26592k = view2;
        this.f26593l = view3;
        this.f26594m = textView3;
        this.f26595n = view4;
        this.f26596o = imageView4;
    }

    @NonNull
    public static SimulatorExitFriendItemBinding bind(@NonNull View view) {
        int i4 = R.id.avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.avatar);
        if (simpleDraweeView != null) {
            i4 = R.id.btn;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btn);
            if (textView != null) {
                i4 = R.id.divider;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
                if (findChildViewById != null) {
                    i4 = R.id.icLevel1;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.icLevel1);
                    if (imageView != null) {
                        i4 = R.id.icLevel1Bg;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.icLevel1Bg);
                        if (imageView2 != null) {
                            i4 = R.id.img;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img);
                            if (simpleDraweeView2 != null) {
                                i4 = R.id.label;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.label);
                                if (textView2 != null) {
                                    i4 = R.id.like;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.like);
                                    if (imageView3 != null) {
                                        i4 = R.id.ml;
                                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.ml);
                                        if (findChildViewById2 != null) {
                                            i4 = R.id.mr;
                                            View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.mr);
                                            if (findChildViewById3 != null) {
                                                i4 = R.id.name;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                                                if (textView3 != null) {
                                                    i4 = R.id.rect;
                                                    View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.rect);
                                                    if (findChildViewById4 != null) {
                                                        i4 = R.id.vip;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.vip);
                                                        if (imageView4 != null) {
                                                            return new SimulatorExitFriendItemBinding((ConstraintLayout) view, simpleDraweeView, textView, findChildViewById, imageView, imageView2, simpleDraweeView2, textView2, imageView3, findChildViewById2, findChildViewById3, textView3, findChildViewById4, imageView4);
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
    public static SimulatorExitFriendItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26583b;
    }

    @NonNull
    public static SimulatorExitFriendItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.simulator_exit_friend_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
