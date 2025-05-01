package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.video.MultiStandVideo;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PapamainGamelistGridLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f25716b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25717c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f25718d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final CardView f25719e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ConstraintLayout f25720f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f25721g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f25722h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ProgressBar f25723i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25724j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ProgressBar f25725k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ProgressBar f25726l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f25727m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f25728n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f25729o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final MultiStandVideo f25730p;

    private PapamainGamelistGridLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull FrameLayout frameLayout, @NonNull CardView cardView, @NonNull ConstraintLayout constraintLayout2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull TextView textView2, @NonNull ProgressBar progressBar2, @NonNull ProgressBar progressBar3, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull MultiStandVideo multiStandVideo) {
        this.f25716b = constraintLayout;
        this.f25717c = textView;
        this.f25718d = frameLayout;
        this.f25719e = cardView;
        this.f25720f = constraintLayout2;
        this.f25721g = simpleDraweeView;
        this.f25722h = linearLayout;
        this.f25723i = progressBar;
        this.f25724j = textView2;
        this.f25725k = progressBar2;
        this.f25726l = progressBar3;
        this.f25727m = textView3;
        this.f25728n = textView4;
        this.f25729o = textView5;
        this.f25730p = multiStandVideo;
    }

    @NonNull
    public static PapamainGamelistGridLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.appSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
        if (textView != null) {
            i4 = R.id.flBtn;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.flBtn);
            if (frameLayout != null) {
                i4 = R.id.flContainer;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.flContainer);
                if (cardView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i4 = R.id.ivGamePic;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivGamePic);
                    if (simpleDraweeView != null) {
                        i4 = R.id.llInfo;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llInfo);
                        if (linearLayout != null) {
                            i4 = R.id.loading_progress;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.loading_progress);
                            if (progressBar != null) {
                                i4 = R.id.loding_info;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.loding_info);
                                if (textView2 != null) {
                                    i4 = R.id.progressBar;
                                    ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                    if (progressBar2 != null) {
                                        i4 = R.id.progressBarZip;
                                        ProgressBar progressBar3 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarZip);
                                        if (progressBar3 != null) {
                                            i4 = R.id.tvBtn;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBtn);
                                            if (textView3 != null) {
                                                i4 = R.id.tvGameName;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameName);
                                                if (textView4 != null) {
                                                    i4 = R.id.tvGameTags;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameTags);
                                                    if (textView5 != null) {
                                                        i4 = R.id.wf_video;
                                                        MultiStandVideo multiStandVideo = (MultiStandVideo) ViewBindings.findChildViewById(view, R.id.wf_video);
                                                        if (multiStandVideo != null) {
                                                            return new PapamainGamelistGridLayoutBinding(constraintLayout, textView, frameLayout, cardView, constraintLayout, simpleDraweeView, linearLayout, progressBar, textView2, progressBar2, progressBar3, textView3, textView4, textView5, multiStandVideo);
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
    public static PapamainGamelistGridLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f25716b;
    }

    @NonNull
    public static PapamainGamelistGridLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_gamelist_grid_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
