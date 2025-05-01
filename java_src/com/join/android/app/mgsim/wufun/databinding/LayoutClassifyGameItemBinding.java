package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ClassifyGameTypeLayout;
/* loaded from: classes3.dex */
public final class LayoutClassifyGameItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ClassifyGameTypeLayout f22953b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22954c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22955d;

    private LayoutClassifyGameItemBinding(@NonNull ClassifyGameTypeLayout classifyGameTypeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView) {
        this.f22953b = classifyGameTypeLayout;
        this.f22954c = simpleDraweeView;
        this.f22955d = textView;
    }

    @NonNull
    public static LayoutClassifyGameItemBinding bind(@NonNull View view) {
        int i4 = R.id.classify_game_img;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.classify_game_img);
        if (simpleDraweeView != null) {
            i4 = R.id.classify_game_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.classify_game_name);
            if (textView != null) {
                return new LayoutClassifyGameItemBinding((ClassifyGameTypeLayout) view, simpleDraweeView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutClassifyGameItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ClassifyGameTypeLayout getRoot() {
        return this.f22953b;
    }

    @NonNull
    public static LayoutClassifyGameItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_classify_game_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
