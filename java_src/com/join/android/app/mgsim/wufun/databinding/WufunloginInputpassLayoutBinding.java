package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class WufunloginInputpassLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27195b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f27196c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f27197d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f27198e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f27199f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f27200g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f27201h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f27202i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final EditText f27203j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final EditText f27204k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f27205l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f27206m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f27207n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final CheckBox f27208o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f27209p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f27210q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f27211r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f27212s;

    private WufunloginInputpassLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull EditText editText, @NonNull EditText editText2, @NonNull TextView textView5, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout2, @NonNull CheckBox checkBox, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9) {
        this.f27195b = linearLayout;
        this.f27196c = imageView;
        this.f27197d = textView;
        this.f27198e = textView2;
        this.f27199f = imageView2;
        this.f27200g = relativeLayout;
        this.f27201h = textView3;
        this.f27202i = textView4;
        this.f27203j = editText;
        this.f27204k = editText2;
        this.f27205l = textView5;
        this.f27206m = relativeLayout2;
        this.f27207n = linearLayout2;
        this.f27208o = checkBox;
        this.f27209p = textView6;
        this.f27210q = textView7;
        this.f27211r = textView8;
        this.f27212s = textView9;
    }

    @NonNull
    public static WufunloginInputpassLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
        if (imageView != null) {
            i4 = R.id.bindmessage;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.bindmessage);
            if (textView != null) {
                i4 = R.id.checkBox;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.checkBox);
                if (textView2 != null) {
                    i4 = R.id.clear;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.clear);
                    if (imageView2 != null) {
                        i4 = R.id.codeLayout;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.codeLayout);
                        if (relativeLayout != null) {
                            i4 = R.id.fergetPass;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.fergetPass);
                            if (textView3 != null) {
                                i4 = R.id.getCode;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.getCode);
                                if (textView4 != null) {
                                    i4 = R.id.inputCode;
                                    EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.inputCode);
                                    if (editText != null) {
                                        i4 = R.id.inputPass;
                                        EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.inputPass);
                                        if (editText2 != null) {
                                            i4 = R.id.loginMessage;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.loginMessage);
                                            if (textView5 != null) {
                                                i4 = R.id.passLayout;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.passLayout);
                                                if (relativeLayout2 != null) {
                                                    i4 = R.id.permissLayout;
                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.permissLayout);
                                                    if (linearLayout != null) {
                                                        i4 = R.id.seePass;
                                                        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.seePass);
                                                        if (checkBox != null) {
                                                            i4 = R.id.sendLogin;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.sendLogin);
                                                            if (textView6 != null) {
                                                                i4 = R.id.shengming;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.shengming);
                                                                if (textView7 != null) {
                                                                    i4 = R.id.titleMessage;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.titleMessage);
                                                                    if (textView8 != null) {
                                                                        i4 = R.id.xieyi;
                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.xieyi);
                                                                        if (textView9 != null) {
                                                                            return new WufunloginInputpassLayoutBinding((LinearLayout) view, imageView, textView, textView2, imageView2, relativeLayout, textView3, textView4, editText, editText2, textView5, relativeLayout2, linearLayout, checkBox, textView6, textView7, textView8, textView9);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static WufunloginInputpassLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27195b;
    }

    @NonNull
    public static WufunloginInputpassLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.wufunlogin_inputpass_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
