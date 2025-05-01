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
public final class LayoutFriendDelDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23048b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23049c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f23050d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f23051e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f23052f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23053g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f23054h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f23055i;

    private LayoutFriendDelDialogBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f23048b = constraintLayout;
        this.f23049c = textView;
        this.f23050d = imageView;
        this.f23051e = imageView2;
        this.f23052f = view;
        this.f23053g = textView2;
        this.f23054h = textView3;
        this.f23055i = textView4;
    }

    @NonNull
    public static LayoutFriendDelDialogBinding bind(@NonNull View view) {
        int i4 = R.id.cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.cancel);
        if (textView != null) {
            i4 = R.id.imageView66;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView66);
            if (imageView != null) {
                i4 = R.id.imageView68;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView68);
                if (imageView2 != null) {
                    i4 = R.id.iv_close;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.iv_close);
                    if (findChildViewById != null) {
                        i4 = R.id.ok;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.ok);
                        if (textView2 != null) {
                            i4 = R.id.textView91;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView91);
                            if (textView3 != null) {
                                i4 = R.id.textView97;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.textView97);
                                if (textView4 != null) {
                                    return new LayoutFriendDelDialogBinding((ConstraintLayout) view, textView, imageView, imageView2, findChildViewById, textView2, textView3, textView4);
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
    public static LayoutFriendDelDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23048b;
    }

    @NonNull
    public static LayoutFriendDelDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_friend_del_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
