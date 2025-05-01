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
public final class ActivityWifiapItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17280b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f17281c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f17282d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17283e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ProgressBar f17284f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f17285g;

    private ActivityWifiapItemBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull ProgressBar progressBar, @NonNull TextView textView2) {
        this.f17280b = linearLayout;
        this.f17281c = imageView;
        this.f17282d = linearLayout2;
        this.f17283e = textView;
        this.f17284f = progressBar;
        this.f17285g = textView2;
    }

    @NonNull
    public static ActivityWifiapItemBinding bind(@NonNull View view) {
        int i4 = R.id.connect_ok_image_wtitem;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.connect_ok_image_wtitem);
        if (imageView != null) {
            i4 = R.id.connect_ok_layout_wtitem;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.connect_ok_layout_wtitem);
            if (linearLayout != null) {
                i4 = R.id.connect_text_wtitem;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.connect_text_wtitem);
                if (textView != null) {
                    i4 = R.id.connecting_progressBar_wtitem;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.connecting_progressBar_wtitem);
                    if (progressBar != null) {
                        i4 = R.id.name_text_wtitem;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.name_text_wtitem);
                        if (textView2 != null) {
                            return new ActivityWifiapItemBinding((LinearLayout) view, imageView, linearLayout, textView, progressBar, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityWifiapItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17280b;
    }

    @NonNull
    public static ActivityWifiapItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_wifiap_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
