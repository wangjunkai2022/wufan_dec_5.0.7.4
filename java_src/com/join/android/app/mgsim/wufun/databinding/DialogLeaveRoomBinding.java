package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogLeaveRoomBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18806b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f18807c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f18808d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18809e;

    private DialogLeaveRoomBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.f18806b = relativeLayout;
        this.f18807c = button;
        this.f18808d = linearLayout;
        this.f18809e = textView;
    }

    @NonNull
    public static DialogLeaveRoomBinding bind(@NonNull View view) {
        int i4 = R.id.btnLeave;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnLeave);
        if (button != null) {
            i4 = R.id.iv_close;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_close);
            if (linearLayout != null) {
                i4 = R.id.tv_top;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top);
                if (textView != null) {
                    return new DialogLeaveRoomBinding((RelativeLayout) view, button, linearLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogLeaveRoomBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18806b;
    }

    @NonNull
    public static DialogLeaveRoomBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_leave_room, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
