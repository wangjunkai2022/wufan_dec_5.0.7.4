package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SimulatorExitItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26597b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f26598c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26599d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26600e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f26601f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f26602g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f26603h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f26604i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final View f26605j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final View f26606k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26607l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final View f26608m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f26609n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f26610o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final View f26611p;

    private SimulatorExitItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view2, @NonNull View view3, @NonNull TextView textView3, @NonNull View view4, @NonNull TextView textView4, @NonNull LinearLayout linearLayout, @NonNull View view5) {
        this.f26597b = constraintLayout;
        this.f26598c = constraintLayout2;
        this.f26599d = textView;
        this.f26600e = textView2;
        this.f26601f = view;
        this.f26602g = imageView;
        this.f26603h = imageView2;
        this.f26604i = simpleDraweeView;
        this.f26605j = view2;
        this.f26606k = view3;
        this.f26607l = textView3;
        this.f26608m = view4;
        this.f26609n = textView4;
        this.f26610o = linearLayout;
        this.f26611p = view5;
    }

    @NonNull
    public static SimulatorExitItemBinding bind(@NonNull View view) {
        int i4 = R.id.constraintLayout8;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraintLayout8);
        if (constraintLayout != null) {
            i4 = R.id.count;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.count);
            if (textView != null) {
                i4 = R.id.desc;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.desc);
                if (textView2 != null) {
                    i4 = R.id.divider;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
                    if (findChildViewById != null) {
                        i4 = R.id.imageView62;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView62);
                        if (imageView != null) {
                            i4 = R.id.imageView64;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView64);
                            if (imageView2 != null) {
                                i4 = R.id.img;
                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img);
                                if (simpleDraweeView != null) {
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
                                                    i4 = R.id.score;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.score);
                                                    if (textView4 != null) {
                                                        i4 = R.id.tagLayout;
                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tagLayout);
                                                        if (linearLayout != null) {
                                                            i4 = R.id.view9;
                                                            View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.view9);
                                                            if (findChildViewById5 != null) {
                                                                return new SimulatorExitItemBinding((ConstraintLayout) view, constraintLayout, textView, textView2, findChildViewById, imageView, imageView2, simpleDraweeView, findChildViewById2, findChildViewById3, textView3, findChildViewById4, textView4, linearLayout, findChildViewById5);
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
    public static SimulatorExitItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26597b;
    }

    @NonNull
    public static SimulatorExitItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.simulator_exit_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
