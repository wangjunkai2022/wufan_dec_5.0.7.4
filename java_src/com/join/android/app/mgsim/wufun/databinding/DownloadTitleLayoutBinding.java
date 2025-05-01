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
public final class DownloadTitleLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19235b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19236c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f19237d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f19238e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f19239f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f19240g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f19241h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ScrollTextViewLayout f19242i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final View f19243j;

    private DownloadTitleLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView2, @NonNull ScrollTextViewLayout scrollTextViewLayout, @NonNull View view) {
        this.f19235b = relativeLayout;
        this.f19236c = textView;
        this.f19237d = linearLayout;
        this.f19238e = imageView;
        this.f19239f = imageView2;
        this.f19240g = imageView3;
        this.f19241h = textView2;
        this.f19242i = scrollTextViewLayout;
        this.f19243j = view;
    }

    @NonNull
    public static DownloadTitleLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.biground;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.biground);
        if (textView != null) {
            i4 = R.id.downloadLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.downloadLayout);
            if (linearLayout != null) {
                i4 = R.id.downloadLine;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.downloadLine);
                if (imageView != null) {
                    i4 = R.id.hasNewFinishedGameImage;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.hasNewFinishedGameImage);
                    if (imageView2 != null) {
                        i4 = R.id.imageLoading;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageLoading);
                        if (imageView3 != null) {
                            i4 = R.id.scroll_text;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.scroll_text);
                            if (textView2 != null) {
                                i4 = R.id.scroll_text_layout;
                                ScrollTextViewLayout scrollTextViewLayout = (ScrollTextViewLayout) ViewBindings.findChildViewById(view, R.id.scroll_text_layout);
                                if (scrollTextViewLayout != null) {
                                    i4 = R.id.statubar;
                                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.statubar);
                                    if (findChildViewById != null) {
                                        return new DownloadTitleLayoutBinding((RelativeLayout) view, textView, linearLayout, imageView, imageView2, imageView3, textView2, scrollTextViewLayout, findChildViewById);
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
    public static DownloadTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19235b;
    }

    @NonNull
    public static DownloadTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.download_title_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
