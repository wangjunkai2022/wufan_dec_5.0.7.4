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
public final class MgForumPostGagSpinnerItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final TextView f24191b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24192c;

    private MgForumPostGagSpinnerItemBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.f24191b = textView;
        this.f24192c = textView2;
    }

    @NonNull
    public static MgForumPostGagSpinnerItemBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new MgForumPostGagSpinnerItemBinding(textView, textView);
    }

    @NonNull
    public static MgForumPostGagSpinnerItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public TextView getRoot() {
        return this.f24191b;
    }

    @NonNull
    public static MgForumPostGagSpinnerItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_gag_spinner_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
