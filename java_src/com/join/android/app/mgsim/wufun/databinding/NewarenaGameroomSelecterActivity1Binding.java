package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class NewarenaGameroomSelecterActivity1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25479b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25480c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f25481d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f25482e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RecyclerView f25483f;

    private NewarenaGameroomSelecterActivity1Binding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f25479b = linearLayout;
        this.f25480c = imageView;
        this.f25481d = linearLayout2;
        this.f25482e = recyclerView;
        this.f25483f = recyclerView2;
    }

    @NonNull
    public static NewarenaGameroomSelecterActivity1Binding bind(@NonNull View view) {
        int i4 = R.id.close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.close);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i4 = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
            if (recyclerView != null) {
                i4 = R.id.recyclerViewGamelist;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerViewGamelist);
                if (recyclerView2 != null) {
                    return new NewarenaGameroomSelecterActivity1Binding(linearLayout, imageView, linearLayout, recyclerView, recyclerView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static NewarenaGameroomSelecterActivity1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25479b;
    }

    @NonNull
    public static NewarenaGameroomSelecterActivity1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.newarena_gameroom_selecter_activity1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
