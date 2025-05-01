package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ListviewDialogFightServerChoseBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23469b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f23470c;

    private ListviewDialogFightServerChoseBinding(@NonNull LinearLayout linearLayout, @NonNull Button button) {
        this.f23469b = linearLayout;
        this.f23470c = button;
    }

    @NonNull
    public static ListviewDialogFightServerChoseBinding bind(@NonNull View view) {
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.room);
        if (button != null) {
            return new ListviewDialogFightServerChoseBinding((LinearLayout) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.room)));
    }

    @NonNull
    public static ListviewDialogFightServerChoseBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23469b;
    }

    @NonNull
    public static ListviewDialogFightServerChoseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.listview_dialog_fight_server_chose, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
