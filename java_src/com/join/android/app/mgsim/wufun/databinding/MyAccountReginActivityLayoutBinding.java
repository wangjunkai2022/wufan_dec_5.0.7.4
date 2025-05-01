package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
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
public final class MyAccountReginActivityLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25261b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25262c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CheckBox f25263d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25264e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f25265f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f25266g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f25267h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f25268i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final EditText f25269j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final Button f25270k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ScrollView f25271l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final EditText f25272m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f25273n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final EditText f25274o;

    private MyAccountReginActivityLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull CheckBox checkBox, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull EditText editText, @NonNull Button button, @NonNull ScrollView scrollView, @NonNull EditText editText2, @NonNull TextView textView3, @NonNull EditText editText3) {
        this.f25261b = linearLayout;
        this.f25262c = textView;
        this.f25263d = checkBox;
        this.f25264e = textView2;
        this.f25265f = linearLayout2;
        this.f25266g = linearLayout3;
        this.f25267h = linearLayout4;
        this.f25268i = linearLayout5;
        this.f25269j = editText;
        this.f25270k = button;
        this.f25271l = scrollView;
        this.f25272m = editText2;
        this.f25273n = textView3;
        this.f25274o = editText3;
    }

    @NonNull
    public static MyAccountReginActivityLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.accoutTitle;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.accoutTitle);
        if (textView != null) {
            i4 = R.id.agreeCheckBox;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.agreeCheckBox);
            if (checkBox != null) {
                i4 = R.id.forget;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.forget);
                if (textView2 != null) {
                    i4 = R.id.lLayout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.lLayout);
                    if (linearLayout != null) {
                        i4 = R.id.linearLayout;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout);
                        if (linearLayout2 != null) {
                            i4 = R.id.linearLayout2;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout2);
                            if (linearLayout3 != null) {
                                i4 = R.id.linearLayout4;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout4);
                                if (linearLayout4 != null) {
                                    i4 = R.id.password;
                                    EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.password);
                                    if (editText != null) {
                                        i4 = R.id.reginButton;
                                        Button button = (Button) ViewBindings.findChildViewById(view, R.id.reginButton);
                                        if (button != null) {
                                            i4 = R.id.scrollView;
                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                            if (scrollView != null) {
                                                i4 = R.id.telPhone;
                                                EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.telPhone);
                                                if (editText2 != null) {
                                                    i4 = R.id.textView3;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView3);
                                                    if (textView3 != null) {
                                                        i4 = R.id.userName;
                                                        EditText editText3 = (EditText) ViewBindings.findChildViewById(view, R.id.userName);
                                                        if (editText3 != null) {
                                                            return new MyAccountReginActivityLayoutBinding((LinearLayout) view, textView, checkBox, textView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, editText, button, scrollView, editText2, textView3, editText3);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MyAccountReginActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25261b;
    }

    @NonNull
    public static MyAccountReginActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.my_account_regin_activity_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
