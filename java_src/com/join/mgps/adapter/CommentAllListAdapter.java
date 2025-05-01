package com.join.mgps.adapter;

import android.content.Context;
import android.os.Build;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.CommentSelfListActivity_;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.CommentBaseBean;
import java.util.List;
/* loaded from: classes4.dex */
public class CommentAllListAdapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f39909b;

    /* renamed from: c  reason: collision with root package name */
    private List<i> f39910c;

    /* renamed from: d  reason: collision with root package name */
    private int f39911d;

    /* renamed from: e  reason: collision with root package name */
    private String f39912e;

    /* renamed from: f  reason: collision with root package name */
    private int f39913f;

    /* renamed from: g  reason: collision with root package name */
    private int f39914g = -1;

    /* renamed from: h  reason: collision with root package name */
    h f39915h;

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
        final /* synthetic */ CommentBaseBean f39916b;

        a(CommentBaseBean commentBaseBean) {
            this.f39916b = commentBaseBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(Integer.parseInt(this.f39916b.getUid())).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f39918b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f39919c;

        b(g gVar, CommentBaseBean commentBaseBean) {
            this.f39918b = gVar;
            this.f39919c = commentBaseBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            Layout layout = this.f39918b.f39948l.getLayout();
            if (layout == null) {
                this.f39918b.f39949m.setVisibility(8);
                return;
            }
            int lineCount = layout.getLineCount();
            if (lineCount > 0) {
                if (lineCount > 5) {
                    this.f39918b.f39949m.setVisibility(0);
                } else if (layout.getEllipsisCount(lineCount - 1) > 0) {
                    this.f39918b.f39949m.setVisibility(0);
                } else if (this.f39919c.isShowMore()) {
                    this.f39918b.f39949m.setVisibility(0);
                } else {
                    this.f39918b.f39949m.setVisibility(8);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f39921b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f39922c;

        c(g gVar, CommentBaseBean commentBaseBean) {
            this.f39921b = gVar;
            this.f39922c = commentBaseBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f39921b.f39949m.getText().toString().equals("查看全部")) {
                if (Build.VERSION.SDK_INT == 19) {
                    this.f39921b.f39948l.setText(this.f39922c.getContent());
                }
                this.f39921b.f39948l.setMaxLines(Integer.MAX_VALUE);
                this.f39921b.f39949m.setText("收起");
                this.f39922c.setShowMore(true);
                return;
            }
            if (Build.VERSION.SDK_INT == 19) {
                this.f39921b.f39948l.setText(this.f39922c.getContent().replaceAll("\n", ""));
            }
            this.f39921b.f39948l.setMaxLines(5);
            this.f39921b.f39949m.setText("查看全部");
            this.f39922c.setShowMore(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f39924b;

        d(CommentBaseBean commentBaseBean) {
            this.f39924b = commentBaseBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h hVar;
            CommentBaseBean commentBaseBean = this.f39924b;
            if (commentBaseBean == null || (hVar = CommentAllListAdapter.this.f39915h) == null) {
                return;
            }
            hVar.d(commentBaseBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f39926b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f39927c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ImageView f39928d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TextView f39929e;

        /* loaded from: classes4.dex */
        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                long longValue = Long.valueOf(e.this.f39929e.getText().toString()).longValue();
                TextView textView = e.this.f39929e;
                textView.setText((longValue + 1) + "");
                e eVar = e.this;
                CommentAllListAdapter.this.c(eVar.f39927c);
                e eVar2 = e.this;
                h hVar = CommentAllListAdapter.this.f39915h;
                if (hVar != null) {
                    hVar.b(eVar2.f39926b, eVar2.f39927c, 1);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        e(CommentBaseBean commentBaseBean, int i4, ImageView imageView, TextView textView) {
            this.f39926b = commentBaseBean;
            this.f39927c = i4;
            this.f39928d = imageView;
            this.f39929e = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentBaseBean commentBaseBean;
            if (IntentUtil.getInstance().goLoginInteractive(CommentAllListAdapter.this.f39909b) || (commentBaseBean = this.f39926b) == null) {
                return;
            }
            if (commentBaseBean.getIs_praise() == 1) {
                CommentAllListAdapter.this.p(this.f39927c);
                this.f39928d.setImageResource(R.drawable.up_ic);
                h hVar = CommentAllListAdapter.this.f39915h;
                if (hVar != null) {
                    hVar.b(this.f39926b, this.f39927c, 2);
                    return;
                }
                return;
            }
            this.f39926b.setIs_praise(1);
            if (AccountUtil_.getInstance_(CommentAllListAdapter.this.f39909b).getAccountData() == null) {
                IntentUtil.getInstance().goLoginInteractive(CommentAllListAdapter.this.f39909b);
                return;
            }
            this.f39928d.setImageResource(R.drawable.uped_ic);
            Animation loadAnimation = AnimationUtils.loadAnimation(CommentAllListAdapter.this.f39909b, R.anim.scale_reset);
            this.f39928d.startAnimation(loadAnimation);
            loadAnimation.setAnimationListener(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f39932b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f39933c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ImageView f39934d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TextView f39935e;

        /* loaded from: classes4.dex */
        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                long longValue = Long.valueOf(f.this.f39935e.getText().toString()).longValue();
                TextView textView = f.this.f39935e;
                textView.setText((longValue + 1) + "");
                f fVar = f.this;
                CommentAllListAdapter.this.b(fVar.f39933c);
                f fVar2 = f.this;
                h hVar = CommentAllListAdapter.this.f39915h;
                if (hVar != null) {
                    hVar.c(fVar2.f39932b, fVar2.f39933c, 1);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        f(CommentBaseBean commentBaseBean, int i4, ImageView imageView, TextView textView) {
            this.f39932b = commentBaseBean;
            this.f39933c = i4;
            this.f39934d = imageView;
            this.f39935e = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentBaseBean commentBaseBean;
            if (IntentUtil.getInstance().goLoginInteractive(CommentAllListAdapter.this.f39909b) || (commentBaseBean = this.f39932b) == null) {
                return;
            }
            if (commentBaseBean.getIs_despise() == 1) {
                CommentAllListAdapter.this.o(this.f39933c);
                this.f39934d.setImageResource(R.drawable.down_ic);
                h hVar = CommentAllListAdapter.this.f39915h;
                if (hVar != null) {
                    hVar.c(this.f39932b, this.f39933c, 2);
                    return;
                }
                return;
            }
            this.f39932b.setIs_despise(1);
            if (AccountUtil_.getInstance_(CommentAllListAdapter.this.f39909b).getAccountData() == null) {
                IntentUtil.getInstance().goLoginInteractive(CommentAllListAdapter.this.f39909b);
                return;
            }
            this.f39934d.setImageResource(R.drawable.downed_ic);
            Animation loadAnimation = AnimationUtils.loadAnimation(CommentAllListAdapter.this.f39909b, R.anim.scale_reset);
            this.f39934d.startAnimation(loadAnimation);
            loadAnimation.setAnimationListener(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends j {

        /* renamed from: b  reason: collision with root package name */
        private LinearLayout f39938b;

        /* renamed from: c  reason: collision with root package name */
        private SimpleDraweeView f39939c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f39940d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f39941e;

        /* renamed from: f  reason: collision with root package name */
        private ImageView f39942f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f39943g;

        /* renamed from: h  reason: collision with root package name */
        private MStarBar f39944h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f39945i;

        /* renamed from: j  reason: collision with root package name */
        private TextView f39946j;

        /* renamed from: k  reason: collision with root package name */
        private ImageView f39947k;

        /* renamed from: l  reason: collision with root package name */
        private TextView f39948l;

        /* renamed from: m  reason: collision with root package name */
        private TextView f39949m;

        /* renamed from: n  reason: collision with root package name */
        public View f39950n;

        /* renamed from: o  reason: collision with root package name */
        private TextView f39951o;

        /* renamed from: p  reason: collision with root package name */
        private ImageView f39952p;

        /* renamed from: q  reason: collision with root package name */
        private TextView f39953q;

        /* renamed from: r  reason: collision with root package name */
        private ImageView f39954r;

        /* renamed from: s  reason: collision with root package name */
        private TextView f39955s;

        /* renamed from: t  reason: collision with root package name */
        private ImageView f39956t;

        /* renamed from: u  reason: collision with root package name */
        private TextView f39957u;

        /* renamed from: v  reason: collision with root package name */
        private VipView f39958v;

        g() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public interface h {
        void b(CommentBaseBean commentBaseBean, int i4, int i5);

        void c(CommentBaseBean commentBaseBean, int i4, int i5);

        void d(CommentBaseBean commentBaseBean);
    }

    /* loaded from: classes4.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        ViewType f39960a;

        /* renamed from: b  reason: collision with root package name */
        Object f39961b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public CommentBaseBean f39962a;

            public a(CommentBaseBean commentBaseBean) {
                this.f39962a = commentBaseBean;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public String f39963a;

            /* renamed from: b  reason: collision with root package name */
            public CommentBaseBean f39964b;

            /* renamed from: c  reason: collision with root package name */
            public int f39965c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f39966d;

            /* renamed from: e  reason: collision with root package name */
            public int f39967e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f39968f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f39969g;

            public b(String str, CommentBaseBean commentBaseBean, int i4, boolean z4) {
                this.f39963a = str;
                this.f39964b = commentBaseBean;
                this.f39965c = i4;
                this.f39966d = z4;
            }
        }

        public i() {
        }

        public Object a() {
            return this.f39961b;
        }

        public ViewType b() {
            return this.f39960a;
        }

        public void c(Object obj) {
            this.f39961b = obj;
        }

        public void d(ViewType viewType) {
            this.f39960a = viewType;
        }

        public i(ViewType viewType, Object obj) {
            this.f39960a = viewType;
            this.f39961b = obj;
        }
    }

    /* loaded from: classes4.dex */
    class j {
        j() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k {

        /* renamed from: a  reason: collision with root package name */
        public TextView f39971a;

        /* renamed from: b  reason: collision with root package name */
        public LinearLayout f39972b;

        /* renamed from: c  reason: collision with root package name */
        public View f39973c;

        /* renamed from: d  reason: collision with root package name */
        public View f39974d;

        k() {
        }
    }

    public CommentAllListAdapter(Context context, int i4, List<i> list, String str, int i5, h hVar) {
        this.f39915h = null;
        this.f39909b = context;
        this.f39911d = i4;
        this.f39912e = str;
        this.f39913f = i5;
        this.f39910c = list;
        this.f39915h = hVar;
    }

    private View e(int i4, View view, ViewGroup viewGroup, int i5) {
        g gVar;
        String str;
        i.a aVar = (i.a) getItem(i4);
        k kVar = null;
        if (view == null) {
            if (i5 != 1) {
                if (i5 == 2) {
                    g gVar2 = new g();
                    View inflate = LayoutInflater.from(this.f39909b).inflate(R.layout.comment_list_item_view, (ViewGroup) null);
                    gVar2.f39938b = (LinearLayout) inflate.findViewById(R.id.commentAllRootLl);
                    gVar2.f39939c = (SimpleDraweeView) inflate.findViewById(R.id.usericon);
                    gVar2.f39940d = (TextView) inflate.findViewById(R.id.userName);
                    gVar2.f39941e = (TextView) inflate.findViewById(R.id.isMe);
                    gVar2.f39958v = (VipView) inflate.findViewById(R.id.levelTv);
                    gVar2.f39942f = (ImageView) inflate.findViewById(R.id.isAuth);
                    gVar2.f39947k = (ImageView) inflate.findViewById(R.id.isGood);
                    gVar2.f39943g = (TextView) inflate.findViewById(R.id.isConnoisseurs);
                    gVar2.f39944h = (MStarBar) inflate.findViewById(R.id.comment_head_mstarBar);
                    gVar2.f39945i = (TextView) inflate.findViewById(R.id.comment_head_num_tx);
                    gVar2.f39946j = (TextView) inflate.findViewById(R.id.time);
                    gVar2.f39948l = (TextView) inflate.findViewById(R.id.content);
                    gVar2.f39949m = (TextView) inflate.findViewById(R.id.more);
                    gVar2.f39950n = inflate.findViewById(R.id.line);
                    gVar2.f39951o = (TextView) inflate.findViewById(R.id.phoneModle);
                    gVar2.f39952p = (ImageView) inflate.findViewById(R.id.parise);
                    gVar2.f39953q = (TextView) inflate.findViewById(R.id.pariseNumber);
                    gVar2.f39954r = (ImageView) inflate.findViewById(R.id.down);
                    gVar2.f39955s = (TextView) inflate.findViewById(R.id.downNumber);
                    gVar2.f39956t = (ImageView) inflate.findViewById(R.id.message);
                    gVar2.f39957u = (TextView) inflate.findViewById(R.id.messageNumber);
                    inflate.setTag(gVar2);
                    gVar = gVar2;
                    view = inflate;
                }
                gVar = null;
            } else {
                k kVar2 = new k();
                View inflate2 = LayoutInflater.from(this.f39909b).inflate(R.layout.gamedetail_item_title, (ViewGroup) null);
                kVar2.f39971a = (TextView) inflate2.findViewById(R.id.titleText);
                kVar2.f39973c = inflate2.findViewById(R.id.layoutTop);
                inflate2.setTag(kVar2);
                kVar = kVar2;
                view = inflate2;
                gVar = null;
            }
        } else if (i5 != 1) {
            if (i5 == 2) {
                gVar = (g) view.getTag();
            }
            gVar = null;
        } else {
            gVar = null;
            kVar = (k) view.getTag();
        }
        if (aVar == null) {
            return view;
        }
        CommentBaseBean commentBaseBean = aVar.f39962a;
        if (i5 == 1) {
            if (commentBaseBean.getIs_hot() == 1) {
                kVar.f39971a.setText("热门点评");
            } else {
                kVar.f39971a.setText("最新点评");
            }
            kVar.f39973c.setVisibility(8);
        } else if (i5 == 2) {
            gVar.f39940d.setTextColor(-16777216);
            if (commentBaseBean.getVip_level() > 0) {
                gVar.f39940d.setTextColor(this.f39909b.getResources().getColor(R.color.vip_color));
            }
            if (commentBaseBean.getSvip_level() > 0) {
                gVar.f39940d.setTextColor(this.f39909b.getResources().getColor(R.color.vip_svip_color));
            }
            gVar.f39958v.setVipData(commentBaseBean.getVip_level(), commentBaseBean.getSvip_level());
            if (commentBaseBean.getUid().equals(String.valueOf(this.f39911d))) {
                gVar.f39941e.setVisibility(0);
                this.f39914g = i4;
            } else {
                gVar.f39941e.setVisibility(8);
            }
            gVar.f39940d.setText(commentBaseBean.getUser_name());
            if (Build.VERSION.SDK_INT == 19) {
                gVar.f39948l.setText(commentBaseBean.getContent().replaceAll("\n", ""));
            } else {
                gVar.f39948l.setText(commentBaseBean.getContent());
            }
            if (commentBaseBean.getIs_old() == 1 || commentBaseBean.getMobile_phone_model() == null || commentBaseBean.getMobile_phone_model().isEmpty()) {
                gVar.f39951o.setVisibility(4);
            } else {
                gVar.f39951o.setVisibility(0);
                gVar.f39951o.setText(commentBaseBean.getMobile_phone_model());
            }
            gVar.f39953q.setText(commentBaseBean.getPraise_count() + "");
            gVar.f39955s.setText(commentBaseBean.getDespise_count() + "");
            gVar.f39957u.setText(commentBaseBean.getReply_count() + "");
            gVar.f39946j.setText(com.join.android.app.common.utils.g.a(Long.parseLong(commentBaseBean.getAdd_times() + "000")));
            if (commentBaseBean.getIs_old() == 1 || Float.valueOf(commentBaseBean.getStars_score()).floatValue() == 0.0f || ((str = this.f39912e) != null && !str.equals("1"))) {
                gVar.f39944h.setVisibility(8);
            } else {
                gVar.f39944h.setVisibility(0);
                gVar.f39944h.setStarCount(Integer.parseInt(commentBaseBean.getStars_score()));
                gVar.f39944h.setStarMark(Float.valueOf(commentBaseBean.getStars_score()).floatValue());
            }
            if (this.f39913f != 1) {
                gVar.f39945i.setVisibility(8);
            } else if (commentBaseBean.getIs_old() == 0) {
                gVar.f39945i.setVisibility(0);
                gVar.f39945i.setText("启动游戏 " + commentBaseBean.getStart_game_count() + " 次");
            } else {
                gVar.f39945i.setVisibility(8);
            }
            gVar.f39944h.setEnabled(false);
            if (commentBaseBean.getApproval_rate() == null || Double.valueOf(commentBaseBean.getApproval_rate()).doubleValue() <= 70.0d) {
                gVar.f39947k.setVisibility(8);
            } else {
                gVar.f39947k.setVisibility(0);
            }
            if (commentBaseBean.getRank().equals("")) {
                gVar.f39942f.setVisibility(8);
            } else {
                gVar.f39942f.setVisibility(0);
            }
            gVar.f39943g.setText(commentBaseBean.getRank());
            if (commentBaseBean.getIs_praise() == 1) {
                gVar.f39952p.setImageResource(R.drawable.uped_ic);
            } else {
                gVar.f39952p.setImageResource(R.drawable.up_ic);
            }
            if (commentBaseBean.getIs_despise() == 1) {
                gVar.f39954r.setImageResource(R.drawable.downed_ic);
            } else {
                gVar.f39954r.setImageResource(R.drawable.down_ic);
            }
            UtilsMy.s3(this.f39909b, commentBaseBean.getHead_portrait(), gVar.f39939c);
            gVar.f39939c.setOnClickListener(new a(commentBaseBean));
            m(gVar.f39952p, gVar.f39953q, commentBaseBean, i4);
            n(gVar.f39954r, gVar.f39955s, commentBaseBean, i4);
            l(gVar.f39956t, commentBaseBean);
            l(gVar.f39938b, commentBaseBean);
            if (commentBaseBean.isShowMore()) {
                gVar.f39949m.setText("收起");
                gVar.f39948l.setMaxLines(Integer.MAX_VALUE);
            } else {
                gVar.f39949m.setText("查看全部");
                gVar.f39948l.setMaxLines(5);
            }
            gVar.f39948l.post(new b(gVar, commentBaseBean));
            gVar.f39949m.setOnClickListener(new c(gVar, commentBaseBean));
        }
        return view;
    }

    private void l(View view, CommentBaseBean commentBaseBean) {
        view.setOnClickListener(new d(commentBaseBean));
    }

    private void m(ImageView imageView, TextView textView, CommentBaseBean commentBaseBean, int i4) {
        e eVar = new e(commentBaseBean, i4, imageView, textView);
        imageView.setOnClickListener(eVar);
        textView.setOnClickListener(eVar);
    }

    private void n(ImageView imageView, TextView textView, CommentBaseBean commentBaseBean, int i4) {
        f fVar = new f(commentBaseBean, i4, imageView, textView);
        imageView.setOnClickListener(fVar);
        textView.setOnClickListener(fVar);
    }

    public void b(int i4) {
        i.a aVar = (i.a) getItem(i4);
        long longValue = Long.valueOf(aVar.f39962a.getDespise_count()).longValue();
        aVar.f39962a.setIs_despise(1);
        CommentBaseBean commentBaseBean = aVar.f39962a;
        commentBaseBean.setDespise_count((longValue + 1) + "");
        notifyDataSetChanged();
    }

    public void c(int i4) {
        i.a aVar = (i.a) getItem(i4);
        long praise_count = aVar.f39962a.getPraise_count();
        aVar.f39962a.setIs_praise(1);
        aVar.f39962a.setPraise_count(praise_count + 1);
        notifyDataSetChanged();
    }

    public void d(com.join.mgps.event.j jVar) {
        if (this.f39914g == -1) {
            return;
        }
        if (jVar.getType() == 1) {
            this.f39910c.remove(this.f39914g);
        } else {
            i.a aVar = (i.a) getItem(this.f39914g);
            aVar.f39962a.setContent(jVar.a());
            aVar.f39962a.setMobile_phone_model(jVar.b());
            aVar.f39962a.setStars_score(String.valueOf(jVar.c()));
        }
        notifyDataSetChanged();
    }

    public i.a f() {
        return (i.a) getItem(this.f39914g);
    }

    public int g() {
        if (this.f39914g == -1) {
            int i4 = 0;
            while (true) {
                if (i4 < this.f39910c.size()) {
                    if (this.f39910c.get(i4).b() == ViewType.COMMENT && ((i.a) this.f39910c.get(i4).a()).f39962a.getUid().equals(String.valueOf(this.f39911d))) {
                        this.f39914g = i4;
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
        }
        return this.f39914g;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<i> list = this.f39910c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<i> list = this.f39910c;
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
        List<i> list = this.f39910c;
        if (list != null) {
            return list.get(i4).b().ordinal();
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i4);
        if (itemViewType == ViewType.COMMENT.ordinal()) {
            return e(i4, view, viewGroup, 2);
        }
        return itemViewType == ViewType.TITLE.ordinal() ? e(i4, view, viewGroup, 1) : view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return ViewType.values().length;
    }

    public h h() {
        return this.f39915h;
    }

    public void i(int i4, int i5) {
        i.a aVar = (i.a) getItem(i4);
        long longValue = Long.valueOf(aVar.f39962a.getDespise_count()).longValue();
        if (aVar.f39962a.getIs_despise() == 1) {
            aVar.f39962a.setIs_despise(0);
            long j4 = longValue - 1;
            if (j4 < 0) {
                aVar.f39962a.setDespise_count("0");
            } else {
                CommentBaseBean commentBaseBean = aVar.f39962a;
                commentBaseBean.setDespise_count(j4 + "");
            }
        } else if (i5 != 1) {
            aVar.f39962a.setIs_despise(1);
            CommentBaseBean commentBaseBean2 = aVar.f39962a;
            commentBaseBean2.setDespise_count((longValue + 1) + "");
        }
        notifyDataSetChanged();
    }

    public void j(int i4, int i5) {
        i.a aVar = (i.a) getItem(i4);
        long praise_count = aVar.f39962a.getPraise_count();
        if (aVar.f39962a.getIs_praise() == 1) {
            aVar.f39962a.setIs_praise(0);
            long j4 = praise_count - 1;
            if (j4 < 0) {
                aVar.f39962a.setPraise_count(0L);
            } else {
                aVar.f39962a.setPraise_count(j4);
            }
        } else if (i5 != 1) {
            aVar.f39962a.setIs_praise(1);
            aVar.f39962a.setPraise_count(praise_count + 1);
        }
        notifyDataSetChanged();
    }

    public void k(h hVar) {
        this.f39915h = hVar;
    }

    public void o(int i4) {
        i.a aVar = (i.a) getItem(i4);
        long longValue = Long.valueOf(aVar.f39962a.getDespise_count()).longValue();
        aVar.f39962a.setIs_despise(0);
        long j4 = longValue - 1;
        if (j4 < 0) {
            aVar.f39962a.setDespise_count("0");
        } else {
            CommentBaseBean commentBaseBean = aVar.f39962a;
            commentBaseBean.setDespise_count(j4 + "");
        }
        notifyDataSetChanged();
    }

    public void p(int i4) {
        i.a aVar = (i.a) getItem(i4);
        long praise_count = aVar.f39962a.getPraise_count();
        aVar.f39962a.setIs_praise(0);
        long j4 = praise_count - 1;
        if (j4 < 0) {
            aVar.f39962a.setPraise_count(0L);
        } else {
            aVar.f39962a.setPraise_count(j4);
        }
        notifyDataSetChanged();
    }
}
