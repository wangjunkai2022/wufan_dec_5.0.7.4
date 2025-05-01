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
public final class DialogMessageViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18839b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f18840c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f18841d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18842e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18843f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18844g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18845h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18846i;

    private DialogMessageViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull Button button2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f18839b = relativeLayout;
        this.f18840c = button;
        this.f18841d = button2;
        this.f18842e = textView;
        this.f18843f = textView2;
        this.f18844g = textView3;
        this.f18845h = textView4;
        this.f18846i = textView5;
    }

    @NonNull
    public static DialogMessageViewBinding bind(@NonNull View view) {
        int i4 = R.id.dialogMessagBt;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.dialogMessagBt);
        if (button != null) {
            i4 = R.id.dialogMessagCloseBt;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.dialogMessagCloseBt);
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
                                    return new DialogMessageViewBinding((RelativeLayout) view, button, button2, textView, textView2, textView3, textView4, textView5);
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
    public static DialogMessageViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18839b;
    }

    @NonNull
    public static DialogMessageViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_message_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
