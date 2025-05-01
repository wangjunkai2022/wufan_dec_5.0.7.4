package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SearchAdTitleViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26319b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f26320c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26321d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26322e;

    private SearchAdTitleViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f26319b = relativeLayout;
        this.f26320c = relativeLayout2;
        this.f26321d = textView;
        this.f26322e = textView2;
    }

    @NonNull
    public static SearchAdTitleViewBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i4 = R.id.tips;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tips);
        if (textView != null) {
            i4 = R.id.titleText;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
            if (textView2 != null) {
                return new SearchAdTitleViewBinding(relativeLayout, relativeLayout, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SearchAdTitleViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26319b;
    }

    @NonNull
    public static SearchAdTitleViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.search_ad_title_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
