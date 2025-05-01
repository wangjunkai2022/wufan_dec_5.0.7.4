package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
/* loaded from: classes3.dex */
public final class ActivityMygameEditBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16659b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f16660c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f16661d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f16662e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f16663f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f16664g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final XListView2 f16665h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f16666i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f16667j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final Button f16668k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f16669l;

    private ActivityMygameEditBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull Button button, @NonNull ImageView imageView, @NonNull View view, @NonNull XListView2 xListView2, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull Button button2, @NonNull TextView textView3) {
        this.f16659b = linearLayout;
        this.f16660c = textView;
        this.f16661d = textView2;
        this.f16662e = button;
        this.f16663f = imageView;
        this.f16664g = view;
        this.f16665h = xListView2;
        this.f16666i = imageView2;
        this.f16667j = linearLayout2;
        this.f16668k = button2;
        this.f16669l = textView3;
    }

    @NonNull
    public static ActivityMygameEditBinding bind(@NonNull View view) {
        int i4 = R.id.editAll;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.editAll);
        if (textView != null) {
            i4 = R.id.editCancel;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.editCancel);
            if (textView2 != null) {
                i4 = R.id.editGameNumber;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.editGameNumber);
                if (button != null) {
                    i4 = R.id.isSelector;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.isSelector);
                    if (imageView != null) {
                        i4 = R.id.lineTop;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.lineTop);
                        if (findChildViewById != null) {
                            i4 = R.id.listView;
                            XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listView);
                            if (xListView2 != null) {
                                i4 = R.id.lodingBackImage;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.lodingBackImage);
                                if (imageView2 != null) {
                                    i4 = R.id.noneLayout;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.noneLayout);
                                    if (linearLayout != null) {
                                        i4 = R.id.setNetwork;
                                        Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.setNetwork);
                                        if (button2 != null) {
                                            i4 = R.id.textView3;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView3);
                                            if (textView3 != null) {
                                                return new ActivityMygameEditBinding((LinearLayout) view, textView, textView2, button, imageView, findChildViewById, xListView2, imageView2, linearLayout, button2, textView3);
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
    public static ActivityMygameEditBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16659b;
    }

    @NonNull
    public static ActivityMygameEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_mygame_edit, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
