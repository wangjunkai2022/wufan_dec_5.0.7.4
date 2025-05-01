package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.textview.MovementTextView;
/* loaded from: classes3.dex */
public final class ItemIntroductionCommontListReplayBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22431b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f22432c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final MovementTextView f22433d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f22434e;

    private ItemIntroductionCommontListReplayBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull MovementTextView movementTextView, @NonNull View view) {
        this.f22431b = linearLayout;
        this.f22432c = linearLayout2;
        this.f22433d = movementTextView;
        this.f22434e = view;
    }

    @NonNull
    public static ItemIntroductionCommontListReplayBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.content;
        MovementTextView movementTextView = (MovementTextView) ViewBindings.findChildViewById(view, R.id.content);
        if (movementTextView != null) {
            i4 = R.id.layoutTop;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.layoutTop);
            if (findChildViewById != null) {
                return new ItemIntroductionCommontListReplayBinding(linearLayout, linearLayout, movementTextView, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemIntroductionCommontListReplayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22431b;
    }

    @NonNull
    public static ItemIntroductionCommontListReplayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_introduction_commont_list_replay, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
