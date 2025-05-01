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
public final class LoginmainActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23573b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23574c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f23575d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23576e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final CheckBox f23577f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f23578g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f23579h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f23580i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f23581j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f23582k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f23583l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f23584m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f23585n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f23586o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final EditText f23587p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f23588q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f23589r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f23590s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f23591t;

    private LoginmainActivityBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull CheckBox checkBox, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout3, @NonNull ImageView imageView5, @NonNull LinearLayout linearLayout4, @NonNull TextView textView2, @NonNull LinearLayout linearLayout5, @NonNull EditText editText, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f23573b = relativeLayout;
        this.f23574c = imageView;
        this.f23575d = linearLayout;
        this.f23576e = textView;
        this.f23577f = checkBox;
        this.f23578g = imageView2;
        this.f23579h = imageView3;
        this.f23580i = linearLayout2;
        this.f23581j = imageView4;
        this.f23582k = linearLayout3;
        this.f23583l = imageView5;
        this.f23584m = linearLayout4;
        this.f23585n = textView2;
        this.f23586o = linearLayout5;
        this.f23587p = editText;
        this.f23588q = textView3;
        this.f23589r = textView4;
        this.f23590s = textView5;
        this.f23591t = textView6;
    }

    @NonNull
    public static LoginmainActivityBinding bind(@NonNull View view) {
        int i4 = R.id.back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
        if (imageView != null) {
            i4 = R.id.cancle;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.cancle);
            if (linearLayout != null) {
                i4 = R.id.cancleLogin;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.cancleLogin);
                if (textView != null) {
                    i4 = R.id.checkBox;
                    CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.checkBox);
                    if (checkBox != null) {
                        i4 = R.id.clear;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.clear);
                        if (imageView2 != null) {
                            i4 = R.id.loginQQ;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.loginQQ);
                            if (imageView3 != null) {
                                i4 = R.id.loginQQLayout;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.loginQQLayout);
                                if (linearLayout2 != null) {
                                    i4 = R.id.loginWechat;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.loginWechat);
                                    if (imageView4 != null) {
                                        i4 = R.id.loginWechatLayout;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.loginWechatLayout);
                                        if (linearLayout3 != null) {
                                            i4 = R.id.loginWeibo;
                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.loginWeibo);
                                            if (imageView5 != null) {
                                                i4 = R.id.loginWeiboLayout;
                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.loginWeiboLayout);
                                                if (linearLayout4 != null) {
                                                    i4 = R.id.nextStep;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.nextStep);
                                                    if (textView2 != null) {
                                                        i4 = R.id.otherLogin;
                                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.otherLogin);
                                                        if (linearLayout5 != null) {
                                                            i4 = R.id.phoneNumber;
                                                            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.phoneNumber);
                                                            if (editText != null) {
                                                                i4 = R.id.shengming;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.shengming);
                                                                if (textView3 != null) {
                                                                    i4 = R.id.title;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                                                    if (textView4 != null) {
                                                                        i4 = R.id.toOtherLogin;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.toOtherLogin);
                                                                        if (textView5 != null) {
                                                                            i4 = R.id.xieyi;
                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.xieyi);
                                                                            if (textView6 != null) {
                                                                                return new LoginmainActivityBinding((RelativeLayout) view, imageView, linearLayout, textView, checkBox, imageView2, imageView3, linearLayout2, imageView4, linearLayout3, imageView5, linearLayout4, textView2, linearLayout5, editText, textView3, textView4, textView5, textView6);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LoginmainActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23573b;
    }

    @NonNull
    public static LoginmainActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.loginmain_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
