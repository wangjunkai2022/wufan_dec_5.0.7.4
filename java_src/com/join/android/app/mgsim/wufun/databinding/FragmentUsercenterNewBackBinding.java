package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentUsercenterNewBackBinding implements ViewBinding {
    @NonNull
    public final TextView A;
    @NonNull
    public final TextView B;
    @NonNull
    public final TextView C;
    @NonNull
    public final RelativeLayout D;
    @NonNull
    public final ImageView E;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20161b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f20162c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f20163d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f20164e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f20165f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f20166g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f20167h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f20168i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f20169j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f20170k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f20171l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final GridView f20172m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final GridView f20173n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final GridView f20174o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f20175p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f20176q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f20177r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final NestedScrollView f20178s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f20179t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f20180u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final TextView f20181v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final RelativeLayout f20182w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final TextView f20183x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final TextView f20184y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final TextView f20185z;

    private FragmentUsercenterNewBackBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull GridView gridView, @NonNull GridView gridView2, @NonNull GridView gridView3, @NonNull LinearLayout linearLayout5, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull NestedScrollView nestedScrollView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TextView textView13, @NonNull RelativeLayout relativeLayout3, @NonNull ImageView imageView3) {
        this.f20161b = relativeLayout;
        this.f20162c = textView;
        this.f20163d = imageView;
        this.f20164e = simpleDraweeView;
        this.f20165f = simpleDraweeView2;
        this.f20166g = imageView2;
        this.f20167h = linearLayout;
        this.f20168i = textView2;
        this.f20169j = linearLayout2;
        this.f20170k = linearLayout3;
        this.f20171l = linearLayout4;
        this.f20172m = gridView;
        this.f20173n = gridView2;
        this.f20174o = gridView3;
        this.f20175p = linearLayout5;
        this.f20176q = textView3;
        this.f20177r = textView4;
        this.f20178s = nestedScrollView;
        this.f20179t = textView5;
        this.f20180u = textView6;
        this.f20181v = textView7;
        this.f20182w = relativeLayout2;
        this.f20183x = textView8;
        this.f20184y = textView9;
        this.f20185z = textView10;
        this.A = textView11;
        this.B = textView12;
        this.C = textView13;
        this.D = relativeLayout3;
        this.E = imageView3;
    }

    @NonNull
    public static FragmentUsercenterNewBackBinding bind(@NonNull View view) {
        int i4 = R.id.firstCardTitle;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.firstCardTitle);
        if (textView != null) {
            i4 = R.id.iv_arrow;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_arrow);
            if (imageView != null) {
                i4 = R.id.iv_user_avatar;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iv_user_avatar);
                if (simpleDraweeView != null) {
                    i4 = R.id.iv_user_avatar2;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iv_user_avatar2);
                    if (simpleDraweeView2 != null) {
                        i4 = R.id.iv_user_vip;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_user_vip);
                        if (imageView2 != null) {
                            i4 = R.id.ll_copper;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_copper);
                            if (linearLayout != null) {
                                i4 = R.id.ll_copperTitle;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.ll_copperTitle);
                                if (textView2 != null) {
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
                                                    i4 = R.id.mGridView2;
                                                    GridView gridView2 = (GridView) ViewBindings.findChildViewById(view, R.id.mGridView2);
                                                    if (gridView2 != null) {
                                                        i4 = R.id.mGridView3;
                                                        GridView gridView3 = (GridView) ViewBindings.findChildViewById(view, R.id.mGridView3);
                                                        if (gridView3 != null) {
                                                            i4 = R.id.onekey;
                                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.onekey);
                                                            if (linearLayout5 != null) {
                                                                i4 = R.id.onekeyMessage;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.onekeyMessage);
                                                                if (textView3 != null) {
                                                                    i4 = R.id.onekeyTitle;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.onekeyTitle);
                                                                    if (textView4 != null) {
                                                                        i4 = R.id.scroolView;
                                                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, R.id.scroolView);
                                                                        if (nestedScrollView != null) {
                                                                            i4 = R.id.seconedCardTitle;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.seconedCardTitle);
                                                                            if (textView5 != null) {
                                                                                i4 = R.id.svipTitle;
                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.svipTitle);
                                                                                if (textView6 != null) {
                                                                                    i4 = R.id.thirdCardTitle;
                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.thirdCardTitle);
                                                                                    if (textView7 != null) {
                                                                                        i4 = R.id.titleLayout;
                                                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.titleLayout);
                                                                                        if (relativeLayout != null) {
                                                                                            i4 = R.id.tv_user_account;
                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_user_account);
                                                                                            if (textView8 != null) {
                                                                                                i4 = R.id.tv_user_coppers;
                                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_user_coppers);
                                                                                                if (textView9 != null) {
                                                                                                    i4 = R.id.tv_user_member;
                                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_user_member);
                                                                                                    if (textView10 != null) {
                                                                                                        i4 = R.id.tv_user_nickname;
                                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_user_nickname);
                                                                                                        if (textView11 != null) {
                                                                                                            i4 = R.id.tv_user_rank;
                                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_user_rank);
                                                                                                            if (textView12 != null) {
                                                                                                                i4 = R.id.tv_user_svip;
                                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_user_svip);
                                                                                                                if (textView13 != null) {
                                                                                                                    i4 = R.id.userLayout;
                                                                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.userLayout);
                                                                                                                    if (relativeLayout2 != null) {
                                                                                                                        i4 = R.id.vipCard;
                                                                                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.vipCard);
                                                                                                                        if (imageView3 != null) {
                                                                                                                            return new FragmentUsercenterNewBackBinding((RelativeLayout) view, textView, imageView, simpleDraweeView, simpleDraweeView2, imageView2, linearLayout, textView2, linearLayout2, linearLayout3, linearLayout4, gridView, gridView2, gridView3, linearLayout5, textView3, textView4, nestedScrollView, textView5, textView6, textView7, relativeLayout, textView8, textView9, textView10, textView11, textView12, textView13, relativeLayout2, imageView3);
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
    public static FragmentUsercenterNewBackBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20161b;
    }

    @NonNull
    public static FragmentUsercenterNewBackBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_usercenter_new_back, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
