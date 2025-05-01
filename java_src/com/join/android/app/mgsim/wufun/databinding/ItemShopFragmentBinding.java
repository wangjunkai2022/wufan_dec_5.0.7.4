package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemShopFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22764b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f22765c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f22766d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f22767e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f22768f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f22769g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RadioButton f22770h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RadioButton f22771i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RadioButton f22772j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final RadioButton f22773k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f22774l;

    private ItemShopFragmentBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4, @NonNull RelativeLayout relativeLayout) {
        this.f22764b = linearLayout;
        this.f22765c = frameLayout;
        this.f22766d = linearLayout2;
        this.f22767e = linearLayout3;
        this.f22768f = linearLayout4;
        this.f22769g = linearLayout5;
        this.f22770h = radioButton;
        this.f22771i = radioButton2;
        this.f22772j = radioButton3;
        this.f22773k = radioButton4;
        this.f22774l = relativeLayout;
    }

    @NonNull
    public static ItemShopFragmentBinding bind(@NonNull View view) {
        int i4 = R.id.frag_shop;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.frag_shop);
        if (frameLayout != null) {
            i4 = R.id.ll_good;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_good);
            if (linearLayout != null) {
                i4 = R.id.ll_my;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_my);
                if (linearLayout2 != null) {
                    i4 = R.id.ll_new;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_new);
                    if (linearLayout3 != null) {
                        i4 = R.id.ll_zong;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_zong);
                        if (linearLayout4 != null) {
                            i4 = R.id.rb_good;
                            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_good);
                            if (radioButton != null) {
                                i4 = R.id.rb_my;
                                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_my);
                                if (radioButton2 != null) {
                                    i4 = R.id.rb_new;
                                    RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_new);
                                    if (radioButton3 != null) {
                                        i4 = R.id.rb_zong;
                                        RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_zong);
                                        if (radioButton4 != null) {
                                            i4 = R.id.rl_titleshopbar;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_titleshopbar);
                                            if (relativeLayout != null) {
                                                return new ItemShopFragmentBinding((LinearLayout) view, frameLayout, linearLayout, linearLayout2, linearLayout3, linearLayout4, radioButton, radioButton2, radioButton3, radioButton4, relativeLayout);
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
    public static ItemShopFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22764b;
    }

    @NonNull
    public static ItemShopFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_shop_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
