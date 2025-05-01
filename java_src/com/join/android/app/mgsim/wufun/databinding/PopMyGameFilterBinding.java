package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PopMyGameFilterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26072b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f26073c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ListView f26074d;

    private PopMyGameFilterBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ListView listView) {
        this.f26072b = constraintLayout;
        this.f26073c = view;
        this.f26074d = listView;
    }

    @NonNull
    public static PopMyGameFilterBinding bind(@NonNull View view) {
        int i4 = R.id.bg;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.bg);
        if (findChildViewById != null) {
            i4 = R.id.list;
            ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.list);
            if (listView != null) {
                return new PopMyGameFilterBinding((ConstraintLayout) view, findChildViewById, listView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PopMyGameFilterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26072b;
    }

    @NonNull
    public static PopMyGameFilterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.pop_my_game_filter, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
