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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DetialCloudArchiveLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f18415b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18416c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18417d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f18418e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f18419f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f18420g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18421h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f18422i;

    private DetialCloudArchiveLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull View view, @NonNull TextView textView3, @NonNull View view2) {
        this.f18415b = constraintLayout;
        this.f18416c = textView;
        this.f18417d = textView2;
        this.f18418e = simpleDraweeView;
        this.f18419f = imageView;
        this.f18420g = view;
        this.f18421h = textView3;
        this.f18422i = view2;
    }

    @NonNull
    public static DetialCloudArchiveLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.auth;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.auth);
        if (textView != null) {
            i4 = R.id.count;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.count);
            if (textView2 != null) {
                i4 = R.id.icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                if (simpleDraweeView != null) {
                    i4 = R.id.imageView47;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView47);
                    if (imageView != null) {
                        i4 = R.id.line_h;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line_h);
                        if (findChildViewById != null) {
                            i4 = R.id.title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                            if (textView3 != null) {
                                i4 = R.id.top;
                                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.top);
                                if (findChildViewById2 != null) {
                                    return new DetialCloudArchiveLayoutBinding((ConstraintLayout) view, textView, textView2, simpleDraweeView, imageView, findChildViewById, textView3, findChildViewById2);
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
    public static DetialCloudArchiveLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f18415b;
    }

    @NonNull
    public static DetialCloudArchiveLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.detial_cloud_archive_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
