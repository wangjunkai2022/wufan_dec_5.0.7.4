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
import com.join.mgps.customview.ExpandLayout;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.customview.VipView;
/* loaded from: classes3.dex */
public final class ItemGameDetailCommentListItemViewBinding implements ViewBinding {
    @NonNull
    public final RelativeLayout A;
    @NonNull
    public final TextView B;
    @NonNull
    public final TextView C;
    @NonNull
    public final SimpleDraweeView D;
    @NonNull
    public final View E;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22232b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f22233c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final MStarBar f22234d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22235e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ExpandLayout f22236f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final CopyTextView f22237g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final CopyTextViewNew f22238h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f22239i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f22240j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f22241k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f22242l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f22243m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f22244n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f22245o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f22246p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f22247q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final View f22248r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final VipView f22249s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final ImageView f22250t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f22251u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f22252v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final TextView f22253w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final TextView f22254x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final LinearLayout f22255y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final LinearLayout f22256z;

    private ItemGameDetailCommentListItemViewBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull MStarBar mStarBar, @NonNull TextView textView, @NonNull ExpandLayout expandLayout, @NonNull CopyTextView copyTextView, @NonNull CopyTextViewNew copyTextViewNew, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull TextView textView3, @NonNull LinearLayout linearLayout3, @NonNull TextView textView4, @NonNull ImageView imageView2, @NonNull TextView textView5, @NonNull ImageView imageView3, @NonNull TextView textView6, @NonNull View view, @NonNull VipView vipView, @NonNull ImageView imageView4, @NonNull TextView textView7, @NonNull ImageView imageView5, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view2) {
        this.f22232b = linearLayout;
        this.f22233c = linearLayout2;
        this.f22234d = mStarBar;
        this.f22235e = textView;
        this.f22236f = expandLayout;
        this.f22237g = copyTextView;
        this.f22238h = copyTextViewNew;
        this.f22239i = textView2;
        this.f22240j = imageView;
        this.f22241k = textView3;
        this.f22242l = linearLayout3;
        this.f22243m = textView4;
        this.f22244n = imageView2;
        this.f22245o = textView5;
        this.f22246p = imageView3;
        this.f22247q = textView6;
        this.f22248r = view;
        this.f22249s = vipView;
        this.f22250t = imageView4;
        this.f22251u = textView7;
        this.f22252v = imageView5;
        this.f22253w = textView8;
        this.f22254x = textView9;
        this.f22255y = linearLayout4;
        this.f22256z = linearLayout5;
        this.A = relativeLayout;
        this.B = textView10;
        this.C = textView11;
        this.D = simpleDraweeView;
        this.E = view2;
    }

    @NonNull
    public static ItemGameDetailCommentListItemViewBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.comment_head_mstarBar;
        MStarBar mStarBar = (MStarBar) ViewBindings.findChildViewById(view, R.id.comment_head_mstarBar);
        if (mStarBar != null) {
            i4 = R.id.comment_head_num_tx;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.comment_head_num_tx);
            if (textView != null) {
                i4 = R.id.content;
                ExpandLayout expandLayout = (ExpandLayout) ViewBindings.findChildViewById(view, R.id.content);
                if (expandLayout != null) {
                    i4 = R.id.content2;
                    CopyTextView copyTextView = (CopyTextView) ViewBindings.findChildViewById(view, R.id.content2);
                    if (copyTextView != null) {
                        i4 = R.id.contentWeb;
                        CopyTextViewNew copyTextViewNew = (CopyTextViewNew) ViewBindings.findChildViewById(view, R.id.contentWeb);
                        if (copyTextViewNew != null) {
                            i4 = R.id.deleteTx;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.deleteTx);
                            if (textView2 != null) {
                                i4 = R.id.down;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.down);
                                if (imageView != null) {
                                    i4 = R.id.downNumber;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.downNumber);
                                    if (textView3 != null) {
                                        i4 = R.id.editLl;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.editLl);
                                        if (linearLayout2 != null) {
                                            i4 = R.id.editTx;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.editTx);
                                            if (textView4 != null) {
                                                i4 = R.id.isAuth;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.isAuth);
                                                if (imageView2 != null) {
                                                    i4 = R.id.isConnoisseurs;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.isConnoisseurs);
                                                    if (textView5 != null) {
                                                        i4 = R.id.isGood;
                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.isGood);
                                                        if (imageView3 != null) {
                                                            i4 = R.id.isMe;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.isMe);
                                                            if (textView6 != null) {
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
                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.messageNumber);
                                                                            if (textView7 != null) {
                                                                                i4 = R.id.parise;
                                                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.parise);
                                                                                if (imageView5 != null) {
                                                                                    i4 = R.id.pariseNumber;
                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.pariseNumber);
                                                                                    if (textView8 != null) {
                                                                                        i4 = R.id.phoneModle;
                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.phoneModle);
                                                                                        if (textView9 != null) {
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
                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.time);
                                                                                                        if (textView10 != null) {
                                                                                                            i4 = R.id.userName;
                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.userName);
                                                                                                            if (textView11 != null) {
                                                                                                                i4 = R.id.usericon;
                                                                                                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.usericon);
                                                                                                                if (simpleDraweeView != null) {
                                                                                                                    i4 = R.id.v_divider;
                                                                                                                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.v_divider);
                                                                                                                    if (findChildViewById2 != null) {
                                                                                                                        return new ItemGameDetailCommentListItemViewBinding(linearLayout, linearLayout, mStarBar, textView, expandLayout, copyTextView, copyTextViewNew, textView2, imageView, textView3, linearLayout2, textView4, imageView2, textView5, imageView3, textView6, findChildViewById, vipView, imageView4, textView7, imageView5, textView8, textView9, linearLayout3, linearLayout4, relativeLayout, textView10, textView11, simpleDraweeView, findChildViewById2);
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
    public static ItemGameDetailCommentListItemViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22232b;
    }

    @NonNull
    public static ItemGameDetailCommentListItemViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_game_detail_comment_list_item_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
