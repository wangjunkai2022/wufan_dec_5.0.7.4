package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.input.InputView_Num;
/* loaded from: classes3.dex */
public final class LayoutInputBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23092b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final InputView_Num f23093c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final GridView f23094d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f23095e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f23096f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23097g;

    private LayoutInputBinding(@NonNull RelativeLayout relativeLayout, @NonNull InputView_Num inputView_Num, @NonNull GridView gridView, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView) {
        this.f23092b = relativeLayout;
        this.f23093c = inputView_Num;
        this.f23094d = gridView;
        this.f23095e = linearLayout;
        this.f23096f = relativeLayout2;
        this.f23097g = textView;
    }

    @NonNull
    public static LayoutInputBinding bind(@NonNull View view) {
        int i4 = R.id.MyPwdInput_inputpwd;
        InputView_Num inputView_Num = (InputView_Num) ViewBindings.findChildViewById(view, R.id.MyPwdInput_inputpwd);
        if (inputView_Num != null) {
            i4 = R.id.MyPwdInput_list;
            GridView gridView = (GridView) ViewBindings.findChildViewById(view, R.id.MyPwdInput_list);
            if (gridView != null) {
                i4 = R.id.iv_close;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_close);
                if (linearLayout != null) {
                    i4 = R.id.top;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.top);
                    if (relativeLayout != null) {
                        i4 = R.id.tv_title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                        if (textView != null) {
                            return new LayoutInputBinding((RelativeLayout) view, inputView_Num, gridView, linearLayout, relativeLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutInputBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23092b;
    }

    @NonNull
    public static LayoutInputBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_input, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
