package com.join.mgps.adapter;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.CommentSelfListActivity_;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.InformationCommentBeanV2;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class InformationAdapterV2 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f43303b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f43304c;

    /* renamed from: d  reason: collision with root package name */
    private List<n> f43305d;

    /* renamed from: e  reason: collision with root package name */
    l f43306e = null;

    /* loaded from: classes4.dex */
    public enum ViewType {
        TITLE,
        COMMENT,
        REPLY
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43307b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f43308c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f43309d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ n.b f43310e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f43311f;

        a(int i4, InformationCommentBeanV2 informationCommentBeanV2, String str, n.b bVar, int i5) {
            this.f43307b = i4;
            this.f43308c = informationCommentBeanV2;
            this.f43309d = str;
            this.f43310e = bVar;
            this.f43311f = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4 = 0;
            int i5 = 0;
            boolean z4 = false;
            while (i4 < this.f43307b) {
                InformationCommentBeanV2 informationCommentBeanV2 = new InformationCommentBeanV2(this.f43308c);
                List<InformationCommentBeanV2> replyList = informationCommentBeanV2.getReplyList();
                ArrayList arrayList = new ArrayList();
                int i6 = i4 + 3;
                if (i6 < replyList.size()) {
                    arrayList.addAll(replyList.subList(i4, i6));
                } else {
                    arrayList.addAll(replyList.subList(i4, replyList.size()));
                    z4 = true;
                }
                informationCommentBeanV2.setReplyList(arrayList);
                n d5 = InformationAdapterV2.this.d(this.f43309d, informationCommentBeanV2, this.f43310e.f43355c, i5 == 0);
                n.b bVar = (n.b) d5.a();
                bVar.f43357e = i5;
                bVar.f43358f = z4;
                bVar.f43356d = i5 == 0;
                InformationAdapterV2.this.k(d5, !z4);
                InformationAdapterV2.this.f43305d.add(this.f43311f + i5 + 1, d5);
                i5++;
                i4 = i6;
            }
            InformationAdapterV2.this.f43305d.remove(this.f43311f);
            InformationAdapterV2.this.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f43313b;

        b(InformationCommentBeanV2 informationCommentBeanV2) {
            this.f43313b = informationCommentBeanV2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message = new Message();
            message.what = 2;
            message.obj = this.f43313b;
            InformationAdapterV2.this.f43304c.sendMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f43315b;

        c(InformationCommentBeanV2 informationCommentBeanV2) {
            this.f43315b = informationCommentBeanV2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f43315b.getPraise().booleanValue()) {
                com.join.mgps.Util.l2.a(InformationAdapterV2.this.f43303b).b("你已赞过");
            } else if (IntentUtil.getInstance().goLoginInteractive(InformationAdapterV2.this.f43303b)) {
            } else {
                ((ImageView) view).setImageResource(R.drawable.like);
                view.startAnimation(AnimationUtils.loadAnimation(InformationAdapterV2.this.f43303b, R.anim.scale_reset));
                Message message = new Message();
                message.what = 1;
                message.obj = this.f43315b;
                InformationAdapterV2.this.f43304c.sendMessage(message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f43317b;

        d(p pVar) {
            this.f43317b = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Layout layout = this.f43317b.f43367f.getLayout();
            if (layout != null) {
                int lineCount = layout.getLineCount();
                if (lineCount > 0) {
                    if (layout.getEllipsisCount(lineCount - 1) > 0) {
                        this.f43317b.f43371j.setVisibility(0);
                        return;
                    } else {
                        this.f43317b.f43371j.setVisibility(8);
                        return;
                    }
                }
                return;
            }
            this.f43317b.f43371j.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f43319b;

        e(p pVar) {
            this.f43319b = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f43319b.f43371j.getText().toString().equals("查看全部")) {
                this.f43319b.f43367f.setMaxLines(Integer.MAX_VALUE);
                this.f43319b.f43371j.setText("收起");
                return;
            }
            this.f43319b.f43367f.setMaxLines(5);
            this.f43319b.f43371j.setText("查看全部");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f43321b;

        f(InformationCommentBeanV2 informationCommentBeanV2) {
            this.f43321b = informationCommentBeanV2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(Integer.parseInt(this.f43321b.getUid())).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f43323b;

        g(InformationCommentBeanV2 informationCommentBeanV2) {
            this.f43323b = informationCommentBeanV2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f43323b.getPraise().booleanValue()) {
                com.join.mgps.Util.l2.a(InformationAdapterV2.this.f43303b).b("你已赞过");
            } else if (AccountUtil_.getInstance_(InformationAdapterV2.this.f43303b).getAccountData() == null) {
                IntentUtil.getInstance().goLoginInteractive(InformationAdapterV2.this.f43303b);
            } else {
                ((ImageView) view).setImageResource(R.drawable.like);
                view.startAnimation(AnimationUtils.loadAnimation(InformationAdapterV2.this.f43303b, R.anim.scale_reset));
                l lVar = InformationAdapterV2.this.f43306e;
                if (lVar != null) {
                    lVar.a(this.f43323b);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f43325b;

        h(InformationCommentBeanV2 informationCommentBeanV2) {
            this.f43325b = informationCommentBeanV2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l lVar = InformationAdapterV2.this.f43306e;
            if (lVar != null) {
                lVar.c(this.f43325b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f43327b;

        i(InformationCommentBeanV2 informationCommentBeanV2) {
            this.f43327b = informationCommentBeanV2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l lVar = InformationAdapterV2.this.f43306e;
            if (lVar != null) {
                lVar.b(this.f43327b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43329b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43330c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f43331d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ n.b f43332e;

        j(int i4, int i5, String str, n.b bVar) {
            this.f43329b = i4;
            this.f43330c = i5;
            this.f43331d = str;
            this.f43332e = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f43329b == 0) {
                return;
            }
            InformationCommentBeanV2 informationCommentBeanV2 = new InformationCommentBeanV2();
            ArrayList arrayList = new ArrayList();
            for (int i4 = this.f43329b; i4 >= 0; i4--) {
                n nVar = (n) InformationAdapterV2.this.f43305d.get(this.f43330c - i4);
                n.b bVar = nVar.b() == ViewType.REPLY ? (n.b) nVar.a() : null;
                if (bVar != null && this.f43331d == bVar.f43353a) {
                    arrayList.addAll(bVar.f43354b.getReplyList());
                }
            }
            for (int i5 = 0; i5 <= this.f43329b; i5++) {
                InformationAdapterV2.this.f43305d.remove(this.f43330c - i5);
            }
            informationCommentBeanV2.setReplyList(arrayList);
            InformationAdapterV2.this.f43305d.add(this.f43330c - this.f43329b, InformationAdapterV2.this.d(this.f43331d, informationCommentBeanV2, this.f43332e.f43355c, true));
            InformationAdapterV2.this.notifyDataSetChanged();
        }
    }

    /* loaded from: classes4.dex */
    class k extends p {

        /* renamed from: l  reason: collision with root package name */
        private RelativeLayout f43334l;

        /* renamed from: m  reason: collision with root package name */
        private SimpleDraweeView f43335m;

        /* renamed from: n  reason: collision with root package name */
        private ImageView f43336n;

        /* renamed from: o  reason: collision with root package name */
        private TextView f43337o;

        /* renamed from: p  reason: collision with root package name */
        private TextView f43338p;

        /* renamed from: q  reason: collision with root package name */
        private TextView f43339q;

        /* renamed from: r  reason: collision with root package name */
        private TextView f43340r;

        /* renamed from: s  reason: collision with root package name */
        private VipView f43341s;

        k() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public interface l {
        void a(InformationCommentBeanV2 informationCommentBeanV2);

        void b(InformationCommentBeanV2 informationCommentBeanV2);

        void c(InformationCommentBeanV2 informationCommentBeanV2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m extends p {

        /* renamed from: l  reason: collision with root package name */
        public LinearLayout f43343l;

        /* renamed from: m  reason: collision with root package name */
        public View f43344m;

        /* renamed from: n  reason: collision with root package name */
        public TextView f43345n;

        /* renamed from: o  reason: collision with root package name */
        public TextView f43346o;

        /* renamed from: p  reason: collision with root package name */
        public View f43347p;

        /* renamed from: q  reason: collision with root package name */
        public View f43348q;

        m() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public static class n {

        /* renamed from: a  reason: collision with root package name */
        ViewType f43350a;

        /* renamed from: b  reason: collision with root package name */
        Object f43351b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public InformationCommentBeanV2 f43352a;

            public a(InformationCommentBeanV2 informationCommentBeanV2) {
                this.f43352a = informationCommentBeanV2;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public String f43353a;

            /* renamed from: b  reason: collision with root package name */
            public InformationCommentBeanV2 f43354b;

            /* renamed from: c  reason: collision with root package name */
            public int f43355c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f43356d;

            /* renamed from: e  reason: collision with root package name */
            public int f43357e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f43358f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f43359g;

            public b(String str, InformationCommentBeanV2 informationCommentBeanV2, int i4, boolean z4) {
                this.f43353a = str;
                this.f43354b = informationCommentBeanV2;
                this.f43355c = i4;
                this.f43356d = z4;
            }
        }

        public n() {
        }

        public Object a() {
            return this.f43351b;
        }

        public ViewType b() {
            return this.f43350a;
        }

        public void c(Object obj) {
            this.f43351b = obj;
        }

        public void d(ViewType viewType) {
            this.f43350a = viewType;
        }

        public n(ViewType viewType, Object obj) {
            this.f43350a = viewType;
            this.f43351b = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o {

        /* renamed from: a  reason: collision with root package name */
        private TextView f43360a;

        o() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p {

        /* renamed from: a  reason: collision with root package name */
        private RelativeLayout f43362a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f43363b;

        /* renamed from: c  reason: collision with root package name */
        private ImageView f43364c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f43365d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f43366e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f43367f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f43368g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f43369h;

        /* renamed from: i  reason: collision with root package name */
        public VipView f43370i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f43371j;

        p() {
        }
    }

    public InformationAdapterV2(Context context, Handler handler, List<n> list) {
        this.f43303b = context;
        this.f43304c = handler;
        this.f43305d = list;
    }

    private View g(int i4, View view, ViewGroup viewGroup) {
        m mVar;
        n.b bVar;
        try {
            if (view != null) {
                mVar = (m) view.getTag();
            } else {
                mVar = new m();
                view = LayoutInflater.from(this.f43303b).inflate(R.layout.mg_game_comment_activity_item_comment_message_reply, (ViewGroup) null);
                mVar.f43343l = (LinearLayout) view.findViewById(R.id.comment_reply_container);
                mVar.f43344m = view.findViewById(R.id.comment_reply_divider);
                mVar.f43345n = (TextView) view.findViewById(R.id.comment_reply_content);
                mVar.f43346o = (TextView) view.findViewById(R.id.comment_reply_more);
                mVar.f43347p = view.findViewById(R.id.line);
                mVar.f43348q = view.findViewById(R.id.bottom);
                view.setTag(mVar);
            }
            bVar = (n.b) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (bVar == null || bVar.f43354b == null) {
            return view;
        }
        if (bVar.f43356d) {
            mVar.f43344m.setVisibility(0);
        } else {
            mVar.f43344m.setVisibility(8);
        }
        if (!bVar.f43359g) {
            mVar.f43347p.setVisibility(0);
            mVar.f43348q.setVisibility(0);
        } else {
            mVar.f43347p.setVisibility(8);
            mVar.f43348q.setVisibility(8);
        }
        List<InformationCommentBeanV2> replyList = bVar.f43354b.getReplyList();
        if (replyList != null && replyList.size() != 0) {
            j(mVar.f43343l, bVar, true, i4);
        } else {
            mVar.f43343l.removeAllViews();
        }
        return view;
    }

    private void j(View view, n.b bVar, boolean z4, int i4) {
        View view2;
        int i5;
        boolean z5;
        int i6;
        int i7;
        String str = bVar.f43353a;
        int i8 = bVar.f43357e;
        boolean z6 = bVar.f43358f;
        InformationCommentBeanV2 informationCommentBeanV2 = bVar.f43354b;
        List<InformationCommentBeanV2> replyList = informationCommentBeanV2.getReplyList();
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.removeAllViews();
        int size = replyList.size();
        int i9 = 0;
        while (i9 < size + 1) {
            if (i9 <= 3 || !z4) {
                View inflate = LayoutInflater.from(this.f43303b).inflate(R.layout.comment_reply_item, (ViewGroup) null);
                inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                TextView textView = (TextView) inflate.findViewById(R.id.comment_reply_content);
                TextView textView2 = (TextView) inflate.findViewById(R.id.comment_reply_more);
                TextView textView3 = (TextView) inflate.findViewById(R.id.tvReplyName);
                if ((i9 != size || size <= 3) && !(i8 > 0 && z6 && i9 == size)) {
                    view2 = inflate;
                    i5 = i8;
                    z5 = z6;
                    i6 = i9;
                    if (i6 == 3 && z4 && size > 3) {
                        textView.setVisibility(8);
                        textView3.setVisibility(8);
                        textView2.setVisibility(0);
                        textView2.setText(textView2.getResources().getString(R.string.comment_item_content_more, Integer.valueOf(size - 3)));
                        i7 = size;
                        view2.setOnClickListener(new a(size, informationCommentBeanV2, str, bVar, i4));
                    } else {
                        i7 = size;
                        if (i6 < i7 && (i6 < 3 || !z4)) {
                            textView.setVisibility(0);
                            textView3.setVisibility(0);
                            textView2.setVisibility(8);
                            InformationCommentBeanV2 informationCommentBeanV22 = replyList.get(i6);
                            String msg = informationCommentBeanV22.getMsg();
                            informationCommentBeanV22.getCommentId();
                            try {
                                textView.setText(Html.fromHtml(msg));
                                textView3.setText(informationCommentBeanV22.getNickname() + ":");
                                n(view2, informationCommentBeanV22);
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                            linearLayout.addView(view2);
                        }
                    }
                } else {
                    textView.setVisibility(8);
                    textView3.setVisibility(8);
                    textView2.setVisibility(0);
                    textView2.setText("收起");
                    int i10 = i8;
                    view2 = inflate;
                    i5 = i8;
                    i6 = i9;
                    z5 = z6;
                    view2.setOnClickListener(new j(i10, i4, str, bVar));
                    i7 = size;
                }
                linearLayout.addView(view2);
            } else {
                i5 = i8;
                z5 = z6;
                i6 = i9;
                i7 = size;
            }
            i9 = i6 + 1;
            size = i7;
            i8 = i5;
            z6 = z5;
        }
    }

    private void n(View view, InformationCommentBeanV2 informationCommentBeanV2) {
        view.setOnClickListener(new h(informationCommentBeanV2));
    }

    private void o(View view, InformationCommentBeanV2 informationCommentBeanV2) {
        view.setOnClickListener(new g(informationCommentBeanV2));
    }

    private void p(View view, InformationCommentBeanV2 informationCommentBeanV2) {
        view.setOnClickListener(new i(informationCommentBeanV2));
    }

    n d(String str, InformationCommentBeanV2 informationCommentBeanV2, int i4, boolean z4) {
        return new n(ViewType.REPLY, new n.b(str, informationCommentBeanV2, i4, z4));
    }

    public View e(int i4, View view, ViewGroup viewGroup) {
        View view2;
        k kVar;
        if (view == null) {
            kVar = new k();
            view2 = LayoutInflater.from(this.f43303b).inflate(R.layout.gameinformation_commit_item_layout, (ViewGroup) null);
            kVar.f43334l = (RelativeLayout) view2.findViewById(R.id.main);
            kVar.f43335m = (SimpleDraweeView) view2.findViewById(R.id.usericon);
            kVar.f43336n = (ImageView) view2.findViewById(R.id.parise);
            kVar.f43337o = (TextView) view2.findViewById(R.id.username);
            kVar.f43338p = (TextView) view2.findViewById(R.id.time);
            kVar.f43339q = (TextView) view2.findViewById(R.id.content);
            kVar.f43340r = (TextView) view2.findViewById(R.id.pariseNumber);
            kVar.f43341s = (VipView) view2.findViewById(R.id.levelTv);
            view2.setTag(kVar);
        } else {
            view2 = view;
            kVar = (k) view.getTag();
        }
        n.a aVar = (n.a) getItem(i4);
        if (aVar == null) {
            return null;
        }
        InformationCommentBeanV2 informationCommentBeanV2 = aVar.f43352a;
        kVar.f43338p.setText(com.join.android.app.common.utils.g.a(Long.parseLong(informationCommentBeanV2.getCreateTime())));
        kVar.f43339q.setText(informationCommentBeanV2.getMsg());
        TextView textView = kVar.f43340r;
        textView.setText(informationCommentBeanV2.getLike() + "");
        if (informationCommentBeanV2.getPraise().booleanValue()) {
            kVar.f43336n.setImageResource(R.drawable.like);
        } else {
            kVar.f43336n.setImageResource(R.drawable.unlike);
        }
        if (com.join.mgps.Util.g2.i(informationCommentBeanV2.getAvatar())) {
            UtilsMy.s3(this.f43303b, informationCommentBeanV2.getAvatar(), kVar.f43335m);
        }
        kVar.f43337o.setText(Html.fromHtml(informationCommentBeanV2.getNickname()));
        o(kVar.f43336n, informationCommentBeanV2);
        p(view2, informationCommentBeanV2);
        return view2;
    }

    public List<n> f() {
        return this.f43305d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<n> list = this.f43305d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<n> list = this.f43305d;
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
        List<n> list = this.f43305d;
        if (list != null) {
            return list.get(i4).b().ordinal();
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i4);
        if (itemViewType == ViewType.COMMENT.ordinal()) {
            return h(i4, view, viewGroup, 2);
        }
        if (itemViewType == ViewType.TITLE.ordinal()) {
            return h(i4, view, viewGroup, 1);
        }
        return itemViewType == ViewType.REPLY.ordinal() ? g(i4, view, viewGroup) : view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return ViewType.values().length;
    }

    public View h(int i4, View view, ViewGroup viewGroup, int i5) {
        p pVar;
        InformationCommentBeanV2 informationCommentBeanV2 = ((n.a) getItem(i4)).f43352a;
        o oVar = null;
        if (view == null) {
            if (i5 != 1) {
                if (i5 == 2) {
                    p pVar2 = new p();
                    View inflate = LayoutInflater.from(this.f43303b).inflate(R.layout.gameinformation_commit_item_layout, (ViewGroup) null);
                    pVar2.f43362a = (RelativeLayout) inflate.findViewById(R.id.main);
                    pVar2.f43363b = (SimpleDraweeView) inflate.findViewById(R.id.usericon);
                    pVar2.f43364c = (ImageView) inflate.findViewById(R.id.parise);
                    pVar2.f43365d = (TextView) inflate.findViewById(R.id.username);
                    pVar2.f43366e = (TextView) inflate.findViewById(R.id.time);
                    pVar2.f43367f = (TextView) inflate.findViewById(R.id.content);
                    pVar2.f43368g = (TextView) inflate.findViewById(R.id.pariseNumber);
                    pVar2.f43369h = (TextView) inflate.findViewById(R.id.levelTv);
                    pVar2.f43370i = (VipView) inflate.findViewById(R.id.levelVip);
                    pVar2.f43371j = (TextView) inflate.findViewById(R.id.more);
                    inflate.setTag(pVar2);
                    pVar = pVar2;
                    view = inflate;
                }
                pVar = null;
            } else {
                o oVar2 = new o();
                View inflate2 = LayoutInflater.from(this.f43303b).inflate(R.layout.gameinformation_comment_item_title, (ViewGroup) null);
                oVar2.f43360a = (TextView) inflate2.findViewById(R.id.title);
                inflate2.setTag(oVar2);
                oVar = oVar2;
                view = inflate2;
                pVar = null;
            }
        } else if (i5 != 1) {
            if (i5 == 2) {
                pVar = (p) view.getTag();
            }
            pVar = null;
        } else {
            pVar = null;
            oVar = (o) view.getTag();
        }
        if (i5 == 1) {
            oVar.f43360a.setText("最新评论");
        } else if (i5 == 2) {
            pVar.f43365d.setText(Html.fromHtml(informationCommentBeanV2.getNickname()));
            pVar.f43366e.setText(com.join.android.app.common.utils.g.b(Long.parseLong(informationCommentBeanV2.getCreateTime())));
            pVar.f43367f.setText(informationCommentBeanV2.getMsg());
            pVar.f43368g.setText(informationCommentBeanV2.getLike() + "");
            if (informationCommentBeanV2.getPraise().booleanValue()) {
                pVar.f43364c.setImageResource(R.drawable.like);
            } else {
                pVar.f43364c.setImageResource(R.drawable.unlike);
            }
            if (com.join.mgps.Util.g2.i(informationCommentBeanV2.getAvatar())) {
                UtilsMy.s3(this.f43303b, informationCommentBeanV2.getAvatar(), pVar.f43363b);
            }
            pVar.f43362a.setOnClickListener(new b(informationCommentBeanV2));
            pVar.f43364c.setOnClickListener(new c(informationCommentBeanV2));
            pVar.f43367f.post(new d(pVar));
            pVar.f43371j.setOnClickListener(new e(pVar));
            pVar.f43363b.setOnClickListener(new f(informationCommentBeanV2));
        }
        return view;
    }

    public l i() {
        return this.f43306e;
    }

    void k(n nVar, boolean z4) {
        if (nVar == null) {
            return;
        }
        try {
            ((n.b) nVar.a()).f43359g = z4;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void l(List<n> list) {
        if (list == null) {
            return;
        }
        if (this.f43305d == null) {
            list = new ArrayList<>();
        }
        this.f43305d.clear();
        this.f43305d.addAll(list);
    }

    public void m(l lVar) {
        this.f43306e = lVar;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
