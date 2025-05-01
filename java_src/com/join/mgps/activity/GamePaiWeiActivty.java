package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.google.gson.JsonObject;
import com.join.android.app.common.http.d;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.GamePaiWeiAdapter;
import com.join.mgps.adapter.t4;
import com.join.mgps.customview.AutoScrollViewPager;
import com.join.mgps.db.tables.GamePaiWeiUpTaskTable;
import com.join.mgps.dialog.b;
import com.join.mgps.dialog.f2;
import com.join.mgps.dialog.z1;
import com.join.mgps.dto.Constant;
import com.join.mgps.dto.GetPaiWeiPlayCodeBean;
import com.join.mgps.dto.PaiWeiUploadFileBean;
import com.join.mgps.dto.PaiWeiUploadFileNewBean;
import com.join.mgps.dto.ResultResMainBean;
import com.join.mgps.pref.PrefDef_;
import com.papa91.arc.bean.PaiWeiDataBean;
import com.papa91.arc.common.constants.BAction;
import com.papa91.arc.common.constants.IntentKeys;
import com.papa91.arc.util.SDCardUtil;
import com.papa91.arc.util.SignUtils;
import com.umeng.analytics.MobclickAgent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import okhttp3.Request;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activty_game_paiwei)
/* loaded from: classes4.dex */
public class GamePaiWeiActivty extends Activity implements GamePaiWeiAdapter.b {
    @Extra
    String A;
    @Extra
    int B;
    @Extra
    int C;
    int D;
    int E;
    int F;
    private DownloadTask N;
    private t4 O;
    PrefDef_ T;
    RankRecordReceiver U;
    com.join.mgps.dialog.z1 V;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f32679b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f32680c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ImageView f32681d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ImageView f32682e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Button f32683f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f32684g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f32685h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f32686i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f32687j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f32688k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f32689l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f32690m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    TextView f32691n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    ListView f32692o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    ListView f32693p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    RelativeLayout f32696q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    AutoScrollViewPager<PaiWeiDataBean.AdListBean> f32697r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    SimpleDraweeView f32698s;

    /* renamed from: t  reason: collision with root package name */
    private Context f32699t;

    /* renamed from: u  reason: collision with root package name */
    private GamePaiWeiAdapter f32700u;

    /* renamed from: v  reason: collision with root package name */
    private List<GamePaiWeiAdapter.d> f32701v;

    /* renamed from: x  reason: collision with root package name */
    com.join.mgps.rpc.l f32704x;

    /* renamed from: y  reason: collision with root package name */
    com.join.mgps.rpc.l f32705y;
    @Bean

    /* renamed from: z  reason: collision with root package name */
    com.join.mgps.Util.b f32706z;

    /* renamed from: w  reason: collision with root package name */
    private String f32703w = "币";
    private com.join.mgps.dialog.d1 G = null;
    private String H = "";
    private String I = "";
    private String J = "";
    private String K = "";
    private String L = "";
    private String M = "";
    private int P = 0;
    private final String Q = com.join.mgps.rpc.h.f54062l + "/lobby/game_rank/fileUpload";
    private final String R = com.join.mgps.rpc.h.f54065m + "/v2/game/ranking/submitUpload";
    private final String S = com.join.mgps.rpc.h.f54065m + "/v2/game/ranking/addPlayTimes";
    private List<GamePaiWeiUpTaskTable> W = null;
    private int X = 0;
    private int Y = 1;
    long Z = 0;

    /* renamed from: p0  reason: collision with root package name */
    private GamePaiWeiUpTaskTable f32694p0 = null;

    /* renamed from: p1  reason: collision with root package name */
    private List<PaiWeiDataBean.RankListBean> f32695p1 = new ArrayList();

    /* renamed from: v1  reason: collision with root package name */
    private List<PaiWeiDataBean.RankListBean> f32702v1 = new ArrayList();
    private List<PaiWeiDataBean.RolesBean> A1 = new ArrayList();
    private List<PaiWeiDataBean.RolesBean> B1 = new ArrayList();
    private List<PaiWeiDataBean.AdListBean> C1 = new ArrayList();

    /* loaded from: classes4.dex */
    public class RankRecordReceiver extends BroadcastReceiver {
        public RankRecordReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (BAction.ACTION_RANK_RECORD_UPLOAD.equals(intent.getAction())) {
                GamePaiWeiActivty.this.D = intent.getIntExtra(IntentKeys.KEY_PARAMS_RANK_COIN, 1);
                GamePaiWeiActivty.this.F = intent.getIntExtra(IntentKeys.KEY_PARAMS_RANK_PLAY_TIME, 1);
                GamePaiWeiActivty.this.E = intent.getIntExtra(IntentKeys.KEY_PARAMS_RANK_ROLE_ID, 0);
                GamePaiWeiActivty.this.P();
                GamePaiWeiActivty.this.H(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements AutoScrollViewPager.e {
        a() {
        }

        @Override // com.join.mgps.customview.AutoScrollViewPager.e
        public View a(int i4) {
            GamePaiWeiActivty gamePaiWeiActivty = GamePaiWeiActivty.this;
            return gamePaiWeiActivty.x(gamePaiWeiActivty.C1, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements f2.b {
        b() {
        }

        @Override // com.join.mgps.dialog.f2.b
        public void a(boolean z4) {
            GamePaiWeiActivty.this.T.rankNotify().g(Boolean.valueOf(!z4));
        }

        @Override // com.join.mgps.dialog.f2.b
        public void onClose() {
        }

        @Override // com.join.mgps.dialog.f2.b
        public void onConfirm() {
            GamePaiWeiActivty.this.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends d.p<String> {
        c() {
        }

        @Override // com.join.android.app.common.http.d.p
        public void d(Request request, Exception exc) {
            exc.printStackTrace();
        }

        @Override // com.join.android.app.common.http.d.p
        /* renamed from: f */
        public void e(String str) {
        }
    }

    /* loaded from: classes4.dex */
    class d extends d.p<String> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PaiWeiDataBean.RankListBean f32711b;

        d(PaiWeiDataBean.RankListBean rankListBean) {
            this.f32711b = rankListBean;
        }

        @Override // com.join.android.app.common.http.d.p
        public void d(Request request, Exception exc) {
            Toast.makeText(GamePaiWeiActivty.this.f32699t, "回放失败！", 0).show();
            GamePaiWeiActivty.this.s();
        }

        @Override // com.join.android.app.common.http.d.p
        /* renamed from: f */
        public void e(String str) {
            GamePaiWeiActivty.this.N(str);
            PaiWeiDataBean.RankListBean rankListBean = this.f32711b;
            if (rankListBean != null) {
                GamePaiWeiActivty gamePaiWeiActivty = GamePaiWeiActivty.this;
                if (gamePaiWeiActivty.C == 14) {
                    gamePaiWeiActivty.o(rankListBean.getPlay_id());
                }
            }
            GamePaiWeiActivty.this.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements b.c {
        e() {
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickCancleButn(com.join.mgps.dialog.b bVar) {
            bVar.dismiss();
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickOKButn(com.join.mgps.dialog.b bVar) {
            bVar.dismiss();
            GamePaiWeiActivty.this.X = 0;
            GamePaiWeiActivty.this.Y = 1;
            GamePaiWeiActivty.this.G.b();
            GamePaiWeiActivty.this.R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements z1.b {
        f() {
        }

        @Override // com.join.mgps.dialog.z1.b
        public void a(com.join.mgps.dialog.z1 z1Var) {
            z1Var.dismiss();
        }

        @Override // com.join.mgps.dialog.z1.b
        public void b(com.join.mgps.dialog.z1 z1Var) {
            z1Var.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends d.p<String> {
        g() {
        }

        @Override // com.join.android.app.common.http.d.p
        public void d(Request request, Exception exc) {
            exc.printStackTrace();
            GamePaiWeiActivty.this.y(false);
        }

        @Override // com.join.android.app.common.http.d.p
        /* renamed from: f */
        public void e(String str) {
            GamePaiWeiActivty.this.y(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h extends d.p<String> {
        h() {
        }

        @Override // com.join.android.app.common.http.d.p
        public void d(Request request, Exception exc) {
            exc.printStackTrace();
            GamePaiWeiActivty.this.y(false);
        }

        @Override // com.join.android.app.common.http.d.p
        /* renamed from: f */
        public void e(String str) {
            GamePaiWeiActivty.this.y(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i extends d.p<String> {
        i() {
        }

        @Override // com.join.android.app.common.http.d.p
        public void d(Request request, Exception exc) {
            exc.printStackTrace();
            GamePaiWeiActivty.this.O(exc.getMessage());
        }

        @Override // com.join.android.app.common.http.d.p
        /* renamed from: f */
        public void e(String str) {
            GamePaiWeiActivty.this.T((PaiWeiUploadFileNewBean) JsonMapper.getInstance().fromJson(str, PaiWeiUploadFileNewBean.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j extends d.p<String> {
        j() {
        }

        @Override // com.join.android.app.common.http.d.p
        public void d(Request request, Exception exc) {
            exc.printStackTrace();
            GamePaiWeiActivty.this.O(exc.getMessage());
        }

        @Override // com.join.android.app.common.http.d.p
        /* renamed from: f */
        public void e(String str) {
            GamePaiWeiActivty.this.S((PaiWeiUploadFileBean) JsonMapper.getInstance().fromJson(str, PaiWeiUploadFileBean.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements AdapterView.OnItemClickListener {
        k() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            GamePaiWeiActivty.this.O.a(i4);
            GamePaiWeiActivty gamePaiWeiActivty = GamePaiWeiActivty.this;
            gamePaiWeiActivty.f32691n.setText(((PaiWeiDataBean.RolesBean) gamePaiWeiActivty.A1.get(i4)).getRole());
            GamePaiWeiActivty gamePaiWeiActivty2 = GamePaiWeiActivty.this;
            gamePaiWeiActivty2.q((PaiWeiDataBean.RolesBean) gamePaiWeiActivty2.A1.get(i4));
            GamePaiWeiActivty.this.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GamePaiWeiActivty.this.C1 == null || GamePaiWeiActivty.this.C1.size() <= 0) {
                return;
            }
            GamePaiWeiActivty gamePaiWeiActivty = GamePaiWeiActivty.this;
            IntentUtil.getInstance().intentActivity(GamePaiWeiActivty.this.f32699t, gamePaiWeiActivty.u((PaiWeiDataBean.AdListBean) gamePaiWeiActivty.C1.get(0)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements AutoScrollViewPager.f {
        m() {
        }

        @Override // com.join.mgps.customview.AutoScrollViewPager.f
        public void a(View view, int i4) {
            if (GamePaiWeiActivty.this.C1 == null || GamePaiWeiActivty.this.C1.size() <= 0) {
                return;
            }
            GamePaiWeiActivty gamePaiWeiActivty = GamePaiWeiActivty.this;
            IntentUtil.getInstance().intentActivity(GamePaiWeiActivty.this.f32699t, gamePaiWeiActivty.u((PaiWeiDataBean.AdListBean) gamePaiWeiActivty.C1.get(i4)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        this.G.b();
        w();
    }

    private void F(boolean z4) {
        if (this.f32694p0 == null) {
            if (this.C == 14) {
                this.f32694p0 = new GamePaiWeiUpTaskTable(this.f32706z.getUid(), this.H, this.A, this.B, this.I, z4, System.currentTimeMillis(), this.D, this.E, this.C, this.F);
            } else {
                this.f32694p0 = new GamePaiWeiUpTaskTable(this.f32706z.getUid(), this.H, this.A, this.B, this.I, z4, System.currentTimeMillis());
            }
        } else {
            this.f32694p0 = b2.v.n().g(Integer.valueOf(this.f32694p0.getId()));
        }
        b2.v.n().m(this.f32694p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(int i4) {
        Intent intent = new Intent(BAction.ACTION_RANK_RECORD_UPLOAD_RESULT);
        intent.putExtra(IntentKeys.KEY_PARAMS_RANK_UPLOAD, i4);
        sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        if (System.currentTimeMillis() - this.Z < 2000) {
            return;
        }
        this.Z = System.currentTimeMillis();
        String str = this.L + this.J + ".rec";
        boolean x4 = com.join.mgps.Util.h0.x(str);
        if (!x4) {
            str = this.L + this.J + "_v2.rec";
            x4 = com.join.mgps.Util.h0.x(str);
        }
        if (!x4) {
            str = this.L + this.J + "_v3.rec";
            x4 = com.join.mgps.Util.h0.x(str);
        }
        if (x4) {
            this.I = str;
            File file = new File(str);
            String substring = str.substring(str.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1);
            if (!com.join.android.app.common.utils.j.j(this)) {
                F(false);
                Toast.makeText(this.f32699t, "网络异常，无法上传排位数据！", 0).show();
                U();
                return;
            }
            this.G.b();
            Q(file, substring);
            return;
        }
        String str2 = this.J;
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        this.J = "";
        this.H = "";
        this.I = "";
        Toast.makeText(this.f32699t, "挑战失败！", 0).show();
    }

    private void U() {
        if (this.V == null) {
            com.join.mgps.dialog.z1 i4 = new com.join.mgps.dialog.z1(this.f32699t, R.style.HKDialogLoading).g("网络不佳，上传失败。联网后再次进入此页面，可重新上传此排位赛记录").j("我知道了").k("提示").i(new f());
            this.V = i4;
            i4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.join.mgps.activity.g0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    GamePaiWeiActivty.this.z(dialogInterface);
                }
            });
        }
        this.V.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(PaiWeiDataBean.RolesBean rolesBean) {
        this.f32701v.clear();
        int i4 = 0;
        if (!rolesBean.getRole_id().equals("-1")) {
            this.f32702v1.clear();
            for (int i5 = 0; i5 < this.f32695p1.size(); i5++) {
                if (this.f32695p1.get(i5).getRole_id().equals(rolesBean.getRole_id())) {
                    this.f32702v1.add(this.f32695p1.get(i5));
                }
            }
            while (true) {
                List<PaiWeiDataBean.RankListBean> list = this.f32702v1;
                if (list == null || i4 >= list.size()) {
                    break;
                }
                this.f32701v.add(new GamePaiWeiAdapter.d(GamePaiWeiAdapter.ViewType.RANK, new GamePaiWeiAdapter.d.a(this.f32702v1.get(i4))));
                i4++;
            }
        } else {
            while (true) {
                List<PaiWeiDataBean.RankListBean> list2 = this.f32695p1;
                if (list2 == null || i4 >= list2.size()) {
                    break;
                }
                this.f32701v.add(new GamePaiWeiAdapter.d(GamePaiWeiAdapter.ViewType.RANK, new GamePaiWeiAdapter.d.a(this.f32695p1.get(i4))));
                i4++;
            }
        }
        this.f32700u.notifyDataSetChanged();
    }

    private void r(boolean z4) {
        String str;
        List<GamePaiWeiUpTaskTable> p4 = b2.v.n().p(this.f32706z.getUid());
        this.W = p4;
        if (p4 == null || p4.size() <= 0) {
            return;
        }
        if (z4) {
            str = "你有" + this.W.size() + "个排位成绩未上传!";
        } else {
            str = "上传失败，你还有" + this.W.size() + "个历史排位成绩未上传!";
        }
        new com.join.mgps.dialog.b(this.f32699t, R.style.HKDialogLoading).g(str).j("立即上传").d("下次再说").k("提示").i(new e()).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SimpleDraweeView x(List<PaiWeiDataBean.AdListBean> list, int i4) {
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(this.f32699t);
        simpleDraweeView.setScaleType(ImageView.ScaleType.FIT_XY);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.s(0.0f);
        MyImageLoader.f(simpleDraweeView, R.drawable.iv_default_newarena_banner, list.get(i4).getPic_remote(), roundingParams);
        return simpleDraweeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(DialogInterface dialogInterface) {
        this.V = null;
    }

    public long A(byte[] bArr, int i4, boolean z4) {
        if (i4 < 0 || i4 + 8 > bArr.length) {
            throw new IllegalArgumentException(String.format("less than 8 bytes from index %d  is insufficient for long", Integer.valueOf(i4)));
        }
        long j4 = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            int i6 = (z4 ? i5 : 7 - i5) << 3;
            j4 |= (255 << i6) & (bArr[i4 + i5] << i6);
        }
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void C() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void D() {
        new com.join.mgps.dialog.v1(this.f32699t, R.style.HKDialogLoading).show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void E() {
        MobclickAgent.onEvent(this.f32699t, "onStartQualifying");
        if (IntentUtil.getInstance().isLogined(this.f32699t) && !IntentUtil.getInstance().isTourist(this.f32699t)) {
            if (this.C == 14) {
                if (this.T.rankNotify().d().booleanValue()) {
                    com.join.mgps.dialog.f2 f2Var = new com.join.mgps.dialog.f2(this);
                    f2Var.u(new b());
                    f2Var.w("系统提示");
                    f2Var.show();
                    return;
                }
                B();
                return;
            }
            B();
            return;
        }
        this.J = "";
        this.H = "";
        this.I = "";
        IntentUtil.getInstance().goLoginBattle(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void G() {
        if (this.f32692o.getVisibility() == 0) {
            this.f32692o.setVisibility(8);
            this.f32681d.setImageResource(R.drawable.rank_down_ic);
            return;
        }
        this.f32692o.setVisibility(0);
        this.f32681d.setImageResource(R.drawable.rank_up_ic);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void I(List<PaiWeiDataBean.AdListBean> list) {
        if (list != null) {
            this.C1.clear();
            this.C1.addAll(list);
            if (this.C1.size() == 1) {
                this.f32698s.setVisibility(0);
                this.f32697r.setVisibility(8);
                String pic_remote = this.C1.get(0).getPic_remote();
                if (com.join.mgps.Util.g2.i(pic_remote)) {
                    RoundingParams roundingParams = new RoundingParams();
                    roundingParams.s(0.0f);
                    MyImageLoader.f(this.f32698s, R.drawable.iv_default_newarena_banner, pic_remote, roundingParams);
                }
                this.f32698s.setOnClickListener(new l());
            } else if (list.size() > 0) {
                this.f32698s.setVisibility(8);
                this.f32697r.setVisibility(0);
                this.f32697r.setLoopTime(4000);
                this.f32697r.setOnItemClickListener(new m());
                this.f32697r.setOnCreateItemViewListener(new a());
                this.f32697r.l(com.join.mgps.Util.c0.a(this.f32699t, 0.0f), com.join.mgps.Util.c0.a(this.f32699t, 0.0f), this.C1);
                this.f32697r.m();
                if (list.size() <= 1) {
                    this.f32697r.n();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void J(PaiWeiDataBean.MonthBestBean monthBestBean) {
        if (monthBestBean != null && monthBestBean.getRole() != null) {
            this.f32688k.setVisibility(0);
            this.f32689l.setVisibility(0);
            this.f32684g.setText(monthBestBean.getUse_time());
            TextView textView = this.f32685h;
            textView.setText(monthBestBean.getRank() + "");
            if (!monthBestBean.getRole().isEmpty()) {
                this.f32686i.setText(monthBestBean.getRole());
            } else {
                this.f32686i.setText("暂无数据");
            }
            if (this.f32703w.contains("命")) {
                TextView textView2 = this.f32690m;
                textView2.setText(monthBestBean.getCost_coin() + " 命");
                return;
            }
            TextView textView3 = this.f32690m;
            textView3.setText(monthBestBean.getCost_coin() + " 币");
            return;
        }
        this.f32688k.setVisibility(8);
        this.f32689l.setVisibility(8);
        this.f32684g.setText("暂无数据");
        this.f32685h.setText("暂无数据");
        this.f32686i.setText("暂无数据");
        this.f32690m.setText("暂无数据");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void K() {
        List<PaiWeiDataBean.RankListBean> list = this.f32695p1;
        int i4 = 0;
        if (list != null && list.size() != 0) {
            this.f32687j.setVisibility(8);
            this.f32693p.setVisibility(0);
            this.f32701v.clear();
            while (true) {
                List<PaiWeiDataBean.RankListBean> list2 = this.f32695p1;
                if (list2 == null || i4 >= list2.size()) {
                    break;
                }
                this.f32701v.add(new GamePaiWeiAdapter.d(GamePaiWeiAdapter.ViewType.RANK, new GamePaiWeiAdapter.d.a(this.f32695p1.get(i4))));
                i4++;
            }
            this.f32700u.d(this.f32703w);
            this.f32700u.notifyDataSetChanged();
            return;
        }
        this.f32687j.setVisibility(0);
        this.f32693p.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void L() {
        List<PaiWeiDataBean.RolesBean> list = this.A1;
        if (list != null && list.size() > 0) {
            this.f32691n.setVisibility(0);
            this.f32681d.setVisibility(0);
            PaiWeiDataBean.RolesBean rolesBean = new PaiWeiDataBean.RolesBean();
            rolesBean.setRole("全部角色");
            rolesBean.setRole_id("-1");
            this.A1.add(0, rolesBean);
            if (this.O == null) {
                this.O = new t4(this.f32699t, this.A1);
            } else {
                this.f32700u.notifyDataSetChanged();
            }
            this.f32692o.setAdapter((ListAdapter) this.O);
            this.f32692o.setOnItemClickListener(new k());
            return;
        }
        this.f32691n.setVisibility(4);
        this.f32681d.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void M(String str) {
        UtilsMy.c4(this.f32699t, this.f32706z.getUid(), this.N, 14, this.J, this.B, this.P, JsonMapper.toJsonString(this.B1), this.C);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void N(String str) {
        UtilsMy.j4(this.f32699t, this.f32706z.getUid(), this.N, 15, str, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void O(String str) {
        F(false);
        s();
        Toast.makeText(this.f32699t, str, 0).show();
        r(false);
        this.J = "";
        this.H = "";
        this.I = "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Q(File file, String str) {
        if (this.C == 14) {
            HashMap hashMap = new HashMap();
            hashMap.put("costCoin", this.D + "");
            hashMap.put(TTDownloadField.TT_FILE_NAME, str);
            hashMap.put("gameId", this.A);
            hashMap.put("millisecond", this.F + "");
            hashMap.put("playId", this.H);
            hashMap.put("roleId", this.E + "");
            hashMap.put("uid", this.f32706z.getUid());
            hashMap.put("token", this.f32706z.getToken());
            d.q I = com.join.android.app.common.http.d.I();
            String str2 = this.R;
            I.f(str2, com.facebook.common.util.f.f10925c, file, new d.n[]{new d.n(TTDownloadField.TT_FILE_NAME, str), new d.n("costCoin", this.D + ""), new d.n("gameId", this.A), new d.n("millisecond", this.F + ""), new d.n("playId", this.H), new d.n("roleId", this.E + ""), new d.n("uid", this.f32706z.getUid()), new d.n("token", this.f32706z.getToken()), new d.n(Constant.MD5, SignUtils.buildRequestSign(hashMap))}, new i(), file.getName());
            return;
        }
        com.join.android.app.common.http.d.I().f(this.Q, com.facebook.common.util.f.f10925c, file, new d.n[]{new d.n("file_name", str)}, new j(), file.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void R() {
        String filePath = this.W.get(this.X).getFilePath();
        File file = new File(filePath);
        d.n nVar = new d.n(TTDownloadField.TT_FILE_NAME, filePath.substring(filePath.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1));
        GamePaiWeiUpTaskTable gamePaiWeiUpTaskTable = this.W.get(this.X);
        if (gamePaiWeiUpTaskTable != null) {
            this.C = gamePaiWeiUpTaskTable.getRank_auto_upload();
        }
        if (this.C != 14) {
            com.join.android.app.common.http.d.I().f(this.Q, com.facebook.common.util.f.f10925c, file, new d.n[]{nVar}, new h(), file.getName());
        } else if (gamePaiWeiUpTaskTable != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("costCoin", gamePaiWeiUpTaskTable.getCost_coin() + "");
            hashMap.put(TTDownloadField.TT_FILE_NAME, filePath.substring(filePath.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1));
            hashMap.put("gameId", gamePaiWeiUpTaskTable.getGameId());
            hashMap.put("millisecond", gamePaiWeiUpTaskTable.getRank_play_time() + "");
            hashMap.put("playId", gamePaiWeiUpTaskTable.getPlayId());
            hashMap.put("roleId", gamePaiWeiUpTaskTable.getRole_id() + "");
            hashMap.put("uid", gamePaiWeiUpTaskTable.getUserId());
            hashMap.put("token", this.f32706z.getToken());
            d.q I = com.join.android.app.common.http.d.I();
            String str = this.R;
            I.f(str, com.facebook.common.util.f.f10925c, file, new d.n[]{nVar, new d.n("costCoin", gamePaiWeiUpTaskTable.getCost_coin() + ""), new d.n("gameId", gamePaiWeiUpTaskTable.getGameId()), new d.n("millisecond", gamePaiWeiUpTaskTable.getRank_play_time() + ""), new d.n("playId", gamePaiWeiUpTaskTable.getPlayId()), new d.n("roleId", gamePaiWeiUpTaskTable.getRole_id() + ""), new d.n("uid", gamePaiWeiUpTaskTable.getUserId()), new d.n("token", this.f32706z.getToken()), new d.n(Constant.MD5, SignUtils.buildRequestSign(hashMap))}, new g(), file.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void S(PaiWeiUploadFileBean paiWeiUploadFileBean) {
        if (paiWeiUploadFileBean != null && "200".equals(paiWeiUploadFileBean.getData().getCode())) {
            Toast.makeText(this.f32699t, "数据更新成功！", 0).show();
            this.f32688k.setVisibility(0);
            this.f32689l.setVisibility(0);
            this.f32684g.setText(paiWeiUploadFileBean.getData().getInfo().getTime());
            this.f32685h.setText(paiWeiUploadFileBean.getData().getInfo().getCurrent_rank());
            this.f32686i.setText(paiWeiUploadFileBean.getData().getInfo().getRecplayer());
            if (this.f32703w.contains("命")) {
                TextView textView = this.f32690m;
                textView.setText(paiWeiUploadFileBean.getData().getInfo().getCoin() + " 命");
            } else {
                TextView textView2 = this.f32690m;
                textView2.setText(paiWeiUploadFileBean.getData().getInfo().getCoin() + " 币");
            }
            F(true);
            if (paiWeiUploadFileBean.getData().getInfo().getRefresh().equals("1")) {
                v("1");
            } else {
                s();
            }
        } else {
            s();
            F(false);
            r(false);
        }
        this.J = "";
        this.H = "";
        this.I = "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void T(PaiWeiUploadFileNewBean paiWeiUploadFileNewBean) {
        if (paiWeiUploadFileNewBean != null && paiWeiUploadFileNewBean.getCode() == 200) {
            Toast.makeText(this.f32699t, "数据更新成功！", 0).show();
            this.f32688k.setVisibility(0);
            this.f32689l.setVisibility(0);
            this.f32684g.setText(paiWeiUploadFileNewBean.getData().getTime());
            this.f32685h.setText(paiWeiUploadFileNewBean.getData().getCurrent_rank());
            this.f32686i.setText(paiWeiUploadFileNewBean.getData().getRecplayer());
            if (this.f32703w.contains("命")) {
                TextView textView = this.f32690m;
                textView.setText(paiWeiUploadFileNewBean.getData().getCoin() + " 命");
            } else {
                TextView textView2 = this.f32690m;
                textView2.setText(paiWeiUploadFileNewBean.getData().getCoin() + " 币");
            }
            F(true);
            if (paiWeiUploadFileNewBean.getData().getRefresh().equals("1")) {
                v("1");
            } else {
                s();
            }
        } else {
            s();
            F(false);
            r(false);
        }
        this.J = "";
        this.H = "";
        this.I = "";
    }

    @Override // com.join.mgps.adapter.GamePaiWeiAdapter.b
    public void a(int i4, String str) {
        if (str.isEmpty()) {
            Toast.makeText(this.f32699t, "回放失败！", 0).show();
            return;
        }
        String substring = str.substring(str.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1);
        File file = new File(this.L + substring);
        PaiWeiDataBean.RankListBean rankListBean = this.f32695p1.get(i4);
        if (file.exists()) {
            N(file.getPath());
            if (rankListBean == null || this.C != 14) {
                return;
            }
            o(rankListBean.getPlay_id());
            return;
        }
        this.G.b();
        com.join.android.app.common.http.d.B().a(str, this.L, new d(rankListBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o(String str) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("play_id", str);
        jsonObject.addProperty("token", this.f32706z.getToken());
        jsonObject.addProperty("uid", this.f32706z.getUid());
        jsonObject.addProperty(Constant.MD5, SignUtils.buildRequestSign(jsonObject));
        com.join.android.app.common.http.d.G().H().n(this.S, jsonObject.toString(), new c());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        RankRecordReceiver rankRecordReceiver = this.U;
        if (rankRecordReceiver != null) {
            unregisterReceiver(rankRecordReceiver);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if ("".equals(this.J)) {
            this.G.b();
            v("0");
            return;
        }
        P();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        AutoScrollViewPager<PaiWeiDataBean.AdListBean> autoScrollViewPager = this.f32697r;
        if (autoScrollViewPager != null) {
            autoScrollViewPager.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void p() {
        this.f32704x = com.join.mgps.rpc.impl.l.n0();
        this.f32705y = com.join.mgps.rpc.impl.l.o0();
        this.f32699t = this;
        this.f32701v = new ArrayList();
        this.G = com.join.mgps.Util.b0.f0(this.f32699t).x(this.f32699t);
        int width = ((getWindowManager().getDefaultDisplay().getWidth() * 58) / 100) - com.join.mgps.Util.c0.a(this.f32699t, 20.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, (width * 725) / 3344);
        layoutParams.leftMargin = com.join.mgps.Util.c0.a(this.f32699t, 10.0f);
        layoutParams.rightMargin = com.join.mgps.Util.c0.a(this.f32699t, 10.0f);
        layoutParams.topMargin = com.join.mgps.Util.c0.a(this.f32699t, 5.0f);
        layoutParams.gravity = 1;
        this.f32696q.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(width, (width * 44) / 335);
        layoutParams2.gravity = 1;
        this.f32683f.setLayoutParams(layoutParams2);
        DownloadTask F = p1.f.K().F(this.A);
        this.N = F;
        if (F != null && F.getStatus() == 5) {
            String gameZipPath = this.N.getGameZipPath();
            String substring = gameZipPath.substring(0, gameZipPath.lastIndexOf(net.lingala.zip4j.util.e.F0));
            this.K = substring;
            this.M = substring.substring(substring.lastIndexOf(net.lingala.zip4j.util.e.F0), this.K.length());
            String X1 = !"".equals(this.N.getRomType()) ? UtilsMy.X1(Integer.parseInt(this.N.getRomType())) : "arc";
            String externalStorageDirectory = SDCardUtil.getExternalStorageDirectory(this);
            this.L = externalStorageDirectory + "/papa91/" + X1 + this.M + net.lingala.zip4j.util.e.F0;
        } else {
            Toast.makeText(this.f32699t, "请先下载游戏！", 0).show();
        }
        GamePaiWeiAdapter gamePaiWeiAdapter = new GamePaiWeiAdapter(this.f32699t, this.f32701v, this);
        this.f32700u = gamePaiWeiAdapter;
        this.f32693p.setAdapter((ListAdapter) gamePaiWeiAdapter);
        this.T = new PrefDef_(this);
        r(true);
        IntentFilter intentFilter = new IntentFilter(BAction.ACTION_RANK_RECORD_UPLOAD);
        RankRecordReceiver rankRecordReceiver = new RankRecordReceiver();
        this.U = rankRecordReceiver;
        registerReceiver(rankRecordReceiver, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s() {
        try {
            com.join.mgps.dialog.d1 d1Var = this.G;
            if (d1Var == null || !d1Var.isShowing()) {
                return;
            }
            this.G.dismiss();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t() {
        Toast.makeText(this.f32699t, "网络错误，请稍候再试！", 0).show();
    }

    public IntentDateBean u(PaiWeiDataBean.AdListBean adListBean) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setJump_type(Integer.valueOf(adListBean.getJump_type()).intValue());
        intentDateBean.setLink_type(Integer.valueOf(adListBean.getLink_type()).intValue());
        intentDateBean.setLink_type_val(adListBean.getLink_type_val());
        if (Integer.valueOf(adListBean.getLink_type()).intValue() == 1) {
            intentDateBean.setTpl_type(String.valueOf(adListBean.getGame_info_tpl_type()));
        } else {
            intentDateBean.setTpl_type(String.valueOf(adListBean.getLink_type()));
        }
        intentDateBean.setCrc_link_type_val(adListBean.getCrc_link_type_val());
        if (com.join.mgps.Util.g2.i(adListBean.getTitle())) {
            intentDateBean.setObject(adListBean.getTitle());
        }
        return intentDateBean;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void v(String str) {
        ResultResMainBean<PaiWeiDataBean> n4;
        String uid = this.f32706z.getUid();
        String token = this.f32706z.getToken();
        try {
            try {
                if (this.C == 14) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("gameid", this.A);
                    hashMap.put("refresh", str);
                    hashMap.put("uid", uid);
                    hashMap.put("token", token);
                    n4 = this.f32705y.l(uid, token, this.A, str, SignUtils.buildRequestSign(hashMap));
                } else {
                    n4 = this.f32704x.n(uid, token, this.A, str);
                }
                if (n4 != null) {
                    PaiWeiDataBean.MonthBestBean month_best = n4.getData().getMonth_best();
                    List<PaiWeiDataBean.AdListBean> ad_list = n4.getData().getAd_list();
                    this.f32695p1 = n4.getData().getRank_list();
                    this.B1.clear();
                    this.B1.addAll(n4.getData().getRoles());
                    this.A1 = n4.getData().getRoles();
                    this.f32703w = n4.getData().getUnit();
                    this.P = n4.getData().getMinimum_passing_time();
                    J(month_best);
                    I(ad_list);
                    K();
                    L();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } finally {
            s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void w() {
        ResultResMainBean<GetPaiWeiPlayCodeBean> W;
        String uid = this.f32706z.getUid();
        String token = this.f32706z.getToken();
        try {
            try {
                if (this.C == 14) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("gameid", this.A);
                    hashMap.put("uid", uid);
                    hashMap.put("token", token);
                    W = this.f32705y.s(uid, this.A, this.f32706z.getToken(), SignUtils.buildRequestSign(hashMap));
                } else {
                    W = this.f32704x.W(uid, this.A);
                }
                if (W != null) {
                    String play_code = W.getData().getPlay_code();
                    if (!play_code.isEmpty()) {
                        this.H = play_code;
                        this.J = play_code;
                        M(play_code);
                    } else {
                        t();
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                t();
            }
        } finally {
            s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y(boolean z4) {
        if (z4) {
            b2.v.n().delete((b2.v) this.W.get(this.X));
            this.Y++;
        }
        int i4 = this.X + 1;
        this.X = i4;
        if (i4 < this.W.size()) {
            R();
            return;
        }
        s();
        if (this.Y == this.W.size()) {
            v("1");
        } else {
            r(false);
        }
    }
}
