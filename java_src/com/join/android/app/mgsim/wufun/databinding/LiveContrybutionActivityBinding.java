package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class LiveContrybutionActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23518b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final PtrClassicFrameLayout f23519c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23520d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final XListView2 f23521e;

    private LiveContrybutionActivityBinding(@NonNull RelativeLayout relativeLayout, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull TextView textView, @NonNull XListView2 xListView2) {
        this.f23518b = relativeLayout;
        this.f23519c = ptrClassicFrameLayout;
        this.f23520d = textView;
        this.f23521e = xListView2;
    }

    @NonNull
    public static LiveContrybutionActivityBinding bind(@NonNull View view) {
        int i4 = R.id.mPtrFrame;
        PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
        if (ptrClassicFrameLayout != null) {
            i4 = R.id.nodata;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.nodata);
            if (textView != null) {
                i4 = R.id.rankListView;
                XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.rankListView);
                if (xListView2 != null) {
                    return new LiveContrybutionActivityBinding((RelativeLayout) view, ptrClassicFrameLayout, textView, xListView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LiveContrybutionActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23518b;
    }

    @NonNull
    public static LiveContrybutionActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.live_contrybution_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
