package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class NewarenaGameroomSelecterActivity2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f25484b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25485c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f25486d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f25487e;

    private NewarenaGameroomSelecterActivity2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull RecyclerView recyclerView) {
        this.f25484b = constraintLayout;
        this.f25485c = imageView;
        this.f25486d = constraintLayout2;
        this.f25487e = recyclerView;
    }

    @NonNull
    public static NewarenaGameroomSelecterActivity2Binding bind(@NonNull View view) {
        int i4 = R.id.close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.close);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerViewGamelist);
            if (recyclerView != null) {
                return new NewarenaGameroomSelecterActivity2Binding(constraintLayout, imageView, constraintLayout, recyclerView);
            }
            i4 = R.id.recyclerViewGamelist;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static NewarenaGameroomSelecterActivity2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f25484b;
    }

    @NonNull
    public static NewarenaGameroomSelecterActivity2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.newarena_gameroom_selecter_activity2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
