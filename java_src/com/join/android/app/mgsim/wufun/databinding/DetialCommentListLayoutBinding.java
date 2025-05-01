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
import com.join.mgps.customview.XListViewIntercept;
/* loaded from: classes3.dex */
public final class DetialCommentListLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18423b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XListViewIntercept f18424c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18425d;

    private DetialCommentListLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull XListViewIntercept xListViewIntercept, @NonNull TextView textView) {
        this.f18423b = linearLayout;
        this.f18424c = xListViewIntercept;
        this.f18425d = textView;
    }

    @NonNull
    public static DetialCommentListLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.commentListView;
        XListViewIntercept xListViewIntercept = (XListViewIntercept) ViewBindings.findChildViewById(view, R.id.commentListView);
        if (xListViewIntercept != null) {
            i4 = R.id.noComentText;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.noComentText);
            if (textView != null) {
                return new DetialCommentListLayoutBinding((LinearLayout) view, xListViewIntercept, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DetialCommentListLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18423b;
    }

    @NonNull
    public static DetialCommentListLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.detial_comment_list_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
