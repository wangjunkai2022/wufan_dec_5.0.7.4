package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumWelcomeItemAdBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24351b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TableLayout f24352c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f24353d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f24354e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f24355f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f24356g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f24357h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f24358i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f24359j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f24360k;

    private MgForumWelcomeItemAdBinding(@NonNull LinearLayout linearLayout, @NonNull TableLayout tableLayout, @NonNull View view, @NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f24351b = linearLayout;
        this.f24352c = tableLayout;
        this.f24353d = view;
        this.f24354e = relativeLayout;
        this.f24355f = simpleDraweeView;
        this.f24356g = simpleDraweeView2;
        this.f24357h = simpleDraweeView3;
        this.f24358i = imageView;
        this.f24359j = textView;
        this.f24360k = textView2;
    }

    @NonNull
    public static MgForumWelcomeItemAdBinding bind(@NonNull View view) {
        int i4 = R.id.content;
        TableLayout tableLayout = (TableLayout) ViewBindings.findChildViewById(view, R.id.content);
        if (tableLayout != null) {
            i4 = R.id.dividerTop;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.dividerTop);
            if (findChildViewById != null) {
                i4 = R.id.forumExtFunc;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.forumExtFunc);
                if (relativeLayout != null) {
                    i4 = R.id.img_1;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img_1);
                    if (simpleDraweeView != null) {
                        i4 = R.id.img_2;
                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img_2);
                        if (simpleDraweeView2 != null) {
                            i4 = R.id.img_3;
                            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img_3);
                            if (simpleDraweeView3 != null) {
                                i4 = R.id.moreFunc;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.moreFunc);
                                if (imageView != null) {
                                    i4 = R.id.sectionSubTitle;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.sectionSubTitle);
                                    if (textView != null) {
                                        i4 = R.id.sectionTitle;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.sectionTitle);
                                        if (textView2 != null) {
                                            return new MgForumWelcomeItemAdBinding((LinearLayout) view, tableLayout, findChildViewById, relativeLayout, simpleDraweeView, simpleDraweeView2, simpleDraweeView3, imageView, textView, textView2);
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
    public static MgForumWelcomeItemAdBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24351b;
    }

    @NonNull
    public static MgForumWelcomeItemAdBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_welcome_item_ad, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
