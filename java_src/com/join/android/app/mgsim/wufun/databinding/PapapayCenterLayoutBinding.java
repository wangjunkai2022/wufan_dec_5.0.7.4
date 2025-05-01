package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView;
/* loaded from: classes3.dex */
public final class PapapayCenterLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25855b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25856c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f25857d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25858e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final XListView f25859f;

    private PapapayCenterLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull XListView xListView) {
        this.f25855b = linearLayout;
        this.f25856c = imageView;
        this.f25857d = linearLayout2;
        this.f25858e = textView;
        this.f25859f = xListView;
    }

    @NonNull
    public static PapapayCenterLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.imageView8;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView8);
        if (imageView != null) {
            i4 = R.id.nodata;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.nodata);
            if (linearLayout != null) {
                i4 = R.id.textView22;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView22);
                if (textView != null) {
                    i4 = R.id.xListView;
                    XListView xListView = (XListView) ViewBindings.findChildViewById(view, R.id.xListView);
                    if (xListView != null) {
                        return new PapapayCenterLayoutBinding((LinearLayout) view, imageView, linearLayout, textView, xListView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PapapayCenterLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25855b;
    }

    @NonNull
    public static PapapayCenterLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papapay_center_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
