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
/* loaded from: classes3.dex */
public final class SearchFailedHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26346b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26347c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f26348d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f26349e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f26350f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26351g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26352h;

    private SearchFailedHeaderBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f26346b = relativeLayout;
        this.f26347c = textView;
        this.f26348d = linearLayout;
        this.f26349e = imageView;
        this.f26350f = linearLayout2;
        this.f26351g = textView2;
        this.f26352h = textView3;
    }

    @NonNull
    public static SearchFailedHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.messageHeader;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.messageHeader);
        if (textView != null) {
            i4 = R.id.messageLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.messageLayout);
            if (linearLayout != null) {
                i4 = R.id.reloadingHeader;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.reloadingHeader);
                if (imageView != null) {
                    i4 = R.id.searchHeaderLayout;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.searchHeaderLayout);
                    if (linearLayout2 != null) {
                        i4 = R.id.textView;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                        if (textView2 != null) {
                            i4 = R.id.textView2;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
                            if (textView3 != null) {
                                return new SearchFailedHeaderBinding((RelativeLayout) view, textView, linearLayout, imageView, linearLayout2, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SearchFailedHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26346b;
    }

    @NonNull
    public static SearchFailedHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.search_failed_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
