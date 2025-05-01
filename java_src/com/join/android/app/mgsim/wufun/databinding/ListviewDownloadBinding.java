package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ListviewDownloadBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23471b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23472c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f23473d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23474e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f23475f;

    private ListviewDownloadBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull Button button, @NonNull TextView textView2, @NonNull ImageView imageView) {
        this.f23471b = linearLayout;
        this.f23472c = textView;
        this.f23473d = button;
        this.f23474e = textView2;
        this.f23475f = imageView;
    }

    @NonNull
    public static ListviewDownloadBinding bind(@NonNull View view) {
        int i4 = R.id.createTime;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.createTime);
        if (textView != null) {
            i4 = R.id.install;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.install);
            if (button != null) {
                i4 = R.id.name;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                if (textView2 != null) {
                    i4 = R.id.portrait;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.portrait);
                    if (imageView != null) {
                        return new ListviewDownloadBinding((LinearLayout) view, textView, button, textView2, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ListviewDownloadBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23471b;
    }

    @NonNull
    public static ListviewDownloadBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.listview_download, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
