package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
/* loaded from: classes3.dex */
public final class ActivityGameDetailBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f16206b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f16207c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f16208d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f16209e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f16210f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f16211g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final XListView2 f16212h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f16213i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f16214j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f16215k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f16216l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final SimpleDraweeView f16217m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RelativeLayout f16218n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f16219o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final SimpleDraweeView f16220p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f16221q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f16222r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f16223s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f16224t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f16225u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final XRecyclerView f16226v;

    private ActivityGameDetailBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull XListView2 xListView2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull RelativeLayout relativeLayout4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull RelativeLayout relativeLayout5, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull XRecyclerView xRecyclerView) {
        this.f16206b = relativeLayout;
        this.f16207c = textView;
        this.f16208d = relativeLayout2;
        this.f16209e = relativeLayout3;
        this.f16210f = linearLayout;
        this.f16211g = imageView;
        this.f16212h = xListView2;
        this.f16213i = linearLayout2;
        this.f16214j = linearLayout3;
        this.f16215k = linearLayout4;
        this.f16216l = relativeLayout4;
        this.f16217m = simpleDraweeView;
        this.f16218n = relativeLayout5;
        this.f16219o = textView2;
        this.f16220p = simpleDraweeView2;
        this.f16221q = textView3;
        this.f16222r = textView4;
        this.f16223s = textView5;
        this.f16224t = textView6;
        this.f16225u = textView7;
        this.f16226v = xRecyclerView;
    }

    @NonNull
    public static ActivityGameDetailBinding bind(@NonNull View view) {
        int i4 = R.id.changeModle;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.changeModle);
        if (textView != null) {
            i4 = R.id.image_cover;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.image_cover);
            if (relativeLayout != null) {
                i4 = R.id.iv_back;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.iv_back);
                if (relativeLayout2 != null) {
                    i4 = R.id.iv_nome;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_nome);
                    if (linearLayout != null) {
                        i4 = R.id.iv_share;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_share);
                        if (imageView != null) {
                            i4 = R.id.listview;
                            XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listview);
                            if (xListView2 != null) {
                                i4 = R.id.ll_gameform_title2;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_gameform_title2);
                                if (linearLayout2 != null) {
                                    i4 = R.id.main;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main);
                                    if (linearLayout3 != null) {
                                        i4 = R.id.myswip;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.myswip);
                                        if (linearLayout4 != null) {
                                            i4 = R.id.rl_back_title;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_back_title);
                                            if (relativeLayout3 != null) {
                                                i4 = R.id.smv_icon;
                                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.smv_icon);
                                                if (simpleDraweeView != null) {
                                                    i4 = R.id.smv_icon2;
                                                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.smv_icon2);
                                                    if (relativeLayout4 != null) {
                                                        i4 = R.id.title;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                                        if (textView2 != null) {
                                                            i4 = R.id.topBack;
                                                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.topBack);
                                                            if (simpleDraweeView2 != null) {
                                                                i4 = R.id.tv_btn;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_btn);
                                                                if (textView3 != null) {
                                                                    i4 = R.id.tv_game_title2;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_game_title2);
                                                                    if (textView4 != null) {
                                                                        i4 = R.id.tv_modify2;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_modify2);
                                                                        if (textView5 != null) {
                                                                            i4 = R.id.tv_name;
                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name);
                                                                            if (textView6 != null) {
                                                                                i4 = R.id.tv_time;
                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time);
                                                                                if (textView7 != null) {
                                                                                    i4 = R.id.xrecycleview;
                                                                                    XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.xrecycleview);
                                                                                    if (xRecyclerView != null) {
                                                                                        return new ActivityGameDetailBinding((RelativeLayout) view, textView, relativeLayout, relativeLayout2, linearLayout, imageView, xListView2, linearLayout2, linearLayout3, linearLayout4, relativeLayout3, simpleDraweeView, relativeLayout4, textView2, simpleDraweeView2, textView3, textView4, textView5, textView6, textView7, xRecyclerView);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityGameDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f16206b;
    }

    @NonNull
    public static ActivityGameDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_game_detail, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
