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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FightTypeTitleBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19490b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19491c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19492d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f19493e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19494f;

    private FightTypeTitleBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView3) {
        this.f19490b = relativeLayout;
        this.f19491c = textView;
        this.f19492d = textView2;
        this.f19493e = linearLayout;
        this.f19494f = textView3;
    }

    @NonNull
    public static FightTypeTitleBinding bind(@NonNull View view) {
        int i4 = R.id.fightSubTitle;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.fightSubTitle);
        if (textView != null) {
            i4 = R.id.fightTitle;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.fightTitle);
            if (textView2 != null) {
                i4 = R.id.linearLayoutMFight;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayoutMFight);
                if (linearLayout != null) {
                    i4 = R.id.textLine;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textLine);
                    if (textView3 != null) {
                        return new FightTypeTitleBinding((RelativeLayout) view, textView, textView2, linearLayout, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FightTypeTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19490b;
    }

    @NonNull
    public static FightTypeTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fight_type_title, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
