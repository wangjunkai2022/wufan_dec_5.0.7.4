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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogShowBottomViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19021b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19022c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19023d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f19024e;

    private DialogShowBottomViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f19021b = relativeLayout;
        this.f19022c = textView;
        this.f19023d = textView2;
        this.f19024e = textView3;
    }

    @NonNull
    public static DialogShowBottomViewBinding bind(@NonNull View view) {
        int i4 = R.id.showAddShortcutTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.showAddShortcutTv);
        if (textView != null) {
            i4 = R.id.showDeleteGameTv;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.showDeleteGameTv);
            if (textView2 != null) {
                i4 = R.id.showGameDetailTv;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.showGameDetailTv);
                if (textView3 != null) {
                    return new DialogShowBottomViewBinding((RelativeLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogShowBottomViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19021b;
    }

    @NonNull
    public static DialogShowBottomViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_show_bottom_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
