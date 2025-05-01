package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.textview.MovementTextView;
/* loaded from: classes3.dex */
public final class ItemIntroductionCommontDetialReplayBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f22425b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f22426c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final MovementTextView f22427d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f22428e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f22429f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f22430g;

    private ItemIntroductionCommontDetialReplayBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull MovementTextView movementTextView, @NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView) {
        this.f22425b = relativeLayout;
        this.f22426c = relativeLayout2;
        this.f22427d = movementTextView;
        this.f22428e = view;
        this.f22429f = simpleDraweeView;
        this.f22430g = textView;
    }

    @NonNull
    public static ItemIntroductionCommontDetialReplayBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i4 = R.id.content;
        MovementTextView movementTextView = (MovementTextView) ViewBindings.findChildViewById(view, R.id.content);
        if (movementTextView != null) {
            i4 = R.id.layoutTop;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.layoutTop);
            if (findChildViewById != null) {
                i4 = R.id.siv_head;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.siv_head);
                if (simpleDraweeView != null) {
                    i4 = R.id.userName;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.userName);
                    if (textView != null) {
                        return new ItemIntroductionCommontDetialReplayBinding(relativeLayout, relativeLayout, movementTextView, findChildViewById, simpleDraweeView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemIntroductionCommontDetialReplayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f22425b;
    }

    @NonNull
    public static ItemIntroductionCommontDetialReplayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_introduction_commont_detial_replay, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
