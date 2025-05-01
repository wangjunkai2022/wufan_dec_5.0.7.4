package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class BindPhoneActivityNewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f17523b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f17524c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f17525d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17526e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f17527f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f17528g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17529h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f17530i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final EditText f17531j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f17532k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final EditText f17533l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final EditText f17534m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f17535n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f17536o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final SimpleDraweeView f17537p;

    private BindPhoneActivityNewBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull EditText editText2, @NonNull TextView textView5, @NonNull EditText editText3, @NonNull EditText editText4, @NonNull TextView textView6, @NonNull LinearLayout linearLayout3, @NonNull SimpleDraweeView simpleDraweeView) {
        this.f17523b = relativeLayout;
        this.f17524c = linearLayout;
        this.f17525d = editText;
        this.f17526e = textView;
        this.f17527f = linearLayout2;
        this.f17528g = textView2;
        this.f17529h = textView3;
        this.f17530i = textView4;
        this.f17531j = editText2;
        this.f17532k = textView5;
        this.f17533l = editText3;
        this.f17534m = editText4;
        this.f17535n = textView6;
        this.f17536o = linearLayout3;
        this.f17537p = simpleDraweeView;
    }

    @NonNull
    public static BindPhoneActivityNewBinding bind(@NonNull View view) {
        int i4 = R.id.changeNickNameLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.changeNickNameLayout);
        if (linearLayout != null) {
            i4 = R.id.code;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.code);
            if (editText != null) {
                i4 = R.id.codeTime;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.codeTime);
                if (textView != null) {
                    i4 = R.id.editPhone;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.editPhone);
                    if (linearLayout2 != null) {
                        i4 = R.id.hintPhone;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.hintPhone);
                        if (textView2 != null) {
                            i4 = R.id.nextStep;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.nextStep);
                            if (textView3 != null) {
                                i4 = R.id.nextStep2;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.nextStep2);
                                if (textView4 != null) {
                                    i4 = R.id.nickName;
                                    EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.nickName);
                                    if (editText2 != null) {
                                        i4 = R.id.nickNameBution;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.nickNameBution);
                                        if (textView5 != null) {
                                            i4 = R.id.password;
                                            EditText editText3 = (EditText) ViewBindings.findChildViewById(view, R.id.password);
                                            if (editText3 != null) {
                                                i4 = R.id.phoneNumber;
                                                EditText editText4 = (EditText) ViewBindings.findChildViewById(view, R.id.phoneNumber);
                                                if (editText4 != null) {
                                                    i4 = R.id.phoneShow;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.phoneShow);
                                                    if (textView6 != null) {
                                                        i4 = R.id.setPassLayout;
                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.setPassLayout);
                                                        if (linearLayout3 != null) {
                                                            i4 = R.id.userIcon;
                                                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.userIcon);
                                                            if (simpleDraweeView != null) {
                                                                return new BindPhoneActivityNewBinding((RelativeLayout) view, linearLayout, editText, textView, linearLayout2, textView2, textView3, textView4, editText2, textView5, editText3, editText4, textView6, linearLayout3, simpleDraweeView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static BindPhoneActivityNewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f17523b;
    }

    @NonNull
    public static BindPhoneActivityNewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.bind_phone_activity_new, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
