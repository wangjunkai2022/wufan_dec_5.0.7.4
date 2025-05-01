package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemDownloadCenterAdTitleBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22019b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f22020c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f22021d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f22022e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f22023f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f22024g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f22025h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f22026i;

    private ItemDownloadCenterAdTitleBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f22019b = linearLayout;
        this.f22020c = imageView;
        this.f22021d = imageView2;
        this.f22022e = view;
        this.f22023f = linearLayout2;
        this.f22024g = textView;
        this.f22025h = textView2;
        this.f22026i = textView3;
    }

    @NonNull
    public static ItemDownloadCenterAdTitleBinding bind(@NonNull View view) {
        int i4 = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.icon);
        if (imageView != null) {
            i4 = R.id.imageView5;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView5);
            if (imageView2 != null) {
                i4 = R.id.line;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                if (findChildViewById != null) {
                    i4 = R.id.look_other;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.look_other);
                    if (linearLayout != null) {
                        i4 = R.id.subtitle;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.subtitle);
                        if (textView != null) {
                            i4 = R.id.textView11;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView11);
                            if (textView2 != null) {
                                i4 = R.id.titleText;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                                if (textView3 != null) {
                                    return new ItemDownloadCenterAdTitleBinding((LinearLayout) view, imageView, imageView2, findChildViewById, linearLayout, textView, textView2, textView3);
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
    public static ItemDownloadCenterAdTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22019b;
    }

    @NonNull
    public static ItemDownloadCenterAdTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_download_center_ad_title, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
