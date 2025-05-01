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
public final class DialogRoomSrvPlayModeTipBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19001b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f19002c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f19003d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f19004e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f19005f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19006g;

    private DialogRoomSrvPlayModeTipBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView) {
        this.f19001b = relativeLayout;
        this.f19002c = button;
        this.f19003d = linearLayout;
        this.f19004e = relativeLayout2;
        this.f19005f = relativeLayout3;
        this.f19006g = textView;
    }

    @NonNull
    public static DialogRoomSrvPlayModeTipBinding bind(@NonNull View view) {
        int i4 = R.id.btnOk;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnOk);
        if (button != null) {
            i4 = R.id.iv_close;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_close);
            if (linearLayout != null) {
                i4 = R.id.rl_main;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_main);
                if (relativeLayout != null) {
                    i4 = R.id.top;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.top);
                    if (relativeLayout2 != null) {
                        i4 = R.id.tv_top;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top);
                        if (textView != null) {
                            return new DialogRoomSrvPlayModeTipBinding((RelativeLayout) view, button, linearLayout, relativeLayout, relativeLayout2, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogRoomSrvPlayModeTipBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19001b;
    }

    @NonNull
    public static DialogRoomSrvPlayModeTipBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_room_srv_play_mode_tip, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
