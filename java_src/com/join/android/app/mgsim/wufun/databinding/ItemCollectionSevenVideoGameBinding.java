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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.video.MultiStandVideo;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.widget.CornersLinearLayout;
/* loaded from: classes3.dex */
public final class ItemCollectionSevenVideoGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21742b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f21743c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f21744d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21745e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f21746f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f21747g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f21748h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ProgressBar f21749i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f21750j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f21751k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f21752l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final CornersLinearLayout f21753m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final MultiStandVideo f21754n;

    private ItemCollectionSevenVideoGameBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull ProgressBar progressBar, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull CornersLinearLayout cornersLinearLayout, @NonNull MultiStandVideo multiStandVideo) {
        this.f21742b = linearLayout;
        this.f21743c = simpleDraweeView;
        this.f21744d = frameLayout;
        this.f21745e = textView;
        this.f21746f = textView2;
        this.f21747g = simpleDraweeView2;
        this.f21748h = simpleDraweeView3;
        this.f21749i = progressBar;
        this.f21750j = linearLayout2;
        this.f21751k = textView3;
        this.f21752l = textView4;
        this.f21753m = cornersLinearLayout;
        this.f21754n = multiStandVideo;
    }

    @NonNull
    public static ItemCollectionSevenVideoGameBinding bind(@NonNull View view) {
        int i4 = R.id.bannerView;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.bannerView);
        if (simpleDraweeView != null) {
            i4 = R.id.downloadView;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.downloadView);
            if (frameLayout != null) {
                i4 = R.id.gameMessage;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.gameMessage);
                if (textView != null) {
                    i4 = R.id.gameName;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.gameName);
                    if (textView2 != null) {
                        i4 = R.id.icon;
                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                        if (simpleDraweeView2 != null) {
                            i4 = R.id.loading;
                            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.loading);
                            if (simpleDraweeView3 != null) {
                                i4 = R.id.loading_progress;
                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.loading_progress);
                                if (progressBar != null) {
                                    i4 = R.id.tag;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tag);
                                    if (linearLayout != null) {
                                        i4 = R.id.tvBtn;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBtn);
                                        if (textView3 != null) {
                                            i4 = R.id.tvTag;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTag);
                                            if (textView4 != null) {
                                                i4 = R.id.video;
                                                CornersLinearLayout cornersLinearLayout = (CornersLinearLayout) ViewBindings.findChildViewById(view, R.id.video);
                                                if (cornersLinearLayout != null) {
                                                    i4 = R.id.wf_video;
                                                    MultiStandVideo multiStandVideo = (MultiStandVideo) ViewBindings.findChildViewById(view, R.id.wf_video);
                                                    if (multiStandVideo != null) {
                                                        return new ItemCollectionSevenVideoGameBinding((LinearLayout) view, simpleDraweeView, frameLayout, textView, textView2, simpleDraweeView2, simpleDraweeView3, progressBar, linearLayout, textView3, textView4, cornersLinearLayout, multiStandVideo);
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
    public static ItemCollectionSevenVideoGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21742b;
    }

    @NonNull
    public static ItemCollectionSevenVideoGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_collection_seven_video_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
