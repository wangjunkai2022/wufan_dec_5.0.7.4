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
public final class ActivityQuarkDownGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f16834b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f16835c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f16836d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f16837e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f16838f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f16839g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16840h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f16841i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f16842j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f16843k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f16844l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f16845m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final View f16846n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final View f16847o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final View f16848p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final View f16849q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final View f16850r;

    private ActivityQuarkDownGameBinding(@NonNull RelativeLayout relativeLayout, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5) {
        this.f16834b = relativeLayout;
        this.f16835c = constraintLayout;
        this.f16836d = imageView;
        this.f16837e = simpleDraweeView;
        this.f16838f = textView;
        this.f16839g = textView2;
        this.f16840h = textView3;
        this.f16841i = textView4;
        this.f16842j = textView5;
        this.f16843k = textView6;
        this.f16844l = textView7;
        this.f16845m = textView8;
        this.f16846n = view;
        this.f16847o = view2;
        this.f16848p = view3;
        this.f16849q = view4;
        this.f16850r = view5;
    }

    @NonNull
    public static ActivityQuarkDownGameBinding bind(@NonNull View view) {
        int i4 = R.id.cl_content;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.cl_content);
        if (constraintLayout != null) {
            i4 = R.id.iv_free;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_free);
            if (imageView != null) {
                i4 = R.id.sdv_game_icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.sdv_game_icon);
                if (simpleDraweeView != null) {
                    i4 = R.id.tv_desc;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc);
                    if (textView != null) {
                        i4 = R.id.tv_download;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_download);
                        if (textView2 != null) {
                            i4 = R.id.tv_game_name;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_game_name);
                            if (textView3 != null) {
                                i4 = R.id.tv_game_price;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_game_price);
                                if (textView4 != null) {
                                    i4 = R.id.tv_label;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label);
                                    if (textView5 != null) {
                                        i4 = R.id.tv_label1;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label1);
                                        if (textView6 != null) {
                                            i4 = R.id.tv_label2;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label2);
                                            if (textView7 != null) {
                                                i4 = R.id.tv_not_ask;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_not_ask);
                                                if (textView8 != null) {
                                                    i4 = R.id.v_close1;
                                                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.v_close1);
                                                    if (findChildViewById != null) {
                                                        i4 = R.id.v_d_1;
                                                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.v_d_1);
                                                        if (findChildViewById2 != null) {
                                                            i4 = R.id.v_d_2;
                                                            View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.v_d_2);
                                                            if (findChildViewById3 != null) {
                                                                i4 = R.id.v_game_info;
                                                                View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.v_game_info);
                                                                if (findChildViewById4 != null) {
                                                                    i4 = R.id.v_line;
                                                                    View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.v_line);
                                                                    if (findChildViewById5 != null) {
                                                                        return new ActivityQuarkDownGameBinding((RelativeLayout) view, constraintLayout, imageView, simpleDraweeView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityQuarkDownGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f16834b;
    }

    @NonNull
    public static ActivityQuarkDownGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_quark_down_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
