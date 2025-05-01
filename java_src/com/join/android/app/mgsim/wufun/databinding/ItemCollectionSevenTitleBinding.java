package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemCollectionSevenTitleBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f21738b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21739c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21740d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21741e;

    private ItemCollectionSevenTitleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f21738b = constraintLayout;
        this.f21739c = textView;
        this.f21740d = textView2;
        this.f21741e = textView3;
    }

    @NonNull
    public static ItemCollectionSevenTitleBinding bind(@NonNull View view) {
        int i4 = R.id.more;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.more);
        if (textView != null) {
            i4 = R.id.subTitle;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.subTitle);
            if (textView2 != null) {
                i4 = R.id.title;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                if (textView3 != null) {
                    return new ItemCollectionSevenTitleBinding((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemCollectionSevenTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f21738b;
    }

    @NonNull
    public static ItemCollectionSevenTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_collection_seven_title, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
