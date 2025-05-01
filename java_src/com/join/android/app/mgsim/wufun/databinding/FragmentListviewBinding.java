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
import com.join.mgps.customview.ObservableListView;
/* loaded from: classes3.dex */
public final class FragmentListviewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19872b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f19873c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ObservableListView f19874d;

    private FragmentListviewBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ObservableListView observableListView) {
        this.f19872b = linearLayout;
        this.f19873c = linearLayout2;
        this.f19874d = observableListView;
    }

    @NonNull
    public static FragmentListviewBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        ObservableListView observableListView = (ObservableListView) ViewBindings.findChildViewById(view, R.id.listview);
        if (observableListView != null) {
            return new FragmentListviewBinding(linearLayout, linearLayout, observableListView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.listview)));
    }

    @NonNull
    public static FragmentListviewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19872b;
    }

    @NonNull
    public static FragmentListviewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_listview, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
