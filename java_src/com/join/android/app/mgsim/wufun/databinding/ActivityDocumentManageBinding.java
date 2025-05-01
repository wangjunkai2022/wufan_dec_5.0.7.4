package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityDocumentManageBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f15989b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f15990c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f15991d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f15992e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f15993f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f15994g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f15995h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RadioButton f15996i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RadioButton f15997j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final RadioButton f15998k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RadioButton f15999l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RadioGroup f16000m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RadioGroup f16001n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final RelativeLayout f16002o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final RelativeLayout f16003p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final RelativeLayout f16004q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final SimpleDraweeView f16005r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f16006s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f16007t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f16008u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final TextView f16009v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final TextView f16010w;

    private ActivityDocumentManageBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4, @NonNull RadioGroup radioGroup, @NonNull RadioGroup radioGroup2, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f15989b = relativeLayout;
        this.f15990c = linearLayout;
        this.f15991d = frameLayout;
        this.f15992e = imageView;
        this.f15993f = imageView2;
        this.f15994g = linearLayout2;
        this.f15995h = textView;
        this.f15996i = radioButton;
        this.f15997j = radioButton2;
        this.f15998k = radioButton3;
        this.f15999l = radioButton4;
        this.f16000m = radioGroup;
        this.f16001n = radioGroup2;
        this.f16002o = relativeLayout2;
        this.f16003p = relativeLayout3;
        this.f16004q = relativeLayout4;
        this.f16005r = simpleDraweeView;
        this.f16006s = textView2;
        this.f16007t = textView3;
        this.f16008u = textView4;
        this.f16009v = textView5;
        this.f16010w = textView6;
    }

    @NonNull
    public static ActivityDocumentManageBinding bind(@NonNull View view) {
        int i4 = R.id.archive_back;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.archive_back);
        if (linearLayout != null) {
            i4 = R.id.frag;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.frag);
            if (frameLayout != null) {
                i4 = R.id.iv_myarchive_open;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_myarchive_open);
                if (imageView != null) {
                    i4 = R.id.iv_shop_open;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_shop_open);
                    if (imageView2 != null) {
                        i4 = R.id.ll_manage;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_manage);
                        if (linearLayout2 != null) {
                            i4 = R.id.myshop;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.myshop);
                            if (textView != null) {
                                i4 = R.id.rb_buy;
                                RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_buy);
                                if (radioButton != null) {
                                    i4 = R.id.rb_colud;
                                    RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_colud);
                                    if (radioButton2 != null) {
                                        i4 = R.id.rb_local;
                                        RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_local);
                                        if (radioButton3 != null) {
                                            i4 = R.id.rb_remoned;
                                            RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_remoned);
                                            if (radioButton4 != null) {
                                                i4 = R.id.rg_myarchive;
                                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rg_myarchive);
                                                if (radioGroup != null) {
                                                    i4 = R.id.rg_myshop;
                                                    RadioGroup radioGroup2 = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rg_myshop);
                                                    if (radioGroup2 != null) {
                                                        i4 = R.id.rl_bg;
                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_bg);
                                                        if (relativeLayout != null) {
                                                            i4 = R.id.rl_myarchive;
                                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_myarchive);
                                                            if (relativeLayout2 != null) {
                                                                i4 = R.id.rl_shop;
                                                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_shop);
                                                                if (relativeLayout3 != null) {
                                                                    i4 = R.id.simdw;
                                                                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.simdw);
                                                                    if (simpleDraweeView != null) {
                                                                        i4 = R.id.tv_manage;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_manage);
                                                                        if (textView2 != null) {
                                                                            i4 = R.id.tv_myarchive;
                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_myarchive);
                                                                            if (textView3 != null) {
                                                                                i4 = R.id.tv_myarchive_size;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_myarchive_size);
                                                                                if (textView4 != null) {
                                                                                    i4 = R.id.tv_red;
                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_red);
                                                                                    if (textView5 != null) {
                                                                                        i4 = R.id.tv_shop_size;
                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_shop_size);
                                                                                        if (textView6 != null) {
                                                                                            return new ActivityDocumentManageBinding((RelativeLayout) view, linearLayout, frameLayout, imageView, imageView2, linearLayout2, textView, radioButton, radioButton2, radioButton3, radioButton4, radioGroup, radioGroup2, relativeLayout, relativeLayout2, relativeLayout3, simpleDraweeView, textView2, textView3, textView4, textView5, textView6);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityDocumentManageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f15989b;
    }

    @NonNull
    public static ActivityDocumentManageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_document_manage, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
