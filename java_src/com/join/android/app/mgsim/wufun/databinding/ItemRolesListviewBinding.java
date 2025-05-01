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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemRolesListviewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22605b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22606c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f22607d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f22608e;

    private ItemRolesListviewBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView) {
        this.f22605b = linearLayout;
        this.f22606c = textView;
        this.f22607d = linearLayout2;
        this.f22608e = imageView;
    }

    @NonNull
    public static ItemRolesListviewBinding bind(@NonNull View view) {
        int i4 = R.id.item_name_tx;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.item_name_tx);
        if (textView != null) {
            i4 = R.id.item_roles_ll;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.item_roles_ll);
            if (linearLayout != null) {
                i4 = R.id.item_select_iv;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.item_select_iv);
                if (imageView != null) {
                    return new ItemRolesListviewBinding((LinearLayout) view, textView, linearLayout, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemRolesListviewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22605b;
    }

    @NonNull
    public static ItemRolesListviewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_roles_listview, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
