package com.join.mgps.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.MApplication;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.coupon.CouponListActivity;
import com.join.kotlin.ui.notice.NoticeListActivity;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.CommentAllListActivity_;
import com.join.mgps.activity.CommentCreatActivity_;
import com.join.mgps.activity.CommentSelfListActivity_;
import com.join.mgps.activity.DetialMoreServiceListActivity_;
import com.join.mgps.activity.GameMainActivity4;
import com.join.mgps.activity.ImagePagerActivity;
import com.join.mgps.activity.PaPaBannerListActivity_;
import com.join.mgps.activity.TagGameListActivity_;
import com.join.mgps.activity.UploadActivity_;
import com.join.mgps.activity.gamedetail.BaseGameDetailFragment;
import com.join.mgps.activity.screenshot.ScreenshotGamedetialBean;
import com.join.mgps.activity.screenshot.ScreenshotTrueListAcvity_;
import com.join.mgps.adapter.FullScreenActivity;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.customview.MyGridView;
import com.join.mgps.customview.SlidingTabLayoutGameDetail;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.AppBeanMain;
import com.join.mgps.dto.BTActivityBean;
import com.join.mgps.dto.CommentAllListBean;
import com.join.mgps.dto.CommentBaseBean;
import com.join.mgps.dto.GameDetailOneTouchSkill;
import com.join.mgps.dto.GameDetialAuxiliaryBean;
import com.join.mgps.dto.GamedetialAuxiliaryToolBean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import com.join.mgps.dto.InformationCommentBean;
import com.join.mgps.dto.RecommendGameBean;
import com.join.mgps.dto.ShareBean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.viewholder.ViewHolderGameDetialMain;
import it.sephiroth.android.library.widget.AdapterView;
import it.sephiroth.android.library.widget.HListView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public class GameDetialModleThreeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: s  reason: collision with root package name */
    private static final String f42668s = "GameDetialModleThreeAda";

    /* renamed from: a  reason: collision with root package name */
    private GamedetialModleFourBean f42669a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f42670b;

    /* renamed from: c  reason: collision with root package name */
    private BaseGameDetailFragment f42671c;

    /* renamed from: d  reason: collision with root package name */
    private Context f42672d;

    /* renamed from: h  reason: collision with root package name */
    com.danikula.videocache.i f42676h;

    /* renamed from: j  reason: collision with root package name */
    private int f42678j;

    /* renamed from: k  reason: collision with root package name */
    private int f42679k;

    /* renamed from: m  reason: collision with root package name */
    private int f42681m;

    /* renamed from: p  reason: collision with root package name */
    private View f42684p;

    /* renamed from: e  reason: collision with root package name */
    boolean f42673e = false;

    /* renamed from: f  reason: collision with root package name */
    c1 f42674f = null;

    /* renamed from: l  reason: collision with root package name */
    private boolean f42680l = false;

    /* renamed from: o  reason: collision with root package name */
    long f42683o = System.currentTimeMillis();

    /* renamed from: q  reason: collision with root package name */
    private List<View> f42685q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    z0 f42686r = new z0();

    /* renamed from: n  reason: collision with root package name */
    private List<b1> f42682n = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private List<RecommendGameBean> f42675g = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private Map<Integer, Boolean> f42677i = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeAdapter.this.R();
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements View.OnClickListener {
        a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goForumFid(GameDetialModleThreeAdapter.this.f42672d, (int) GameDetialModleThreeAdapter.this.f42669a.getForum_id());
        }
    }

    /* loaded from: classes4.dex */
    class a1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayout f42689a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f42690b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f42691c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f42692d;

        /* renamed from: e  reason: collision with root package name */
        private ImageView f42693e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f42694f;

        /* renamed from: g  reason: collision with root package name */
        private MStarBar f42695g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f42696h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f42697i;

        /* renamed from: j  reason: collision with root package name */
        private ImageView f42698j;

        /* renamed from: k  reason: collision with root package name */
        private TextView f42699k;

        /* renamed from: l  reason: collision with root package name */
        private TextView f42700l;

        /* renamed from: m  reason: collision with root package name */
        public View f42701m;

        /* renamed from: n  reason: collision with root package name */
        private TextView f42702n;

        /* renamed from: o  reason: collision with root package name */
        private ImageView f42703o;

        /* renamed from: p  reason: collision with root package name */
        private TextView f42704p;

        /* renamed from: q  reason: collision with root package name */
        private ImageView f42705q;

        /* renamed from: r  reason: collision with root package name */
        private TextView f42706r;

        /* renamed from: s  reason: collision with root package name */
        private ImageView f42707s;

        /* renamed from: t  reason: collision with root package name */
        private TextView f42708t;

        /* renamed from: u  reason: collision with root package name */
        private VipView f42709u;

        /* renamed from: v  reason: collision with root package name */
        private View f42710v;

        public a1(View view) {
            super(view);
            this.f42689a = (LinearLayout) view.findViewById(R.id.commentAllRootLl);
            this.f42690b = (SimpleDraweeView) view.findViewById(R.id.usericon);
            this.f42691c = (TextView) view.findViewById(R.id.userName);
            this.f42692d = (TextView) view.findViewById(R.id.isMe);
            this.f42693e = (ImageView) view.findViewById(R.id.isAuth);
            this.f42698j = (ImageView) view.findViewById(R.id.isGood);
            this.f42694f = (TextView) view.findViewById(R.id.isConnoisseurs);
            this.f42695g = (MStarBar) view.findViewById(R.id.comment_head_mstarBar);
            this.f42696h = (TextView) view.findViewById(R.id.comment_head_num_tx);
            this.f42697i = (TextView) view.findViewById(R.id.time);
            this.f42699k = (TextView) view.findViewById(R.id.content);
            this.f42700l = (TextView) view.findViewById(R.id.more);
            this.f42701m = view.findViewById(R.id.line);
            this.f42702n = (TextView) view.findViewById(R.id.phoneModle);
            this.f42703o = (ImageView) view.findViewById(R.id.parise);
            this.f42704p = (TextView) view.findViewById(R.id.pariseNumber);
            this.f42705q = (ImageView) view.findViewById(R.id.down);
            this.f42706r = (TextView) view.findViewById(R.id.downNumber);
            this.f42707s = (ImageView) view.findViewById(R.id.message);
            this.f42708t = (TextView) view.findViewById(R.id.messageNumber);
            this.f42709u = (VipView) view.findViewById(R.id.levelTv);
            this.f42710v = view.findViewById(R.id.layoutTop);
        }
    }

    /* loaded from: classes4.dex */
    class a2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f42712a;

        /* renamed from: b  reason: collision with root package name */
        MyGridView f42713b;

        /* renamed from: c  reason: collision with root package name */
        View f42714c;

        public a2(View view) {
            super(view);
            this.f42713b = (MyGridView) view.findViewById(R.id.recomListView);
            this.f42712a = (LinearLayout) view.findViewById(R.id.layoutContent);
            this.f42714c = view.findViewById(R.id.line_h);
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.join.mgps.Util.g2.h(GameDetialModleThreeAdapter.this.f42669a.getGame_company_id()) || "0".equals(GameDetialModleThreeAdapter.this.f42669a.getGame_company_id())) {
                return;
            }
            PaPaBannerListActivity_.k0(GameDetialModleThreeAdapter.this.f42672d).e(1).a(true).c(GameDetialModleThreeAdapter.this.f42669a.getGame_company_id()).d(GameDetialModleThreeAdapter.this.f42669a.getCompany_name()).start();
        }
    }

    /* loaded from: classes4.dex */
    class b0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppBeanMain f42717b;

        b0(AppBeanMain appBeanMain) {
            this.f42717b = appBeanMain;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(GameDetialModleThreeAdapter.this.f42672d, this.f42717b.getIntentDataBean());
        }
    }

    /* loaded from: classes4.dex */
    public class b1 {

        /* renamed from: a  reason: collision with root package name */
        public Object f42719a;

        /* renamed from: b  reason: collision with root package name */
        public int f42720b;

        /* renamed from: c  reason: collision with root package name */
        public int f42721c;

        public b1(Object obj, int i4) {
            this.f42719a = obj;
            this.f42720b = i4;
        }
    }

    /* loaded from: classes4.dex */
    class b2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        public LinearLayout f42723a;

        /* renamed from: b  reason: collision with root package name */
        public Button f42724b;

        /* renamed from: c  reason: collision with root package name */
        public HorizontalScrollView f42725c;

        public b2(View view) {
            super(view);
            this.f42723a = (LinearLayout) view.findViewById(R.id.titleMoreTip);
            this.f42724b = (Button) view.findViewById(R.id.titleMoreBookButn);
            this.f42725c = (HorizontalScrollView) view.findViewById(R.id.scrollView);
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeAdapter.this.f42674f.k();
        }
    }

    /* loaded from: classes4.dex */
    class c0 implements View.OnClickListener {
        c0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.join.mgps.Util.g2.i(GameDetialModleThreeAdapter.y(GameDetialModleThreeAdapter.this.f42672d))) {
                IntentUtil.getInstance().goQQGroup(GameDetialModleThreeAdapter.this.f42672d, GameDetialModleThreeAdapter.this.f42669a.getGame_detailed().getTpl_two_qq_key());
                return;
            }
            com.join.mgps.Util.l2.a(GameDetialModleThreeAdapter.this.f42672d).b("已复制QQ号，请安装QQ后粘贴搜索");
            com.join.mgps.Util.j0.M(GameDetialModleThreeAdapter.this.f42672d, GameDetialModleThreeAdapter.this.f42669a.getGame_detailed().getTpl_two_qq());
        }
    }

    /* loaded from: classes4.dex */
    public interface c1 {
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
    class c2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f42729a;

        /* renamed from: b  reason: collision with root package name */
        LinearLayout f42730b;

        /* renamed from: c  reason: collision with root package name */
        LinearLayout f42731c;

        public c2(View view) {
            super(view);
            this.f42729a = (LinearLayout) view.findViewById(R.id.linearLayout);
            this.f42730b = (LinearLayout) view.findViewById(R.id.linearLayout_top);
            this.f42731c = (LinearLayout) view.findViewById(R.id.linearLayout_bottom);
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TipBean f42733b;

        d(TipBean tipBean) {
            this.f42733b = tipBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagGameListActivity_.F0(GameDetialModleThreeAdapter.this.f42672d).b(0).d(this.f42733b.getName()).e(Integer.parseInt(this.f42733b.getId())).start();
        }
    }

    /* loaded from: classes4.dex */
    class d0 implements View.OnScrollChangeListener {
        d0() {
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i4, int i5, int i6, int i7) {
            GameDetialModleThreeAdapter.this.f42678j = i4;
        }
    }

    /* loaded from: classes4.dex */
    public static class d1 {

        /* renamed from: a  reason: collision with root package name */
        public String f42736a;

        /* renamed from: b  reason: collision with root package name */
        public InformationCommentBean f42737b;

        /* renamed from: c  reason: collision with root package name */
        public int f42738c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f42739d;

        /* renamed from: e  reason: collision with root package name */
        public int f42740e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f42741f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f42742g;

        public d1(String str, InformationCommentBean informationCommentBean, int i4, boolean z4) {
            this.f42736a = str;
            this.f42737b = informationCommentBean;
            this.f42738c = i4;
            this.f42739d = z4;
        }
    }

    /* loaded from: classes4.dex */
    class d2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        public LinearLayout f42743a;

        public d2(View view) {
            super(view);
            this.f42743a = (LinearLayout) view.findViewById(R.id.tipslayout);
        }
    }

    /* loaded from: classes4.dex */
    class e implements AdapterView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f42745a;

        e(List list) {
            this.f42745a = list;
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.d
        public void a(AdapterView<?> adapterView, View view, int i4, long j4) {
            try {
                Intent intent = new Intent(GameDetialModleThreeAdapter.this.f42672d, ImagePagerActivity.class);
                String[] strArr = new String[this.f42745a.size()];
                for (int i5 = 0; i5 < this.f42745a.size(); i5++) {
                    strArr[i5] = (String) this.f42745a.get(i5);
                }
                if (com.join.mgps.Util.g2.i(GameDetialModleThreeAdapter.this.f42669a.getVedio_url()) && i4 == 0) {
                    FullScreenActivity.VideoInfo videoInfo = new FullScreenActivity.VideoInfo();
                    videoInfo.m(GameDetialModleThreeAdapter.this.f42669a.getVedio_url());
                    videoInfo.h(strArr[0]);
                    FullScreenActivity_.i0(GameDetialModleThreeAdapter.this.f42672d).a(videoInfo).start();
                    return;
                }
                intent.putExtra("image_urls", strArr);
                intent.putExtra("image_index", i4);
                GameDetialModleThreeAdapter.this.f42672d.startActivity(intent);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes4.dex */
    class e0 implements ViewPager.OnPageChangeListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l2 f42747b;

        e0(l2 l2Var) {
            this.f42747b = l2Var;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            GameDetialModleThreeAdapter.this.f42679k = this.f42747b.f42851b.getCurrentItem();
        }
    }

    /* loaded from: classes4.dex */
    class e1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        HListView f42749a;

        public e1(View view) {
            super(view);
            this.f42749a = (HListView) view.findViewById(R.id.favoriteList);
        }
    }

    /* loaded from: classes4.dex */
    class e2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        public TextView f42751a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f42752b;

        /* renamed from: c  reason: collision with root package name */
        public LinearLayout f42753c;

        /* renamed from: d  reason: collision with root package name */
        public View f42754d;

        /* renamed from: e  reason: collision with root package name */
        public View f42755e;

        /* renamed from: f  reason: collision with root package name */
        public ImageView f42756f;

        /* renamed from: g  reason: collision with root package name */
        public ImageView f42757g;

        public e2(View view) {
            super(view);
            this.f42751a = (TextView) view.findViewById(R.id.titleText);
            this.f42752b = (TextView) view.findViewById(R.id.moreText);
            this.f42755e = view.findViewById(R.id.line_h);
            this.f42753c = (LinearLayout) view.findViewById(R.id.look_other);
            this.f42754d = view.findViewById(R.id.layoutTop);
            this.f42756f = (ImageView) view.findViewById(R.id.imageView5);
            this.f42757g = (ImageView) view.findViewById(R.id.icon);
        }
    }

    /* loaded from: classes4.dex */
    class f implements AdapterView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f42759a;

        f(List list) {
            this.f42759a = list;
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.d
        public void a(AdapterView<?> adapterView, View view, int i4, long j4) {
            ScreenshotTrueListAcvity_.intent(GameDetialModleThreeAdapter.this.f42672d).fromData((ScreenshotGamedetialBean) this.f42759a.get(i4)).gameId(GameDetialModleThreeAdapter.this.f42669a.getGame_id()).start();
        }
    }

    /* loaded from: classes4.dex */
    class f0 implements AdapterView.d {
        f0() {
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.d
        public void a(AdapterView<?> adapterView, View view, int i4, long j4) {
            com.papa.sim.statistic.p.l(view.getContext()).F("xuanguan", AccountUtil_.getInstance_(view.getContext()).getUid());
            GameDetialModleThreeAdapter.this.r(view.getContext(), "选关");
        }
    }

    /* loaded from: classes4.dex */
    private class f1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        View f42762a;

        /* renamed from: b  reason: collision with root package name */
        View f42763b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42764c;

        /* renamed from: d  reason: collision with root package name */
        TextView f42765d;

        /* renamed from: e  reason: collision with root package name */
        TextView f42766e;

        /* renamed from: f  reason: collision with root package name */
        SimpleDraweeView f42767f;

        public f1(View view) {
            super(view);
            this.f42762a = view.findViewById(R.id.line_h);
            this.f42764c = (TextView) view.findViewById(R.id.count);
            this.f42765d = (TextView) view.findViewById(R.id.auth);
            this.f42766e = (TextView) view.findViewById(R.id.title);
            this.f42767f = (SimpleDraweeView) view.findViewById(R.id.icon);
            this.f42763b = view.findViewById(R.id.top);
        }
    }

    /* loaded from: classes4.dex */
    class f2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f42769a;

        /* renamed from: b  reason: collision with root package name */
        StandardVideoView f42770b;

        /* renamed from: c  reason: collision with root package name */
        LinearLayout f42771c;

        public f2(View view) {
            super(view);
            this.f42769a = (SimpleDraweeView) view.findViewById(R.id.iv_book_bg);
            this.f42770b = (StandardVideoView) view.findViewById(R.id.videoPlayer);
            this.f42771c = (LinearLayout) view.findViewById(R.id.rl_top);
        }
    }

    /* loaded from: classes4.dex */
    class g implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b  reason: collision with root package name */
        boolean f42773b = true;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r1 f42774c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r1 f42775d;

        g(r1 r1Var, r1 r1Var2) {
            this.f42774c = r1Var;
            this.f42775d = r1Var2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f42773b) {
                Layout layout = this.f42774c.f42937a.getLayout();
                if (layout != null) {
                    int lineCount = layout.getLineCount();
                    if (lineCount > 4) {
                        this.f42775d.f42938b.setVisibility(0);
                    } else if (lineCount > 0) {
                        if (layout.getEllipsisCount(lineCount - 1) > 0) {
                            this.f42775d.f42938b.setVisibility(0);
                        } else {
                            this.f42775d.f42938b.setVisibility(8);
                        }
                    }
                    this.f42773b = false;
                    return;
                }
                this.f42775d.f42938b.setVisibility(8);
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
                str = URLEncoder.encode(GameDetialModleThreeAdapter.this.f42669a.getGame_name(), "utf8");
            } catch (UnsupportedEncodingException e5) {
                e5.printStackTrace();
                str = "";
            }
            IntentUtil intentUtil = IntentUtil.getInstance();
            Context context = GameDetialModleThreeAdapter.this.f42672d;
            intentUtil.goShareWebActivity(context, com.join.mgps.rpc.h.f54056j + "/static/vip2020/v2/index.html#/gameGift?game_id=" + GameDetialModleThreeAdapter.this.f42669a.getCrc_sign_id() + "&name=" + str);
        }
    }

    /* loaded from: classes4.dex */
    class g1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f42778a;

        /* renamed from: b  reason: collision with root package name */
        LinearLayout f42779b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42780c;

        /* renamed from: d  reason: collision with root package name */
        View f42781d;

        /* renamed from: e  reason: collision with root package name */
        View f42782e;

        public g1(View view) {
            super(view);
            this.f42778a = (LinearLayout) view.findViewById(R.id.goCommit);
            this.f42779b = (LinearLayout) view.findViewById(R.id.starlayout);
            this.f42780c = (TextView) view.findViewById(R.id.textMessage);
            this.f42781d = view.findViewById(R.id.layoutTop);
            this.f42782e = view.findViewById(R.id.layoutTop2);
        }
    }

    /* loaded from: classes4.dex */
    class g2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        HListView f42784a;

        public g2(View view) {
            super(view);
            this.f42784a = (HListView) view.findViewById(R.id.screenListView);
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r1 f42786b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b1 f42787c;

        h(r1 r1Var, b1 b1Var) {
            this.f42786b = r1Var;
            this.f42787c = b1Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42786b.f42938b.getText().toString().equals("展开")) {
                this.f42786b.f42937a.setMaxLines(Integer.MAX_VALUE);
                this.f42786b.f42938b.setText("收起");
                this.f42787c.f42721c = 1;
                return;
            }
            this.f42786b.f42937a.setMaxLines(4);
            this.f42786b.f42938b.setText("展开");
            this.f42787c.f42721c = 0;
        }
    }

    /* loaded from: classes4.dex */
    class h0 implements View.OnClickListener {
        h0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.papa.sim.statistic.p.l(view.getContext()).F("jinshouzhi", AccountUtil_.getInstance_(view.getContext()).getUid());
            GameDetialModleThreeAdapter.this.r(view.getContext(), GameMainActivity4.I2);
        }
    }

    /* loaded from: classes4.dex */
    class h1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f42790a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42791b;

        public h1(View view) {
            super(view);
            this.f42790a = (TextView) view.findViewById(R.id.info);
            this.f42791b = (TextView) view.findViewById(R.id.more);
        }
    }

    /* loaded from: classes4.dex */
    private class h2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f42793a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42794b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42795c;

        /* renamed from: d  reason: collision with root package name */
        TextView f42796d;

        /* renamed from: e  reason: collision with root package name */
        TextView[] f42797e;

        public h2(View view) {
            super(view);
            this.f42797e = null;
            this.f42793a = (TextView) view.findViewById(R.id.f15603k1);
            this.f42794b = (TextView) view.findViewById(R.id.f15604k2);
            this.f42795c = (TextView) view.findViewById(R.id.f15605k3);
            TextView textView = (TextView) view.findViewById(R.id.k4);
            this.f42796d = textView;
            this.f42797e = new TextView[]{this.f42793a, this.f42794b, this.f42795c, textView};
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f42799b;

        i(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f42799b = giftPackageDataInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42799b.getGift_package_status() == 0) {
                GameDetialModleThreeAdapter.this.f42674f.l(true, this.f42799b);
            } else {
                GameDetialModleThreeAdapter.this.f42674f.l(false, this.f42799b);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i0 implements View.OnClickListener {
        i0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.papa.sim.statistic.p.l(view.getContext()).F("yuncundang", AccountUtil_.getInstance_(view.getContext()).getUid());
            GameDetialModleThreeAdapter.this.r(view.getContext(), "云存档");
        }
    }

    /* loaded from: classes4.dex */
    class i1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        HListView f42802a;

        public i1(View view) {
            super(view);
            this.f42802a = (HListView) view.findViewById(R.id.favoriteList);
        }
    }

    /* loaded from: classes4.dex */
    private class i2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f42804a;

        public i2(View view) {
            super(view);
            this.f42804a = (TextView) view.findViewById(R.id.text);
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f42806b;

        j(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f42806b = giftPackageDataInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            try {
                str = URLEncoder.encode(GameDetialModleThreeAdapter.this.f42669a.getGame_name(), "utf8");
            } catch (UnsupportedEncodingException e5) {
                e5.printStackTrace();
                str = "";
            }
            IntentUtil intentUtil = IntentUtil.getInstance();
            Context context = GameDetialModleThreeAdapter.this.f42672d;
            intentUtil.goShareWebActivity(context, com.join.mgps.rpc.h.f54056j + "/static/vip2020/v2/index.html#/giftDetail?gift_package_id=" + this.f42806b.getGift_package_id() + "&name=" + str);
        }
    }

    /* loaded from: classes4.dex */
    class j0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f42808b;

        j0(CommentBaseBean commentBaseBean) {
            this.f42808b = commentBaseBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(Integer.parseInt(this.f42808b.getUid())).start();
        }
    }

    /* loaded from: classes4.dex */
    class j1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f42810a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f42811b;

        /* renamed from: c  reason: collision with root package name */
        SimpleDraweeView f42812c;

        /* renamed from: d  reason: collision with root package name */
        LinearLayout f42813d;

        /* renamed from: e  reason: collision with root package name */
        LinearLayout f42814e;

        /* renamed from: f  reason: collision with root package name */
        LinearLayout f42815f;

        /* renamed from: g  reason: collision with root package name */
        LinearLayout f42816g;

        /* renamed from: h  reason: collision with root package name */
        TextView f42817h;

        /* renamed from: i  reason: collision with root package name */
        TextView f42818i;

        /* renamed from: j  reason: collision with root package name */
        TextView f42819j;

        public j1(View view) {
            super(view);
            this.f42810a = (SimpleDraweeView) view.findViewById(R.id.vpnImage);
            this.f42811b = (SimpleDraweeView) view.findViewById(R.id.googleImage);
            this.f42812c = (SimpleDraweeView) view.findViewById(R.id.rootImage);
            this.f42813d = (LinearLayout) view.findViewById(R.id.look_other);
            this.f42814e = (LinearLayout) view.findViewById(R.id.vpnLayout);
            this.f42815f = (LinearLayout) view.findViewById(R.id.googleLayout);
            this.f42816g = (LinearLayout) view.findViewById(R.id.rootLayout);
            this.f42817h = (TextView) view.findViewById(R.id.vpnText);
            this.f42818i = (TextView) view.findViewById(R.id.googleText);
            this.f42819j = (TextView) view.findViewById(R.id.rootText);
        }
    }

    /* loaded from: classes4.dex */
    class j2 extends ViewHolderGameDetialMain {
        public j2(View view) {
            super(view);
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.papa.sim.statistic.p.l(view.getContext()).F("jinshouzhi", AccountUtil_.getInstance_(view.getContext()).getUid());
            GameDetialModleThreeAdapter.this.r(view.getContext(), GameMainActivity4.I2);
        }
    }

    /* loaded from: classes4.dex */
    class k0 implements View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a1 f42823b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42824c;

        /* loaded from: classes4.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Layout layout = k0.this.f42823b.f42699k.getLayout();
                if (layout == null) {
                    k0.this.f42823b.f42700l.setVisibility(8);
                    return;
                }
                int lineCount = layout.getLineCount();
                if (lineCount > 0) {
                    if (layout.getEllipsisCount(lineCount - 1) > 0) {
                        k0.this.f42823b.f42700l.setVisibility(0);
                    } else if (GameDetialModleThreeAdapter.this.f42677i.containsKey(Integer.valueOf(k0.this.f42824c))) {
                        k0.this.f42823b.f42700l.setVisibility(0);
                    } else {
                        k0.this.f42823b.f42700l.setVisibility(8);
                    }
                }
            }
        }

        k0(a1 a1Var, int i4) {
            this.f42823b = a1Var;
            this.f42824c = i4;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f42823b.f42699k.post(new a());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes4.dex */
    class k1 extends ViewHolderGameDetialMain {
        public k1(View view) {
            super(view);
        }
    }

    /* loaded from: classes4.dex */
    class k2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f42828a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42829b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42830c;

        /* renamed from: d  reason: collision with root package name */
        View f42831d;

        public k2(View view) {
            super(view);
            this.f42828a = (TextView) view.findViewById(R.id.tag);
            this.f42829b = (TextView) view.findViewById(R.id.title);
            this.f42831d = view.findViewById(R.id.main);
            this.f42830c = (TextView) view.findViewById(R.id.message);
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f42833b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ GameDetialAuxiliaryBean f42834c;

        l(List list, GameDetialAuxiliaryBean gameDetialAuxiliaryBean) {
            this.f42833b = list;
            this.f42834c = gameDetialAuxiliaryBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42833b.size() > 0) {
                IntentUtil.getInstance().goShareWebActivity(GameDetialModleThreeAdapter.this.f42672d, this.f42834c.getMore_url());
            }
        }
    }

    /* loaded from: classes4.dex */
    class l0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a1 f42836b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42837c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f42838d;

        l0(a1 a1Var, int i4, CommentBaseBean commentBaseBean) {
            this.f42836b = a1Var;
            this.f42837c = i4;
            this.f42838d = commentBaseBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42836b.f42700l.getText().toString().equals("查看全部")) {
                GameDetialModleThreeAdapter.this.f42677i.put(Integer.valueOf(this.f42837c), Boolean.TRUE);
                if (Build.VERSION.SDK_INT == 19) {
                    this.f42836b.f42699k.setText(this.f42838d.getContent());
                }
                this.f42836b.f42699k.setMaxLines(Integer.MAX_VALUE);
                this.f42836b.f42700l.setText("收起");
                return;
            }
            GameDetialModleThreeAdapter.this.f42677i.put(Integer.valueOf(this.f42837c), Boolean.FALSE);
            if (Build.VERSION.SDK_INT == 19) {
                this.f42836b.f42699k.setText(this.f42838d.getContent().replaceAll("\n", ""));
            }
            this.f42836b.f42699k.setMaxLines(5);
            this.f42836b.f42700l.setText("查看全部");
        }
    }

    /* loaded from: classes4.dex */
    class l1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        RelativeLayout f42840a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f42841b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f42842c;

        /* renamed from: d  reason: collision with root package name */
        TextView f42843d;

        /* renamed from: e  reason: collision with root package name */
        TextView f42844e;

        /* renamed from: f  reason: collision with root package name */
        TextView f42845f;

        /* renamed from: g  reason: collision with root package name */
        TextView f42846g;

        /* renamed from: h  reason: collision with root package name */
        VipView f42847h;

        /* renamed from: i  reason: collision with root package name */
        public View f42848i;

        public l1(View view) {
            super(view);
            this.f42840a = (RelativeLayout) view.findViewById(R.id.main);
            this.f42841b = (SimpleDraweeView) view.findViewById(R.id.usericon);
            this.f42842c = (ImageView) view.findViewById(R.id.parise);
            this.f42843d = (TextView) view.findViewById(R.id.username);
            this.f42844e = (TextView) view.findViewById(R.id.time);
            this.f42845f = (TextView) view.findViewById(R.id.content);
            this.f42846g = (TextView) view.findViewById(R.id.pariseNumber);
            this.f42847h = (VipView) view.findViewById(R.id.levelTv);
            this.f42848i = view.findViewById(R.id.line);
        }
    }

    /* loaded from: classes4.dex */
    class l2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        SlidingTabLayoutGameDetail f42850a;

        /* renamed from: b  reason: collision with root package name */
        ViewPager f42851b;

        public l2(View view) {
            super(view);
            this.f42850a = (SlidingTabLayoutGameDetail) view.findViewById(R.id.tabLayout);
            this.f42851b = (ViewPager) view.findViewById(R.id.viewPager);
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f42853b;

        m(List list) {
            this.f42853b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42853b.size() > 0) {
                IntentUtil.getInstance().goShareWebActivity(GameDetialModleThreeAdapter.this.f42672d, ((GamedetialAuxiliaryToolBean) this.f42853b.get(0)).getUrl());
            }
        }
    }

    /* loaded from: classes4.dex */
    class m0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f42855b;

        m0(InformationCommentBean informationCommentBean) {
            this.f42855b = informationCommentBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c1 c1Var = GameDetialModleThreeAdapter.this.f42674f;
            if (c1Var != null) {
                c1Var.f(this.f42855b);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        RelativeLayout f42857a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42858b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42859c;

        public m1(View view) {
            super(view);
            this.f42857a = (RelativeLayout) view.findViewById(R.id.commentFooterLayout);
            this.f42858b = (TextView) view.findViewById(R.id.showAllCommit);
            this.f42859c = (TextView) view.findViewById(R.id.goforum);
        }
    }

    /* loaded from: classes4.dex */
    class m2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f42861a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42862b;

        public m2(View view) {
            super(view);
            this.f42861a = (LinearLayout) view.findViewById(R.id.handSharkLayout);
            this.f42862b = (TextView) view.findViewById(R.id.suntitle);
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f42864b;

        n(List list) {
            this.f42864b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42864b.size() > 1) {
                IntentUtil.getInstance().goShareWebActivity(GameDetialModleThreeAdapter.this.f42672d, ((GamedetialAuxiliaryToolBean) this.f42864b.get(1)).getUrl());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f42866b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42867c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f42868d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d1 f42869e;

        n0(int i4, int i5, String str, d1 d1Var) {
            this.f42866b = i4;
            this.f42867c = i5;
            this.f42868d = str;
            this.f42869e = d1Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42866b == 0) {
                return;
            }
            InformationCommentBean informationCommentBean = new InformationCommentBean();
            ArrayList arrayList = new ArrayList();
            for (int i4 = this.f42866b; i4 >= 0; i4--) {
                b1 b1Var = (b1) GameDetialModleThreeAdapter.this.f42682n.get(this.f42867c - i4);
                d1 d1Var = b1Var.f42720b == 15 ? (d1) b1Var.f42719a : null;
                if (d1Var != null && this.f42868d == d1Var.f42736a) {
                    arrayList.addAll(d1Var.f42737b.getSub());
                }
            }
            for (int i5 = 0; i5 <= this.f42866b; i5++) {
                GameDetialModleThreeAdapter.this.f42682n.remove(this.f42867c - i5);
            }
            informationCommentBean.setSub(arrayList);
            GameDetialModleThreeAdapter.this.f42682n.add(this.f42867c - this.f42866b, GameDetialModleThreeAdapter.this.p(this.f42868d, informationCommentBean, this.f42869e.f42738c, true));
            GameDetialModleThreeAdapter.this.notifyDataSetChanged();
        }
    }

    /* loaded from: classes4.dex */
    class n1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f42871a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f42872b;

        /* renamed from: c  reason: collision with root package name */
        View f42873c;

        public n1(View view) {
            super(view);
            this.f42872b = (ImageView) view.findViewById(R.id.commitImage);
            this.f42873c = view.findViewById(R.id.layoutBottom);
            this.f42871a = (TextView) view.findViewById(R.id.commitCount);
        }
    }

    /* loaded from: classes4.dex */
    class n2 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f42875a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42876b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42877c;

        /* renamed from: d  reason: collision with root package name */
        TextView f42878d;

        public n2(View view) {
            super(view);
            this.f42875a = (TextView) view.findViewById(R.id.tag);
            this.f42876b = (TextView) view.findViewById(R.id.day);
            this.f42877c = (TextView) view.findViewById(R.id.time);
            this.f42878d = (TextView) view.findViewById(R.id.serverName);
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f42880b;

        o(List list) {
            this.f42880b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42880b.size() > 2) {
                IntentUtil.getInstance().goShareWebActivity(GameDetialModleThreeAdapter.this.f42672d, ((GamedetialAuxiliaryToolBean) this.f42880b.get(2)).getUrl());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f42882b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f42883c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f42884d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f42885e;

        o0(int i4, InformationCommentBean informationCommentBean, String str, int i5) {
            this.f42882b = i4;
            this.f42883c = informationCommentBean;
            this.f42884d = str;
            this.f42885e = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4 = 0;
            int i5 = 0;
            boolean z4 = false;
            while (i4 < this.f42882b) {
                InformationCommentBean informationCommentBean = new InformationCommentBean(this.f42883c);
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
                b1 p4 = GameDetialModleThreeAdapter.this.p(this.f42884d, informationCommentBean, 0, i5 == 0);
                d1 d1Var = (d1) p4.f42719a;
                d1Var.f42740e = i5;
                d1Var.f42741f = z4;
                d1Var.f42739d = i5 == 0;
                GameDetialModleThreeAdapter.this.H(p4, !z4);
                GameDetialModleThreeAdapter.this.f42682n.add(this.f42885e + i5 + 1, p4);
                i5++;
                i4 = i6;
            }
            GameDetialModleThreeAdapter.this.f42682n.remove(this.f42885e);
            GameDetialModleThreeAdapter.this.notifyDataSetChanged();
        }
    }

    /* loaded from: classes4.dex */
    class o1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f42887a;

        /* renamed from: b  reason: collision with root package name */
        View f42888b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42889c;

        /* renamed from: d  reason: collision with root package name */
        TextView f42890d;

        /* renamed from: e  reason: collision with root package name */
        View f42891e;

        /* renamed from: f  reason: collision with root package name */
        View f42892f;

        /* renamed from: g  reason: collision with root package name */
        LinearLayout f42893g;

        public o1(View view) {
            super(view);
            this.f42893g = (LinearLayout) view.findViewById(R.id.parentLayout);
            this.f42887a = (LinearLayout) view.findViewById(R.id.comment_reply_container);
            this.f42888b = view.findViewById(R.id.comment_reply_divider);
            this.f42889c = (TextView) view.findViewById(R.id.comment_reply_content);
            this.f42890d = (TextView) view.findViewById(R.id.comment_reply_more);
            this.f42891e = view.findViewById(R.id.line);
            this.f42892f = view.findViewById(R.id.bottom);
        }
    }

    /* loaded from: classes4.dex */
    public class o2 {
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

        /* renamed from: b  reason: collision with root package name */
        public static final int f42895b = 1;

        /* renamed from: c  reason: collision with root package name */
        public static final int f42896c = 2;

        /* renamed from: d  reason: collision with root package name */
        public static final int f42897d = 3;

        /* renamed from: e  reason: collision with root package name */
        public static final int f42898e = 4;

        /* renamed from: f  reason: collision with root package name */
        public static final int f42899f = 5;

        /* renamed from: g  reason: collision with root package name */
        public static final int f42900g = 6;

        /* renamed from: h  reason: collision with root package name */
        public static final int f42901h = 7;

        /* renamed from: i  reason: collision with root package name */
        public static final int f42902i = 8;

        /* renamed from: j  reason: collision with root package name */
        public static final int f42903j = 9;

        /* renamed from: k  reason: collision with root package name */
        public static final int f42904k = 10;

        /* renamed from: l  reason: collision with root package name */
        public static final int f42905l = 11;

        /* renamed from: m  reason: collision with root package name */
        public static final int f42906m = 12;

        /* renamed from: n  reason: collision with root package name */
        public static final int f42907n = 13;

        /* renamed from: o  reason: collision with root package name */
        public static final int f42908o = 14;

        /* renamed from: p  reason: collision with root package name */
        public static final int f42909p = 15;

        /* renamed from: q  reason: collision with root package name */
        public static final int f42910q = 16;

        /* renamed from: r  reason: collision with root package name */
        public static final int f42911r = 17;

        /* renamed from: s  reason: collision with root package name */
        public static final int f42912s = 18;

        /* renamed from: t  reason: collision with root package name */
        public static final int f42913t = 19;

        /* renamed from: u  reason: collision with root package name */
        public static final int f42914u = 20;

        /* renamed from: v  reason: collision with root package name */
        public static final int f42915v = 21;

        /* renamed from: w  reason: collision with root package name */
        public static final int f42916w = 22;

        /* renamed from: x  reason: collision with root package name */
        public static final int f42917x = 23;

        /* renamed from: y  reason: collision with root package name */
        public static final int f42918y = 24;

        /* renamed from: z  reason: collision with root package name */
        public static final int f42919z = 25;

        public o2() {
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ y1 f42921b;

        p(y1 y1Var) {
            this.f42921b = y1Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if ("收起".equals(this.f42921b.f43028b.getText().toString())) {
                this.f42921b.f43028b.setText("展开");
                this.f42921b.f43027a.setVisibility(8);
                return;
            }
            this.f42921b.f43028b.setText("收起");
            this.f42921b.f43027a.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean.Sub f42923b;

        p0(InformationCommentBean.Sub sub) {
            this.f42923b = sub;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c1 c1Var = GameDetialModleThreeAdapter.this.f42674f;
            if (c1Var != null) {
                c1Var.e(this.f42923b);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f42925a;

        /* renamed from: b  reason: collision with root package name */
        MyGridView f42926b;

        public p1(View view) {
            super(view);
            this.f42926b = (MyGridView) view.findViewById(R.id.recomListView);
            this.f42925a = (LinearLayout) view.findViewById(R.id.layoutContent);
        }
    }

    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ x1 f42928b;

        q(x1 x1Var) {
            this.f42928b = x1Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if ("收起".equals(this.f42928b.f43007c.getText().toString())) {
                this.f42928b.f43007c.setText("展开");
                if (GameDetialModleThreeAdapter.this.f42669a.getGame_upgrade_info_switch() == 1) {
                    this.f42928b.f43005a.setVisibility(8);
                }
                if (GameDetialModleThreeAdapter.this.f42669a.getGame_detailed() != null) {
                    this.f42928b.f43006b.setVisibility(8);
                    return;
                }
                return;
            }
            this.f42928b.f43007c.setText("收起");
            if (GameDetialModleThreeAdapter.this.f42669a.getGame_upgrade_info_switch() == 1) {
                this.f42928b.f43005a.setVisibility(0);
            }
            if (GameDetialModleThreeAdapter.this.f42669a.getGame_detailed() != null) {
                this.f42928b.f43006b.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f42930b;

        q0(CommentBaseBean commentBaseBean) {
            this.f42930b = commentBaseBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c1 c1Var;
            CommentBaseBean commentBaseBean = this.f42930b;
            if (commentBaseBean == null || (c1Var = GameDetialModleThreeAdapter.this.f42674f) == null) {
                return;
            }
            c1Var.d(commentBaseBean);
        }
    }

    /* loaded from: classes4.dex */
    class q1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f42932a;

        /* renamed from: b  reason: collision with root package name */
        MyGridView f42933b;

        public q1(View view) {
            super(view);
            this.f42933b = (MyGridView) view.findViewById(R.id.recomListView);
            this.f42932a = (LinearLayout) view.findViewById(R.id.layoutContent);
        }
    }

    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.join.mgps.Util.g2.h(GameDetialModleThreeAdapter.this.f42669a.getGame_company_id()) || "0".equals(GameDetialModleThreeAdapter.this.f42669a.getGame_company_id())) {
                return;
            }
            PaPaBannerListActivity_.k0(GameDetialModleThreeAdapter.this.f42672d).e(1).a(true).c(GameDetialModleThreeAdapter.this.f42669a.getGame_company_id()).d(GameDetialModleThreeAdapter.this.f42669a.getCompany_name()).start();
        }
    }

    /* loaded from: classes4.dex */
    class r0 implements View.OnClickListener {
        r0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.join.mgps.Util.g2.h(GameDetialModleThreeAdapter.this.f42669a.getGame_company_id()) || "0".equals(GameDetialModleThreeAdapter.this.f42669a.getGame_company_id())) {
                return;
            }
            PaPaBannerListActivity_.k0(GameDetialModleThreeAdapter.this.f42672d).e(1).a(true).c(GameDetialModleThreeAdapter.this.f42669a.getGame_company_id()).d(GameDetialModleThreeAdapter.this.f42669a.getCompany_name()).start();
        }
    }

    /* loaded from: classes4.dex */
    class r1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f42937a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42938b;

        public r1(View view) {
            super(view);
            this.f42937a = (TextView) view.findViewById(R.id.htmlGameDescribe);
            this.f42938b = (TextView) view.findViewById(R.id.textMore);
        }
    }

    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(GameDetialModleThreeAdapter.this.f42672d).getAccountData();
            if (accountData == null || accountData.getUid() == 0) {
                com.join.mgps.Util.l2.a(GameDetialModleThreeAdapter.this.f42672d).b("让大伙知道分享者的大名");
                IntentUtil.getInstance().goLoginInteractive(GameDetialModleThreeAdapter.this.f42672d);
            } else if (com.join.mgps.Util.g2.h(accountData.getNickname()) || (accountData.getAccount().equals(accountData.getNickname()) && accountData.getAccount().startsWith("pa"))) {
                IntentUtil.getInstance().goChangeNickname(GameDetialModleThreeAdapter.this.f42672d);
            } else {
                PrefDef_ prefDef_ = new PrefDef_(GameDetialModleThreeAdapter.this.f42672d);
                if (com.join.mgps.Util.g2.i(prefDef_.uploadType2().d())) {
                    IntentUtil.getInstance().goShareWebActivity(GameDetialModleThreeAdapter.this.f42672d, prefDef_.uploadType2().d());
                } else {
                    UploadActivity_.Q0(GameDetialModleThreeAdapter.this.f42672d).start();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f42941b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42942c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ImageView f42943d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TextView f42944e;

        /* loaded from: classes4.dex */
        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                long longValue = Long.valueOf(s0.this.f42944e.getText().toString()).longValue();
                TextView textView = s0.this.f42944e;
                textView.setText((longValue + 1) + "");
                s0 s0Var = s0.this;
                GameDetialModleThreeAdapter.this.o(s0Var.f42942c);
                s0 s0Var2 = s0.this;
                c1 c1Var = GameDetialModleThreeAdapter.this.f42674f;
                if (c1Var != null) {
                    c1Var.b(s0Var2.f42941b, s0Var2.f42942c, 1);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        s0(CommentBaseBean commentBaseBean, int i4, ImageView imageView, TextView textView) {
            this.f42941b = commentBaseBean;
            this.f42942c = i4;
            this.f42943d = imageView;
            this.f42944e = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentBaseBean commentBaseBean;
            long currentTimeMillis = System.currentTimeMillis();
            GameDetialModleThreeAdapter gameDetialModleThreeAdapter = GameDetialModleThreeAdapter.this;
            if (currentTimeMillis - gameDetialModleThreeAdapter.f42683o < 500) {
                return;
            }
            gameDetialModleThreeAdapter.f42683o = currentTimeMillis;
            if (IntentUtil.getInstance().goLoginInteractive(GameDetialModleThreeAdapter.this.f42672d) || (commentBaseBean = this.f42941b) == null) {
                return;
            }
            if (commentBaseBean.getIs_praise() == 1) {
                GameDetialModleThreeAdapter.this.U(this.f42942c);
                this.f42943d.setImageResource(R.drawable.up_ic);
                c1 c1Var = GameDetialModleThreeAdapter.this.f42674f;
                if (c1Var != null) {
                    c1Var.b(this.f42941b, this.f42942c, 2);
                    return;
                }
                return;
            }
            this.f42941b.setIs_praise(1);
            if (AccountUtil_.getInstance_(GameDetialModleThreeAdapter.this.f42672d).getAccountData() == null) {
                IntentUtil.getInstance().goLoginInteractive(GameDetialModleThreeAdapter.this.f42672d);
                return;
            }
            this.f42943d.setImageResource(R.drawable.uped_ic);
            Animation loadAnimation = AnimationUtils.loadAnimation(GameDetialModleThreeAdapter.this.f42672d, R.anim.scale_reset);
            this.f42943d.startAnimation(loadAnimation);
            loadAnimation.setAnimationListener(new a());
        }
    }

    /* loaded from: classes4.dex */
    class s1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        RelativeLayout f42947a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42948b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42949c;

        /* renamed from: d  reason: collision with root package name */
        LinearLayout f42950d;

        /* renamed from: e  reason: collision with root package name */
        TextView f42951e;

        /* renamed from: f  reason: collision with root package name */
        TextView f42952f;

        /* renamed from: g  reason: collision with root package name */
        TextView f42953g;

        /* renamed from: h  reason: collision with root package name */
        TextView f42954h;

        /* renamed from: i  reason: collision with root package name */
        TextView f42955i;

        /* renamed from: j  reason: collision with root package name */
        TextView f42956j;

        /* renamed from: k  reason: collision with root package name */
        TextView f42957k;

        /* renamed from: l  reason: collision with root package name */
        TextView f42958l;

        /* renamed from: m  reason: collision with root package name */
        TextView f42959m;

        /* renamed from: n  reason: collision with root package name */
        LinearLayout f42960n;

        /* renamed from: o  reason: collision with root package name */
        LinearLayout f42961o;

        /* renamed from: p  reason: collision with root package name */
        LinearLayout f42962p;

        /* renamed from: q  reason: collision with root package name */
        LinearLayout f42963q;

        /* renamed from: r  reason: collision with root package name */
        LinearLayout f42964r;

        public s1(View view) {
            super(view);
            this.f42947a = (RelativeLayout) view.findViewById(R.id.message);
            this.f42948b = (TextView) view.findViewById(R.id.moreText);
            this.f42949c = (TextView) view.findViewById(R.id.downNumberTitle);
            this.f42950d = (LinearLayout) view.findViewById(R.id.look_other);
            this.f42951e = (TextView) view.findViewById(R.id.downNumber);
            this.f42952f = (TextView) view.findViewById(R.id.nowVersion);
            this.f42953g = (TextView) view.findViewById(R.id.appSize);
            this.f42954h = (TextView) view.findViewById(R.id.updateDate);
            this.f42955i = (TextView) view.findViewById(R.id.androdVersion);
            this.f42956j = (TextView) view.findViewById(R.id.commpany);
            this.f42957k = (TextView) view.findViewById(R.id.resousFrom);
            this.f42958l = (TextView) view.findViewById(R.id.upGame);
            this.f42960n = (LinearLayout) view.findViewById(R.id.resousFromLayout);
            this.f42961o = (LinearLayout) view.findViewById(R.id.commpanyLayout);
            this.f42963q = (LinearLayout) view.findViewById(R.id.androdVersionLayout);
            this.f42962p = (LinearLayout) view.findViewById(R.id.nowVersionLayout);
            this.f42964r = (LinearLayout) view.findViewById(R.id.sizelayout);
            this.f42959m = (TextView) view.findViewById(R.id.titleText);
        }
    }

    /* loaded from: classes4.dex */
    class t implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s1 f42966b;

        t(s1 s1Var) {
            this.f42966b = s1Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (" ".equals(this.f42966b.f42948b.getText().toString())) {
                this.f42966b.f42948b.setText("");
                this.f42966b.f42948b.setBackgroundResource(R.drawable.arena_down_arrow);
                this.f42966b.f42947a.setVisibility(8);
                return;
            }
            this.f42966b.f42948b.setText(" ");
            this.f42966b.f42948b.setBackgroundResource(R.drawable.arena_up_arrow);
            this.f42966b.f42947a.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class t0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f42968b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42969c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ImageView f42970d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TextView f42971e;

        /* loaded from: classes4.dex */
        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                long longValue = Long.valueOf(t0.this.f42971e.getText().toString()).longValue();
                TextView textView = t0.this.f42971e;
                textView.setText((longValue + 1) + "");
                t0 t0Var = t0.this;
                GameDetialModleThreeAdapter.this.n(t0Var.f42969c);
                t0 t0Var2 = t0.this;
                c1 c1Var = GameDetialModleThreeAdapter.this.f42674f;
                if (c1Var != null) {
                    c1Var.c(t0Var2.f42968b, t0Var2.f42969c, 1);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        t0(CommentBaseBean commentBaseBean, int i4, ImageView imageView, TextView textView) {
            this.f42968b = commentBaseBean;
            this.f42969c = i4;
            this.f42970d = imageView;
            this.f42971e = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentBaseBean commentBaseBean;
            if (IntentUtil.getInstance().goLoginInteractive(GameDetialModleThreeAdapter.this.f42672d) || (commentBaseBean = this.f42968b) == null) {
                return;
            }
            if (commentBaseBean.getIs_despise() == 1) {
                GameDetialModleThreeAdapter.this.T(this.f42969c);
                this.f42970d.setImageResource(R.drawable.down_ic);
                c1 c1Var = GameDetialModleThreeAdapter.this.f42674f;
                if (c1Var != null) {
                    c1Var.c(this.f42968b, this.f42969c, 2);
                    return;
                }
                return;
            }
            this.f42968b.setIs_despise(1);
            if (AccountUtil_.getInstance_(GameDetialModleThreeAdapter.this.f42672d).getAccountData() == null) {
                IntentUtil.getInstance().goLoginInteractive(GameDetialModleThreeAdapter.this.f42672d);
                return;
            }
            this.f42970d.setImageResource(R.drawable.downed_ic);
            Animation loadAnimation = AnimationUtils.loadAnimation(GameDetialModleThreeAdapter.this.f42672d, R.anim.scale_reset);
            this.f42970d.startAnimation(loadAnimation);
            loadAnimation.setAnimationListener(new a());
        }
    }

    /* loaded from: classes4.dex */
    class t1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f42974a;

        /* renamed from: b  reason: collision with root package name */
        TextView f42975b;

        /* renamed from: c  reason: collision with root package name */
        TextView f42976c;

        /* renamed from: d  reason: collision with root package name */
        TextView f42977d;

        /* renamed from: e  reason: collision with root package name */
        LinearLayout f42978e;

        public t1(View view) {
            super(view);
            this.f42974a = (SimpleDraweeView) view.findViewById(R.id.giftIcon);
            this.f42975b = (TextView) view.findViewById(R.id.giftName);
            this.f42976c = (TextView) view.findViewById(R.id.giftContent);
            this.f42977d = (TextView) view.findViewById(R.id.getGiftTextView);
            this.f42978e = (LinearLayout) view.findViewById(R.id.layoutContent);
        }
    }

    /* loaded from: classes4.dex */
    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.join.mgps.Util.g2.h(GameDetialModleThreeAdapter.this.f42669a.getGame_company_id()) || "0".equals(GameDetialModleThreeAdapter.this.f42669a.getGame_company_id())) {
                return;
            }
            PaPaBannerListActivity_.k0(GameDetialModleThreeAdapter.this.f42672d).e(1).a(true).c(GameDetialModleThreeAdapter.this.f42669a.getGame_company_id()).d(GameDetialModleThreeAdapter.this.f42669a.getCompany_name()).start();
        }
    }

    /* loaded from: classes4.dex */
    class u0 implements View.OnClickListener {
        u0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameDetialModleThreeAdapter.this.f42671c.getViewPager() != null) {
                GameDetialModleThreeAdapter.this.f42671c.getViewPager().setCurrentItem(2);
            }
        }
    }

    /* loaded from: classes4.dex */
    class u1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f42982a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f42983b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f42984c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f42985d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f42986e;

        /* renamed from: f  reason: collision with root package name */
        public MStarBar f42987f;

        /* renamed from: g  reason: collision with root package name */
        public LinearLayout f42988g;

        /* renamed from: h  reason: collision with root package name */
        public LinearLayout f42989h;

        /* renamed from: i  reason: collision with root package name */
        public ImageView f42990i;

        /* renamed from: j  reason: collision with root package name */
        private LinearLayout f42991j;

        /* renamed from: k  reason: collision with root package name */
        private TextView f42992k;

        public u1(View view) {
            super(view);
            this.f42983b = (TextView) view.findViewById(R.id.appName);
            this.f42984c = (TextView) view.findViewById(R.id.appCompany);
            this.f42985d = (TextView) view.findViewById(R.id.appSize);
            this.f42986e = (TextView) view.findViewById(R.id.appDownloadCount);
            this.f42987f = (MStarBar) view.findViewById(R.id.comment_head_mstarBar);
            this.f42982a = (SimpleDraweeView) view.findViewById(R.id.appIcon);
            this.f42988g = (LinearLayout) view.findViewById(R.id.companyLayout);
            this.f42989h = (LinearLayout) view.findViewById(R.id.layoutGift);
            this.f42990i = (ImageView) view.findViewById(R.id.giftImage);
            this.f42991j = (LinearLayout) view.findViewById(R.id.scoreLayout);
            this.f42992k = (TextView) view.findViewById(R.id.comment_head_point_tx);
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.papa.sim.statistic.p.l(view.getContext()).F("yuncundang", AccountUtil_.getInstance_(view.getContext()).getUid());
            GameDetialModleThreeAdapter.this.r(view.getContext(), "云存档");
        }
    }

    /* loaded from: classes4.dex */
    class v0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppBeanMain f42995b;

        v0(AppBeanMain appBeanMain) {
            this.f42995b = appBeanMain;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(GameDetialModleThreeAdapter.this.f42672d, this.f42995b.getIntentDataBean());
        }
    }

    /* loaded from: classes4.dex */
    class v1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f42997a;

        public v1(View view) {
            super(view);
            this.f42997a = (LinearLayout) view.findViewById(R.id.itemLayout);
        }
    }

    /* loaded from: classes4.dex */
    class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(GameDetialModleThreeAdapter.this.f42672d).getAccountData();
            if (com.join.mgps.Util.g2.h(accountData.getNickname()) || (accountData.getAccount().equals(accountData.getNickname()) && accountData.getAccount().startsWith("pa"))) {
                IntentUtil.getInstance().goChangeNickname(GameDetialModleThreeAdapter.this.f42672d);
                return;
            }
            PrefDef_ prefDef_ = new PrefDef_(GameDetialModleThreeAdapter.this.f42672d);
            if (com.join.mgps.Util.g2.i(prefDef_.uploadType2().d())) {
                IntentUtil.getInstance().goShareWebActivity(GameDetialModleThreeAdapter.this.f42672d, prefDef_.uploadType2().d());
            } else {
                UploadActivity_.Q0(GameDetialModleThreeAdapter.this.f42672d).start();
            }
        }
    }

    /* loaded from: classes4.dex */
    class w0 implements View.OnClickListener {
        w0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goMainLabelActivity(GameDetialModleThreeAdapter.this.f42672d, 0, GameDetialModleThreeAdapter.this.f42669a.getCommunity_entrance_tag(), 1);
        }
    }

    /* loaded from: classes4.dex */
    class w1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f43001a;

        public w1(View view) {
            super(view);
            this.f43001a = (TextView) view.findViewById(R.id.htmlEditRecommend);
        }
    }

    /* loaded from: classes4.dex */
    class x implements View.OnClickListener {
        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentAllListActivity_.H0(GameDetialModleThreeAdapter.this.f42672d).f(GameDetialModleThreeAdapter.this.f42669a.getGame_id()).i(GameDetialModleThreeAdapter.this.f42669a.getPackageName()).h(GameDetialModleThreeAdapter.this.f42669a.getPlugin_num()).g(GameDetialModleThreeAdapter.this.f42669a.getIs_started()).j(GameDetialModleThreeAdapter.this.f42669a.getGame_score() != null ? GameDetialModleThreeAdapter.this.f42669a.getGame_score().getSgc_switch() : 0).a(GameDetialModleThreeAdapter.this.f42669a.getBespeak_switch()).d(GameDetialModleThreeAdapter.this.f42669a.getComment_score_switch()).start();
        }
    }

    /* loaded from: classes4.dex */
    class x0 implements View.OnClickListener {
        x0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                GameDetialModleThreeAdapter.this.f42672d.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqwpa://im/chat?chat_type=wpa&uin=" + GameDetialModleThreeAdapter.this.f42669a.getGame_exclusive_benefits_qq() + "&version=1")));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes4.dex */
    class x1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f43005a;

        /* renamed from: b  reason: collision with root package name */
        View f43006b;

        /* renamed from: c  reason: collision with root package name */
        TextView f43007c;

        /* renamed from: d  reason: collision with root package name */
        LinearLayout f43008d;

        /* renamed from: e  reason: collision with root package name */
        TextView f43009e;

        /* renamed from: f  reason: collision with root package name */
        TextView f43010f;

        /* renamed from: g  reason: collision with root package name */
        TextView f43011g;

        /* renamed from: h  reason: collision with root package name */
        TextView f43012h;

        /* renamed from: i  reason: collision with root package name */
        TextView f43013i;

        /* renamed from: j  reason: collision with root package name */
        TextView f43014j;

        /* renamed from: k  reason: collision with root package name */
        TextView f43015k;

        /* renamed from: l  reason: collision with root package name */
        TextView f43016l;

        /* renamed from: m  reason: collision with root package name */
        TextView f43017m;

        /* renamed from: n  reason: collision with root package name */
        TextView f43018n;

        /* renamed from: o  reason: collision with root package name */
        LinearLayout f43019o;

        /* renamed from: p  reason: collision with root package name */
        LinearLayout f43020p;

        /* renamed from: q  reason: collision with root package name */
        LinearLayout f43021q;

        /* renamed from: r  reason: collision with root package name */
        LinearLayout f43022r;

        /* renamed from: s  reason: collision with root package name */
        LinearLayout f43023s;

        public x1(View view) {
            super(view);
            this.f43005a = (TextView) view.findViewById(R.id.message);
            this.f43006b = view.findViewById(R.id.message1);
            this.f43007c = (TextView) view.findViewById(R.id.moreText);
            this.f43008d = (LinearLayout) view.findViewById(R.id.look_other);
            this.f43007c = (TextView) view.findViewById(R.id.moreText);
            this.f43009e = (TextView) view.findViewById(R.id.downNumberTitle);
            this.f43008d = (LinearLayout) view.findViewById(R.id.look_other);
            this.f43010f = (TextView) view.findViewById(R.id.downNumber);
            this.f43011g = (TextView) view.findViewById(R.id.nowVersion);
            this.f43012h = (TextView) view.findViewById(R.id.appSize);
            this.f43013i = (TextView) view.findViewById(R.id.updateDate);
            this.f43014j = (TextView) view.findViewById(R.id.androdVersion);
            this.f43015k = (TextView) view.findViewById(R.id.commpany);
            this.f43016l = (TextView) view.findViewById(R.id.resousFrom);
            this.f43017m = (TextView) view.findViewById(R.id.upGame);
            this.f43019o = (LinearLayout) view.findViewById(R.id.resousFromLayout);
            this.f43020p = (LinearLayout) view.findViewById(R.id.commpanyLayout);
            this.f43022r = (LinearLayout) view.findViewById(R.id.androdVersionLayout);
            this.f43021q = (LinearLayout) view.findViewById(R.id.nowVersionLayout);
            this.f43023s = (LinearLayout) view.findViewById(R.id.sizelayout);
            this.f43018n = (TextView) view.findViewById(R.id.titleText);
        }
    }

    /* loaded from: classes4.dex */
    class y implements View.OnClickListener {
        y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(GameDetialModleThreeAdapter.this.f42672d).getAccountData();
            if (com.join.mgps.Util.g2.h(accountData.getNickname()) || (accountData.getAccount().equals(accountData.getNickname()) && accountData.getAccount().startsWith("pa"))) {
                IntentUtil.getInstance().goChangeNickname(GameDetialModleThreeAdapter.this.f42672d);
            } else if (IntentUtil.getInstance().goLoginInteractive(GameDetialModleThreeAdapter.this.f42672d)) {
            } else {
                if (GameDetialModleThreeAdapter.this.f42669a.getSelf_comment() == null) {
                    CommentCreatActivity_.w0(GameDetialModleThreeAdapter.this.f42672d).f(GameDetialModleThreeAdapter.this.f42669a.getGame_id()).j(GameDetialModleThreeAdapter.this.f42669a.getPackageName()).h(GameDetialModleThreeAdapter.this.f42669a.getPlugin_num()).g(GameDetialModleThreeAdapter.this.f42669a.getIs_started()).a(GameDetialModleThreeAdapter.this.f42669a.getBespeak_switch()).d(GameDetialModleThreeAdapter.this.f42669a.getComment_score_switch()).start();
                    return;
                }
                CommentAllListBean.SelfCommentBean self_comment = GameDetialModleThreeAdapter.this.f42669a.getSelf_comment();
                CommentCreatActivity_.w0(GameDetialModleThreeAdapter.this.f42672d).f(GameDetialModleThreeAdapter.this.f42669a.getGame_id()).j(GameDetialModleThreeAdapter.this.f42669a.getPackageName()).d(GameDetialModleThreeAdapter.this.f42669a.getComment_score_switch()).c(self_comment.getId()).e(Float.valueOf(self_comment.getStars_score()).floatValue()).a(GameDetialModleThreeAdapter.this.f42669a.getBespeak_switch()).h(GameDetialModleThreeAdapter.this.f42669a.getPlugin_num()).g(GameDetialModleThreeAdapter.this.f42669a.getIs_started()).b(self_comment.getContent()).start();
            }
        }
    }

    /* loaded from: classes4.dex */
    class y0 implements View.OnClickListener {
        y0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentAllListActivity_.H0(GameDetialModleThreeAdapter.this.f42672d).f(GameDetialModleThreeAdapter.this.f42669a.getGame_id()).i(GameDetialModleThreeAdapter.this.f42669a.getPackageName()).h(GameDetialModleThreeAdapter.this.f42669a.getPlugin_num()).a(GameDetialModleThreeAdapter.this.f42669a.getBespeak_switch()).g(GameDetialModleThreeAdapter.this.f42669a.getIs_started()).j(GameDetialModleThreeAdapter.this.f42669a.getGame_score().getSgc_switch()).d(GameDetialModleThreeAdapter.this.f42669a.getComment_score_switch()).start();
        }
    }

    /* loaded from: classes4.dex */
    class y1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        TextView f43027a;

        /* renamed from: b  reason: collision with root package name */
        TextView f43028b;

        /* renamed from: c  reason: collision with root package name */
        LinearLayout f43029c;

        public y1(View view) {
            super(view);
            this.f43027a = (TextView) view.findViewById(R.id.message);
            this.f43028b = (TextView) view.findViewById(R.id.moreText);
            this.f43029c = (LinearLayout) view.findViewById(R.id.look_other);
        }
    }

    /* loaded from: classes4.dex */
    class z implements View.OnClickListener {
        z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameDetialModleThreeAdapter.this.f42671c == null || GameDetialModleThreeAdapter.this.f42671c.getViewPager() == null) {
                return;
            }
            GameDetialModleThreeAdapter.this.f42671c.getViewPager().setCurrentItem(1);
        }
    }

    /* loaded from: classes4.dex */
    class z0 extends PagerAdapter {

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.papa.sim.statistic.p.l(view.getContext()).F("yijianjineng", AccountUtil_.getInstance_(view.getContext()).getUid());
                GameDetialModleThreeAdapter.this.r(view.getContext(), "一键技能");
            }
        }

        z0() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return GameDetialModleThreeAdapter.this.f42685q.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i4) {
            viewGroup.addView((View) GameDetialModleThreeAdapter.this.f42685q.get(i4));
            View view = (View) GameDetialModleThreeAdapter.this.f42685q.get(i4);
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
    class z1 extends ViewHolderGameDetialMain {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f43034a;

        /* renamed from: b  reason: collision with root package name */
        TextView f43035b;

        /* renamed from: c  reason: collision with root package name */
        TextView f43036c;

        public z1(View view) {
            super(view);
            this.f43034a = (LinearLayout) view.findViewById(R.id.handSharkLayout);
            this.f43035b = (TextView) view.findViewById(R.id.title);
            this.f43036c = (TextView) view.findViewById(R.id.suntitle);
        }
    }

    public GameDetialModleThreeAdapter(Context context, BaseGameDetailFragment baseGameDetailFragment, GamedetialModleFourBean gamedetialModleFourBean) {
        this.f42669a = gamedetialModleFourBean;
        this.f42672d = context;
        this.f42676h = v(context);
        this.f42671c = baseGameDetailFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(View view) {
        DetialMoreServiceListActivity_.r0(this.f42672d).a(this.f42669a.getCrc_sign_id()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(View view) {
        Intent intent = new Intent(this.f42672d, NoticeListActivity.class);
        intent.putExtra("gameId", this.f42669a.getCrc_sign_id());
        this.f42672d.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(View view) {
        com.papa.sim.statistic.p.l(view.getContext()).F("jinshouzhi", AccountUtil_.getInstance_(view.getContext()).getUid());
        r(view.getContext(), GameMainActivity4.I2);
    }

    private void E(View view, d1 d1Var, boolean z4, int i4) {
        View view2;
        int i5;
        boolean z5;
        int i6;
        String str = d1Var.f42736a;
        int i7 = d1Var.f42740e;
        boolean z6 = d1Var.f42741f;
        InformationCommentBean informationCommentBean = d1Var.f42737b;
        List<InformationCommentBean.Sub> sub = informationCommentBean.getSub();
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.removeAllViews();
        int size = sub.size();
        int i8 = 0;
        int i9 = 0;
        while (i9 < size + 1) {
            if (i9 <= 3 || !z4) {
                View inflate = LayoutInflater.from(this.f42672d).inflate(R.layout.comment_reply_item, (ViewGroup) null);
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
                        view2.setOnClickListener(new o0(size, informationCommentBean, str, i4));
                    } else if (i6 < size && (i6 < 3 || !z4)) {
                        textView.setVisibility(0);
                        textView2.setVisibility(8);
                        InformationCommentBean.Sub sub2 = sub.get(i6);
                        String content = sub2.getContent();
                        sub2.getComment_id();
                        try {
                            textView.setText(Html.fromHtml(content));
                            K(view2, sub2);
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
                    view2.setOnClickListener(new n0(i10, i4, str, d1Var));
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

    private void K(View view, InformationCommentBean.Sub sub) {
        view.setOnClickListener(new p0(sub));
    }

    private void L(View view, CommentBaseBean commentBaseBean) {
        view.setOnClickListener(new q0(commentBaseBean));
    }

    private void M(ImageView imageView, TextView textView, CommentBaseBean commentBaseBean, int i4) {
        s0 s0Var = new s0(commentBaseBean, i4, imageView, textView);
        imageView.setOnClickListener(s0Var);
        textView.setOnClickListener(s0Var);
    }

    private void N(View view, InformationCommentBean informationCommentBean) {
        view.setOnClickListener(new m0(informationCommentBean));
    }

    private void O(ImageView imageView, TextView textView, CommentBaseBean commentBaseBean, int i4) {
        t0 t0Var = new t0(commentBaseBean, i4, imageView, textView);
        imageView.setOnClickListener(t0Var);
        textView.setOnClickListener(t0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(View view) {
        Intent intent = new Intent(this.f42672d, CouponListActivity.class);
        intent.putExtra("gameId", this.f42669a.getCrc_sign_id());
        this.f42672d.startActivity(intent);
    }

    private CommentBaseBean t(int i4) {
        return (CommentBaseBean) this.f42682n.get(i4).f42719a;
    }

    public static String y(Context context) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(BTActivityBean bTActivityBean, View view) {
        IntentUtil.getInstance().goShareWebActivity(this.f42672d, bTActivityBean.getJump_url());
    }

    public void D(List<GameDetailOneTouchSkill> list) {
        this.f42685q.clear();
        this.f42679k = 0;
        this.f42678j = 0;
        if (list == null) {
            this.f42686r.notifyDataSetChanged();
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            View inflate = LayoutInflater.from(this.f42672d).inflate(R.layout.gamedetail_item_one_touch_skill_item, (ViewGroup) null);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.list);
            GameDetailOneTouchSkill gameDetailOneTouchSkill = list.get(i4);
            ((TextView) inflate.findViewById(R.id.name)).setText(gameDetailOneTouchSkill.getName());
            if (gameDetailOneTouchSkill.getSkill() != null) {
                for (int i5 = 0; i5 < gameDetailOneTouchSkill.getSkill().size() && i5 != 5; i5++) {
                    View inflate2 = LayoutInflater.from(this.f42672d).inflate(R.layout.gamedetail_item_one_touch_skill_list_item, (ViewGroup) linearLayout, false);
                    linearLayout.addView(inflate2);
                    ((TextView) inflate2.findViewById(R.id.name)).setText(gameDetailOneTouchSkill.getSkill().get(i5));
                }
            }
            this.f42685q.add(inflate);
        }
        this.f42686r.notifyDataSetChanged();
    }

    public void F(int i4, int i5) {
        CommentBaseBean t4 = t(i4);
        long longValue = Long.valueOf(t4.getDespise_count()).longValue();
        if (t4.getIs_despise() == 1) {
            t4.setIs_despise(0);
            long j4 = longValue - 1;
            if (j4 < 0) {
                t4.setDespise_count("0");
            } else {
                t4.setDespise_count(j4 + "");
            }
        } else if (i5 != 1) {
            t4.setIs_despise(1);
            t4.setDespise_count((longValue + 1) + "");
        }
        notifyDataSetChanged();
    }

    public void G(int i4, int i5) {
        CommentBaseBean t4 = t(i4);
        long praise_count = t4.getPraise_count();
        if (t4.getIs_praise() == 1) {
            t4.setIs_praise(0);
            long j4 = praise_count - 1;
            if (j4 < 0) {
                t4.setPraise_count(0L);
            } else {
                t4.setPraise_count(j4);
            }
        } else if (i5 != 1) {
            t4.setIs_praise(1);
            t4.setPraise_count(praise_count + 1);
        }
        notifyDataSetChanged();
    }

    void H(b1 b1Var, boolean z4) {
        if (b1Var == null) {
            return;
        }
        try {
            ((d1) b1Var.f42719a).f42742g = z4;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void I(GamedetialModleFourBean gamedetialModleFourBean) {
        this.f42669a = gamedetialModleFourBean;
    }

    public void J(c1 c1Var) {
        this.f42674f = c1Var;
    }

    public void P(List<View> list) {
        this.f42685q = list;
    }

    public void Q(int i4) {
        this.f42681m = i4;
    }

    void R() {
        ShareBean shareBean = new ShareBean();
        String share_url = this.f42669a.getShare_url();
        shareBean.setqZoneShareUrl(share_url);
        shareBean.setQqUrl(share_url);
        shareBean.setWechatFriendUrl(share_url);
        shareBean.setWechatShareUrl(share_url);
        shareBean.setWeiboShareUrl(share_url);
        shareBean.setTitle(this.f42669a.getGame_name());
        shareBean.setText(this.f42669a.getInfo());
        shareBean.setImageUrl(this.f42669a.getIco_remote());
        shareBean.setFrom(2);
        shareBean.setGameId(this.f42669a.getGame_id());
        if (this.f42669a.getShare_config() != null && this.f42669a.getShare_config().getShare_switch() == 1) {
            shareBean.setIntentData(this.f42669a.getShare_config().getJump_info());
        }
        com.join.mgps.Util.s.r(this.f42672d, shareBean);
    }

    void S(Context context, String str) {
        try {
            Toast makeText = Toast.makeText(context, "", 0);
            makeText.setText(str);
            makeText.setDuration(0);
            makeText.show();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void T(int i4) {
        CommentBaseBean t4 = t(i4);
        long longValue = Long.valueOf(t4.getDespise_count()).longValue();
        t4.setIs_despise(0);
        long j4 = longValue - 1;
        if (j4 < 0) {
            t4.setDespise_count("0");
        } else {
            t4.setDespise_count(j4 + "");
        }
        notifyDataSetChanged();
    }

    public void U(int i4) {
        CommentBaseBean t4 = t(i4);
        long praise_count = t4.getPraise_count();
        t4.setIs_praise(0);
        long j4 = praise_count - 1;
        if (j4 < 0) {
            t4.setPraise_count(0L);
        } else {
            t4.setPraise_count(j4);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f42682n.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i4) {
        return this.f42682n.get(i4).f42720b;
    }

    public void n(int i4) {
        CommentBaseBean t4 = t(i4);
        long longValue = Long.valueOf(t4.getDespise_count()).longValue();
        t4.setIs_despise(1);
        t4.setDespise_count((longValue + 1) + "");
        notifyDataSetChanged();
    }

    public void o(int i4) {
        CommentBaseBean t4 = t(i4);
        long praise_count = t4.getPraise_count();
        t4.setIs_praise(1);
        t4.setPraise_count(praise_count + 1);
        notifyDataSetChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x063b A[Catch: Exception -> 0x0704, TryCatch #7 {Exception -> 0x0704, blocks: (B:93:0x041d, B:95:0x0441, B:96:0x0455, B:98:0x045b, B:99:0x046f, B:101:0x049a, B:103:0x04a9, B:105:0x04bd, B:107:0x04c3, B:109:0x04c9, B:112:0x0501, B:114:0x0505, B:116:0x0522, B:118:0x0533, B:120:0x0539, B:123:0x0544, B:125:0x055e, B:127:0x05d6, B:129:0x05e7, B:131:0x05ef, B:134:0x05fc, B:136:0x062e, B:138:0x063b, B:140:0x0650, B:142:0x065f, B:144:0x0669, B:146:0x0678, B:148:0x0689, B:150:0x069e, B:152:0x06a4, B:154:0x06b9, B:153:0x06af, B:149:0x0694, B:145:0x0671, B:141:0x0658, B:135:0x0627, B:124:0x0557, B:115:0x0517, B:110:0x04f2, B:111:0x04fa, B:102:0x04a2), top: B:471:0x041d }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0669 A[Catch: Exception -> 0x0704, TryCatch #7 {Exception -> 0x0704, blocks: (B:93:0x041d, B:95:0x0441, B:96:0x0455, B:98:0x045b, B:99:0x046f, B:101:0x049a, B:103:0x04a9, B:105:0x04bd, B:107:0x04c3, B:109:0x04c9, B:112:0x0501, B:114:0x0505, B:116:0x0522, B:118:0x0533, B:120:0x0539, B:123:0x0544, B:125:0x055e, B:127:0x05d6, B:129:0x05e7, B:131:0x05ef, B:134:0x05fc, B:136:0x062e, B:138:0x063b, B:140:0x0650, B:142:0x065f, B:144:0x0669, B:146:0x0678, B:148:0x0689, B:150:0x069e, B:152:0x06a4, B:154:0x06b9, B:153:0x06af, B:149:0x0694, B:145:0x0671, B:141:0x0658, B:135:0x0627, B:124:0x0557, B:115:0x0517, B:110:0x04f2, B:111:0x04fa, B:102:0x04a2), top: B:471:0x041d }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0671 A[Catch: Exception -> 0x0704, TryCatch #7 {Exception -> 0x0704, blocks: (B:93:0x041d, B:95:0x0441, B:96:0x0455, B:98:0x045b, B:99:0x046f, B:101:0x049a, B:103:0x04a9, B:105:0x04bd, B:107:0x04c3, B:109:0x04c9, B:112:0x0501, B:114:0x0505, B:116:0x0522, B:118:0x0533, B:120:0x0539, B:123:0x0544, B:125:0x055e, B:127:0x05d6, B:129:0x05e7, B:131:0x05ef, B:134:0x05fc, B:136:0x062e, B:138:0x063b, B:140:0x0650, B:142:0x065f, B:144:0x0669, B:146:0x0678, B:148:0x0689, B:150:0x069e, B:152:0x06a4, B:154:0x06b9, B:153:0x06af, B:149:0x0694, B:145:0x0671, B:141:0x0658, B:135:0x0627, B:124:0x0557, B:115:0x0517, B:110:0x04f2, B:111:0x04fa, B:102:0x04a2), top: B:471:0x041d }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0689 A[Catch: Exception -> 0x0704, TryCatch #7 {Exception -> 0x0704, blocks: (B:93:0x041d, B:95:0x0441, B:96:0x0455, B:98:0x045b, B:99:0x046f, B:101:0x049a, B:103:0x04a9, B:105:0x04bd, B:107:0x04c3, B:109:0x04c9, B:112:0x0501, B:114:0x0505, B:116:0x0522, B:118:0x0533, B:120:0x0539, B:123:0x0544, B:125:0x055e, B:127:0x05d6, B:129:0x05e7, B:131:0x05ef, B:134:0x05fc, B:136:0x062e, B:138:0x063b, B:140:0x0650, B:142:0x065f, B:144:0x0669, B:146:0x0678, B:148:0x0689, B:150:0x069e, B:152:0x06a4, B:154:0x06b9, B:153:0x06af, B:149:0x0694, B:145:0x0671, B:141:0x0658, B:135:0x0627, B:124:0x0557, B:115:0x0517, B:110:0x04f2, B:111:0x04fa, B:102:0x04a2), top: B:471:0x041d }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0694 A[Catch: Exception -> 0x0704, TryCatch #7 {Exception -> 0x0704, blocks: (B:93:0x041d, B:95:0x0441, B:96:0x0455, B:98:0x045b, B:99:0x046f, B:101:0x049a, B:103:0x04a9, B:105:0x04bd, B:107:0x04c3, B:109:0x04c9, B:112:0x0501, B:114:0x0505, B:116:0x0522, B:118:0x0533, B:120:0x0539, B:123:0x0544, B:125:0x055e, B:127:0x05d6, B:129:0x05e7, B:131:0x05ef, B:134:0x05fc, B:136:0x062e, B:138:0x063b, B:140:0x0650, B:142:0x065f, B:144:0x0669, B:146:0x0678, B:148:0x0689, B:150:0x069e, B:152:0x06a4, B:154:0x06b9, B:153:0x06af, B:149:0x0694, B:145:0x0671, B:141:0x0658, B:135:0x0627, B:124:0x0557, B:115:0x0517, B:110:0x04f2, B:111:0x04fa, B:102:0x04a2), top: B:471:0x041d }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06a4 A[Catch: Exception -> 0x0704, TryCatch #7 {Exception -> 0x0704, blocks: (B:93:0x041d, B:95:0x0441, B:96:0x0455, B:98:0x045b, B:99:0x046f, B:101:0x049a, B:103:0x04a9, B:105:0x04bd, B:107:0x04c3, B:109:0x04c9, B:112:0x0501, B:114:0x0505, B:116:0x0522, B:118:0x0533, B:120:0x0539, B:123:0x0544, B:125:0x055e, B:127:0x05d6, B:129:0x05e7, B:131:0x05ef, B:134:0x05fc, B:136:0x062e, B:138:0x063b, B:140:0x0650, B:142:0x065f, B:144:0x0669, B:146:0x0678, B:148:0x0689, B:150:0x069e, B:152:0x06a4, B:154:0x06b9, B:153:0x06af, B:149:0x0694, B:145:0x0671, B:141:0x0658, B:135:0x0627, B:124:0x0557, B:115:0x0517, B:110:0x04f2, B:111:0x04fa, B:102:0x04a2), top: B:471:0x041d }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06af A[Catch: Exception -> 0x0704, TryCatch #7 {Exception -> 0x0704, blocks: (B:93:0x041d, B:95:0x0441, B:96:0x0455, B:98:0x045b, B:99:0x046f, B:101:0x049a, B:103:0x04a9, B:105:0x04bd, B:107:0x04c3, B:109:0x04c9, B:112:0x0501, B:114:0x0505, B:116:0x0522, B:118:0x0533, B:120:0x0539, B:123:0x0544, B:125:0x055e, B:127:0x05d6, B:129:0x05e7, B:131:0x05ef, B:134:0x05fc, B:136:0x062e, B:138:0x063b, B:140:0x0650, B:142:0x065f, B:144:0x0669, B:146:0x0678, B:148:0x0689, B:150:0x069e, B:152:0x06a4, B:154:0x06b9, B:153:0x06af, B:149:0x0694, B:145:0x0671, B:141:0x0658, B:135:0x0627, B:124:0x0557, B:115:0x0517, B:110:0x04f2, B:111:0x04fa, B:102:0x04a2), top: B:471:0x041d }] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r17, int r18) {
        /*
            Method dump skipped, instructions count: 5150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.adapter.GameDetialModleThreeAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
        switch (i4) {
            case 1:
                return new e2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_title, viewGroup, false));
            case 2:
                return new u1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_iconlayout, viewGroup, false));
            case 3:
                return new b2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_subscribe, viewGroup, false));
            case 4:
                return new d2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_tipslayout, viewGroup, false));
            case 5:
                return new g2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_viewpage, viewGroup, false));
            case 6:
                return new v1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_gamenotice, viewGroup, false));
            case 7:
                return new w1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_recommend, viewGroup, false));
            case 8:
                return new r1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_describ, viewGroup, false));
            case 9:
                return new t1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_gifts, viewGroup, false));
            case 10:
                return new j1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_auxiliarytool, viewGroup, false));
            case 11:
                return new y1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_updateinfo, viewGroup, false));
            case 12:
                return new s1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_gamedetialsimple, viewGroup, false));
            case 13:
                return new n1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_record_header, viewGroup, false));
            case 14:
                return new l1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_comment_item_layout, viewGroup, false));
            case 15:
                return new o1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_comment_message_reply, viewGroup, false));
            case 16:
                return new m1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_commit_footer, viewGroup, false));
            case 17:
                return new a2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_gamerecommendlist, viewGroup, false));
            case 18:
                return new k1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_bottom_empty, viewGroup, false));
            case 19:
                return new f2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_video, viewGroup, false));
            case 20:
                return new p1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_down_and_down, viewGroup, false));
            case 21:
                return new q1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_factory_recommend, viewGroup, false));
            case 22:
                return new c2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_supply_a_gap, viewGroup, false));
            case 23:
                return new z1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detial_hand_shark_item, viewGroup, false));
            case 24:
                return new m2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetial_qq_item, viewGroup, false));
            case 25:
                return new a1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.comment_list_item_view, viewGroup, false));
            case 26:
                return new j2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetial_none_comment_layout, viewGroup, false));
            case 27:
                return new g1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetial_comment_game_layout, viewGroup, false));
            case 28:
                return new g2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_viewpagenew, viewGroup, false));
            case 29:
                return new i1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detial_favortis_layout, viewGroup, false));
            case 30:
                return new i2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detial_golden_finger_layout, viewGroup, false));
            case 31:
                return new f1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detial_cloud_archive_layout, viewGroup, false));
            case 32:
                return new l2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detial_one_touch_skill_layout, viewGroup, false));
            case 33:
                return new e1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detial_check_point_layout, viewGroup, false));
            case 34:
                return new x1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_updateinfo1, viewGroup, false));
            case 35:
                return new h2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detial_golden_finger1_layout, viewGroup, false));
            case 36:
                return new h1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetial_bt_coupon_item, viewGroup, false));
            case 37:
                return new n2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetial_bt_serviceinfo_item, viewGroup, false));
            case 38:
                return new k2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetial_bt_notice_item, viewGroup, false));
            default:
                return null;
        }
    }

    b1 p(String str, InformationCommentBean informationCommentBean, int i4, boolean z4) {
        return new b1(new d1(str, informationCommentBean, i4, z4), 15);
    }

    void q() {
        DownloadTask downloadtaskDown = this.f42669a.getDownloadtaskDown();
        UtilsMy.C1(downloadtaskDown, this.f42669a);
        if (UtilsMy.o1(this.f42672d, downloadtaskDown)) {
            return;
        }
        if (this.f42669a.getDown_status() == 5) {
            UtilsMy.l1(this.f42672d, downloadtaskDown);
        } else {
            UtilsMy.R0(this.f42672d, downloadtaskDown, this.f42669a.getTp_down_url(), this.f42669a.getOther_down_switch(), this.f42669a.getCdn_down_switch());
        }
    }

    void r(Context context, String str) {
        DownloadTask F = p1.f.K().F(this.f42669a.getGame_id());
        if (F != null && !TextUtils.isEmpty(str)) {
            if (F.getStatus() == 5) {
                S(context, context.getResources().getString(R.string.game_detail_down_status, str));
                return;
            } else if (F.getStatus() == 43 || F.getStatus() == 9 || F.getStatus() == 0) {
                q();
                return;
            } else {
                S(context, context.getResources().getString(R.string.game_detail_downing_status, str));
                return;
            }
        }
        q();
    }

    public View s() {
        return this.f42684p;
    }

    public List<View> u() {
        return this.f42685q;
    }

    public com.danikula.videocache.i v(Context context) {
        return MApplication.m(context);
    }

    public int w() {
        return this.f42681m;
    }

    public List<b1> x() {
        return this.f42682n;
    }
}
