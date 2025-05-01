package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ScrollTextViewLayout;
/* loaded from: classes3.dex */
public final class DownloadDetialLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19167b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19168c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f19169d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f19170e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f19171f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f19172g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f19173h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f19174i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ScrollTextViewLayout f19175j;

    private DownloadDetialLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull TextView textView2, @NonNull ScrollTextViewLayout scrollTextViewLayout) {
        this.f19167b = relativeLayout;
        this.f19168c = textView;
        this.f19169d = imageView;
        this.f19170e = linearLayout;
        this.f19171f = imageView2;
        this.f19172g = imageView3;
        this.f19173h = imageView4;
        this.f19174i = textView2;
        this.f19175j = scrollTextViewLayout;
    }

    @NonNull
    public static DownloadDetialLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.biground;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.biground);
        if (textView != null) {
            i4 = R.id.download_bg;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.download_bg);
            if (imageView != null) {
                i4 = R.id.downloadLayout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.downloadLayout);
                if (linearLayout != null) {
                    i4 = R.id.downloadLine;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.downloadLine);
                    if (imageView2 != null) {
                        i4 = R.id.hasNewFinishedGameImage;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.hasNewFinishedGameImage);
                        if (imageView3 != null) {
                            i4 = R.id.imageLoading;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageLoading);
                            if (imageView4 != null) {
                                i4 = R.id.scroll_text;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.scroll_text);
                                if (textView2 != null) {
                                    i4 = R.id.scroll_text_layout;
                                    ScrollTextViewLayout scrollTextViewLayout = (ScrollTextViewLayout) ViewBindings.findChildViewById(view, R.id.scroll_text_layout);
                                    if (scrollTextViewLayout != null) {
                                        return new DownloadDetialLayoutBinding((RelativeLayout) view, textView, imageView, linearLayout, imageView2, imageView3, imageView4, textView2, scrollTextViewLayout);
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
    public static DownloadDetialLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19167b;
    }

    @NonNull
    public static DownloadDetialLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.download_detial_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
