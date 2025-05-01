package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogFightServerChoseBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18734b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18735c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ListView f18736d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18737e;

    private DialogFightServerChoseBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ListView listView, @NonNull TextView textView) {
        this.f18734b = relativeLayout;
        this.f18735c = imageView;
        this.f18736d = listView;
        this.f18737e = textView;
    }

    @NonNull
    public static DialogFightServerChoseBinding bind(@NonNull View view) {
        int i4 = R.id.cancel;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.cancel);
        if (imageView != null) {
            i4 = R.id.listView;
            ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.listView);
            if (listView != null) {
                i4 = R.id.tv_top;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top);
                if (textView != null) {
                    return new DialogFightServerChoseBinding((RelativeLayout) view, imageView, listView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogFightServerChoseBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18734b;
    }

    @NonNull
    public static DialogFightServerChoseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_fight_server_chose, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
