package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LuckDrawAddressDialogLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23592b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23593c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f23594d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f23595e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f23596f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final EditText f23597g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f23598h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final EditText f23599i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f23600j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f23601k;

    private LuckDrawAddressDialogLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull EditText editText2, @NonNull TextView textView2, @NonNull EditText editText3, @NonNull LinearLayout linearLayout3, @NonNull TextView textView3) {
        this.f23592b = linearLayout;
        this.f23593c = textView;
        this.f23594d = editText;
        this.f23595e = imageView;
        this.f23596f = linearLayout2;
        this.f23597g = editText2;
        this.f23598h = textView2;
        this.f23599i = editText3;
        this.f23600j = linearLayout3;
        this.f23601k = textView3;
    }

    @NonNull
    public static LuckDrawAddressDialogLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.address1;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.address1);
        if (textView != null) {
            i4 = R.id.address2;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.address2);
            if (editText != null) {
                i4 = R.id.closed;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.closed);
                if (imageView != null) {
                    i4 = R.id.la;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.la);
                    if (linearLayout != null) {
                        i4 = R.id.name;
                        EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.name);
                        if (editText2 != null) {
                            i4 = R.id.ok;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.ok);
                            if (textView2 != null) {
                                i4 = R.id.phoneNumber;
                                EditText editText3 = (EditText) ViewBindings.findChildViewById(view, R.id.phoneNumber);
                                if (editText3 != null) {
                                    i4 = R.id.selectAddress;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.selectAddress);
                                    if (linearLayout2 != null) {
                                        i4 = R.id.title;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                        if (textView3 != null) {
                                            return new LuckDrawAddressDialogLayoutBinding((LinearLayout) view, textView, editText, imageView, linearLayout, editText2, textView2, editText3, linearLayout2, textView3);
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
    public static LuckDrawAddressDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23592b;
    }

    @NonNull
    public static LuckDrawAddressDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.luck_draw_address_dialog_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
