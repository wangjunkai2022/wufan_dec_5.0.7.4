package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class MgFightLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23775b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f23776c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XListView2 f23777d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final PtrClassicFrameLayout f23778e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TopbarTitleLayoutBinding f23779f;

    private MgFightLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull XListView2 xListView2, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull TopbarTitleLayoutBinding topbarTitleLayoutBinding) {
        this.f23775b = linearLayout;
        this.f23776c = linearLayout2;
        this.f23777d = xListView2;
        this.f23778e = ptrClassicFrameLayout;
        this.f23779f = topbarTitleLayoutBinding;
    }

    @NonNull
    public static MgFightLayoutBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.fightListView;
        XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.fightListView);
        if (xListView2 != null) {
            i4 = R.id.mPtrFrame;
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
            if (ptrClassicFrameLayout != null) {
                i4 = R.id.top_lay;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.top_lay);
                if (findChildViewById != null) {
                    return new MgFightLayoutBinding(linearLayout, linearLayout, xListView2, ptrClassicFrameLayout, TopbarTitleLayoutBinding.bind(findChildViewById));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgFightLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23775b;
    }

    @NonNull
    public static MgFightLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_fight_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
