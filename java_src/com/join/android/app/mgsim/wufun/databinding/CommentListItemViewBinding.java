package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.join.mgps.customview.CopyTextView;
import com.join.mgps.customview.CopyTextViewNew;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.customview.VipView;
/* loaded from: classes3.dex */
public final class CommentListItemViewBinding implements ViewBinding {
    @NonNull
    public final LinearLayout A;
    @NonNull
    public final RelativeLayout B;
    @NonNull
    public final TextView C;
    @NonNull
    public final TextView D;
    @NonNull
    public final SimpleDraweeView E;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18193b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f18194c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final MStarBar f18195d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18196e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18197f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final CopyTextView f18198g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final CopyTextViewNew f18199h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18200i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f18201j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f18202k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f18203l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f18204m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f18205n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f18206o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f18207p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f18208q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final View f18209r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final VipView f18210s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final ImageView f18211t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f18212u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final TextView f18213v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f18214w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final TextView f18215x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final TextView f18216y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final LinearLayout f18217z;

    private CommentListItemViewBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull MStarBar mStarBar, @NonNull TextView textView, @NonNull TextView textView2, @NonNull CopyTextView copyTextView, @NonNull CopyTextViewNew copyTextViewNew, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull TextView textView4, @NonNull LinearLayout linearLayout3, @NonNull TextView textView5, @NonNull ImageView imageView2, @NonNull TextView textView6, @NonNull ImageView imageView3, @NonNull TextView textView7, @NonNull View view, @NonNull VipView vipView, @NonNull ImageView imageView4, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull ImageView imageView5, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView12, @NonNull TextView textView13, @NonNull SimpleDraweeView simpleDraweeView) {
        this.f18193b = linearLayout;
        this.f18194c = linearLayout2;
        this.f18195d = mStarBar;
        this.f18196e = textView;
        this.f18197f = textView2;
        this.f18198g = copyTextView;
        this.f18199h = copyTextViewNew;
        this.f18200i = textView3;
        this.f18201j = imageView;
        this.f18202k = textView4;
        this.f18203l = linearLayout3;
        this.f18204m = textView5;
        this.f18205n = imageView2;
        this.f18206o = textView6;
        this.f18207p = imageView3;
        this.f18208q = textView7;
        this.f18209r = view;
        this.f18210s = vipView;
        this.f18211t = imageView4;
        this.f18212u = textView8;
        this.f18213v = textView9;
        this.f18214w = imageView5;
        this.f18215x = textView10;
        this.f18216y = textView11;
        this.f18217z = linearLayout4;
        this.A = linearLayout5;
        this.B = relativeLayout;
        this.C = textView12;
        this.D = textView13;
        this.E = simpleDraweeView;
    }

    @NonNull
    public static CommentListItemViewBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.comment_head_mstarBar;
        MStarBar mStarBar = (MStarBar) ViewBindings.findChildViewById(view, R.id.comment_head_mstarBar);
        if (mStarBar != null) {
            i4 = R.id.comment_head_num_tx;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.comment_head_num_tx);
            if (textView != null) {
                i4 = R.id.content;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.content);
                if (textView2 != null) {
                    i4 = R.id.content2;
                    CopyTextView copyTextView = (CopyTextView) ViewBindings.findChildViewById(view, R.id.content2);
                    if (copyTextView != null) {
                        i4 = R.id.contentWeb;
                        CopyTextViewNew copyTextViewNew = (CopyTextViewNew) ViewBindings.findChildViewById(view, R.id.contentWeb);
                        if (copyTextViewNew != null) {
                            i4 = R.id.deleteTx;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.deleteTx);
                            if (textView3 != null) {
                                i4 = R.id.down;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.down);
                                if (imageView != null) {
                                    i4 = R.id.downNumber;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.downNumber);
                                    if (textView4 != null) {
                                        i4 = R.id.editLl;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.editLl);
                                        if (linearLayout2 != null) {
                                            i4 = R.id.editTx;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.editTx);
                                            if (textView5 != null) {
                                                i4 = R.id.isAuth;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.isAuth);
                                                if (imageView2 != null) {
                                                    i4 = R.id.isConnoisseurs;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.isConnoisseurs);
                                                    if (textView6 != null) {
                                                        i4 = R.id.isGood;
                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.isGood);
                                                        if (imageView3 != null) {
                                                            i4 = R.id.isMe;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.isMe);
                                                            if (textView7 != null) {
                                                                i4 = R.id.layoutTop;
                                                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.layoutTop);
                                                                if (findChildViewById != null) {
                                                                    i4 = R.id.levelTv;
                                                                    VipView vipView = (VipView) ViewBindings.findChildViewById(view, R.id.levelTv);
                                                                    if (vipView != null) {
                                                                        i4 = R.id.message;
                                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.message);
                                                                        if (imageView4 != null) {
                                                                            i4 = R.id.messageNumber;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.messageNumber);
                                                                            if (textView8 != null) {
                                                                                i4 = R.id.more;
                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.more);
                                                                                if (textView9 != null) {
                                                                                    i4 = R.id.parise;
                                                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.parise);
                                                                                    if (imageView5 != null) {
                                                                                        i4 = R.id.pariseNumber;
                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.pariseNumber);
                                                                                        if (textView10 != null) {
                                                                                            i4 = R.id.phoneModle;
                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.phoneModle);
                                                                                            if (textView11 != null) {
                                                                                                i4 = R.id.tbl_1_ll;
                                                                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tbl_1_ll);
                                                                                                if (linearLayout3 != null) {
                                                                                                    i4 = R.id.tbl_2_ll;
                                                                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tbl_2_ll);
                                                                                                    if (linearLayout4 != null) {
                                                                                                        i4 = R.id.tbl_3_rl;
                                                                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.tbl_3_rl);
                                                                                                        if (relativeLayout != null) {
                                                                                                            i4 = R.id.time;
                                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.time);
                                                                                                            if (textView12 != null) {
                                                                                                                i4 = R.id.userName;
                                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.userName);
                                                                                                                if (textView13 != null) {
                                                                                                                    i4 = R.id.usericon;
                                                                                                                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.usericon);
                                                                                                                    if (simpleDraweeView != null) {
                                                                                                                        return new CommentListItemViewBinding(linearLayout, linearLayout, mStarBar, textView, textView2, copyTextView, copyTextViewNew, textView3, imageView, textView4, linearLayout2, textView5, imageView2, textView6, imageView3, textView7, findChildViewById, vipView, imageView4, textView8, textView9, imageView5, textView10, textView11, linearLayout3, linearLayout4, relativeLayout, textView12, textView13, simpleDraweeView);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CommentListItemViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18193b;
    }

    @NonNull
    public static CommentListItemViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.comment_list_item_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
