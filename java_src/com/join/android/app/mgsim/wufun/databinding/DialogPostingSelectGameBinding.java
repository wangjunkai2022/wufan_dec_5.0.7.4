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
public final class DialogPostingSelectGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18964b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18965c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18966d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18967e;

    private DialogPostingSelectGameBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f18964b = relativeLayout;
        this.f18965c = textView;
        this.f18966d = textView2;
        this.f18967e = textView3;
    }

    @NonNull
    public static DialogPostingSelectGameBinding bind(@NonNull View view) {
        int i4 = R.id.tv_collection;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_collection);
        if (textView != null) {
            i4 = R.id.tv_local;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_local);
            if (textView2 != null) {
                i4 = R.id.tv_papaku;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_papaku);
                if (textView3 != null) {
                    return new DialogPostingSelectGameBinding((RelativeLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogPostingSelectGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18964b;
    }

    @NonNull
    public static DialogPostingSelectGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_posting_select_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
