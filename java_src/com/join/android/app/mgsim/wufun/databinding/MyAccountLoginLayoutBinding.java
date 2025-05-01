package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MyAccountLoginLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25244b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CheckBox f25245c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25246d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f25247e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f25248f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f25249g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f25250h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25251i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final EditText f25252j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25253k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ScrollView f25254l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f25255m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f25256n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f25257o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f25258p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final EditText f25259q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f25260r;

    private MyAccountLoginLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull CheckBox checkBox, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView2, @NonNull EditText editText, @NonNull TextView textView3, @NonNull ScrollView scrollView, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull EditText editText2, @NonNull TextView textView8) {
        this.f25244b = relativeLayout;
        this.f25245c = checkBox;
        this.f25246d = textView;
        this.f25247e = linearLayout;
        this.f25248f = imageView;
        this.f25249g = imageView2;
        this.f25250h = imageView3;
        this.f25251i = textView2;
        this.f25252j = editText;
        this.f25253k = textView3;
        this.f25254l = scrollView;
        this.f25255m = textView4;
        this.f25256n = textView5;
        this.f25257o = textView6;
        this.f25258p = textView7;
        this.f25259q = editText2;
        this.f25260r = textView8;
    }

    @NonNull
    public static MyAccountLoginLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.checkBox;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.checkBox);
        if (checkBox != null) {
            i4 = R.id.fergetbutn;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.fergetbutn);
            if (textView != null) {
                i4 = R.id.linearLayout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout);
                if (linearLayout != null) {
                    i4 = R.id.loginQQ;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.loginQQ);
                    if (imageView != null) {
                        i4 = R.id.loginWechat;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.loginWechat);
                        if (imageView2 != null) {
                            i4 = R.id.loginWeibo;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.loginWeibo);
                            if (imageView3 != null) {
                                i4 = R.id.loginbutn;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.loginbutn);
                                if (textView2 != null) {
                                    i4 = R.id.password;
                                    EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.password);
                                    if (editText != null) {
                                        i4 = R.id.passwordTitle;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.passwordTitle);
                                        if (textView3 != null) {
                                            i4 = R.id.scrollView;
                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                            if (scrollView != null) {
                                                i4 = R.id.shengming;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.shengming);
                                                if (textView4 != null) {
                                                    i4 = R.id.signUp;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.signUp);
                                                    if (textView5 != null) {
                                                        i4 = R.id.textView20;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.textView20);
                                                        if (textView6 != null) {
                                                            i4 = R.id.userNameTitle;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.userNameTitle);
                                                            if (textView7 != null) {
                                                                i4 = R.id.username;
                                                                EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.username);
                                                                if (editText2 != null) {
                                                                    i4 = R.id.xieyi;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.xieyi);
                                                                    if (textView8 != null) {
                                                                        return new MyAccountLoginLayoutBinding((RelativeLayout) view, checkBox, textView, linearLayout, imageView, imageView2, imageView3, textView2, editText, textView3, scrollView, textView4, textView5, textView6, textView7, editText2, textView8);
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
    public static MyAccountLoginLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25244b;
    }

    @NonNull
    public static MyAccountLoginLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.my_account_login_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
