package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentMyGameItemUpdateBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19985b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19986c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f19987d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f19988e;

    private FragmentMyGameItemUpdateBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.f19985b = constraintLayout;
        this.f19986c = textView;
        this.f19987d = imageView;
        this.f19988e = imageView2;
    }

    @NonNull
    public static FragmentMyGameItemUpdateBinding bind(@NonNull View view) {
        int i4 = R.id.count;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.count);
        if (textView != null) {
            i4 = R.id.imageView14;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView14);
            if (imageView != null) {
                i4 = R.id.imageView59;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView59);
                if (imageView2 != null) {
                    return new FragmentMyGameItemUpdateBinding((ConstraintLayout) view, textView, imageView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentMyGameItemUpdateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19985b;
    }

    @NonNull
    public static FragmentMyGameItemUpdateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_my_game_item_update, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
