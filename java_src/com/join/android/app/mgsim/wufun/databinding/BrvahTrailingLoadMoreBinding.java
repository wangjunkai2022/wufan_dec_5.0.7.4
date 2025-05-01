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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class BrvahTrailingLoadMoreBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f17574b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f17575c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f17576d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout f17577e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f17578f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ProgressBar f17579g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17580h;

    private BrvahTrailingLoadMoreBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull FrameLayout frameLayout4, @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull TextView textView) {
        this.f17574b = frameLayout;
        this.f17575c = frameLayout2;
        this.f17576d = frameLayout3;
        this.f17577e = frameLayout4;
        this.f17578f = linearLayout;
        this.f17579g = progressBar;
        this.f17580h = textView;
    }

    @NonNull
    public static BrvahTrailingLoadMoreBinding bind(@NonNull View view) {
        int i4 = R.id.load_more_load_complete_view;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.load_more_load_complete_view);
        if (frameLayout != null) {
            i4 = R.id.load_more_load_end_view;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.load_more_load_end_view);
            if (frameLayout2 != null) {
                i4 = R.id.load_more_load_fail_view;
                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.load_more_load_fail_view);
                if (frameLayout3 != null) {
                    i4 = R.id.load_more_loading_view;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.load_more_loading_view);
                    if (linearLayout != null) {
                        i4 = R.id.loading_progress;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.loading_progress);
                        if (progressBar != null) {
                            i4 = R.id.loading_text;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.loading_text);
                            if (textView != null) {
                                return new BrvahTrailingLoadMoreBinding((FrameLayout) view, frameLayout, frameLayout2, frameLayout3, linearLayout, progressBar, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static BrvahTrailingLoadMoreBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f17574b;
    }

    @NonNull
    public static BrvahTrailingLoadMoreBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.brvah_trailing_load_more, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
