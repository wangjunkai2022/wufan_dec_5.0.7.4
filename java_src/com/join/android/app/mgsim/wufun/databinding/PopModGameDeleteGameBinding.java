package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PopModGameDeleteGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26031b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26032c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26033d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f26034e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f26035f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f26036g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f26037h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f26038i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26039j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final RelativeLayout f26040k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f26041l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26042m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final View f26043n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final View f26044o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final View f26045p;

    private PopModGameDeleteGameBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView5, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f26031b = constraintLayout;
        this.f26032c = textView;
        this.f26033d = textView2;
        this.f26034e = simpleDraweeView;
        this.f26035f = simpleDraweeView2;
        this.f26036g = imageView;
        this.f26037h = imageView2;
        this.f26038i = textView3;
        this.f26039j = textView4;
        this.f26040k = relativeLayout;
        this.f26041l = relativeLayout2;
        this.f26042m = textView5;
        this.f26043n = view;
        this.f26044o = view2;
        this.f26045p = view3;
    }

    @NonNull
    public static PopModGameDeleteGameBinding bind(@NonNull View view) {
        int i4 = R.id.cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.cancel);
        if (textView != null) {
            i4 = R.id.delete;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.delete);
            if (textView2 != null) {
                i4 = R.id.icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                if (simpleDraweeView != null) {
                    i4 = R.id.icon_mod;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon_mod);
                    if (simpleDraweeView2 != null) {
                        i4 = R.id.iv_mod_check;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_mod_check);
                        if (imageView != null) {
                            i4 = R.id.iv_stand_check;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_stand_check);
                            if (imageView2 != null) {
                                i4 = R.id.name;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                                if (textView3 != null) {
                                    i4 = R.id.name_mod;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.name_mod);
                                    if (textView4 != null) {
                                        i4 = R.id.rl_mod;
                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_mod);
                                        if (relativeLayout != null) {
                                            i4 = R.id.rl_stand;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_stand);
                                            if (relativeLayout2 != null) {
                                                i4 = R.id.tv_title;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                                if (textView5 != null) {
                                                    i4 = R.id.v_line;
                                                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.v_line);
                                                    if (findChildViewById != null) {
                                                        i4 = R.id.view5;
                                                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.view5);
                                                        if (findChildViewById2 != null) {
                                                            i4 = R.id.view8;
                                                            View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.view8);
                                                            if (findChildViewById3 != null) {
                                                                return new PopModGameDeleteGameBinding((ConstraintLayout) view, textView, textView2, simpleDraweeView, simpleDraweeView2, imageView, imageView2, textView3, textView4, relativeLayout, relativeLayout2, textView5, findChildViewById, findChildViewById2, findChildViewById3);
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
    public static PopModGameDeleteGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26031b;
    }

    @NonNull
    public static PopModGameDeleteGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.pop_mod_game_delete_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
