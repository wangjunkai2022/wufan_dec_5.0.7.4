package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class AccountloginNoticeDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f15683b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f15684c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f15685d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final CheckBox f15686e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f15687f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f15688g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f15689h;

    private AccountloginNoticeDialogBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull CheckBox checkBox, @NonNull TextView textView, @NonNull View view, @NonNull TextView textView2) {
        this.f15683b = linearLayout;
        this.f15684c = button;
        this.f15685d = button2;
        this.f15686e = checkBox;
        this.f15687f = textView;
        this.f15688g = view;
        this.f15689h = textView2;
    }

    @NonNull
    public static AccountloginNoticeDialogBinding bind(@NonNull View view) {
        int i4 = R.id.dialog_button_cancle;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_cancle);
        if (button != null) {
            i4 = R.id.dialog_button_ok;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_ok);
            if (button2 != null) {
                i4 = R.id.dialogCb;
                CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.dialogCb);
                if (checkBox != null) {
                    i4 = R.id.dialog_content;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_content);
                    if (textView != null) {
                        i4 = R.id.middle;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.middle);
                        if (findChildViewById != null) {
                            i4 = R.id.tip_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tip_title);
                            if (textView2 != null) {
                                return new AccountloginNoticeDialogBinding((LinearLayout) view, button, button2, checkBox, textView, findChildViewById, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static AccountloginNoticeDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f15683b;
    }

    @NonNull
    public static AccountloginNoticeDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.accountlogin_notice_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
