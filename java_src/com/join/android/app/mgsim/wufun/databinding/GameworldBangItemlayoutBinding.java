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
public final class GameworldBangItemlayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21256b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21257c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21258d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21259e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f21260f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f21261g;

    private GameworldBangItemlayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView4) {
        this.f21256b = linearLayout;
        this.f21257c = textView;
        this.f21258d = textView2;
        this.f21259e = textView3;
        this.f21260f = simpleDraweeView;
        this.f21261g = textView4;
    }

    @NonNull
    public static GameworldBangItemlayoutBinding bind(@NonNull View view) {
        int i4 = R.id.mingci;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.mingci);
        if (textView != null) {
            i4 = R.id.shengchang;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.shengchang);
            if (textView2 != null) {
                i4 = R.id.shenglv;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.shenglv);
                if (textView3 != null) {
                    i4 = R.id.userIcon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.userIcon);
                    if (simpleDraweeView != null) {
                        i4 = R.id.zhandouli;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.zhandouli);
                        if (textView4 != null) {
                            return new GameworldBangItemlayoutBinding((LinearLayout) view, textView, textView2, textView3, simpleDraweeView, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GameworldBangItemlayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21256b;
    }

    @NonNull
    public static GameworldBangItemlayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gameworld_bang_itemlayout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
