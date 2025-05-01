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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumProfileReplyHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24230b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24231c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f24232d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f24233e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f24234f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f24235g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f24236h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f24237i;

    private MgForumProfileReplyHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout3) {
        this.f24230b = linearLayout;
        this.f24231c = textView;
        this.f24232d = simpleDraweeView;
        this.f24233e = view;
        this.f24234f = linearLayout2;
        this.f24235g = textView2;
        this.f24236h = imageView;
        this.f24237i = linearLayout3;
    }

    @NonNull
    public static MgForumProfileReplyHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.forum_post_add_time;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_add_time);
        if (textView != null) {
            i4 = R.id.forum_post_avatar_src;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.forum_post_avatar_src);
            if (simpleDraweeView != null) {
                i4 = R.id.forum_post_divider;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.forum_post_divider);
                if (findChildViewById != null) {
                    i4 = R.id.forum_post_func_container;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forum_post_func_container);
                    if (linearLayout != null) {
                        i4 = R.id.forum_post_nickname;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_nickname);
                        if (textView2 != null) {
                            i4 = R.id.forum_post_reply;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.forum_post_reply);
                            if (imageView != null) {
                                i4 = R.id.layout_posts_top;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_posts_top);
                                if (linearLayout2 != null) {
                                    return new MgForumProfileReplyHeaderBinding((LinearLayout) view, textView, simpleDraweeView, findChildViewById, linearLayout, textView2, imageView, linearLayout2);
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
    public static MgForumProfileReplyHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24230b;
    }

    @NonNull
    public static MgForumProfileReplyHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_profile_reply_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
