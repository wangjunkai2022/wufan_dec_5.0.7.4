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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumSearchItemFavoriteGameListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f24256b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f24257c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24258d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24259e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f24260f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f24261g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f24262h;

    private MgForumSearchItemFavoriteGameListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView3) {
        this.f24256b = constraintLayout;
        this.f24257c = constraintLayout2;
        this.f24258d = textView;
        this.f24259e = textView2;
        this.f24260f = view;
        this.f24261g = simpleDraweeView;
        this.f24262h = textView3;
    }

    @NonNull
    public static MgForumSearchItemFavoriteGameListBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i4 = R.id.count;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.count);
        if (textView != null) {
            i4 = R.id.desc;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.desc);
            if (textView2 != null) {
                i4 = R.id.divider;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
                if (findChildViewById != null) {
                    i4 = R.id.icon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                    if (simpleDraweeView != null) {
                        i4 = R.id.name;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                        if (textView3 != null) {
                            return new MgForumSearchItemFavoriteGameListBinding(constraintLayout, constraintLayout, textView, textView2, findChildViewById, simpleDraweeView, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumSearchItemFavoriteGameListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f24256b;
    }

    @NonNull
    public static MgForumSearchItemFavoriteGameListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_search_item_favorite_game_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
