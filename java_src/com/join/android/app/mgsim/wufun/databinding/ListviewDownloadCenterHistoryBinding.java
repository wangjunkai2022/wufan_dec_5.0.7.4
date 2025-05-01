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
public final class ListviewDownloadCenterHistoryBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23487b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f23488c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f23489d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f23490e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23491f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23492g;

    private ListviewDownloadCenterHistoryBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23487b = linearLayout;
        this.f23488c = button;
        this.f23489d = button2;
        this.f23490e = imageView;
        this.f23491f = textView;
        this.f23492g = textView2;
    }

    @NonNull
    public static ListviewDownloadCenterHistoryBinding bind(@NonNull View view) {
        int i4 = R.id.btnOp;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnOp);
        if (button != null) {
            i4 = R.id.del;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.del);
            if (button2 != null) {
                i4 = R.id.img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img);
                if (imageView != null) {
                    i4 = R.id.name;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                    if (textView != null) {
                        i4 = R.id.status;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.status);
                        if (textView2 != null) {
                            return new ListviewDownloadCenterHistoryBinding((LinearLayout) view, button, button2, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ListviewDownloadCenterHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23487b;
    }

    @NonNull
    public static ListviewDownloadCenterHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.listview_download_center_history, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
