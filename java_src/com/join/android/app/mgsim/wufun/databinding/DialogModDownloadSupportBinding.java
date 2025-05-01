package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogModDownloadSupportBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18868b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18869c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18870d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18871e;

    private DialogModDownloadSupportBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f18868b = linearLayout;
        this.f18869c = textView;
        this.f18870d = textView2;
        this.f18871e = textView3;
    }

    @NonNull
    public static DialogModDownloadSupportBinding bind(@NonNull View view) {
        int i4 = R.id.tv_content;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
        if (textView != null) {
            i4 = R.id.tv_download;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_download);
            if (textView2 != null) {
                i4 = R.id.tv_title;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                if (textView3 != null) {
                    return new DialogModDownloadSupportBinding((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogModDownloadSupportBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18868b;
    }

    @NonNull
    public static DialogModDownloadSupportBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_mod_download_support, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
