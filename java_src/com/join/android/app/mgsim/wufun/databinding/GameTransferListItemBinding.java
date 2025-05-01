package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GameTransferListItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20463b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f20464c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f20465d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f20466e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20467f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final CheckBox f20468g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f20469h;

    private GameTransferListItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull CheckBox checkBox, @NonNull TextView textView3) {
        this.f20463b = relativeLayout;
        this.f20464c = frameLayout;
        this.f20465d = simpleDraweeView;
        this.f20466e = textView;
        this.f20467f = textView2;
        this.f20468g = checkBox;
        this.f20469h = textView3;
    }

    @NonNull
    public static GameTransferListItemBinding bind(@NonNull View view) {
        int i4 = R.id.checkLayout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.checkLayout);
        if (frameLayout != null) {
            i4 = R.id.game_transfer_item_game_icon_img;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.game_transfer_item_game_icon_img);
            if (simpleDraweeView != null) {
                i4 = R.id.game_transfer_item_game_name_txt;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.game_transfer_item_game_name_txt);
                if (textView != null) {
                    i4 = R.id.game_transfer_item_game_size_txt;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.game_transfer_item_game_size_txt);
                    if (textView2 != null) {
                        i4 = R.id.game_transfer_list_item_transfer_status_chk;
                        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.game_transfer_list_item_transfer_status_chk);
                        if (checkBox != null) {
                            i4 = R.id.game_transfer_list_item_transfer_status_txt;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.game_transfer_list_item_transfer_status_txt);
                            if (textView3 != null) {
                                return new GameTransferListItemBinding((RelativeLayout) view, frameLayout, simpleDraweeView, textView, textView2, checkBox, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GameTransferListItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20463b;
    }

    @NonNull
    public static GameTransferListItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.game_transfer_list_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
