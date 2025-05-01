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
public final class ChioceItemRecommandTitleBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17782b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ChioceItemDividerBinding f17783c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f17784d;

    private ChioceItemRecommandTitleBinding(@NonNull LinearLayout linearLayout, @NonNull ChioceItemDividerBinding chioceItemDividerBinding, @NonNull TextView textView) {
        this.f17782b = linearLayout;
        this.f17783c = chioceItemDividerBinding;
        this.f17784d = textView;
    }

    @NonNull
    public static ChioceItemRecommandTitleBinding bind(@NonNull View view) {
        int i4 = R.id.divider;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
        if (findChildViewById != null) {
            ChioceItemDividerBinding bind = ChioceItemDividerBinding.bind(findChildViewById);
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title);
            if (textView != null) {
                return new ChioceItemRecommandTitleBinding((LinearLayout) view, bind, textView);
            }
            i4 = R.id.title;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ChioceItemRecommandTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17782b;
    }

    @NonNull
    public static ChioceItemRecommandTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.chioce_item_recommand_title, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
