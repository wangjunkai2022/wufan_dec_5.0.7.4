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
public final class GameinformationCommentItemTitleBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21115b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21116c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21117d;

    private GameinformationCommentItemTitleBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f21115b = linearLayout;
        this.f21116c = textView;
        this.f21117d = textView2;
    }

    @NonNull
    public static GameinformationCommentItemTitleBinding bind(@NonNull View view) {
        int i4 = R.id.textView9;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView9);
        if (textView != null) {
            i4 = R.id.title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
            if (textView2 != null) {
                return new GameinformationCommentItemTitleBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GameinformationCommentItemTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21115b;
    }

    @NonNull
    public static GameinformationCommentItemTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gameinformation_comment_item_title, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
