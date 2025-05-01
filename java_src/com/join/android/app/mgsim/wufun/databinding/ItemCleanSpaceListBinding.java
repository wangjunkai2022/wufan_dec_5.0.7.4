package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemCleanSpaceListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CardView f21693b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f21694c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CheckBox f21695d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final CheckBox f21696e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f21697f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f21698g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f21699h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f21700i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f21701j;

    private ItemCleanSpaceListBinding(@NonNull CardView cardView, @NonNull ImageView imageView, @NonNull CheckBox checkBox, @NonNull CheckBox checkBox2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f21693b = cardView;
        this.f21694c = imageView;
        this.f21695d = checkBox;
        this.f21696e = checkBox2;
        this.f21697f = simpleDraweeView;
        this.f21698g = textView;
        this.f21699h = linearLayout;
        this.f21700i = textView2;
        this.f21701j = textView3;
    }

    @NonNull
    public static ItemCleanSpaceListBinding bind(@NonNull View view) {
        int i4 = R.id.checkbox;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.checkbox);
        if (imageView != null) {
            i4 = R.id.checkboxData;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.checkboxData);
            if (checkBox != null) {
                i4 = R.id.checkboxPkg;
                CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, R.id.checkboxPkg);
                if (checkBox2 != null) {
                    i4 = R.id.gameIcon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gameIcon);
                    if (simpleDraweeView != null) {
                        i4 = R.id.gameName;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.gameName);
                        if (textView != null) {
                            i4 = R.id.llPkgAndData;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llPkgAndData);
                            if (linearLayout != null) {
                                i4 = R.id.tvGameSpace;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameSpace);
                                if (textView2 != null) {
                                    i4 = R.id.tvSimulatorSize;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSimulatorSize);
                                    if (textView3 != null) {
                                        return new ItemCleanSpaceListBinding((CardView) view, imageView, checkBox, checkBox2, simpleDraweeView, textView, linearLayout, textView2, textView3);
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
    public static ItemCleanSpaceListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CardView getRoot() {
        return this.f21693b;
    }

    @NonNull
    public static ItemCleanSpaceListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_clean_space_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
