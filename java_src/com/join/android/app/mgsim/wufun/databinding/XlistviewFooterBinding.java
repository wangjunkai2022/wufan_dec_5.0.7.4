package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class XlistviewFooterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27219b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f27220c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f27221d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f27222e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f27223f;

    private XlistviewFooterBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ProgressBar progressBar, @NonNull TextView textView2) {
        this.f27219b = linearLayout;
        this.f27220c = relativeLayout;
        this.f27221d = textView;
        this.f27222e = progressBar;
        this.f27223f = textView2;
    }

    @NonNull
    public static XlistviewFooterBinding bind(@NonNull View view) {
        int i4 = R.id.xlistview_footer_content;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.xlistview_footer_content);
        if (relativeLayout != null) {
            i4 = R.id.xlistview_footer_hint_textview;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.xlistview_footer_hint_textview);
            if (textView != null) {
                i4 = R.id.xlistview_footer_progressbar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.xlistview_footer_progressbar);
                if (progressBar != null) {
                    i4 = R.id.xlistview_footer_refresh_textview;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.xlistview_footer_refresh_textview);
                    if (textView2 != null) {
                        return new XlistviewFooterBinding((LinearLayout) view, relativeLayout, textView, progressBar, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static XlistviewFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27219b;
    }

    @NonNull
    public static XlistviewFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.xlistview_footer, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
