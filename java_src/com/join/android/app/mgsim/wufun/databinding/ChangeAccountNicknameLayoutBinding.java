package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ChangeAccountNicknameLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f17702b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f17703c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f17704d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final EditText f17705e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f17706f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f17707g;

    private ChangeAccountNicknameLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull EditText editText, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView) {
        this.f17702b = relativeLayout;
        this.f17703c = linearLayout;
        this.f17704d = imageView;
        this.f17705e = editText;
        this.f17706f = textView;
        this.f17707g = simpleDraweeView;
    }

    @NonNull
    public static ChangeAccountNicknameLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.changeNickNameLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.changeNickNameLayout);
        if (linearLayout != null) {
            i4 = R.id.close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.close);
            if (imageView != null) {
                i4 = R.id.nickName;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.nickName);
                if (editText != null) {
                    i4 = R.id.nickNameBution;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.nickNameBution);
                    if (textView != null) {
                        i4 = R.id.userIcon;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.userIcon);
                        if (simpleDraweeView != null) {
                            return new ChangeAccountNicknameLayoutBinding((RelativeLayout) view, linearLayout, imageView, editText, textView, simpleDraweeView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ChangeAccountNicknameLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f17702b;
    }

    @NonNull
    public static ChangeAccountNicknameLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.change_account_nickname_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
