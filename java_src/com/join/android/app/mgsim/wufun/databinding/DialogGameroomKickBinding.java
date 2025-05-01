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
public final class DialogGameroomKickBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18773b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f18774c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18775d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18776e;

    private DialogGameroomKickBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f18773b = relativeLayout;
        this.f18774c = linearLayout;
        this.f18775d = textView;
        this.f18776e = textView2;
    }

    @NonNull
    public static DialogGameroomKickBinding bind(@NonNull View view) {
        int i4 = R.id.iv_close;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_close);
        if (linearLayout != null) {
            i4 = R.id.tv_kickinfo;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_kickinfo);
            if (textView != null) {
                i4 = R.id.tv_position;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_position);
                if (textView2 != null) {
                    return new DialogGameroomKickBinding((RelativeLayout) view, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogGameroomKickBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18773b;
    }

    @NonNull
    public static DialogGameroomKickBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_gameroom_kick, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
