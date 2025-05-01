package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogFightDisconnectBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18718b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18719c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f18720d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18721e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Button f18722f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18723g;

    private DialogFightDisconnectBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull Button button, @NonNull TextView textView, @NonNull Button button2, @NonNull TextView textView2) {
        this.f18718b = relativeLayout;
        this.f18719c = imageView;
        this.f18720d = button;
        this.f18721e = textView;
        this.f18722f = button2;
        this.f18723g = textView2;
    }

    @NonNull
    public static DialogFightDisconnectBinding bind(@NonNull View view) {
        int i4 = R.id.back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
        if (imageView != null) {
            i4 = R.id.cancel;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.cancel);
            if (button != null) {
                i4 = R.id.info;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.info);
                if (textView != null) {
                    i4 = R.id.research;
                    Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.research);
                    if (button2 != null) {
                        i4 = R.id.title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                        if (textView2 != null) {
                            return new DialogFightDisconnectBinding((RelativeLayout) view, imageView, button, textView, button2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogFightDisconnectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18718b;
    }

    @NonNull
    public static DialogFightDisconnectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_fight_disconnect, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
