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
public final class DialogAddShortcutViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18512b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18513c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f18514d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f18515e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18516f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f18517g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f18518h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18519i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f18520j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f18521k;

    private DialogAddShortcutViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f18512b = relativeLayout;
        this.f18513c = imageView;
        this.f18514d = relativeLayout2;
        this.f18515e = imageView2;
        this.f18516f = textView;
        this.f18517g = simpleDraweeView;
        this.f18518h = simpleDraweeView2;
        this.f18519i = textView2;
        this.f18520j = textView3;
        this.f18521k = textView4;
    }

    @NonNull
    public static DialogAddShortcutViewBinding bind(@NonNull View view) {
        int i4 = R.id.iv1;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv1);
        if (imageView != null) {
            i4 = R.id.rl1;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl1);
            if (relativeLayout != null) {
                i4 = R.id.shortcutCloseIv;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.shortcutCloseIv);
                if (imageView2 != null) {
                    i4 = R.id.shortcutCreateTv;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.shortcutCreateTv);
                    if (textView != null) {
                        i4 = R.id.shortcutIconOneIv;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.shortcutIconOneIv);
                        if (simpleDraweeView != null) {
                            i4 = R.id.shortcutIconTwoIv;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.shortcutIconTwoIv);
                            if (simpleDraweeView2 != null) {
                                i4 = R.id.shortcutNoMoreReminderTv;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.shortcutNoMoreReminderTv);
                                if (textView2 != null) {
                                    i4 = R.id.tv1;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv1);
                                    if (textView3 != null) {
                                        i4 = R.id.tv2;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv2);
                                        if (textView4 != null) {
                                            return new DialogAddShortcutViewBinding((RelativeLayout) view, imageView, relativeLayout, imageView2, textView, simpleDraweeView, simpleDraweeView2, textView2, textView3, textView4);
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
    public static DialogAddShortcutViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18512b;
    }

    @NonNull
    public static DialogAddShortcutViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_add_shortcut_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
