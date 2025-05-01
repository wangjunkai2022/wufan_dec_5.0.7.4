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
public final class CommentListItemFooterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18156b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f18157c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f18158d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18159e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f18160f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f18161g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f18162h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18163i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f18164j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f18165k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f18166l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f18167m;

    private CommentListItemFooterBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull View view, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull TextView textView3, @NonNull ImageView imageView3, @NonNull TextView textView4) {
        this.f18156b = linearLayout;
        this.f18157c = linearLayout2;
        this.f18158d = imageView;
        this.f18159e = textView;
        this.f18160f = view;
        this.f18161g = linearLayout3;
        this.f18162h = linearLayout4;
        this.f18163i = textView2;
        this.f18164j = imageView2;
        this.f18165k = textView3;
        this.f18166l = imageView3;
        this.f18167m = textView4;
    }

    @NonNull
    public static CommentListItemFooterBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.like;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.like);
        if (imageView != null) {
            i4 = R.id.likeCount;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.likeCount);
            if (textView != null) {
                i4 = R.id.line;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                if (findChildViewById != null) {
                    i4 = R.id.llLike;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llLike);
                    if (linearLayout2 != null) {
                        i4 = R.id.llUnlike;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llUnlike);
                        if (linearLayout3 != null) {
                            i4 = R.id.phoneModle;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.phoneModle);
                            if (textView2 != null) {
                                i4 = R.id.unlike;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.unlike);
                                if (imageView2 != null) {
                                    i4 = R.id.unlikeCount;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.unlikeCount);
                                    if (textView3 != null) {
                                        i4 = R.id.view;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.view);
                                        if (imageView3 != null) {
                                            i4 = R.id.viewCount;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.viewCount);
                                            if (textView4 != null) {
                                                return new CommentListItemFooterBinding(linearLayout, linearLayout, imageView, textView, findChildViewById, linearLayout2, linearLayout3, textView2, imageView2, textView3, imageView3, textView4);
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
    public static CommentListItemFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18156b;
    }

    @NonNull
    public static CommentListItemFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.comment_list_item_footer, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
