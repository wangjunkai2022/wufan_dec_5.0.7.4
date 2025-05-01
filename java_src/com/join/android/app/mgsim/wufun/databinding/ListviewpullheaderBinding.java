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
public final class ListviewpullheaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23497b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23498c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23499d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f23500e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23501f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23502g;

    private ListviewpullheaderBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ProgressBar progressBar, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f23497b = linearLayout;
        this.f23498c = imageView;
        this.f23499d = textView;
        this.f23500e = progressBar;
        this.f23501f = textView2;
        this.f23502g = textView3;
    }

    @NonNull
    public static ListviewpullheaderBinding bind(@NonNull View view) {
        int i4 = R.id.arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.arrow);
        if (imageView != null) {
            i4 = R.id.noMore;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.noMore);
            if (textView != null) {
                i4 = R.id.progerssbar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progerssbar);
                if (progressBar != null) {
                    i4 = R.id.title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                    if (textView2 != null) {
                        i4 = R.id.updated;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.updated);
                        if (textView3 != null) {
                            return new ListviewpullheaderBinding((LinearLayout) view, imageView, textView, progressBar, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ListviewpullheaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23497b;
    }

    @NonNull
    public static ListviewpullheaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.listviewpullheader, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
