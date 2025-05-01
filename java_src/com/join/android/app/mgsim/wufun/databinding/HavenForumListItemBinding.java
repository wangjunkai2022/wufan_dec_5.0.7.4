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
public final class HavenForumListItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f21438b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21439c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f21440d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21441e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ConstraintLayout f21442f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f21443g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ConstraintLayout f21444h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f21445i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f21446j;

    private HavenForumListItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout4, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f21438b = constraintLayout;
        this.f21439c = textView;
        this.f21440d = constraintLayout2;
        this.f21441e = textView2;
        this.f21442f = constraintLayout3;
        this.f21443g = imageView;
        this.f21444h = constraintLayout4;
        this.f21445i = textView3;
        this.f21446j = textView4;
    }

    @NonNull
    public static HavenForumListItemBinding bind(@NonNull View view) {
        int i4 = R.id.appName;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
        if (textView != null) {
            i4 = R.id.constraintLayout14;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraintLayout14);
            if (constraintLayout != null) {
                i4 = R.id.content;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.content);
                if (textView2 != null) {
                    i4 = R.id.detail;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.detail);
                    if (constraintLayout2 != null) {
                        i4 = R.id.imageView53;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView53);
                        if (imageView != null) {
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                            i4 = R.id.textView50;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView50);
                            if (textView3 != null) {
                                i4 = R.id.textView75;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.textView75);
                                if (textView4 != null) {
                                    return new HavenForumListItemBinding(constraintLayout3, textView, constraintLayout, textView2, constraintLayout2, imageView, constraintLayout3, textView3, textView4);
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
    public static HavenForumListItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f21438b;
    }

    @NonNull
    public static HavenForumListItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.haven_forum_list_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
