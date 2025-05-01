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
public final class CommentListItemContentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18149b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f18150c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18151d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18152e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f18153f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18154g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18155h;

    private CommentListItemContentBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f18149b = linearLayout;
        this.f18150c = linearLayout2;
        this.f18151d = textView;
        this.f18152e = textView2;
        this.f18153f = linearLayout3;
        this.f18154g = textView3;
        this.f18155h = textView4;
    }

    @NonNull
    public static CommentListItemContentBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.content;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.content);
        if (textView != null) {
            i4 = R.id.deleteTx;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.deleteTx);
            if (textView2 != null) {
                i4 = R.id.editLl;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.editLl);
                if (linearLayout2 != null) {
                    i4 = R.id.editTx;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.editTx);
                    if (textView3 != null) {
                        i4 = R.id.more;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.more);
                        if (textView4 != null) {
                            return new CommentListItemContentBinding(linearLayout, linearLayout, textView, textView2, linearLayout2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CommentListItemContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18149b;
    }

    @NonNull
    public static CommentListItemContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.comment_list_item_content, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
