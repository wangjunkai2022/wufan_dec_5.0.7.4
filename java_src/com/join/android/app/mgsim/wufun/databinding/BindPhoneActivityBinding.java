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
public final class BindPhoneActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17514b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17515c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f17516d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final EditText f17517e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f17518f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ScrollView f17519g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17520h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f17521i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final Button f17522j;

    private BindPhoneActivityBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull EditText editText, @NonNull EditText editText2, @NonNull TextView textView2, @NonNull ScrollView scrollView, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull Button button) {
        this.f17514b = linearLayout;
        this.f17515c = textView;
        this.f17516d = editText;
        this.f17517e = editText2;
        this.f17518f = textView2;
        this.f17519g = scrollView;
        this.f17520h = textView3;
        this.f17521i = textView4;
        this.f17522j = button;
    }

    @NonNull
    public static BindPhoneActivityBinding bind(@NonNull View view) {
        int i4 = R.id.getCodeTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.getCodeTv);
        if (textView != null) {
            i4 = R.id.inputCode;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.inputCode);
            if (editText != null) {
                i4 = R.id.inputPhone;
                EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.inputPhone);
                if (editText2 != null) {
                    i4 = R.id.myAccountTv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.myAccountTv);
                    if (textView2 != null) {
                        i4 = R.id.scrollView;
                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                        if (scrollView != null) {
                            i4 = R.id.securityLevel;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.securityLevel);
                            if (textView3 != null) {
                                i4 = R.id.securitySuggest;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.securitySuggest);
                                if (textView4 != null) {
                                    i4 = R.id.settingButn;
                                    Button button = (Button) ViewBindings.findChildViewById(view, R.id.settingButn);
                                    if (button != null) {
                                        return new BindPhoneActivityBinding((LinearLayout) view, textView, editText, editText2, textView2, scrollView, textView3, textView4, button);
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
    public static BindPhoneActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17514b;
    }

    @NonNull
    public static BindPhoneActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.bind_phone_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
