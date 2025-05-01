package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GameBuildItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20219b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f20220c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f20221d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f20222e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20223f;

    private GameBuildItemBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f20219b = linearLayout;
        this.f20220c = relativeLayout;
        this.f20221d = simpleDraweeView;
        this.f20222e = textView;
        this.f20223f = textView2;
    }

    @NonNull
    public static GameBuildItemBinding bind(@NonNull View view) {
        int i4 = R.id.rl_content;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_content);
        if (relativeLayout != null) {
            i4 = R.id.smv_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.smv_icon);
            if (simpleDraweeView != null) {
                i4 = R.id.tv_size;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_size);
                if (textView != null) {
                    i4 = R.id.tv_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                    if (textView2 != null) {
                        return new GameBuildItemBinding((LinearLayout) view, relativeLayout, simpleDraweeView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GameBuildItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20219b;
    }

    @NonNull
    public static GameBuildItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.game_build_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
