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
import com.join.mgps.customview.VipView;
/* loaded from: classes3.dex */
public final class GamedetailItemCommentItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20510b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f20511c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f20512d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final VipView f20513e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f20514f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f20515g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f20516h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f20517i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f20518j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final SimpleDraweeView f20519k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f20520l;

    private GamedetailItemCommentItemLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull VipView vipView, @NonNull View view, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView4) {
        this.f20510b = linearLayout;
        this.f20511c = textView;
        this.f20512d = linearLayout2;
        this.f20513e = vipView;
        this.f20514f = view;
        this.f20515g = relativeLayout;
        this.f20516h = imageView;
        this.f20517i = textView2;
        this.f20518j = textView3;
        this.f20519k = simpleDraweeView;
        this.f20520l = textView4;
    }

    @NonNull
    public static GamedetailItemCommentItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.content;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.content);
        if (textView != null) {
            i4 = R.id.lLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.lLayout);
            if (linearLayout != null) {
                i4 = R.id.levelTv;
                VipView vipView = (VipView) ViewBindings.findChildViewById(view, R.id.levelTv);
                if (vipView != null) {
                    i4 = R.id.line;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                    if (findChildViewById != null) {
                        i4 = R.id.main;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.main);
                        if (relativeLayout != null) {
                            i4 = R.id.parise;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.parise);
                            if (imageView != null) {
                                i4 = R.id.pariseNumber;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.pariseNumber);
                                if (textView2 != null) {
                                    i4 = R.id.time;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.time);
                                    if (textView3 != null) {
                                        i4 = R.id.usericon;
                                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.usericon);
                                        if (simpleDraweeView != null) {
                                            i4 = R.id.username;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.username);
                                            if (textView4 != null) {
                                                return new GamedetailItemCommentItemLayoutBinding((LinearLayout) view, textView, linearLayout, vipView, findChildViewById, relativeLayout, imageView, textView2, textView3, simpleDraweeView, textView4);
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
    public static GamedetailItemCommentItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20510b;
    }

    @NonNull
    public static GamedetailItemCommentItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_comment_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
