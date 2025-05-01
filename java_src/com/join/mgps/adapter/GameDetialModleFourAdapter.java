package com.join.mgps.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.MApplication;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.coupon.CouponListActivity;
import com.join.kotlin.ui.notice.NoticeListActivity;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.CommentAllListActivity_;
import com.join.mgps.activity.CommentCreatActivity_;
import com.join.mgps.activity.CommentSelfListActivity_;
import com.join.mgps.activity.DetialMoreServiceListActivity_;
import com.join.mgps.activity.GameMainActivity4;
import com.join.mgps.activity.ImagePagerActivity;
import com.join.mgps.activity.PaPaBannerListActivity_;
import com.join.mgps.activity.TagAddActivity_;
import com.join.mgps.activity.TagGameListActivity_;
import com.join.mgps.activity.UploadActivity_;
import com.join.mgps.activity.gamedetail.BaseGameDetailFragment;
import com.join.mgps.activity.screenshot.ScreenshotGamedetialBean;
import com.join.mgps.activity.screenshot.ScreenshotTrueListAcvity_;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.ActivityTabView;
import com.join.mgps.customview.ExpandLayout;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.customview.MyGridView;
import com.join.mgps.customview.SlidingTabLayoutGameDetail;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.AppBeanMain;
import com.join.mgps.dto.BTActivityBean;
import com.join.mgps.dto.BtGameWelfare;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommentAllListBean;
import com.join.mgps.dto.CommentBaseBean;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GameDetailOneTouchSkill;
import com.join.mgps.dto.GameDetialAuxiliaryBean;
import com.join.mgps.dto.GamedetialAuxiliaryToolBean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import com.join.mgps.dto.ImageInfo;
import com.join.mgps.dto.InformationCommentBean;
import com.join.mgps.dto.RecommendGameBean;
import com.join.mgps.dto.ShareBean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.viewholder.ViewHolderGameDetialMain;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import it.sephiroth.android.library.widget.AbsHListView;
import it.sephiroth.android.library.widget.AdapterView;
import it.sephiroth.android.library.widget.HListView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public class GameDetialModleFourAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: t  reason: collision with root package name */
    private static final String f42187t = "GameDetialModleFourAda";

    /* renamed from: a  reason: collision with root package name */
    private GamedetialModleFourBean f42188a;

    /* renamed from: b  reason: collision with root package name */
    private BaseGameDetailFragment f42189b;

    /* renamed from: c  reason: collision with root package name */
    private Context f42190c;

    /* renamed from: g  reason: collision with root package name */
    com.danikula.videocache.i f42194g;

    /* renamed from: i  reason: collision with root package name */
    private int f42196i;

    /* renamed from: j  reason: collision with root package name */
    private int f42197j;

    /* renamed from: l  reason: collision with root package name */
    private int f42199l;

    /* renamed from: m  reason: collision with root package name */
    w1.i f42200m;

    /* renamed from: n  reason: collision with root package name */
    com.join.android.app.component.video.c f42201n;

    /* renamed from: q  reason: collision with root package name */
    private View f42204q;

    /* renamed from: d  reason: collision with root package name */
    boolean f42191d = false;

    /* renamed from: e  reason: collision with root package name */
    p1 f42192e = null;

    /* renamed from: k  reason: collision with root package name */
    private boolean f42198k = false;

    /* renamed from: p  reason: collision with root package name */
    long f42203p = System.currentTimeMillis();

    /* renamed from: r  reason: collision with root package name */
    private List<View> f42205r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    k1 f42206s = new k1();

    /* renamed from: o  reason: collision with root package name */
    private List<n1> f42202o = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private List<RecommendGameBean> f42193f = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private Map<Integer, Boolean> f42195h = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourAdapter.this.U();
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements View.OnClickListener {
        a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.join.mgps.Util.g2.h(GameDetialModleFourAdapter.this.f42188a.getGame_company_id()) || "0".equals(GameDetialModleFourAdapter.this.f42188a.getGame_company_id())) {
                return;
            }
            PaPaBannerListActivity_.k0(GameDetialModleFourAdapter.this.f42190c).e(1).a(true).c(GameDetialModleFourAdapter.this.f42188a.getGame_company_id()).d(GameDetialModleFourAdapter.this.f42188a.getCompany_name()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a1 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f42209b;

        a1(CommentBaseBean commentBaseBean) {
            this.f42209b = commentBaseBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p1 p1Var;
            CommentBaseBean commentBaseBean = this.f42209b;
            if (commentBaseBean == null || (p1Var = GameDetialModleFourAdapter.this.f42192e) == null) {
                return;
            }
            p1Var.d(commentBaseBean);
        }
    }

    /* loaded from: classes4.dex */
    class a2 extends ViewHolderGameDetialMain {
        public a2(View view) {
            super(view);
        }
    }

    /* loaded from: classes4.dex */
    private class a3 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f42212a;

        public a3(View view) {
            super(view);
            this.f42212a = (TextView) view.findViewById(R.id.text);
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.join.mgps.Util.g2.h(GameDetialModleFourAdapter.this.f42188a.getGame_company_id()) || "0".equals(GameDetialModleFourAdapter.this.f42188a.getGame_company_id())) {
                return;
            }
            PaPaBannerListActivity_.k0(GameDetialModleFourAdapter.this.f42190c).e(1).a(true).c(GameDetialModleFourAdapter.this.f42188a.getGame_company_id()).d(GameDetialModleFourAdapter.this.f42188a.getCompany_name()).start();
        }
    }

    /* loaded from: classes4.dex */
    class b0 implements View.OnClickListener {
        b0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(GameDetialModleFourAdapter.this.f42190c).getAccountData();
            if (com.join.mgps.Util.g2.h(accountData.getNickname()) || (accountData.getAccount().equals(accountData.getNickname()) && accountData.getAccount().startsWith("pa"))) {
                IntentUtil.getInstance().goChangeNickname(GameDetialModleFourAdapter.this.f42190c);
                return;
            }
            PrefDef_ prefDef_ = new PrefDef_(GameDetialModleFourAdapter.this.f42190c);
            if (com.join.mgps.Util.g2.i(prefDef_.uploadType2().d())) {
                IntentUtil.getInstance().goShareWebActivity(GameDetialModleFourAdapter.this.f42190c, prefDef_.uploadType2().d());
            } else {
                UploadActivity_.Q0(GameDetialModleFourAdapter.this.f42190c).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b1 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f42216b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42217c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ImageView f42218d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TextView f42219e;

        /* loaded from: classes4.dex */
        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                long longValue = Long.valueOf(b1.this.f42219e.getText().toString()).longValue();
                TextView textView = b1.this.f42219e;
                textView.setText((longValue + 1) + "");
                b1 b1Var = b1.this;
                GameDetialModleFourAdapter.this.o(b1Var.f42217c);
                b1 b1Var2 = b1.this;
                p1 p1Var = GameDetialModleFourAdapter.this.f42192e;
                if (p1Var != null) {
                    p1Var.b(b1Var2.f42216b, b1Var2.f42217c, 1);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        b1(CommentBaseBean commentBaseBean, int i4, ImageView imageView, TextView textView) {
            this.f42216b = commentBaseBean;
            this.f42217c = i4;
            this.f42218d = imageView;
            this.f42219e = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentBaseBean commentBaseBean;
            long currentTimeMillis = System.currentTimeMillis();
            GameDetialModleFourAdapter gameDetialModleFourAdapter = GameDetialModleFourAdapter.this;
            if (currentTimeMillis - gameDetialModleFourAdapter.f42203p < 500) {
                return;
            }
            gameDetialModleFourAdapter.f42203p = currentTimeMillis;
            if (IntentUtil.getInstance().goLoginInteractive(GameDetialModleFourAdapter.this.f42190c) || (commentBaseBean = this.f42216b) == null) {
                return;
            }
            if (commentBaseBean.getIs_praise() == 1) {
                GameDetialModleFourAdapter.this.X(this.f42217c);
                this.f42218d.setImageResource(R.drawable.up_ic);
                p1 p1Var = GameDetialModleFourAdapter.this.f42192e;
                if (p1Var != null) {
                    p1Var.b(this.f42216b, this.f42217c, 2);
                    return;
                }
                return;
            }
            this.f42216b.setIs_praise(1);
            if (AccountUtil_.getInstance_(GameDetialModleFourAdapter.this.f42190c).getAccountData() == null) {
                IntentUtil.getInstance().goLoginInteractive(GameDetialModleFourAdapter.this.f42190c);
                return;
            }
            this.f42218d.setImageResource(R.drawable.uped_ic);
            Animation loadAnimation = AnimationUtils.loadAnimation(GameDetialModleFourAdapter.this.f42190c, R.anim.scale_reset);
            this.f42218d.startAnimation(loadAnimation);
            loadAnimation.setAnimationListener(new a());
        }
    }

    /* loaded from: classes4.dex */
    class b2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        RelativeLayout f42222a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f42223b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f42224c;

        /* renamed from: d  reason: collision with root package name */
        TextView f42225d;

        /* renamed from: e  reason: collision with root package name */
        TextView f42226e;

        /* renamed from: f  reason: collision with root package name */
        TextView f42227f;

        /* renamed from: g  reason: collision with root package name */
        TextView f42228g;

        /* renamed from: h  reason: collision with root package name */
        VipView f42229h;

        /* renamed from: i  reason: collision with root package name */
        public View f42230i;

        public b2(View view) {
            super(view);
            this.f42222a = (RelativeLayout) view.findViewById(R.id.main);
            this.f42223b = (SimpleDraweeView) view.findViewById(R.id.usericon);
            this.f42224c = (ImageView) view.findViewById(R.id.parise);
            this.f42225d = (TextView) view.findViewById(R.id.username);
            this.f42226e = (TextView) view.findViewById(R.id.time);
            this.f42227f = (TextView) view.findViewById(R.id.content);
            this.f42228g = (TextView) view.findViewById(R.id.pariseNumber);
            this.f42229h = (VipView) view.findViewById(R.id.levelTv);
            this.f42230i = view.findViewById(R.id.line);
        }
    }

    /* loaded from: classes4.dex */
    class b3 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        public TextView f42232a;

        /* renamed from: b  reason: collision with root package name */
        public LinearLayout f42233b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ DomainInfoBean f42235b;

            a(DomainInfoBean domainInfoBean) {
                this.f42235b = domainInfoBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.papa.sim.statistic.p.l(GameDetialModleFourAdapter.this.f42190c).O1(Event.pdGameDetailsClick, new Ext().setTestAbNumber(this.f42235b.getAb_test_number()).setIsJoin(this.f42235b.getIs_join()));
                UtilsMy.h4(GameDetialModleFourAdapter.this.f42190c, this.f42235b.getInfo(), "game_details");
            }
        }

        public b3(View view) {
            super(view);
            this.f42232a = (TextView) view.findViewById(R.id.tv_title);
            this.f42233b = (LinearLayout) view.findViewById(R.id.ll_root);
        }

        public void a(DomainInfoBean domainInfoBean) {
            if (domainInfoBean != null) {
                this.f42232a.setText(domainInfoBean.getText());
                this.f42233b.setOnClickListener(new a(domainInfoBean));
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourAdapter.this.f42192e.k();
        }
    }

    /* loaded from: classes4.dex */
    class c0 implements View.OnClickListener {
        c0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameDetialModleFourAdapter.this.f42189b == null || GameDetialModleFourAdapter.this.f42189b.getViewPager() == null) {
                return;
            }
            GameDetialModleFourAdapter.this.f42189b.getViewPager().setCurrentItem(1);
        }
    }

    /* loaded from: classes4.dex */
    class c1 implements View.OnClickListener {
        c1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameDetialModleFourAdapter.this.f42189b == null || GameDetialModleFourAdapter.this.f42189b.getViewPager() == null) {
                return;
            }
            GameDetialModleFourAdapter.this.f42189b.getViewPager().setCurrentItem(2);
        }
    }

    /* loaded from: classes4.dex */
    class c2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        RelativeLayout f42240a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42241b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42242c;

        public c2(View view) {
            super(view);
            this.f42240a = (RelativeLayout) view.findViewById(R.id.commentFooterLayout);
            this.f42241b = (TextView) view.findViewById(R.id.showAllCommit);
            this.f42242c = (TextView) view.findViewById(R.id.goforum);
        }
    }

    /* loaded from: classes4.dex */
    class c3 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f42244a;

        /* renamed from: b  reason: collision with root package name */
        public LinearLayout f42245b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ DomainInfoBean f42247b;

            a(DomainInfoBean domainInfoBean) {
                this.f42247b = domainInfoBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.papa.sim.statistic.p.l(GameDetialModleFourAdapter.this.f42190c).O1(Event.pdGameDetailsClick, new Ext().setTestAbNumber(this.f42247b.getAb_test_number()).setIsJoin(this.f42247b.getIs_join()));
                UtilsMy.h4(GameDetialModleFourAdapter.this.f42190c, this.f42247b.getInfo(), "game_details");
            }
        }

        public c3(View view) {
            super(view);
            this.f42244a = (SimpleDraweeView) view.findViewById(R.id.sdv_image);
            this.f42245b = (LinearLayout) view.findViewById(R.id.ll_root);
        }

        public void a(DomainInfoBean domainInfoBean) {
            if (domainInfoBean != null) {
                if (com.join.mgps.Util.g2.i(domainInfoBean.getPic())) {
                    MyImageLoader.h(this.f42244a, domainInfoBean.getPic());
                }
                this.f42245b.setOnClickListener(new a(domainInfoBean));
            }
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TipBean f42249b;

        d(TipBean tipBean) {
            this.f42249b = tipBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagGameListActivity_.F0(GameDetialModleFourAdapter.this.f42190c).b(2).d(this.f42249b.getName()).e(Integer.parseInt(this.f42249b.getId())).f("2").start();
        }
    }

    /* loaded from: classes4.dex */
    class d0 implements View.OnClickListener {
        d0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentAllListActivity_.H0(GameDetialModleFourAdapter.this.f42190c).f(GameDetialModleFourAdapter.this.f42188a.getGame_id()).i(GameDetialModleFourAdapter.this.f42188a.getPackageName()).h(GameDetialModleFourAdapter.this.f42188a.getPlugin_num()).g(GameDetialModleFourAdapter.this.f42188a.getIs_started()).j(GameDetialModleFourAdapter.this.f42188a.getGame_score() != null ? GameDetialModleFourAdapter.this.f42188a.getGame_score().getSgc_switch() : 0).a(GameDetialModleFourAdapter.this.f42188a.getBespeak_switch()).d(GameDetialModleFourAdapter.this.f42188a.getComment_score_switch()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d1 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f42252b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42253c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ImageView f42254d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TextView f42255e;

        /* loaded from: classes4.dex */
        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                long longValue = Long.valueOf(d1.this.f42255e.getText().toString()).longValue();
                TextView textView = d1.this.f42255e;
                textView.setText((longValue + 1) + "");
                d1 d1Var = d1.this;
                GameDetialModleFourAdapter.this.n(d1Var.f42253c);
                d1 d1Var2 = d1.this;
                p1 p1Var = GameDetialModleFourAdapter.this.f42192e;
                if (p1Var != null) {
                    p1Var.c(d1Var2.f42252b, d1Var2.f42253c, 1);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        d1(CommentBaseBean commentBaseBean, int i4, ImageView imageView, TextView textView) {
            this.f42252b = commentBaseBean;
            this.f42253c = i4;
            this.f42254d = imageView;
            this.f42255e = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentBaseBean commentBaseBean;
            if (IntentUtil.getInstance().goLoginInteractive(GameDetialModleFourAdapter.this.f42190c) || (commentBaseBean = this.f42252b) == null) {
                return;
            }
            if (commentBaseBean.getIs_despise() == 1) {
                GameDetialModleFourAdapter.this.W(this.f42253c);
                this.f42254d.setImageResource(R.drawable.down_ic);
                p1 p1Var = GameDetialModleFourAdapter.this.f42192e;
                if (p1Var != null) {
                    p1Var.c(this.f42252b, this.f42253c, 2);
                    return;
                }
                return;
            }
            this.f42252b.setIs_despise(1);
            if (AccountUtil_.getInstance_(GameDetialModleFourAdapter.this.f42190c).getAccountData() == null) {
                IntentUtil.getInstance().goLoginInteractive(GameDetialModleFourAdapter.this.f42190c);
                return;
            }
            this.f42254d.setImageResource(R.drawable.downed_ic);
            Animation loadAnimation = AnimationUtils.loadAnimation(GameDetialModleFourAdapter.this.f42190c, R.anim.scale_reset);
            this.f42254d.startAnimation(loadAnimation);
            loadAnimation.setAnimationListener(new a());
        }
    }

    /* loaded from: classes4.dex */
    class d2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f42258a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42259b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f42260c;

        /* renamed from: d  reason: collision with root package name */
        View f42261d;

        public d2(View view) {
            super(view);
            this.f42260c = (ImageView) view.findViewById(R.id.commitImage);
            this.f42261d = view.findViewById(R.id.layoutBottom);
            this.f42258a = (TextView) view.findViewById(R.id.commitCount);
            this.f42259b = (TextView) view.findViewById(R.id.tv_right);
        }
    }

    /* loaded from: classes4.dex */
    class d3 extends ViewHolderGameDetialMain {
        public d3(View view) {
            super(view);
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TipBean f42264b;

        e(TipBean tipBean) {
            this.f42264b = tipBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagGameListActivity_.F0(GameDetialModleFourAdapter.this.f42190c).b(2).d(this.f42264b.getName()).e(Integer.parseInt(this.f42264b.getId())).f("3").start();
        }
    }

    /* loaded from: classes4.dex */
    class e0 implements View.OnClickListener {
        e0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(GameDetialModleFourAdapter.this.f42190c).getAccountData();
            if (com.join.mgps.Util.g2.h(accountData.getNickname()) || (accountData.getAccount().equals(accountData.getNickname()) && accountData.getAccount().startsWith("pa"))) {
                IntentUtil.getInstance().goChangeNickname(GameDetialModleFourAdapter.this.f42190c);
            } else if (IntentUtil.getInstance().goLoginInteractive(GameDetialModleFourAdapter.this.f42190c)) {
            } else {
                if (GameDetialModleFourAdapter.this.f42188a.getSelf_comment() == null) {
                    CommentCreatActivity_.w0(GameDetialModleFourAdapter.this.f42190c).f(GameDetialModleFourAdapter.this.f42188a.getGame_id()).j(GameDetialModleFourAdapter.this.f42188a.getPackageName()).h(GameDetialModleFourAdapter.this.f42188a.getPlugin_num()).g(GameDetialModleFourAdapter.this.f42188a.getIs_started()).a(GameDetialModleFourAdapter.this.f42188a.getBespeak_switch()).d(GameDetialModleFourAdapter.this.f42188a.getComment_score_switch()).start();
                    return;
                }
                CommentAllListBean.SelfCommentBean self_comment = GameDetialModleFourAdapter.this.f42188a.getSelf_comment();
                CommentCreatActivity_.w0(GameDetialModleFourAdapter.this.f42190c).f(GameDetialModleFourAdapter.this.f42188a.getGame_id()).j(GameDetialModleFourAdapter.this.f42188a.getPackageName()).d(GameDetialModleFourAdapter.this.f42188a.getComment_score_switch()).c(self_comment.getId()).e(Float.valueOf(self_comment.getStars_score()).floatValue()).a(GameDetialModleFourAdapter.this.f42188a.getBespeak_switch()).h(GameDetialModleFourAdapter.this.f42188a.getPlugin_num()).g(GameDetialModleFourAdapter.this.f42188a.getIs_started()).b(self_comment.getContent()).start();
            }
        }
    }

    /* loaded from: classes4.dex */
    class e1 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppBeanMain f42267b;

        e1(AppBeanMain appBeanMain) {
            this.f42267b = appBeanMain;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(GameDetialModleFourAdapter.this.f42190c, this.f42267b.getIntentDataBean());
        }
    }

    /* loaded from: classes4.dex */
    class e2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f42269a;

        /* renamed from: b  reason: collision with root package name */
        View f42270b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42271c;

        /* renamed from: d  reason: collision with root package name */
        TextView f42272d;

        /* renamed from: e  reason: collision with root package name */
        View f42273e;

        /* renamed from: f  reason: collision with root package name */
        View f42274f;

        /* renamed from: g  reason: collision with root package name */
        LinearLayout f42275g;

        public e2(View view) {
            super(view);
            this.f42275g = (LinearLayout) view.findViewById(R.id.parentLayout);
            this.f42269a = (LinearLayout) view.findViewById(R.id.comment_reply_container);
            this.f42270b = view.findViewById(R.id.comment_reply_divider);
            this.f42271c = (TextView) view.findViewById(R.id.comment_reply_content);
            this.f42272d = (TextView) view.findViewById(R.id.comment_reply_more);
            this.f42273e = view.findViewById(R.id.line);
            this.f42274f = view.findViewById(R.id.bottom);
        }
    }

    /* loaded from: classes4.dex */
    class e3 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f42277a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42278b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42279c;

        /* renamed from: d  reason: collision with root package name */
        View f42280d;

        public e3(View view) {
            super(view);
            this.f42277a = (TextView) view.findViewById(R.id.tag);
            this.f42278b = (TextView) view.findViewById(R.id.title);
            this.f42280d = view.findViewById(R.id.main);
            this.f42279c = (TextView) view.findViewById(R.id.message);
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagAddActivity_.t L0 = TagAddActivity_.L0(GameDetialModleFourAdapter.this.f42190c);
            L0.b(GameDetialModleFourAdapter.this.f42188a.getGame_name() + "热门标签").a(GameDetialModleFourAdapter.this.f42188a.getCrc_sign_id()).start();
        }
    }

    /* loaded from: classes4.dex */
    class f0 implements View.OnClickListener {
        f0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameDetialModleFourAdapter.this.f42189b == null || GameDetialModleFourAdapter.this.f42189b.getViewPager() == null) {
                return;
            }
            GameDetialModleFourAdapter.this.f42189b.getViewPager().setCurrentItem(1);
        }
    }

    /* loaded from: classes4.dex */
    class f1 implements View.OnClickListener {
        f1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goMainLabelActivity(GameDetialModleFourAdapter.this.f42190c, 0, GameDetialModleFourAdapter.this.f42188a.getCommunity_entrance_tag(), 1);
        }
    }

    /* loaded from: classes4.dex */
    class f2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f42285a;

        /* renamed from: b  reason: collision with root package name */
        MyGridView f42286b;

        public f2(View view) {
            super(view);
            this.f42286b = (MyGridView) view.findViewById(R.id.recomListView);
            this.f42285a = (LinearLayout) view.findViewById(R.id.layoutContent);
        }
    }

    /* loaded from: classes4.dex */
    class f3 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        SlidingTabLayoutGameDetail f42288a;

        /* renamed from: b  reason: collision with root package name */
        ViewPager f42289b;

        public f3(View view) {
            super(view);
            this.f42288a = (SlidingTabLayoutGameDetail) view.findViewById(R.id.tabLayout);
            this.f42289b = (ViewPager) view.findViewById(R.id.viewPager);
        }
    }

    /* loaded from: classes4.dex */
    class g implements AbsHListView.i {
        g() {
        }

        @Override // it.sephiroth.android.library.widget.AbsHListView.i
        public void a(AbsHListView absHListView, int i4, int i5, int i6) {
            com.join.android.app.component.video.c cVar = GameDetialModleFourAdapter.this.f42201n;
            if (cVar != null) {
                cVar.h(absHListView, i4, i5, i6);
            }
        }

        @Override // it.sephiroth.android.library.widget.AbsHListView.i
        public void b(AbsHListView absHListView, int i4) {
            com.join.android.app.component.video.c cVar = GameDetialModleFourAdapter.this.f42201n;
            if (cVar != null) {
                cVar.l(absHListView, i4);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g0 implements View.OnClickListener {
        g0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            try {
                str = URLEncoder.encode(GameDetialModleFourAdapter.this.f42188a.getGame_name(), "utf8");
            } catch (UnsupportedEncodingException e5) {
                e5.printStackTrace();
                str = "";
            }
            IntentUtil intentUtil = IntentUtil.getInstance();
            Context context = GameDetialModleFourAdapter.this.f42190c;
            intentUtil.goShareWebActivity(context, com.join.mgps.rpc.h.f54056j + "/static/vip2020/v2/index.html#/gameGift?game_id=" + GameDetialModleFourAdapter.this.f42188a.getCrc_sign_id() + "&name=" + str);
        }
    }

    /* loaded from: classes4.dex */
    class g1 implements View.OnClickListener {
        g1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                GameDetialModleFourAdapter.this.f42190c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqwpa://im/chat?chat_type=wpa&uin=" + GameDetialModleFourAdapter.this.f42188a.getGame_exclusive_benefits_qq() + "&version=1")));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes4.dex */
    class g2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f42294a;

        /* renamed from: b  reason: collision with root package name */
        MyGridView f42295b;

        public g2(View view) {
            super(view);
            this.f42295b = (MyGridView) view.findViewById(R.id.recomListView);
            this.f42294a = (LinearLayout) view.findViewById(R.id.layoutContent);
        }
    }

    /* loaded from: classes4.dex */
    class g3 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        RecyclerView f42297a;

        /* renamed from: b  reason: collision with root package name */
        c f42298b;

        /* loaded from: classes4.dex */
        class a extends GridLayoutManager {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ GameDetialModleFourAdapter f42300a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i4, GameDetialModleFourAdapter gameDetialModleFourAdapter) {
                super(context, i4);
                this.f42300a = gameDetialModleFourAdapter;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        }

        /* loaded from: classes4.dex */
        class b extends UniversalItemDecoration {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ GameDetialModleFourAdapter f42302a;

            b(GameDetialModleFourAdapter gameDetialModleFourAdapter) {
                this.f42302a = gameDetialModleFourAdapter;
            }

            @Override // com.join.mgps.base.decoration.UniversalItemDecoration
            public UniversalItemDecoration.b getItemOffsets(int i4) {
                UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
                aVar.f46233f = 0;
                if (i4 == 0 || i4 % 2 == 0) {
                    aVar.f46234a = (int) GameDetialModleFourAdapter.this.f42190c.getResources().getDimension(R.dimen.wdp25);
                    aVar.f46235b = (int) GameDetialModleFourAdapter.this.f42190c.getResources().getDimension(R.dimen.wdp9);
                } else {
                    aVar.f46234a = (int) GameDetialModleFourAdapter.this.f42190c.getResources().getDimension(R.dimen.wdp9);
                    aVar.f46235b = (int) GameDetialModleFourAdapter.this.f42190c.getResources().getDimension(R.dimen.wdp25);
                }
                aVar.f46237d = (int) GameDetialModleFourAdapter.this.f42190c.getResources().getDimension(R.dimen.wdp25);
                return aVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class c extends BaseQuickAdapter<CollectionBeanSub, BaseViewHolder> {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public class a implements View.OnClickListener {

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ CollectionBeanSub f42305b;

                a(CollectionBeanSub collectionBeanSub) {
                    this.f42305b = collectionBeanSub;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IntentDateBean intentDataBean = this.f42305b.getIntentDataBean();
                    ExtBean extBean = intentDataBean.getExtBean();
                    extBean.setFrom("13301");
                    extBean.set_from_type(13301);
                    IntentUtil.getInstance().intentActivity(GameDetialModleFourAdapter.this.f42190c, intentDataBean);
                }
            }

            public c() {
                super((int) R.layout.item_detail_pc_recommend_game_item);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.join.mgps.base.BaseQuickAdapter
            /* renamed from: a */
            public void convert(@NonNull BaseViewHolder baseViewHolder, CollectionBeanSub collectionBeanSub) {
                MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.sdv_image), collectionBeanSub.getGame_info_top_pic());
                baseViewHolder.setText(R.id.tv_game_name, collectionBeanSub.getGame_name());
                baseViewHolder.setText(R.id.tv_label, UtilsMy.N1(collectionBeanSub.getSp_tag_info(), collectionBeanSub.getTag_info(), " | "));
                baseViewHolder.itemView.setOnClickListener(new a(collectionBeanSub));
            }
        }

        public g3(View view) {
            super(view);
            this.f42297a = (RecyclerView) view.findViewById(R.id.rv_list);
            this.f42297a.setLayoutManager(new a(GameDetialModleFourAdapter.this.f42190c, 2, GameDetialModleFourAdapter.this));
            this.f42297a.addItemDecoration(new b(GameDetialModleFourAdapter.this));
            c cVar = new c();
            this.f42298b = cVar;
            this.f42297a.setAdapter(cVar);
        }

        public void a(List<CollectionBeanSub> list) {
            this.f42298b.setNewData(list);
        }
    }

    /* loaded from: classes4.dex */
    class h implements AdapterView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f42307a;

        h(List list) {
            this.f42307a = list;
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.d
        public void a(AdapterView<?> adapterView, View view, int i4, long j4) {
            try {
                Intent intent = new Intent(GameDetialModleFourAdapter.this.f42190c, ImagePagerActivity.class);
                ArrayList arrayList = new ArrayList();
                int i5 = 0;
                for (int i6 = 0; i6 < this.f42307a.size(); i6++) {
                    if (!((ImageInfo) this.f42307a.get(i6)).isVideo()) {
                        arrayList.add(((ImageInfo) this.f42307a.get(i6)).getUrl());
                        if (i4 == i6) {
                            i5 = arrayList.size() - 1;
                        }
                    }
                }
                intent.putExtra("image_urls", (String[]) arrayList.toArray(new String[arrayList.size()]));
                intent.putExtra("image_index", i5);
                GameDetialModleFourAdapter.this.f42190c.startActivity(intent);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes4.dex */
    class h0 implements View.OnClickListener {
        h0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goForumFid(GameDetialModleFourAdapter.this.f42190c, (int) GameDetialModleFourAdapter.this.f42188a.getForum_id());
        }
    }

    /* loaded from: classes4.dex */
    class h1 implements View.OnClickListener {
        h1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentAllListActivity_.H0(GameDetialModleFourAdapter.this.f42190c).f(GameDetialModleFourAdapter.this.f42188a.getGame_id()).i(GameDetialModleFourAdapter.this.f42188a.getPackageName()).h(GameDetialModleFourAdapter.this.f42188a.getPlugin_num()).a(GameDetialModleFourAdapter.this.f42188a.getBespeak_switch()).g(GameDetialModleFourAdapter.this.f42188a.getIs_started()).j(GameDetialModleFourAdapter.this.f42188a.getGame_score().getSgc_switch()).d(GameDetialModleFourAdapter.this.f42188a.getComment_score_switch()).start();
        }
    }

    /* loaded from: classes4.dex */
    class h2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        ExpandLayout f42311a;

        public h2(View view) {
            super(view);
            this.f42311a = (ExpandLayout) view.findViewById(R.id.el_view);
        }
    }

    /* loaded from: classes4.dex */
    class h3 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f42313a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42314b;

        public h3(View view) {
            super(view);
            this.f42313a = (LinearLayout) view.findViewById(R.id.handSharkLayout);
            this.f42314b = (TextView) view.findViewById(R.id.suntitle);
        }
    }

    /* loaded from: classes4.dex */
    class i implements AdapterView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f42316a;

        i(List list) {
            this.f42316a = list;
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.d
        public void a(AdapterView<?> adapterView, View view, int i4, long j4) {
            ScreenshotTrueListAcvity_.intent(GameDetialModleFourAdapter.this.f42190c).fromData((ScreenshotGamedetialBean) this.f42316a.get(i4)).gameId(GameDetialModleFourAdapter.this.f42188a.getGame_id()).start();
        }
    }

    /* loaded from: classes4.dex */
    class i0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppBeanMain f42318b;

        i0(AppBeanMain appBeanMain) {
            this.f42318b = appBeanMain;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(GameDetialModleFourAdapter.this.f42190c, this.f42318b.getIntentDataBean());
        }
    }

    /* loaded from: classes4.dex */
    class i1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        ActivityTabView f42320a;

        public i1(View view) {
            super(view);
            this.f42320a = (ActivityTabView) view.findViewById(R.id.atv_activities);
        }
    }

    /* loaded from: classes4.dex */
    class i2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        RelativeLayout f42322a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42323b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42324c;

        /* renamed from: d  reason: collision with root package name */
        LinearLayout f42325d;

        /* renamed from: e  reason: collision with root package name */
        TextView f42326e;

        /* renamed from: f  reason: collision with root package name */
        TextView f42327f;

        /* renamed from: g  reason: collision with root package name */
        TextView f42328g;

        /* renamed from: h  reason: collision with root package name */
        TextView f42329h;

        /* renamed from: i  reason: collision with root package name */
        TextView f42330i;

        /* renamed from: j  reason: collision with root package name */
        TextView f42331j;

        /* renamed from: k  reason: collision with root package name */
        TextView f42332k;

        /* renamed from: l  reason: collision with root package name */
        TextView f42333l;

        /* renamed from: m  reason: collision with root package name */
        TextView f42334m;

        /* renamed from: n  reason: collision with root package name */
        LinearLayout f42335n;

        /* renamed from: o  reason: collision with root package name */
        LinearLayout f42336o;

        /* renamed from: p  reason: collision with root package name */
        LinearLayout f42337p;

        /* renamed from: q  reason: collision with root package name */
        LinearLayout f42338q;

        /* renamed from: r  reason: collision with root package name */
        LinearLayout f42339r;

        public i2(View view) {
            super(view);
            this.f42322a = (RelativeLayout) view.findViewById(R.id.message);
            this.f42323b = (TextView) view.findViewById(R.id.moreText);
            this.f42324c = (TextView) view.findViewById(R.id.downNumberTitle);
            this.f42325d = (LinearLayout) view.findViewById(R.id.look_other);
            this.f42326e = (TextView) view.findViewById(R.id.downNumber);
            this.f42327f = (TextView) view.findViewById(R.id.nowVersion);
            this.f42328g = (TextView) view.findViewById(R.id.appSize);
            this.f42329h = (TextView) view.findViewById(R.id.updateDate);
            this.f42330i = (TextView) view.findViewById(R.id.androdVersion);
            this.f42331j = (TextView) view.findViewById(R.id.commpany);
            this.f42332k = (TextView) view.findViewById(R.id.resousFrom);
            this.f42333l = (TextView) view.findViewById(R.id.upGame);
            this.f42335n = (LinearLayout) view.findViewById(R.id.resousFromLayout);
            this.f42336o = (LinearLayout) view.findViewById(R.id.commpanyLayout);
            this.f42338q = (LinearLayout) view.findViewById(R.id.androdVersionLayout);
            this.f42337p = (LinearLayout) view.findViewById(R.id.nowVersionLayout);
            this.f42339r = (LinearLayout) view.findViewById(R.id.sizelayout);
            this.f42334m = (TextView) view.findViewById(R.id.titleText);
        }
    }

    /* loaded from: classes4.dex */
    class i3 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f42341a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42342b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42343c;

        /* renamed from: d  reason: collision with root package name */
        TextView f42344d;

        public i3(View view) {
            super(view);
            this.f42341a = (TextView) view.findViewById(R.id.tag);
            this.f42342b = (TextView) view.findViewById(R.id.day);
            this.f42343c = (TextView) view.findViewById(R.id.time);
            this.f42344d = (TextView) view.findViewById(R.id.serverName);
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(GameDetialModleFourAdapter.this.f42190c, GameDetialModleFourAdapter.this.f42188a.getGame_handle_entrance().getSub().get(0).getIntentDataBean());
        }
    }

    /* loaded from: classes4.dex */
    class j0 implements View.OnClickListener {
        j0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.join.mgps.Util.g2.i(GameDetialModleFourAdapter.z(GameDetialModleFourAdapter.this.f42190c))) {
                IntentUtil.getInstance().goQQGroup(GameDetialModleFourAdapter.this.f42190c, GameDetialModleFourAdapter.this.f42188a.getGame_detailed().getTpl_two_qq_key());
                return;
            }
            com.join.mgps.Util.l2.a(GameDetialModleFourAdapter.this.f42190c).b("已复制QQ号，请安装QQ后粘贴搜索");
            com.join.mgps.Util.j0.M(GameDetialModleFourAdapter.this.f42190c, GameDetialModleFourAdapter.this.f42188a.getGame_detailed().getTpl_two_qq());
        }
    }

    /* loaded from: classes4.dex */
    class j1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f42348a;

        public j1(View view) {
            super(view);
            this.f42348a = (LinearLayout) view.findViewById(R.id.btTaglayout);
        }
    }

    /* loaded from: classes4.dex */
    class j2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f42350a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42351b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42352c;

        /* renamed from: d  reason: collision with root package name */
        TextView f42353d;

        /* renamed from: e  reason: collision with root package name */
        LinearLayout f42354e;

        public j2(View view) {
            super(view);
            this.f42350a = (SimpleDraweeView) view.findViewById(R.id.giftIcon);
            this.f42351b = (TextView) view.findViewById(R.id.giftName);
            this.f42352c = (TextView) view.findViewById(R.id.giftContent);
            this.f42353d = (TextView) view.findViewById(R.id.getGiftTextView);
            this.f42354e = (LinearLayout) view.findViewById(R.id.layoutContent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j3 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        HListView f42356a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f42357b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f42358c;

        /* renamed from: d  reason: collision with root package name */
        public ProgressBar f42359d;

        /* renamed from: e  reason: collision with root package name */
        public ProgressBar f42360e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f42361f;

        /* renamed from: g  reason: collision with root package name */
        private LinearLayout f42362g;

        /* renamed from: h  reason: collision with root package name */
        private RelativeLayout f42363h;

        /* renamed from: i  reason: collision with root package name */
        private RelativeLayout f42364i;

        /* renamed from: j  reason: collision with root package name */
        private TextView f42365j;

        /* renamed from: k  reason: collision with root package name */
        private LinearLayout f42366k;

        /* renamed from: l  reason: collision with root package name */
        private LinearLayout f42367l;

        /* renamed from: m  reason: collision with root package name */
        public TextView f42368m;

        /* renamed from: n  reason: collision with root package name */
        public TextView f42369n;

        /* renamed from: o  reason: collision with root package name */
        public TextView f42370o;

        /* renamed from: p  reason: collision with root package name */
        public TextView f42371p;

        /* renamed from: q  reason: collision with root package name */
        TextView f42372q;

        /* renamed from: r  reason: collision with root package name */
        LinearLayout f42373r;

        public j3(View view) {
            super(view);
            this.f42356a = (HListView) view.findViewById(R.id.screenListView);
            this.f42357b = (SimpleDraweeView) view.findViewById(R.id.mgListviewItemIcon);
            this.f42358c = (TextView) view.findViewById(R.id.mgListviewItemAppname);
            this.f42359d = (ProgressBar) view.findViewById(R.id.progressBarZip);
            this.f42360e = (ProgressBar) view.findViewById(R.id.progressBar);
            this.f42362g = (LinearLayout) view.findViewById(R.id.tipsLayout);
            this.f42361f = (TextView) view.findViewById(R.id.privilege);
            this.f42363h = (RelativeLayout) view.findViewById(R.id.rLayoutRight);
            this.f42364i = (RelativeLayout) view.findViewById(R.id.rLayoutRight2);
            this.f42365j = (TextView) view.findViewById(R.id.mgListviewItemInstall);
            this.f42366k = (LinearLayout) view.findViewById(R.id.linearLayout2);
            this.f42368m = (TextView) view.findViewById(R.id.appSize);
            this.f42369n = (TextView) view.findViewById(R.id.tv_content);
            this.f42371p = (TextView) view.findViewById(R.id.loding_info);
            this.f42372q = (TextView) view.findViewById(R.id.tv_delect_game);
            this.f42367l = (LinearLayout) view.findViewById(R.id.rl_item);
            this.f42370o = (TextView) view.findViewById(R.id.mgListviewItemDescribe);
            this.f42373r = (LinearLayout) view.findViewById(R.id.tipsLayout1);
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.papa.sim.statistic.p.l(view.getContext()).F("jinshouzhi", AccountUtil_.getInstance_(view.getContext()).getUid());
            GameDetialModleFourAdapter.this.r(view.getContext(), GameMainActivity4.I2);
        }
    }

    /* loaded from: classes4.dex */
    class k0 implements View.OnScrollChangeListener {
        k0() {
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i4, int i5, int i6, int i7) {
            GameDetialModleFourAdapter.this.f42196i = i4;
        }
    }

    /* loaded from: classes4.dex */
    class k1 extends PagerAdapter {

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.papa.sim.statistic.p.l(view.getContext()).F("yijianjineng", AccountUtil_.getInstance_(view.getContext()).getUid());
                GameDetialModleFourAdapter.this.r(view.getContext(), "一键技能");
            }
        }

        k1() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return GameDetialModleFourAdapter.this.f42205r.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i4) {
            viewGroup.addView((View) GameDetialModleFourAdapter.this.f42205r.get(i4));
            View view = (View) GameDetialModleFourAdapter.this.f42205r.get(i4);
            view.getLayoutParams().height = -2;
            view.getLayoutParams().width = -1;
            view.setOnClickListener(new a());
            return view;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    /* loaded from: classes4.dex */
    class k2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f42379a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f42380b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f42381c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f42382d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f42383e;

        /* renamed from: f  reason: collision with root package name */
        public MStarBar f42384f;

        /* renamed from: g  reason: collision with root package name */
        public LinearLayout f42385g;

        /* renamed from: h  reason: collision with root package name */
        public LinearLayout f42386h;

        /* renamed from: i  reason: collision with root package name */
        public ImageView f42387i;

        /* renamed from: j  reason: collision with root package name */
        private LinearLayout f42388j;

        /* renamed from: k  reason: collision with root package name */
        private TextView f42389k;

        public k2(View view) {
            super(view);
            this.f42380b = (TextView) view.findViewById(R.id.appName);
            this.f42381c = (TextView) view.findViewById(R.id.appCompany);
            this.f42382d = (TextView) view.findViewById(R.id.appSize);
            this.f42383e = (TextView) view.findViewById(R.id.appDownloadCount);
            this.f42384f = (MStarBar) view.findViewById(R.id.comment_head_mstarBar);
            this.f42379a = (SimpleDraweeView) view.findViewById(R.id.appIcon);
            this.f42385g = (LinearLayout) view.findViewById(R.id.companyLayout);
            this.f42386h = (LinearLayout) view.findViewById(R.id.layoutGift);
            this.f42387i = (ImageView) view.findViewById(R.id.giftImage);
            this.f42388j = (LinearLayout) view.findViewById(R.id.scoreLayout);
            this.f42389k = (TextView) view.findViewById(R.id.comment_head_point_tx);
        }
    }

    /* loaded from: classes4.dex */
    public class k3 {
        public static final int A = 26;
        public static final int B = 27;
        public static final int C = 28;
        public static final int D = 29;
        public static final int E = 30;
        public static final int F = 31;
        public static final int G = 32;
        public static final int H = 33;
        public static final int I = 34;
        public static final int J = 35;
        public static final int K = 36;
        public static final int L = 37;
        public static final int M = 38;
        public static final int N = 39;
        public static final int O = 40;
        public static final int P = 41;
        public static final int Q = 42;
        public static final int R = 43;
        public static final int S = 44;
        public static final int T = 45;
        public static final int U = 46;
        public static final int V = 47;
        public static final int W = 48;
        public static final int X = 49;
        public static final int Y = 50;

        /* renamed from: b  reason: collision with root package name */
        public static final int f42391b = 1;

        /* renamed from: c  reason: collision with root package name */
        public static final int f42392c = 2;

        /* renamed from: d  reason: collision with root package name */
        public static final int f42393d = 3;

        /* renamed from: e  reason: collision with root package name */
        public static final int f42394e = 4;

        /* renamed from: f  reason: collision with root package name */
        public static final int f42395f = 5;

        /* renamed from: g  reason: collision with root package name */
        public static final int f42396g = 6;

        /* renamed from: h  reason: collision with root package name */
        public static final int f42397h = 7;

        /* renamed from: i  reason: collision with root package name */
        public static final int f42398i = 8;

        /* renamed from: j  reason: collision with root package name */
        public static final int f42399j = 9;

        /* renamed from: k  reason: collision with root package name */
        public static final int f42400k = 10;

        /* renamed from: l  reason: collision with root package name */
        public static final int f42401l = 11;

        /* renamed from: m  reason: collision with root package name */
        public static final int f42402m = 12;

        /* renamed from: n  reason: collision with root package name */
        public static final int f42403n = 13;

        /* renamed from: o  reason: collision with root package name */
        public static final int f42404o = 14;

        /* renamed from: p  reason: collision with root package name */
        public static final int f42405p = 15;

        /* renamed from: q  reason: collision with root package name */
        public static final int f42406q = 16;

        /* renamed from: r  reason: collision with root package name */
        public static final int f42407r = 17;

        /* renamed from: s  reason: collision with root package name */
        public static final int f42408s = 18;

        /* renamed from: t  reason: collision with root package name */
        public static final int f42409t = 19;

        /* renamed from: u  reason: collision with root package name */
        public static final int f42410u = 20;

        /* renamed from: v  reason: collision with root package name */
        public static final int f42411v = 21;

        /* renamed from: w  reason: collision with root package name */
        public static final int f42412w = 22;

        /* renamed from: x  reason: collision with root package name */
        public static final int f42413x = 23;

        /* renamed from: y  reason: collision with root package name */
        public static final int f42414y = 24;

        /* renamed from: z  reason: collision with root package name */
        public static final int f42415z = 25;

        public k3() {
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n1 f42417b;

        l(n1 n1Var) {
            this.f42417b = n1Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w1.j jVar = this.f42417b.f42459d;
            if (jVar != null) {
                jVar.a(0);
            }
        }
    }

    /* loaded from: classes4.dex */
    class l0 implements ViewPager.OnPageChangeListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f3 f42419b;

        l0(f3 f3Var) {
            this.f42419b = f3Var;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            GameDetialModleFourAdapter.this.f42197j = this.f42419b.f42289b.getCurrentItem();
        }
    }

    /* loaded from: classes4.dex */
    class l1 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        CollectionBeanSubBusiness f42421b;

        /* renamed from: c  reason: collision with root package name */
        int f42422c;

        public l1(CollectionBeanSubBusiness collectionBeanSubBusiness, int i4) {
            this.f42421b = collectionBeanSubBusiness;
            this.f42422c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = this.f42421b.getDownloadTask();
            if (downloadTask == null) {
                if (this.f42421b.getMod_info() == null && UtilsMy.o0(this.f42421b.getTag_info())) {
                    if (this.f42421b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(GameDetialModleFourAdapter.this.f42190c).d(GameDetialModleFourAdapter.this.f42190c, this.f42421b.getPackage_name())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(GameDetialModleFourAdapter.this.f42190c).l(GameDetialModleFourAdapter.this.f42190c, this.f42421b.getPackage_name());
                            if (!com.join.mgps.Util.g2.i(this.f42421b.getVer()) || l4.d() >= Integer.parseInt(this.f42421b.getVer())) {
                                com.join.android.app.common.utils.e.l0(GameDetialModleFourAdapter.this.f42190c);
                                APKUtils.a0(GameDetialModleFourAdapter.this.f42190c, this.f42421b.getPackage_name());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(GameDetialModleFourAdapter.this.f42190c).d(GameDetialModleFourAdapter.this.f42190c, this.f42421b.getPackage_name());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f42421b.getPackage_name());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(GameDetialModleFourAdapter.this.f42190c);
                            APKUtils.V(GameDetialModleFourAdapter.this.f42190c, this.f42421b.getMod_info());
                            return;
                        }
                    }
                }
                UtilsMy.Y0(GameDetialModleFourAdapter.this.f42190c, this.f42421b);
                return;
            }
            String plugin_num = this.f42421b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f42421b.getDown_url_remote());
                UtilsMy.T2(downloadTask, GameDetialModleFourAdapter.this.f42190c);
                IntentUtil.getInstance().intentActivity(GameDetialModleFourAdapter.this.f42190c, intentDateBean);
                return;
            }
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            if (UtilsMy.w0(this.f42421b.getPay_tag_info(), this.f42421b.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 13) {
                    com.php25.PDownload.d.l(GameDetialModleFourAdapter.this.f42190c, downloadTask);
                    return;
                }
                if (status != 2) {
                    if (status != 3) {
                        if (status == 5) {
                            UtilsMy.T3(GameDetialModleFourAdapter.this.f42190c, downloadTask);
                            return;
                        } else if (status != 6) {
                            if (status != 7) {
                                if (status == 42) {
                                    if (!com.join.android.app.common.utils.j.j(GameDetialModleFourAdapter.this.f42190c)) {
                                        com.join.mgps.Util.l2.a(GameDetialModleFourAdapter.this.f42190c).b("无网络连接");
                                        return;
                                    } else {
                                        UtilsMy.r4(GameDetialModleFourAdapter.this.f42190c, downloadTask);
                                        return;
                                    }
                                } else if (status != 43) {
                                    switch (status) {
                                        case 9:
                                            if (!com.join.android.app.common.utils.j.j(GameDetialModleFourAdapter.this.f42190c)) {
                                                com.join.mgps.Util.l2.a(GameDetialModleFourAdapter.this.f42190c).b("无网络连接");
                                                return;
                                            } else {
                                                UtilsMy.I2(GameDetialModleFourAdapter.this.f42190c, downloadTask);
                                                return;
                                            }
                                        case 10:
                                            break;
                                        case 11:
                                            UtilsMy.a4(downloadTask, GameDetialModleFourAdapter.this.f42190c);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                            }
                        }
                    }
                    com.php25.PDownload.d.c(downloadTask, GameDetialModleFourAdapter.this.f42190c);
                    return;
                }
                com.php25.PDownload.d.i(downloadTask);
                return;
            }
            if (UtilsMy.y0(this.f42421b.getPay_tag_info(), this.f42421b.getCrc_sign_id()) > 0) {
                UtilsMy.d4(GameDetialModleFourAdapter.this.f42190c, downloadTask.getCrc_link_type_val());
            } else if (this.f42421b.getDown_status() == 5) {
                UtilsMy.l1(GameDetialModleFourAdapter.this.f42190c, downloadTask);
            } else {
                UtilsMy.R0(GameDetialModleFourAdapter.this.f42190c, downloadTask, this.f42421b.getTp_down_url(), this.f42421b.getOther_down_switch(), this.f42421b.getCdn_down_switch());
            }
        }
    }

    /* loaded from: classes4.dex */
    class l2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f42424a;

        public l2(View view) {
            super(view);
            this.f42424a = (LinearLayout) view.findViewById(R.id.itemLayout);
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goMainLabelActivity(GameDetialModleFourAdapter.this.f42190c, 0, GameDetialModleFourAdapter.this.f42188a.getCommunity_entrance_tag(), 1);
        }
    }

    /* loaded from: classes4.dex */
    class m0 implements AdapterView.d {
        m0() {
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.d
        public void a(AdapterView<?> adapterView, View view, int i4, long j4) {
            com.papa.sim.statistic.p.l(view.getContext()).F("xuanguan", AccountUtil_.getInstance_(view.getContext()).getUid());
            GameDetialModleFourAdapter.this.r(view.getContext(), "选关");
        }
    }

    /* loaded from: classes4.dex */
    class m1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayout f42428a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f42429b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f42430c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f42431d;

        /* renamed from: e  reason: collision with root package name */
        private ImageView f42432e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f42433f;

        /* renamed from: g  reason: collision with root package name */
        private MStarBar f42434g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f42435h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f42436i;

        /* renamed from: j  reason: collision with root package name */
        private ImageView f42437j;

        /* renamed from: k  reason: collision with root package name */
        private TextView f42438k;

        /* renamed from: l  reason: collision with root package name */
        private TextView f42439l;

        /* renamed from: m  reason: collision with root package name */
        public View f42440m;

        /* renamed from: n  reason: collision with root package name */
        private TextView f42441n;

        /* renamed from: o  reason: collision with root package name */
        private ImageView f42442o;

        /* renamed from: p  reason: collision with root package name */
        private TextView f42443p;

        /* renamed from: q  reason: collision with root package name */
        private ImageView f42444q;

        /* renamed from: r  reason: collision with root package name */
        private TextView f42445r;

        /* renamed from: s  reason: collision with root package name */
        private ImageView f42446s;

        /* renamed from: t  reason: collision with root package name */
        private TextView f42447t;

        /* renamed from: u  reason: collision with root package name */
        private VipView f42448u;

        /* renamed from: v  reason: collision with root package name */
        private View f42449v;

        public m1(View view) {
            super(view);
            this.f42428a = (LinearLayout) view.findViewById(R.id.commentAllRootLl);
            this.f42429b = (SimpleDraweeView) view.findViewById(R.id.usericon);
            this.f42430c = (TextView) view.findViewById(R.id.userName);
            this.f42431d = (TextView) view.findViewById(R.id.isMe);
            this.f42432e = (ImageView) view.findViewById(R.id.isAuth);
            this.f42437j = (ImageView) view.findViewById(R.id.isGood);
            this.f42433f = (TextView) view.findViewById(R.id.isConnoisseurs);
            this.f42434g = (MStarBar) view.findViewById(R.id.comment_head_mstarBar);
            this.f42435h = (TextView) view.findViewById(R.id.comment_head_num_tx);
            this.f42436i = (TextView) view.findViewById(R.id.time);
            this.f42438k = (TextView) view.findViewById(R.id.content);
            this.f42439l = (TextView) view.findViewById(R.id.more);
            this.f42440m = view.findViewById(R.id.line);
            this.f42441n = (TextView) view.findViewById(R.id.phoneModle);
            this.f42442o = (ImageView) view.findViewById(R.id.parise);
            this.f42443p = (TextView) view.findViewById(R.id.pariseNumber);
            this.f42444q = (ImageView) view.findViewById(R.id.down);
            this.f42445r = (TextView) view.findViewById(R.id.downNumber);
            this.f42446s = (ImageView) view.findViewById(R.id.message);
            this.f42447t = (TextView) view.findViewById(R.id.messageNumber);
            this.f42448u = (VipView) view.findViewById(R.id.levelTv);
            this.f42449v = view.findViewById(R.id.layoutTop);
        }
    }

    /* loaded from: classes4.dex */
    class m2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f42451a;

        public m2(View view) {
            super(view);
            this.f42451a = (TextView) view.findViewById(R.id.htmlEditRecommend);
        }
    }

    /* loaded from: classes4.dex */
    class n implements ExpandLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n1 f42453a;

        n(n1 n1Var) {
            this.f42453a = n1Var;
        }

        @Override // com.join.mgps.customview.ExpandLayout.b
        public void a() {
        }

        @Override // com.join.mgps.customview.ExpandLayout.b
        public void b() {
            n1 n1Var = this.f42453a;
            w1.j jVar = n1Var.f42459d;
            if (jVar != null) {
                jVar.a(n1Var);
            }
        }

        @Override // com.join.mgps.customview.ExpandLayout.b
        public void c() {
        }
    }

    /* loaded from: classes4.dex */
    class n0 implements View.OnClickListener {
        n0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.papa.sim.statistic.p.l(view.getContext()).F("jinshouzhi", AccountUtil_.getInstance_(view.getContext()).getUid());
            GameDetialModleFourAdapter.this.r(view.getContext(), GameMainActivity4.I2);
        }
    }

    /* loaded from: classes4.dex */
    public class n1 {

        /* renamed from: a  reason: collision with root package name */
        public Object f42456a;

        /* renamed from: b  reason: collision with root package name */
        public int f42457b;

        /* renamed from: c  reason: collision with root package name */
        public int f42458c;

        /* renamed from: d  reason: collision with root package name */
        public w1.j f42459d;

        /* renamed from: e  reason: collision with root package name */
        public int f42460e;

        /* renamed from: f  reason: collision with root package name */
        public Object f42461f;

        /* renamed from: g  reason: collision with root package name */
        public Object f42462g;

        /* renamed from: h  reason: collision with root package name */
        public Object f42463h;

        public n1(GameDetialModleFourAdapter gameDetialModleFourAdapter, Object obj, int i4) {
            this(gameDetialModleFourAdapter, obj, i4, null);
        }

        public n1(GameDetialModleFourAdapter gameDetialModleFourAdapter, Object obj, int i4, w1.j jVar) {
            this(obj, i4, 0, jVar);
        }

        public n1(Object obj, int i4, int i5, w1.j jVar) {
            this.f42460e = 0;
            this.f42456a = obj;
            this.f42457b = i4;
            this.f42459d = jVar;
            this.f42460e = i5;
        }
    }

    /* loaded from: classes4.dex */
    class n2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f42465a;

        /* renamed from: b  reason: collision with root package name */
        View f42466b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42467c;

        /* renamed from: d  reason: collision with root package name */
        LinearLayout f42468d;

        /* renamed from: e  reason: collision with root package name */
        TextView f42469e;

        /* renamed from: f  reason: collision with root package name */
        TextView f42470f;

        /* renamed from: g  reason: collision with root package name */
        TextView f42471g;

        /* renamed from: h  reason: collision with root package name */
        TextView f42472h;

        /* renamed from: i  reason: collision with root package name */
        TextView f42473i;

        /* renamed from: j  reason: collision with root package name */
        TextView f42474j;

        /* renamed from: k  reason: collision with root package name */
        TextView f42475k;

        /* renamed from: l  reason: collision with root package name */
        TextView f42476l;

        /* renamed from: m  reason: collision with root package name */
        TextView f42477m;

        /* renamed from: n  reason: collision with root package name */
        TextView f42478n;

        /* renamed from: o  reason: collision with root package name */
        LinearLayout f42479o;

        /* renamed from: p  reason: collision with root package name */
        LinearLayout f42480p;

        /* renamed from: q  reason: collision with root package name */
        LinearLayout f42481q;

        /* renamed from: r  reason: collision with root package name */
        LinearLayout f42482r;

        /* renamed from: s  reason: collision with root package name */
        LinearLayout f42483s;

        public n2(View view) {
            super(view);
            this.f42465a = (TextView) view.findViewById(R.id.message);
            this.f42466b = view.findViewById(R.id.message1);
            this.f42467c = (TextView) view.findViewById(R.id.moreText);
            this.f42468d = (LinearLayout) view.findViewById(R.id.look_other);
            this.f42467c = (TextView) view.findViewById(R.id.moreText);
            this.f42469e = (TextView) view.findViewById(R.id.downNumberTitle);
            this.f42468d = (LinearLayout) view.findViewById(R.id.look_other);
            this.f42470f = (TextView) view.findViewById(R.id.downNumber);
            this.f42471g = (TextView) view.findViewById(R.id.nowVersion);
            this.f42472h = (TextView) view.findViewById(R.id.appSize);
            this.f42473i = (TextView) view.findViewById(R.id.updateDate);
            this.f42474j = (TextView) view.findViewById(R.id.androdVersion);
            this.f42475k = (TextView) view.findViewById(R.id.commpany);
            this.f42476l = (TextView) view.findViewById(R.id.resousFrom);
            this.f42477m = (TextView) view.findViewById(R.id.upGame);
            this.f42479o = (LinearLayout) view.findViewById(R.id.resousFromLayout);
            this.f42480p = (LinearLayout) view.findViewById(R.id.commpanyLayout);
            this.f42482r = (LinearLayout) view.findViewById(R.id.androdVersionLayout);
            this.f42481q = (LinearLayout) view.findViewById(R.id.nowVersionLayout);
            this.f42483s = (LinearLayout) view.findViewById(R.id.sizelayout);
            this.f42478n = (TextView) view.findViewById(R.id.titleText);
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f42485b;

        o(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f42485b = giftPackageDataInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42485b.getGift_package_status() == 0) {
                GameDetialModleFourAdapter.this.f42192e.l(true, this.f42485b);
            } else {
                GameDetialModleFourAdapter.this.f42192e.l(false, this.f42485b);
            }
        }
    }

    /* loaded from: classes4.dex */
    class o0 implements View.OnClickListener {
        o0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.papa.sim.statistic.p.l(view.getContext()).F("yuncundang", AccountUtil_.getInstance_(view.getContext()).getUid());
            GameDetialModleFourAdapter.this.r(view.getContext(), "云存档");
        }
    }

    /* loaded from: classes4.dex */
    class o1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        HListView f42488a;

        public o1(View view) {
            super(view);
            this.f42488a = (HListView) view.findViewById(R.id.hlv_list);
        }
    }

    /* loaded from: classes4.dex */
    class o2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f42490a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42491b;

        /* renamed from: c  reason: collision with root package name */
        LinearLayout f42492c;

        public o2(View view) {
            super(view);
            this.f42490a = (TextView) view.findViewById(R.id.message);
            this.f42491b = (TextView) view.findViewById(R.id.moreText);
            this.f42492c = (LinearLayout) view.findViewById(R.id.look_other);
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f42494b;

        p(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f42494b = giftPackageDataInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            try {
                str = URLEncoder.encode(GameDetialModleFourAdapter.this.f42188a.getGame_name(), "utf8");
            } catch (UnsupportedEncodingException e5) {
                e5.printStackTrace();
                str = "";
            }
            IntentUtil intentUtil = IntentUtil.getInstance();
            Context context = GameDetialModleFourAdapter.this.f42190c;
            intentUtil.goShareWebActivity(context, com.join.mgps.rpc.h.f54056j + "/static/vip2020/v2/index.html#/giftDetail?gift_package_id=" + this.f42494b.getGift_package_id() + "&name=" + str);
        }
    }

    /* loaded from: classes4.dex */
    class p0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f42496b;

        p0(CommentBaseBean commentBaseBean) {
            this.f42496b = commentBaseBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(Integer.parseInt(this.f42496b.getUid())).start();
        }
    }

    /* loaded from: classes4.dex */
    public interface p1 {
        void a(InformationCommentBean informationCommentBean);

        void b(CommentBaseBean commentBaseBean, int i4, int i5);

        void c(CommentBaseBean commentBaseBean, int i4, int i5);

        void d(CommentBaseBean commentBaseBean);

        void e(InformationCommentBean.Sub sub);

        void f(InformationCommentBean informationCommentBean);

        void g();

        void h();

        void i();

        void j();

        void k();

        void l(boolean z4, GiftPackageDataInfoBean giftPackageDataInfoBean);
    }

    /* loaded from: classes4.dex */
    class p2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f42498a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42499b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42500c;

        public p2(View view) {
            super(view);
            this.f42498a = (LinearLayout) view.findViewById(R.id.handSharkLayout);
            this.f42499b = (TextView) view.findViewById(R.id.title);
            this.f42500c = (TextView) view.findViewById(R.id.suntitle);
        }
    }

    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f42502b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ GameDetialAuxiliaryBean f42503c;

        q(List list, GameDetialAuxiliaryBean gameDetialAuxiliaryBean) {
            this.f42502b = list;
            this.f42503c = gameDetialAuxiliaryBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42502b.size() > 0) {
                IntentUtil.getInstance().goShareWebActivity(GameDetialModleFourAdapter.this.f42190c, this.f42503c.getMore_url());
            }
        }
    }

    /* loaded from: classes4.dex */
    class q0 implements View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m1 f42505b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42506c;

        /* loaded from: classes4.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Layout layout = q0.this.f42505b.f42438k.getLayout();
                if (layout == null) {
                    q0.this.f42505b.f42439l.setVisibility(8);
                    return;
                }
                int lineCount = layout.getLineCount();
                if (lineCount > 0) {
                    if (layout.getEllipsisCount(lineCount - 1) > 0) {
                        q0.this.f42505b.f42439l.setVisibility(0);
                    } else if (GameDetialModleFourAdapter.this.f42195h.containsKey(Integer.valueOf(q0.this.f42506c))) {
                        q0.this.f42505b.f42439l.setVisibility(0);
                    } else {
                        q0.this.f42505b.f42439l.setVisibility(8);
                    }
                }
            }
        }

        q0(m1 m1Var, int i4) {
            this.f42505b = m1Var;
            this.f42506c = i4;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f42505b.f42438k.post(new a());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes4.dex */
    public class q1 extends n1 {

        /* renamed from: j  reason: collision with root package name */
        private final int f42509j;

        /* renamed from: k  reason: collision with root package name */
        private final int f42510k;

        public q1(int i4, int i5, Object obj, int i6) {
            super(GameDetialModleFourAdapter.this, obj, i6);
            this.f42509j = i4;
            this.f42510k = i5;
        }
    }

    /* loaded from: classes4.dex */
    class q2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f42512a;

        /* renamed from: b  reason: collision with root package name */
        MyGridView f42513b;

        /* renamed from: c  reason: collision with root package name */
        View f42514c;

        public q2(View view) {
            super(view);
            this.f42513b = (MyGridView) view.findViewById(R.id.recomListView);
            this.f42512a = (LinearLayout) view.findViewById(R.id.layoutContent);
            this.f42514c = view.findViewById(R.id.line_h);
        }
    }

    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f42516b;

        r(List list) {
            this.f42516b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42516b.size() > 0) {
                IntentUtil.getInstance().goShareWebActivity(GameDetialModleFourAdapter.this.f42190c, ((GamedetialAuxiliaryToolBean) this.f42516b.get(0)).getUrl());
            }
        }
    }

    /* loaded from: classes4.dex */
    class r0 implements View.OnClickListener {
        r0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.join.mgps.Util.g2.h(GameDetialModleFourAdapter.this.f42188a.getGame_company_id()) || "0".equals(GameDetialModleFourAdapter.this.f42188a.getGame_company_id())) {
                return;
            }
            PaPaBannerListActivity_.k0(GameDetialModleFourAdapter.this.f42190c).e(1).a(true).c(GameDetialModleFourAdapter.this.f42188a.getGame_company_id()).d(GameDetialModleFourAdapter.this.f42188a.getCompany_name()).start();
        }
    }

    /* loaded from: classes4.dex */
    public static class r1 {

        /* renamed from: a  reason: collision with root package name */
        public String f42519a;

        /* renamed from: b  reason: collision with root package name */
        public InformationCommentBean f42520b;

        /* renamed from: c  reason: collision with root package name */
        public int f42521c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f42522d;

        /* renamed from: e  reason: collision with root package name */
        public int f42523e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f42524f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f42525g;

        public r1(String str, InformationCommentBean informationCommentBean, int i4, boolean z4) {
            this.f42519a = str;
            this.f42520b = informationCommentBean;
            this.f42521c = i4;
            this.f42522d = z4;
        }
    }

    /* loaded from: classes4.dex */
    class r2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        public LinearLayout f42526a;

        /* renamed from: b  reason: collision with root package name */
        public Button f42527b;

        /* renamed from: c  reason: collision with root package name */
        public HorizontalScrollView f42528c;

        public r2(View view) {
            super(view);
            this.f42526a = (LinearLayout) view.findViewById(R.id.titleMoreTip);
            this.f42527b = (Button) view.findViewById(R.id.titleMoreBookButn);
            this.f42528c = (HorizontalScrollView) view.findViewById(R.id.scrollView);
        }
    }

    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f42530b;

        s(List list) {
            this.f42530b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42530b.size() > 1) {
                IntentUtil.getInstance().goShareWebActivity(GameDetialModleFourAdapter.this.f42190c, ((GamedetialAuxiliaryToolBean) this.f42530b.get(1)).getUrl());
            }
        }
    }

    /* loaded from: classes4.dex */
    class s0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m1 f42532b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42533c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f42534d;

        s0(m1 m1Var, int i4, CommentBaseBean commentBaseBean) {
            this.f42532b = m1Var;
            this.f42533c = i4;
            this.f42534d = commentBaseBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42532b.f42439l.getText().toString().equals("查看全部")) {
                GameDetialModleFourAdapter.this.f42195h.put(Integer.valueOf(this.f42533c), Boolean.TRUE);
                if (Build.VERSION.SDK_INT == 19) {
                    this.f42532b.f42438k.setText(this.f42534d.getContent());
                }
                this.f42532b.f42438k.setMaxLines(Integer.MAX_VALUE);
                this.f42532b.f42439l.setText("收起");
                return;
            }
            GameDetialModleFourAdapter.this.f42195h.put(Integer.valueOf(this.f42533c), Boolean.FALSE);
            if (Build.VERSION.SDK_INT == 19) {
                this.f42532b.f42438k.setText(this.f42534d.getContent().replaceAll("\n", ""));
            }
            this.f42532b.f42438k.setMaxLines(5);
            this.f42532b.f42439l.setText("查看全部");
        }
    }

    /* loaded from: classes4.dex */
    class s1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        public TextView f42536a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f42537b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f42538c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f42539d;

        /* renamed from: e  reason: collision with root package name */
        public LinearLayout f42540e;

        /* renamed from: f  reason: collision with root package name */
        public LinearLayout f42541f;

        /* renamed from: g  reason: collision with root package name */
        public ImageView f42542g;

        /* renamed from: h  reason: collision with root package name */
        public ImageView f42543h;

        /* renamed from: i  reason: collision with root package name */
        public ImageView f42544i;

        /* renamed from: j  reason: collision with root package name */
        public ImageView f42545j;

        /* renamed from: k  reason: collision with root package name */
        ExpandLayout f42546k;

        /* renamed from: l  reason: collision with root package name */
        ExpandLayout f42547l;

        /* renamed from: m  reason: collision with root package name */
        public LinearLayout f42548m;

        /* renamed from: n  reason: collision with root package name */
        public LinearLayout f42549n;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    GameDetialModleFourAdapter.this.f42190c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqwpa://im/chat?chat_type=wpa&uin=" + GameDetialModleFourAdapter.this.f42188a.getGame_exclusive_benefits_qq() + "&version=1")));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    GameDetialModleFourAdapter.this.f42190c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqwpa://im/chat?chat_type=wpa&uin=" + GameDetialModleFourAdapter.this.f42188a.getGame_exclusive_benefits_qq() + "&version=1")));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        public s1(View view) {
            super(view);
            this.f42536a = (TextView) view.findViewById(R.id.titleText);
            this.f42538c = (TextView) view.findViewById(R.id.moreText);
            this.f42540e = (LinearLayout) view.findViewById(R.id.look_other);
            this.f42542g = (ImageView) view.findViewById(R.id.imageView5);
            this.f42544i = (ImageView) view.findViewById(R.id.icon);
            this.f42546k = (ExpandLayout) view.findViewById(R.id.el_view);
            this.f42548m = (LinearLayout) view.findViewById(R.id.ll_welfare);
            this.f42537b = (TextView) view.findViewById(R.id.titleText_1);
            this.f42539d = (TextView) view.findViewById(R.id.moreText_1);
            this.f42541f = (LinearLayout) view.findViewById(R.id.look_other_1);
            this.f42543h = (ImageView) view.findViewById(R.id.imageView5_1);
            this.f42545j = (ImageView) view.findViewById(R.id.icon_1);
            this.f42547l = (ExpandLayout) view.findViewById(R.id.el_view_1);
            this.f42549n = (LinearLayout) view.findViewById(R.id.ll_welfare_1);
        }

        public void a(String str, String str2) {
            if (com.join.mgps.Util.g2.i(str)) {
                this.f42548m.setVisibility(0);
                this.f42544i.setVisibility(0);
                this.f42544i.setImageResource(R.drawable.bt_gift_icon);
                this.f42536a.setText("专属福利");
                this.f42546k.setContent(str);
                if (com.join.mgps.Util.g2.i(GameDetialModleFourAdapter.this.f42188a.getGame_exclusive_benefits_qq()) && com.join.mgps.Util.g2.h(str2)) {
                    this.f42538c.setText("联系客服");
                    this.f42538c.setTextColor(Color.parseColor("#f47500"));
                    this.f42538c.setTextSize(0, GameDetialModleFourAdapter.this.f42190c.getResources().getDimensionPixelSize(R.dimen.wdp28));
                    this.f42540e.setVisibility(0);
                    this.f42540e.setOnClickListener(new a());
                }
            } else {
                this.f42548m.setVisibility(8);
            }
            if (com.join.mgps.Util.g2.i(str2)) {
                this.f42549n.setVisibility(0);
                this.f42545j.setImageResource(R.drawable.bt_backsouse_icon);
                this.f42545j.setVisibility(0);
                this.f42537b.setText("充值返利");
                this.f42547l.setContent(str2);
                if (com.join.mgps.Util.g2.i(GameDetialModleFourAdapter.this.f42188a.getGame_exclusive_benefits_qq())) {
                    this.f42539d.setText("联系客服");
                    this.f42539d.setTextColor(Color.parseColor("#f47500"));
                    this.f42539d.setTextSize(0, GameDetialModleFourAdapter.this.f42190c.getResources().getDimensionPixelSize(R.dimen.wdp28));
                    this.f42541f.setVisibility(0);
                    this.f42541f.setOnClickListener(new b());
                    return;
                }
                return;
            }
            this.f42549n.setVisibility(8);
        }
    }

    /* loaded from: classes4.dex */
    class s2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f42553a;

        /* renamed from: b  reason: collision with root package name */
        LinearLayout f42554b;

        /* renamed from: c  reason: collision with root package name */
        LinearLayout f42555c;

        public s2(View view) {
            super(view);
            this.f42553a = (LinearLayout) view.findViewById(R.id.linearLayout);
            this.f42554b = (LinearLayout) view.findViewById(R.id.linearLayout_top);
            this.f42555c = (LinearLayout) view.findViewById(R.id.linearLayout_bottom);
        }
    }

    /* loaded from: classes4.dex */
    class t implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f42557b;

        t(List list) {
            this.f42557b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42557b.size() > 2) {
                IntentUtil.getInstance().goShareWebActivity(GameDetialModleFourAdapter.this.f42190c, ((GamedetialAuxiliaryToolBean) this.f42557b.get(2)).getUrl());
            }
        }
    }

    /* loaded from: classes4.dex */
    class t0 implements AdapterView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f42559a;

        t0(List list) {
            this.f42559a = list;
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.d
        public void a(AdapterView<?> adapterView, View view, int i4, long j4) {
            try {
                Intent intent = new Intent(GameDetialModleFourAdapter.this.f42190c, ImagePagerActivity.class);
                String[] strArr = new String[this.f42559a.size()];
                for (int i5 = 0; i5 < this.f42559a.size(); i5++) {
                    strArr[i5] = ((ImageInfo) this.f42559a.get(i5)).getUrl();
                }
                intent.putExtra("image_urls", strArr);
                intent.putExtra("image_index", i4);
                GameDetialModleFourAdapter.this.f42190c.startActivity(intent);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes4.dex */
    class t1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        HListView f42561a;

        public t1(View view) {
            super(view);
            this.f42561a = (HListView) view.findViewById(R.id.favoriteList);
        }
    }

    /* loaded from: classes4.dex */
    class t2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        public LinearLayout f42563a;

        public t2(View view) {
            super(view);
            this.f42563a = (LinearLayout) view.findViewById(R.id.tipslayout);
        }
    }

    /* loaded from: classes4.dex */
    class u implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o2 f42565b;

        u(o2 o2Var) {
            this.f42565b = o2Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if ("收起".equals(this.f42565b.f42491b.getText().toString())) {
                this.f42565b.f42491b.setText("展开");
                this.f42565b.f42490a.setVisibility(8);
                return;
            }
            this.f42565b.f42491b.setText("收起");
            this.f42565b.f42490a.setVisibility(0);
        }
    }

    /* loaded from: classes4.dex */
    class u0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectionBeanSubBusiness f42567b;

        u0(CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f42567b = collectionBeanSubBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Ext ext = new Ext();
            ext.setPosition("brief");
            ext.setGameId(this.f42567b.getCrc_sign_id());
            ext.setArticleId(this.f42567b.get_from() + "");
            com.papa.sim.statistic.p.l(GameDetialModleFourAdapter.this.f42190c).O1(Event.clickFromUserGameList, ext);
            IntentUtil.getInstance().goGameDetialActivity(GameDetialModleFourAdapter.this.f42190c, this.f42567b.getCrc_sign_id(), this.f42567b.getGame_info_tpl_type(), this.f42567b.getSp_tpl_two_position(), this.f42567b.get_from());
        }
    }

    /* loaded from: classes4.dex */
    private class u1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        View f42569a;

        /* renamed from: b  reason: collision with root package name */
        View f42570b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42571c;

        /* renamed from: d  reason: collision with root package name */
        TextView f42572d;

        /* renamed from: e  reason: collision with root package name */
        TextView f42573e;

        /* renamed from: f  reason: collision with root package name */
        SimpleDraweeView f42574f;

        public u1(View view) {
            super(view);
            this.f42569a = view.findViewById(R.id.line_h);
            this.f42571c = (TextView) view.findViewById(R.id.count);
            this.f42572d = (TextView) view.findViewById(R.id.auth);
            this.f42573e = (TextView) view.findViewById(R.id.title);
            this.f42574f = (SimpleDraweeView) view.findViewById(R.id.icon);
            this.f42570b = view.findViewById(R.id.top);
        }
    }

    /* loaded from: classes4.dex */
    class u2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        public TextView f42576a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f42577b;

        /* renamed from: c  reason: collision with root package name */
        public LinearLayout f42578c;

        /* renamed from: d  reason: collision with root package name */
        public View f42579d;

        /* renamed from: e  reason: collision with root package name */
        public View f42580e;

        /* renamed from: f  reason: collision with root package name */
        public ImageView f42581f;

        /* renamed from: g  reason: collision with root package name */
        public ImageView f42582g;

        public u2(View view) {
            super(view);
            this.f42576a = (TextView) view.findViewById(R.id.titleText);
            this.f42577b = (TextView) view.findViewById(R.id.moreText);
            this.f42580e = view.findViewById(R.id.line_h);
            this.f42578c = (LinearLayout) view.findViewById(R.id.look_other);
            this.f42579d = view.findViewById(R.id.layoutTop);
            this.f42581f = (ImageView) view.findViewById(R.id.imageView5);
            this.f42582g = (ImageView) view.findViewById(R.id.icon);
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.papa.sim.statistic.p.l(view.getContext()).F("yuncundang", AccountUtil_.getInstance_(view.getContext()).getUid());
            GameDetialModleFourAdapter.this.r(view.getContext(), "云存档");
        }
    }

    /* loaded from: classes4.dex */
    class v0 implements ActivityTabView.d {
        v0() {
        }

        @Override // com.join.mgps.customview.ActivityTabView.d
        public void a(String str) {
            IntentUtil.getInstance().goShareWebActivity(GameDetialModleFourAdapter.this.f42190c, str);
        }

        @Override // com.join.mgps.customview.ActivityTabView.d
        public void b() {
            BTActivityBean bTActivityBean;
            BtGameWelfare game_welfare = GameDetialModleFourAdapter.this.f42188a.getGame_welfare();
            if (game_welfare != null) {
                List<BTActivityBean> game_activity_summary = game_welfare.getGame_activity_summary();
                if (game_activity_summary != null && game_activity_summary.size() > 1) {
                    Intent intent = new Intent(GameDetialModleFourAdapter.this.f42190c, NoticeListActivity.class);
                    intent.putExtra("gameId", GameDetialModleFourAdapter.this.f42188a.getCrc_sign_id());
                    GameDetialModleFourAdapter.this.f42190c.startActivity(intent);
                } else if (game_activity_summary.size() != 1 || (bTActivityBean = game_activity_summary.get(0)) == null) {
                } else {
                    IntentUtil.getInstance().goShareWebActivity(GameDetialModleFourAdapter.this.f42190c, bTActivityBean.getJump_url());
                }
            }
        }

        @Override // com.join.mgps.customview.ActivityTabView.d
        public void c(String str) {
            IntentUtil.getInstance().goShareWebActivity(GameDetialModleFourAdapter.this.f42190c, str);
        }
    }

    /* loaded from: classes4.dex */
    class v1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f42586a;

        /* renamed from: b  reason: collision with root package name */
        LinearLayout f42587b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42588c;

        /* renamed from: d  reason: collision with root package name */
        View f42589d;

        /* renamed from: e  reason: collision with root package name */
        View f42590e;

        public v1(View view) {
            super(view);
            this.f42586a = (LinearLayout) view.findViewById(R.id.goCommit);
            this.f42587b = (LinearLayout) view.findViewById(R.id.starlayout);
            this.f42588c = (TextView) view.findViewById(R.id.textMessage);
            this.f42589d = view.findViewById(R.id.layoutTop);
            this.f42590e = view.findViewById(R.id.layoutTop2);
        }
    }

    /* loaded from: classes4.dex */
    class v2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f42592a;

        /* renamed from: b  reason: collision with root package name */
        StandardVideoView f42593b;

        /* renamed from: c  reason: collision with root package name */
        LinearLayout f42594c;

        public v2(View view) {
            super(view);
            this.f42592a = (SimpleDraweeView) view.findViewById(R.id.iv_book_bg);
            this.f42593b = (StandardVideoView) view.findViewById(R.id.videoPlayer);
            this.f42594c = (LinearLayout) view.findViewById(R.id.rl_top);
        }
    }

    /* loaded from: classes4.dex */
    class w implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n2 f42596b;

        w(n2 n2Var) {
            this.f42596b = n2Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if ("收起".equals(this.f42596b.f42467c.getText().toString())) {
                this.f42596b.f42467c.setText("展开");
                if (GameDetialModleFourAdapter.this.f42188a.getGame_upgrade_info_switch() == 1) {
                    this.f42596b.f42465a.setVisibility(8);
                }
                if (GameDetialModleFourAdapter.this.f42188a.getGame_detailed() != null) {
                    this.f42596b.f42466b.setVisibility(8);
                    return;
                }
                return;
            }
            this.f42596b.f42467c.setText("收起");
            if (GameDetialModleFourAdapter.this.f42188a.getGame_upgrade_info_switch() == 1) {
                this.f42596b.f42465a.setVisibility(0);
            }
            if (GameDetialModleFourAdapter.this.f42188a.getGame_detailed() != null) {
                this.f42596b.f42466b.setVisibility(0);
            }
        }
    }

    /* loaded from: classes4.dex */
    class w0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f42598b;

        w0(InformationCommentBean informationCommentBean) {
            this.f42598b = informationCommentBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p1 p1Var = GameDetialModleFourAdapter.this.f42192e;
            if (p1Var != null) {
                p1Var.f(this.f42598b);
            }
        }
    }

    /* loaded from: classes4.dex */
    class w1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f42600a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42601b;

        public w1(View view) {
            super(view);
            this.f42600a = (TextView) view.findViewById(R.id.info);
            this.f42601b = (TextView) view.findViewById(R.id.more);
        }
    }

    /* loaded from: classes4.dex */
    class w2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        HListView f42603a;

        public w2(View view) {
            super(view);
            this.f42603a = (HListView) view.findViewById(R.id.screenListView);
        }
    }

    /* loaded from: classes4.dex */
    class x implements View.OnClickListener {
        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.join.mgps.Util.g2.h(GameDetialModleFourAdapter.this.f42188a.getGame_company_id()) || "0".equals(GameDetialModleFourAdapter.this.f42188a.getGame_company_id())) {
                return;
            }
            PaPaBannerListActivity_.k0(GameDetialModleFourAdapter.this.f42190c).e(1).a(true).c(GameDetialModleFourAdapter.this.f42188a.getGame_company_id()).d(GameDetialModleFourAdapter.this.f42188a.getCompany_name()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class x0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f42606b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42607c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f42608d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r1 f42609e;

        x0(int i4, int i5, String str, r1 r1Var) {
            this.f42606b = i4;
            this.f42607c = i5;
            this.f42608d = str;
            this.f42609e = r1Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42606b == 0) {
                return;
            }
            InformationCommentBean informationCommentBean = new InformationCommentBean();
            ArrayList arrayList = new ArrayList();
            for (int i4 = this.f42606b; i4 >= 0; i4--) {
                n1 n1Var = (n1) GameDetialModleFourAdapter.this.f42202o.get(this.f42607c - i4);
                r1 r1Var = n1Var.f42457b == 15 ? (r1) n1Var.f42456a : null;
                if (r1Var != null && this.f42608d == r1Var.f42519a) {
                    arrayList.addAll(r1Var.f42520b.getSub());
                }
            }
            for (int i5 = 0; i5 <= this.f42606b; i5++) {
                GameDetialModleFourAdapter.this.f42202o.remove(this.f42607c - i5);
            }
            informationCommentBean.setSub(arrayList);
            GameDetialModleFourAdapter.this.f42202o.add(this.f42607c - this.f42606b, GameDetialModleFourAdapter.this.p(this.f42608d, informationCommentBean, this.f42609e.f42521c, true));
            GameDetialModleFourAdapter.this.notifyDataSetChanged();
        }
    }

    /* loaded from: classes4.dex */
    class x1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        public TextView f42611a;

        /* renamed from: b  reason: collision with root package name */
        public LinearLayout f42612b;

        /* renamed from: c  reason: collision with root package name */
        public View f42613c;

        /* renamed from: d  reason: collision with root package name */
        public View f42614d;

        /* renamed from: e  reason: collision with root package name */
        public ImageView f42615e;

        /* renamed from: f  reason: collision with root package name */
        public ImageView f42616f;

        /* renamed from: g  reason: collision with root package name */
        public ExpandLayout f42617g;

        /* renamed from: h  reason: collision with root package name */
        public TextView f42618h;

        /* renamed from: i  reason: collision with root package name */
        public LinearLayout f42619i;

        public x1(View view) {
            super(view);
            this.f42611a = (TextView) view.findViewById(R.id.titleText);
            this.f42614d = view.findViewById(R.id.line_h);
            this.f42612b = (LinearLayout) view.findViewById(R.id.look_other);
            this.f42613c = view.findViewById(R.id.layoutTop);
            this.f42615e = (ImageView) view.findViewById(R.id.imageView5);
            this.f42616f = (ImageView) view.findViewById(R.id.icon);
            this.f42617g = (ExpandLayout) view.findViewById(R.id.el_view);
            this.f42618h = (TextView) view.findViewById(R.id.tv_view);
            this.f42619i = (LinearLayout) view.findViewById(R.id.ll_container);
        }
    }

    /* loaded from: classes4.dex */
    class x2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f42621a;

        /* renamed from: b  reason: collision with root package name */
        LinearLayout f42622b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f42623c;

        /* renamed from: d  reason: collision with root package name */
        ImageView f42624d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                w1.i iVar = GameDetialModleFourAdapter.this.f42200m;
                if (iVar != null) {
                    iVar.C();
                }
            }
        }

        public x2(View view) {
            super(view);
            this.f42621a = (TextView) view.findViewById(R.id.tv_text);
            this.f42622b = (LinearLayout) view.findViewById(R.id.ll_more);
            this.f42623c = (ImageView) view.findViewById(R.id.iv_list);
            this.f42624d = (ImageView) view.findViewById(R.id.iv_pc);
        }

        public void a(String str) {
            this.f42621a.setText(str);
            this.f42623c.setColorFilter(Color.parseColor("#307EFF"));
            this.f42624d.setColorFilter(Color.parseColor("#307EFF"));
            this.f42622b.setOnClickListener(new a());
        }
    }

    /* loaded from: classes4.dex */
    class y implements View.OnClickListener {
        y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(GameDetialModleFourAdapter.this.f42190c).getAccountData();
            if (accountData == null || accountData.getUid() == 0) {
                com.join.mgps.Util.l2.a(GameDetialModleFourAdapter.this.f42190c).b("让大伙知道分享者的大名");
                IntentUtil.getInstance().goLoginInteractive(GameDetialModleFourAdapter.this.f42190c);
            } else if (com.join.mgps.Util.g2.h(accountData.getNickname()) || (accountData.getAccount().equals(accountData.getNickname()) && accountData.getAccount().startsWith("pa"))) {
                IntentUtil.getInstance().goChangeNickname(GameDetialModleFourAdapter.this.f42190c);
            } else {
                PrefDef_ prefDef_ = new PrefDef_(GameDetialModleFourAdapter.this.f42190c);
                if (com.join.mgps.Util.g2.i(prefDef_.uploadType2().d())) {
                    IntentUtil.getInstance().goShareWebActivity(GameDetialModleFourAdapter.this.f42190c, prefDef_.uploadType2().d());
                } else {
                    UploadActivity_.Q0(GameDetialModleFourAdapter.this.f42190c).start();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class y0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f42628b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f42629c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f42630d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f42631e;

        y0(int i4, InformationCommentBean informationCommentBean, String str, int i5) {
            this.f42628b = i4;
            this.f42629c = informationCommentBean;
            this.f42630d = str;
            this.f42631e = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4 = 0;
            int i5 = 0;
            boolean z4 = false;
            while (i4 < this.f42628b) {
                InformationCommentBean informationCommentBean = new InformationCommentBean(this.f42629c);
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
                n1 p4 = GameDetialModleFourAdapter.this.p(this.f42630d, informationCommentBean, 0, i5 == 0);
                r1 r1Var = (r1) p4.f42456a;
                r1Var.f42523e = i5;
                r1Var.f42524f = z4;
                r1Var.f42522d = i5 == 0;
                GameDetialModleFourAdapter.this.J(p4, !z4);
                GameDetialModleFourAdapter.this.f42202o.add(this.f42631e + i5 + 1, p4);
                i5++;
                i4 = i6;
            }
            GameDetialModleFourAdapter.this.f42202o.remove(this.f42631e);
            GameDetialModleFourAdapter.this.notifyDataSetChanged();
        }
    }

    /* loaded from: classes4.dex */
    class y1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        HListView f42633a;

        public y1(View view) {
            super(view);
            this.f42633a = (HListView) view.findViewById(R.id.favoriteList);
        }
    }

    /* loaded from: classes4.dex */
    class y2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f42635a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42636b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42637c;

        /* renamed from: d  reason: collision with root package name */
        TextView f42638d;

        /* renamed from: e  reason: collision with root package name */
        TextView f42639e;

        /* renamed from: f  reason: collision with root package name */
        TextView f42640f;

        /* renamed from: g  reason: collision with root package name */
        TextView f42641g;

        /* renamed from: h  reason: collision with root package name */
        TextView f42642h;

        /* renamed from: i  reason: collision with root package name */
        TextView f42643i;

        /* renamed from: j  reason: collision with root package name */
        TextView f42644j;

        /* renamed from: k  reason: collision with root package name */
        TextView f42645k;

        public y2(View view) {
            super(view);
            this.f42635a = (TextView) view.findViewById(R.id.tv_title);
            this.f42636b = (TextView) view.findViewById(R.id.tv_label1);
            this.f42637c = (TextView) view.findViewById(R.id.tv_label2);
            this.f42638d = (TextView) view.findViewById(R.id.tv_label3);
            this.f42639e = (TextView) view.findViewById(R.id.tv_label4);
            this.f42640f = (TextView) view.findViewById(R.id.tv_label5);
            this.f42641g = (TextView) view.findViewById(R.id.tv_value1);
            this.f42642h = (TextView) view.findViewById(R.id.tv_value2);
            this.f42643i = (TextView) view.findViewById(R.id.tv_value3);
            this.f42644j = (TextView) view.findViewById(R.id.tv_value4);
            this.f42645k = (TextView) view.findViewById(R.id.tv_value5);
        }

        public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.f42635a.setText(str);
            this.f42636b.setText(str2);
            this.f42637c.setText(str3);
            this.f42638d.setText(str4);
            this.f42639e.setText(str5);
            this.f42641g.setText(str7);
            this.f42642h.setText(str8);
            this.f42643i.setText(str9);
            this.f42644j.setText(str10);
            if (com.join.mgps.Util.g2.i(str11)) {
                this.f42640f.setVisibility(0);
                this.f42645k.setVisibility(0);
                this.f42640f.setText(str6);
                this.f42645k.setText(str11);
                return;
            }
            this.f42640f.setVisibility(8);
            this.f42645k.setVisibility(8);
        }
    }

    /* loaded from: classes4.dex */
    class z implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i2 f42647b;

        z(i2 i2Var) {
            this.f42647b = i2Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (" ".equals(this.f42647b.f42323b.getText().toString())) {
                this.f42647b.f42323b.setText("");
                this.f42647b.f42323b.setBackgroundResource(R.drawable.arena_down_arrow);
                this.f42647b.f42322a.setVisibility(8);
                return;
            }
            this.f42647b.f42323b.setText(" ");
            this.f42647b.f42323b.setBackgroundResource(R.drawable.arena_up_arrow);
            this.f42647b.f42322a.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class z0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean.Sub f42649b;

        z0(InformationCommentBean.Sub sub) {
            this.f42649b = sub;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p1 p1Var = GameDetialModleFourAdapter.this.f42192e;
            if (p1Var != null) {
                p1Var.e(this.f42649b);
            }
        }
    }

    /* loaded from: classes4.dex */
    class z1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f42651a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f42652b;

        /* renamed from: c  reason: collision with root package name */
        SimpleDraweeView f42653c;

        /* renamed from: d  reason: collision with root package name */
        LinearLayout f42654d;

        /* renamed from: e  reason: collision with root package name */
        LinearLayout f42655e;

        /* renamed from: f  reason: collision with root package name */
        LinearLayout f42656f;

        /* renamed from: g  reason: collision with root package name */
        LinearLayout f42657g;

        /* renamed from: h  reason: collision with root package name */
        TextView f42658h;

        /* renamed from: i  reason: collision with root package name */
        TextView f42659i;

        /* renamed from: j  reason: collision with root package name */
        TextView f42660j;

        public z1(View view) {
            super(view);
            this.f42651a = (SimpleDraweeView) view.findViewById(R.id.vpnImage);
            this.f42652b = (SimpleDraweeView) view.findViewById(R.id.googleImage);
            this.f42653c = (SimpleDraweeView) view.findViewById(R.id.rootImage);
            this.f42654d = (LinearLayout) view.findViewById(R.id.look_other);
            this.f42655e = (LinearLayout) view.findViewById(R.id.vpnLayout);
            this.f42656f = (LinearLayout) view.findViewById(R.id.googleLayout);
            this.f42657g = (LinearLayout) view.findViewById(R.id.rootLayout);
            this.f42658h = (TextView) view.findViewById(R.id.vpnText);
            this.f42659i = (TextView) view.findViewById(R.id.googleText);
            this.f42660j = (TextView) view.findViewById(R.id.rootText);
        }
    }

    /* loaded from: classes4.dex */
    private class z2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f42662a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42663b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42664c;

        /* renamed from: d  reason: collision with root package name */
        TextView f42665d;

        /* renamed from: e  reason: collision with root package name */
        TextView[] f42666e;

        public z2(View view) {
            super(view);
            this.f42666e = null;
            this.f42662a = (TextView) view.findViewById(R.id.f15603k1);
            this.f42663b = (TextView) view.findViewById(R.id.f15604k2);
            this.f42664c = (TextView) view.findViewById(R.id.f15605k3);
            TextView textView = (TextView) view.findViewById(R.id.k4);
            this.f42665d = textView;
            this.f42666e = new TextView[]{this.f42662a, this.f42663b, this.f42664c, textView};
        }
    }

    public GameDetialModleFourAdapter(Context context, GamedetialModleFourBean gamedetialModleFourBean, com.join.android.app.component.video.c cVar) {
        this.f42188a = gamedetialModleFourBean;
        this.f42190c = context;
        this.f42194g = w(context);
        this.f42201n = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(BTActivityBean bTActivityBean, View view) {
        IntentUtil.getInstance().goShareWebActivity(this.f42190c, bTActivityBean.getJump_url());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(View view) {
        DetialMoreServiceListActivity_.r0(this.f42190c).a(this.f42188a.getCrc_sign_id()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(View view) {
        Intent intent = new Intent(this.f42190c, NoticeListActivity.class);
        intent.putExtra("gameId", this.f42188a.getCrc_sign_id());
        this.f42190c.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(View view) {
        com.papa.sim.statistic.p.l(view.getContext()).F("jinshouzhi", AccountUtil_.getInstance_(view.getContext()).getUid());
        r(view.getContext(), GameMainActivity4.I2);
    }

    private void F(View view, r1 r1Var, boolean z4, int i4) {
        View view2;
        int i5;
        boolean z5;
        int i6;
        String str = r1Var.f42519a;
        int i7 = r1Var.f42523e;
        boolean z6 = r1Var.f42524f;
        InformationCommentBean informationCommentBean = r1Var.f42520b;
        List<InformationCommentBean.Sub> sub = informationCommentBean.getSub();
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.removeAllViews();
        int size = sub.size();
        int i8 = 0;
        int i9 = 0;
        while (i9 < size + 1) {
            if (i9 <= 3 || !z4) {
                View inflate = LayoutInflater.from(this.f42190c).inflate(R.layout.comment_reply_item, (ViewGroup) null);
                inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                TextView textView = (TextView) inflate.findViewById(R.id.comment_reply_content);
                TextView textView2 = (TextView) inflate.findViewById(R.id.comment_reply_more);
                if ((i9 != size || size <= 3) && !(i7 > 0 && z6 && i9 == size)) {
                    view2 = inflate;
                    i5 = i7;
                    z5 = z6;
                    i6 = i9;
                    if (i6 == 3 && z4 && size > 3) {
                        textView.setVisibility(8);
                        textView2.setVisibility(0);
                        textView2.setText(textView2.getResources().getString(R.string.comment_item_content_more, Integer.valueOf(size - 3)));
                        view2.setOnClickListener(new y0(size, informationCommentBean, str, i4));
                    } else if (i6 < size && (i6 < 3 || !z4)) {
                        textView.setVisibility(0);
                        textView2.setVisibility(8);
                        InformationCommentBean.Sub sub2 = sub.get(i6);
                        String content = sub2.getContent();
                        sub2.getComment_id();
                        try {
                            textView.setText(Html.fromHtml(content));
                            N(view2, sub2);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                } else {
                    textView.setVisibility(8);
                    textView2.setVisibility(i8);
                    textView2.setText("收起");
                    int i10 = i7;
                    view2 = inflate;
                    i5 = i7;
                    i6 = i9;
                    z5 = z6;
                    view2.setOnClickListener(new x0(i10, i4, str, r1Var));
                }
                linearLayout.addView(view2);
            } else {
                i5 = i7;
                z5 = z6;
                i6 = i9;
            }
            i9 = i6 + 1;
            i7 = i5;
            z6 = z5;
            i8 = 0;
        }
    }

    private void N(View view, InformationCommentBean.Sub sub) {
        view.setOnClickListener(new z0(sub));
    }

    private void O(View view, CommentBaseBean commentBaseBean) {
        view.setOnClickListener(new a1(commentBaseBean));
    }

    private void P(ImageView imageView, TextView textView, CommentBaseBean commentBaseBean, int i4) {
        b1 b1Var = new b1(commentBaseBean, i4, imageView, textView);
        imageView.setOnClickListener(b1Var);
        textView.setOnClickListener(b1Var);
    }

    private void Q(View view, InformationCommentBean informationCommentBean) {
        view.setOnClickListener(new w0(informationCommentBean));
    }

    private void R(ImageView imageView, TextView textView, CommentBaseBean commentBaseBean, int i4) {
        d1 d1Var = new d1(commentBaseBean, i4, imageView, textView);
        imageView.setOnClickListener(d1Var);
        textView.setOnClickListener(d1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(View view) {
        Intent intent = new Intent(this.f42190c, CouponListActivity.class);
        intent.putExtra("gameId", this.f42188a.getCrc_sign_id());
        this.f42190c.startActivity(intent);
    }

    private CommentBaseBean u(int i4) {
        return (CommentBaseBean) this.f42202o.get(i4).f42456a;
    }

    public static String z(Context context) {
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        if (installedPackages != null) {
            for (int i4 = 0; i4 < installedPackages.size(); i4++) {
                String str = installedPackages.get(i4).packageName;
                if (str.equalsIgnoreCase("com.tencent.qqlite")) {
                    return "com.tencent.qqlite";
                }
                if (str.equalsIgnoreCase("com.tencent.mobileqq")) {
                    return "com.tencent.mobileqq";
                }
            }
            return null;
        }
        return null;
    }

    public void E(List<GameDetailOneTouchSkill> list) {
        this.f42205r.clear();
        this.f42197j = 0;
        this.f42196i = 0;
        if (list == null) {
            this.f42206s.notifyDataSetChanged();
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            View inflate = LayoutInflater.from(this.f42190c).inflate(R.layout.gamedetail_item_one_touch_skill_item, (ViewGroup) null);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.list);
            GameDetailOneTouchSkill gameDetailOneTouchSkill = list.get(i4);
            ((TextView) inflate.findViewById(R.id.name)).setText(gameDetailOneTouchSkill.getName());
            if (gameDetailOneTouchSkill.getSkill() != null) {
                for (int i5 = 0; i5 < gameDetailOneTouchSkill.getSkill().size() && i5 != 5; i5++) {
                    View inflate2 = LayoutInflater.from(this.f42190c).inflate(R.layout.gamedetail_item_one_touch_skill_list_item, (ViewGroup) linearLayout, false);
                    linearLayout.addView(inflate2);
                    ((TextView) inflate2.findViewById(R.id.name)).setText(gameDetailOneTouchSkill.getSkill().get(i5));
                }
            }
            this.f42205r.add(inflate);
        }
        this.f42206s.notifyDataSetChanged();
    }

    public void G(int i4, int i5) {
        CommentBaseBean u4 = u(i4);
        long longValue = Long.valueOf(u4.getDespise_count()).longValue();
        if (u4.getIs_despise() == 1) {
            u4.setIs_despise(0);
            long j4 = longValue - 1;
            if (j4 < 0) {
                u4.setDespise_count("0");
            } else {
                u4.setDespise_count(j4 + "");
            }
        } else if (i5 != 1) {
            u4.setIs_despise(1);
            u4.setDespise_count((longValue + 1) + "");
        }
        notifyDataSetChanged();
    }

    public void H(int i4, int i5) {
        CommentBaseBean u4 = u(i4);
        long praise_count = u4.getPraise_count();
        if (u4.getIs_praise() == 1) {
            u4.setIs_praise(0);
            long j4 = praise_count - 1;
            if (j4 < 0) {
                u4.setPraise_count(0L);
            } else {
                u4.setPraise_count(j4);
            }
        } else if (i5 != 1) {
            u4.setIs_praise(1);
            u4.setPraise_count(praise_count + 1);
        }
        notifyDataSetChanged();
    }

    public void I(BaseGameDetailFragment baseGameDetailFragment) {
        this.f42189b = baseGameDetailFragment;
    }

    void J(n1 n1Var, boolean z4) {
        if (n1Var == null) {
            return;
        }
        try {
            ((r1) n1Var.f42456a).f42525g = z4;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void K(GamedetialModleFourBean gamedetialModleFourBean) {
        this.f42188a = gamedetialModleFourBean;
    }

    public void L(w1.i iVar) {
        this.f42200m = iVar;
    }

    public void M(p1 p1Var) {
        this.f42192e = p1Var;
    }

    public void S(List<View> list) {
        this.f42205r = list;
    }

    public void T(int i4) {
        this.f42199l = i4;
    }

    void U() {
        ShareBean shareBean = new ShareBean();
        String share_url = this.f42188a.getShare_url();
        shareBean.setqZoneShareUrl(share_url);
        shareBean.setQqUrl(share_url);
        shareBean.setWechatFriendUrl(share_url);
        shareBean.setWechatShareUrl(share_url);
        shareBean.setWeiboShareUrl(share_url);
        shareBean.setTitle(this.f42188a.getGame_name());
        shareBean.setText(this.f42188a.getInfo());
        shareBean.setImageUrl(this.f42188a.getIco_remote());
        shareBean.setFrom(2);
        shareBean.setGameId(this.f42188a.getGame_id());
        if (this.f42188a.getShare_config() != null && this.f42188a.getShare_config().getShare_switch() == 1) {
            shareBean.setIntentData(this.f42188a.getShare_config().getJump_info());
        }
        com.join.mgps.Util.s.r(this.f42190c, shareBean);
    }

    void V(Context context, String str) {
        try {
            Toast makeText = Toast.makeText(context, "", 0);
            makeText.setText(str);
            makeText.setDuration(0);
            makeText.show();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void W(int i4) {
        CommentBaseBean u4 = u(i4);
        long longValue = Long.valueOf(u4.getDespise_count()).longValue();
        u4.setIs_despise(0);
        long j4 = longValue - 1;
        if (j4 < 0) {
            u4.setDespise_count("0");
        } else {
            u4.setDespise_count(j4 + "");
        }
        notifyDataSetChanged();
    }

    public void X(int i4) {
        CommentBaseBean u4 = u(i4);
        long praise_count = u4.getPraise_count();
        u4.setIs_praise(0);
        long j4 = praise_count - 1;
        if (j4 < 0) {
            u4.setPraise_count(0L);
        } else {
            u4.setPraise_count(j4);
        }
        notifyDataSetChanged();
    }

    void Y(j3 j3Var, Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool.booleanValue()) {
            j3Var.f42366k.setVisibility(8);
            j3Var.f42360e.setVisibility(8);
            j3Var.f42359d.setVisibility(8);
            j3Var.f42362g.setVisibility(0);
            j3Var.f42370o.setVisibility(bool3.booleanValue() ? 0 : 8);
            j3Var.f42373r.setVisibility(bool3.booleanValue() ? 8 : 0);
            return;
        }
        j3Var.f42370o.setVisibility(8);
        j3Var.f42373r.setVisibility(8);
        j3Var.f42366k.setVisibility(0);
        if (bool2.booleanValue()) {
            j3Var.f42360e.setVisibility(8);
            j3Var.f42359d.setVisibility(0);
        } else {
            j3Var.f42359d.setVisibility(8);
            j3Var.f42360e.setVisibility(0);
        }
        j3Var.f42362g.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f42202o.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i4) {
        return this.f42202o.get(i4).f42457b;
    }

    public void n(int i4) {
        CommentBaseBean u4 = u(i4);
        long longValue = Long.valueOf(u4.getDespise_count()).longValue();
        u4.setIs_despise(1);
        u4.setDespise_count((longValue + 1) + "");
        notifyDataSetChanged();
    }

    public void o(int i4) {
        CommentBaseBean u4 = u(i4);
        long praise_count = u4.getPraise_count();
        u4.setIs_praise(1);
        u4.setPraise_count(praise_count + 1);
        notifyDataSetChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:262:0x0e29 A[Catch: Exception -> 0x0ef4, TryCatch #9 {Exception -> 0x0ef4, blocks: (B:217:0x0c05, B:219:0x0c29, B:220:0x0c3d, B:222:0x0c43, B:223:0x0c57, B:225:0x0c82, B:227:0x0c91, B:229:0x0ca5, B:231:0x0cac, B:233:0x0cb2, B:236:0x0cea, B:238:0x0cf0, B:240:0x0d0d, B:242:0x0d1f, B:244:0x0d25, B:247:0x0d30, B:249:0x0d4b, B:251:0x0dc4, B:253:0x0dd5, B:255:0x0ddd, B:258:0x0dea, B:260:0x0e1c, B:262:0x0e29, B:264:0x0e3e, B:266:0x0e4d, B:268:0x0e57, B:270:0x0e66, B:272:0x0e78, B:274:0x0e8d, B:276:0x0e94, B:278:0x0ea9, B:277:0x0e9f, B:273:0x0e83, B:269:0x0e5f, B:265:0x0e46, B:259:0x0e15, B:248:0x0d43, B:239:0x0d02, B:234:0x0cdb, B:235:0x0ce3, B:226:0x0c8a), top: B:643:0x0c05 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0e57 A[Catch: Exception -> 0x0ef4, TryCatch #9 {Exception -> 0x0ef4, blocks: (B:217:0x0c05, B:219:0x0c29, B:220:0x0c3d, B:222:0x0c43, B:223:0x0c57, B:225:0x0c82, B:227:0x0c91, B:229:0x0ca5, B:231:0x0cac, B:233:0x0cb2, B:236:0x0cea, B:238:0x0cf0, B:240:0x0d0d, B:242:0x0d1f, B:244:0x0d25, B:247:0x0d30, B:249:0x0d4b, B:251:0x0dc4, B:253:0x0dd5, B:255:0x0ddd, B:258:0x0dea, B:260:0x0e1c, B:262:0x0e29, B:264:0x0e3e, B:266:0x0e4d, B:268:0x0e57, B:270:0x0e66, B:272:0x0e78, B:274:0x0e8d, B:276:0x0e94, B:278:0x0ea9, B:277:0x0e9f, B:273:0x0e83, B:269:0x0e5f, B:265:0x0e46, B:259:0x0e15, B:248:0x0d43, B:239:0x0d02, B:234:0x0cdb, B:235:0x0ce3, B:226:0x0c8a), top: B:643:0x0c05 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0e5f A[Catch: Exception -> 0x0ef4, TryCatch #9 {Exception -> 0x0ef4, blocks: (B:217:0x0c05, B:219:0x0c29, B:220:0x0c3d, B:222:0x0c43, B:223:0x0c57, B:225:0x0c82, B:227:0x0c91, B:229:0x0ca5, B:231:0x0cac, B:233:0x0cb2, B:236:0x0cea, B:238:0x0cf0, B:240:0x0d0d, B:242:0x0d1f, B:244:0x0d25, B:247:0x0d30, B:249:0x0d4b, B:251:0x0dc4, B:253:0x0dd5, B:255:0x0ddd, B:258:0x0dea, B:260:0x0e1c, B:262:0x0e29, B:264:0x0e3e, B:266:0x0e4d, B:268:0x0e57, B:270:0x0e66, B:272:0x0e78, B:274:0x0e8d, B:276:0x0e94, B:278:0x0ea9, B:277:0x0e9f, B:273:0x0e83, B:269:0x0e5f, B:265:0x0e46, B:259:0x0e15, B:248:0x0d43, B:239:0x0d02, B:234:0x0cdb, B:235:0x0ce3, B:226:0x0c8a), top: B:643:0x0c05 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0e78 A[Catch: Exception -> 0x0ef4, TryCatch #9 {Exception -> 0x0ef4, blocks: (B:217:0x0c05, B:219:0x0c29, B:220:0x0c3d, B:222:0x0c43, B:223:0x0c57, B:225:0x0c82, B:227:0x0c91, B:229:0x0ca5, B:231:0x0cac, B:233:0x0cb2, B:236:0x0cea, B:238:0x0cf0, B:240:0x0d0d, B:242:0x0d1f, B:244:0x0d25, B:247:0x0d30, B:249:0x0d4b, B:251:0x0dc4, B:253:0x0dd5, B:255:0x0ddd, B:258:0x0dea, B:260:0x0e1c, B:262:0x0e29, B:264:0x0e3e, B:266:0x0e4d, B:268:0x0e57, B:270:0x0e66, B:272:0x0e78, B:274:0x0e8d, B:276:0x0e94, B:278:0x0ea9, B:277:0x0e9f, B:273:0x0e83, B:269:0x0e5f, B:265:0x0e46, B:259:0x0e15, B:248:0x0d43, B:239:0x0d02, B:234:0x0cdb, B:235:0x0ce3, B:226:0x0c8a), top: B:643:0x0c05 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0e83 A[Catch: Exception -> 0x0ef4, TryCatch #9 {Exception -> 0x0ef4, blocks: (B:217:0x0c05, B:219:0x0c29, B:220:0x0c3d, B:222:0x0c43, B:223:0x0c57, B:225:0x0c82, B:227:0x0c91, B:229:0x0ca5, B:231:0x0cac, B:233:0x0cb2, B:236:0x0cea, B:238:0x0cf0, B:240:0x0d0d, B:242:0x0d1f, B:244:0x0d25, B:247:0x0d30, B:249:0x0d4b, B:251:0x0dc4, B:253:0x0dd5, B:255:0x0ddd, B:258:0x0dea, B:260:0x0e1c, B:262:0x0e29, B:264:0x0e3e, B:266:0x0e4d, B:268:0x0e57, B:270:0x0e66, B:272:0x0e78, B:274:0x0e8d, B:276:0x0e94, B:278:0x0ea9, B:277:0x0e9f, B:273:0x0e83, B:269:0x0e5f, B:265:0x0e46, B:259:0x0e15, B:248:0x0d43, B:239:0x0d02, B:234:0x0cdb, B:235:0x0ce3, B:226:0x0c8a), top: B:643:0x0c05 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0e94 A[Catch: Exception -> 0x0ef4, TryCatch #9 {Exception -> 0x0ef4, blocks: (B:217:0x0c05, B:219:0x0c29, B:220:0x0c3d, B:222:0x0c43, B:223:0x0c57, B:225:0x0c82, B:227:0x0c91, B:229:0x0ca5, B:231:0x0cac, B:233:0x0cb2, B:236:0x0cea, B:238:0x0cf0, B:240:0x0d0d, B:242:0x0d1f, B:244:0x0d25, B:247:0x0d30, B:249:0x0d4b, B:251:0x0dc4, B:253:0x0dd5, B:255:0x0ddd, B:258:0x0dea, B:260:0x0e1c, B:262:0x0e29, B:264:0x0e3e, B:266:0x0e4d, B:268:0x0e57, B:270:0x0e66, B:272:0x0e78, B:274:0x0e8d, B:276:0x0e94, B:278:0x0ea9, B:277:0x0e9f, B:273:0x0e83, B:269:0x0e5f, B:265:0x0e46, B:259:0x0e15, B:248:0x0d43, B:239:0x0d02, B:234:0x0cdb, B:235:0x0ce3, B:226:0x0c8a), top: B:643:0x0c05 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0e9f A[Catch: Exception -> 0x0ef4, TryCatch #9 {Exception -> 0x0ef4, blocks: (B:217:0x0c05, B:219:0x0c29, B:220:0x0c3d, B:222:0x0c43, B:223:0x0c57, B:225:0x0c82, B:227:0x0c91, B:229:0x0ca5, B:231:0x0cac, B:233:0x0cb2, B:236:0x0cea, B:238:0x0cf0, B:240:0x0d0d, B:242:0x0d1f, B:244:0x0d25, B:247:0x0d30, B:249:0x0d4b, B:251:0x0dc4, B:253:0x0dd5, B:255:0x0ddd, B:258:0x0dea, B:260:0x0e1c, B:262:0x0e29, B:264:0x0e3e, B:266:0x0e4d, B:268:0x0e57, B:270:0x0e66, B:272:0x0e78, B:274:0x0e8d, B:276:0x0e94, B:278:0x0ea9, B:277:0x0e9f, B:273:0x0e83, B:269:0x0e5f, B:265:0x0e46, B:259:0x0e15, B:248:0x0d43, B:239:0x0d02, B:234:0x0cdb, B:235:0x0ce3, B:226:0x0c8a), top: B:643:0x0c05 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r30, int r31) {
        /*
            Method dump skipped, instructions count: 7730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.adapter.GameDetialModleFourAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
        switch (i4) {
            case 1:
                return new u2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_title_v1, viewGroup, false));
            case 2:
                return new k2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_iconlayout, viewGroup, false));
            case 3:
                return new r2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_subscribe, viewGroup, false));
            case 4:
                return new t2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_tipslayout_v1, viewGroup, false));
            case 5:
                return new w2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_viewpage_v1, viewGroup, false));
            case 6:
                return new l2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_gamenotice, viewGroup, false));
            case 7:
                return new m2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_recommend, viewGroup, false));
            case 8:
                return new h2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_describ_v1, viewGroup, false));
            case 9:
                return new j2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_gifts, viewGroup, false));
            case 10:
                return new z1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_auxiliarytool, viewGroup, false));
            case 11:
                return new o2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_updateinfo, viewGroup, false));
            case 12:
                return new i2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_gamedetialsimple, viewGroup, false));
            case 13:
                return new d2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_record_header, viewGroup, false));
            case 14:
                return new b2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_comment_item_layout, viewGroup, false));
            case 15:
                return new e2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_comment_message_reply, viewGroup, false));
            case 16:
                return new c2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_commit_footer, viewGroup, false));
            case 17:
                return new q2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_gamerecommendlist, viewGroup, false));
            case 18:
                return new a2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_bottom_empty, viewGroup, false));
            case 19:
                return new v2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_video, viewGroup, false));
            case 20:
                return new f2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_down_and_down, viewGroup, false));
            case 21:
                return new g2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_factory_recommend, viewGroup, false));
            case 22:
                return new s2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_supply_a_gap, viewGroup, false));
            case 23:
                return new p2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detial_hand_shark_item, viewGroup, false));
            case 24:
                return new h3(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetial_qq_item, viewGroup, false));
            case 25:
                return new m1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.comment_list_item_view, viewGroup, false));
            case 26:
                return new d3(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetial_none_comment_layout, viewGroup, false));
            case 27:
                return new v1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetial_comment_game_layout, viewGroup, false));
            case 28:
                return new w2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_viewpagenew_v1, viewGroup, false));
            case 29:
                return new y1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detial_favortis_layout, viewGroup, false));
            case 30:
                return new a3(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detial_golden_finger_layout, viewGroup, false));
            case 31:
                return new u1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detial_cloud_archive_layout, viewGroup, false));
            case 32:
                return new f3(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detial_one_touch_skill_layout, viewGroup, false));
            case 33:
                return new t1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detial_check_point_layout, viewGroup, false));
            case 34:
                return new n2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_updateinfo1, viewGroup, false));
            case 35:
                return new z2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detial_golden_finger1_layout, viewGroup, false));
            case 36:
                return new w1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetial_bt_coupon_item, viewGroup, false));
            case 37:
                return new i3(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetial_bt_serviceinfo_item, viewGroup, false));
            case 38:
                return new e3(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetial_bt_notice_item, viewGroup, false));
            case 39:
                return new x1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_edit_recommend, viewGroup, false));
            case 40:
                return new o1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_hot_comment_list, viewGroup, false));
            case 41:
                return new j3(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_game_detail_similar_view, viewGroup, false));
            case 42:
                return new i1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_game_detial_activities, viewGroup, false));
            case 43:
                return new j1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_game_detail_bt_tag, viewGroup, false));
            case 44:
                return new s1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_game_detail_bt_welfare, viewGroup, false));
            case 45:
                return new b3(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_game_detail_mini_program, viewGroup, false));
            case 46:
                return new c3(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_game_detail_mini_program_type1, viewGroup, false));
            case 47:
                return new x2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_game_detail_describe, viewGroup, false));
            case 48:
            case 49:
                return new y2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_detail_game_info, viewGroup, false));
            case 50:
                return new g3(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_detail_pc_recommend_game, viewGroup, false));
            default:
                return null;
        }
    }

    n1 p(String str, InformationCommentBean informationCommentBean, int i4, boolean z4) {
        return new n1(this, new r1(str, informationCommentBean, i4, z4), 15);
    }

    void q() {
        DownloadTask downloadtaskDown = this.f42188a.getDownloadtaskDown();
        UtilsMy.C1(downloadtaskDown, this.f42188a);
        if (UtilsMy.o1(this.f42190c, downloadtaskDown)) {
            return;
        }
        if (this.f42188a.getDown_status() == 5) {
            UtilsMy.l1(this.f42190c, downloadtaskDown);
        } else {
            UtilsMy.R0(this.f42190c, downloadtaskDown, this.f42188a.getTp_down_url(), this.f42188a.getOther_down_switch(), this.f42188a.getCdn_down_switch());
        }
    }

    void r(Context context, String str) {
        DownloadTask F = p1.f.K().F(this.f42188a.getGame_id());
        if (F != null && !TextUtils.isEmpty(str)) {
            if (F.getStatus() == 5) {
                V(context, context.getResources().getString(R.string.game_detail_down_status, str));
                return;
            } else if (F.getStatus() == 43 || F.getStatus() == 9 || F.getStatus() == 0) {
                q();
                return;
            } else {
                V(context, context.getResources().getString(R.string.game_detail_downing_status, str));
                return;
            }
        }
        q();
    }

    public View s() {
        return this.f42204q;
    }

    public w1.i t() {
        return this.f42200m;
    }

    public List<View> v() {
        return this.f42205r;
    }

    public com.danikula.videocache.i w(Context context) {
        return MApplication.m(context);
    }

    public int x() {
        return this.f42199l;
    }

    public List<n1> y() {
        return this.f42202o;
    }
}
