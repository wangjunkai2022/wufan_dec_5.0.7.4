package com.join.mgps.activity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseAppCompatActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.endgame.EndGameSlotListActivity;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.customview.popwindow.view.PopWindowView;
import com.join.mgps.customview.wheel.picker.a;
import com.join.mgps.customview.wheel.picker.util.DateUtils;
import com.join.mgps.dto.ArchiveListBean;
import com.join.mgps.dto.BossBean;
import com.join.mgps.dto.GameMainV4DataBean;
import com.join.mgps.dto.RequestBossListArgs;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.UserGameListBean;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_create_end_game)
/* loaded from: classes.dex */
public class CreateEndGameActivity extends BaseAppCompatActivity {
    public static final int F = 1002;
    public static final String G = "CreateEndGameActivity";
    PopWindowView C;

    /* renamed from: b  reason: collision with root package name */
    String f29661b;
    @Extra

    /* renamed from: c  reason: collision with root package name */
    GameMainV4DataBean.EndGameConfigBean f29662c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f29663d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f29664e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ImageView f29665f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ImageView f29666g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f29667h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f29668i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f29669j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f29670k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    ImageView f29671l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    RelativeLayout f29672m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    LinearLayout f29673n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    ImageView f29674o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    TextView f29675p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    SimpleDraweeView f29676q;

    /* renamed from: r  reason: collision with root package name */
    com.join.mgps.rpc.k f29677r;

    /* renamed from: s  reason: collision with root package name */
    List<BossBean> f29678s;

    /* renamed from: t  reason: collision with root package name */
    List<UserGameListBean> f29679t;

    /* renamed from: u  reason: collision with root package name */
    g f29680u;

    /* renamed from: v  reason: collision with root package name */
    f f29681v;

    /* renamed from: w  reason: collision with root package name */
    ArchiveListBean f29682w;

    /* renamed from: y  reason: collision with root package name */
    com.join.mgps.dialog.n2 f29684y;

    /* renamed from: z  reason: collision with root package name */
    PopWindowView f29685z;

    /* renamed from: x  reason: collision with root package name */
    long f29683x = 0;
    boolean A = false;
    UserGameListBean B = null;
    boolean D = false;
    BossBean E = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends UniversalItemDecoration {
        a() {
        }

        @Override // com.join.mgps.base.decoration.UniversalItemDecoration
        public UniversalItemDecoration.b getItemOffsets(int i4) {
            UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
            aVar.f46233f = Color.parseColor("#E6E6E6");
            aVar.f46236c = (int) CreateEndGameActivity.this.getResources().getDimension(R.dimen.wdp1);
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements BaseQuickAdapter.j {
        b() {
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.j
        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
            UserGameListBean item = CreateEndGameActivity.this.f29681v.getItem(i4);
            if (item != null && !item.equals(CreateEndGameActivity.this.B)) {
                CreateEndGameActivity createEndGameActivity = CreateEndGameActivity.this;
                createEndGameActivity.B = item;
                createEndGameActivity.f29678s = null;
                createEndGameActivity.E = null;
                createEndGameActivity.f29675p.setText(item.getGameName());
                CreateEndGameActivity createEndGameActivity2 = CreateEndGameActivity.this;
                MyImageLoader.h(createEndGameActivity2.f29676q, createEndGameActivity2.B.getGameIcon());
                CreateEndGameActivity createEndGameActivity3 = CreateEndGameActivity.this;
                createEndGameActivity3.f29661b = createEndGameActivity3.B.getGameId();
                CreateEndGameActivity.this.t0();
                CreateEndGameActivity.this.n0(false);
            }
            CreateEndGameActivity.this.f29685z.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends UniversalItemDecoration {
        c() {
        }

        @Override // com.join.mgps.base.decoration.UniversalItemDecoration
        public UniversalItemDecoration.b getItemOffsets(int i4) {
            UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
            aVar.f46233f = Color.parseColor("#F2F2F2");
            aVar.f46236c = (int) CreateEndGameActivity.this.getResources().getDimension(R.dimen.wdp1);
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements BaseQuickAdapter.j {
        d() {
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.j
        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
            LinearLayout linearLayout = CreateEndGameActivity.this.f29667h;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                CreateEndGameActivity.this.f29670k.setVisibility(8);
                CreateEndGameActivity createEndGameActivity = CreateEndGameActivity.this;
                createEndGameActivity.E = createEndGameActivity.f29680u.getItem(i4);
                CreateEndGameActivity createEndGameActivity2 = CreateEndGameActivity.this;
                BossBean bossBean = createEndGameActivity2.E;
                if (bossBean != null) {
                    createEndGameActivity2.f29668i.setText(bossBean.getBoos());
                    CreateEndGameActivity createEndGameActivity3 = CreateEndGameActivity.this;
                    createEndGameActivity3.f29669j.setText(createEndGameActivity3.E.getLevel());
                    CreateEndGameActivity.this.f29668i.setTextColor(Color.parseColor("#6194FF"));
                    CreateEndGameActivity.this.f29669j.setTextColor(Color.parseColor("#6194FF"));
                }
            }
            CreateEndGameActivity.this.C.p();
        }
    }

    /* loaded from: classes4.dex */
    class e implements a.d {
        e() {
        }

        @Override // com.join.mgps.customview.wheel.picker.a.d
        public void b(String str, String str2) {
            String str3;
            StringBuilder sb = new StringBuilder();
            String str4 = "";
            if (DateUtils.u(str) > 0) {
                str3 = DateUtils.u(str) + "分钟";
            } else {
                str3 = "";
            }
            sb.append(str3);
            if (DateUtils.u(str2) > 0) {
                str4 = DateUtils.u(str2) + "秒";
            }
            sb.append(str4);
            String sb2 = sb.toString();
            CreateEndGameActivity.this.f29683x = ((DateUtils.u(str) * 60) + DateUtils.u(str2)) * 1000;
            CreateEndGameActivity.this.f29664e.setText(sb2);
            CreateEndGameActivity.this.f29663d.setText("玩家需要在" + sb2 + "时间内完成挑战");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f extends BaseQuickAdapter<UserGameListBean, BaseViewHolder> {
        public f() {
            super((int) R.layout.item_create_end_game);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, UserGameListBean userGameListBean) {
            baseViewHolder.setText(R.id.tv_sub_title, userGameListBean.getGameName());
            MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.sdv_image_game), userGameListBean.getGameIcon());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends BaseQuickAdapter<BossBean, BaseViewHolder> {
        public g() {
            super((int) R.layout.item_create_end_game_boss);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, BossBean bossBean) {
            baseViewHolder.setText(R.id.tv_title, bossBean.getBoos());
            baseViewHolder.setText(R.id.tv_sub_title, bossBean.getLevel());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(View view) {
        this.D = false;
        view.setBackgroundResource(R.drawable.shape_fafafa_r_8);
        this.f29665f.setImageResource(R.drawable.ic_angle_down_black);
        this.f29668i.setTextColor(Color.parseColor("#000000"));
        this.f29669j.setTextColor(Color.parseColor("#777777"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(View view) {
        this.A = false;
        view.setBackgroundResource(R.drawable.shape_fafafa_r_8);
        this.f29666g.setImageResource(R.drawable.ic_angle_down_black);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        this.f29667h.setVisibility(8);
        this.f29670k.setVisibility(0);
    }

    private void u0(final View view, List<BossBean> list) {
        View inflate = LayoutInflater.from(this).inflate(R.layout.pop_end_game_boss, (ViewGroup) null);
        view.setBackgroundResource(R.drawable.shape_fafafa_t_r8);
        this.f29665f.setImageResource(R.drawable.ic_angle_up_blue);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new c());
        if (this.f29680u == null) {
            this.f29680u = new g();
        }
        if (this.E != null) {
            this.f29668i.setTextColor(Color.parseColor("#6194FF"));
            this.f29669j.setTextColor(Color.parseColor("#6194FF"));
        }
        recyclerView.setAdapter(this.f29680u);
        this.f29680u.setNewData(list);
        this.f29680u.setOnItemClickListener(new d());
        this.C = new PopWindowView.b(this).j(0).k((int) getResources().getDimension(R.dimen.wdp12)).e((int) getResources().getDimension(R.dimen.wdp450)).f(inflate).c(true).i(view).b(true).h(new PopWindowView.c() { // from class: com.join.mgps.activity.h
            @Override // com.join.mgps.customview.popwindow.view.PopWindowView.c
            public final void onDismiss() {
                CreateEndGameActivity.this.l0(view);
            }
        }).l();
    }

    private void v0(final View view, List<UserGameListBean> list) {
        View inflate = LayoutInflater.from(this).inflate(R.layout.pop_end_game, (ViewGroup) null);
        view.setBackgroundResource(R.drawable.shape_fafafa_t_r8);
        this.f29666g.setImageResource(R.drawable.ic_angle_up_blue);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new a());
        if (this.f29681v == null) {
            this.f29681v = new f();
        }
        recyclerView.setAdapter(this.f29681v);
        this.f29681v.setNewData(list);
        this.f29681v.setOnItemClickListener(new b());
        this.f29685z = new PopWindowView.b(this).j(0).k((int) getResources().getDimension(R.dimen.wdp12)).e((int) getResources().getDimension(R.dimen.wdp564)).f(inflate).c(true).i(view).b(true).h(new PopWindowView.c() { // from class: com.join.mgps.activity.i
            @Override // com.join.mgps.customview.popwindow.view.PopWindowView.c
            public final void onDismiss() {
                CreateEndGameActivity.this.m0(view);
            }
        }).l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        org.greenrobot.eventbus.c.f().t(this);
        this.f29677r = com.join.mgps.rpc.impl.i.D0();
        o0(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.iv_back})
    public void back() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.cv_boss})
    public void i0() {
        if (com.join.mgps.Util.g2.i(this.f29661b)) {
            List<BossBean> list = this.f29678s;
            if (list != null && list.size() > 0) {
                PopWindowView popWindowView = this.C;
                if (popWindowView != null && this.D) {
                    this.D = false;
                    if (popWindowView != null) {
                        popWindowView.p();
                        return;
                    }
                    return;
                }
                this.D = true;
                u0(findViewById(R.id.cv_boss), this.f29678s);
                return;
            }
            n0(true);
            return;
        }
        showToast("请选择游戏");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.cv_game})
    public void j0() {
        List<UserGameListBean> list = this.f29679t;
        if (list != null && list.size() > 0) {
            PopWindowView popWindowView = this.f29685z;
            if (popWindowView != null && this.A) {
                this.A = false;
                if (popWindowView != null) {
                    popWindowView.p();
                    return;
                }
                return;
            }
            this.A = true;
            v0(findViewById(R.id.cv_game), this.f29679t);
            return;
        }
        o0(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.ll_choose_slot})
    public void k0() {
        if (com.join.mgps.Util.g2.i(this.f29661b)) {
            Intent intent = new Intent(this, EndGameSlotListActivity.class);
            intent.putExtra("gameId", this.f29661b);
            startActivityForResult(intent, 1002);
            return;
        }
        showToast("请选择游戏");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0(boolean z4) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                RequestBossListArgs requestBossListArgs = new RequestBossListArgs(this.f29661b);
                RequestModel requestModel = new RequestModel(this);
                requestModel.setArgs(requestBossListArgs);
                ResponseModel<List<BossBean>> K = this.f29677r.K(requestModel.makeSign());
                if (K != null) {
                    try {
                        if (K.getData() != null) {
                            List<BossBean> data = K.getData();
                            this.f29678s = data;
                            if (z4) {
                                w0(data);
                            }
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o0(boolean z4) {
        if (AccountUtil_.getInstance_(this).isTourist()) {
            IntentUtil.getInstance().goLogin(this);
        } else if (com.join.android.app.common.utils.j.j(this)) {
            try {
                RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs();
                RequestModel requestModel = new RequestModel(this);
                requestGameIdArgs.setUid(AccountUtil_.getInstance_(this).getAccountData().getUid());
                requestModel.setArgs(requestGameIdArgs);
                ResponseModel<List<UserGameListBean>> f5 = this.f29677r.f(requestModel.makeSign());
                if (f5 != null) {
                    try {
                        if (f5.getData() != null) {
                            List<UserGameListBean> data = f5.getData();
                            this.f29679t = data;
                            x0(z4, data);
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        showToast("网络连接异常，请重试");
                    }
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                showToast("网络连接异常，请重试");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == 1002 && i5 == -1 && intent != null) {
            ArchiveListBean archiveListBean = (ArchiveListBean) intent.getSerializableExtra("mData");
            this.f29682w = archiveListBean;
            if (archiveListBean != null) {
                this.f29672m.setVisibility(0);
                this.f29673n.setVisibility(8);
                this.f29671l.setImageURI(Uri.parse(this.f29682w.getArchiveCover()));
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onBusEvent(com.join.mgps.event.p pVar) {
        if (G.equals(pVar.a())) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.cv_time})
    public void p0() {
        com.join.mgps.customview.wheel.picker.a aVar = new com.join.mgps.customview.wheel.picker.a(this);
        aVar.G0(false);
        aVar.m0(false);
        aVar.i0(false);
        aVar.D0(a2.a.H(this, 15.0f));
        aVar.V0(new e());
        aVar.B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.btn_next})
    public void q0() {
        if (this.f29682w == null) {
            showToast("请选择存档");
        } else if (this.E == null) {
            showToast("请选择BOSS");
        } else {
            long j4 = this.f29683x;
            if (j4 <= 0) {
                showToast("请设置挑战时长");
            } else if (j4 < 20000) {
                showToast("挑战时长不能低于20秒");
            } else {
                CreateEndGameCommitActivity_.N0(this).c(this.f29661b).b(this.E).a(this.f29682w).d(Long.valueOf(this.f29683x)).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.iv_question})
    public void r0() {
        if (this.f29662c != null) {
            if (this.f29684y == null) {
                this.f29684y = new com.join.mgps.dialog.n2(this);
            }
            this.f29684y.a(this.f29662c.getEndgame_archive_hint());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.iv_delete_slot})
    public void s0() {
        this.f29682w = null;
        this.f29673n.setVisibility(0);
        this.f29672m.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0(List<BossBean> list) {
        if (this.C != null) {
            u0(findViewById(R.id.cv_boss), list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x0(boolean z4, List<UserGameListBean> list) {
        UserGameListBean userGameListBean;
        if (this.f29679t.size() > 0 && (userGameListBean = this.f29679t.get(0)) != null) {
            this.f29661b = userGameListBean.getGameId();
            SimpleDraweeView simpleDraweeView = this.f29676q;
            if (simpleDraweeView != null) {
                MyImageLoader.h(simpleDraweeView, userGameListBean.getGameIcon());
            }
            TextView textView = this.f29675p;
            if (textView != null) {
                textView.setText(userGameListBean.getGameName());
            }
            n0(false);
        }
        if (!z4 || this.f29685z == null) {
            return;
        }
        v0(findViewById(R.id.cv_game), list);
    }
}
