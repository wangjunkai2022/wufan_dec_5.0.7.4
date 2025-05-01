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
import com.join.mgps.customview.FlowLayout;
/* loaded from: classes3.dex */
public final class FragmentClassifyBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19630b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FlowLayout f19631c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f19632d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f19633e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19634f;

    private FragmentClassifyBinding(@NonNull LinearLayout linearLayout, @NonNull FlowLayout flowLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView) {
        this.f19630b = linearLayout;
        this.f19631c = flowLayout;
        this.f19632d = linearLayout2;
        this.f19633e = linearLayout3;
        this.f19634f = textView;
    }

    @NonNull
    public static FragmentClassifyBinding bind(@NonNull View view) {
        int i4 = R.id.classify_game;
        FlowLayout flowLayout = (FlowLayout) ViewBindings.findChildViewById(view, R.id.classify_game);
        if (flowLayout != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i4 = R.id.game_classify;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.game_classify);
            if (linearLayout2 != null) {
                i4 = R.id.textView28;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView28);
                if (textView != null) {
                    return new FragmentClassifyBinding(linearLayout, flowLayout, linearLayout, linearLayout2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentClassifyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19630b;
    }

    @NonNull
    public static FragmentClassifyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_classify, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
