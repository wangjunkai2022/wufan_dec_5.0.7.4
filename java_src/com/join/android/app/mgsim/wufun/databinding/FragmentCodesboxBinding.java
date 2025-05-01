package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class FragmentCodesboxBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19660b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XListView2 f19661c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final PtrClassicFrameLayout f19662d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ListView f19663e;

    private FragmentCodesboxBinding(@NonNull RelativeLayout relativeLayout, @NonNull XListView2 xListView2, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull ListView listView) {
        this.f19660b = relativeLayout;
        this.f19661c = xListView2;
        this.f19662d = ptrClassicFrameLayout;
        this.f19663e = listView;
    }

    @NonNull
    public static FragmentCodesboxBinding bind(@NonNull View view) {
        int i4 = R.id.listView2;
        XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listView2);
        if (xListView2 != null) {
            i4 = R.id.mPtrFrame;
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
            if (ptrClassicFrameLayout != null) {
                i4 = R.id.recommendView;
                ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.recommendView);
                if (listView != null) {
                    return new FragmentCodesboxBinding((RelativeLayout) view, xListView2, ptrClassicFrameLayout, listView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentCodesboxBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19660b;
    }

    @NonNull
    public static FragmentCodesboxBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_codesbox, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
