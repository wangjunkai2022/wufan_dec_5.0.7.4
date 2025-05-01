package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FavoriteDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19411b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19412c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19413d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f19414e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final CheckBox f19415f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19416g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f19417h;

    private FavoriteDialogBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull Button button, @NonNull CheckBox checkBox, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f19411b = relativeLayout;
        this.f19412c = textView;
        this.f19413d = textView2;
        this.f19414e = button;
        this.f19415f = checkBox;
        this.f19416g = textView3;
        this.f19417h = textView4;
    }

    @NonNull
    public static FavoriteDialogBinding bind(@NonNull View view) {
        int i4 = R.id.content;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.content);
        if (textView != null) {
            i4 = R.id.content1;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.content1);
            if (textView2 != null) {
                i4 = R.id.ok;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.ok);
                if (button != null) {
                    i4 = R.id.opt;
                    CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.opt);
                    if (checkBox != null) {
                        i4 = R.id.sub_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.sub_title);
                        if (textView3 != null) {
                            i4 = R.id.title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                            if (textView4 != null) {
                                return new FavoriteDialogBinding((RelativeLayout) view, textView, textView2, button, checkBox, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FavoriteDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19411b;
    }

    @NonNull
    public static FavoriteDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.favorite_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
