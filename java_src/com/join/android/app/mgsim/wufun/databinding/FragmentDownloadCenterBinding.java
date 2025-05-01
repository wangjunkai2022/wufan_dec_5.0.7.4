package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class FragmentDownloadCenterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19738b;

    private FragmentDownloadCenterBinding(@NonNull RelativeLayout relativeLayout) {
        this.f19738b = relativeLayout;
    }

    @NonNull
    public static FragmentDownloadCenterBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new FragmentDownloadCenterBinding((RelativeLayout) view);
    }

    @NonNull
    public static FragmentDownloadCenterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19738b;
    }

    @NonNull
    public static FragmentDownloadCenterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_download_center, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
