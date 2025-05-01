package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ForumSendLoadingLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19577b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f19578c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19579d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f19580e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f19581f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19582g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ProgressBar f19583h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f19584i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f19585j;

    private ForumSendLoadingLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView2, @NonNull ProgressBar progressBar, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.f19577b = linearLayout;
        this.f19578c = linearLayout2;
        this.f19579d = textView;
        this.f19580e = linearLayout3;
        this.f19581f = linearLayout4;
        this.f19582g = textView2;
        this.f19583h = progressBar;
        this.f19584i = imageView;
        this.f19585j = imageView2;
    }

    @NonNull
    public static ForumSendLoadingLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.forum_send_failed_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forum_send_failed_container);
        if (linearLayout != null) {
            i4 = R.id.forum_send_failed_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forum_send_failed_tv);
            if (textView != null) {
                i4 = R.id.forum_send_loading_container;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forum_send_loading_container);
                if (linearLayout2 != null) {
                    i4 = R.id.forum_send_success_container;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forum_send_success_container);
                    if (linearLayout3 != null) {
                        i4 = R.id.forum_send_success_tv;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_send_success_tv);
                        if (textView2 != null) {
                            i4 = R.id.mg_loading;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.mg_loading);
                            if (progressBar != null) {
                                i4 = R.id.mg_loading_failed;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.mg_loading_failed);
                                if (imageView != null) {
                                    i4 = R.id.mg_loading_success;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.mg_loading_success);
                                    if (imageView2 != null) {
                                        return new ForumSendLoadingLayoutBinding((LinearLayout) view, linearLayout, textView, linearLayout2, linearLayout3, textView2, progressBar, imageView, imageView2);
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
    public static ForumSendLoadingLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19577b;
    }

    @NonNull
    public static ForumSendLoadingLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.forum_send_loading_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
