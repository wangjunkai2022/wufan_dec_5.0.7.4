package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogSetChallengeGoldBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19007b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f19008c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f19009d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f19010e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Button f19011f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f19012g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f19013h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f19014i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f19015j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f19016k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f19017l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f19018m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f19019n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f19020o;

    private DialogSetChallengeGoldBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull Button button4, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f19007b = relativeLayout;
        this.f19008c = button;
        this.f19009d = button2;
        this.f19010e = button3;
        this.f19011f = button4;
        this.f19012g = linearLayout;
        this.f19013h = linearLayout2;
        this.f19014i = linearLayout3;
        this.f19015j = textView;
        this.f19016k = textView2;
        this.f19017l = textView3;
        this.f19018m = textView4;
        this.f19019n = textView5;
        this.f19020o = textView6;
    }

    @NonNull
    public static DialogSetChallengeGoldBinding bind(@NonNull View view) {
        int i4 = R.id.btn_1;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_1);
        if (button != null) {
            i4 = R.id.btn_2;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_2);
            if (button2 != null) {
                i4 = R.id.btn_3;
                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.btn_3);
                if (button3 != null) {
                    i4 = R.id.btn_4;
                    Button button4 = (Button) ViewBindings.findChildViewById(view, R.id.btn_4);
                    if (button4 != null) {
                        i4 = R.id.iv_close;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_close);
                        if (linearLayout != null) {
                            i4 = R.id.ll_info;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_info);
                            if (linearLayout2 != null) {
                                i4 = R.id.ll_set_challenge_gold;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_set_challenge_gold);
                                if (linearLayout3 != null) {
                                    i4 = R.id.tv_current_copper;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_current_copper);
                                    if (textView != null) {
                                        i4 = R.id.tv_info_detail;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_info_detail);
                                        if (textView2 != null) {
                                            i4 = R.id.tv_info_title_1;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_info_title_1);
                                            if (textView3 != null) {
                                                i4 = R.id.tv_info_title_2;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_info_title_2);
                                                if (textView4 != null) {
                                                    i4 = R.id.tv_title;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                                    if (textView5 != null) {
                                                        i4 = R.id.tv_top;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top);
                                                        if (textView6 != null) {
                                                            return new DialogSetChallengeGoldBinding((RelativeLayout) view, button, button2, button3, button4, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3, textView4, textView5, textView6);
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
    public static DialogSetChallengeGoldBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19007b;
    }

    @NonNull
    public static DialogSetChallengeGoldBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_set_challenge_gold, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
