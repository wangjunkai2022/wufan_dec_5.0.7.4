package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogFightConnectServer2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18710b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18711c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18712d;

    private DialogFightConnectServer2Binding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f18710b = relativeLayout;
        this.f18711c = imageView;
        this.f18712d = textView;
    }

    @NonNull
    public static DialogFightConnectServer2Binding bind(@NonNull View view) {
        int i4 = R.id.fightLoadingIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.fightLoadingIcon);
        if (imageView != null) {
            i4 = R.id.hint;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.hint);
            if (textView != null) {
                return new DialogFightConnectServer2Binding((RelativeLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogFightConnectServer2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18710b;
    }

    @NonNull
    public static DialogFightConnectServer2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_fight_connect_server2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
