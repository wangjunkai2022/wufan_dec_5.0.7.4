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
public final class DialogKickoutRoomInfoBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18800b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f18801c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f18802d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f18803e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18804f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18805g;

    private DialogKickoutRoomInfoBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull Button button2, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f18800b = relativeLayout;
        this.f18801c = button;
        this.f18802d = button2;
        this.f18803e = linearLayout;
        this.f18804f = textView;
        this.f18805g = textView2;
    }

    @NonNull
    public static DialogKickoutRoomInfoBinding bind(@NonNull View view) {
        int i4 = R.id.btn_cancel;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_cancel);
        if (button != null) {
            i4 = R.id.btn_ok;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_ok);
            if (button2 != null) {
                i4 = R.id.iv_close;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_close);
                if (linearLayout != null) {
                    i4 = R.id.tv_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                    if (textView != null) {
                        i4 = R.id.tv_top;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top);
                        if (textView2 != null) {
                            return new DialogKickoutRoomInfoBinding((RelativeLayout) view, button, button2, linearLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogKickoutRoomInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18800b;
    }

    @NonNull
    public static DialogKickoutRoomInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_kickout_room_info, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
