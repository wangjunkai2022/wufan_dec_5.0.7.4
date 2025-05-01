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
public final class GameMainForunpostItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20443b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f20444c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f20445d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f20446e;

    private GameMainForunpostItemBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView) {
        this.f20443b = linearLayout;
        this.f20444c = linearLayout2;
        this.f20445d = linearLayout3;
        this.f20446e = textView;
    }

    @NonNull
    public static GameMainForunpostItemBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.ll_discuss_first;
        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_discuss_first);
        if (linearLayout2 != null) {
            i4 = R.id.tv_discuss_first;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_discuss_first);
            if (textView != null) {
                return new GameMainForunpostItemBinding(linearLayout, linearLayout, linearLayout2, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GameMainForunpostItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20443b;
    }

    @NonNull
    public static GameMainForunpostItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.game_main_forunpost_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
