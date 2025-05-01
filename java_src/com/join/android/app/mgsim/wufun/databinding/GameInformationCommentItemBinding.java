package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.VipView;
/* loaded from: classes3.dex */
public final class GameInformationCommentItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20381b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f20382c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final VipView f20383d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f20384e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20385f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f20386g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f20387h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f20388i;

    private GameInformationCommentItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull VipView vipView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView4) {
        this.f20381b = relativeLayout;
        this.f20382c = textView;
        this.f20383d = vipView;
        this.f20384e = imageView;
        this.f20385f = textView2;
        this.f20386g = textView3;
        this.f20387h = simpleDraweeView;
        this.f20388i = textView4;
    }

    @NonNull
    public static GameInformationCommentItemBinding bind(@NonNull View view) {
        int i4 = R.id.content;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.content);
        if (textView != null) {
            i4 = R.id.levelTv;
            VipView vipView = (VipView) ViewBindings.findChildViewById(view, R.id.levelTv);
            if (vipView != null) {
                i4 = R.id.parise;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.parise);
                if (imageView != null) {
                    i4 = R.id.pariseNumber;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.pariseNumber);
                    if (textView2 != null) {
                        i4 = R.id.time;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.time);
                        if (textView3 != null) {
                            i4 = R.id.usericon;
                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.usericon);
                            if (simpleDraweeView != null) {
                                i4 = R.id.username;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.username);
                                if (textView4 != null) {
                                    return new GameInformationCommentItemBinding((RelativeLayout) view, textView, vipView, imageView, textView2, textView3, simpleDraweeView, textView4);
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
    public static GameInformationCommentItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20381b;
    }

    @NonNull
    public static GameInformationCommentItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.game_information_comment_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
