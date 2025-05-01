package com.join.mgps.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.CommentSelfListActivity_;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.ForumBean;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
/* loaded from: classes4.dex */
public class ForumProfileMessageReplyAdapter extends BaseAdapter {

    /* renamed from: c  reason: collision with root package name */
    private Context f41653c;

    /* renamed from: e  reason: collision with root package name */
    LinearLayout.LayoutParams f41655e;

    /* renamed from: g  reason: collision with root package name */
    n f41657g;

    /* renamed from: h  reason: collision with root package name */
    Hashtable<String, p> f41658h;

    /* renamed from: b  reason: collision with root package name */
    private String f41652b = "ForumProfileMessageReplyAdapter";

    /* renamed from: f  reason: collision with root package name */
    private o f41656f = null;

    /* renamed from: d  reason: collision with root package name */
    private List<u> f41654d = new ArrayList();

    /* loaded from: classes4.dex */
    public enum ViewType {
        PROFILE_HEADER,
        PROFILE_MESSAGE_ITEM,
        PROFILE_COMMENT_IMAGE,
        PROFILE_MESSAGE_REPLY_ITEM
    }

    /* loaded from: classes4.dex */
    class a implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41659b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41660c;

        a(int i4, int i5) {
            this.f41659b = i4;
            this.f41660c = i5;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (ForumProfileMessageReplyAdapter.this.f41656f != null) {
                ForumProfileMessageReplyAdapter.this.f41656f.e(view, this.f41659b, this.f41660c);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41662b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41663c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f41664d;

        b(int i4, int i5, String str) {
            this.f41662b = i4;
            this.f41663c = i5;
            this.f41664d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumProfileMessageReplyAdapter.this.f41656f != null) {
                ForumProfileMessageReplyAdapter.this.f41656f.c(this.f41662b, this.f41663c, this.f41664d);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41666b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41667c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f41668d;

        c(int i4, int i5, int i6) {
            this.f41666b = i4;
            this.f41667c = i5;
            this.f41668d = i6;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (ForumProfileMessageReplyAdapter.this.f41656f != null) {
                ForumProfileMessageReplyAdapter.this.f41656f.l(view, this.f41666b, this.f41667c, this.f41668d);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41670b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f41671c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f41672d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f41673e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f41674f;

        d(int i4, boolean z4, boolean z5, int i5, String str) {
            this.f41670b = i4;
            this.f41671c = z4;
            this.f41672d = z5;
            this.f41673e = i5;
            this.f41674f = str;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (ForumProfileMessageReplyAdapter.this.f41656f != null) {
                ForumProfileMessageReplyAdapter.this.f41656f.i(view, this.f41670b);
            }
            ForumProfileMessageReplyAdapter.this.D(view, 2, this.f41671c, this.f41672d, this.f41670b, this.f41673e, this.f41674f);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u.b f41676b;

        e(u.b bVar) {
            this.f41676b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(this.f41676b.f41749f).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41678b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41679c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f41680d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ u.d f41681e;

        f(int i4, int i5, int i6, u.d dVar) {
            this.f41678b = i4;
            this.f41679c = i5;
            this.f41680d = i6;
            this.f41681e = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f41678b == 0) {
                return;
            }
            ForumBean.ForumCommentBean forumCommentBean = new ForumBean.ForumCommentBean();
            ArrayList arrayList = new ArrayList();
            for (int i4 = this.f41678b; i4 >= 0; i4--) {
                u uVar = (u) ForumProfileMessageReplyAdapter.this.f41654d.get(this.f41679c - i4);
                u.d dVar = uVar.b() == ViewType.PROFILE_MESSAGE_REPLY_ITEM ? (u.d) uVar.a() : null;
                if (dVar != null && this.f41680d == dVar.f41755a) {
                    arrayList.addAll(dVar.f41756b.getReply_list());
                }
            }
            for (int i5 = 0; i5 <= this.f41678b; i5++) {
                ForumProfileMessageReplyAdapter.this.f41654d.remove(this.f41679c - i5);
            }
            forumCommentBean.setReply_list(arrayList);
            ForumProfileMessageReplyAdapter.this.f41654d.add(this.f41679c - this.f41678b, ForumProfileMessageReplyAdapter.this.g(this.f41680d, forumCommentBean, this.f41681e.f41757c, true));
            ForumProfileMessageReplyAdapter.this.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41683b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ForumBean.ForumCommentBean f41684c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f41685d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ u.d f41686e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f41687f;

        g(int i4, ForumBean.ForumCommentBean forumCommentBean, int i5, u.d dVar, int i6) {
            this.f41683b = i4;
            this.f41684c = forumCommentBean;
            this.f41685d = i5;
            this.f41686e = dVar;
            this.f41687f = i6;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4 = 0;
            int i5 = 0;
            boolean z4 = false;
            while (i4 < this.f41683b) {
                ForumBean.ForumCommentBean forumCommentBean = new ForumBean.ForumCommentBean(this.f41684c);
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
                u g4 = ForumProfileMessageReplyAdapter.this.g(this.f41685d, forumCommentBean, this.f41686e.f41757c, i5 == 0);
                u.d dVar = (u.d) g4.a();
                dVar.f41759e = i5;
                dVar.f41760f = z4;
                dVar.f41761g = i5 == 0;
                ForumProfileMessageReplyAdapter.this.t(g4, !z4);
                ForumProfileMessageReplyAdapter.this.f41654d.add(this.f41687f + i5 + 1, g4);
                i5++;
                i4 = i6;
            }
            ForumProfileMessageReplyAdapter.this.f41654d.remove(this.f41687f);
            ForumProfileMessageReplyAdapter.this.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f41689b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u.d f41690c;

        h(View view, u.d dVar) {
            this.f41689b = view;
            this.f41690c = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumProfileMessageReplyAdapter.this.q(this.f41689b, this.f41690c, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f41692b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u.d f41693c;

        i(View view, u.d dVar) {
            this.f41692b = view;
            this.f41693c = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumProfileMessageReplyAdapter.this.q(this.f41692b, this.f41693c, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements com.facebook.drawee.controller.c<com.facebook.imagepipeline.image.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SimpleDraweeView f41695a;

        j(SimpleDraweeView simpleDraweeView) {
            this.f41695a = simpleDraweeView;
        }

        @Override // com.facebook.drawee.controller.c
        /* renamed from: a */
        public void onFinalImageSet(String str, com.facebook.imagepipeline.image.f fVar, Animatable animatable) {
            try {
                ForumProfileMessageReplyAdapter.this.s(str, this.f41695a, fVar);
                if (fVar != null) {
                    p pVar = new p();
                    pVar.f41716a = fVar.getWidth();
                    pVar.f41717b = fVar.getHeight();
                    ForumProfileMessageReplyAdapter.this.e(str, pVar);
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
            SimpleDraweeView simpleDraweeView = this.f41695a;
            simpleDraweeView.setLayoutParams(ForumProfileMessageReplyAdapter.this.h(simpleDraweeView.getContext()));
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41697b;

        k(int i4) {
            this.f41697b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumProfileMessageReplyAdapter.this.f41656f != null) {
                ForumProfileMessageReplyAdapter.this.f41656f.b(this.f41697b);
            }
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumProfileMessageReplyAdapter.this.f41656f != null) {
                ForumProfileMessageReplyAdapter.this.f41656f.m();
            }
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41700b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f41701c;

        m(int i4, String str) {
            this.f41700b = i4;
            this.f41701c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumProfileMessageReplyAdapter.this.f41656f != null) {
                ForumProfileMessageReplyAdapter.this.f41656f.h(this.f41700b, this.f41701c);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class n extends com.join.mgps.customview.e implements View.OnClickListener {

        /* renamed from: n  reason: collision with root package name */
        public static final int f41703n = 1;

        /* renamed from: o  reason: collision with root package name */
        public static final int f41704o = 2;

        /* renamed from: p  reason: collision with root package name */
        public static final int f41705p = 3;

        /* renamed from: d  reason: collision with root package name */
        View f41706d;

        /* renamed from: e  reason: collision with root package name */
        View f41707e;

        /* renamed from: f  reason: collision with root package name */
        View f41708f;

        /* renamed from: g  reason: collision with root package name */
        View f41709g;

        /* renamed from: h  reason: collision with root package name */
        View f41710h;

        /* renamed from: i  reason: collision with root package name */
        int f41711i;

        /* renamed from: j  reason: collision with root package name */
        int f41712j;

        /* renamed from: k  reason: collision with root package name */
        String f41713k;

        /* renamed from: l  reason: collision with root package name */
        int f41714l;

        public n(Context context) {
            super(context);
            c();
            i();
        }

        private void i() {
            View inflate = LayoutInflater.from(this.f48455b).inflate(R.layout.mg_forum_popupwindow_layout, (ViewGroup) null);
            this.f41706d = inflate.findViewById(R.id.btn_forum_comment_delete);
            this.f41707e = inflate.findViewById(R.id.divider_forum_comment_1);
            this.f41708f = inflate.findViewById(R.id.btn_forum_comment);
            this.f41709g = inflate.findViewById(R.id.divider_2);
            this.f41710h = inflate.findViewById(R.id.btn_forum_report);
            this.f41706d.setOnClickListener(this);
            this.f41708f.setOnClickListener(this);
            this.f41710h.setOnClickListener(this);
            setContentView(inflate);
            setWidth(-2);
            setHeight(-2);
        }

        void c() {
            setAnimationStyle(0);
            setFocusable(false);
        }

        public int d() {
            return this.f41711i;
        }

        @Override // com.join.mgps.customview.e, android.widget.PopupWindow
        public void dismiss() {
            super.dismiss();
            this.f41711i = 0;
            this.f41712j = 0;
            this.f41713k = "";
        }

        public View e() {
            return this.f41706d;
        }

        public int f() {
            return this.f41714l;
        }

        public String g() {
            return this.f41713k;
        }

        public int h() {
            return this.f41712j;
        }

        void j() {
            if (ForumProfileMessageReplyAdapter.this.f41656f == null) {
                return;
            }
            int i4 = this.f41714l;
            if (i4 == 1) {
                ForumProfileMessageReplyAdapter.this.f41656f.h(this.f41711i, this.f41713k);
            } else if (i4 == 2) {
                ForumProfileMessageReplyAdapter.this.f41656f.k(this.f41711i, this.f41712j, this.f41713k);
            }
        }

        void k() {
            if (ForumProfileMessageReplyAdapter.this.f41656f == null) {
                return;
            }
            int i4 = this.f41714l;
            if (i4 == 1) {
                ForumProfileMessageReplyAdapter.this.f41656f.d(this.f41711i);
            } else if (i4 == 2) {
                ForumProfileMessageReplyAdapter.this.f41656f.g(this.f41712j);
            }
        }

        void l() {
            if (ForumProfileMessageReplyAdapter.this.f41656f == null) {
                return;
            }
            int i4 = this.f41714l;
            if (i4 == 1) {
                ForumProfileMessageReplyAdapter.this.f41656f.j(this.f41711i);
            } else if (i4 == 2) {
                ForumProfileMessageReplyAdapter.this.f41656f.f(this.f41712j);
            }
        }

        public void m() {
            View view = this.f41706d;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f41708f;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.f41710h;
            if (view3 != null) {
                view3.setVisibility(0);
            }
        }

        public void n(int i4) {
            this.f41711i = i4;
        }

        public void o(int i4) {
            View view = this.f41708f;
            if (view != null) {
                view.setVisibility(i4);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_forum_comment /* 2131296846 */:
                    j();
                    break;
                case R.id.btn_forum_comment_delete /* 2131296848 */:
                    k();
                    break;
                case R.id.btn_forum_report /* 2131296849 */:
                    l();
                    break;
            }
            dismiss();
        }

        public void p(View view) {
            this.f41706d = view;
        }

        public void q(int i4) {
            View view = this.f41706d;
            if (view != null) {
                view.setVisibility(i4);
            }
            if (i4 == 0) {
                this.f41707e.setVisibility(0);
            } else {
                this.f41707e.setVisibility(8);
            }
        }

        public void r(int i4) {
            this.f41714l = i4;
        }

        public void s(String str) {
            this.f41713k = str;
        }

        @Override // com.join.mgps.customview.e, android.widget.PopupWindow
        public void showAsDropDown(View view) {
            showAsDropDown(view, 0, (view.getMeasuredHeight() * (-1)) - this.f48455b.getResources().getDimensionPixelSize(R.dimen.mg_forum_popupwindow_height));
            b();
        }

        void t(int i4) {
            View view = this.f41710h;
            if (view != null) {
                view.setVisibility(i4);
            }
            if (i4 == 0) {
                this.f41709g.setVisibility(0);
            } else {
                this.f41709g.setVisibility(8);
            }
        }

        public void u(int i4) {
            this.f41712j = i4;
        }
    }

    /* loaded from: classes4.dex */
    public interface o {
        void a(int i4);

        void b(int i4);

        void c(int i4, int i5, String str);

        void d(int i4);

        void e(View view, int i4, int i5);

        void f(int i4);

        void g(int i4);

        void h(int i4, String str);

        void i(View view, int i4);

        void j(int i4);

        void k(int i4, int i5, String str);

        void l(View view, int i4, int i5, int i6);

        void m();
    }

    /* loaded from: classes4.dex */
    public class p {

        /* renamed from: a  reason: collision with root package name */
        public int f41716a;

        /* renamed from: b  reason: collision with root package name */
        public int f41717b;

        public p() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q extends v {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f41719b;

        q() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r extends v {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f41721b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41722c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f41723d;

        /* renamed from: e  reason: collision with root package name */
        public View f41724e;

        /* renamed from: f  reason: collision with root package name */
        public LinearLayout f41725f;

        /* renamed from: g  reason: collision with root package name */
        public ImageView f41726g;

        /* renamed from: h  reason: collision with root package name */
        public VipView f41727h;

        r() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s extends v {

        /* renamed from: b  reason: collision with root package name */
        public TextView f41729b;

        /* renamed from: c  reason: collision with root package name */
        public View f41730c;

        s() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class t extends v {

        /* renamed from: b  reason: collision with root package name */
        public LinearLayout f41732b;

        /* renamed from: c  reason: collision with root package name */
        public View f41733c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f41734d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f41735e;

        /* renamed from: f  reason: collision with root package name */
        public View f41736f;

        /* renamed from: g  reason: collision with root package name */
        public View f41737g;

        t() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public static class u {

        /* renamed from: a  reason: collision with root package name */
        ViewType f41739a;

        /* renamed from: b  reason: collision with root package name */
        Object f41740b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public String f41741a;

            /* renamed from: b  reason: collision with root package name */
            int f41742b;

            /* renamed from: c  reason: collision with root package name */
            List<String> f41743c;

            public a() {
            }

            public a(String str, int i4, List<String> list) {
                this.f41741a = str;
                this.f41742b = i4;
                this.f41743c = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41744a;

            /* renamed from: b  reason: collision with root package name */
            public String f41745b;

            /* renamed from: c  reason: collision with root package name */
            public String f41746c;

            /* renamed from: d  reason: collision with root package name */
            public long f41747d;

            /* renamed from: e  reason: collision with root package name */
            public int f41748e;

            /* renamed from: f  reason: collision with root package name */
            public int f41749f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f41750g;

            /* renamed from: h  reason: collision with root package name */
            public int f41751h;

            /* renamed from: i  reason: collision with root package name */
            public int f41752i;

            public b() {
            }

            public b(boolean z4, String str, String str2, long j4, int i4, boolean z5, int i5, int i6, int i7) {
                this.f41744a = z4;
                this.f41745b = str;
                this.f41746c = str2;
                this.f41747d = j4;
                this.f41748e = i4;
                this.f41749f = i7;
                this.f41750g = z5;
                this.f41751h = i5;
                this.f41752i = i6;
            }
        }

        /* loaded from: classes4.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f41753a;

            /* renamed from: b  reason: collision with root package name */
            public String f41754b;

            public c() {
            }

            public c(int i4, String str) {
                this.f41753a = i4;
                this.f41754b = str;
            }
        }

        public u() {
        }

        public Object a() {
            return this.f41740b;
        }

        public ViewType b() {
            return this.f41739a;
        }

        public void c(Object obj) {
            this.f41740b = obj;
        }

        public void d(ViewType viewType) {
            this.f41739a = viewType;
        }

        public u(ViewType viewType, Object obj) {
            this.f41739a = viewType;
            this.f41740b = obj;
        }

        /* loaded from: classes4.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f41755a;

            /* renamed from: b  reason: collision with root package name */
            public ForumBean.ForumCommentBean f41756b;

            /* renamed from: c  reason: collision with root package name */
            public int f41757c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f41758d;

            /* renamed from: e  reason: collision with root package name */
            public int f41759e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f41760f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f41761g;

            public d(int i4, ForumBean.ForumCommentBean forumCommentBean, int i5) {
                this.f41755a = i4;
                this.f41756b = forumCommentBean;
                this.f41757c = i5;
            }

            public d(int i4, ForumBean.ForumCommentBean forumCommentBean, int i5, boolean z4) {
                this.f41755a = i4;
                this.f41756b = forumCommentBean;
                this.f41757c = i5;
                this.f41761g = z4;
            }
        }
    }

    /* loaded from: classes4.dex */
    class v {
        v() {
        }
    }

    public ForumProfileMessageReplyAdapter(Context context) {
        this.f41653c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LinearLayout.LayoutParams h(Context context) {
        if (context == null) {
            return null;
        }
        if (this.f41655e == null) {
            Resources resources = context.getResources();
            int i4 = resources.getDisplayMetrics().widthPixels;
            float f5 = context.getResources().getDisplayMetrics().density;
            int dimensionPixelSize = (int) ((i4 - resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding)) - (30 * f5));
            int i5 = (int) (4 * f5);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, (int) ((dimensionPixelSize * 1.0f) / 1.5f));
            layoutParams.setMargins(0, i5, 0, i5);
            this.f41655e = layoutParams;
        }
        return this.f41655e;
    }

    private View k(int i4, View view, ViewGroup viewGroup) {
        q qVar;
        SimpleDraweeView simpleDraweeView;
        if (view != null) {
            qVar = (q) view.getTag();
        } else {
            qVar = new q();
            view = LayoutInflater.from(this.f41653c).inflate(R.layout.mg_profile_comment_image, (ViewGroup) null);
            qVar.f41719b = (SimpleDraweeView) view.findViewById(R.id.comment_img);
            view.setTag(qVar);
        }
        try {
            u.a aVar = (u.a) getItem(i4);
            if (aVar != null && (simpleDraweeView = qVar.f41719b) != null) {
                p(this.f41653c, aVar.f41743c.get(aVar.f41742b));
                p j4 = j(aVar.f41741a);
                if (j4 != null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(j4.f41716a, j4.f41717b);
                    int i5 = (int) (8 * this.f41653c.getResources().getDisplayMetrics().density);
                    layoutParams.setMargins(0, i5, 0, i5);
                    simpleDraweeView.setLayoutParams(layoutParams);
                    MyImageLoader.h(simpleDraweeView, aVar.f41741a);
                } else {
                    o(simpleDraweeView, aVar.f41741a);
                }
                com.join.mgps.Util.j0.C1(simpleDraweeView, aVar.f41742b, aVar.f41743c);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return view;
    }

    private View l(int i4, View view, ViewGroup viewGroup) {
        r rVar;
        u.b bVar;
        if (view != null) {
            rVar = (r) view.getTag();
        } else {
            rVar = new r();
            view = LayoutInflater.from(this.f41653c).inflate(R.layout.mg_forum_profile_reply_header, (ViewGroup) null);
            rVar.f41724e = view.findViewById(R.id.forum_post_divider);
            rVar.f41721b = (SimpleDraweeView) view.findViewById(R.id.forum_post_avatar_src);
            rVar.f41722c = (TextView) view.findViewById(R.id.forum_post_nickname);
            rVar.f41723d = (TextView) view.findViewById(R.id.forum_post_add_time);
            rVar.f41725f = (LinearLayout) view.findViewById(R.id.forum_post_func_container);
            rVar.f41726g = (ImageView) view.findViewById(R.id.forum_post_reply);
            rVar.f41727h = (VipView) view.findViewById(R.id.vipFlag);
            view.setTag(rVar);
        }
        try {
            bVar = (u.b) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (bVar == null) {
            return view;
        }
        try {
            UtilsMy.A3(this.f41653c, rVar.f41722c, bVar.f41751h, bVar.f41752i, R.color.forum_nickname_color);
            rVar.f41727h.setVipData(bVar.f41751h, bVar.f41752i);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        if (bVar.f41744a) {
            rVar.f41724e.setVisibility(8);
        } else {
            rVar.f41724e.setVisibility(0);
        }
        rVar.f41722c.setText(bVar.f41746c);
        rVar.f41723d.setText(com.join.android.app.common.utils.g.a(bVar.f41747d * 1000));
        MyImageLoader.x(rVar.f41721b, bVar.f41745b);
        rVar.f41721b.setOnClickListener(new e(bVar));
        com.join.mgps.Util.j0.S0(rVar.f41721b, rVar.f41722c, rVar.f41723d);
        com.join.mgps.Util.j0.U0(rVar.f41727h);
        return view;
    }

    private View m(int i4, View view, ViewGroup viewGroup) {
        s sVar;
        u.c cVar;
        if (view != null) {
            sVar = (s) view.getTag();
        } else {
            sVar = new s();
            view = LayoutInflater.from(this.f41653c).inflate(R.layout.mg_forum_profile_reply_message_item, (ViewGroup) null);
            sVar.f41729b = (TextView) view.findViewById(R.id.mg_forum_profile_message_tv);
            sVar.f41730c = view.findViewById(R.id.mg_forum_profile_message_divider);
            view.setTag(sVar);
        }
        try {
            cVar = (u.c) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (cVar == null) {
            return view;
        }
        sVar.f41730c.setVisibility(8);
        com.join.mgps.Util.j0.D1(sVar.f41729b, cVar.f41754b, "");
        return view;
    }

    private View n(int i4, View view, ViewGroup viewGroup) {
        t tVar;
        u.d dVar;
        try {
            if (view != null) {
                tVar = (t) view.getTag();
            } else {
                tVar = new t();
                view = LayoutInflater.from(this.f41653c).inflate(R.layout.mg_forum_profile_reply_message_reply_item, (ViewGroup) null);
                tVar.f41732b = (LinearLayout) view.findViewById(R.id.comment_reply_container);
                tVar.f41733c = view.findViewById(R.id.comment_reply_divider);
                tVar.f41734d = (TextView) view.findViewById(R.id.comment_reply_content);
                tVar.f41735e = (TextView) view.findViewById(R.id.comment_reply_more);
                tVar.f41736f = view.findViewById(R.id.line);
                tVar.f41737g = view.findViewById(R.id.bottom);
                view.setTag(tVar);
            }
            dVar = (u.d) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (dVar == null || dVar.f41756b == null) {
            return view;
        }
        if (dVar.f41761g) {
            tVar.f41733c.setVisibility(0);
        } else {
            tVar.f41733c.setVisibility(8);
        }
        if (!dVar.f41758d) {
            tVar.f41736f.setVisibility(0);
            tVar.f41737g.setVisibility(0);
        } else {
            tVar.f41736f.setVisibility(8);
            tVar.f41737g.setVisibility(8);
        }
        List<ForumBean.ForumCommentReplyBean> reply_list = dVar.f41756b.getReply_list();
        if (reply_list != null && reply_list.size() != 0) {
            r(tVar.f41732b, dVar, true, i4);
        } else {
            tVar.f41732b.removeAllViews();
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(View view, u.d dVar, boolean z4) {
        int i4 = dVar.f41755a;
        List<ForumBean.ForumCommentReplyBean> reply_list = dVar.f41756b.getReply_list();
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.removeAllViews();
        for (int i5 = 0; i5 < reply_list.size() + 1; i5++) {
            if (i5 <= Integer.MAX_VALUE || !z4) {
                View inflate = LayoutInflater.from(this.f41653c).inflate(R.layout.comment_reply_item, (ViewGroup) null);
                inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                TextView textView = (TextView) inflate.findViewById(R.id.comment_reply_content);
                TextView textView2 = (TextView) inflate.findViewById(R.id.comment_reply_more);
                int size = reply_list.size();
                if (i5 == size && size > Integer.MAX_VALUE) {
                    textView.setVisibility(8);
                    textView2.setVisibility(0);
                    textView2.setText("收起");
                    inflate.setOnClickListener(new h(view, dVar));
                } else if (i5 == Integer.MAX_VALUE && z4 && size > Integer.MAX_VALUE) {
                    textView.setVisibility(8);
                    textView2.setVisibility(0);
                    textView2.setText(textView2.getResources().getString(R.string.comment_item_content_more, Integer.valueOf(size - Integer.MAX_VALUE)));
                    inflate.setOnClickListener(new i(view, dVar));
                } else if (i5 < reply_list.size() && (i5 < Integer.MAX_VALUE || !z4)) {
                    ForumBean.ForumCommentReplyBean forumCommentReplyBean = reply_list.get(i5);
                    String nickname = forumCommentReplyBean.getNickname();
                    String rnickname = forumCommentReplyBean.getRnickname();
                    if (forumCommentReplyBean.getRrid() == 0) {
                        rnickname = "";
                    }
                    String message = forumCommentReplyBean.getMessage();
                    textView.setVisibility(0);
                    textView2.setVisibility(8);
                    com.join.mgps.Util.j0.u1(textView, nickname, rnickname, message);
                    int rid = forumCommentReplyBean.getRid();
                    int uid = forumCommentReplyBean.getUid();
                    String nickname2 = forumCommentReplyBean.getNickname();
                    A(inflate, i4, rid, nickname2);
                    com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f41653c).getAccountData();
                    int i6 = dVar.f41757c;
                    boolean z5 = accountData != null && uid == accountData.getUid();
                    z(inflate, i6 == 3 || i6 == 99 || z5, !z5, i4, rid, nickname2);
                }
                linearLayout.addView(inflate);
            }
        }
    }

    private void r(View view, u.d dVar, boolean z4, int i4) {
        int i5;
        boolean z5;
        View view2;
        int i6;
        ForumBean.ForumCommentBean forumCommentBean;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        int i7 = dVar.f41755a;
        int i8 = dVar.f41759e;
        boolean z6 = dVar.f41760f;
        ForumBean.ForumCommentBean forumCommentBean2 = dVar.f41756b;
        List<ForumBean.ForumCommentReplyBean> reply_list = forumCommentBean2.getReply_list();
        LinearLayout linearLayout3 = (LinearLayout) view;
        linearLayout3.removeAllViews();
        int size = reply_list.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size + 1) {
            if (i10 <= 3 || !z4) {
                View inflate = LayoutInflater.from(this.f41653c).inflate(R.layout.comment_reply_item, (ViewGroup) null);
                inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                TextView textView = (TextView) inflate.findViewById(R.id.comment_reply_content);
                TextView textView2 = (TextView) inflate.findViewById(R.id.comment_reply_more);
                if ((i10 != size || size <= 3) && !(i8 > 0 && z6 && i10 == size)) {
                    i5 = i8;
                    z5 = z6;
                    view2 = inflate;
                    i6 = i10;
                    if (i6 == 3 && z4 && size > 3) {
                        textView.setVisibility(8);
                        textView2.setVisibility(0);
                        textView2.setText(textView2.getResources().getString(R.string.comment_item_content_more, Integer.valueOf(size - 3)));
                        forumCommentBean = forumCommentBean2;
                        linearLayout = linearLayout3;
                        view2.setOnClickListener(new g(size, forumCommentBean2, i7, dVar, i4));
                    } else {
                        forumCommentBean = forumCommentBean2;
                        linearLayout = linearLayout3;
                        if (i6 >= size || (i6 >= 3 && z4)) {
                            linearLayout2 = linearLayout;
                        } else {
                            ForumBean.ForumCommentReplyBean forumCommentReplyBean = reply_list.get(i6);
                            String nickname = forumCommentReplyBean.getNickname();
                            String rnickname = forumCommentReplyBean.getRnickname();
                            if (forumCommentReplyBean.getRrid() == 0) {
                                rnickname = "";
                            }
                            String message = forumCommentReplyBean.getMessage();
                            textView.setVisibility(0);
                            textView2.setVisibility(8);
                            com.join.mgps.Util.j0.u1(textView, nickname, rnickname, message);
                            int rid = forumCommentReplyBean.getRid();
                            int uid = forumCommentReplyBean.getUid();
                            String nickname2 = forumCommentReplyBean.getNickname();
                            A(view2, i7, rid, nickname2);
                            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f41653c).getAccountData();
                            int i11 = dVar.f41757c;
                            boolean z7 = accountData != null && uid == accountData.getUid();
                            z(view2, i11 == 3 || i11 == 99 || z7, !z7, i7, rid, nickname2);
                        }
                    }
                    linearLayout2 = linearLayout;
                } else {
                    textView.setVisibility(8);
                    textView2.setVisibility(i9);
                    textView2.setText("收起");
                    int i12 = i8;
                    i5 = i8;
                    view2 = inflate;
                    z5 = z6;
                    i6 = i10;
                    view2.setOnClickListener(new f(i12, i4, i7, dVar));
                    forumCommentBean = forumCommentBean2;
                    linearLayout2 = linearLayout3;
                }
                linearLayout2.addView(view2);
            } else {
                i5 = i8;
                z5 = z6;
                forumCommentBean = forumCommentBean2;
                linearLayout2 = linearLayout3;
                i6 = i10;
            }
            i10 = i6 + 1;
            linearLayout3 = linearLayout2;
            i8 = i5;
            z6 = z5;
            forumCommentBean2 = forumCommentBean;
            i9 = 0;
        }
    }

    public void A(View view, int i4, int i5, String str) {
        com.join.mgps.Util.w0.e("setOnCommentReplyReply", "cid=" + i4 + " rid=" + i5 + " rNickname=" + str);
        view.setOnClickListener(new b(i4, i5, str));
    }

    public void B(View view, int i4) {
        view.setOnClickListener(new k(i4));
    }

    public void C(o oVar) {
        this.f41656f = oVar;
    }

    void D(View view, int i4, boolean z4, boolean z5, int i5, int i6, String str) {
        if (this.f41657g == null) {
            this.f41657g = new n(this.f41653c);
        }
        this.f41657g.n(i5);
        this.f41657g.u(i6);
        this.f41657g.r(i4);
        if (z4) {
            this.f41657g.q(0);
        } else {
            this.f41657g.q(8);
        }
        if (z5) {
            this.f41657g.t(0);
        } else {
            this.f41657g.t(8);
        }
        if (com.join.mgps.Util.g2.h(str)) {
            str = "";
        }
        this.f41657g.s(str);
        this.f41657g.showAsDropDown(view);
    }

    void e(String str, p pVar) {
        if (this.f41658h == null) {
            this.f41658h = new Hashtable<>();
        }
        this.f41658h.put(str, pVar);
    }

    public void f() {
        Hashtable<String, p> hashtable = this.f41658h;
        if (hashtable != null) {
            hashtable.clear();
            System.gc();
        }
    }

    u g(int i4, ForumBean.ForumCommentBean forumCommentBean, int i5, boolean z4) {
        return new u(ViewType.PROFILE_MESSAGE_REPLY_ITEM, new u.d(i4, forumCommentBean, i5, z4));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<u> list = this.f41654d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<u> list = this.f41654d;
        if (list != null) {
            return list.get(i4).a();
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        List<u> list = this.f41654d;
        if (list != null) {
            return list.get(i4).b().ordinal();
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i4);
        if (itemViewType == ViewType.PROFILE_HEADER.ordinal()) {
            return l(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.PROFILE_MESSAGE_ITEM.ordinal()) {
            return m(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.PROFILE_COMMENT_IMAGE.ordinal()) {
            return k(i4, view, viewGroup);
        }
        return itemViewType == ViewType.PROFILE_MESSAGE_REPLY_ITEM.ordinal() ? n(i4, view, viewGroup) : view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return ViewType.values().length;
    }

    public List<u> i() {
        return this.f41654d;
    }

    p j(String str) {
        Hashtable<String, p> hashtable = this.f41658h;
        if (hashtable == null) {
            return null;
        }
        return hashtable.get(str);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    public void o(SimpleDraweeView simpleDraweeView, String str) {
        try {
            simpleDraweeView.getHierarchy().H(R.drawable.main_normal_icon);
            simpleDraweeView.setController(Fresco.newDraweeControllerBuilder().H(new j(simpleDraweeView)).a(MyImageLoader.H(str)).build());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void p(Context context, String str) {
        Integer[] i02 = com.join.mgps.Util.j0.i0(str);
        if (i02 != null) {
            p pVar = new p();
            int intValue = i02[0].intValue();
            int intValue2 = i02[1].intValue();
            Resources resources = context.getResources();
            int dimensionPixelSize = (int) ((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) - (resources.getDisplayMetrics().density * 58.0f));
            pVar.f41716a = dimensionPixelSize;
            pVar.f41717b = (int) (dimensionPixelSize * 1.0f * ((intValue2 * 1.0f) / intValue));
            e(str, pVar);
        }
    }

    LinearLayout.LayoutParams s(String str, View view, com.facebook.imagepipeline.image.f fVar) {
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
            com.join.mgps.Util.w0.e(this.f41652b + "setCommentImageItemParams-->rawHeight=" + height + " rawWidth=" + width + " ratio=" + f6 + " itemHeight=" + i6 + " itemWidth=" + dimensionPixelSize + "\n" + str);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, i6);
            layoutParams.setMargins(0, i5, 0, i5);
            view.setLayoutParams(layoutParams);
            return layoutParams;
        }
        return null;
    }

    void t(u uVar, boolean z4) {
        if (uVar == null) {
            return;
        }
        try {
            ((u.d) uVar.a()).f41758d = z4;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void u(List<u> list) {
        if (list == null) {
            return;
        }
        if (this.f41654d == null) {
            this.f41654d = new ArrayList();
        }
        this.f41654d.clear();
        this.f41654d.addAll(list);
    }

    public void v(View view, int i4, int i5) {
        view.setOnLongClickListener(new a(i4, i5));
    }

    public void w(View view, int i4, String str) {
        view.setOnClickListener(new m(i4, str));
    }

    public void x(View view) {
        view.setOnClickListener(new l());
    }

    public void y(View view, int i4, int i5, int i6) {
        com.join.mgps.Util.w0.e("setOnCommentReplyLongClick", "cid=" + i4 + " rid=" + i5 + " ruid=" + i6);
        view.setOnLongClickListener(new c(i4, i5, i6));
    }

    public void z(View view, boolean z4, boolean z5, int i4, int i5, String str) {
        view.setOnLongClickListener(new d(i4, z4, z5, i5, str));
    }
}
