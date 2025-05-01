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
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class FragmentStandardoreliteRoomBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20142b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XRecyclerView f20143c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final PtrClassicFrameLayout f20144d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f20145e;

    private FragmentStandardoreliteRoomBinding(@NonNull RelativeLayout relativeLayout, @NonNull XRecyclerView xRecyclerView, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull TextView textView) {
        this.f20142b = relativeLayout;
        this.f20143c = xRecyclerView;
        this.f20144d = ptrClassicFrameLayout;
        this.f20145e = textView;
    }

    @NonNull
    public static FragmentStandardoreliteRoomBinding bind(@NonNull View view) {
        int i4 = R.id.mListView;
        XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.mListView);
        if (xRecyclerView != null) {
            i4 = R.id.mPtrFrame;
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
            if (ptrClassicFrameLayout != null) {
                i4 = R.id.noData;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.noData);
                if (textView != null) {
                    return new FragmentStandardoreliteRoomBinding((RelativeLayout) view, xRecyclerView, ptrClassicFrameLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentStandardoreliteRoomBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20142b;
    }

    @NonNull
    public static FragmentStandardoreliteRoomBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_standardorelite_room, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
