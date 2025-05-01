package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PopMyGameOperateBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26080b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26081c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26082d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26083e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26084f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26085g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f26086h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f26087i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final View f26088j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final View f26089k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26090l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final View f26091m;

    private PopMyGameOperateBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull TextView textView6, @NonNull View view5) {
        this.f26080b = linearLayout;
        this.f26081c = textView;
        this.f26082d = textView2;
        this.f26083e = textView3;
        this.f26084f = textView4;
        this.f26085g = textView5;
        this.f26086h = view;
        this.f26087i = view2;
        this.f26088j = view3;
        this.f26089k = view4;
        this.f26090l = textView6;
        this.f26091m = view5;
    }

    @NonNull
    public static PopMyGameOperateBinding bind(@NonNull View view) {
        int i4 = R.id.addShortcut;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.addShortcut);
        if (textView != null) {
            i4 = R.id.cancel;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.cancel);
            if (textView2 != null) {
                i4 = R.id.delete;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.delete);
                if (textView3 != null) {
                    i4 = R.id.deleteArchieve;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.deleteArchieve);
                    if (textView4 != null) {
                        i4 = R.id.detail;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.detail);
                        if (textView5 != null) {
                            i4 = R.id.line;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                            if (findChildViewById != null) {
                                i4 = R.id.lineDeleteArchieve;
                                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.lineDeleteArchieve);
                                if (findChildViewById2 != null) {
                                    i4 = R.id.lineDeleteGame;
                                    View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.lineDeleteGame);
                                    if (findChildViewById3 != null) {
                                        i4 = R.id.lineDetail;
                                        View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.lineDetail);
                                        if (findChildViewById4 != null) {
                                            i4 = R.id.tv_stand_mode;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_stand_mode);
                                            if (textView6 != null) {
                                                i4 = R.id.v_line_1;
                                                View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.v_line_1);
                                                if (findChildViewById5 != null) {
                                                    return new PopMyGameOperateBinding((LinearLayout) view, textView, textView2, textView3, textView4, textView5, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, textView6, findChildViewById5);
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
    public static PopMyGameOperateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26080b;
    }

    @NonNull
    public static PopMyGameOperateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.pop_my_game_operate, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
