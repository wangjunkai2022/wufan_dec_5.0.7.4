package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class AboutActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f15665b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f15666c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f15667d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f15668e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f15669f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f15670g;

    private AboutActivityBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f15665b = linearLayout;
        this.f15666c = imageView;
        this.f15667d = recyclerView;
        this.f15668e = recyclerView2;
        this.f15669f = textView;
        this.f15670g = textView2;
    }

    @NonNull
    public static AboutActivityBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.rv_menu_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_menu_list);
            if (recyclerView != null) {
                i4 = R.id.rv_sub_menu_list;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_sub_menu_list);
                if (recyclerView2 != null) {
                    i4 = R.id.title_textview;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                    if (textView != null) {
                        i4 = R.id.tv_version;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_version);
                        if (textView2 != null) {
                            return new AboutActivityBinding((LinearLayout) view, imageView, recyclerView, recyclerView2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static AboutActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f15665b;
    }

    @NonNull
    public static AboutActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.about_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
