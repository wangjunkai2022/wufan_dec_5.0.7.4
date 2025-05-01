package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class CommentDetailTopPopwinBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18129b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18130c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18131d;

    private CommentDetailTopPopwinBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f18129b = linearLayout;
        this.f18130c = textView;
        this.f18131d = textView2;
    }

    @NonNull
    public static CommentDetailTopPopwinBinding bind(@NonNull View view) {
        int i4 = R.id.pop_list_order_tx;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.pop_list_order_tx);
        if (textView != null) {
            i4 = R.id.pop_report_tx;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.pop_report_tx);
            if (textView2 != null) {
                return new CommentDetailTopPopwinBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CommentDetailTopPopwinBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18129b;
    }

    @NonNull
    public static CommentDetailTopPopwinBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.comment_detail_top_popwin, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
