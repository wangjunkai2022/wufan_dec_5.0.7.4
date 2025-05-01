package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemCollectionSevenGameListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f21714b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21715c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f21716d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f21717e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f21718f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f21719g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f21720h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f21721i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ProgressBar f21722j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f21723k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ProgressBar f21724l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ProgressBar f21725m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f21726n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f21727o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f21728p;

    private ItemCollectionSevenGameListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull FrameLayout frameLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull ProgressBar progressBar, @NonNull TextView textView3, @NonNull ProgressBar progressBar2, @NonNull ProgressBar progressBar3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f21714b = constraintLayout;
        this.f21715c = textView;
        this.f21716d = frameLayout;
        this.f21717e = simpleDraweeView;
        this.f21718f = textView2;
        this.f21719g = linearLayout;
        this.f21720h = imageView;
        this.f21721i = linearLayout2;
        this.f21722j = progressBar;
        this.f21723k = textView3;
        this.f21724l = progressBar2;
        this.f21725m = progressBar3;
        this.f21726n = textView4;
        this.f21727o = textView5;
        this.f21728p = textView6;
    }

    @NonNull
    public static ItemCollectionSevenGameListBinding bind(@NonNull View view) {
        int i4 = R.id.appSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
        if (textView != null) {
            i4 = R.id.downloadView;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.downloadView);
            if (frameLayout != null) {
                i4 = R.id.gameIcon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gameIcon);
                if (simpleDraweeView != null) {
                    i4 = R.id.gameMessage;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.gameMessage);
                    if (textView2 != null) {
                        i4 = R.id.gameName;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.gameName);
                        if (linearLayout != null) {
                            i4 = R.id.giftPackageSwich;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.giftPackageSwich);
                            if (imageView != null) {
                                i4 = R.id.linearLayout2;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout2);
                                if (linearLayout2 != null) {
                                    i4 = R.id.loading_progress;
                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.loading_progress);
                                    if (progressBar != null) {
                                        i4 = R.id.loding_info;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.loding_info);
                                        if (textView3 != null) {
                                            i4 = R.id.progressBar;
                                            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                            if (progressBar2 != null) {
                                                i4 = R.id.progressBarZip;
                                                ProgressBar progressBar3 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarZip);
                                                if (progressBar3 != null) {
                                                    i4 = R.id.tvBtn;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBtn);
                                                    if (textView4 != null) {
                                                        i4 = R.id.tvGameName;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameName);
                                                        if (textView5 != null) {
                                                            i4 = R.id.tvTag;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTag);
                                                            if (textView6 != null) {
                                                                return new ItemCollectionSevenGameListBinding((ConstraintLayout) view, textView, frameLayout, simpleDraweeView, textView2, linearLayout, imageView, linearLayout2, progressBar, textView3, progressBar2, progressBar3, textView4, textView5, textView6);
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
    public static ItemCollectionSevenGameListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f21714b;
    }

    @NonNull
    public static ItemCollectionSevenGameListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_collection_seven_game_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
