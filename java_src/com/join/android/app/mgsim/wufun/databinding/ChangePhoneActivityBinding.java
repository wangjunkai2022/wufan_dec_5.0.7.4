package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ChangePhoneActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17713b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17714c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f17715d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final EditText f17716e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f17717f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final EditText f17718g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17719h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ScrollView f17720i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final Button f17721j;

    private ChangePhoneActivityBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull EditText editText, @NonNull TextView textView3, @NonNull EditText editText2, @NonNull TextView textView4, @NonNull ScrollView scrollView, @NonNull Button button) {
        this.f17713b = linearLayout;
        this.f17714c = textView;
        this.f17715d = textView2;
        this.f17716e = editText;
        this.f17717f = textView3;
        this.f17718g = editText2;
        this.f17719h = textView4;
        this.f17720i = scrollView;
        this.f17721j = button;
    }

    @NonNull
    public static ChangePhoneActivityBinding bind(@NonNull View view) {
        int i4 = R.id.getCodeTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.getCodeTv);
        if (textView != null) {
            i4 = R.id.myAccountTv;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.myAccountTv);
            if (textView2 != null) {
                i4 = R.id.newInputCode;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.newInputCode);
                if (editText != null) {
                    i4 = R.id.newMessageTv;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.newMessageTv);
                    if (textView3 != null) {
                        i4 = R.id.oldInputCode;
                        EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.oldInputCode);
                        if (editText2 != null) {
                            i4 = R.id.oldMessageTv;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.oldMessageTv);
                            if (textView4 != null) {
                                i4 = R.id.scrollView;
                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                if (scrollView != null) {
                                    i4 = R.id.settingButn;
                                    Button button = (Button) ViewBindings.findChildViewById(view, R.id.settingButn);
                                    if (button != null) {
                                        return new ChangePhoneActivityBinding((LinearLayout) view, textView, textView2, editText, textView3, editText2, textView4, scrollView, button);
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
    public static ChangePhoneActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17713b;
    }

    @NonNull
    public static ChangePhoneActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.change_phone_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
