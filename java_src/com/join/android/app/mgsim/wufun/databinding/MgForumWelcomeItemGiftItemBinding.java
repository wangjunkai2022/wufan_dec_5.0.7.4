package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumWelcomeItemGiftItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24366b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f24367c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f24368d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24369e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f24370f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f24371g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f24372h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f24373i;

    private MgForumWelcomeItemGiftItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull TextView textView3) {
        this.f24366b = relativeLayout;
        this.f24367c = button;
        this.f24368d = simpleDraweeView;
        this.f24369e = textView;
        this.f24370f = linearLayout;
        this.f24371g = textView2;
        this.f24372h = imageView;
        this.f24373i = textView3;
    }

    @NonNull
    public static MgForumWelcomeItemGiftItemBinding bind(@NonNull View view) {
        int i4 = R.id.actionButton;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.actionButton);
        if (button != null) {
            i4 = R.id.forum_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.forum_icon);
            if (simpleDraweeView != null) {
                i4 = R.id.giftDesc;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.giftDesc);
                if (textView != null) {
                    i4 = R.id.linearLayout3;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout3);
                    if (linearLayout != null) {
                        i4 = R.id.sectionTitle;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.sectionTitle);
                        if (textView2 != null) {
                            i4 = R.id.tag;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.tag);
                            if (imageView != null) {
                                i4 = R.id.title;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                if (textView3 != null) {
                                    return new MgForumWelcomeItemGiftItemBinding((RelativeLayout) view, button, simpleDraweeView, textView, linearLayout, textView2, imageView, textView3);
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
    public static MgForumWelcomeItemGiftItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24366b;
    }

    @NonNull
    public static MgForumWelcomeItemGiftItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_welcome_item_gift_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
