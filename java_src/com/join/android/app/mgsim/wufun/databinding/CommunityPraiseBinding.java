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
public final class CommunityPraiseBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18251b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18252c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f18253d;

    private CommunityPraiseBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.f18251b = linearLayout;
        this.f18252c = textView;
        this.f18253d = linearLayout2;
    }

    @NonNull
    public static CommunityPraiseBinding bind(@NonNull View view) {
        int i4 = R.id.redTips;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.redTips);
        if (textView != null) {
            i4 = R.id.thumbslayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.thumbslayout);
            if (linearLayout != null) {
                return new CommunityPraiseBinding((LinearLayout) view, textView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CommunityPraiseBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18251b;
    }

    @NonNull
    public static CommunityPraiseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.community_praise, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
