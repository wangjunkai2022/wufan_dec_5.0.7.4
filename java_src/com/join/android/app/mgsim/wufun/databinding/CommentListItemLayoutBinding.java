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
public final class CommentListItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18185b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f18186c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18187d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18188e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18189f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18190g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f18191h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f18192i;

    private CommentListItemLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView) {
        this.f18185b = linearLayout;
        this.f18186c = simpleDraweeView;
        this.f18187d = textView;
        this.f18188e = textView2;
        this.f18189f = textView3;
        this.f18190g = textView4;
        this.f18191h = linearLayout2;
        this.f18192i = imageView;
    }

    @NonNull
    public static CommentListItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.appIcon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appIcon);
        if (simpleDraweeView != null) {
            i4 = R.id.appName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
            if (textView != null) {
                i4 = R.id.appTag;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appTag);
                if (textView2 != null) {
                    i4 = R.id.appType;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.appType);
                    if (textView3 != null) {
                        i4 = R.id.content;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.content);
                        if (textView4 != null) {
                            LinearLayout linearLayout = (LinearLayout) view;
                            i4 = R.id.selectbutn;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.selectbutn);
                            if (imageView != null) {
                                return new CommentListItemLayoutBinding(linearLayout, simpleDraweeView, textView, textView2, textView3, textView4, linearLayout, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CommentListItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18185b;
    }

    @NonNull
    public static CommentListItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.comment_list_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
