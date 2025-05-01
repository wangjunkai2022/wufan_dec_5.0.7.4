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
public final class ItemIntroductionCommontReplayBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22435b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f22436c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22437d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f22438e;

    private ItemIntroductionCommontReplayBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull View view) {
        this.f22435b = linearLayout;
        this.f22436c = linearLayout2;
        this.f22437d = textView;
        this.f22438e = view;
    }

    @NonNull
    public static ItemIntroductionCommontReplayBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.content;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.content);
        if (textView != null) {
            i4 = R.id.layoutTop;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.layoutTop);
            if (findChildViewById != null) {
                return new ItemIntroductionCommontReplayBinding(linearLayout, linearLayout, textView, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemIntroductionCommontReplayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22435b;
    }

    @NonNull
    public static ItemIntroductionCommontReplayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_introduction_commont_replay, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
