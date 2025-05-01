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
public final class ListviewDownloadCenterHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23483b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f23484c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23485d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23486e;

    private ListviewDownloadCenterHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23483b = linearLayout;
        this.f23484c = linearLayout2;
        this.f23485d = textView;
        this.f23486e = textView2;
    }

    @NonNull
    public static ListviewDownloadCenterHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.layout_main;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_main);
        if (linearLayout != null) {
            i4 = R.id.num;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.num);
            if (textView != null) {
                i4 = R.id.textView;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                if (textView2 != null) {
                    return new ListviewDownloadCenterHeaderBinding((LinearLayout) view, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ListviewDownloadCenterHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23483b;
    }

    @NonNull
    public static ListviewDownloadCenterHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.listview_download_center_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
