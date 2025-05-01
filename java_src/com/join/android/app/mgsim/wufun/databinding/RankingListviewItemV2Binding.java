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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class RankingListviewItemV2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26205b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26206c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f26207d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f26208e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f26209f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ProgressBar f26210g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26211h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ProgressBar f26212i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ProgressBar f26213j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f26214k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26215l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26216m;

    private RankingListviewItemV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull FrameLayout frameLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull TextView textView2, @NonNull ProgressBar progressBar2, @NonNull ProgressBar progressBar3, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f26205b = constraintLayout;
        this.f26206c = textView;
        this.f26207d = frameLayout;
        this.f26208e = simpleDraweeView;
        this.f26209f = linearLayout;
        this.f26210g = progressBar;
        this.f26211h = textView2;
        this.f26212i = progressBar2;
        this.f26213j = progressBar3;
        this.f26214k = textView3;
        this.f26215l = textView4;
        this.f26216m = textView5;
    }

    @NonNull
    public static RankingListviewItemV2Binding bind(@NonNull View view) {
        int i4 = R.id.appSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
        if (textView != null) {
            i4 = R.id.flBtn;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.flBtn);
            if (frameLayout != null) {
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
                                                i4 = R.id.tvTags;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTags);
                                                if (textView5 != null) {
                                                    return new RankingListviewItemV2Binding((ConstraintLayout) view, textView, frameLayout, simpleDraweeView, linearLayout, progressBar, textView2, progressBar2, progressBar3, textView3, textView4, textView5);
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
    public static RankingListviewItemV2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26205b;
    }

    @NonNull
    public static RankingListviewItemV2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.ranking_listview_item_v2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
