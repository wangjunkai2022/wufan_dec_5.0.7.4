package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LuckDrawFinishDialogLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23602b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23603c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f23604d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23605e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23606f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23607g;

    private LuckDrawFinishDialogLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f23602b = linearLayout;
        this.f23603c = imageView;
        this.f23604d = simpleDraweeView;
        this.f23605e = textView;
        this.f23606f = textView2;
        this.f23607g = textView3;
    }

    @NonNull
    public static LuckDrawFinishDialogLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.closed;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.closed);
        if (imageView != null) {
            i4 = R.id.luck;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.luck);
            if (simpleDraweeView != null) {
                i4 = R.id.ok;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.ok);
                if (textView != null) {
                    i4 = R.id.sub_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.sub_title);
                    if (textView2 != null) {
                        i4 = R.id.title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                        if (textView3 != null) {
                            return new LuckDrawFinishDialogLayoutBinding((LinearLayout) view, imageView, simpleDraweeView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LuckDrawFinishDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23602b;
    }

    @NonNull
    public static LuckDrawFinishDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.luck_draw_finish_dialog_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
