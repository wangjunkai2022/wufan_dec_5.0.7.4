package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GivepraiceItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21344b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f21345c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f21346d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21347e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f21348f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f21349g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f21350h;

    private GivepraiceItemBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f21344b = linearLayout;
        this.f21345c = linearLayout2;
        this.f21346d = simpleDraweeView;
        this.f21347e = textView;
        this.f21348f = textView2;
        this.f21349g = textView3;
        this.f21350h = textView4;
    }

    @NonNull
    public static GivepraiceItemBinding bind(@NonNull View view) {
        int i4 = R.id.ll_post;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_post);
        if (linearLayout != null) {
            i4 = R.id.simv;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.simv);
            if (simpleDraweeView != null) {
                i4 = R.id.tv_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name);
                if (textView != null) {
                    i4 = R.id.tv_post;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_post);
                    if (textView2 != null) {
                        i4 = R.id.tv_reply;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reply);
                        if (textView3 != null) {
                            i4 = R.id.tv_time;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time);
                            if (textView4 != null) {
                                return new GivepraiceItemBinding((LinearLayout) view, linearLayout, simpleDraweeView, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GivepraiceItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21344b;
    }

    @NonNull
    public static GivepraiceItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.givepraice_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
