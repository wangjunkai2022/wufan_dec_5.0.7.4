package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SampleCommonListFooterNetworkErrorBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f26269b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26270c;

    private SampleCommonListFooterNetworkErrorBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView) {
        this.f26269b = frameLayout;
        this.f26270c = textView;
    }

    @NonNull
    public static SampleCommonListFooterNetworkErrorBinding bind(@NonNull View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.xlistview_footer_hint_textview);
        if (textView != null) {
            return new SampleCommonListFooterNetworkErrorBinding((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.xlistview_footer_hint_textview)));
    }

    @NonNull
    public static SampleCommonListFooterNetworkErrorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f26269b;
    }

    @NonNull
    public static SampleCommonListFooterNetworkErrorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.sample_common_list_footer_network_error, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
