package com.join.mgps.adapter;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Animatable;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.MApplication;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.CommentSelfListActivity_;
import com.join.mgps.base.BaseMultiItemQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.customview.TextViewWithHyperlink;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.BannerBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.RecommendLabelTag;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
/* loaded from: classes4.dex */
public class ForumCommentAdapter extends BaseMultiItemQuickAdapter<z, BaseViewHolder> {

    /* renamed from: d  reason: collision with root package name */
    private final String f40725d;

    /* renamed from: e  reason: collision with root package name */
    com.danikula.videocache.i f40726e;

    /* renamed from: f  reason: collision with root package name */
    private Context f40727f;

    /* renamed from: g  reason: collision with root package name */
    x f40728g;

    /* renamed from: h  reason: collision with root package name */
    LinearLayout.LayoutParams f40729h;

    /* renamed from: i  reason: collision with root package name */
    int f40730i;

    /* renamed from: j  reason: collision with root package name */
    int f40731j;

    /* renamed from: k  reason: collision with root package name */
    LinearLayout.LayoutParams f40732k;

    /* renamed from: l  reason: collision with root package name */
    Hashtable<String, y> f40733l;

    /* renamed from: m  reason: collision with root package name */
    t f40734m;

    /* renamed from: n  reason: collision with root package name */
    boolean f40735n;

    /* renamed from: o  reason: collision with root package name */
    v f40736o;

    /* renamed from: p  reason: collision with root package name */
    private w f40737p;

    /* loaded from: classes4.dex */
    public enum ViewType {
        COMMENT_HEADER,
        COMMENT_MESSAGE,
        COMMENT_IMAGE,
        COMMENT_MESSAGE_REPLY,
        EMPLOYEE_TAGS,
        DIVIDER
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumCommentAdapter.this.f40737p != null) {
                ForumCommentAdapter.this.f40737p.o();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f40739b;

        b(z.a aVar) {
            this.f40739b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean booleanValue;
            View view2;
            com.join.mgps.Util.w0.e("v.setOnClickListener");
            t tVar = ForumCommentAdapter.this.f40734m;
            if (tVar != null && (view2 = tVar.f40795g) != null && view2 != view) {
                view2.setTag(Boolean.FALSE);
            }
            if (view.getTag() == null) {
                view.setTag(Boolean.TRUE);
                booleanValue = false;
            } else {
                booleanValue = ((Boolean) view.getTag()).booleanValue();
            }
            if (!booleanValue || ForumCommentAdapter.this.f40735n) {
                ForumCommentAdapter.this.j0(view, this.f40739b);
                view.setTag(Boolean.TRUE);
                ForumCommentAdapter.this.f40735n = false;
                return;
            }
            view.setTag(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f40741b;

        c(z.c cVar) {
            this.f40741b = cVar;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (ForumCommentAdapter.this.f40737p != null) {
                ForumCommentAdapter.this.f40737p.n(view, this.f40741b.f40850a);
            }
            ForumCommentAdapter forumCommentAdapter = ForumCommentAdapter.this;
            z.c cVar = this.f40741b;
            forumCommentAdapter.i0(view, 1, cVar.f40855f, cVar.f40854e, cVar.f40850a, 0, cVar.f40852c, cVar.f40851b);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40743b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40744c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f40745d;

        d(int i4, int i5, String str) {
            this.f40743b = i4;
            this.f40744c = i5;
            this.f40745d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumCommentAdapter.this.f40737p != null) {
                ForumCommentAdapter.this.f40737p.k(this.f40743b, this.f40744c, this.f40745d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40747b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f40748c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f40749d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f40750e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f40751f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f40752g;

        e(int i4, boolean z4, boolean z5, int i5, String str, String str2) {
            this.f40747b = i4;
            this.f40748c = z4;
            this.f40749d = z5;
            this.f40750e = i5;
            this.f40751f = str;
            this.f40752g = str2;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (ForumCommentAdapter.this.f40737p != null) {
                ForumCommentAdapter.this.f40737p.i(view, this.f40747b);
            }
            ForumCommentAdapter.this.i0(view, 2, this.f40748c, this.f40749d, this.f40747b, this.f40750e, this.f40751f, this.f40752g);
            return true;
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean.GameInfo f40754b;

        f(ForumBean.GameInfo gameInfo) {
            this.f40754b = gameInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.Util.j0.I0(view.getContext(), this.f40754b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f40756b;

        g(String str) {
            this.f40756b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumCommentAdapter.this.f40737p != null) {
                ForumCommentAdapter.this.f40737p.e(this.f40756b);
            }
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f40758b;

        h(String str) {
            this.f40758b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int parseInt = Integer.parseInt(this.f40758b);
            if (ForumCommentAdapter.this.f40737p != null) {
                ForumCommentAdapter.this.f40737p.c(parseInt);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40760b;

        i(int i4) {
            this.f40760b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goForumGroupActivity(view.getContext(), this.f40760b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40762b;

        j(int i4) {
            this.f40762b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(this.f40762b).start();
            String uid = AccountUtil_.getInstance_(view.getContext()).getUid();
            if (TextUtils.isEmpty(uid)) {
                return;
            }
            if (uid.equals(this.f40762b + "") || ForumCommentAdapter.this.f40737p == null) {
                return;
            }
            ForumCommentAdapter.this.f40737p.m(this.f40762b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f40764b;

        k(z.a aVar) {
            this.f40764b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(this.f40764b.f40830b).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40766b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40767c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f40768d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.d f40769e;

        l(int i4, int i5, int i6, z.d dVar) {
            this.f40766b = i4;
            this.f40767c = i5;
            this.f40768d = i6;
            this.f40769e = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f40766b == 0) {
                return;
            }
            ForumBean.ForumCommentBean forumCommentBean = new ForumBean.ForumCommentBean();
            ArrayList arrayList = new ArrayList();
            for (int i4 = this.f40766b; i4 >= 0; i4--) {
                z zVar = (z) ForumCommentAdapter.this.getItem(this.f40767c - i4);
                z.d dVar = zVar.b() == ViewType.COMMENT_MESSAGE_REPLY ? (z.d) zVar.a() : null;
                if (dVar != null && this.f40768d == dVar.f40856a) {
                    arrayList.addAll(dVar.f40857b.getReply_list());
                }
            }
            for (int i5 = 0; i5 <= this.f40766b; i5++) {
                ForumCommentAdapter.this.remove(this.f40767c - i5);
            }
            forumCommentBean.setReply_list(arrayList);
            ForumCommentAdapter forumCommentAdapter = ForumCommentAdapter.this;
            int i6 = this.f40768d;
            z.d dVar2 = this.f40769e;
            ForumCommentAdapter.this.addData(this.f40767c - this.f40766b, (int) forumCommentAdapter.z(i6, forumCommentBean, dVar2.f40858c, true, dVar2.f40860e));
            ForumCommentAdapter.this.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40771b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ForumBean.ForumCommentBean f40772c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f40773d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.d f40774e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f40775f;

        m(int i4, ForumBean.ForumCommentBean forumCommentBean, int i5, z.d dVar, int i6) {
            this.f40771b = i4;
            this.f40772c = forumCommentBean;
            this.f40773d = i5;
            this.f40774e = dVar;
            this.f40775f = i6;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4 = 0;
            int i5 = 0;
            boolean z4 = false;
            while (i4 < this.f40771b) {
                ForumBean.ForumCommentBean forumCommentBean = new ForumBean.ForumCommentBean(this.f40772c);
                List<ForumBean.ForumCommentReplyBean> reply_list = forumCommentBean.getReply_list();
                ArrayList arrayList = new ArrayList();
                int i6 = i4 + 3;
                if (i6 < reply_list.size()) {
                    arrayList.addAll(reply_list.subList(i4, i6));
                } else {
                    arrayList.addAll(reply_list.subList(i4, reply_list.size()));
                    z4 = true;
                }
                forumCommentBean.setReply_list(arrayList);
                ForumCommentAdapter forumCommentAdapter = ForumCommentAdapter.this;
                int i7 = this.f40773d;
                z.d dVar = this.f40774e;
                z z5 = forumCommentAdapter.z(i7, forumCommentBean, dVar.f40858c, i5 == 0, dVar.f40860e);
                z.d dVar2 = (z.d) z5.a();
                dVar2.f40861f = i5;
                dVar2.f40862g = z4;
                dVar2.f40859d = i5 == 0;
                ForumCommentAdapter.this.R(z5, !z4);
                ForumCommentAdapter.this.addData(this.f40775f + i5 + 1, (int) z5);
                i5++;
                i4 = i6;
            }
            ForumCommentAdapter.this.remove(this.f40775f);
            ForumCommentAdapter.this.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n implements TextViewWithHyperlink.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f40777a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40778b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f40779c;

        n(int i4, int i5, String str) {
            this.f40777a = i4;
            this.f40778b = i5;
            this.f40779c = str;
        }

        @Override // com.join.mgps.customview.TextViewWithHyperlink.a
        public void a() {
            if (ForumCommentAdapter.this.f40737p != null) {
                ForumCommentAdapter.this.f40737p.k(this.f40777a, this.f40778b, this.f40779c);
            }
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f40781b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40782c;

        o(List list, int i4) {
            this.f40781b = list;
            this.f40782c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String[] strArr = new String[this.f40781b.size()];
            this.f40781b.toArray(strArr);
            com.join.mgps.Util.j0.G0(view.getContext(), this.f40782c, strArr);
        }
    }

    /* loaded from: classes4.dex */
    class p implements com.facebook.drawee.controller.c<com.facebook.imagepipeline.image.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SimpleDraweeView f40784a;

        p(SimpleDraweeView simpleDraweeView) {
            this.f40784a = simpleDraweeView;
        }

        @Override // com.facebook.drawee.controller.c
        /* renamed from: a */
        public void onFinalImageSet(String str, com.facebook.imagepipeline.image.f fVar, Animatable animatable) {
            try {
                ForumCommentAdapter.this.f0(str, this.f40784a, fVar);
                if (fVar != null) {
                    y yVar = new y();
                    yVar.f40824a = fVar.getWidth();
                    yVar.f40825b = fVar.getHeight();
                    ForumCommentAdapter.this.o(str, yVar);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // com.facebook.drawee.controller.c
        /* renamed from: b */
        public void onIntermediateImageSet(String str, com.facebook.imagepipeline.image.f fVar) {
        }

        @Override // com.facebook.drawee.controller.c
        public void onFailure(String str, Throwable th) {
        }

        @Override // com.facebook.drawee.controller.c
        public void onIntermediateImageFailed(String str, Throwable th) {
        }

        @Override // com.facebook.drawee.controller.c
        public void onRelease(String str) {
        }

        @Override // com.facebook.drawee.controller.c
        public void onSubmit(String str, Object obj) {
            SimpleDraweeView simpleDraweeView = this.f40784a;
            simpleDraweeView.setMinimumHeight(ForumCommentAdapter.this.D(simpleDraweeView.getContext()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q implements com.facebook.drawee.controller.c<com.facebook.imagepipeline.image.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SimpleDraweeView f40786a;

        q(SimpleDraweeView simpleDraweeView) {
            this.f40786a = simpleDraweeView;
        }

        @Override // com.facebook.drawee.controller.c
        /* renamed from: a */
        public void onFinalImageSet(String str, com.facebook.imagepipeline.image.f fVar, Animatable animatable) {
            try {
                ForumCommentAdapter.this.Q(str, this.f40786a, fVar);
                if (fVar != null) {
                    y yVar = new y();
                    yVar.f40824a = fVar.getWidth();
                    yVar.f40825b = fVar.getHeight();
                    ForumCommentAdapter.this.o(str, yVar);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // com.facebook.drawee.controller.c
        /* renamed from: b */
        public void onIntermediateImageSet(String str, com.facebook.imagepipeline.image.f fVar) {
        }

        @Override // com.facebook.drawee.controller.c
        public void onFailure(String str, Throwable th) {
        }

        @Override // com.facebook.drawee.controller.c
        public void onIntermediateImageFailed(String str, Throwable th) {
        }

        @Override // com.facebook.drawee.controller.c
        public void onRelease(String str) {
        }

        @Override // com.facebook.drawee.controller.c
        public void onSubmit(String str, Object obj) {
            SimpleDraweeView simpleDraweeView = this.f40786a;
            simpleDraweeView.setLayoutParams(ForumCommentAdapter.this.A(simpleDraweeView.getContext()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r implements View.OnTouchListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f40788b;

        r(View view) {
            this.f40788b = view;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            com.join.mgps.Util.w0.e("mPopWindow.setTouchInterceptor", motionEvent.toString());
            ForumCommentAdapter forumCommentAdapter = ForumCommentAdapter.this;
            if (forumCommentAdapter.v(forumCommentAdapter.f40734m, motionEvent) && !ForumCommentAdapter.this.w(this.f40788b, motionEvent)) {
                ForumCommentAdapter.this.f40735n = true;
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40790b;

        s(int i4) {
            this.f40790b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumCommentAdapter.this.f40737p != null) {
                ForumCommentAdapter.this.f40737p.b(this.f40790b);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class t extends com.join.mgps.customview.e implements View.OnClickListener {

        /* renamed from: d  reason: collision with root package name */
        int f40792d;

        /* renamed from: e  reason: collision with root package name */
        int f40793e;

        /* renamed from: f  reason: collision with root package name */
        String f40794f;

        /* renamed from: g  reason: collision with root package name */
        View f40795g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                t.this.f40792d = view.getId();
                ForumCommentAdapter.this.f40734m.dismiss();
            }
        }

        public t(Context context) {
            super(context);
            View inflate = LayoutInflater.from(this.f48455b).inflate(R.layout.mg_forum_forum_post_a_comment_reply_popwindow, (ViewGroup) null);
            setContentView(inflate);
            setWidth((int) this.f48455b.getResources().getDimension(R.dimen.wdp378));
            setHeight((int) this.f48455b.getResources().getDimension(R.dimen.wdp89));
            setAnimationStyle(R.style.animationCommentReplyPop);
            g(inflate);
            setFocusable(false);
        }

        private void g(View view) {
            View findViewById = view.findViewById(R.id.resolve);
            View findViewById2 = view.findViewById(R.id.report);
            View findViewById3 = view.findViewById(R.id.reply);
            View findViewById4 = view.findViewById(R.id.delete);
            a aVar = new a();
            findViewById.setOnClickListener(aVar);
            findViewById2.setOnClickListener(aVar);
            findViewById3.setOnClickListener(aVar);
            findViewById4.setOnClickListener(aVar);
        }

        public int d() {
            return this.f40793e;
        }

        @Override // com.join.mgps.customview.e, android.widget.PopupWindow
        public void dismiss() {
            super.dismiss();
            View view = this.f40795g;
            if (view != null) {
                view.setClickable(true);
                this.f40795g.setFocusable(true);
            }
            switch (this.f40792d) {
                case R.id.delete /* 2131297262 */:
                    if (ForumCommentAdapter.this.f40737p != null) {
                        ForumCommentAdapter.this.f40737p.d(this.f40793e);
                        return;
                    }
                    return;
                case R.id.reply /* 2131300626 */:
                    if (ForumCommentAdapter.this.f40737p != null) {
                        ForumCommentAdapter.this.f40737p.h(this.f40793e, this.f40794f);
                        return;
                    }
                    return;
                case R.id.report /* 2131300630 */:
                    if (ForumCommentAdapter.this.f40737p != null) {
                        ForumCommentAdapter.this.f40737p.l();
                        return;
                    }
                    return;
                case R.id.resolve /* 2131300638 */:
                    if (ForumCommentAdapter.this.f40737p != null) {
                        ForumCommentAdapter.this.f40737p.p(this.f40793e);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }

        public String e() {
            return this.f40794f;
        }

        public void f(int i4) {
            this.f40793e = i4;
        }

        public void h(String str) {
            this.f40794f = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        @Override // com.join.mgps.customview.e, android.widget.PopupWindow
        public void showAsDropDown(View view, int i4, int i5) {
            this.f40795g = view;
            super.showAsDropDown(view, i4, i5);
            b();
            this.f40792d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class u extends ClickableSpan {

        /* renamed from: b  reason: collision with root package name */
        private Context f40798b;

        /* renamed from: c  reason: collision with root package name */
        private String f40799c;

        public u(Context context, String str) {
            this.f40798b = context;
            this.f40799c = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IntentUtil.getInstance().goShareWebActivity(this.f40798b, this.f40799c);
        }
    }

    /* loaded from: classes4.dex */
    public class v extends com.join.mgps.customview.e implements View.OnClickListener {

        /* renamed from: p  reason: collision with root package name */
        public static final int f40801p = 1;

        /* renamed from: q  reason: collision with root package name */
        public static final int f40802q = 2;

        /* renamed from: r  reason: collision with root package name */
        public static final int f40803r = 3;

        /* renamed from: d  reason: collision with root package name */
        View f40804d;

        /* renamed from: e  reason: collision with root package name */
        View f40805e;

        /* renamed from: f  reason: collision with root package name */
        View f40806f;

        /* renamed from: g  reason: collision with root package name */
        View f40807g;

        /* renamed from: h  reason: collision with root package name */
        View f40808h;

        /* renamed from: i  reason: collision with root package name */
        View f40809i;

        /* renamed from: j  reason: collision with root package name */
        int f40810j;

        /* renamed from: k  reason: collision with root package name */
        int f40811k;

        /* renamed from: l  reason: collision with root package name */
        String f40812l;

        /* renamed from: m  reason: collision with root package name */
        String f40813m;

        /* renamed from: n  reason: collision with root package name */
        int f40814n;

        public v(Context context) {
            super(context);
            c();
            k();
        }

        private void k() {
            View inflate = LayoutInflater.from(this.f48455b).inflate(R.layout.mg_forum_popupwindow_layout, (ViewGroup) null);
            this.f40804d = inflate.findViewById(R.id.btn_forum_comment_delete);
            this.f40805e = inflate.findViewById(R.id.btn_forum_comment_copy);
            this.f40806f = inflate.findViewById(R.id.divider_forum_comment_1);
            this.f40807g = inflate.findViewById(R.id.btn_forum_comment);
            this.f40808h = inflate.findViewById(R.id.divider_2);
            this.f40809i = inflate.findViewById(R.id.btn_forum_report);
            this.f40804d.setOnClickListener(this);
            this.f40805e.setOnClickListener(this);
            this.f40807g.setOnClickListener(this);
            this.f40809i.setOnClickListener(this);
            setContentView(inflate);
            setWidth(-2);
            setHeight(-2);
        }

        public void A(int i4) {
            this.f40811k = i4;
        }

        void c() {
            setAnimationStyle(0);
            setFocusable(false);
        }

        public int d() {
            return this.f40810j;
        }

        @Override // com.join.mgps.customview.e, android.widget.PopupWindow
        public void dismiss() {
            super.dismiss();
            this.f40810j = 0;
            this.f40811k = 0;
            this.f40812l = "";
            this.f40813m = "";
        }

        public View e() {
            return this.f40805e;
        }

        public View f() {
            return this.f40804d;
        }

        public int g() {
            return this.f40814n;
        }

        public String h() {
            return this.f40813m;
        }

        public String i() {
            return this.f40812l;
        }

        public int j() {
            return this.f40811k;
        }

        void l() {
            if (ForumCommentAdapter.this.f40737p == null) {
                return;
            }
            int i4 = this.f40814n;
            if (i4 == 1) {
                ForumCommentAdapter.this.f40737p.h(this.f40810j, this.f40812l);
            } else if (i4 == 2) {
                ForumCommentAdapter.this.f40737p.k(this.f40810j, this.f40811k, this.f40812l);
            }
        }

        void m() {
            String charSequence;
            if (ForumCommentAdapter.this.f40737p == null) {
                return;
            }
            if (Build.VERSION.SDK_INT > 11) {
                ClipboardManager clipboardManager = (ClipboardManager) this.f48455b.getSystemService("clipboard");
                clipboardManager.setPrimaryClip(ClipData.newPlainText("wufan", this.f40813m));
                charSequence = clipboardManager.getText().toString();
            } else {
                android.text.ClipboardManager clipboardManager2 = (android.text.ClipboardManager) this.f48455b.getSystemService("clipboard");
                clipboardManager2.setText(this.f40813m);
                charSequence = clipboardManager2.getText().toString();
            }
            if (charSequence.equals(this.f40813m.toString())) {
                com.join.mgps.Util.l2.a(this.f48455b).b("已复制到剪贴板！");
            }
        }

        void n() {
            if (ForumCommentAdapter.this.f40737p == null) {
                return;
            }
            int i4 = this.f40814n;
            if (i4 == 1) {
                ForumCommentAdapter.this.f40737p.d(this.f40810j);
            } else if (i4 == 2) {
                ForumCommentAdapter.this.f40737p.g(this.f40811k);
            }
        }

        void o() {
            if (ForumCommentAdapter.this.f40737p == null) {
                return;
            }
            int i4 = this.f40814n;
            if (i4 == 1) {
                ForumCommentAdapter.this.f40737p.j(this.f40810j);
            } else if (i4 == 2) {
                ForumCommentAdapter.this.f40737p.f(this.f40811k);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_forum_comment /* 2131296846 */:
                    l();
                    break;
                case R.id.btn_forum_comment_copy /* 2131296847 */:
                    m();
                    break;
                case R.id.btn_forum_comment_delete /* 2131296848 */:
                    n();
                    break;
                case R.id.btn_forum_report /* 2131296849 */:
                    o();
                    break;
            }
            dismiss();
        }

        public void p() {
            View view = this.f40804d;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f40807g;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.f40809i;
            if (view3 != null) {
                view3.setVisibility(0);
            }
        }

        public void q(int i4) {
            this.f40810j = i4;
        }

        public void r(int i4) {
            View view = this.f40807g;
            if (view != null) {
                view.setVisibility(i4);
            }
        }

        public void s(View view) {
            this.f40805e = view;
        }

        @Override // com.join.mgps.customview.e, android.widget.PopupWindow
        public void showAsDropDown(View view) {
            showAsDropDown(view, 0, (view.getMeasuredHeight() * (-1)) - this.f48455b.getResources().getDimensionPixelSize(R.dimen.mg_forum_popupwindow_height));
            b();
        }

        public void t(int i4) {
            View view = this.f40805e;
            if (view != null) {
                view.setVisibility(i4);
            }
            if (i4 == 0) {
                this.f40805e.setVisibility(0);
            } else {
                this.f40805e.setVisibility(8);
            }
        }

        public void u(View view) {
            this.f40804d = view;
        }

        public void v(int i4) {
            View view = this.f40804d;
            if (view != null) {
                view.setVisibility(i4);
            }
            if (i4 == 0) {
                this.f40806f.setVisibility(0);
            } else {
                this.f40806f.setVisibility(8);
            }
        }

        public void w(int i4) {
            this.f40814n = i4;
        }

        public void x(String str) {
            this.f40813m = str;
        }

        public void y(String str) {
            this.f40812l = str;
        }

        void z(int i4) {
            View view = this.f40809i;
            if (view != null) {
                view.setVisibility(i4);
            }
            if (i4 == 0) {
                this.f40808h.setVisibility(0);
            } else {
                this.f40808h.setVisibility(8);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface w {
        void a(int i4);

        void b(int i4);

        void c(int i4);

        void d(int i4);

        void e(String str);

        void f(int i4);

        void g(int i4);

        void h(int i4, String str);

        void i(View view, int i4);

        void j(int i4);

        void k(int i4, int i5, String str);

        void l();

        void m(int i4);

        void n(View view, int i4);

        void o();

        void p(int i4);
    }

    /* loaded from: classes4.dex */
    public class y {

        /* renamed from: a  reason: collision with root package name */
        public int f40824a;

        /* renamed from: b  reason: collision with root package name */
        public int f40825b;

        public y() {
        }
    }

    /* loaded from: classes4.dex */
    public static class z implements u1.b {

        /* renamed from: b  reason: collision with root package name */
        ViewType f40827b;

        /* renamed from: c  reason: collision with root package name */
        Object f40828c;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40829a;

            /* renamed from: b  reason: collision with root package name */
            public int f40830b;

            /* renamed from: c  reason: collision with root package name */
            public int f40831c;

            /* renamed from: d  reason: collision with root package name */
            public String f40832d;

            /* renamed from: e  reason: collision with root package name */
            public String f40833e;

            /* renamed from: f  reason: collision with root package name */
            public long f40834f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f40835g;

            /* renamed from: h  reason: collision with root package name */
            public int f40836h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f40837i;

            /* renamed from: j  reason: collision with root package name */
            public boolean f40838j;

            /* renamed from: k  reason: collision with root package name */
            public int f40839k;

            /* renamed from: l  reason: collision with root package name */
            public boolean f40840l;

            /* renamed from: m  reason: collision with root package name */
            public boolean f40841m;

            /* renamed from: n  reason: collision with root package name */
            public boolean f40842n;

            /* renamed from: o  reason: collision with root package name */
            public int f40843o;

            /* renamed from: p  reason: collision with root package name */
            public int f40844p;

            /* renamed from: q  reason: collision with root package name */
            public boolean f40845q;

            /* renamed from: r  reason: collision with root package name */
            public String f40846r;

            public a() {
            }

            public a(boolean z4, int i4, int i5, String str, String str2, long j4, boolean z5, int i6, boolean z6, boolean z7, int i7, boolean z8, boolean z9, boolean z10, int i8, int i9, boolean z11, String str3) {
                this.f40829a = z4;
                this.f40830b = i4;
                this.f40831c = i5;
                this.f40832d = str;
                this.f40833e = str2;
                this.f40834f = j4;
                this.f40835g = z5;
                this.f40836h = i6;
                this.f40837i = z6;
                this.f40838j = z7;
                this.f40839k = i7;
                this.f40840l = z8;
                this.f40841m = z9;
                this.f40842n = z10;
                this.f40843o = i8;
                this.f40844p = i9;
                this.f40845q = z11;
                this.f40846r = str3;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public String f40847a;

            /* renamed from: b  reason: collision with root package name */
            public int f40848b;

            /* renamed from: c  reason: collision with root package name */
            public List<String> f40849c;

            public b() {
            }

            public b(String str, int i4, List<String> list) {
                this.f40847a = str;
                this.f40848b = i4;
                this.f40849c = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f40850a;

            /* renamed from: b  reason: collision with root package name */
            public String f40851b;

            /* renamed from: c  reason: collision with root package name */
            public String f40852c;

            /* renamed from: d  reason: collision with root package name */
            public int f40853d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f40854e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f40855f;

            public c() {
            }

            public c(int i4, String str, String str2, int i5, boolean z4, boolean z5) {
                this.f40850a = i4;
                this.f40851b = str;
                this.f40852c = str2;
                this.f40853d = i5;
                this.f40854e = z4;
                this.f40855f = z5;
            }
        }

        /* loaded from: classes4.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f40856a;

            /* renamed from: b  reason: collision with root package name */
            public ForumBean.ForumCommentBean f40857b;

            /* renamed from: c  reason: collision with root package name */
            public int f40858c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f40859d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f40860e;

            /* renamed from: f  reason: collision with root package name */
            public int f40861f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f40862g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f40863h;

            public d(int i4, ForumBean.ForumCommentBean forumCommentBean, int i5, boolean z4, boolean z5) {
                this.f40856a = i4;
                this.f40857b = forumCommentBean;
                this.f40858c = i5;
                this.f40859d = z4;
                this.f40860e = z5;
            }
        }

        /* loaded from: classes4.dex */
        public static class e {
        }

        /* loaded from: classes4.dex */
        public static class f {

            /* renamed from: a  reason: collision with root package name */
            int f40864a;

            /* renamed from: b  reason: collision with root package name */
            int f40865b;

            public f(int i4, int i5) {
                this.f40864a = i4;
                this.f40865b = i5;
            }
        }

        /* loaded from: classes4.dex */
        public static class g {

            /* renamed from: a  reason: collision with root package name */
            public List<RecommendLabelTag> f40866a;

            /* renamed from: b  reason: collision with root package name */
            public int f40867b;

            /* renamed from: c  reason: collision with root package name */
            public String f40868c;

            public g(List<RecommendLabelTag> list, int i4, String str) {
                this.f40866a = list;
                this.f40867b = i4;
                this.f40868c = str;
            }
        }

        /* loaded from: classes4.dex */
        public static class h {

            /* renamed from: a  reason: collision with root package name */
            public int f40869a;

            /* renamed from: b  reason: collision with root package name */
            public String f40870b;

            /* renamed from: c  reason: collision with root package name */
            public int f40871c;

            /* renamed from: d  reason: collision with root package name */
            public int f40872d;

            /* renamed from: e  reason: collision with root package name */
            public int f40873e;

            /* renamed from: f  reason: collision with root package name */
            public int f40874f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f40875g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f40876h;

            public h() {
            }

            public h(int i4, int i5, String str, int i6, int i7, int i8, boolean z4, boolean z5) {
                this.f40869a = i4;
                this.f40874f = i5;
                this.f40870b = str;
                this.f40871c = i6;
                this.f40872d = i7;
                this.f40873e = i8;
                this.f40875g = z4;
                this.f40876h = z5;
            }
        }

        /* loaded from: classes4.dex */
        public static class i {

            /* renamed from: a  reason: collision with root package name */
            public String f40877a;

            /* renamed from: b  reason: collision with root package name */
            public ForumBean.GameInfo f40878b;

            /* renamed from: c  reason: collision with root package name */
            public String f40879c;

            public i(String str, ForumBean.GameInfo gameInfo, String str2) {
                this.f40877a = str;
                this.f40878b = gameInfo;
                this.f40879c = str2;
            }
        }

        /* loaded from: classes4.dex */
        public static class j {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40880a;

            /* renamed from: b  reason: collision with root package name */
            public int f40881b;

            /* renamed from: c  reason: collision with root package name */
            public String f40882c;

            /* renamed from: d  reason: collision with root package name */
            public String f40883d;

            /* renamed from: e  reason: collision with root package name */
            public long f40884e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f40885f;

            /* renamed from: g  reason: collision with root package name */
            public int f40886g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f40887h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f40888i;

            /* renamed from: j  reason: collision with root package name */
            public int f40889j;

            /* renamed from: k  reason: collision with root package name */
            public int f40890k;

            /* renamed from: l  reason: collision with root package name */
            public int f40891l;

            /* renamed from: m  reason: collision with root package name */
            public String f40892m;

            /* renamed from: n  reason: collision with root package name */
            public String f40893n;

            /* renamed from: o  reason: collision with root package name */
            public boolean f40894o;

            /* renamed from: p  reason: collision with root package name */
            public String f40895p;

            /* renamed from: q  reason: collision with root package name */
            public String f40896q;

            /* renamed from: r  reason: collision with root package name */
            public int f40897r;

            /* renamed from: s  reason: collision with root package name */
            public boolean f40898s;

            /* renamed from: t  reason: collision with root package name */
            public String f40899t;

            public j() {
            }

            public j(boolean z4, int i4, String str, String str2, long j4, boolean z5, int i5, boolean z6, boolean z7, int i6, int i7, int i8, String str3, String str4, boolean z8, String str5, String str6, int i9, boolean z9, String str7) {
                this.f40880a = z4;
                this.f40881b = i4;
                this.f40882c = str;
                this.f40883d = str2;
                this.f40884e = j4;
                this.f40885f = z5;
                this.f40886g = i5;
                this.f40887h = z6;
                this.f40888i = z7;
                this.f40889j = i6;
                this.f40890k = i7;
                this.f40891l = i8;
                this.f40892m = str3;
                this.f40893n = str4;
                this.f40894o = z8;
                this.f40895p = str5;
                this.f40896q = str6;
                this.f40897r = i9;
                this.f40898s = z9;
                this.f40899t = str7;
            }
        }

        /* loaded from: classes4.dex */
        public static class k {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40900a;

            /* renamed from: b  reason: collision with root package name */
            public String f40901b;

            /* renamed from: c  reason: collision with root package name */
            public String f40902c;

            /* renamed from: d  reason: collision with root package name */
            public long f40903d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f40904e;

            /* renamed from: f  reason: collision with root package name */
            public int f40905f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f40906g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f40907h;

            /* renamed from: i  reason: collision with root package name */
            public int f40908i;

            /* renamed from: j  reason: collision with root package name */
            public int f40909j;

            /* renamed from: k  reason: collision with root package name */
            public int f40910k;

            /* renamed from: l  reason: collision with root package name */
            public int f40911l;

            /* renamed from: m  reason: collision with root package name */
            public String f40912m;

            /* renamed from: n  reason: collision with root package name */
            public String f40913n;

            public k() {
            }

            public k(boolean z4, String str, String str2, long j4, boolean z5, int i4, boolean z6, boolean z7, int i5, int i6, int i7, String str3, String str4, int i8) {
                this.f40900a = z4;
                this.f40901b = str;
                this.f40902c = str2;
                this.f40903d = j4;
                this.f40904e = z5;
                this.f40905f = i4;
                this.f40906g = z6;
                this.f40907h = z7;
                this.f40908i = i5;
                this.f40909j = i6;
                this.f40910k = i7;
                this.f40912m = str3;
                this.f40913n = str4;
                this.f40911l = i8;
            }
        }

        /* loaded from: classes4.dex */
        public static class l {

            /* renamed from: a  reason: collision with root package name */
            public String f40914a;

            /* renamed from: b  reason: collision with root package name */
            int f40915b;

            /* renamed from: c  reason: collision with root package name */
            List<String> f40916c;

            public l() {
            }

            public l(String str, int i4, List<String> list) {
                this.f40914a = str;
                this.f40915b = i4;
                this.f40916c = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class m {

            /* renamed from: a  reason: collision with root package name */
            public List<String> f40917a;

            /* renamed from: b  reason: collision with root package name */
            List<String> f40918b;

            public m() {
            }

            public m(List<String> list, List<String> list2) {
                this.f40917a = list;
                this.f40918b = list2;
            }
        }

        /* loaded from: classes4.dex */
        public static class n {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40919a;

            /* renamed from: b  reason: collision with root package name */
            public SpannableStringBuilder f40920b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f40921c;

            /* renamed from: d  reason: collision with root package name */
            public String f40922d;

            /* renamed from: e  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f40923e;

            public n() {
            }

            public n(boolean z4, SpannableStringBuilder spannableStringBuilder, boolean z5, String str, List<ForumBean.ForumPostsBean.TagInfo> list) {
                this.f40919a = z4;
                this.f40920b = spannableStringBuilder;
                this.f40921c = z5;
                this.f40922d = str;
                this.f40923e = list;
            }

            public n(boolean z4, SpannableStringBuilder spannableStringBuilder, List<ForumBean.ForumPostsBean.TagInfo> list) {
                this.f40919a = z4;
                this.f40920b = spannableStringBuilder;
                this.f40923e = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class o {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40924a;

            /* renamed from: b  reason: collision with root package name */
            public SpannableStringBuilder f40925b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f40926c;

            /* renamed from: d  reason: collision with root package name */
            public String f40927d;

            /* renamed from: e  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f40928e;

            public o(boolean z4, SpannableStringBuilder spannableStringBuilder, boolean z5, String str, List<ForumBean.ForumPostsBean.TagInfo> list) {
                this.f40924a = z4;
                this.f40925b = spannableStringBuilder;
                this.f40926c = z5;
                this.f40927d = str;
                this.f40928e = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class p {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40929a;

            /* renamed from: b  reason: collision with root package name */
            public Spanned f40930b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f40931c;

            /* renamed from: d  reason: collision with root package name */
            public String f40932d;

            /* renamed from: e  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f40933e;

            public p() {
            }

            public p(boolean z4, Spanned spanned, boolean z5, String str, List<ForumBean.ForumPostsBean.TagInfo> list) {
                this.f40929a = z4;
                this.f40930b = spanned;
                this.f40931c = z5;
                this.f40932d = str;
                this.f40933e = list;
            }

            public p(boolean z4, Spanned spanned, List<ForumBean.ForumPostsBean.TagInfo> list) {
                this.f40929a = z4;
                this.f40930b = spanned;
                this.f40933e = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class q {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40934a;

            /* renamed from: b  reason: collision with root package name */
            public String f40935b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f40936c;

            /* renamed from: d  reason: collision with root package name */
            public String f40937d;

            /* renamed from: e  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f40938e;

            /* renamed from: f  reason: collision with root package name */
            public List<RecommendLabelTag> f40939f;

            /* renamed from: g  reason: collision with root package name */
            public int f40940g;

            /* renamed from: h  reason: collision with root package name */
            public String f40941h;

            public q() {
            }

            public q(boolean z4, String str, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list, List<RecommendLabelTag> list2, int i4, String str3) {
                this.f40934a = z4;
                this.f40935b = str;
                this.f40936c = z5;
                this.f40937d = str2;
                this.f40938e = list;
                this.f40939f = list2;
                this.f40940g = i4;
                this.f40941h = str3;
            }
        }

        /* loaded from: classes4.dex */
        public static class r {

            /* renamed from: a  reason: collision with root package name */
            public String f40942a;

            /* renamed from: b  reason: collision with root package name */
            public String f40943b;

            /* renamed from: c  reason: collision with root package name */
            public String f40944c;

            public r(String str, String str2, String str3) {
                this.f40942a = str;
                this.f40943b = str2;
                this.f40944c = str3;
            }
        }

        public z() {
        }

        public <T> T a() {
            return (T) this.f40828c;
        }

        public ViewType b() {
            return this.f40827b;
        }

        public void c(Object obj) {
            this.f40828c = obj;
        }

        public void d(ViewType viewType) {
            this.f40827b = viewType;
        }

        @Override // u1.b
        public int getItemType() {
            return this.f40827b.ordinal();
        }

        public z(ViewType viewType, Object obj) {
            this.f40827b = viewType;
            this.f40828c = obj;
        }
    }

    public ForumCommentAdapter(Context context) {
        super(new ArrayList());
        this.f40725d = getClass().getSimpleName();
        this.f40730i = 0;
        this.f40731j = 0;
        this.f40735n = false;
        this.f40737p = null;
        this.f40727f = context;
        this.f40726e = F(context);
        a(ViewType.COMMENT_HEADER.ordinal(), R.layout.mg_forum_post_activity_item_comment_header);
        a(ViewType.COMMENT_MESSAGE.ordinal(), R.layout.mg_forum_post_activity_item_comment_message);
        a(ViewType.COMMENT_IMAGE.ordinal(), R.layout.mg_forum_post_activity_item_comment_image);
        a(ViewType.COMMENT_MESSAGE_REPLY.ordinal(), R.layout.mg_forum_post_activity_item_comment_message_reply);
        a(ViewType.EMPLOYEE_TAGS.ordinal(), R.layout.mg_forum_post_activity_item_employee_tags);
        a(ViewType.DIVIDER.ordinal(), R.layout.mg_forum_post_activity_item_commnet_divider);
        H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LinearLayout.LayoutParams A(Context context) {
        if (context == null) {
            return null;
        }
        if (this.f40732k == null) {
            Resources resources = context.getResources();
            int i4 = resources.getDisplayMetrics().widthPixels;
            float f5 = context.getResources().getDisplayMetrics().density;
            int dimensionPixelSize = (int) ((i4 - resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding)) - (30 * f5));
            int i5 = (int) (4 * f5);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, (int) ((dimensionPixelSize * 1.0f) / 1.5f));
            layoutParams.setMargins(0, i5, 0, i5);
            this.f40732k = layoutParams;
        }
        return this.f40732k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int D(Context context) {
        if (context == null) {
            return 0;
        }
        if (this.f40731j == 0) {
            Resources resources = context.getResources();
            this.f40731j = (int) (((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) * 1.0f) / 1.5f);
        }
        return this.f40731j;
    }

    private int E(Context context) {
        if (context == null) {
            return 0;
        }
        if (this.f40730i == 0) {
            Resources resources = context.getResources();
            this.f40730i = (int) (((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) * 1.0f) / 1.8f);
        }
        return this.f40730i;
    }

    private void H() {
        if (this.f40729h == null) {
            this.f40729h = G();
        }
    }

    private void I(TextView textView) {
        textView.setMovementMethod(com.join.mgps.Util.x.a());
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            int length = text.length();
            Spannable spannable = (Spannable) textView.getText();
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, length, URLSpan.class);
            if (uRLSpanArr.length == 0) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            for (URLSpan uRLSpan : uRLSpanArr) {
                String url = uRLSpan.getURL();
                if (url.indexOf("http://") == 0 || url.indexOf("https://") == 0) {
                    spannableStringBuilder.setSpan(new u(textView.getContext(), url), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 17);
                }
            }
            textView.setText(spannableStringBuilder);
        }
    }

    private void L(View view, boolean z4, int i4) {
        TextView textView = (TextView) view.findViewById(R.id.forum_post_praise);
        ImageView imageView = (ImageView) view.findViewById(R.id.forum_post_praise_icon);
        if (z4) {
            imageView.setImageResource(R.drawable.like);
            textView.setText(i4 + "");
            return;
        }
        imageView.setImageResource(R.drawable.unlike);
        textView.setText(i4 + "");
    }

    private void N(Context context, String str) {
        Integer[] i02 = com.join.mgps.Util.j0.i0(str);
        if (i02 != null) {
            y yVar = new y();
            int intValue = i02[0].intValue();
            int intValue2 = i02[1].intValue();
            Resources resources = context.getResources();
            int dimensionPixelSize = (int) ((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) - (resources.getDisplayMetrics().density * 40.0f));
            yVar.f40824a = dimensionPixelSize;
            yVar.f40825b = (int) (dimensionPixelSize * 1.0f * ((intValue2 * 1.0f) / intValue));
            o(str, yVar);
        }
    }

    private void O(View view, z.d dVar, boolean z4, int i4) {
        int i5;
        boolean z5;
        View view2;
        int i6;
        ForumBean.ForumCommentBean forumCommentBean;
        LinearLayout linearLayout;
        int i7;
        int i8 = dVar.f40856a;
        int i9 = dVar.f40861f;
        boolean z6 = dVar.f40862g;
        ForumBean.ForumCommentBean forumCommentBean2 = dVar.f40857b;
        List<ForumBean.ForumCommentReplyBean> reply_list = forumCommentBean2.getReply_list();
        LinearLayout linearLayout2 = (LinearLayout) view;
        linearLayout2.removeAllViews();
        int size = reply_list.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size + 1) {
            if (i11 <= 3 || !z4) {
                View inflate = LayoutInflater.from(this.f40727f).inflate(R.layout.comment_reply_item, (ViewGroup) null);
                inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                TextViewWithHyperlink textViewWithHyperlink = (TextViewWithHyperlink) inflate.findViewById(R.id.comment_reply_content);
                TextView textView = (TextView) inflate.findViewById(R.id.comment_reply_more);
                if ((i11 != size || size <= 3) && !(i9 > 0 && z6 && i11 == size)) {
                    i5 = i9;
                    z5 = z6;
                    view2 = inflate;
                    i6 = i11;
                    if (i6 == 3 && z4 && size > 3) {
                        textViewWithHyperlink.setVisibility(8);
                        textView.setVisibility(0);
                        textView.setText(textView.getResources().getString(R.string.comment_item_content_more, Integer.valueOf(size - 3)));
                        forumCommentBean = forumCommentBean2;
                        view2.setOnClickListener(new m(size, forumCommentBean2, i8, dVar, i4));
                        linearLayout = linearLayout2;
                    } else {
                        forumCommentBean = forumCommentBean2;
                        LinearLayout linearLayout3 = linearLayout2;
                        if (i6 >= size || (i6 >= 3 && z4)) {
                            linearLayout = linearLayout3;
                        } else {
                            ForumBean.ForumCommentReplyBean forumCommentReplyBean = reply_list.get(i6);
                            String nickname = forumCommentReplyBean.getNickname();
                            String rnickname = forumCommentReplyBean.getRnickname();
                            if (forumCommentReplyBean.getRrid() == 0) {
                                rnickname = "";
                            }
                            String message = forumCommentReplyBean.getMessage();
                            textViewWithHyperlink.setVisibility(0);
                            textView.setVisibility(8);
                            if (forumCommentReplyBean.isOfficialAccount()) {
                                nickname = nickname + "#*#";
                            }
                            if (com.join.mgps.Util.g2.i(rnickname) && forumCommentReplyBean.isrOfficialAccount()) {
                                rnickname = rnickname + "#*#";
                            }
                            com.join.mgps.Util.j0.u1(textViewWithHyperlink, nickname, rnickname, message);
                            BannerBean jump_info = forumCommentReplyBean.getJump_info();
                            int rid = forumCommentReplyBean.getRid();
                            int uid = forumCommentReplyBean.getUid();
                            String nickname2 = forumCommentReplyBean.getNickname();
                            if (jump_info != null) {
                                textViewWithHyperlink.a(this.f40727f, jump_info.getTitle(), jump_info.getIntentDataBean(), new n(i8, rid, nickname2));
                            }
                            Y(view2, i8, rid, nickname2);
                            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f40727f).getAccountData();
                            int i12 = dVar.f40858c;
                            boolean z7 = dVar.f40860e;
                            boolean z8 = accountData != null && uid == accountData.getUid();
                            i7 = size;
                            X(view2, i12 == 3 || i12 == 99 || z8 || z7, !z8, i8, rid, nickname2, forumCommentReplyBean.getMessage());
                            linearLayout = linearLayout3;
                            linearLayout.addView(view2);
                            i11 = i6 + 1;
                            linearLayout2 = linearLayout;
                            size = i7;
                            i9 = i5;
                            z6 = z5;
                            forumCommentBean2 = forumCommentBean;
                            i10 = 0;
                        }
                    }
                } else {
                    textViewWithHyperlink.setVisibility(8);
                    textView.setVisibility(i10);
                    textView.setText("收起");
                    int i13 = i9;
                    i5 = i9;
                    view2 = inflate;
                    z5 = z6;
                    i6 = i11;
                    view2.setOnClickListener(new l(i13, i4, i8, dVar));
                    forumCommentBean = forumCommentBean2;
                    linearLayout = linearLayout2;
                }
                i7 = size;
                linearLayout.addView(view2);
                i11 = i6 + 1;
                linearLayout2 = linearLayout;
                size = i7;
                i9 = i5;
                z6 = z5;
                forumCommentBean2 = forumCommentBean;
                i10 = 0;
            } else {
                i5 = i9;
                z5 = z6;
                forumCommentBean = forumCommentBean2;
                linearLayout = linearLayout2;
                i6 = i11;
            }
            i7 = size;
            i11 = i6 + 1;
            linearLayout2 = linearLayout;
            size = i7;
            i9 = i5;
            z6 = z5;
            forumCommentBean2 = forumCommentBean;
            i10 = 0;
        }
    }

    private void P(RelativeLayout relativeLayout, List<String> list, List<String> list2) {
        if (list != null && list.size() != 0) {
            if (this.f40729h == null) {
                this.f40729h = G();
            }
            TextView textView = (TextView) relativeLayout.findViewById(R.id.images_count);
            if (list.size() > 3) {
                textView.setVisibility(0);
                textView.setText("共" + list.size() + "张");
            } else {
                textView.setVisibility(8);
            }
            int i4 = (int) (this.f40727f.getResources().getDisplayMetrics().density * 6.0f);
            int[] iArr = {R.id.img_m_1, R.id.img_m_2, R.id.img_m_3};
            for (int i5 = 0; i5 < 3; i5++) {
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) relativeLayout.findViewById(iArr[i5]);
                LinearLayout.LayoutParams layoutParams = this.f40729h;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
                if (i5 < list.size()) {
                    String str = list.get(i5);
                    simpleDraweeView.setVisibility(0);
                    if (i5 > 0) {
                        layoutParams2.setMargins(i4, 0, 0, 0);
                    } else {
                        layoutParams2.setMargins(0, 0, 0, 0);
                    }
                    simpleDraweeView.setLayoutParams(layoutParams2);
                    simpleDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    MyImageLoader.i(simpleDraweeView, str, r.c.f11300g);
                    simpleDraweeView.setOnClickListener(new o(list2, i5));
                } else {
                    simpleDraweeView.setVisibility(8);
                }
            }
            return;
        }
        relativeLayout.setVisibility(8);
    }

    private void S(TextView textView, String str, boolean z4, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list, List<RecommendLabelTag> list2, int i4, String str3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        com.join.mgps.Util.j0.h(textView.getContext(), spannableStringBuilder, list);
        com.join.mgps.Util.j0.i(textView.getContext(), spannableStringBuilder, list2, i4, str3);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        spannableStringBuilder.append((CharSequence) str);
        textView.setText(spannableStringBuilder);
    }

    private void a0(View view, String str) {
        view.setOnClickListener(new g(str));
    }

    private void b0(View view, int i4) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new i(i4));
    }

    private void c0(View view, ForumBean.GameInfo gameInfo) {
        view.setOnClickListener(new f(gameInfo));
    }

    private void e0(View view, int i4) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new j(i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup.LayoutParams f0(String str, View view, com.facebook.imagepipeline.image.f fVar) {
        if (fVar != null) {
            int width = fVar.getWidth();
            int height = fVar.getHeight();
            Resources resources = view.getContext().getResources();
            int dimensionPixelSize = resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2);
            float f5 = (height * 1.0f) / width;
            int i4 = (int) (dimensionPixelSize * 1.0f * f5);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = i4;
            com.join.mgps.Util.w0.e(this.f40725d + "setPostImageParam-->rawHeight=" + height + " rawWidth=" + width + " ratio=" + f5 + " itemHeight=" + i4 + " itemWidth=" + dimensionPixelSize + "\n" + str);
            view.setMinimumHeight(0);
            view.setLayoutParams(layoutParams);
            return layoutParams;
        }
        return null;
    }

    private void g0(View view, CharSequence charSequence) {
        if (view == null) {
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        } else if (view instanceof Button) {
            ((Button) view).setText(charSequence);
        }
    }

    private void h0(View view, int i4) {
        if (view == null) {
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(i4);
        } else if (view instanceof Button) {
            ((Button) view).setTextColor(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(View view, z.a aVar) {
        if (aVar == null) {
            return;
        }
        t tVar = this.f40734m;
        if (tVar != null && tVar.isShowing()) {
            this.f40734m.dismiss();
        }
        if (this.f40734m == null) {
            this.f40734m = new t(this.f40727f);
        }
        this.f40734m.f(aVar.f40831c);
        this.f40734m.h(aVar.f40833e);
        int dimension = (int) this.f40727f.getResources().getDimension(R.dimen.wdp378);
        int dimension2 = (int) this.f40727f.getResources().getDimension(R.dimen.wdp89);
        int dimension3 = (int) this.f40727f.getResources().getDimension(R.dimen.wdp72);
        if (aVar.f40840l) {
            this.f40734m.getContentView().findViewById(R.id.resolve).setVisibility(0);
            this.f40734m.getContentView().findViewById(R.id.v_resolve).setVisibility(0);
        } else {
            this.f40734m.getContentView().findViewById(R.id.resolve).setVisibility(8);
            this.f40734m.getContentView().findViewById(R.id.v_resolve).setVisibility(8);
            dimension -= dimension3;
        }
        if (aVar.f40841m) {
            this.f40734m.getContentView().findViewById(R.id.report).setVisibility(0);
            this.f40734m.getContentView().findViewById(R.id.v_report).setVisibility(0);
        } else {
            this.f40734m.getContentView().findViewById(R.id.report).setVisibility(8);
            this.f40734m.getContentView().findViewById(R.id.v_report).setVisibility(8);
            dimension -= dimension3;
        }
        if (aVar.f40842n) {
            this.f40734m.getContentView().findViewById(R.id.delete).setVisibility(0);
            this.f40734m.getContentView().findViewById(R.id.v_delete).setVisibility(0);
        } else {
            this.f40734m.getContentView().findViewById(R.id.delete).setVisibility(8);
            this.f40734m.getContentView().findViewById(R.id.v_delete).setVisibility(8);
            dimension -= dimension3;
        }
        this.f40734m.setWidth(dimension);
        int width = this.f40734m.getWidth();
        int height = this.f40734m.getHeight();
        int i4 = -width;
        if (height != 0) {
            dimension2 = height;
        }
        this.f40734m.showAsDropDown(view, i4, -((dimension2 / 2) + (view.getMeasuredHeight() / 2)));
        this.f40734m.setTouchInterceptor(new r(view));
    }

    private void k0(BaseViewHolder baseViewHolder, int i4) {
        if (i4 == 0) {
            baseViewHolder.setGone(R.id.linearLayout2, false);
            baseViewHolder.setGone(R.id.progressBar, false);
            baseViewHolder.setGone(R.id.progressBarZip, false);
            baseViewHolder.setGone(R.id.tipsLayout, true);
            baseViewHolder.setGone(R.id.mgListviewItemDescribe, true);
            return;
        }
        baseViewHolder.setGone(R.id.linearLayout2, true);
        if (i4 == 17) {
            baseViewHolder.setGone(R.id.progressBar, false);
            baseViewHolder.setGone(R.id.progressBarZip, true);
        } else {
            baseViewHolder.setGone(R.id.progressBar, true);
            baseViewHolder.setGone(R.id.progressBarZip, false);
        }
        baseViewHolder.setGone(R.id.tipsLayout, false);
        baseViewHolder.setGone(R.id.mgListviewItemDescribe, false);
    }

    private void p(BaseViewHolder baseViewHolder, z zVar) {
        String string;
        try {
            z.a aVar = (z.a) zVar.a();
            if (aVar == null) {
                return;
            }
            baseViewHolder.setGone(R.id.divider, aVar.f40829a);
            try {
                ((VipView) baseViewHolder.getView(R.id.vipFlag)).setVipData(aVar.f40843o, aVar.f40844p);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            baseViewHolder.setGone(R.id.flagBestAnswer, aVar.f40839k == 1);
            baseViewHolder.setText(R.id.comment_nickname, aVar.f40833e);
            baseViewHolder.setText(R.id.comment_add_time, com.join.android.app.common.utils.g.a(aVar.f40834f * 1000));
            MyImageLoader.x((SimpleDraweeView) baseViewHolder.getView(R.id.comment_avatar_src), aVar.f40832d);
            baseViewHolder.getView(R.id.comment_avatar_src).setOnClickListener(new k(aVar));
            baseViewHolder.setGone(R.id.forum_post_host, aVar.f40835g);
            baseViewHolder.setGone(R.id.isOfficial, aVar.f40838j);
            if (aVar.f40837i) {
                baseViewHolder.setTextColor(R.id.comment_nickname, this.f40727f.getResources().getColor(R.color.app_blue_color));
                baseViewHolder.setGone(R.id.forum_post_moderator, true);
            } else {
                UtilsMy.A3(this.f40727f, (TextView) baseViewHolder.getView(R.id.comment_nickname), aVar.f40843o, aVar.f40844p, R.color.forum_nickname_color);
                baseViewHolder.setGone(R.id.forum_post_moderator, false);
            }
            baseViewHolder.setGone(R.id.moderator, aVar.f40845q);
            if (!TextUtils.isEmpty(aVar.f40846r)) {
                baseViewHolder.setGone(R.id.member_honor, true);
                baseViewHolder.setText(R.id.member_honor, aVar.f40846r);
            } else {
                baseViewHolder.setGone(R.id.member_honor, false);
            }
            int i4 = aVar.f40836h;
            if (i4 == 1) {
                string = this.f40727f.getResources().getString(R.string.comment_item_floor_1st);
            } else if (i4 == 2) {
                string = this.f40727f.getResources().getString(R.string.comment_item_floor_2nd);
            } else {
                string = this.f40727f.getResources().getString(R.string.comment_item_floor, Integer.valueOf(aVar.f40836h));
            }
            baseViewHolder.setText(R.id.comment_floor, string);
            W(baseViewHolder.itemView);
            V(baseViewHolder.getView(R.id.comment_reply), aVar);
            com.join.mgps.Util.j0.S0(baseViewHolder.getView(R.id.comment_avatar_src), baseViewHolder.getView(R.id.comment_nickname), baseViewHolder.getView(R.id.comment_add_time));
            com.join.mgps.Util.j0.U0(baseViewHolder.getView(R.id.vipFlag));
            e0(baseViewHolder.getView(R.id.comment_avatar_src), aVar.f40830b);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private void q(BaseViewHolder baseViewHolder, z zVar) {
        try {
            z.b bVar = (z.b) zVar.a();
            if (bVar == null || baseViewHolder.getView(R.id.comment_img) == null) {
                return;
            }
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) baseViewHolder.getView(R.id.comment_img);
            N(this.f40727f, bVar.f40849c.get(bVar.f40848b));
            y C = C(bVar.f40847a);
            if (C != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C.f40824a, C.f40825b);
                int i4 = (int) (4 * this.f40727f.getResources().getDisplayMetrics().density);
                layoutParams.setMargins(0, i4, 0, i4);
                simpleDraweeView.setLayoutParams(layoutParams);
                MyImageLoader.h(simpleDraweeView, bVar.f40847a);
            } else {
                J(simpleDraweeView, bVar.f40847a);
            }
            com.join.mgps.Util.j0.C1(simpleDraweeView, bVar.f40848b, bVar.f40849c);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void r(BaseViewHolder baseViewHolder, z zVar) {
        try {
            z.d dVar = (z.d) zVar.a();
            if (dVar != null && dVar.f40857b != null) {
                baseViewHolder.setGone(R.id.comment_reply_divider, dVar.f40859d);
                if (!dVar.f40863h) {
                    baseViewHolder.setGone(R.id.line, true);
                    baseViewHolder.setGone(R.id.bottom, true);
                } else {
                    baseViewHolder.setGone(R.id.line, false);
                    baseViewHolder.setGone(R.id.bottom, false);
                }
                List<ForumBean.ForumCommentReplyBean> reply_list = dVar.f40857b.getReply_list();
                if (reply_list != null && reply_list.size() != 0) {
                    O(baseViewHolder.getView(R.id.comment_reply_container), dVar, true, baseViewHolder.getLayoutPosition());
                } else {
                    ((LinearLayout) baseViewHolder.getView(R.id.comment_reply_container)).removeAllViews();
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void s(BaseViewHolder baseViewHolder, z zVar) {
        try {
            z.c cVar = (z.c) zVar.a();
            if (cVar == null) {
                return;
            }
            baseViewHolder.setText(R.id.comment_message, cVar.f40851b);
            I((TextView) baseViewHolder.getView(R.id.comment_message));
            W(baseViewHolder.itemView);
            U(baseViewHolder.getView(R.id.comment_message), cVar);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void t(BaseViewHolder baseViewHolder, z zVar) {
        if (zVar == null) {
            return;
        }
        try {
            z.f fVar = (z.f) zVar.a();
            baseViewHolder.setBackgroundColor(R.id.v_view, fVar.f40865b);
            baseViewHolder.getView(R.id.v_view).setLayoutParams(new ViewGroup.LayoutParams(-1, fVar.f40864a));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void u(BaseViewHolder baseViewHolder, z zVar) {
        try {
            z.g gVar = (z.g) zVar.a();
            if (gVar == null) {
                return;
            }
            if (this.f40728g == null) {
                this.f40728g = new x(this.f40727f);
            }
            this.f40728g.d(gVar.f40867b);
            this.f40728g.e(gVar.f40868c);
            this.f40728g.c().clear();
            this.f40728g.c().addAll(gVar.f40866a);
            ((HListView) baseViewHolder.getView(R.id.list)).setAdapter((ListAdapter) this.f40728g);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean v(PopupWindow popupWindow, MotionEvent motionEvent) {
        View contentView;
        if (popupWindow == null || motionEvent == null || (contentView = popupWindow.getContentView()) == null) {
            return false;
        }
        return !w(contentView, motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w(View view, MotionEvent motionEvent) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        return iArr[0] < rawX && iArr[1] < rawY && rawX < iArr[0] + view.getWidth() && rawY < iArr[1] + view.getHeight();
    }

    BitmapFactory.Options B(String str) {
        return null;
    }

    y C(String str) {
        Hashtable<String, y> hashtable = this.f40733l;
        if (hashtable == null) {
            return null;
        }
        return hashtable.get(str);
    }

    public com.danikula.videocache.i F(Context context) {
        return MApplication.m(context);
    }

    LinearLayout.LayoutParams G() {
        DisplayMetrics displayMetrics = this.f40727f.getResources().getDisplayMetrics();
        float f5 = displayMetrics.density;
        int i4 = (int) (210.0f * f5);
        int i5 = (int) (160.0f * f5);
        int dimensionPixelSize = ((int) ((displayMetrics.widthPixels - (this.f40727f.getResources().getDimensionPixelSize(R.dimen.mg_forum_forums_item_padding) * 2)) - ((((int) (6.0f * f5)) * f5) * 2.0f))) / 3;
        if (dimensionPixelSize <= i4) {
            i4 = dimensionPixelSize > i5 ? i5 : dimensionPixelSize;
        }
        return new LinearLayout.LayoutParams(i4, i4);
    }

    public void J(SimpleDraweeView simpleDraweeView, String str) {
        try {
            simpleDraweeView.getHierarchy().H(R.drawable.main_normal_icon);
            simpleDraweeView.setController(Fresco.newDraweeControllerBuilder().H(new q(simpleDraweeView)).a(MyImageLoader.H(str)).build());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void K(SimpleDraweeView simpleDraweeView, String str) {
        try {
            simpleDraweeView.getHierarchy().H(R.drawable.main_normal_icon);
            simpleDraweeView.setController(Fresco.newDraweeControllerBuilder().H(new p(simpleDraweeView)).a(MyImageLoader.H(str)).build());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void M(Context context, String str) {
        Integer[] i02 = com.join.mgps.Util.j0.i0(str);
        if (i02 != null) {
            y yVar = new y();
            int intValue = i02[0].intValue();
            int intValue2 = i02[1].intValue();
            Resources resources = context.getResources();
            int dimensionPixelSize = resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2);
            yVar.f40824a = dimensionPixelSize;
            yVar.f40825b = (int) (dimensionPixelSize * 1.0f * ((intValue2 * 1.0f) / intValue));
            o(str, yVar);
        }
    }

    LinearLayout.LayoutParams Q(String str, View view, com.facebook.imagepipeline.image.f fVar) {
        if (fVar != null) {
            int width = fVar.getWidth();
            int height = fVar.getHeight();
            Context context = view.getContext();
            Resources resources = context.getResources();
            int i4 = resources.getDisplayMetrics().widthPixels;
            float f5 = context.getResources().getDisplayMetrics().density;
            int dimensionPixelSize = (int) ((i4 - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) - (40 * f5));
            int i5 = (int) (4 * f5);
            float f6 = (height * 1.0f) / width;
            int i6 = (int) (dimensionPixelSize * 1.0f * f6);
            com.join.mgps.Util.w0.e(this.f40725d + "setCommentImageItemParams-->rawHeight=" + height + " rawWidth=" + width + " ratio=" + f6 + " itemHeight=" + i6 + " itemWidth=" + dimensionPixelSize + "\n" + str);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, i6);
            layoutParams.setMargins(0, i5, 0, i5);
            view.setLayoutParams(layoutParams);
            return layoutParams;
        }
        return null;
    }

    void R(z zVar, boolean z4) {
        if (zVar == null) {
            return;
        }
        try {
            ((z.d) zVar.a()).f40863h = z4;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void T(w wVar) {
        this.f40737p = wVar;
    }

    public void U(View view, z.c cVar) {
        view.setOnLongClickListener(new c(cVar));
    }

    public void V(View view, z.a aVar) {
        view.setOnClickListener(new b(aVar));
    }

    public void W(View view) {
        view.setOnClickListener(new a());
    }

    public void X(View view, boolean z4, boolean z5, int i4, int i5, String str, String str2) {
        view.setOnLongClickListener(new e(i4, z4, z5, i5, str, str2));
    }

    public void Y(View view, int i4, int i5, String str) {
        com.join.mgps.Util.w0.e("setOnCommentReplyReply", "cid=" + i4 + " rid=" + i5 + " rNickname=" + str);
        view.setOnClickListener(new d(i4, i5, str));
    }

    public void Z(View view, int i4) {
        view.setOnClickListener(new s(i4));
    }

    public void d0(View view, String str, String str2) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new h(str2));
    }

    void i0(View view, int i4, boolean z4, boolean z5, int i5, int i6, String str, String str2) {
        if (this.f40736o == null) {
            this.f40736o = new v(this.f40727f);
        }
        this.f40736o.q(i5);
        this.f40736o.A(i6);
        this.f40736o.x(str2);
        this.f40736o.w(i4);
        this.f40736o.t(0);
        if (z4) {
            this.f40736o.v(0);
        } else {
            this.f40736o.v(8);
        }
        if (z5) {
            this.f40736o.z(0);
        } else {
            this.f40736o.z(8);
        }
        if (com.join.mgps.Util.g2.h(str)) {
            str = "";
        }
        this.f40736o.y(str);
        this.f40736o.showAsDropDown(view);
    }

    void o(String str, y yVar) {
        if (this.f40733l == null) {
            this.f40733l = new Hashtable<>();
        }
        this.f40733l.put(str, yVar);
    }

    public void x() {
        Hashtable<String, y> hashtable = this.f40733l;
        if (hashtable != null) {
            hashtable.clear();
            System.gc();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: y */
    public void convert(@NonNull BaseViewHolder baseViewHolder, z zVar) {
        int itemType = zVar.getItemType();
        if (itemType == ViewType.COMMENT_HEADER.ordinal()) {
            p(baseViewHolder, zVar);
        } else if (itemType == ViewType.COMMENT_MESSAGE.ordinal()) {
            s(baseViewHolder, zVar);
        } else if (itemType == ViewType.COMMENT_IMAGE.ordinal()) {
            q(baseViewHolder, zVar);
        } else if (itemType == ViewType.COMMENT_MESSAGE_REPLY.ordinal()) {
            r(baseViewHolder, zVar);
        } else if (itemType == ViewType.EMPLOYEE_TAGS.ordinal()) {
            u(baseViewHolder, zVar);
        } else if (itemType == ViewType.DIVIDER.ordinal()) {
            t(baseViewHolder, zVar);
        }
    }

    z z(int i4, ForumBean.ForumCommentBean forumCommentBean, int i5, boolean z4, boolean z5) {
        return new z(ViewType.COMMENT_MESSAGE_REPLY, new z.d(i4, forumCommentBean, i5, z4, z5));
    }

    /* loaded from: classes4.dex */
    public static class x extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private final Context f40816b;

        /* renamed from: c  reason: collision with root package name */
        private List<RecommendLabelTag> f40817c;

        /* renamed from: d  reason: collision with root package name */
        private int f40818d;

        /* renamed from: e  reason: collision with root package name */
        private String f40819e;

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ RecommendLabelTag f40820b;

            a(RecommendLabelTag recommendLabelTag) {
                this.f40820b = recommendLabelTag;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IntentUtil.getInstance().goMainLabelActivity(view.getContext(), this.f40820b.getTag_id(), x.this.f40818d, x.this.f40819e);
            }
        }

        /* loaded from: classes4.dex */
        class b {

            /* renamed from: a  reason: collision with root package name */
            TextView f40822a;

            b() {
            }
        }

        public x(Context context, List<RecommendLabelTag> list) {
            this.f40816b = context;
            this.f40817c = list;
        }

        public List<RecommendLabelTag> c() {
            return this.f40817c;
        }

        public void d(int i4) {
            this.f40818d = i4;
        }

        public void e(String str) {
            this.f40819e = str;
        }

        public void f(List<RecommendLabelTag> list) {
            this.f40817c = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<RecommendLabelTag> list = this.f40817c;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            List<RecommendLabelTag> list = this.f40817c;
            if (list == null || i4 >= list.size()) {
                return null;
            }
            return this.f40817c.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            View view2;
            b bVar;
            RecommendLabelTag recommendLabelTag;
            if (view == null) {
                bVar = new b();
                view2 = LayoutInflater.from(this.f40816b).inflate(R.layout.forum_group_tag_detail_item, (ViewGroup) null);
                bVar.f40822a = (TextView) view2.findViewById(R.id.tagTv);
                view2.setTag(bVar);
            } else {
                view2 = view;
                bVar = (b) view.getTag();
            }
            if (bVar.f40822a != null && (recommendLabelTag = (RecommendLabelTag) getItem(i4)) != null) {
                TextView textView = bVar.f40822a;
                textView.setText("#" + recommendLabelTag.getTag_name());
                bVar.f40822a.setOnClickListener(new a(recommendLabelTag));
            }
            return view2;
        }

        public x(Context context) {
            this.f40816b = context;
            this.f40817c = new ArrayList();
        }
    }
}
