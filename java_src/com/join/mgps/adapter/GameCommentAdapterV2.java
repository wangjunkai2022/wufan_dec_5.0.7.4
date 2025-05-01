package com.join.mgps.adapter;

import android.content.Context;
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
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.CommentSelfListActivity_;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.InformationCommentBeanV2;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class GameCommentAdapterV2 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f42112b;

    /* renamed from: c  reason: collision with root package name */
    private List<l> f42113c;

    /* renamed from: d  reason: collision with root package name */
    j f42114d;

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
        final /* synthetic */ InformationCommentBeanV2 f42115b;

        a(InformationCommentBeanV2 informationCommentBeanV2) {
            this.f42115b = informationCommentBeanV2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(Integer.parseInt(this.f42115b.getUid())).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f42117b;

        b(i iVar) {
            this.f42117b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Layout layout = this.f42117b.f42143g.getLayout();
            if (layout != null) {
                int lineCount = layout.getLineCount();
                if (lineCount > 0) {
                    if (layout.getEllipsisCount(lineCount - 1) > 0) {
                        this.f42117b.f42147k.setVisibility(0);
                        return;
                    } else {
                        this.f42117b.f42147k.setVisibility(8);
                        return;
                    }
                }
                return;
            }
            this.f42117b.f42147k.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f42119b;

        c(i iVar) {
            this.f42119b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42119b.f42147k.getText().toString().equals("查看全部")) {
                this.f42119b.f42143g.setMaxLines(Integer.MAX_VALUE);
                this.f42119b.f42147k.setText("收起");
            } else {
                this.f42119b.f42143g.setMaxLines(5);
                this.f42119b.f42147k.setText("查看全部");
            }
            this.f42119b.f42147k.postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f42121b;

        d(InformationCommentBeanV2 informationCommentBeanV2) {
            this.f42121b = informationCommentBeanV2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42121b.getPraise().booleanValue()) {
                com.join.mgps.Util.l2.a(GameCommentAdapterV2.this.f42112b).b("你已赞过");
            } else if (IntentUtil.getInstance().goLoginInteractive(GameCommentAdapterV2.this.f42112b)) {
            } else {
                ((ImageView) view).setImageResource(R.drawable.like);
                view.startAnimation(AnimationUtils.loadAnimation(GameCommentAdapterV2.this.f42112b, R.anim.scale_reset));
                j jVar = GameCommentAdapterV2.this.f42114d;
                if (jVar != null) {
                    jVar.a(this.f42121b);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f42123b;

        e(InformationCommentBeanV2 informationCommentBeanV2) {
            this.f42123b = informationCommentBeanV2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j jVar = GameCommentAdapterV2.this.f42114d;
            if (jVar != null) {
                jVar.c(this.f42123b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f42125b;

        f(InformationCommentBeanV2 informationCommentBeanV2) {
            this.f42125b = informationCommentBeanV2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j jVar = GameCommentAdapterV2.this.f42114d;
            if (jVar != null) {
                jVar.b(this.f42125b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f42127b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42128c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f42129d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l.b f42130e;

        g(int i4, int i5, String str, l.b bVar) {
            this.f42127b = i4;
            this.f42128c = i5;
            this.f42129d = str;
            this.f42130e = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42127b == 0) {
                return;
            }
            InformationCommentBeanV2 informationCommentBeanV2 = new InformationCommentBeanV2();
            ArrayList arrayList = new ArrayList();
            for (int i4 = this.f42127b; i4 >= 0; i4--) {
                l lVar = (l) GameCommentAdapterV2.this.f42113c.get(this.f42128c - i4);
                l.b bVar = lVar.b() == ViewType.REPLY ? (l.b) lVar.a() : null;
                if (bVar != null && this.f42129d == bVar.f42160a) {
                    arrayList.addAll(bVar.f42161b.getReplyList());
                }
            }
            for (int i5 = 0; i5 <= this.f42127b; i5++) {
                GameCommentAdapterV2.this.f42113c.remove(this.f42128c - i5);
            }
            informationCommentBeanV2.setReplyList(arrayList);
            GameCommentAdapterV2.this.f42113c.add(this.f42128c - this.f42127b, GameCommentAdapterV2.this.c(this.f42129d, informationCommentBeanV2, this.f42130e.f42162c, true));
            GameCommentAdapterV2.this.notifyDataSetChanged();
            GameCommentAdapterV2.this.f42114d.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f42132b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f42133c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f42134d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l.b f42135e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f42136f;

        h(int i4, InformationCommentBeanV2 informationCommentBeanV2, String str, l.b bVar, int i5) {
            this.f42132b = i4;
            this.f42133c = informationCommentBeanV2;
            this.f42134d = str;
            this.f42135e = bVar;
            this.f42136f = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4 = 0;
            int i5 = 0;
            boolean z4 = false;
            while (i4 < this.f42132b) {
                InformationCommentBeanV2 informationCommentBeanV2 = new InformationCommentBeanV2(this.f42133c);
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
                l c5 = GameCommentAdapterV2.this.c(this.f42134d, informationCommentBeanV2, this.f42135e.f42162c, i5 == 0);
                l.b bVar = (l.b) c5.a();
                bVar.f42164e = i5;
                bVar.f42165f = z4;
                bVar.f42163d = i5 == 0;
                GameCommentAdapterV2.this.i(c5, !z4);
                GameCommentAdapterV2.this.f42113c.add(this.f42136f + i5 + 1, c5);
                i5++;
                i4 = i6;
            }
            GameCommentAdapterV2.this.f42113c.remove(this.f42136f);
            GameCommentAdapterV2.this.notifyDataSetChanged();
            GameCommentAdapterV2.this.f42114d.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i extends n {

        /* renamed from: b  reason: collision with root package name */
        private RelativeLayout f42138b;

        /* renamed from: c  reason: collision with root package name */
        private SimpleDraweeView f42139c;

        /* renamed from: d  reason: collision with root package name */
        private ImageView f42140d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f42141e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f42142f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f42143g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f42144h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f42145i;

        /* renamed from: j  reason: collision with root package name */
        public View f42146j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f42147k;

        /* renamed from: l  reason: collision with root package name */
        public VipView f42148l;

        i() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public interface j {
        void a(InformationCommentBeanV2 informationCommentBeanV2);

        void b(InformationCommentBeanV2 informationCommentBeanV2);

        void c(InformationCommentBeanV2 informationCommentBeanV2);

        void d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k extends n {

        /* renamed from: b  reason: collision with root package name */
        public LinearLayout f42150b;

        /* renamed from: c  reason: collision with root package name */
        public View f42151c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f42152d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f42153e;

        /* renamed from: f  reason: collision with root package name */
        public View f42154f;

        /* renamed from: g  reason: collision with root package name */
        public View f42155g;

        k() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        ViewType f42157a;

        /* renamed from: b  reason: collision with root package name */
        Object f42158b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public InformationCommentBeanV2 f42159a;

            public a(InformationCommentBeanV2 informationCommentBeanV2) {
                this.f42159a = informationCommentBeanV2;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public String f42160a;

            /* renamed from: b  reason: collision with root package name */
            public InformationCommentBeanV2 f42161b;

            /* renamed from: c  reason: collision with root package name */
            public int f42162c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f42163d;

            /* renamed from: e  reason: collision with root package name */
            public int f42164e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f42165f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f42166g;

            public b(String str, InformationCommentBeanV2 informationCommentBeanV2, int i4, boolean z4) {
                this.f42160a = str;
                this.f42161b = informationCommentBeanV2;
                this.f42162c = i4;
                this.f42163d = z4;
            }
        }

        public l() {
        }

        public Object a() {
            return this.f42158b;
        }

        public ViewType b() {
            return this.f42157a;
        }

        public void c(Object obj) {
            this.f42158b = obj;
        }

        public void d(ViewType viewType) {
            this.f42157a = viewType;
        }

        public l(ViewType viewType, Object obj) {
            this.f42157a = viewType;
            this.f42158b = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m {

        /* renamed from: a  reason: collision with root package name */
        private TextView f42167a;

        m() {
        }
    }

    /* loaded from: classes4.dex */
    class n {
        n() {
        }
    }

    public GameCommentAdapterV2(Context context, List<l> list, j jVar) {
        this.f42114d = null;
        this.f42112b = context;
        this.f42113c = list;
        this.f42114d = jVar;
    }

    private View f(int i4, View view, ViewGroup viewGroup) {
        k kVar;
        l.b bVar;
        try {
            if (view != null) {
                kVar = (k) view.getTag();
            } else {
                kVar = new k();
                view = LayoutInflater.from(this.f42112b).inflate(R.layout.mg_game_comment_activity_item_comment_message_reply, (ViewGroup) null);
                kVar.f42150b = (LinearLayout) view.findViewById(R.id.comment_reply_container);
                kVar.f42151c = view.findViewById(R.id.comment_reply_divider);
                kVar.f42152d = (TextView) view.findViewById(R.id.comment_reply_content);
                kVar.f42153e = (TextView) view.findViewById(R.id.comment_reply_more);
                kVar.f42154f = view.findViewById(R.id.line);
                kVar.f42155g = view.findViewById(R.id.bottom);
                view.setTag(kVar);
            }
            bVar = (l.b) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (bVar == null || bVar.f42161b == null) {
            return view;
        }
        if (bVar.f42163d) {
            kVar.f42151c.setVisibility(0);
        } else {
            kVar.f42151c.setVisibility(8);
        }
        if (!bVar.f42166g) {
            kVar.f42154f.setVisibility(0);
            kVar.f42155g.setVisibility(0);
        } else {
            kVar.f42154f.setVisibility(8);
            kVar.f42155g.setVisibility(8);
        }
        List<InformationCommentBeanV2> replyList = bVar.f42161b.getReplyList();
        if (replyList != null && replyList.size() != 0) {
            h(kVar.f42150b, bVar, true, i4);
        } else {
            kVar.f42150b.removeAllViews();
        }
        return view;
    }

    private void h(View view, l.b bVar, boolean z4, int i4) {
        View view2;
        int i5;
        boolean z5;
        int i6;
        int i7;
        String str = bVar.f42160a;
        int i8 = bVar.f42164e;
        boolean z6 = bVar.f42165f;
        InformationCommentBeanV2 informationCommentBeanV2 = bVar.f42161b;
        List<InformationCommentBeanV2> replyList = informationCommentBeanV2.getReplyList();
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.removeAllViews();
        int size = replyList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size + 1) {
            if (i10 <= 3 || !z4) {
                View inflate = LayoutInflater.from(this.f42112b).inflate(R.layout.comment_reply_item, (ViewGroup) null);
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
                        view2.setOnClickListener(new h(size, informationCommentBeanV2, str, bVar, i4));
                    } else {
                        i7 = size;
                        if (i6 < i7 && (i6 < 3 || !z4)) {
                            textView.setVisibility(0);
                            textView2.setVisibility(8);
                            InformationCommentBeanV2 informationCommentBeanV22 = replyList.get(i6);
                            String msg = informationCommentBeanV22.getMsg();
                            informationCommentBeanV22.getCommentId();
                            try {
                                textView.setText(Html.fromHtml(msg));
                                l(view2, informationCommentBeanV22);
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
                    view2.setOnClickListener(new g(i11, i4, str, bVar));
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

    private void l(View view, InformationCommentBeanV2 informationCommentBeanV2) {
        view.setOnClickListener(new e(informationCommentBeanV2));
    }

    private void m(View view, InformationCommentBeanV2 informationCommentBeanV2) {
        view.setOnClickListener(new d(informationCommentBeanV2));
    }

    private void n(View view, InformationCommentBeanV2 informationCommentBeanV2) {
        view.setOnClickListener(new f(informationCommentBeanV2));
    }

    l c(String str, InformationCommentBeanV2 informationCommentBeanV2, int i4, boolean z4) {
        return new l(ViewType.REPLY, new l.b(str, informationCommentBeanV2, i4, z4));
    }

    public View d(int i4, View view, ViewGroup viewGroup, int i5) {
        View view2;
        m mVar;
        i iVar;
        l.a aVar = (l.a) getItem(i4);
        if (view == null) {
            if (i5 != 1) {
                if (i5 == 2) {
                    i iVar2 = new i();
                    View inflate = LayoutInflater.from(this.f42112b).inflate(R.layout.gameinformation_commit_item_layout, (ViewGroup) null);
                    iVar2.f42138b = (RelativeLayout) inflate.findViewById(R.id.main);
                    iVar2.f42139c = (SimpleDraweeView) inflate.findViewById(R.id.usericon);
                    iVar2.f42140d = (ImageView) inflate.findViewById(R.id.parise);
                    iVar2.f42141e = (TextView) inflate.findViewById(R.id.username);
                    iVar2.f42142f = (TextView) inflate.findViewById(R.id.time);
                    iVar2.f42143g = (TextView) inflate.findViewById(R.id.content);
                    iVar2.f42144h = (TextView) inflate.findViewById(R.id.pariseNumber);
                    iVar2.f42145i = (TextView) inflate.findViewById(R.id.levelTv);
                    iVar2.f42148l = (VipView) inflate.findViewById(R.id.levelVip);
                    iVar2.f42146j = inflate.findViewById(R.id.line);
                    iVar2.f42147k = (TextView) inflate.findViewById(R.id.more);
                    inflate.setTag(iVar2);
                    view2 = inflate;
                    iVar = iVar2;
                    mVar = null;
                }
                view2 = view;
                mVar = null;
                iVar = null;
            } else {
                mVar = new m();
                View inflate2 = LayoutInflater.from(this.f42112b).inflate(R.layout.gameinformation_comment_item_title, (ViewGroup) null);
                mVar.f42167a = (TextView) inflate2.findViewById(R.id.title);
                inflate2.setTag(mVar);
                view2 = inflate2;
                iVar = null;
            }
        } else if (i5 != 1) {
            if (i5 == 2) {
                iVar = (i) view.getTag();
                view2 = view;
                mVar = null;
            }
            view2 = view;
            mVar = null;
            iVar = null;
        } else {
            view2 = view;
            mVar = (m) view.getTag();
            iVar = null;
        }
        if (i5 == 1) {
            InformationCommentBeanV2 informationCommentBeanV2 = aVar.f42159a;
            mVar.f42167a.setText("最新评论");
        } else if (i5 == 2) {
            if (aVar == null) {
                return null;
            }
            InformationCommentBeanV2 informationCommentBeanV22 = aVar.f42159a;
            if (informationCommentBeanV22.getReplyList() != null && informationCommentBeanV22.getReplyList().size() > 0) {
                iVar.f42146j.setVisibility(8);
            } else {
                iVar.f42146j.setVisibility(0);
            }
            iVar.f42142f.setText(com.join.android.app.common.utils.g.a(Long.parseLong(informationCommentBeanV22.getCreateTime())));
            iVar.f42143g.setText(informationCommentBeanV22.getMsg());
            iVar.f42144h.setText(informationCommentBeanV22.getLike() + "");
            if (informationCommentBeanV22.getPraise().booleanValue()) {
                iVar.f42140d.setImageResource(R.drawable.like);
            } else {
                iVar.f42140d.setImageResource(R.drawable.unlike);
            }
            if (com.join.mgps.Util.g2.i(informationCommentBeanV22.getAvatar())) {
                UtilsMy.s3(this.f42112b, informationCommentBeanV22.getAvatar(), iVar.f42139c);
            }
            iVar.f42141e.setText(Html.fromHtml(informationCommentBeanV22.getNickname()));
            m(iVar.f42140d, informationCommentBeanV22);
            n(view2, informationCommentBeanV22);
            iVar.f42139c.setOnClickListener(new a(informationCommentBeanV22));
            iVar.f42143g.post(new b(iVar));
            iVar.f42147k.setOnClickListener(new c(iVar));
        }
        return view2;
    }

    public List<l> e() {
        return this.f42113c;
    }

    public j g() {
        return this.f42114d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<l> list = this.f42113c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<l> list = this.f42113c;
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
        List<l> list = this.f42113c;
        if (list != null) {
            return list.get(i4).b().ordinal();
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i4);
        if (itemViewType == ViewType.COMMENT.ordinal()) {
            return d(i4, view, viewGroup, 2);
        }
        if (itemViewType == ViewType.TITLE.ordinal()) {
            return d(i4, view, viewGroup, 1);
        }
        return itemViewType == ViewType.REPLY.ordinal() ? f(i4, view, viewGroup) : view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return ViewType.values().length;
    }

    void i(l lVar, boolean z4) {
        if (lVar == null) {
            return;
        }
        try {
            ((l.b) lVar.a()).f42166g = z4;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void j(List<l> list) {
        if (list == null) {
            return;
        }
        if (this.f42113c == null) {
            list = new ArrayList<>();
        }
        this.f42113c.clear();
        this.f42113c.addAll(list);
    }

    public void k(j jVar) {
        this.f42114d = jVar;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    public GameCommentAdapterV2(Context context) {
        this.f42114d = null;
        this.f42112b = context;
        this.f42113c = new ArrayList();
    }
}
