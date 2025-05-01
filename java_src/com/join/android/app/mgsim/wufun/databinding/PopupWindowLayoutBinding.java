package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PopupWindowLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26129b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f26130c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f26131d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f26132e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Button f26133f;

    private PopupWindowLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull Button button2, @NonNull RelativeLayout relativeLayout2, @NonNull Button button3) {
        this.f26129b = relativeLayout;
        this.f26130c = button;
        this.f26131d = button2;
        this.f26132e = relativeLayout2;
        this.f26133f = button3;
    }

    @NonNull
    public static PopupWindowLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.deleteAllBtn;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.deleteAllBtn);
        if (button != null) {
            i4 = R.id.pauseAllBtn;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.pauseAllBtn);
            if (button2 != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i4 = R.id.startAllBtn;
                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.startAllBtn);
                if (button3 != null) {
                    return new PopupWindowLayoutBinding(relativeLayout, button, button2, relativeLayout, button3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PopupWindowLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26129b;
    }

    @NonNull
    public static PopupWindowLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.popup_window_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
