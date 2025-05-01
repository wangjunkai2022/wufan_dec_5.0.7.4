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
public final class BrvahQuickViewLoadMoreBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f17562b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f17563c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f17564d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f17565e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ProgressBar f17566f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f17567g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17568h;

    private BrvahQuickViewLoadMoreBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f17562b = frameLayout;
        this.f17563c = frameLayout2;
        this.f17564d = frameLayout3;
        this.f17565e = linearLayout;
        this.f17566f = progressBar;
        this.f17567g = textView;
        this.f17568h = textView2;
    }

    @NonNull
    public static BrvahQuickViewLoadMoreBinding bind(@NonNull View view) {
        int i4 = R.id.load_more_load_end_view;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.load_more_load_end_view);
        if (frameLayout != null) {
            i4 = R.id.load_more_load_fail_view;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.load_more_load_fail_view);
            if (frameLayout2 != null) {
                i4 = R.id.load_more_loading_view;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.load_more_loading_view);
                if (linearLayout != null) {
                    i4 = R.id.loading_progress;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.loading_progress);
                    if (progressBar != null) {
                        i4 = R.id.loading_text;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.loading_text);
                        if (textView != null) {
                            i4 = R.id.tv_prompt;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_prompt);
                            if (textView2 != null) {
                                return new BrvahQuickViewLoadMoreBinding((FrameLayout) view, frameLayout, frameLayout2, linearLayout, progressBar, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static BrvahQuickViewLoadMoreBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f17562b;
    }

    @NonNull
    public static BrvahQuickViewLoadMoreBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.brvah_quick_view_load_more, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
