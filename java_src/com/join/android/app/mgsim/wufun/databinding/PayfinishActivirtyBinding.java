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
/* loaded from: classes3.dex */
public final class PayfinishActivirtyBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25928b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25929c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25930d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f25931e;

    private PayfinishActivirtyBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.f25928b = linearLayout;
        this.f25929c = imageView;
        this.f25930d = textView;
        this.f25931e = linearLayout2;
    }

    @NonNull
    public static PayfinishActivirtyBinding bind(@NonNull View view) {
        int i4 = R.id.closed;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.closed);
        if (imageView != null) {
            i4 = R.id.downButn;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.downButn);
            if (textView != null) {
                i4 = R.id.top;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.top);
                if (linearLayout != null) {
                    return new PayfinishActivirtyBinding((LinearLayout) view, imageView, textView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PayfinishActivirtyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25928b;
    }

    @NonNull
    public static PayfinishActivirtyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.payfinish_activirty, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
