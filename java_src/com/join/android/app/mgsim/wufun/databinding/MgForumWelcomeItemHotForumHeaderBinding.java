package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumWelcomeItemHotForumHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24376b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f24377c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24378d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f24379e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f24380f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f24381g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f24382h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f24383i;

    private MgForumWelcomeItemHotForumHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull View view, @NonNull LinearLayout linearLayout3, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout4, @NonNull TextView textView2) {
        this.f24376b = linearLayout;
        this.f24377c = linearLayout2;
        this.f24378d = textView;
        this.f24379e = view;
        this.f24380f = linearLayout3;
        this.f24381g = imageView;
        this.f24382h = linearLayout4;
        this.f24383i = textView2;
    }

    @NonNull
    public static MgForumWelcomeItemHotForumHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.forumMore;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forumMore);
        if (linearLayout != null) {
            i4 = R.id.forumMoreTitle;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forumMoreTitle);
            if (textView != null) {
                i4 = R.id.forum_post_divider;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.forum_post_divider);
                if (findChildViewById != null) {
                    i4 = R.id.forums_hot_item_container;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forums_hot_item_container);
                    if (linearLayout2 != null) {
                        i4 = R.id.imageViewMore;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageViewMore);
                        if (imageView != null) {
                            i4 = R.id.layout_hot_title;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_hot_title);
                            if (linearLayout3 != null) {
                                i4 = R.id.sectionTitle;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.sectionTitle);
                                if (textView2 != null) {
                                    return new MgForumWelcomeItemHotForumHeaderBinding((LinearLayout) view, linearLayout, textView, findChildViewById, linearLayout2, imageView, linearLayout3, textView2);
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
    public static MgForumWelcomeItemHotForumHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24376b;
    }

    @NonNull
    public static MgForumWelcomeItemHotForumHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_welcome_item_hot_forum_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
