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
public final class ItemFriendLikeRecordBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22170b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22171c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f22172d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22173e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22174f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f22175g;

    private ItemFriendLikeRecordBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f22170b = constraintLayout;
        this.f22171c = simpleDraweeView;
        this.f22172d = view;
        this.f22173e = textView;
        this.f22174f = textView2;
        this.f22175g = textView3;
    }

    @NonNull
    public static ItemFriendLikeRecordBinding bind(@NonNull View view) {
        int i4 = R.id.avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.avatar);
        if (simpleDraweeView != null) {
            i4 = R.id.likeDot;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.likeDot);
            if (findChildViewById != null) {
                i4 = R.id.msg;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.msg);
                if (textView != null) {
                    i4 = R.id.name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                    if (textView2 != null) {
                        i4 = R.id.time;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.time);
                        if (textView3 != null) {
                            return new ItemFriendLikeRecordBinding((ConstraintLayout) view, simpleDraweeView, findChildViewById, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemFriendLikeRecordBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22170b;
    }

    @NonNull
    public static ItemFriendLikeRecordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_friend_like_record, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
