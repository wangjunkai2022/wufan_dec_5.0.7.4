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
public final class ItemFriendItemHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22161b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f22162c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f22163d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f22164e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22165f;

    private ItemFriendItemHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView) {
        this.f22161b = constraintLayout;
        this.f22162c = view;
        this.f22163d = imageView;
        this.f22164e = imageView2;
        this.f22165f = textView;
    }

    @NonNull
    public static ItemFriendItemHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.add;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.add);
        if (findChildViewById != null) {
            i4 = R.id.icCollapse;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.icCollapse);
            if (imageView != null) {
                i4 = R.id.imageView78;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView78);
                if (imageView2 != null) {
                    i4 = R.id.onlineNum;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.onlineNum);
                    if (textView != null) {
                        return new ItemFriendItemHeaderBinding((ConstraintLayout) view, findChildViewById, imageView, imageView2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemFriendItemHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22161b;
    }

    @NonNull
    public static ItemFriendItemHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_friend_item_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
