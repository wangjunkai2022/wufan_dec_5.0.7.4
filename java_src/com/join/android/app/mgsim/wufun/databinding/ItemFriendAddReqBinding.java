package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemFriendAddReqBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22143b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22144c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f22145d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22146e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22147f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f22148g;

    private ItemFriendAddReqBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f22143b = constraintLayout;
        this.f22144c = textView;
        this.f22145d = simpleDraweeView;
        this.f22146e = textView2;
        this.f22147f = textView3;
        this.f22148g = textView4;
    }

    @NonNull
    public static ItemFriendAddReqBinding bind(@NonNull View view) {
        int i4 = R.id.accept;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.accept);
        if (textView != null) {
            i4 = R.id.avatar;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.avatar);
            if (simpleDraweeView != null) {
                i4 = R.id.decline;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.decline);
                if (textView2 != null) {
                    i4 = R.id.msg;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.msg);
                    if (textView3 != null) {
                        i4 = R.id.name;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                        if (textView4 != null) {
                            return new ItemFriendAddReqBinding((ConstraintLayout) view, textView, simpleDraweeView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemFriendAddReqBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22143b;
    }

    @NonNull
    public static ItemFriendAddReqBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_friend_add_req, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
