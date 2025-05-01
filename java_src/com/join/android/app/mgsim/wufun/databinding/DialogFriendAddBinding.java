package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogFriendAddBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18758b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18759c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f18760d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18761e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f18762f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18763g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18764h;

    private DialogFriendAddBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f18758b = relativeLayout;
        this.f18759c = textView;
        this.f18760d = simpleDraweeView;
        this.f18761e = textView2;
        this.f18762f = imageView;
        this.f18763g = textView3;
        this.f18764h = textView4;
    }

    @NonNull
    public static DialogFriendAddBinding bind(@NonNull View view) {
        int i4 = R.id.accountId;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.accountId);
        if (textView != null) {
            i4 = R.id.avatar;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.avatar);
            if (simpleDraweeView != null) {
                i4 = R.id.button;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.button);
                if (textView2 != null) {
                    i4 = R.id.close;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.close);
                    if (imageView != null) {
                        i4 = R.id.name;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                        if (textView3 != null) {
                            i4 = R.id.tv1;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv1);
                            if (textView4 != null) {
                                return new DialogFriendAddBinding((RelativeLayout) view, textView, simpleDraweeView, textView2, imageView, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogFriendAddBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18758b;
    }

    @NonNull
    public static DialogFriendAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_friend_add, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
