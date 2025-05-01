package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumPostGagDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24184b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f24185c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f24186d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24187e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Spinner f24188f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f24189g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final EditText f24190h;

    private MgForumPostGagDialogBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull TextView textView, @NonNull Spinner spinner, @NonNull TextView textView2, @NonNull EditText editText) {
        this.f24184b = linearLayout;
        this.f24185c = button;
        this.f24186d = button2;
        this.f24187e = textView;
        this.f24188f = spinner;
        this.f24189g = textView2;
        this.f24190h = editText;
    }

    @NonNull
    public static MgForumPostGagDialogBinding bind(@NonNull View view) {
        int i4 = R.id.dialog_button_cancle;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_cancle);
        if (button != null) {
            i4 = R.id.dialog_button_ok;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_ok);
            if (button2 != null) {
                i4 = R.id.dialog_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_content);
                if (textView != null) {
                    i4 = R.id.spinner;
                    Spinner spinner = (Spinner) ViewBindings.findChildViewById(view, R.id.spinner);
                    if (spinner != null) {
                        i4 = R.id.tip_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tip_title);
                        if (textView2 != null) {
                            i4 = R.id.txt;
                            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.txt);
                            if (editText != null) {
                                return new MgForumPostGagDialogBinding((LinearLayout) view, button, button2, textView, spinner, textView2, editText);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumPostGagDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24184b;
    }

    @NonNull
    public static MgForumPostGagDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_gag_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
