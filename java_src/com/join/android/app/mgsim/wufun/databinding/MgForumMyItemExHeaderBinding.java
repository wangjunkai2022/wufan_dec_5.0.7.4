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
public final class MgForumMyItemExHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23991b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23992c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f23993d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f23994e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f23995f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f23996g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f23997h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f23998i;

    private MgForumMyItemExHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull View view2, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23991b = linearLayout;
        this.f23992c = imageView;
        this.f23993d = view;
        this.f23994e = view2;
        this.f23995f = imageView2;
        this.f23996g = relativeLayout;
        this.f23997h = textView;
        this.f23998i = textView2;
    }

    @NonNull
    public static MgForumMyItemExHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.arrow);
        if (imageView != null) {
            i4 = R.id.divider;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
            if (findChildViewById != null) {
                i4 = R.id.divider1;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.divider1);
                if (findChildViewById2 != null) {
                    i4 = R.id.icon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.icon);
                    if (imageView2 != null) {
                        i4 = R.id.llComment;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.llComment);
                        if (relativeLayout != null) {
                            i4 = R.id.state;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.state);
                            if (textView != null) {
                                i4 = R.id.title;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                if (textView2 != null) {
                                    return new MgForumMyItemExHeaderBinding((LinearLayout) view, imageView, findChildViewById, findChildViewById2, imageView2, relativeLayout, textView, textView2);
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
    public static MgForumMyItemExHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23991b;
    }

    @NonNull
    public static MgForumMyItemExHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_my_item_ex_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
