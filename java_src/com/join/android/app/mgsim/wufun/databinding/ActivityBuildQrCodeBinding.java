package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityBuildQrCodeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f15721b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f15722c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ViewStub f15723d;

    private ActivityBuildQrCodeBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull ViewStub viewStub) {
        this.f15721b = relativeLayout;
        this.f15722c = relativeLayout2;
        this.f15723d = viewStub;
    }

    @NonNull
    public static ActivityBuildQrCodeBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, R.id.qr_code_vstub);
        if (viewStub != null) {
            return new ActivityBuildQrCodeBinding(relativeLayout, relativeLayout, viewStub);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.qr_code_vstub)));
    }

    @NonNull
    public static ActivityBuildQrCodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f15721b;
    }

    @NonNull
    public static ActivityBuildQrCodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_build_qr_code, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
