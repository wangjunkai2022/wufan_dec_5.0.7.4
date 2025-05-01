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
public final class PapayHistoryItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25876b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25877c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25878d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25879e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25880f;

    private PapayHistoryItemLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f25876b = linearLayout;
        this.f25877c = textView;
        this.f25878d = textView2;
        this.f25879e = textView3;
        this.f25880f = textView4;
    }

    @NonNull
    public static PapayHistoryItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.payNumber;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.payNumber);
        if (textView != null) {
            i4 = R.id.paySuccess;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.paySuccess);
            if (textView2 != null) {
                i4 = R.id.payTime;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.payTime);
                if (textView3 != null) {
                    i4 = R.id.payType;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.payType);
                    if (textView4 != null) {
                        return new PapayHistoryItemLayoutBinding((LinearLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PapayHistoryItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25876b;
    }

    @NonNull
    public static PapayHistoryItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papay_history_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
