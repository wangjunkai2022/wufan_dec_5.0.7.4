package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityCollectionModuleSevenBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f15772b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f15773c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f15774d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f15775e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f15776f;

    private ActivityCollectionModuleSevenBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView) {
        this.f15772b = relativeLayout;
        this.f15773c = imageView;
        this.f15774d = recyclerView;
        this.f15775e = relativeLayout2;
        this.f15776f = textView;
    }

    @NonNull
    public static ActivityCollectionModuleSevenBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.breakListView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.breakListView);
            if (recyclerView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i4 = R.id.title_textview;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                if (textView != null) {
                    return new ActivityCollectionModuleSevenBinding(relativeLayout, imageView, recyclerView, relativeLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityCollectionModuleSevenBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f15772b;
    }

    @NonNull
    public static ActivityCollectionModuleSevenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_collection_module_seven, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
