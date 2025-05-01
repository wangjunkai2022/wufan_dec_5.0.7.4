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
public final class HandshankListFootBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21413b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21414c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f21415d;

    private HandshankListFootBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.f21413b = linearLayout;
        this.f21414c = textView;
        this.f21415d = linearLayout2;
    }

    @NonNull
    public static HandshankListFootBinding bind(@NonNull View view) {
        int i4 = R.id.handshank_name;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.handshank_name);
        if (textView != null) {
            i4 = R.id.lay_2;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.lay_2);
            if (linearLayout != null) {
                return new HandshankListFootBinding((LinearLayout) view, textView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static HandshankListFootBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21413b;
    }

    @NonNull
    public static HandshankListFootBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.handshank_list_foot, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
