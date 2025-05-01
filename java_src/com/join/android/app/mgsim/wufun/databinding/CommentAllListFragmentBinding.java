package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.LoadMoreRecyclerView;
/* loaded from: classes3.dex */
public final class CommentAllListFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18093b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18094c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LoadMoreRecyclerView f18095d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18096e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f18097f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f18098g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final NestedScrollView f18099h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f18100i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f18101j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f18102k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f18103l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f18104m;

    private CommentAllListFragmentBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LoadMoreRecyclerView loadMoreRecyclerView, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView2, @NonNull NestedScrollView nestedScrollView, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout3, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f18093b = linearLayout;
        this.f18094c = imageView;
        this.f18095d = loadMoreRecyclerView;
        this.f18096e = textView;
        this.f18097f = linearLayout2;
        this.f18098g = imageView2;
        this.f18099h = nestedScrollView;
        this.f18100i = imageView3;
        this.f18101j = linearLayout3;
        this.f18102k = textView2;
        this.f18103l = textView3;
        this.f18104m = textView4;
    }

    @NonNull
    public static CommentAllListFragmentBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.comment_all_list;
            LoadMoreRecyclerView loadMoreRecyclerView = (LoadMoreRecyclerView) ViewBindings.findChildViewById(view, R.id.comment_all_list);
            if (loadMoreRecyclerView != null) {
                i4 = R.id.editText5;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.editText5);
                if (textView != null) {
                    i4 = R.id.goCommit;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.goCommit);
                    if (linearLayout != null) {
                        i4 = R.id.imageView44;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView44);
                        if (imageView2 != null) {
                            i4 = R.id.noCommentLl;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, R.id.noCommentLl);
                            if (nestedScrollView != null) {
                                i4 = R.id.progressBar2;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.progressBar2);
                                if (imageView3 != null) {
                                    i4 = R.id.starlayout;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.starlayout);
                                    if (linearLayout2 != null) {
                                        i4 = R.id.textMessage;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textMessage);
                                        if (textView2 != null) {
                                            i4 = R.id.textTopRight;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textTopRight);
                                            if (textView3 != null) {
                                                i4 = R.id.title_textview;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                                                if (textView4 != null) {
                                                    return new CommentAllListFragmentBinding((LinearLayout) view, imageView, loadMoreRecyclerView, textView, linearLayout, imageView2, nestedScrollView, imageView3, linearLayout2, textView2, textView3, textView4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CommentAllListFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18093b;
    }

    @NonNull
    public static CommentAllListFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.comment_all_list_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
