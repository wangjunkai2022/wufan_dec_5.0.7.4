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
import com.join.mgps.dto.InformationCommentBean;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class GameCommentAdapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f42054b;

    /* renamed from: c  reason: collision with root package name */
    private List<l> f42055c;

    /* renamed from: d  reason: collision with root package name */
    j f42056d;

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
        final /* synthetic */ InformationCommentBean f42057b;

        a(InformationCommentBean informationCommentBean) {
            this.f42057b = informationCommentBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(Integer.parseInt(this.f42057b.getUser_id())).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f42059b;

        b(i iVar) {
            this.f42059b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Layout layout = this.f42059b.f42085g.getLayout();
            if (layout != null) {
                int lineCount = layout.getLineCount();
                if (lineCount > 0) {
                    if (layout.getEllipsisCount(lineCount - 1) > 0) {
                        this.f42059b.f42089k.setVisibility(0);
                        return;
                    } else {
                        this.f42059b.f42089k.setVisibility(8);
                        return;
                    }
                }
                return;
            }
            this.f42059b.f42089k.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f42061b;

        c(i iVar) {
            this.f42061b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42061b.f42089k.getText().toString().equals("查看全部")) {
                this.f42061b.f42085g.setMaxLines(Integer.MAX_VALUE);
                this.f42061b.f42089k.setText("收起");
            } else {
                this.f42061b.f42085g.setMaxLines(5);
                this.f42061b.f42089k.setText("查看全部");
            }
            this.f42061b.f42089k.postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f42063b;

        d(InformationCommentBean informationCommentBean) {
            this.f42063b = informationCommentBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42063b.isHasPraised()) {
                com.join.mgps.Util.l2.a(GameCommentAdapter.this.f42054b).b("你已赞过");
            } else if (IntentUtil.getInstance().goLoginInteractive(GameCommentAdapter.this.f42054b)) {
            } else {
                ((ImageView) view).setImageResource(R.drawable.like);
                view.startAnimation(AnimationUtils.loadAnimation(GameCommentAdapter.this.f42054b, R.anim.scale_reset));
                j jVar = GameCommentAdapter.this.f42056d;
                if (jVar != null) {
                    jVar.a(this.f42063b);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean.Sub f42065b;

        e(InformationCommentBean.Sub sub) {
            this.f42065b = sub;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j jVar = GameCommentAdapter.this.f42056d;
            if (jVar != null) {
                jVar.e(this.f42065b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f42067b;

        f(InformationCommentBean informationCommentBean) {
            this.f42067b = informationCommentBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j jVar = GameCommentAdapter.this.f42056d;
            if (jVar != null) {
                jVar.f(this.f42067b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f42069b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42070c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f42071d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l.b f42072e;

        g(int i4, int i5, String str, l.b bVar) {
            this.f42069b = i4;
            this.f42070c = i5;
            this.f42071d = str;
            this.f42072e = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42069b == 0) {
                return;
            }
            InformationCommentBean informationCommentBean = new InformationCommentBean();
            ArrayList arrayList = new ArrayList();
            for (int i4 = this.f42069b; i4 >= 0; i4--) {
                l lVar = (l) GameCommentAdapter.this.f42055c.get(this.f42070c - i4);
                l.b bVar = lVar.b() == ViewType.REPLY ? (l.b) lVar.a() : null;
                if (bVar != null && this.f42071d == bVar.f42102a) {
                    arrayList.addAll(bVar.f42103b.getSub());
                }
            }
            for (int i5 = 0; i5 <= this.f42069b; i5++) {
                GameCommentAdapter.this.f42055c.remove(this.f42070c - i5);
            }
            informationCommentBean.setSub(arrayList);
            GameCommentAdapter.this.f42055c.add(this.f42070c - this.f42069b, GameCommentAdapter.this.c(this.f42071d, informationCommentBean, this.f42072e.f42104c, true));
            GameCommentAdapter.this.notifyDataSetChanged();
            GameCommentAdapter.this.f42056d.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f42074b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f42075c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f42076d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l.b f42077e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f42078f;

        h(int i4, InformationCommentBean informationCommentBean, String str, l.b bVar, int i5) {
            this.f42074b = i4;
            this.f42075c = informationCommentBean;
            this.f42076d = str;
            this.f42077e = bVar;
            this.f42078f = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4 = 0;
            int i5 = 0;
            boolean z4 = false;
            while (i4 < this.f42074b) {
                InformationCommentBean informationCommentBean = new InformationCommentBean(this.f42075c);
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
                l c5 = GameCommentAdapter.this.c(this.f42076d, informationCommentBean, this.f42077e.f42104c, i5 == 0);
                l.b bVar = (l.b) c5.a();
                bVar.f42106e = i5;
                bVar.f42107f = z4;
                bVar.f42105d = i5 == 0;
                GameCommentAdapter.this.i(c5, !z4);
                GameCommentAdapter.this.f42055c.add(this.f42078f + i5 + 1, c5);
                i5++;
                i4 = i6;
            }
            GameCommentAdapter.this.f42055c.remove(this.f42078f);
            GameCommentAdapter.this.notifyDataSetChanged();
            GameCommentAdapter.this.f42056d.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i extends n {

        /* renamed from: b  reason: collision with root package name */
        private RelativeLayout f42080b;

        /* renamed from: c  reason: collision with root package name */
        private SimpleDraweeView f42081c;

        /* renamed from: d  reason: collision with root package name */
        private ImageView f42082d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f42083e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f42084f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f42085g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f42086h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f42087i;

        /* renamed from: j  reason: collision with root package name */
        public View f42088j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f42089k;

        /* renamed from: l  reason: collision with root package name */
        public VipView f42090l;

        i() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public interface j {
        void a(InformationCommentBean informationCommentBean);

        void d();

        void e(InformationCommentBean.Sub sub);

        void f(InformationCommentBean informationCommentBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k extends n {

        /* renamed from: b  reason: collision with root package name */
        public LinearLayout f42092b;

        /* renamed from: c  reason: collision with root package name */
        public View f42093c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f42094d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f42095e;

        /* renamed from: f  reason: collision with root package name */
        public View f42096f;

        /* renamed from: g  reason: collision with root package name */
        public View f42097g;

        k() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        ViewType f42099a;

        /* renamed from: b  reason: collision with root package name */
        Object f42100b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public InformationCommentBean f42101a;

            public a(InformationCommentBean informationCommentBean) {
                this.f42101a = informationCommentBean;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public String f42102a;

            /* renamed from: b  reason: collision with root package name */
            public InformationCommentBean f42103b;

            /* renamed from: c  reason: collision with root package name */
            public int f42104c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f42105d;

            /* renamed from: e  reason: collision with root package name */
            public int f42106e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f42107f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f42108g;

            public b(String str, InformationCommentBean informationCommentBean, int i4, boolean z4) {
                this.f42102a = str;
                this.f42103b = informationCommentBean;
                this.f42104c = i4;
                this.f42105d = z4;
            }
        }

        public l() {
        }

        public Object a() {
            return this.f42100b;
        }

        public ViewType b() {
            return this.f42099a;
        }

        public void c(Object obj) {
            this.f42100b = obj;
        }

        public void d(ViewType viewType) {
            this.f42099a = viewType;
        }

        public l(ViewType viewType, Object obj) {
            this.f42099a = viewType;
            this.f42100b = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m {

        /* renamed from: a  reason: collision with root package name */
        private TextView f42109a;

        m() {
        }
    }

    /* loaded from: classes4.dex */
    class n {
        n() {
        }
    }

    public GameCommentAdapter(Context context, List<l> list, j jVar) {
        this.f42056d = null;
        this.f42054b = context;
        this.f42055c = list;
        this.f42056d = jVar;
    }

    private View f(int i4, View view, ViewGroup viewGroup) {
        k kVar;
        l.b bVar;
        try {
            if (view != null) {
                kVar = (k) view.getTag();
            } else {
                kVar = new k();
                view = LayoutInflater.from(this.f42054b).inflate(R.layout.mg_game_comment_activity_item_comment_message_reply, (ViewGroup) null);
                kVar.f42092b = (LinearLayout) view.findViewById(R.id.comment_reply_container);
                kVar.f42093c = view.findViewById(R.id.comment_reply_divider);
                kVar.f42094d = (TextView) view.findViewById(R.id.comment_reply_content);
                kVar.f42095e = (TextView) view.findViewById(R.id.comment_reply_more);
                kVar.f42096f = view.findViewById(R.id.line);
                kVar.f42097g = view.findViewById(R.id.bottom);
                view.setTag(kVar);
            }
            bVar = (l.b) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (bVar == null || bVar.f42103b == null) {
            return view;
        }
        if (bVar.f42105d) {
            kVar.f42093c.setVisibility(0);
        } else {
            kVar.f42093c.setVisibility(8);
        }
        if (!bVar.f42108g) {
            kVar.f42096f.setVisibility(0);
            kVar.f42097g.setVisibility(0);
        } else {
            kVar.f42096f.setVisibility(8);
            kVar.f42097g.setVisibility(8);
        }
        List<InformationCommentBean.Sub> sub = bVar.f42103b.getSub();
        if (sub != null && sub.size() != 0) {
            h(kVar.f42092b, bVar, true, i4);
        } else {
            kVar.f42092b.removeAllViews();
        }
        return view;
    }

    private void h(View view, l.b bVar, boolean z4, int i4) {
        View view2;
        int i5;
        boolean z5;
        int i6;
        int i7;
        String str = bVar.f42102a;
        int i8 = bVar.f42106e;
        boolean z6 = bVar.f42107f;
        InformationCommentBean informationCommentBean = bVar.f42103b;
        List<InformationCommentBean.Sub> sub = informationCommentBean.getSub();
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.removeAllViews();
        int size = sub.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size + 1) {
            if (i10 <= 3 || !z4) {
                View inflate = LayoutInflater.from(this.f42054b).inflate(R.layout.comment_reply_item, (ViewGroup) null);
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
                        view2.setOnClickListener(new h(size, informationCommentBean, str, bVar, i4));
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
                                l(view2, sub2);
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

    private void l(View view, InformationCommentBean.Sub sub) {
        view.setOnClickListener(new e(sub));
    }

    private void m(View view, InformationCommentBean informationCommentBean) {
        view.setOnClickListener(new d(informationCommentBean));
    }

    private void n(View view, InformationCommentBean informationCommentBean) {
        view.setOnClickListener(new f(informationCommentBean));
    }

    l c(String str, InformationCommentBean informationCommentBean, int i4, boolean z4) {
        return new l(ViewType.REPLY, new l.b(str, informationCommentBean, i4, z4));
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
                    View inflate = LayoutInflater.from(this.f42054b).inflate(R.layout.gameinformation_commit_item_layout, (ViewGroup) null);
                    iVar2.f42080b = (RelativeLayout) inflate.findViewById(R.id.main);
                    iVar2.f42081c = (SimpleDraweeView) inflate.findViewById(R.id.usericon);
                    iVar2.f42082d = (ImageView) inflate.findViewById(R.id.parise);
                    iVar2.f42083e = (TextView) inflate.findViewById(R.id.username);
                    iVar2.f42084f = (TextView) inflate.findViewById(R.id.time);
                    iVar2.f42085g = (TextView) inflate.findViewById(R.id.content);
                    iVar2.f42086h = (TextView) inflate.findViewById(R.id.pariseNumber);
                    iVar2.f42087i = (TextView) inflate.findViewById(R.id.levelTv);
                    iVar2.f42090l = (VipView) inflate.findViewById(R.id.levelVip);
                    iVar2.f42088j = inflate.findViewById(R.id.line);
                    iVar2.f42089k = (TextView) inflate.findViewById(R.id.more);
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
                View inflate2 = LayoutInflater.from(this.f42054b).inflate(R.layout.gameinformation_comment_item_title, (ViewGroup) null);
                mVar.f42109a = (TextView) inflate2.findViewById(R.id.title);
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
        if (i5 != 1) {
            if (i5 == 2) {
                if (aVar == null) {
                    return null;
                }
                InformationCommentBean informationCommentBean = aVar.f42101a;
                if (informationCommentBean.getSub() != null && informationCommentBean.getSub().size() > 0) {
                    iVar.f42088j.setVisibility(8);
                } else {
                    iVar.f42088j.setVisibility(0);
                }
                iVar.f42084f.setText(com.join.android.app.common.utils.g.a(Long.parseLong(informationCommentBean.getTimes() + "000")));
                iVar.f42085g.setText(informationCommentBean.getContent());
                iVar.f42086h.setText(informationCommentBean.getPraise_count() + "");
                if (informationCommentBean.isHasPraised()) {
                    iVar.f42082d.setImageResource(R.drawable.like);
                } else {
                    iVar.f42082d.setImageResource(R.drawable.unlike);
                }
                if (com.join.mgps.Util.g2.i(informationCommentBean.getHead_portrait())) {
                    UtilsMy.s3(this.f42054b, informationCommentBean.getHead_portrait(), iVar.f42081c);
                }
                com.join.mgps.Util.s.h(informationCommentBean.getUser_level(), iVar.f42087i);
                iVar.f42087i.setText("LV." + informationCommentBean.getUser_level());
                iVar.f42083e.setText(Html.fromHtml(informationCommentBean.getUser_name()));
                UtilsMy.z3(iVar.f42083e.getContext(), iVar.f42083e, informationCommentBean.getUser_vip_level(), informationCommentBean.getUser_svip_level());
                iVar.f42090l.setVipData(informationCommentBean.getUser_vip_level(), informationCommentBean.getUser_svip_level());
                m(iVar.f42082d, informationCommentBean);
                n(view2, informationCommentBean);
                iVar.f42081c.setOnClickListener(new a(informationCommentBean));
                iVar.f42085g.post(new b(iVar));
                iVar.f42089k.setOnClickListener(new c(iVar));
            }
        } else if (aVar.f42101a.getIs_hot() == 1) {
            mVar.f42109a.setText("热门评论");
        } else {
            mVar.f42109a.setText("最新评论");
        }
        return view2;
    }

    public List<l> e() {
        return this.f42055c;
    }

    public j g() {
        return this.f42056d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<l> list = this.f42055c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<l> list = this.f42055c;
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
        List<l> list = this.f42055c;
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
            ((l.b) lVar.a()).f42108g = z4;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void j(List<l> list) {
        if (list == null) {
            return;
        }
        if (this.f42055c == null) {
            list = new ArrayList<>();
        }
        this.f42055c.clear();
        this.f42055c.addAll(list);
    }

    public void k(j jVar) {
        this.f42056d = jVar;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    public GameCommentAdapter(Context context) {
        this.f42056d = null;
        this.f42054b = context;
        this.f42055c = new ArrayList();
    }
}
