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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GameDetailFootBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20260b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f20261c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f20262d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f20263e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20264f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f20265g;

    private GameDetailFootBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f20260b = linearLayout;
        this.f20261c = textView;
        this.f20262d = linearLayout2;
        this.f20263e = simpleDraweeView;
        this.f20264f = textView2;
        this.f20265g = textView3;
    }

    @NonNull
    public static GameDetailFootBinding bind(@NonNull View view) {
        int i4 = R.id.bottom;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.bottom);
        if (textView != null) {
            i4 = R.id.ll_sub;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_sub);
            if (linearLayout != null) {
                i4 = R.id.smv_sub;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.smv_sub);
                if (simpleDraweeView != null) {
                    i4 = R.id.tv_sub_sub;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sub_sub);
                    if (textView2 != null) {
                        i4 = R.id.tv_sub_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sub_title);
                        if (textView3 != null) {
                            return new GameDetailFootBinding((LinearLayout) view, textView, linearLayout, simpleDraweeView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GameDetailFootBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20260b;
    }

    @NonNull
    public static GameDetailFootBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.game_detail_foot, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
