package com.wufun.union.ad.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wufun.union.ad.R;
/* loaded from: classes6.dex */
public final class ActivityAdStubBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f65621b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f65622c;

    private ActivityAdStubBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView) {
        this.f65621b = frameLayout;
        this.f65622c = textView;
    }

    @NonNull
    public static ActivityAdStubBinding bind(@NonNull View view) {
        int i4 = R.id.fullscreen_content;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
        if (textView != null) {
            return new ActivityAdStubBinding((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityAdStubBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f65621b;
    }

    @NonNull
    public static ActivityAdStubBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_ad_stub, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
