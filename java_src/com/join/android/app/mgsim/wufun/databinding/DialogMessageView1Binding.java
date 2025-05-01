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
public final class DialogMessageView1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18829b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f18830c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CheckBox f18831d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f18832e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18833f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18834g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18835h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18836i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f18837j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f18838k;

    private DialogMessageView1Binding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull CheckBox checkBox, @NonNull Button button2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f18829b = linearLayout;
        this.f18830c = button;
        this.f18831d = checkBox;
        this.f18832e = button2;
        this.f18833f = textView;
        this.f18834g = textView2;
        this.f18835h = textView3;
        this.f18836i = textView4;
        this.f18837j = textView5;
        this.f18838k = textView6;
    }

    @NonNull
    public static DialogMessageView1Binding bind(@NonNull View view) {
        int i4 = R.id.dialog_button_cancle;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_cancle);
        if (button != null) {
            i4 = R.id.dialogCb;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.dialogCb);
            if (checkBox != null) {
                i4 = R.id.dialogMessagBt;
                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.dialogMessagBt);
                if (button2 != null) {
                    i4 = R.id.dialogMessagCopyTx;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.dialogMessagCopyTx);
                    if (textView != null) {
                        i4 = R.id.dialogMessagOneTx;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.dialogMessagOneTx);
                        if (textView2 != null) {
                            i4 = R.id.dialogMessagThreeTx;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.dialogMessagThreeTx);
                            if (textView3 != null) {
                                i4 = R.id.dialogMessagTwoTx;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.dialogMessagTwoTx);
                                if (textView4 != null) {
                                    i4 = R.id.dialogMessageTitleTx;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.dialogMessageTitleTx);
                                    if (textView5 != null) {
                                        i4 = R.id.tip_title;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tip_title);
                                        if (textView6 != null) {
                                            return new DialogMessageView1Binding((LinearLayout) view, button, checkBox, button2, textView, textView2, textView3, textView4, textView5, textView6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogMessageView1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18829b;
    }

    @NonNull
    public static DialogMessageView1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_message_view1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
