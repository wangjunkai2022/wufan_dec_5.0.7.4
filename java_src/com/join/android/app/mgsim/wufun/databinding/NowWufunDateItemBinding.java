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
public final class NowWufunDateItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25572b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25573c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25574d;

    private NowWufunDateItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f25572b = linearLayout;
        this.f25573c = textView;
        this.f25574d = textView2;
    }

    @NonNull
    public static NowWufunDateItemBinding bind(@NonNull View view) {
        int i4 = R.id.date;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.date);
        if (textView != null) {
            i4 = R.id.week;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.week);
            if (textView2 != null) {
                return new NowWufunDateItemBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static NowWufunDateItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25572b;
    }

    @NonNull
    public static NowWufunDateItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.now_wufun_date_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
