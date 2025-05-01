package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogUploadProgressBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19063b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ProgressBar f19064c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19065d;

    private DialogUploadProgressBinding(@NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull TextView textView) {
        this.f19063b = linearLayout;
        this.f19064c = progressBar;
        this.f19065d = textView;
    }

    @NonNull
    public static DialogUploadProgressBinding bind(@NonNull View view) {
        int i4 = R.id.pb_loading;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_loading);
        if (progressBar != null) {
            i4 = R.id.tv_progress_status;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_progress_status);
            if (textView != null) {
                return new DialogUploadProgressBinding((LinearLayout) view, progressBar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogUploadProgressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19063b;
    }

    @NonNull
    public static DialogUploadProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_upload_progress, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
