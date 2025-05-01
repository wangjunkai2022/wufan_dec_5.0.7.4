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
public final class DialogDownloadBottomViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18668b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18669c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18670d;

    private DialogDownloadBottomViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f18668b = relativeLayout;
        this.f18669c = textView;
        this.f18670d = textView2;
    }

    @NonNull
    public static DialogDownloadBottomViewBinding bind(@NonNull View view) {
        int i4 = R.id.downloadDialogOneTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.downloadDialogOneTv);
        if (textView != null) {
            i4 = R.id.downloadDialogTwoTv;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.downloadDialogTwoTv);
            if (textView2 != null) {
                return new DialogDownloadBottomViewBinding((RelativeLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogDownloadBottomViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18668b;
    }

    @NonNull
    public static DialogDownloadBottomViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_download_bottom_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
