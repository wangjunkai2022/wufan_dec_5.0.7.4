package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class HandshankSetKeyBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21417b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f21418c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f21419d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f21420e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Button f21421f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final Button f21422g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final Button f21423h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final Button f21424i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final Button f21425j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final Button f21426k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final Button f21427l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final Button f21428m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f21429n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f21430o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final Button f21431p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final Button f21432q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final Button f21433r;

    private HandshankSetKeyBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull Button button4, @NonNull Button button5, @NonNull Button button6, @NonNull Button button7, @NonNull Button button8, @NonNull Button button9, @NonNull Button button10, @NonNull Button button11, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull Button button12, @NonNull Button button13, @NonNull Button button14) {
        this.f21417b = linearLayout;
        this.f21418c = button;
        this.f21419d = button2;
        this.f21420e = button3;
        this.f21421f = button4;
        this.f21422g = button5;
        this.f21423h = button6;
        this.f21424i = button7;
        this.f21425j = button8;
        this.f21426k = button9;
        this.f21427l = button10;
        this.f21428m = button11;
        this.f21429n = imageView;
        this.f21430o = imageView2;
        this.f21431p = button12;
        this.f21432q = button13;
        this.f21433r = button14;
    }

    @NonNull
    public static HandshankSetKeyBinding bind(@NonNull View view) {
        int i4 = R.id.f15589a;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.f15589a);
        if (button != null) {
            i4 = R.id.f15591b;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.f15591b);
            if (button2 != null) {
                i4 = R.id.down;
                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.down);
                if (button3 != null) {
                    i4 = R.id.f15607l1;
                    Button button4 = (Button) ViewBindings.findChildViewById(view, R.id.f15607l1);
                    if (button4 != null) {
                        i4 = R.id.f15608l2;
                        Button button5 = (Button) ViewBindings.findChildViewById(view, R.id.f15608l2);
                        if (button5 != null) {
                            i4 = R.id.left;
                            Button button6 = (Button) ViewBindings.findChildViewById(view, R.id.left);
                            if (button6 != null) {
                                i4 = R.id.f15614r1;
                                Button button7 = (Button) ViewBindings.findChildViewById(view, R.id.f15614r1);
                                if (button7 != null) {
                                    i4 = R.id.f15615r2;
                                    Button button8 = (Button) ViewBindings.findChildViewById(view, R.id.f15615r2);
                                    if (button8 != null) {
                                        i4 = R.id.right;
                                        Button button9 = (Button) ViewBindings.findChildViewById(view, R.id.right);
                                        if (button9 != null) {
                                            i4 = R.id.select;
                                            Button button10 = (Button) ViewBindings.findChildViewById(view, R.id.select);
                                            if (button10 != null) {
                                                i4 = R.id.start;
                                                Button button11 = (Button) ViewBindings.findChildViewById(view, R.id.start);
                                                if (button11 != null) {
                                                    i4 = R.id.thumb_l;
                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.thumb_l);
                                                    if (imageView != null) {
                                                        i4 = R.id.thumb_r;
                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.thumb_r);
                                                        if (imageView2 != null) {
                                                            i4 = R.id.up;
                                                            Button button12 = (Button) ViewBindings.findChildViewById(view, R.id.up);
                                                            if (button12 != null) {
                                                                i4 = R.id.f15620x;
                                                                Button button13 = (Button) ViewBindings.findChildViewById(view, R.id.f15620x);
                                                                if (button13 != null) {
                                                                    i4 = R.id.f15621y;
                                                                    Button button14 = (Button) ViewBindings.findChildViewById(view, R.id.f15621y);
                                                                    if (button14 != null) {
                                                                        return new HandshankSetKeyBinding((LinearLayout) view, button, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, imageView, imageView2, button12, button13, button14);
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
    public static HandshankSetKeyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21417b;
    }

    @NonNull
    public static HandshankSetKeyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.handshank_set_key, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
