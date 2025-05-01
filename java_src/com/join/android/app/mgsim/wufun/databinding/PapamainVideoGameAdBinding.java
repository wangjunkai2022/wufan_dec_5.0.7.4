package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.video.MultiStandVideo;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PapamainVideoGameAdBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f25834b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Barrier f25835c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f25836d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f25837e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25838f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25839g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final MultiStandVideo f25840h;

    private PapamainVideoGameAdBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull MultiStandVideo multiStandVideo) {
        this.f25834b = constraintLayout;
        this.f25835c = barrier;
        this.f25836d = frameLayout;
        this.f25837e = constraintLayout2;
        this.f25838f = textView;
        this.f25839g = textView2;
        this.f25840h = multiStandVideo;
    }

    @NonNull
    public static PapamainVideoGameAdBinding bind(@NonNull View view) {
        int i4 = R.id.barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, R.id.barrier);
        if (barrier != null) {
            i4 = R.id.flBtn;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.flBtn);
            if (frameLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i4 = R.id.tvBtn;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBtn);
                if (textView != null) {
                    i4 = R.id.tvGameName;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameName);
                    if (textView2 != null) {
                        i4 = R.id.wf_video;
                        MultiStandVideo multiStandVideo = (MultiStandVideo) ViewBindings.findChildViewById(view, R.id.wf_video);
                        if (multiStandVideo != null) {
                            return new PapamainVideoGameAdBinding(constraintLayout, barrier, frameLayout, constraintLayout, textView, textView2, multiStandVideo);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PapamainVideoGameAdBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f25834b;
    }

    @NonNull
    public static PapamainVideoGameAdBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_video_game_ad, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
