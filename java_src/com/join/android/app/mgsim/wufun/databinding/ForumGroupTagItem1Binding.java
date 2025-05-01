package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class ForumGroupTagItem1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final TextView f19523b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19524c;

    private ForumGroupTagItem1Binding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.f19523b = textView;
        this.f19524c = textView2;
    }

    @NonNull
    public static ForumGroupTagItem1Binding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new ForumGroupTagItem1Binding(textView, textView);
    }

    @NonNull
    public static ForumGroupTagItem1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public TextView getRoot() {
        return this.f19523b;
    }

    @NonNull
    public static ForumGroupTagItem1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.forum_group_tag_item1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
