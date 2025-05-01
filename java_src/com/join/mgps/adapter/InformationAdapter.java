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
import com.join.mgps.dto.InformationCommentBean;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class InformationAdapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f43233b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f43234c;

    /* renamed from: d  reason: collision with root package name */
    private List<n> f43235d;

    /* renamed from: e  reason: collision with root package name */
    l f43236e = null;

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
        final /* synthetic */ int f43237b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f43238c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f43239d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ n.b f43240e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f43241f;

        a(int i4, InformationCommentBean informationCommentBean, String str, n.b bVar, int i5) {
            this.f43237b = i4;
            this.f43238c = informationCommentBean;
            this.f43239d = str;
            this.f43240e = bVar;
            this.f43241f = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4 = 0;
            int i5 = 0;
            boolean z4 = false;
            while (i4 < this.f43237b) {
                InformationCommentBean informationCommentBean = new InformationCommentBean(this.f43238c);
                List<InformationCommentBean.Sub> sub = informationCommentBean.getSub();
                ArrayList arrayList = new ArrayList();
                int i6 = i4 + 3;
                if (i6 < sub.size()) {
                    arrayList.addAll(sub.subList(i4, i6));
                } else {
                    arrayList.addAll(sub.subList(i4, sub.size()));
                    z4 = true;
                }
                informationCommentBean.setSub(arrayList);
                n d5 = InformationAdapter.this.d(this.f43239d, informationCommentBean, this.f43240e.f43285c, i5 == 0);
                n.b bVar = (n.b) d5.a();
                bVar.f43287e = i5;
                bVar.f43288f = z4;
                bVar.f43286d = i5 == 0;
                InformationAdapter.this.k(d5, !z4);
                InformationAdapter.this.f43235d.add(this.f43241f + i5 + 1, d5);
                i5++;
                i4 = i6;
            }
            InformationAdapter.this.f43235d.remove(this.f43241f);
            InformationAdapter.this.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f43243b;

        b(InformationCommentBean informationCommentBean) {
            this.f43243b = informationCommentBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message = new Message();
            message.what = 2;
            message.obj = this.f43243b;
            InformationAdapter.this.f43234c.sendMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f43245b;

        c(InformationCommentBean informationCommentBean) {
            this.f43245b = informationCommentBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f43245b.isHasPraised()) {
                com.join.mgps.Util.l2.a(InformationAdapter.this.f43233b).b("你已赞过");
            } else if (IntentUtil.getInstance().goLoginInteractive(InformationAdapter.this.f43233b)) {
            } else {
                ((ImageView) view).setImageResource(R.drawable.like);
                view.startAnimation(AnimationUtils.loadAnimation(InformationAdapter.this.f43233b, R.anim.scale_reset));
                Message message = new Message();
                message.what = 1;
                message.obj = this.f43245b;
                InformationAdapter.this.f43234c.sendMessage(message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f43247b;

        d(p pVar) {
            this.f43247b = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Layout layout = this.f43247b.f43297f.getLayout();
            if (layout != null) {
                int lineCount = layout.getLineCount();
                if (lineCount > 0) {
                    if (layout.getEllipsisCount(lineCount - 1) > 0) {
                        this.f43247b.f43301j.setVisibility(0);
                        return;
                    } else {
                        this.f43247b.f43301j.setVisibility(8);
                        return;
                    }
                }
                return;
            }
            this.f43247b.f43301j.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f43249b;

        e(p pVar) {
            this.f43249b = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f43249b.f43301j.getText().toString().equals("查看全部")) {
                this.f43249b.f43297f.setMaxLines(Integer.MAX_VALUE);
                this.f43249b.f43301j.setText("收起");
                return;
            }
            this.f43249b.f43297f.setMaxLines(5);
            this.f43249b.f43301j.setText("查看全部");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f43251b;

        f(InformationCommentBean informationCommentBean) {
            this.f43251b = informationCommentBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(Integer.parseInt(this.f43251b.getUser_id())).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f43253b;

        g(InformationCommentBean informationCommentBean) {
            this.f43253b = informationCommentBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f43253b.isHasPraised()) {
                com.join.mgps.Util.l2.a(InformationAdapter.this.f43233b).b("你已赞过");
            } else if (AccountUtil_.getInstance_(InformationAdapter.this.f43233b).getAccountData() == null) {
                IntentUtil.getInstance().goLoginInteractive(InformationAdapter.this.f43233b);
            } else {
                ((ImageView) view).setImageResource(R.drawable.like);
                view.startAnimation(AnimationUtils.loadAnimation(InformationAdapter.this.f43233b, R.anim.scale_reset));
                l lVar = InformationAdapter.this.f43236e;
                if (lVar != null) {
                    lVar.a(this.f43253b);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean.Sub f43255b;

        h(InformationCommentBean.Sub sub) {
            this.f43255b = sub;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l lVar = InformationAdapter.this.f43236e;
            if (lVar != null) {
                lVar.e(this.f43255b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f43257b;

        i(InformationCommentBean informationCommentBean) {
            this.f43257b = informationCommentBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l lVar = InformationAdapter.this.f43236e;
            if (lVar != null) {
                lVar.f(this.f43257b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43259b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43260c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f43261d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ n.b f43262e;

        j(int i4, int i5, String str, n.b bVar) {
            this.f43259b = i4;
            this.f43260c = i5;
            this.f43261d = str;
            this.f43262e = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f43259b == 0) {
                return;
            }
            InformationCommentBean informationCommentBean = new InformationCommentBean();
            ArrayList arrayList = new ArrayList();
            for (int i4 = this.f43259b; i4 >= 0; i4--) {
                n nVar = (n) InformationAdapter.this.f43235d.get(this.f43260c - i4);
                n.b bVar = nVar.b() == ViewType.REPLY ? (n.b) nVar.a() : null;
                if (bVar != null && this.f43261d == bVar.f43283a) {
                    arrayList.addAll(bVar.f43284b.getSub());
                }
            }
            for (int i5 = 0; i5 <= this.f43259b; i5++) {
                InformationAdapter.this.f43235d.remove(this.f43260c - i5);
            }
            informationCommentBean.setSub(arrayList);
            InformationAdapter.this.f43235d.add(this.f43260c - this.f43259b, InformationAdapter.this.d(this.f43261d, informationCommentBean, this.f43262e.f43285c, true));
            InformationAdapter.this.notifyDataSetChanged();
        }
    }

    /* loaded from: classes4.dex */
    class k extends p {

        /* renamed from: l  reason: collision with root package name */
        private RelativeLayout f43264l;

        /* renamed from: m  reason: collision with root package name */
        private SimpleDraweeView f43265m;

        /* renamed from: n  reason: collision with root package name */
        private ImageView f43266n;

        /* renamed from: o  reason: collision with root package name */
        private TextView f43267o;

        /* renamed from: p  reason: collision with root package name */
        private TextView f43268p;

        /* renamed from: q  reason: collision with root package name */
        private TextView f43269q;

        /* renamed from: r  reason: collision with root package name */
        private TextView f43270r;

        /* renamed from: s  reason: collision with root package name */
        private VipView f43271s;

        k() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public interface l {
        void a(InformationCommentBean informationCommentBean);

        void e(InformationCommentBean.Sub sub);

        void f(InformationCommentBean informationCommentBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m extends p {

        /* renamed from: l  reason: collision with root package name */
        public LinearLayout f43273l;

        /* renamed from: m  reason: collision with root package name */
        public View f43274m;

        /* renamed from: n  reason: collision with root package name */
        public TextView f43275n;

        /* renamed from: o  reason: collision with root package name */
        public TextView f43276o;

        /* renamed from: p  reason: collision with root package name */
        public View f43277p;

        /* renamed from: q  reason: collision with root package name */
        public View f43278q;

        m() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public static class n {

        /* renamed from: a  reason: collision with root package name */
        ViewType f43280a;

        /* renamed from: b  reason: collision with root package name */
        Object f43281b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public InformationCommentBean f43282a;

            public a(InformationCommentBean informationCommentBean) {
                this.f43282a = informationCommentBean;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public String f43283a;

            /* renamed from: b  reason: collision with root package name */
            public InformationCommentBean f43284b;

            /* renamed from: c  reason: collision with root package name */
            public int f43285c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f43286d;

            /* renamed from: e  reason: collision with root package name */
            public int f43287e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f43288f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f43289g;

            public b(String str, InformationCommentBean informationCommentBean, int i4, boolean z4) {
                this.f43283a = str;
                this.f43284b = informationCommentBean;
                this.f43285c = i4;
                this.f43286d = z4;
            }
        }

        public n() {
        }

        public Object a() {
            return this.f43281b;
        }

        public ViewType b() {
            return this.f43280a;
        }

        public void c(Object obj) {
            this.f43281b = obj;
        }

        public void d(ViewType viewType) {
            this.f43280a = viewType;
        }

        public n(ViewType viewType, Object obj) {
            this.f43280a = viewType;
            this.f43281b = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o {

        /* renamed from: a  reason: collision with root package name */
        private TextView f43290a;

        o() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p {

        /* renamed from: a  reason: collision with root package name */
        private RelativeLayout f43292a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f43293b;

        /* renamed from: c  reason: collision with root package name */
        private ImageView f43294c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f43295d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f43296e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f43297f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f43298g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f43299h;

        /* renamed from: i  reason: collision with root package name */
        public VipView f43300i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f43301j;

        p() {
        }
    }

    public InformationAdapter(Context context, Handler handler, List<n> list) {
        this.f43233b = context;
        this.f43234c = handler;
        this.f43235d = list;
    }

    private View g(int i4, View view, ViewGroup viewGroup) {
        m mVar;
        n.b bVar;
        try {
            if (view != null) {
                mVar = (m) view.getTag();
            } else {
                mVar = new m();
                view = LayoutInflater.from(this.f43233b).inflate(R.layout.mg_game_comment_activity_item_comment_message_reply, (ViewGroup) null);
                mVar.f43273l = (LinearLayout) view.findViewById(R.id.comment_reply_container);
                mVar.f43274m = view.findViewById(R.id.comment_reply_divider);
                mVar.f43275n = (TextView) view.findViewById(R.id.comment_reply_content);
                mVar.f43276o = (TextView) view.findViewById(R.id.comment_reply_more);
                mVar.f43277p = view.findViewById(R.id.line);
                mVar.f43278q = view.findViewById(R.id.bottom);
                view.setTag(mVar);
            }
            bVar = (n.b) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (bVar == null || bVar.f43284b == null) {
            return view;
        }
        if (bVar.f43286d) {
            mVar.f43274m.setVisibility(0);
        } else {
            mVar.f43274m.setVisibility(8);
        }
        if (!bVar.f43289g) {
            mVar.f43277p.setVisibility(0);
            mVar.f43278q.setVisibility(0);
        } else {
            mVar.f43277p.setVisibility(8);
            mVar.f43278q.setVisibility(8);
        }
        List<InformationCommentBean.Sub> sub = bVar.f43284b.getSub();
        if (sub != null && sub.size() != 0) {
            j(mVar.f43273l, bVar, true, i4);
        } else {
            mVar.f43273l.removeAllViews();
        }
        return view;
    }

    private void j(View view, n.b bVar, boolean z4, int i4) {
        View view2;
        int i5;
        boolean z5;
        int i6;
        int i7;
        String str = bVar.f43283a;
        int i8 = bVar.f43287e;
        boolean z6 = bVar.f43288f;
        InformationCommentBean informationCommentBean = bVar.f43284b;
        List<InformationCommentBean.Sub> sub = informationCommentBean.getSub();
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.removeAllViews();
        int size = sub.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size + 1) {
            if (i10 <= 3 || !z4) {
                View inflate = LayoutInflater.from(this.f43233b).inflate(R.layout.comment_reply_item, (ViewGroup) null);
                inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                TextView textView = (TextView) inflate.findViewById(R.id.comment_reply_content);
                TextView textView2 = (TextView) inflate.findViewById(R.id.comment_reply_more);
                if ((i10 != size || size <= 3) && !(i8 > 0 && z6 && i10 == size)) {
                    view2 = inflate;
                    i5 = i8;
                    z5 = z6;
                    i6 = i10;
                    if (i6 == 3 && z4 && size > 3) {
                        textView.setVisibility(8);
                        textView2.setVisibility(0);
                        textView2.setText(textView2.getResources().getString(R.string.comment_item_content_more, Integer.valueOf(size - 3)));
                        i7 = size;
                        view2.setOnClickListener(new a(size, informationCommentBean, str, bVar, i4));
                    } else {
                        i7 = size;
                        if (i6 < i7 && (i6 < 3 || !z4)) {
                            textView.setVisibility(0);
                            textView2.setVisibility(8);
                            InformationCommentBean.Sub sub2 = sub.get(i6);
                            String content = sub2.getContent();
                            sub2.getComment_id();
                            try {
                                textView.setText(Html.fromHtml(content));
                                n(view2, sub2);
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                            linearLayout.addView(view2);
                        }
                    }
                } else {
                    textView.setVisibility(8);
                    textView2.setVisibility(i9);
                    textView2.setText("收起");
                    int i11 = i8;
                    view2 = inflate;
                    i5 = i8;
                    i6 = i10;
                    z5 = z6;
                    view2.setOnClickListener(new j(i11, i4, str, bVar));
                    i7 = size;
                }
                linearLayout.addView(view2);
            } else {
                i5 = i8;
                z5 = z6;
                i6 = i10;
                i7 = size;
            }
            i10 = i6 + 1;
            size = i7;
            i8 = i5;
            z6 = z5;
            i9 = 0;
        }
    }

    private void n(View view, InformationCommentBean.Sub sub) {
        view.setOnClickListener(new h(sub));
    }

    private void o(View view, InformationCommentBean informationCommentBean) {
        view.setOnClickListener(new g(informationCommentBean));
    }

    private void p(View view, InformationCommentBean informationCommentBean) {
        view.setOnClickListener(new i(informationCommentBean));
    }

    n d(String str, InformationCommentBean informationCommentBean, int i4, boolean z4) {
        return new n(ViewType.REPLY, new n.b(str, informationCommentBean, i4, z4));
    }

    public View e(int i4, View view, ViewGroup viewGroup) {
        View view2;
        k kVar;
        if (view == null) {
            kVar = new k();
            view2 = LayoutInflater.from(this.f43233b).inflate(R.layout.gameinformation_commit_item_layout, (ViewGroup) null);
            kVar.f43264l = (RelativeLayout) view2.findViewById(R.id.main);
            kVar.f43265m = (SimpleDraweeView) view2.findViewById(R.id.usericon);
            kVar.f43266n = (ImageView) view2.findViewById(R.id.parise);
            kVar.f43267o = (TextView) view2.findViewById(R.id.username);
            kVar.f43268p = (TextView) view2.findViewById(R.id.time);
            kVar.f43269q = (TextView) view2.findViewById(R.id.content);
            kVar.f43270r = (TextView) view2.findViewById(R.id.pariseNumber);
            kVar.f43271s = (VipView) view2.findViewById(R.id.levelTv);
            view2.setTag(kVar);
        } else {
            view2 = view;
            kVar = (k) view.getTag();
        }
        n.a aVar = (n.a) getItem(i4);
        if (aVar == null) {
            return null;
        }
        InformationCommentBean informationCommentBean = aVar.f43282a;
        kVar.f43268p.setText(com.join.android.app.common.utils.g.a(Long.parseLong(informationCommentBean.getTimes() + "000")));
        kVar.f43269q.setText(informationCommentBean.getContent());
        TextView textView = kVar.f43270r;
        textView.setText(informationCommentBean.getPraise_count() + "");
        if (informationCommentBean.isHasPraised()) {
            kVar.f43266n.setImageResource(R.drawable.like);
        } else {
            kVar.f43266n.setImageResource(R.drawable.unlike);
        }
        if (com.join.mgps.Util.g2.i(informationCommentBean.getHead_portrait())) {
            UtilsMy.s3(this.f43233b, informationCommentBean.getHead_portrait(), kVar.f43265m);
        }
        kVar.f43267o.setText(Html.fromHtml(informationCommentBean.getUser_name()));
        kVar.f43271s.setVipData(informationCommentBean.getUser_vip_level(), informationCommentBean.getUser_svip_level());
        o(kVar.f43266n, informationCommentBean);
        p(view2, informationCommentBean);
        return view2;
    }

    public List<n> f() {
        return this.f43235d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<n> list = this.f43235d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<n> list = this.f43235d;
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
        List<n> list = this.f43235d;
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
        o oVar;
        InformationCommentBean informationCommentBean = ((n.a) getItem(i4)).f43282a;
        p pVar = null;
        if (view == null) {
            if (i5 != 1) {
                if (i5 == 2) {
                    p pVar2 = new p();
                    View inflate = LayoutInflater.from(this.f43233b).inflate(R.layout.gameinformation_commit_item_layout, (ViewGroup) null);
                    pVar2.f43292a = (RelativeLayout) inflate.findViewById(R.id.main);
                    pVar2.f43293b = (SimpleDraweeView) inflate.findViewById(R.id.usericon);
                    pVar2.f43294c = (ImageView) inflate.findViewById(R.id.parise);
                    pVar2.f43295d = (TextView) inflate.findViewById(R.id.username);
                    pVar2.f43296e = (TextView) inflate.findViewById(R.id.time);
                    pVar2.f43297f = (TextView) inflate.findViewById(R.id.content);
                    pVar2.f43298g = (TextView) inflate.findViewById(R.id.pariseNumber);
                    pVar2.f43299h = (TextView) inflate.findViewById(R.id.levelTv);
                    pVar2.f43300i = (VipView) inflate.findViewById(R.id.levelVip);
                    pVar2.f43301j = (TextView) inflate.findViewById(R.id.more);
                    inflate.setTag(pVar2);
                    pVar = pVar2;
                    view = inflate;
                    oVar = null;
                }
                oVar = null;
            } else {
                o oVar2 = new o();
                View inflate2 = LayoutInflater.from(this.f43233b).inflate(R.layout.gameinformation_comment_item_title, (ViewGroup) null);
                oVar2.f43290a = (TextView) inflate2.findViewById(R.id.title);
                inflate2.setTag(oVar2);
                oVar = oVar2;
                view = inflate2;
            }
        } else if (i5 != 1) {
            if (i5 == 2) {
                oVar = null;
                pVar = (p) view.getTag();
            }
            oVar = null;
        } else {
            oVar = (o) view.getTag();
        }
        if (i5 != 1) {
            if (i5 == 2) {
                pVar.f43295d.setText(Html.fromHtml(informationCommentBean.getUser_name()));
                pVar.f43296e.setText(com.join.android.app.common.utils.g.b(Long.parseLong(informationCommentBean.getTimes() + "000")));
                pVar.f43297f.setText(informationCommentBean.getContent());
                pVar.f43298g.setText(informationCommentBean.getPraise_count() + "");
                if (informationCommentBean.isHasPraised()) {
                    pVar.f43294c.setImageResource(R.drawable.like);
                } else {
                    pVar.f43294c.setImageResource(R.drawable.unlike);
                }
                if (com.join.mgps.Util.g2.i(informationCommentBean.getHead_portrait())) {
                    UtilsMy.s3(this.f43233b, informationCommentBean.getHead_portrait(), pVar.f43293b);
                }
                try {
                    UtilsMy.z3(this.f43233b, pVar.f43295d, informationCommentBean.getUser_vip_level(), informationCommentBean.getUser_svip_level());
                    pVar.f43300i.setVipData(informationCommentBean.getUser_vip_level(), informationCommentBean.getUser_svip_level());
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                com.join.mgps.Util.s.h(informationCommentBean.getUser_level(), pVar.f43299h);
                pVar.f43299h.setText("LV." + informationCommentBean.getUser_level());
                pVar.f43292a.setOnClickListener(new b(informationCommentBean));
                pVar.f43294c.setOnClickListener(new c(informationCommentBean));
                pVar.f43297f.post(new d(pVar));
                pVar.f43301j.setOnClickListener(new e(pVar));
                pVar.f43293b.setOnClickListener(new f(informationCommentBean));
            }
        } else if (informationCommentBean.getIs_hot() == 1) {
            oVar.f43290a.setText("热门评论");
        } else {
            oVar.f43290a.setText("最新评论");
        }
        return view;
    }

    public l i() {
        return this.f43236e;
    }

    void k(n nVar, boolean z4) {
        if (nVar == null) {
            return;
        }
        try {
            ((n.b) nVar.a()).f43289g = z4;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void l(List<n> list) {
        if (list == null) {
            return;
        }
        if (this.f43235d == null) {
            list = new ArrayList<>();
        }
        this.f43235d.clear();
        this.f43235d.addAll(list);
    }

    public void m(l lVar) {
        this.f43236e = lVar;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
