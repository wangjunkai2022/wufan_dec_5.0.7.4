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
public final class DialogInvitePwdBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18795b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f18796c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f18797d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18798e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18799f;

    private DialogInvitePwdBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f18795b = relativeLayout;
        this.f18796c = button;
        this.f18797d = linearLayout;
        this.f18798e = textView;
        this.f18799f = textView2;
    }

    @NonNull
    public static DialogInvitePwdBinding bind(@NonNull View view) {
        int i4 = R.id.btn_copy;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_copy);
        if (button != null) {
            i4 = R.id.iv_close;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_close);
            if (linearLayout != null) {
                i4 = R.id.tv_pwd_info;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pwd_info);
                if (textView != null) {
                    i4 = R.id.tv_top;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top);
                    if (textView2 != null) {
                        return new DialogInvitePwdBinding((RelativeLayout) view, button, linearLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogInvitePwdBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18795b;
    }

    @NonNull
    public static DialogInvitePwdBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_invite_pwd, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
