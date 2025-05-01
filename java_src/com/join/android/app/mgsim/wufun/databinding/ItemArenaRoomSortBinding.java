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
public final class ItemArenaRoomSortBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21690b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f21691c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21692d;

    private ItemArenaRoomSortBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull TextView textView) {
        this.f21690b = linearLayout;
        this.f21691c = view;
        this.f21692d = textView;
    }

    @NonNull
    public static ItemArenaRoomSortBinding bind(@NonNull View view) {
        int i4 = R.id.emptyView;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.emptyView);
        if (findChildViewById != null) {
            i4 = R.id.tv_info;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_info);
            if (textView != null) {
                return new ItemArenaRoomSortBinding((LinearLayout) view, findChildViewById, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemArenaRoomSortBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21690b;
    }

    @NonNull
    public static ItemArenaRoomSortBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_arena_room_sort, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
