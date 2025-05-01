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
public final class MgForumSearchItemPostFooterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24265b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f24266c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24267d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24268e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f24269f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f24270g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f24271h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f24272i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f24273j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final View f24274k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f24275l;

    private MgForumSearchItemPostFooterBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout3, @NonNull TextView textView3, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull View view, @NonNull LinearLayout linearLayout4) {
        this.f24265b = linearLayout;
        this.f24266c = linearLayout2;
        this.f24267d = textView;
        this.f24268e = textView2;
        this.f24269f = imageView;
        this.f24270g = linearLayout3;
        this.f24271h = textView3;
        this.f24272i = imageView2;
        this.f24273j = imageView3;
        this.f24274k = view;
        this.f24275l = linearLayout4;
    }

    @NonNull
    public static MgForumSearchItemPostFooterBinding bind(@NonNull View view) {
        int i4 = R.id.commentParent;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.commentParent);
        if (linearLayout != null) {
            i4 = R.id.forum_post_commit;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_commit);
            if (textView != null) {
                i4 = R.id.forum_post_praise;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_praise);
                if (textView2 != null) {
                    i4 = R.id.forum_post_praise_icon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.forum_post_praise_icon);
                    if (imageView != null) {
                        i4 = R.id.forum_post_praise_parent;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forum_post_praise_parent);
                        if (linearLayout2 != null) {
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
                                            i4 = R.id.viewParent;
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.viewParent);
                                            if (linearLayout3 != null) {
                                                return new MgForumSearchItemPostFooterBinding((LinearLayout) view, linearLayout, textView, textView2, imageView, linearLayout2, textView3, imageView2, imageView3, findChildViewById, linearLayout3);
                                            }
                                        }
                                    }
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
    public static MgForumSearchItemPostFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24265b;
    }

    @NonNull
    public static MgForumSearchItemPostFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_search_item_post_footer, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
