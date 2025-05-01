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
public final class FragmentCommuntityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19688b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f19689c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XListView2 f19690d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final PtrClassicFrameLayout f19691e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19692f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f19693g;

    private FragmentCommuntityBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull XListView2 xListView2, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout3) {
        this.f19688b = linearLayout;
        this.f19689c = linearLayout2;
        this.f19690d = xListView2;
        this.f19691e = ptrClassicFrameLayout;
        this.f19692f = textView;
        this.f19693g = linearLayout3;
    }

    @NonNull
    public static FragmentCommuntityBinding bind(@NonNull View view) {
        int i4 = R.id.iv_nome;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_nome);
        if (linearLayout != null) {
            i4 = R.id.listview;
            XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listview);
            if (xListView2 != null) {
                i4 = R.id.myswip;
                PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.myswip);
                if (ptrClassicFrameLayout != null) {
                    i4 = R.id.redTips;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.redTips);
                    if (textView != null) {
                        i4 = R.id.thumbslayout;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.thumbslayout);
                        if (linearLayout2 != null) {
                            return new FragmentCommuntityBinding((LinearLayout) view, linearLayout, xListView2, ptrClassicFrameLayout, textView, linearLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentCommuntityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19688b;
    }

    @NonNull
    public static FragmentCommuntityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_communtity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
