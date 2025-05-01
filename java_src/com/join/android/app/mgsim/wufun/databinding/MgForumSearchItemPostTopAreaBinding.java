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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumSearchItemPostTopAreaBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f24285b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f24286c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24287d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24288e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f24289f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f24290g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f24291h;

    private MgForumSearchItemPostTopAreaBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull TextView textView3) {
        this.f24285b = constraintLayout;
        this.f24286c = constraintLayout2;
        this.f24287d = textView;
        this.f24288e = textView2;
        this.f24289f = simpleDraweeView;
        this.f24290g = imageView;
        this.f24291h = textView3;
    }

    @NonNull
    public static MgForumSearchItemPostTopAreaBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i4 = R.id.count;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.count);
        if (textView != null) {
            i4 = R.id.desc;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.desc);
            if (textView2 != null) {
                i4 = R.id.icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                if (simpleDraweeView != null) {
                    i4 = R.id.imageView49;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView49);
                    if (imageView != null) {
                        i4 = R.id.name;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                        if (textView3 != null) {
                            return new MgForumSearchItemPostTopAreaBinding(constraintLayout, constraintLayout, textView, textView2, simpleDraweeView, imageView, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumSearchItemPostTopAreaBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f24285b;
    }

    @NonNull
    public static MgForumSearchItemPostTopAreaBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_search_item_post_top_area, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
