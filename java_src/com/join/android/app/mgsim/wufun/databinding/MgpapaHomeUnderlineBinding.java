package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class MgpapaHomeUnderlineBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final View f24749b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f24750c;

    private MgpapaHomeUnderlineBinding(@NonNull View view, @NonNull View view2) {
        this.f24749b = view;
        this.f24750c = view2;
    }

    @NonNull
    public static MgpapaHomeUnderlineBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new MgpapaHomeUnderlineBinding(view, view);
    }

    @NonNull
    public static MgpapaHomeUnderlineBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f24749b;
    }

    @NonNull
    public static MgpapaHomeUnderlineBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mgpapa_home_underline, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
