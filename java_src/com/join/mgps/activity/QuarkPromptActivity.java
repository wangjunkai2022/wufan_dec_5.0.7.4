package com.join.mgps.activity;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.MApplication;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.base.dialog.BaseDialogActivity;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.DownloadArgs;
import com.join.mgps.dto.DownloadScanEvent;
import com.join.mgps.dto.WebDiskCfg;
import com.join.mgps.dto.WebDiskInfo;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.service.CommonService_;
import com.kwad.sdk.core.response.model.SdkConfigData;
import com.papa.sim.statistic.Event;
import com.papa91.arc.ext.ToastManager;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_quark_prompt)
/* loaded from: classes.dex */
public class QuarkPromptActivity extends BaseDialogActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f37037b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f37038c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f37039d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f37040e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    View f37041f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    RecyclerView f37042g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f37043h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f37044i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f37045j;
    @Pref

    /* renamed from: k  reason: collision with root package name */
    PrefDef_ f37046k;
    @Extra

    /* renamed from: l  reason: collision with root package name */
    String f37047l;
    @Extra

    /* renamed from: m  reason: collision with root package name */
    DownloadArgs f37048m;

    /* renamed from: n  reason: collision with root package name */
    WebDiskCfg f37049n;

    /* renamed from: o  reason: collision with root package name */
    WebDiskInfo f37050o;

    /* renamed from: p  reason: collision with root package name */
    DownloadTask f37051p;

    /* renamed from: q  reason: collision with root package name */
    DownloadTask f37052q;

    /* renamed from: w  reason: collision with root package name */
    private CollectionBeanSub f37058w;

    /* renamed from: x  reason: collision with root package name */
    private e f37059x;

    /* renamed from: r  reason: collision with root package name */
    boolean f37053r = true;

    /* renamed from: s  reason: collision with root package name */
    boolean f37054s = true;

    /* renamed from: t  reason: collision with root package name */
    boolean f37055t = false;

    /* renamed from: u  reason: collision with root package name */
    boolean f37056u = false;

    /* renamed from: v  reason: collision with root package name */
    int f37057v = 10;

    /* renamed from: y  reason: collision with root package name */
    Handler f37060y = new Handler(new a());

    /* renamed from: z  reason: collision with root package name */
    boolean f37061z = false;
    boolean A = false;

    /* loaded from: classes4.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (message.what == 1) {
                QuarkPromptActivity quarkPromptActivity = QuarkPromptActivity.this;
                int i4 = quarkPromptActivity.f37057v - 1;
                quarkPromptActivity.f37057v = i4;
                if (i4 > 0) {
                    quarkPromptActivity.h0();
                    QuarkPromptActivity.this.f37060y.sendEmptyMessageDelayed(1, 1000L);
                    return false;
                }
                quarkPromptActivity.f37039d.setText("00:00:00");
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    class b extends UniversalItemDecoration {
        b() {
        }

        @Override // com.join.mgps.base.decoration.UniversalItemDecoration
        public UniversalItemDecoration.b getItemOffsets(int i4) {
            UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
            aVar.f46237d = (int) QuarkPromptActivity.this.getResources().getDimension(R.dimen.wdp50);
            aVar.f46233f = 0;
            return aVar;
        }
    }

    /* loaded from: classes4.dex */
    class c implements Consumer<com.tbruyelle.rxpermissions2.b> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                QuarkPromptActivity quarkPromptActivity = QuarkPromptActivity.this;
                if (quarkPromptActivity.f37050o != null) {
                    int intValue = quarkPromptActivity.f37046k.quark_click_count().d().intValue();
                    WebDiskCfg webDiskCfg = QuarkPromptActivity.this.f37049n;
                    if (webDiskCfg != null && intValue < webDiskCfg.getClick_count()) {
                        QuarkPromptActivity.this.f37046k.quark_click_count().g(Integer.valueOf(intValue + 1));
                    }
                    if (QuarkPromptActivity.this.f37058w != null) {
                        if (QuarkPromptActivity.this.f37061z) {
                            IntentUtil.getInstance().startQuarkBrowser(QuarkPromptActivity.this, com.join.mgps.Util.q1.o(), QuarkPromptActivity.this.f37050o.getWb_url(), QuarkPromptActivity.this.f37058w.getGame_name(), QuarkPromptActivity.this.f37058w.getIco_remote());
                        } else {
                            IntentUtil.getInstance().startQuarkBrowser(QuarkPromptActivity.this, com.join.mgps.Util.q1.r(), QuarkPromptActivity.this.f37050o.getWb_url(), QuarkPromptActivity.this.f37058w.getGame_name(), QuarkPromptActivity.this.f37058w.getIco_remote());
                        }
                    }
                    if (QuarkPromptActivity.this.f37052q != null) {
                        DownloadScanEvent downloadScanEvent = new DownloadScanEvent();
                        downloadScanEvent.setPkg(QuarkPromptActivity.this.f37052q.getPackageName());
                        downloadScanEvent.setTask(QuarkPromptActivity.this.f37052q);
                        downloadScanEvent.setStatus(0);
                        ((CommonService_.h2) CommonService_.S2(QuarkPromptActivity.this).extra("downloadByQuark", downloadScanEvent)).a();
                    }
                }
            }
        }

        c() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(com.tbruyelle.rxpermissions2.b bVar) throws Exception {
            QuarkPromptActivity quarkPromptActivity = QuarkPromptActivity.this;
            com.join.mgps.Util.q1.t(quarkPromptActivity, Event.clickSpeedDownQkButton, quarkPromptActivity.f37047l, quarkPromptActivity.f37055t ? "detail" : "list");
            QuarkPromptActivity quarkPromptActivity2 = QuarkPromptActivity.this;
            com.join.mgps.Util.q1.t(quarkPromptActivity2, Event.clickSpeedDownUpQk, quarkPromptActivity2.f37047l, quarkPromptActivity2.f37055t ? "detail" : "list");
            QuarkPromptActivity.this.finish();
            new Handler().postDelayed(new a(), 200L);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int intValue = QuarkPromptActivity.this.f37046k.quark_display_count().d().intValue();
            if (intValue < QuarkPromptActivity.this.f37049n.getDisplay_count()) {
                QuarkPromptActivity.this.f37046k.quark_display_count().g(Integer.valueOf(intValue + 1));
            }
            MApplication mApplication = MApplication.f1497x;
            QuarkPromptActivity quarkPromptActivity = QuarkPromptActivity.this;
            UtilsMy.Q0(mApplication, quarkPromptActivity.f37052q, quarkPromptActivity.f37058w);
        }
    }

    /* loaded from: classes4.dex */
    class e extends BaseQuickAdapter<String, BaseViewHolder> {
        public e() {
            super((int) R.layout.item_quark_down_tip);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, String str) {
            baseViewHolder.setText(R.id.tv_text, Html.fromHtml(str));
        }
    }

    private void downloadQuark() {
        boolean r4;
        if (this.f37061z) {
            r4 = com.join.mgps.Util.q1.o();
        } else {
            r4 = com.join.mgps.Util.q1.r();
        }
        ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(this).extra("action", "downloadQuark")).extra("isOm", r4)).a();
        ToastManager.show(getString(R.string.quark_downloading_tip));
        com.join.mgps.Util.q1.t(this, Event.clickInstallQkButton, this.f37047l, this.f37055t ? "detail" : "list");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        Object valueOf;
        Object valueOf2;
        Object valueOf3;
        int i4 = this.f37057v;
        int i5 = i4 / SdkConfigData.DEFAULT_REQUEST_INTERVAL;
        int i6 = (i4 - (i5 * SdkConfigData.DEFAULT_REQUEST_INTERVAL)) / 60;
        int i7 = i4 % 60;
        TextView textView = this.f37039d;
        StringBuilder sb = new StringBuilder();
        if (i5 < 10) {
            valueOf = "0" + i5;
        } else {
            valueOf = Integer.valueOf(i5);
        }
        sb.append(valueOf);
        sb.append(":");
        if (i6 < 10) {
            valueOf2 = "0" + i6;
        } else {
            valueOf2 = Integer.valueOf(i6);
        }
        sb.append(valueOf2);
        sb.append(":");
        if (i7 < 10) {
            valueOf3 = "0" + i7;
        } else {
            valueOf3 = Integer.valueOf(i7);
        }
        sb.append(valueOf3);
        textView.setText(sb.toString());
    }

    public static Integer i0(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return Integer.valueOf((int) ((calendar.getTime().getTime() - date.getTime()) / 1000));
    }

    private boolean isOutOfBounds(Context context, MotionEvent motionEvent) {
        View contentView = getContentView();
        if (contentView == null) {
            return true;
        }
        int x4 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        int scaledWindowTouchSlop = ViewConfiguration.get(context).getScaledWindowTouchSlop();
        Rect rect = new Rect();
        contentView.getGlobalVisibleRect(rect);
        int i4 = -scaledWindowTouchSlop;
        return x4 < i4 || y2 < i4 || !rect.contains(x4, y2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        com.join.mgps.Util.c2.s(this);
        if (com.join.mgps.Util.g2.i(this.f37046k.web_disk_cfg().d())) {
            this.f37049n = (WebDiskCfg) JsonMapper.getInstance().fromJson(this.f37046k.web_disk_cfg().d(), WebDiskCfg.class);
        }
        DownloadArgs downloadArgs = this.f37048m;
        if (downloadArgs != null) {
            DownloadTask downloadTask = downloadArgs.getDownloadTask();
            if (downloadTask != null) {
                this.f37047l = downloadTask.getCrc_link_type_val();
            }
            this.f37058w = this.f37048m.getGameInfo();
            this.f37055t = this.f37048m.getFrom() == 101;
            CollectionBeanSub collectionBeanSub = this.f37058w;
            if (collectionBeanSub != null) {
                this.f37050o = collectionBeanSub.getWeb_disk_info();
                this.f37052q = this.f37058w.getDownloadtaskDown();
            }
        }
        DownloadTask downloadTask2 = this.f37052q;
        boolean z4 = downloadTask2 != null && UtilsMy.m2(Integer.parseInt(downloadTask2.getPlugin_num()));
        this.f37061z = z4;
        if (z4) {
            this.A = com.join.mgps.Util.q1.o() && com.join.mgps.va.overmind.d.o().O();
        } else {
            this.A = com.join.mgps.Util.q1.r() && com.join.mgps.va.overmind.d.o().O();
        }
        boolean d5 = com.join.android.app.common.utils.e.l0(this).d(this, com.join.mgps.Util.q1.f27991b);
        this.f37056u = d5;
        if (d5) {
            this.f37051p = p1.f.K().F(com.join.mgps.Util.q1.f27993d);
        } else if (this.A) {
            this.f37051p = p1.f.K().F(com.join.mgps.Util.q1.f27992c);
        }
        DownloadArgs downloadArgs2 = this.f37048m;
        if (downloadArgs2 != null) {
            DownloadTask downloadTask3 = downloadArgs2.getDownloadTask();
            if (downloadTask3 != null) {
                this.f37047l = downloadTask3.getCrc_link_type_val();
            }
            this.f37058w = this.f37048m.getGameInfo();
            this.f37055t = this.f37048m.getFrom() == 101;
            CollectionBeanSub collectionBeanSub2 = this.f37058w;
            if (collectionBeanSub2 != null) {
                this.f37050o = collectionBeanSub2.getWeb_disk_info();
                this.f37052q = this.f37058w.getDownloadtaskDown();
                this.f37044i.setText(this.f37058w.getGame_name());
                try {
                    long parseDouble = (long) (Double.parseDouble(this.f37058w.getAppSize()) * 1048576.0d);
                    TextView textView = this.f37045j;
                    textView.setText("2023-03-21 15:30 " + UtilsMy.J2(parseDouble));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
        k0();
        this.f37039d.setVisibility(0);
        this.f37040e.setVisibility(0);
        this.f37060y.sendEmptyMessageDelayed(1, 1000L);
        this.f37059x = new e();
        this.f37042g.setLayoutManager(new LinearLayoutManager(this));
        this.f37042g.setAdapter(this.f37059x);
        this.f37042g.addItemDecoration(new b());
        WebDiskCfg webDiskCfg = this.f37049n;
        if (webDiskCfg != null) {
            if (com.join.mgps.Util.g2.i(webDiskCfg.getTitle())) {
                if (this.f37049n.getTitle().contains("<time>")) {
                    String[] split = this.f37049n.getTitle().split("<time>");
                    this.f37043h.setText(split[0]);
                    this.f37040e.setText(split[1]);
                    this.f37039d.setVisibility(0);
                    this.f37040e.setVisibility(0);
                    int intValue = i0(new Date()).intValue();
                    this.f37057v = intValue;
                    this.f37057v = intValue + 14400;
                    h0();
                } else {
                    this.f37043h.setText(this.f37049n.getTitle());
                    this.f37039d.setVisibility(8);
                    this.f37040e.setVisibility(8);
                }
            }
            if (com.join.mgps.Util.g2.i(this.f37049n.getSub_title())) {
                this.f37059x.setNewData(Arrays.asList((this.f37049n.getSub_title() + "\n<font color='#2251FF'>" + this.f37049n.getSub_title_v2() + "</font>").split("<br/>")));
            }
        }
    }

    @Override // com.join.mgps.base.dialog.BaseDialogActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.f37049n != null) {
            if (this.f37046k.quark_click_count().d().intValue() >= this.f37049n.getClick_count() - 1) {
                this.f37046k.isQuarkEnable().g(Boolean.FALSE);
            }
            if (this.f37046k.quark_display_count().d().intValue() >= this.f37049n.getDisplay_count() - 1 && this.f37046k.quark_click_count().d().intValue() <= 0) {
                this.f37046k.isQuarkEnable().g(Boolean.FALSE);
            }
        }
        this.f37060y.removeCallbacksAndMessages(null);
    }

    @Override // com.join.mgps.base.dialog.BaseDialogActivity
    public View getContentView() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        new Handler().postDelayed(new d(), 200L);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0() {
        String string;
        this.f37038c.setVisibility(0);
        WebDiskCfg webDiskCfg = this.f37049n;
        if (webDiskCfg != null && !TextUtils.isEmpty(webDiskCfg.getDown_btn_txt())) {
            string = this.f37049n.getDown_btn_txt();
        } else {
            string = getString(R.string.download_speedly);
        }
        if (this.f37054s) {
            com.join.mgps.Util.q1.t(this, Event.speedDownQkExp, this.f37047l, this.f37055t ? "detail" : "list");
            this.f37054s = false;
        }
        this.f37037b.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        DownloadTask downloadTask;
        if (!this.A) {
            int i4 = 0;
            this.f37056u = com.join.android.app.common.utils.e.l0(this).d(this, com.join.mgps.Util.q1.f27991b);
            DownloadTask F = p1.f.K().F(com.join.mgps.Util.q1.f27993d);
            if (F != null) {
                i4 = F.getStatus();
                this.f37051p = F;
            }
            boolean z4 = this.f37056u;
            if (!z4 && i4 == 2) {
                ToastManager.show("夸克正在下载");
                this.f37046k.isQuarkSilentDownload().g(Boolean.FALSE);
                return;
            } else if (!z4 && (this.f37051p == null || i4 == 0)) {
                downloadQuark();
                return;
            } else {
                if (!z4 && ((this.f37051p != null && i4 == 11) || i4 == 6)) {
                    File file = new File(this.f37051p.getPath());
                    this.f37046k.isQuarkSilentDownload().g(Boolean.FALSE);
                    if (file.exists() && i4 != 6) {
                        com.join.android.app.common.utils.e.l0(this).x(this, this.f37051p.getPath());
                        com.join.mgps.Util.q1.t(this, Event.clickInstallQkButton, this.f37047l, this.f37055t ? "detail" : "list");
                        return;
                    }
                    p1.f.K().delete((p1.f) this.f37051p);
                    downloadQuark();
                    return;
                } else if (!z4 && (downloadTask = this.f37051p) != null && i4 != 5) {
                    com.php25.PDownload.d.c(downloadTask, this);
                    this.f37046k.isQuarkSilentDownload().g(Boolean.FALSE);
                    com.join.mgps.Util.q1.t(this, Event.clickInstallQkButton, this.f37047l, this.f37055t ? "detail" : "list");
                    return;
                }
            }
        }
        new com.tbruyelle.rxpermissions2.c(this).r(com.kuaishou.weapon.p0.g.f55589i).subscribe(new c());
        UtilsMy.L3(this, com.kuaishou.weapon.p0.g.f55590j);
    }

    @Override // com.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        if (nVar.a() == null || TextUtils.isEmpty(nVar.a().getPackageName()) || !nVar.a().getPackageName().equals(com.join.mgps.Util.q1.f27991b)) {
            return;
        }
        this.f37051p.setStatus(nVar.a().getStatus());
        this.f37051p.setPath(nVar.a().getPath());
        k0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UtilsMy.q4(this);
        k0();
    }

    @Override // com.join.mgps.base.dialog.BaseDialogActivity, android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (shouldCloseOnTouch(this, motionEvent)) {
            finish();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.join.mgps.base.dialog.BaseDialogActivity
    public boolean shouldCloseOnTouch(Context context, MotionEvent motionEvent) {
        return getContentView() != null && ((motionEvent.getAction() == 1 && isOutOfBounds(context, motionEvent)) || motionEvent.getAction() == 4);
    }
}
