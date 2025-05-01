package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.VipView;
/* loaded from: classes3.dex */
public final class ItemRoomListPBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f22655b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22656c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f22657d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f22658e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f22659f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f22660g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f22661h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f22662i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final VipView f22663j;

    private ItemRoomListPBinding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull VipView vipView) {
        this.f22655b = relativeLayout;
        this.f22656c = simpleDraweeView;
        this.f22657d = view;
        this.f22658e = imageView;
        this.f22659f = imageView2;
        this.f22660g = relativeLayout2;
        this.f22661h = imageView3;
        this.f22662i = imageView4;
        this.f22663j = vipView;
    }

    @NonNull
    public static ItemRoomListPBinding bind(@NonNull View view) {
        int i4 = R.id.avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.avatar);
        if (simpleDraweeView != null) {
            i4 = R.id.borderView;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.borderView);
            if (findChildViewById != null) {
                i4 = R.id.ivProficiencyLevel;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivProficiencyLevel);
                if (imageView != null) {
                    i4 = R.id.iv_state;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_state);
                    if (imageView2 != null) {
                        i4 = R.id.pMain;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.pMain);
                        if (relativeLayout != null) {
                            i4 = R.id.platformType;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.platformType);
                            if (imageView3 != null) {
                                i4 = R.id.tv_chenghao;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.tv_chenghao);
                                if (imageView4 != null) {
                                    i4 = R.id.vipView;
                                    VipView vipView = (VipView) ViewBindings.findChildViewById(view, R.id.vipView);
                                    if (vipView != null) {
                                        return new ItemRoomListPBinding((RelativeLayout) view, simpleDraweeView, findChildViewById, imageView, imageView2, relativeLayout, imageView3, imageView4, vipView);
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
    public static ItemRoomListPBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f22655b;
    }

    @NonNull
    public static ItemRoomListPBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_room_list_p, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
