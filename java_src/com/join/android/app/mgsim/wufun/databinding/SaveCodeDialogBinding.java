package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SaveCodeDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26276b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f26277c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f26278d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26279e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26280f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26281g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f26282h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f26283i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26284j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f26285k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26286l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26287m;

    private SaveCodeDialogBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f26276b = linearLayout;
        this.f26277c = button;
        this.f26278d = button2;
        this.f26279e = textView;
        this.f26280f = textView2;
        this.f26281g = textView3;
        this.f26282h = linearLayout2;
        this.f26283i = linearLayout3;
        this.f26284j = textView4;
        this.f26285k = textView5;
        this.f26286l = textView6;
        this.f26287m = textView7;
    }

    @NonNull
    public static SaveCodeDialogBinding bind(@NonNull View view) {
        int i4 = R.id.dialog_button_cancle;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_cancle);
        if (button != null) {
            i4 = R.id.dialog_button_ok;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_ok);
            if (button2 != null) {
                i4 = R.id.dialog_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_content);
                if (textView != null) {
                    i4 = R.id.dialog_desci;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_desci);
                    if (textView2 != null) {
                        i4 = R.id.dialog_time;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_time);
                        if (textView3 != null) {
                            i4 = R.id.layoutBottom;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutBottom);
                            if (linearLayout != null) {
                                i4 = R.id.layoutTop;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutTop);
                                if (linearLayout2 != null) {
                                    i4 = R.id.moneyText;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                                    if (textView4 != null) {
                                        i4 = R.id.saveCodeContent;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.saveCodeContent);
                                        if (textView5 != null) {
                                            i4 = R.id.saveCodeTv;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.saveCodeTv);
                                            if (textView6 != null) {
                                                i4 = R.id.tip_title;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tip_title);
                                                if (textView7 != null) {
                                                    return new SaveCodeDialogBinding((LinearLayout) view, button, button2, textView, textView2, textView3, linearLayout, linearLayout2, textView4, textView5, textView6, textView7);
                                                }
                                            }
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
    public static SaveCodeDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26276b;
    }

    @NonNull
    public static SaveCodeDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.save_code_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
