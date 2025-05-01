package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
/* loaded from: classes3.dex */
public final class PopoItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26120b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final EditText f26121c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XListView2 f26122d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f26123e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f26124f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f26125g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f26126h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f26127i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26128j;

    private PopoItemBinding(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull XListView2 xListView2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f26120b = linearLayout;
        this.f26121c = editText;
        this.f26122d = xListView2;
        this.f26123e = linearLayout2;
        this.f26124f = linearLayout3;
        this.f26125g = linearLayout4;
        this.f26126h = linearLayout5;
        this.f26127i = textView;
        this.f26128j = textView2;
    }

    @NonNull
    public static PopoItemBinding bind(@NonNull View view) {
        int i4 = R.id.game_ed;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.game_ed);
        if (editText != null) {
            i4 = R.id.listview;
            XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listview);
            if (xListView2 != null) {
                i4 = R.id.ll_build;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_build);
                if (linearLayout != null) {
                    i4 = R.id.ll_dismiss;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_dismiss);
                    if (linearLayout2 != null) {
                        i4 = R.id.ll_our;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_our);
                        if (linearLayout3 != null) {
                            i4 = R.id.ll_show_finish;
                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_show_finish);
                            if (linearLayout4 != null) {
                                i4 = R.id.tv_finish;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_finish);
                                if (textView != null) {
                                    i4 = R.id.tv_show_tips;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_show_tips);
                                    if (textView2 != null) {
                                        return new PopoItemBinding((LinearLayout) view, editText, xListView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView, textView2);
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
    public static PopoItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26120b;
    }

    @NonNull
    public static PopoItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.popo_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
