package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class FragmentNewArenamainBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20038b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f20039c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f20040d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f20041e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final XRecyclerView f20042f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final PtrClassicFrameLayout f20043g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f20044h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f20045i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f20046j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f20047k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f20048l;

    private FragmentNewArenamainBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout2, @NonNull XRecyclerView xRecyclerView, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull LinearLayout linearLayout3, @NonNull View view, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6) {
        this.f20038b = linearLayout;
        this.f20039c = frameLayout;
        this.f20040d = frameLayout2;
        this.f20041e = linearLayout2;
        this.f20042f = xRecyclerView;
        this.f20043g = ptrClassicFrameLayout;
        this.f20044h = linearLayout3;
        this.f20045i = view;
        this.f20046j = linearLayout4;
        this.f20047k = linearLayout5;
        this.f20048l = linearLayout6;
    }

    @NonNull
    public static FragmentNewArenamainBinding bind(@NonNull View view) {
        int i4 = R.id.fragmentLayout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fragmentLayout);
        if (frameLayout != null) {
            i4 = R.id.friendLayout;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.friendLayout);
            if (frameLayout2 != null) {
                i4 = R.id.hit_temp_ll;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.hit_temp_ll);
                if (linearLayout != null) {
                    i4 = R.id.listview;
                    XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.listview);
                    if (xRecyclerView != null) {
                        i4 = R.id.ll_main;
                        PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.ll_main);
                        if (ptrClassicFrameLayout != null) {
                            i4 = R.id.myDragImageView;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.myDragImageView);
                            if (linearLayout2 != null) {
                                i4 = R.id.redPoint;
                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.redPoint);
                                if (findChildViewById != null) {
                                    i4 = R.id.searchBack;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.searchBack);
                                    if (linearLayout3 != null) {
                                        i4 = R.id.selecterLayout;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.selecterLayout);
                                        if (linearLayout4 != null) {
                                            i4 = R.id.title;
                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.title);
                                            if (linearLayout5 != null) {
                                                return new FragmentNewArenamainBinding((LinearLayout) view, frameLayout, frameLayout2, linearLayout, xRecyclerView, ptrClassicFrameLayout, linearLayout2, findChildViewById, linearLayout3, linearLayout4, linearLayout5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentNewArenamainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20038b;
    }

    @NonNull
    public static FragmentNewArenamainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_new_arenamain, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
