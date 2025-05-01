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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutInviteBattleBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23112b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23113c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f23114d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f23115e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f23116f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f23117g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f23118h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f23119i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f23120j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f23121k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final View f23122l;

    private LayoutInviteBattleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull View view, @NonNull View view2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view3) {
        this.f23112b = constraintLayout;
        this.f23113c = imageView;
        this.f23114d = imageView2;
        this.f23115e = imageView3;
        this.f23116f = imageView4;
        this.f23117g = view;
        this.f23118h = view2;
        this.f23119i = textView;
        this.f23120j = textView2;
        this.f23121k = textView3;
        this.f23122l = view3;
    }

    @NonNull
    public static LayoutInviteBattleBinding bind(@NonNull View view) {
        int i4 = R.id.imageView66;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView66);
        if (imageView != null) {
            i4 = R.id.imageView68;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView68);
            if (imageView2 != null) {
                i4 = R.id.imageView69;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView69);
                if (imageView3 != null) {
                    i4 = R.id.imageView70;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView70);
                    if (imageView4 != null) {
                        i4 = R.id.iv_close;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.iv_close);
                        if (findChildViewById != null) {
                            i4 = R.id.qq;
                            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.qq);
                            if (findChildViewById2 != null) {
                                i4 = R.id.textView97;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView97);
                                if (textView != null) {
                                    i4 = R.id.textView98;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView98);
                                    if (textView2 != null) {
                                        i4 = R.id.textView99;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView99);
                                        if (textView3 != null) {
                                            i4 = R.id.wechat;
                                            View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.wechat);
                                            if (findChildViewById3 != null) {
                                                return new LayoutInviteBattleBinding((ConstraintLayout) view, imageView, imageView2, imageView3, imageView4, findChildViewById, findChildViewById2, textView, textView2, textView3, findChildViewById3);
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
    public static LayoutInviteBattleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23112b;
    }

    @NonNull
    public static LayoutInviteBattleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_invite_battle, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
