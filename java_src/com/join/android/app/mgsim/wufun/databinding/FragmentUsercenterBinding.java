package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentUsercenterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20146b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f20147c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f20148d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f20149e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f20150f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f20151g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f20152h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f20153i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final GridView f20154j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f20155k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f20156l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f20157m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f20158n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f20159o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f20160p;

    private FragmentUsercenterBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull GridView gridView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f20146b = linearLayout;
        this.f20147c = imageView;
        this.f20148d = simpleDraweeView;
        this.f20149e = imageView2;
        this.f20150f = linearLayout2;
        this.f20151g = linearLayout3;
        this.f20152h = linearLayout4;
        this.f20153i = linearLayout5;
        this.f20154j = gridView;
        this.f20155k = textView;
        this.f20156l = textView2;
        this.f20157m = textView3;
        this.f20158n = textView4;
        this.f20159o = textView5;
        this.f20160p = textView6;
    }

    @NonNull
    public static FragmentUsercenterBinding bind(@NonNull View view) {
        int i4 = R.id.iv_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_arrow);
        if (imageView != null) {
            i4 = R.id.iv_user_avatar;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iv_user_avatar);
            if (simpleDraweeView != null) {
                i4 = R.id.iv_user_vip;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_user_vip);
                if (imageView2 != null) {
                    i4 = R.id.ll_copper;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_copper);
                    if (linearLayout != null) {
                        i4 = R.id.ll_members;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_members);
                        if (linearLayout2 != null) {
                            i4 = R.id.ll_svip;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_svip);
                            if (linearLayout3 != null) {
                                i4 = R.id.ll_userinfo;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_userinfo);
                                if (linearLayout4 != null) {
                                    i4 = R.id.mGridView;
                                    GridView gridView = (GridView) ViewBindings.findChildViewById(view, R.id.mGridView);
                                    if (gridView != null) {
                                        i4 = R.id.tv_user_account;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_user_account);
                                        if (textView != null) {
                                            i4 = R.id.tv_user_coppers;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_user_coppers);
                                            if (textView2 != null) {
                                                i4 = R.id.tv_user_member;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_user_member);
                                                if (textView3 != null) {
                                                    i4 = R.id.tv_user_nickname;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_user_nickname);
                                                    if (textView4 != null) {
                                                        i4 = R.id.tv_user_rank;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_user_rank);
                                                        if (textView5 != null) {
                                                            i4 = R.id.tv_user_svip;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_user_svip);
                                                            if (textView6 != null) {
                                                                return new FragmentUsercenterBinding((LinearLayout) view, imageView, simpleDraweeView, imageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, gridView, textView, textView2, textView3, textView4, textView5, textView6);
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
    public static FragmentUsercenterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20146b;
    }

    @NonNull
    public static FragmentUsercenterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_usercenter, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
