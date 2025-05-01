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
public final class MgpapaFootLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24730b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24731c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24732d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24733e;

    private MgpapaFootLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f24730b = linearLayout;
        this.f24731c = textView;
        this.f24732d = textView2;
        this.f24733e = textView3;
    }

    @NonNull
    public static MgpapaFootLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.textView;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
        if (textView != null) {
            i4 = R.id.textView2;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
            if (textView2 != null) {
                i4 = R.id.textView3;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView3);
                if (textView3 != null) {
                    return new MgpapaFootLayoutBinding((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgpapaFootLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24730b;
    }

    @NonNull
    public static MgpapaFootLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mgpapa_foot_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
