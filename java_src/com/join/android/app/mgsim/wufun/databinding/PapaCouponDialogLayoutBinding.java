package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PapaCouponDialogLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25618b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ListView f25619c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f25620d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25621e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25622f;

    private PapaCouponDialogLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ListView listView, @NonNull Button button, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f25618b = linearLayout;
        this.f25619c = listView;
        this.f25620d = button;
        this.f25621e = textView;
        this.f25622f = textView2;
    }

    @NonNull
    public static PapaCouponDialogLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.listView;
        ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.listView);
        if (listView != null) {
            i4 = R.id.ok;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.ok);
            if (button != null) {
                i4 = R.id.textView;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                if (textView != null) {
                    i4 = R.id.xxx;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.xxx);
                    if (textView2 != null) {
                        return new PapaCouponDialogLayoutBinding((LinearLayout) view, listView, button, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PapaCouponDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25618b;
    }

    @NonNull
    public static PapaCouponDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papa_coupon_dialog_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
