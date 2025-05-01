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
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MStarBar;
/* loaded from: classes3.dex */
public final class CommentListItemHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18168b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18169c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f18170d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final MStarBar f18171e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18172f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f18173g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f18174h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18175i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f18176j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f18177k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f18178l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f18179m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RelativeLayout f18180n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f18181o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f18182p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final SimpleDraweeView f18183q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f18184r;

    private CommentListItemHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull MStarBar mStarBar, @NonNull TextView textView2, @NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView3, @NonNull ImageView imageView2, @NonNull TextView textView4, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView7) {
        this.f18168b = linearLayout;
        this.f18169c = textView;
        this.f18170d = linearLayout2;
        this.f18171e = mStarBar;
        this.f18172f = textView2;
        this.f18173g = view;
        this.f18174h = imageView;
        this.f18175i = textView3;
        this.f18176j = imageView2;
        this.f18177k = textView4;
        this.f18178l = linearLayout3;
        this.f18179m = linearLayout4;
        this.f18180n = relativeLayout;
        this.f18181o = textView5;
        this.f18182p = textView6;
        this.f18183q = simpleDraweeView;
        this.f18184r = textView7;
    }

    @NonNull
    public static CommentListItemHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.addTime;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.addTime);
        if (textView != null) {
            i4 = R.id.commentAllRootLl;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.commentAllRootLl);
            if (linearLayout != null) {
                i4 = R.id.comment_head_mstarBar;
                MStarBar mStarBar = (MStarBar) ViewBindings.findChildViewById(view, R.id.comment_head_mstarBar);
                if (mStarBar != null) {
                    i4 = R.id.comment_head_num_tx;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.comment_head_num_tx);
                    if (textView2 != null) {
                        i4 = R.id.divider;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
                        if (findChildViewById != null) {
                            i4 = R.id.isAuth;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.isAuth);
                            if (imageView != null) {
                                i4 = R.id.isConnoisseurs;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.isConnoisseurs);
                                if (textView3 != null) {
                                    i4 = R.id.isGood;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.isGood);
                                    if (imageView2 != null) {
                                        i4 = R.id.isMe;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.isMe);
                                        if (textView4 != null) {
                                            i4 = R.id.tbl_1_ll;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tbl_1_ll);
                                            if (linearLayout2 != null) {
                                                i4 = R.id.tbl_2_ll;
                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tbl_2_ll);
                                                if (linearLayout3 != null) {
                                                    i4 = R.id.tbl_3_rl;
                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.tbl_3_rl);
                                                    if (relativeLayout != null) {
                                                        i4 = R.id.textView73;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.textView73);
                                                        if (textView5 != null) {
                                                            i4 = R.id.time;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.time);
                                                            if (textView6 != null) {
                                                                i4 = R.id.usericon;
                                                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.usericon);
                                                                if (simpleDraweeView != null) {
                                                                    i4 = R.id.username;
                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.username);
                                                                    if (textView7 != null) {
                                                                        return new CommentListItemHeaderBinding((LinearLayout) view, textView, linearLayout, mStarBar, textView2, findChildViewById, imageView, textView3, imageView2, textView4, linearLayout2, linearLayout3, relativeLayout, textView5, textView6, simpleDraweeView, textView7);
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
    public static CommentListItemHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18168b;
    }

    @NonNull
    public static CommentListItemHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.comment_list_item_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
