package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView2;
/* loaded from: classes3.dex */
public final class ActivityCommentSelfListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f15793b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f15794c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f15795d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f15796e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final XListView2 f15797f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ForumLoadingView f15798g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f15799h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f15800i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f15801j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final RelativeLayout f15802k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final View f15803l;

    private ActivityCommentSelfListBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull XListView2 xListView2, @NonNull ForumLoadingView forumLoadingView, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RelativeLayout relativeLayout4, @NonNull View view) {
        this.f15793b = relativeLayout;
        this.f15794c = relativeLayout2;
        this.f15795d = imageView;
        this.f15796e = imageView2;
        this.f15797f = xListView2;
        this.f15798g = forumLoadingView;
        this.f15799h = relativeLayout3;
        this.f15800i = textView;
        this.f15801j = textView2;
        this.f15802k = relativeLayout4;
        this.f15803l = view;
    }

    @NonNull
    public static ActivityCommentSelfListBinding bind(@NonNull View view) {
        int i4 = R.id.actionbarLayout;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.actionbarLayout);
        if (relativeLayout != null) {
            i4 = R.id.back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
            if (imageView != null) {
                i4 = R.id.back_image;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
                if (imageView2 != null) {
                    i4 = R.id.listview;
                    XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listview);
                    if (xListView2 != null) {
                        i4 = R.id.loadingView;
                        ForumLoadingView forumLoadingView = (ForumLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
                        if (forumLoadingView != null) {
                            i4 = R.id.newTitle;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.newTitle);
                            if (relativeLayout2 != null) {
                                i4 = R.id.setting2;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.setting2);
                                if (textView != null) {
                                    i4 = R.id.setting3;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.setting3);
                                    if (textView2 != null) {
                                        i4 = R.id.f15616t;
                                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.f15616t);
                                        if (relativeLayout3 != null) {
                                            i4 = R.id.titleStatubar;
                                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.titleStatubar);
                                            if (findChildViewById != null) {
                                                return new ActivityCommentSelfListBinding((RelativeLayout) view, relativeLayout, imageView, imageView2, xListView2, forumLoadingView, relativeLayout2, textView, textView2, relativeLayout3, findChildViewById);
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
    public static ActivityCommentSelfListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f15793b;
    }

    @NonNull
    public static ActivityCommentSelfListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_comment_self_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
