package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class EmulatorListviewDownloadingCenterHistorySpeedBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19298b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f19299c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f19300d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f19301e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19302f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19303g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ConstraintLayout f19304h;

    private EmulatorListviewDownloadingCenterHistorySpeedBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ConstraintLayout constraintLayout2) {
        this.f19298b = constraintLayout;
        this.f19299c = imageView;
        this.f19300d = imageView2;
        this.f19301e = textView;
        this.f19302f = textView2;
        this.f19303g = textView3;
        this.f19304h = constraintLayout2;
    }

    @NonNull
    public static EmulatorListviewDownloadingCenterHistorySpeedBinding bind(@NonNull View view) {
        int i4 = R.id.imageView56;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView56);
        if (imageView != null) {
            i4 = R.id.imageView57;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView57);
            if (imageView2 != null) {
                i4 = R.id.textView76;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView76);
                if (textView != null) {
                    i4 = R.id.textView81;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView81);
                    if (textView2 != null) {
                        i4 = R.id.textView82;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView82);
                        if (textView3 != null) {
                            i4 = R.id.trial;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.trial);
                            if (constraintLayout != null) {
                                return new EmulatorListviewDownloadingCenterHistorySpeedBinding((ConstraintLayout) view, imageView, imageView2, textView, textView2, textView3, constraintLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static EmulatorListviewDownloadingCenterHistorySpeedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19298b;
    }

    @NonNull
    public static EmulatorListviewDownloadingCenterHistorySpeedBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.emulator_listview_downloading_center_history_speed, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
