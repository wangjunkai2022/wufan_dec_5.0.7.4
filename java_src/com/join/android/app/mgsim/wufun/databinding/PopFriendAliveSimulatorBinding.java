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
public final class PopFriendAliveSimulatorBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26010b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26011c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26012d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26013e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f26014f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f26015g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26016h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f26017i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final View f26018j;

    private PopFriendAliveSimulatorBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull View view, @NonNull View view2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view3) {
        this.f26010b = constraintLayout;
        this.f26011c = imageView;
        this.f26012d = imageView2;
        this.f26013e = textView;
        this.f26014f = view;
        this.f26015g = view2;
        this.f26016h = textView2;
        this.f26017i = textView3;
        this.f26018j = view3;
    }

    @NonNull
    public static PopFriendAliveSimulatorBinding bind(@NonNull View view) {
        int i4 = R.id.imageView71;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView71);
        if (imageView != null) {
            i4 = R.id.imageView72;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView72);
            if (imageView2 != null) {
                i4 = R.id.iv1;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.iv1);
                if (textView != null) {
                    i4 = R.id.notDisturb;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.notDisturb);
                    if (findChildViewById != null) {
                        i4 = R.id.online;
                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.online);
                        if (findChildViewById2 != null) {
                            i4 = R.id.textView95;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView95);
                            if (textView2 != null) {
                                i4 = R.id.textView96;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView96);
                                if (textView3 != null) {
                                    i4 = R.id.view9;
                                    View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.view9);
                                    if (findChildViewById3 != null) {
                                        return new PopFriendAliveSimulatorBinding((ConstraintLayout) view, imageView, imageView2, textView, findChildViewById, findChildViewById2, textView2, textView3, findChildViewById3);
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
    public static PopFriendAliveSimulatorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26010b;
    }

    @NonNull
    public static PopFriendAliveSimulatorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.pop_friend_alive_simulator, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
