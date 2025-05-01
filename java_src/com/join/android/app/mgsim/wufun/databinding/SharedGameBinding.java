package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SharedGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26540b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f26541c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26542d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26543e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Button f26544f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26545g;

    private SharedGameBinding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull Button button, @NonNull TextView textView3) {
        this.f26540b = relativeLayout;
        this.f26541c = simpleDraweeView;
        this.f26542d = textView;
        this.f26543e = textView2;
        this.f26544f = button;
        this.f26545g = textView3;
    }

    @NonNull
    public static SharedGameBinding bind(@NonNull View view) {
        int i4 = R.id.game_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.game_icon);
        if (simpleDraweeView != null) {
            i4 = R.id.game_info;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.game_info);
            if (textView != null) {
                i4 = R.id.game_name;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.game_name);
                if (textView2 != null) {
                    i4 = R.id.ok;
                    Button button = (Button) ViewBindings.findChildViewById(view, R.id.ok);
                    if (button != null) {
                        i4 = R.id.title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                        if (textView3 != null) {
                            return new SharedGameBinding((RelativeLayout) view, simpleDraweeView, textView, textView2, button, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SharedGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26540b;
    }

    @NonNull
    public static SharedGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.shared_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
