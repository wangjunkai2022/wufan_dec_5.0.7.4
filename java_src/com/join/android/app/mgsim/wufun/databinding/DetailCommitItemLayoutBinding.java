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
import com.join.mgps.customview.CopyTextView;
import com.join.mgps.customview.CopyTextViewNew;
import com.join.mgps.customview.VipView;
/* loaded from: classes3.dex */
public final class DetailCommitItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18379b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CopyTextView f18380c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CopyTextViewNew f18381d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18382e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f18383f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final VipView f18384g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f18385h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RelativeLayout f18386i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f18387j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f18388k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f18389l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final SimpleDraweeView f18390m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f18391n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final RelativeLayout f18392o;

    private DetailCommitItemLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull CopyTextView copyTextView, @NonNull CopyTextViewNew copyTextViewNew, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull VipView vipView, @NonNull View view, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView4, @NonNull RelativeLayout relativeLayout3) {
        this.f18379b = relativeLayout;
        this.f18380c = copyTextView;
        this.f18381d = copyTextViewNew;
        this.f18382e = textView;
        this.f18383f = linearLayout;
        this.f18384g = vipView;
        this.f18385h = view;
        this.f18386i = relativeLayout2;
        this.f18387j = imageView;
        this.f18388k = textView2;
        this.f18389l = textView3;
        this.f18390m = simpleDraweeView;
        this.f18391n = textView4;
        this.f18392o = relativeLayout3;
    }

    @NonNull
    public static DetailCommitItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.content;
        CopyTextView copyTextView = (CopyTextView) ViewBindings.findChildViewById(view, R.id.content);
        if (copyTextView != null) {
            i4 = R.id.contentWeb;
            CopyTextViewNew copyTextViewNew = (CopyTextViewNew) ViewBindings.findChildViewById(view, R.id.contentWeb);
            if (copyTextViewNew != null) {
                i4 = R.id.isConnoisseurs;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.isConnoisseurs);
                if (textView != null) {
                    i4 = R.id.lLayout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.lLayout);
                    if (linearLayout != null) {
                        i4 = R.id.levelTv;
                        VipView vipView = (VipView) ViewBindings.findChildViewById(view, R.id.levelTv);
                        if (vipView != null) {
                            i4 = R.id.line0;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.line0);
                            if (findChildViewById != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) view;
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
                                                    i4 = R.id.usernameRl;
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.usernameRl);
                                                    if (relativeLayout2 != null) {
                                                        return new DetailCommitItemLayoutBinding(relativeLayout, copyTextView, copyTextViewNew, textView, linearLayout, vipView, findChildViewById, relativeLayout, imageView, textView2, textView3, simpleDraweeView, textView4, relativeLayout2);
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
    public static DetailCommitItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18379b;
    }

    @NonNull
    public static DetailCommitItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.detail_commit_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
