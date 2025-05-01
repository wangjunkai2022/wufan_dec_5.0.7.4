package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.KeyboardListenLayout;
/* loaded from: classes3.dex */
public final class FragmentFriendAddBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final KeyboardListenLayout f19772b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f19773c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19774d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final EditText f19775e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f19776f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f19777g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final KeyboardListenLayout f19778h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RecyclerView f19779i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f19780j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f19781k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f19782l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f19783m;

    private FragmentFriendAddBinding(@NonNull KeyboardListenLayout keyboardListenLayout, @NonNull View view, @NonNull TextView textView, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull KeyboardListenLayout keyboardListenLayout2, @NonNull RecyclerView recyclerView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f19772b = keyboardListenLayout;
        this.f19773c = view;
        this.f19774d = textView;
        this.f19775e = editText;
        this.f19776f = imageView;
        this.f19777g = imageView2;
        this.f19778h = keyboardListenLayout2;
        this.f19779i = recyclerView;
        this.f19780j = textView2;
        this.f19781k = textView3;
        this.f19782l = textView4;
        this.f19783m = textView5;
    }

    @NonNull
    public static FragmentFriendAddBinding bind(@NonNull View view) {
        int i4 = R.id.close;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.close);
        if (findChildViewById != null) {
            i4 = R.id.hint;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.hint);
            if (textView != null) {
                i4 = R.id.input;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.input);
                if (editText != null) {
                    i4 = R.id.iv1;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv1);
                    if (imageView != null) {
                        i4 = R.id.iv_no_data;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_no_data);
                        if (imageView2 != null) {
                            KeyboardListenLayout keyboardListenLayout = (KeyboardListenLayout) view;
                            i4 = R.id.recyclerView;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
                            if (recyclerView != null) {
                                i4 = R.id.search;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.search);
                                if (textView2 != null) {
                                    i4 = R.id.textView40;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView40);
                                    if (textView3 != null) {
                                        i4 = R.id.textView48;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.textView48);
                                        if (textView4 != null) {
                                            i4 = R.id.tv_no_data;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_data);
                                            if (textView5 != null) {
                                                return new FragmentFriendAddBinding(keyboardListenLayout, findChildViewById, textView, editText, imageView, imageView2, keyboardListenLayout, recyclerView, textView2, textView3, textView4, textView5);
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
    public static FragmentFriendAddBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public KeyboardListenLayout getRoot() {
        return this.f19772b;
    }

    @NonNull
    public static FragmentFriendAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_friend_add, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
