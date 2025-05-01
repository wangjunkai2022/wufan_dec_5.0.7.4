package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class InstallNotinstallAppDialogActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21603b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f21604c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21605d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f21606e;

    private InstallNotinstallAppDialogActivityBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull ImageView imageView) {
        this.f21603b = linearLayout;
        this.f21604c = recyclerView;
        this.f21605d = textView;
        this.f21606e = imageView;
    }

    @NonNull
    public static InstallNotinstallAppDialogActivityBinding bind(@NonNull View view) {
        int i4 = R.id.appList;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.appList);
        if (recyclerView != null) {
            i4 = R.id.describ;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.describ);
            if (textView != null) {
                i4 = R.id.iv_close;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
                if (imageView != null) {
                    return new InstallNotinstallAppDialogActivityBinding((LinearLayout) view, recyclerView, textView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static InstallNotinstallAppDialogActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21603b;
    }

    @NonNull
    public static InstallNotinstallAppDialogActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.install_notinstall_app_dialog_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
