package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.video.MultiStandVideo;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemMyGameGuesslikeItemVideoBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CardView f22485b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22486c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22487d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f22488e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f22489f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final MultiStandVideo f22490g;

    private ItemMyGameGuesslikeItemVideoBinding(@NonNull CardView cardView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ProgressBar progressBar, @NonNull RelativeLayout relativeLayout, @NonNull MultiStandVideo multiStandVideo) {
        this.f22485b = cardView;
        this.f22486c = textView;
        this.f22487d = textView2;
        this.f22488e = progressBar;
        this.f22489f = relativeLayout;
        this.f22490g = multiStandVideo;
    }

    @NonNull
    public static ItemMyGameGuesslikeItemVideoBinding bind(@NonNull View view) {
        int i4 = R.id.appName;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
        if (textView != null) {
            i4 = R.id.mgListviewItemInstall;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemInstall);
            if (textView2 != null) {
                i4 = R.id.pb_loading;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_loading);
                if (progressBar != null) {
                    i4 = R.id.rLayoutRight;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rLayoutRight);
                    if (relativeLayout != null) {
                        i4 = R.id.wf_video;
                        MultiStandVideo multiStandVideo = (MultiStandVideo) ViewBindings.findChildViewById(view, R.id.wf_video);
                        if (multiStandVideo != null) {
                            return new ItemMyGameGuesslikeItemVideoBinding((CardView) view, textView, textView2, progressBar, relativeLayout, multiStandVideo);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemMyGameGuesslikeItemVideoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CardView getRoot() {
        return this.f22485b;
    }

    @NonNull
    public static ItemMyGameGuesslikeItemVideoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_my_game_guesslike_item_video, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
