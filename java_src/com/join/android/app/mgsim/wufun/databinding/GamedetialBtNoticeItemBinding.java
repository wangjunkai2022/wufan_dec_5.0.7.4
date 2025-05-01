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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GamedetialBtNoticeItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f20860b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f20861c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f20862d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f20863e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20864f;

    private GamedetialBtNoticeItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f20860b = constraintLayout;
        this.f20861c = constraintLayout2;
        this.f20862d = textView;
        this.f20863e = textView2;
        this.f20864f = textView3;
    }

    @NonNull
    public static GamedetialBtNoticeItemBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i4 = R.id.message;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.message);
        if (textView != null) {
            i4 = R.id.tag;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tag);
            if (textView2 != null) {
                i4 = R.id.title;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                if (textView3 != null) {
                    return new GamedetialBtNoticeItemBinding(constraintLayout, constraintLayout, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetialBtNoticeItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f20860b;
    }

    @NonNull
    public static GamedetialBtNoticeItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetial_bt_notice_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
