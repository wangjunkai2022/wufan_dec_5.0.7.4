package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogPostingSelectCoinsBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18960b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f18961c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final GridView f18962d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18963e;

    private DialogPostingSelectCoinsBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull GridView gridView, @NonNull TextView textView) {
        this.f18960b = relativeLayout;
        this.f18961c = linearLayout;
        this.f18962d = gridView;
        this.f18963e = textView;
    }

    @NonNull
    public static DialogPostingSelectCoinsBinding bind(@NonNull View view) {
        int i4 = R.id.iv_close;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_close);
        if (linearLayout != null) {
            i4 = R.id.mGridView;
            GridView gridView = (GridView) ViewBindings.findChildViewById(view, R.id.mGridView);
            if (gridView != null) {
                i4 = R.id.tv_current_copper;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_current_copper);
                if (textView != null) {
                    return new DialogPostingSelectCoinsBinding((RelativeLayout) view, linearLayout, gridView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogPostingSelectCoinsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18960b;
    }

    @NonNull
    public static DialogPostingSelectCoinsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_posting_select_coins, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
