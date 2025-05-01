package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumWelcomeItemMyForumHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24389b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f24390c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24391d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f24392e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f24393f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f24394g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f24395h;

    private MgForumWelcomeItemMyForumHeaderBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout3, @NonNull TextView textView2) {
        this.f24389b = relativeLayout;
        this.f24390c = linearLayout;
        this.f24391d = textView;
        this.f24392e = linearLayout2;
        this.f24393f = imageView;
        this.f24394g = linearLayout3;
        this.f24395h = textView2;
    }

    @NonNull
    public static MgForumWelcomeItemMyForumHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.forumMore;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forumMore);
        if (linearLayout != null) {
            i4 = R.id.forumMoreTitle;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forumMoreTitle);
            if (textView != null) {
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
                                return new MgForumWelcomeItemMyForumHeaderBinding((RelativeLayout) view, linearLayout, textView, linearLayout2, imageView, linearLayout3, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumWelcomeItemMyForumHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24389b;
    }

    @NonNull
    public static MgForumWelcomeItemMyForumHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_welcome_item_my_forum_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
