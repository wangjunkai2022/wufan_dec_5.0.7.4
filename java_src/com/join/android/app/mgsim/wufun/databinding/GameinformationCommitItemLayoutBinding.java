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
public final class GameinformationCommitItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21118b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21119c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f21120d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21121e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final VipView f21122f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f21123g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f21124h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f21125i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f21126j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f21127k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f21128l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final SimpleDraweeView f21129m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f21130n;

    private GameinformationCommitItemLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull VipView vipView, @NonNull View view, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView6) {
        this.f21118b = linearLayout;
        this.f21119c = textView;
        this.f21120d = linearLayout2;
        this.f21121e = textView2;
        this.f21122f = vipView;
        this.f21123g = view;
        this.f21124h = relativeLayout;
        this.f21125i = textView3;
        this.f21126j = imageView;
        this.f21127k = textView4;
        this.f21128l = textView5;
        this.f21129m = simpleDraweeView;
        this.f21130n = textView6;
    }

    @NonNull
    public static GameinformationCommitItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.content;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.content);
        if (textView != null) {
            i4 = R.id.lLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.lLayout);
            if (linearLayout != null) {
                i4 = R.id.levelTv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.levelTv);
                if (textView2 != null) {
                    i4 = R.id.levelVip;
                    VipView vipView = (VipView) ViewBindings.findChildViewById(view, R.id.levelVip);
                    if (vipView != null) {
                        i4 = R.id.line;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                        if (findChildViewById != null) {
                            i4 = R.id.main;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.main);
                            if (relativeLayout != null) {
                                i4 = R.id.more;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.more);
                                if (textView3 != null) {
                                    i4 = R.id.parise;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.parise);
                                    if (imageView != null) {
                                        i4 = R.id.pariseNumber;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.pariseNumber);
                                        if (textView4 != null) {
                                            i4 = R.id.time;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.time);
                                            if (textView5 != null) {
                                                i4 = R.id.usericon;
                                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.usericon);
                                                if (simpleDraweeView != null) {
                                                    i4 = R.id.username;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.username);
                                                    if (textView6 != null) {
                                                        return new GameinformationCommitItemLayoutBinding((LinearLayout) view, textView, linearLayout, textView2, vipView, findChildViewById, relativeLayout, textView3, imageView, textView4, textView5, simpleDraweeView, textView6);
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
    public static GameinformationCommitItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21118b;
    }

    @NonNull
    public static GameinformationCommitItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gameinformation_commit_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
