package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogArenaRoomTypeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18591b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18592c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18593d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f18594e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f18595f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RadioButton f18596g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RadioButton f18597h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RelativeLayout f18598i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RadioButton f18599j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final RadioButton f18600k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f18601l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RadioButton f18602m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RadioButton f18603n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f18604o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f18605p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f18606q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f18607r;

    private DialogArenaRoomTypeBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RelativeLayout relativeLayout2, @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4, @NonNull RelativeLayout relativeLayout3, @NonNull RadioButton radioButton5, @NonNull RadioButton radioButton6, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f18591b = relativeLayout;
        this.f18592c = textView;
        this.f18593d = textView2;
        this.f18594e = imageView;
        this.f18595f = linearLayout;
        this.f18596g = radioButton;
        this.f18597h = radioButton2;
        this.f18598i = relativeLayout2;
        this.f18599j = radioButton3;
        this.f18600k = radioButton4;
        this.f18601l = relativeLayout3;
        this.f18602m = radioButton5;
        this.f18603n = radioButton6;
        this.f18604o = textView3;
        this.f18605p = textView4;
        this.f18606q = textView5;
        this.f18607r = textView6;
    }

    @NonNull
    public static DialogArenaRoomTypeBinding bind(@NonNull View view) {
        int i4 = R.id.copyTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.copyTv);
        if (textView != null) {
            i4 = R.id.finishButn;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.finishButn);
            if (textView2 != null) {
                i4 = R.id.iv_arrow_net_archive;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_arrow_net_archive);
                if (imageView != null) {
                    i4 = R.id.iv_close;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_close);
                    if (linearLayout != null) {
                        i4 = R.id.iv_switch_onlook;
                        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.iv_switch_onlook);
                        if (radioButton != null) {
                            i4 = R.id.iv_switch_onlook_n;
                            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.iv_switch_onlook_n);
                            if (radioButton2 != null) {
                                i4 = R.id.rl_net_archive;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_net_archive);
                                if (relativeLayout != null) {
                                    i4 = R.id.rl_setNo_pwd;
                                    RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rl_setNo_pwd);
                                    if (radioButton3 != null) {
                                        i4 = R.id.rl_set_pwd;
                                        RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rl_set_pwd);
                                        if (radioButton4 != null) {
                                            i4 = R.id.rl_top;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_top);
                                            if (relativeLayout2 != null) {
                                                i4 = R.id.roomTypeAllLL;
                                                RadioButton radioButton5 = (RadioButton) ViewBindings.findChildViewById(view, R.id.roomTypeAllLL);
                                                if (radioButton5 != null) {
                                                    i4 = R.id.roomTypePhoneLL;
                                                    RadioButton radioButton6 = (RadioButton) ViewBindings.findChildViewById(view, R.id.roomTypePhoneLL);
                                                    if (radioButton6 != null) {
                                                        i4 = R.id.roomxingzhiT;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.roomxingzhiT);
                                                        if (textView3 != null) {
                                                            i4 = R.id.tv_archive_name;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_archive_name);
                                                            if (textView4 != null) {
                                                                i4 = R.id.tv_roomNum;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_roomNum);
                                                                if (textView5 != null) {
                                                                    i4 = R.id.tv_title;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                                                    if (textView6 != null) {
                                                                        return new DialogArenaRoomTypeBinding((RelativeLayout) view, textView, textView2, imageView, linearLayout, radioButton, radioButton2, relativeLayout, radioButton3, radioButton4, relativeLayout2, radioButton5, radioButton6, textView3, textView4, textView5, textView6);
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
    public static DialogArenaRoomTypeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18591b;
    }

    @NonNull
    public static DialogArenaRoomTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_arena_room_type, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
