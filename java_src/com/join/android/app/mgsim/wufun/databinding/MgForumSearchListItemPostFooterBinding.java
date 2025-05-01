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
public final class MgForumSearchListItemPostFooterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f24292b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f24293c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24294d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24295e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f24296f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f24297g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f24298h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f24299i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final View f24300j;

    private MgForumSearchListItemPostFooterBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull TextView textView3, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull View view) {
        this.f24292b = constraintLayout;
        this.f24293c = constraintLayout2;
        this.f24294d = textView;
        this.f24295e = textView2;
        this.f24296f = imageView;
        this.f24297g = textView3;
        this.f24298h = imageView2;
        this.f24299i = imageView3;
        this.f24300j = view;
    }

    @NonNull
    public static MgForumSearchListItemPostFooterBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i4 = R.id.forum_post_commit;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_commit);
        if (textView != null) {
            i4 = R.id.forum_post_praise;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_praise);
            if (textView2 != null) {
                i4 = R.id.forum_post_praise_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.forum_post_praise_icon);
                if (imageView != null) {
                    i4 = R.id.forum_post_view;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_view);
                    if (textView3 != null) {
                        i4 = R.id.imageView10;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView10);
                        if (imageView2 != null) {
                            i4 = R.id.imageView9;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView9);
                            if (imageView3 != null) {
                                i4 = R.id.post_footer_divider;
                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.post_footer_divider);
                                if (findChildViewById != null) {
                                    return new MgForumSearchListItemPostFooterBinding(constraintLayout, constraintLayout, textView, textView2, imageView, textView3, imageView2, imageView3, findChildViewById);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumSearchListItemPostFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f24292b;
    }

    @NonNull
    public static MgForumSearchListItemPostFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_search_list_item_post_footer, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
