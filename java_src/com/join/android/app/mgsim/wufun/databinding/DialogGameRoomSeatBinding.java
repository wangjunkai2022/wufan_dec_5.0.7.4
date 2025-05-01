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
public final class DialogGameRoomSeatBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18765b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f18766c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f18767d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f18768e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f18769f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18770g;

    private DialogGameRoomSeatBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull Button button2, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView) {
        this.f18765b = relativeLayout;
        this.f18766c = button;
        this.f18767d = button2;
        this.f18768e = linearLayout;
        this.f18769f = relativeLayout2;
        this.f18770g = textView;
    }

    @NonNull
    public static DialogGameRoomSeatBinding bind(@NonNull View view) {
        int i4 = R.id.btn_position;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_position);
        if (button != null) {
            i4 = R.id.btn_report;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_report);
            if (button2 != null) {
                i4 = R.id.iv_close;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_close);
                if (linearLayout != null) {
                    i4 = R.id.rl_main;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_main);
                    if (relativeLayout != null) {
                        i4 = R.id.tv_position;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_position);
                        if (textView != null) {
                            return new DialogGameRoomSeatBinding((RelativeLayout) view, button, button2, linearLayout, relativeLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogGameRoomSeatBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18765b;
    }

    @NonNull
    public static DialogGameRoomSeatBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_game_room_seat, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
