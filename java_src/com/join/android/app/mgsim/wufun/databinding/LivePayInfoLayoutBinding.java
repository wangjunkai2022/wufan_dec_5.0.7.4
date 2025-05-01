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
import com.join.mgps.customview.XListView2;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class LivePayInfoLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23543b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23544c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23545d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final PtrClassicFrameLayout f23546e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23547f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final XListView2 f23548g;

    private LivePayInfoLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull TextView textView3, @NonNull XListView2 xListView2) {
        this.f23543b = linearLayout;
        this.f23544c = textView;
        this.f23545d = textView2;
        this.f23546e = ptrClassicFrameLayout;
        this.f23547f = textView3;
        this.f23548g = xListView2;
    }

    @NonNull
    public static LivePayInfoLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.allCharm;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.allCharm);
        if (textView != null) {
            i4 = R.id.hasUsedMoney;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.hasUsedMoney);
            if (textView2 != null) {
                i4 = R.id.mPtrFrame;
                PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                if (ptrClassicFrameLayout != null) {
                    i4 = R.id.noData;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.noData);
                    if (textView3 != null) {
                        i4 = R.id.rankListView;
                        XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.rankListView);
                        if (xListView2 != null) {
                            return new LivePayInfoLayoutBinding((LinearLayout) view, textView, textView2, ptrClassicFrameLayout, textView3, xListView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LivePayInfoLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23543b;
    }

    @NonNull
    public static LivePayInfoLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.live_pay_info_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
