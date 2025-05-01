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
public final class NewarenaGameroomSelecterActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25488b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25489c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f25490d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f25491e;

    private NewarenaGameroomSelecterActivityBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f25488b = linearLayout;
        this.f25489c = imageView;
        this.f25490d = recyclerView;
        this.f25491e = recyclerView2;
    }

    @NonNull
    public static NewarenaGameroomSelecterActivityBinding bind(@NonNull View view) {
        int i4 = R.id.close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.close);
        if (imageView != null) {
            i4 = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
            if (recyclerView != null) {
                i4 = R.id.recyclerViewGamelist;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerViewGamelist);
                if (recyclerView2 != null) {
                    return new NewarenaGameroomSelecterActivityBinding((LinearLayout) view, imageView, recyclerView, recyclerView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static NewarenaGameroomSelecterActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25488b;
    }

    @NonNull
    public static NewarenaGameroomSelecterActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.newarena_gameroom_selecter_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
