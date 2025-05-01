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
public final class LayoutInviteBattle1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23104b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23105c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f23106d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f23107e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f23108f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f23109g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f23110h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f23111i;

    private LayoutInviteBattle1Binding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23104b = constraintLayout;
        this.f23105c = imageView;
        this.f23106d = imageView2;
        this.f23107e = imageView3;
        this.f23108f = imageView4;
        this.f23109g = view;
        this.f23110h = textView;
        this.f23111i = textView2;
    }

    @NonNull
    public static LayoutInviteBattle1Binding bind(@NonNull View view) {
        int i4 = R.id.button;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.button);
        if (imageView != null) {
            i4 = R.id.button1;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.button1);
            if (imageView2 != null) {
                i4 = R.id.imageView66;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView66);
                if (imageView3 != null) {
                    i4 = R.id.imageView68;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView68);
                    if (imageView4 != null) {
                        i4 = R.id.iv_close;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.iv_close);
                        if (findChildViewById != null) {
                            i4 = R.id.textView97;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView97);
                            if (textView != null) {
                                i4 = R.id.txt;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt);
                                if (textView2 != null) {
                                    return new LayoutInviteBattle1Binding((ConstraintLayout) view, imageView, imageView2, imageView3, imageView4, findChildViewById, textView, textView2);
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
    public static LayoutInviteBattle1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23104b;
    }

    @NonNull
    public static LayoutInviteBattle1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_invite_battle1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
