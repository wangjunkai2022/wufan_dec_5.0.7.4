package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SettingPasswordActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26500b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f26501c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f26502d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final EditText f26503e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final EditText f26504f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ScrollView f26505g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final Button f26506h;

    private SettingPasswordActivityBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull EditText editText, @NonNull EditText editText2, @NonNull EditText editText3, @NonNull ScrollView scrollView, @NonNull Button button) {
        this.f26500b = linearLayout;
        this.f26501c = linearLayout2;
        this.f26502d = editText;
        this.f26503e = editText2;
        this.f26504f = editText3;
        this.f26505g = scrollView;
        this.f26506h = button;
    }

    @NonNull
    public static SettingPasswordActivityBinding bind(@NonNull View view) {
        int i4 = R.id.layoutTop;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutTop);
        if (linearLayout != null) {
            i4 = R.id.password;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.password);
            if (editText != null) {
                i4 = R.id.recentPassword;
                EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.recentPassword);
                if (editText2 != null) {
                    i4 = R.id.repeatPassword;
                    EditText editText3 = (EditText) ViewBindings.findChildViewById(view, R.id.repeatPassword);
                    if (editText3 != null) {
                        i4 = R.id.scrollView;
                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                        if (scrollView != null) {
                            i4 = R.id.settingButn;
                            Button button = (Button) ViewBindings.findChildViewById(view, R.id.settingButn);
                            if (button != null) {
                                return new SettingPasswordActivityBinding((LinearLayout) view, linearLayout, editText, editText2, editText3, scrollView, button);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SettingPasswordActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26500b;
    }

    @NonNull
    public static SettingPasswordActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.setting_password_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
