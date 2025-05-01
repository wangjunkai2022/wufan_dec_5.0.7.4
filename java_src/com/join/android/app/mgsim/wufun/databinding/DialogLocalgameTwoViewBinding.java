package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogLocalgameTwoViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18825b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f18826c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18827d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18828e;

    private DialogLocalgameTwoViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f18825b = relativeLayout;
        this.f18826c = button;
        this.f18827d = textView;
        this.f18828e = textView2;
    }

    @NonNull
    public static DialogLocalgameTwoViewBinding bind(@NonNull View view) {
        int i4 = R.id.localGameTwoBt;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.localGameTwoBt);
        if (button != null) {
            i4 = R.id.localGameTwoContentTv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.localGameTwoContentTv);
            if (textView != null) {
                i4 = R.id.localGameTwoTitleTv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.localGameTwoTitleTv);
                if (textView2 != null) {
                    return new DialogLocalgameTwoViewBinding((RelativeLayout) view, button, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogLocalgameTwoViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18825b;
    }

    @NonNull
    public static DialogLocalgameTwoViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_localgame_two_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
