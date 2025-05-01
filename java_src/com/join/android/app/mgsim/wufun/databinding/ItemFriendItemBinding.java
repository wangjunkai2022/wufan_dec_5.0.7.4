package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemFriendItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22149b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22150c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22151d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f22152e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f22153f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f22154g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f22155h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f22156i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f22157j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f22158k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f22159l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f22160m;

    private ItemFriendItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ImageView imageView5, @NonNull TextView textView5) {
        this.f22149b = constraintLayout;
        this.f22150c = simpleDraweeView;
        this.f22151d = textView;
        this.f22152e = imageView;
        this.f22153f = imageView2;
        this.f22154g = imageView3;
        this.f22155h = imageView4;
        this.f22156i = textView2;
        this.f22157j = textView3;
        this.f22158k = textView4;
        this.f22159l = imageView5;
        this.f22160m = textView5;
    }

    @NonNull
    public static ItemFriendItemBinding bind(@NonNull View view) {
        int i4 = R.id.avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.avatar);
        if (simpleDraweeView != null) {
            i4 = R.id.button;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.button);
            if (textView != null) {
                i4 = R.id.icLevel;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.icLevel);
                if (imageView != null) {
                    i4 = R.id.icLevel1;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.icLevel1);
                    if (imageView2 != null) {
                        i4 = R.id.icLevel1Bg;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.icLevel1Bg);
                        if (imageView3 != null) {
                            i4 = R.id.icLoc;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.icLoc);
                            if (imageView4 != null) {
                                i4 = R.id.levelTxt;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.levelTxt);
                                if (textView2 != null) {
                                    i4 = R.id.locTxt;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.locTxt);
                                    if (textView3 != null) {
                                        i4 = R.id.name;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                                        if (textView4 != null) {
                                            i4 = R.id.offlineOver;
                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.offlineOver);
                                            if (imageView5 != null) {
                                                i4 = R.id.recommend;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.recommend);
                                                if (textView5 != null) {
                                                    return new ItemFriendItemBinding((ConstraintLayout) view, simpleDraweeView, textView, imageView, imageView2, imageView3, imageView4, textView2, textView3, textView4, imageView5, textView5);
                                                }
                                            }
                                        }
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
    public static ItemFriendItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22149b;
    }

    @NonNull
    public static ItemFriendItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_friend_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
