package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
public final class XlistviewHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27224b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f27225c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f27226d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f27227e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ProgressBar f27228f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f27229g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f27230h;

    private XlistviewHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ProgressBar progressBar, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2) {
        this.f27224b = linearLayout;
        this.f27225c = imageView;
        this.f27226d = relativeLayout;
        this.f27227e = textView;
        this.f27228f = progressBar;
        this.f27229g = linearLayout2;
        this.f27230h = textView2;
    }

    @NonNull
    public static XlistviewHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.xlistview_header_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.xlistview_header_arrow);
        if (imageView != null) {
            i4 = R.id.xlistview_header_content;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.xlistview_header_content);
            if (relativeLayout != null) {
                i4 = R.id.xlistview_header_hint_textview;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.xlistview_header_hint_textview);
                if (textView != null) {
                    i4 = R.id.xlistview_header_progressbar;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.xlistview_header_progressbar);
                    if (progressBar != null) {
                        i4 = R.id.xlistview_header_text;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.xlistview_header_text);
                        if (linearLayout != null) {
                            i4 = R.id.xlistview_header_time;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.xlistview_header_time);
                            if (textView2 != null) {
                                return new XlistviewHeaderBinding((LinearLayout) view, imageView, relativeLayout, textView, progressBar, linearLayout, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static XlistviewHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27224b;
    }

    @NonNull
    public static XlistviewHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.xlistview_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
