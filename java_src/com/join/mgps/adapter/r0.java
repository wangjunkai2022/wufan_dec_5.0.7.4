package com.join.mgps.adapter;

import android.content.Context;
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
import com.join.mgps.adapter.GameDetialModleFourAdapter;
import com.join.mgps.customview.ExpandLayout;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.CommentBaseBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GameDetailHotCommentAdapter.java */
/* loaded from: classes4.dex */
public class r0 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f45740b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f45741c;

    /* renamed from: d  reason: collision with root package name */
    private List<CommentBaseBean> f45742d;

    /* renamed from: e  reason: collision with root package name */
    boolean f45743e;

    /* renamed from: f  reason: collision with root package name */
    GameDetialModleFourAdapter.p1 f45744f;

    /* renamed from: g  reason: collision with root package name */
    long f45745g;

    /* compiled from: GameDetailHotCommentAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f45746b;

        a(CommentBaseBean commentBaseBean) {
            this.f45746b = commentBaseBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(Integer.parseInt(this.f45746b.getUid())).start();
        }
    }

    /* compiled from: GameDetailHotCommentAdapter.java */
    /* loaded from: classes4.dex */
    class b implements ExpandLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f45748a;

        b(CommentBaseBean commentBaseBean) {
            this.f45748a = commentBaseBean;
        }

        @Override // com.join.mgps.customview.ExpandLayout.b
        public void a() {
        }

        @Override // com.join.mgps.customview.ExpandLayout.b
        public void b() {
            GameDetialModleFourAdapter.p1 p1Var;
            CommentBaseBean commentBaseBean = this.f45748a;
            if (commentBaseBean == null || (p1Var = r0.this.f45744f) == null) {
                return;
            }
            p1Var.d(commentBaseBean);
        }

        @Override // com.join.mgps.customview.ExpandLayout.b
        public void c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GameDetailHotCommentAdapter.java */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f45750b;

        c(CommentBaseBean commentBaseBean) {
            this.f45750b = commentBaseBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourAdapter.p1 p1Var;
            CommentBaseBean commentBaseBean = this.f45750b;
            if (commentBaseBean == null || (p1Var = r0.this.f45744f) == null) {
                return;
            }
            p1Var.d(commentBaseBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GameDetailHotCommentAdapter.java */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f45752b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f45753c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ImageView f45754d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TextView f45755e;

        /* compiled from: GameDetailHotCommentAdapter.java */
        /* loaded from: classes4.dex */
        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                long longValue = Long.valueOf(d.this.f45755e.getText().toString()).longValue();
                TextView textView = d.this.f45755e;
                textView.setText((longValue + 1) + "");
                d dVar = d.this;
                r0.this.c(dVar.f45753c);
                d dVar2 = d.this;
                GameDetialModleFourAdapter.p1 p1Var = r0.this.f45744f;
                if (p1Var != null) {
                    p1Var.b(dVar2.f45752b, dVar2.f45753c, 1);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        d(CommentBaseBean commentBaseBean, int i4, ImageView imageView, TextView textView) {
            this.f45752b = commentBaseBean;
            this.f45753c = i4;
            this.f45754d = imageView;
            this.f45755e = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentBaseBean commentBaseBean;
            long currentTimeMillis = System.currentTimeMillis();
            r0 r0Var = r0.this;
            if (currentTimeMillis - r0Var.f45745g < 500) {
                return;
            }
            r0Var.f45745g = currentTimeMillis;
            if (IntentUtil.getInstance().goLoginInteractive(r0.this.f45740b) || (commentBaseBean = this.f45752b) == null) {
                return;
            }
            if (commentBaseBean.getIs_praise() == 1) {
                r0.this.i(this.f45753c);
                this.f45754d.setImageResource(R.drawable.up_ic);
                GameDetialModleFourAdapter.p1 p1Var = r0.this.f45744f;
                if (p1Var != null) {
                    p1Var.b(this.f45752b, this.f45753c, 2);
                    return;
                }
                return;
            }
            this.f45752b.setIs_praise(1);
            if (AccountUtil_.getInstance_(r0.this.f45740b).getAccountData() == null) {
                IntentUtil.getInstance().goLoginInteractive(r0.this.f45740b);
                return;
            }
            this.f45754d.setImageResource(R.drawable.uped_ic);
            Animation loadAnimation = AnimationUtils.loadAnimation(r0.this.f45740b, R.anim.scale_reset);
            this.f45754d.startAnimation(loadAnimation);
            loadAnimation.setAnimationListener(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GameDetailHotCommentAdapter.java */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f45758b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f45759c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ImageView f45760d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TextView f45761e;

        /* compiled from: GameDetailHotCommentAdapter.java */
        /* loaded from: classes4.dex */
        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                long longValue = Long.valueOf(e.this.f45761e.getText().toString()).longValue();
                TextView textView = e.this.f45761e;
                textView.setText((longValue + 1) + "");
                e eVar = e.this;
                r0.this.b(eVar.f45759c);
                e eVar2 = e.this;
                GameDetialModleFourAdapter.p1 p1Var = r0.this.f45744f;
                if (p1Var != null) {
                    p1Var.c(eVar2.f45758b, eVar2.f45759c, 1);
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
            this.f45758b = commentBaseBean;
            this.f45759c = i4;
            this.f45760d = imageView;
            this.f45761e = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentBaseBean commentBaseBean;
            if (IntentUtil.getInstance().goLoginInteractive(r0.this.f45740b) || (commentBaseBean = this.f45758b) == null) {
                return;
            }
            if (commentBaseBean.getIs_despise() == 1) {
                r0.this.h(this.f45759c);
                this.f45760d.setImageResource(R.drawable.down_ic);
                GameDetialModleFourAdapter.p1 p1Var = r0.this.f45744f;
                if (p1Var != null) {
                    p1Var.c(this.f45758b, this.f45759c, 2);
                    return;
                }
                return;
            }
            this.f45758b.setIs_despise(1);
            if (AccountUtil_.getInstance_(r0.this.f45740b).getAccountData() == null) {
                IntentUtil.getInstance().goLoginInteractive(r0.this.f45740b);
                return;
            }
            this.f45760d.setImageResource(R.drawable.downed_ic);
            Animation loadAnimation = AnimationUtils.loadAnimation(r0.this.f45740b, R.anim.scale_reset);
            this.f45760d.startAnimation(loadAnimation);
            loadAnimation.setAnimationListener(new a());
        }
    }

    /* compiled from: GameDetailHotCommentAdapter.java */
    /* loaded from: classes4.dex */
    private class f {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayout f45764a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f45765b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f45766c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f45767d;

        /* renamed from: e  reason: collision with root package name */
        private ImageView f45768e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f45769f;

        /* renamed from: g  reason: collision with root package name */
        private MStarBar f45770g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f45771h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f45772i;

        /* renamed from: j  reason: collision with root package name */
        private ImageView f45773j;

        /* renamed from: k  reason: collision with root package name */
        private ExpandLayout f45774k;

        /* renamed from: l  reason: collision with root package name */
        private TextView f45775l;

        /* renamed from: m  reason: collision with root package name */
        public View f45776m;

        /* renamed from: n  reason: collision with root package name */
        private TextView f45777n;

        /* renamed from: o  reason: collision with root package name */
        private ImageView f45778o;

        /* renamed from: p  reason: collision with root package name */
        private TextView f45779p;

        /* renamed from: q  reason: collision with root package name */
        private ImageView f45780q;

        /* renamed from: r  reason: collision with root package name */
        private TextView f45781r;

        /* renamed from: s  reason: collision with root package name */
        private ImageView f45782s;

        /* renamed from: t  reason: collision with root package name */
        private TextView f45783t;

        /* renamed from: u  reason: collision with root package name */
        private VipView f45784u;

        /* renamed from: v  reason: collision with root package name */
        private View f45785v;

        public f(View view) {
            this.f45764a = (LinearLayout) view.findViewById(R.id.commentAllRootLl);
            this.f45765b = (SimpleDraweeView) view.findViewById(R.id.usericon);
            this.f45766c = (TextView) view.findViewById(R.id.userName);
            this.f45767d = (TextView) view.findViewById(R.id.isMe);
            this.f45768e = (ImageView) view.findViewById(R.id.isAuth);
            this.f45773j = (ImageView) view.findViewById(R.id.isGood);
            this.f45769f = (TextView) view.findViewById(R.id.isConnoisseurs);
            this.f45770g = (MStarBar) view.findViewById(R.id.comment_head_mstarBar);
            this.f45771h = (TextView) view.findViewById(R.id.comment_head_num_tx);
            this.f45772i = (TextView) view.findViewById(R.id.time);
            this.f45774k = (ExpandLayout) view.findViewById(R.id.content);
            this.f45775l = (TextView) view.findViewById(R.id.more);
            this.f45776m = view.findViewById(R.id.line);
            this.f45777n = (TextView) view.findViewById(R.id.phoneModle);
            this.f45778o = (ImageView) view.findViewById(R.id.parise);
            this.f45779p = (TextView) view.findViewById(R.id.pariseNumber);
            this.f45780q = (ImageView) view.findViewById(R.id.down);
            this.f45781r = (TextView) view.findViewById(R.id.downNumber);
            this.f45782s = (ImageView) view.findViewById(R.id.message);
            this.f45783t = (TextView) view.findViewById(R.id.messageNumber);
            this.f45784u = (VipView) view.findViewById(R.id.levelTv);
            this.f45785v = view.findViewById(R.id.layoutTop);
        }
    }

    public r0(Context context, boolean z4, GameDetialModleFourAdapter.p1 p1Var) {
        this.f45742d = new ArrayList();
        this.f45743e = true;
        this.f45745g = System.currentTimeMillis();
        this.f45740b = context;
        this.f45743e = z4;
        this.f45744f = p1Var;
        this.f45741c = LayoutInflater.from(context);
    }

    private void e(View view, CommentBaseBean commentBaseBean) {
        view.setOnClickListener(new c(commentBaseBean));
    }

    private void f(ImageView imageView, TextView textView, CommentBaseBean commentBaseBean, int i4) {
        d dVar = new d(commentBaseBean, i4, imageView, textView);
        imageView.setOnClickListener(dVar);
        textView.setOnClickListener(dVar);
    }

    private void g(ImageView imageView, TextView textView, CommentBaseBean commentBaseBean, int i4) {
        e eVar = new e(commentBaseBean, i4, imageView, textView);
        imageView.setOnClickListener(eVar);
        textView.setOnClickListener(eVar);
    }

    public void b(int i4) {
        CommentBaseBean commentBaseBean = (CommentBaseBean) getItem(i4);
        long longValue = Long.valueOf(commentBaseBean.getDespise_count()).longValue();
        commentBaseBean.setIs_despise(1);
        commentBaseBean.setDespise_count((longValue + 1) + "");
        notifyDataSetChanged();
    }

    public void c(int i4) {
        CommentBaseBean commentBaseBean = (CommentBaseBean) getItem(i4);
        long praise_count = commentBaseBean.getPraise_count();
        commentBaseBean.setIs_praise(1);
        commentBaseBean.setPraise_count(praise_count + 1);
        notifyDataSetChanged();
    }

    public List<CommentBaseBean> d() {
        return this.f45742d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45742d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f45742d.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        f fVar;
        if (view == null) {
            view = this.f45741c.inflate(R.layout.item_game_detail_comment_list_item_view, (ViewGroup) null);
            fVar = new f(view);
            view.setTag(fVar);
        } else {
            fVar = (f) view.getTag();
        }
        CommentBaseBean commentBaseBean = (CommentBaseBean) getItem(i4);
        fVar.f45785v.setVisibility(8);
        fVar.f45766c.setTextColor(-16777216);
        if (commentBaseBean.getVip_level() > 0) {
            fVar.f45766c.setTextColor(this.f45740b.getResources().getColor(R.color.vip_color));
        }
        if (commentBaseBean.getSvip_level() > 0) {
            fVar.f45766c.setTextColor(this.f45740b.getResources().getColor(R.color.vip_svip_color));
        }
        fVar.f45784u.setVipData(commentBaseBean.getVip_level(), commentBaseBean.getSvip_level());
        if (commentBaseBean.getUid().equals(String.valueOf(AccountUtil_.getInstance_(this.f45740b).getAccountData().getUid()))) {
            fVar.f45767d.setVisibility(0);
        } else {
            fVar.f45767d.setVisibility(8);
        }
        fVar.f45765b.setOnClickListener(new a(commentBaseBean));
        fVar.f45774k.setExpandable(false);
        fVar.f45774k.setContent(commentBaseBean.getContent(), new b(commentBaseBean));
        fVar.f45766c.setText(commentBaseBean.getUser_name());
        if (commentBaseBean.getIs_old() == 1 || commentBaseBean.getMobile_phone_model() == null || commentBaseBean.getMobile_phone_model().isEmpty()) {
            fVar.f45777n.setVisibility(4);
        } else {
            fVar.f45777n.setVisibility(0);
            fVar.f45777n.setText(commentBaseBean.getMobile_phone_model());
        }
        TextView textView = fVar.f45779p;
        textView.setText(commentBaseBean.getPraise_count() + "");
        TextView textView2 = fVar.f45781r;
        textView2.setText(commentBaseBean.getDespise_count() + "");
        TextView textView3 = fVar.f45783t;
        textView3.setText(commentBaseBean.getReply_count() + "");
        fVar.f45772i.setText(com.join.android.app.common.utils.g.a(Long.parseLong(commentBaseBean.getAdd_times() + "000")));
        if (commentBaseBean.getIs_old() == 1 || Float.valueOf(commentBaseBean.getStars_score()).floatValue() == 0.0f || this.f45743e) {
            fVar.f45770g.setVisibility(8);
        } else {
            fVar.f45770g.setVisibility(0);
            fVar.f45770g.setStarCount(Integer.parseInt(commentBaseBean.getStars_score()));
            fVar.f45770g.setStarMark(Float.valueOf(commentBaseBean.getStars_score()).floatValue());
        }
        fVar.f45770g.setEnabled(false);
        if (commentBaseBean.getApproval_rate() == null || Double.valueOf(commentBaseBean.getApproval_rate()).doubleValue() <= 70.0d) {
            fVar.f45773j.setVisibility(8);
        } else {
            fVar.f45773j.setVisibility(0);
        }
        if (commentBaseBean.getRank().equals("")) {
            fVar.f45768e.setVisibility(8);
        } else {
            fVar.f45768e.setVisibility(0);
        }
        fVar.f45769f.setText(commentBaseBean.getRank());
        if (commentBaseBean.getIs_praise() == 1) {
            fVar.f45778o.setImageResource(R.drawable.uped_ic);
        } else {
            fVar.f45778o.setImageResource(R.drawable.up_ic);
        }
        if (commentBaseBean.getIs_despise() == 1) {
            fVar.f45780q.setImageResource(R.drawable.downed_ic);
        } else {
            fVar.f45780q.setImageResource(R.drawable.down_ic);
        }
        UtilsMy.s3(this.f45740b, commentBaseBean.getHead_portrait(), fVar.f45765b);
        f(fVar.f45778o, fVar.f45779p, commentBaseBean, i4);
        g(fVar.f45780q, fVar.f45781r, commentBaseBean, i4);
        e(fVar.f45782s, commentBaseBean);
        return view;
    }

    public void h(int i4) {
        CommentBaseBean commentBaseBean = (CommentBaseBean) getItem(i4);
        long longValue = Long.valueOf(commentBaseBean.getDespise_count()).longValue();
        commentBaseBean.setIs_despise(0);
        long j4 = longValue - 1;
        if (j4 < 0) {
            commentBaseBean.setDespise_count("0");
        } else {
            commentBaseBean.setDespise_count(j4 + "");
        }
        notifyDataSetChanged();
    }

    public void i(int i4) {
        CommentBaseBean commentBaseBean = (CommentBaseBean) getItem(i4);
        long praise_count = commentBaseBean.getPraise_count();
        commentBaseBean.setIs_praise(0);
        long j4 = praise_count - 1;
        if (j4 < 0) {
            commentBaseBean.setPraise_count(0L);
        } else {
            commentBaseBean.setPraise_count(j4);
        }
        notifyDataSetChanged();
    }

    public r0(Context context, boolean z4, List<CommentBaseBean> list, GameDetialModleFourAdapter.p1 p1Var) {
        this.f45742d = new ArrayList();
        this.f45743e = true;
        this.f45745g = System.currentTimeMillis();
        this.f45740b = context;
        this.f45743e = z4;
        this.f45744f = p1Var;
        this.f45741c = LayoutInflater.from(context);
        this.f45742d = list;
    }
}
