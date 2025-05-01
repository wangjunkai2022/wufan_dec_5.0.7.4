package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.BaseActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.db.tables.EMUUpdateTable;
import com.join.mgps.dto.GameDownInfo;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.UpdateIntentDataBean;
import com.join.mgps.enums.Dtype;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.choice_down_activity)
/* loaded from: classes4.dex */
public class ChociceDownActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f28585b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f28586c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ImageView f28587d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f28588e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f28589f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f28590g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f28591h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f28592i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    RelativeLayout f28593j;

    /* renamed from: k  reason: collision with root package name */
    com.join.mgps.rpc.e f28594k;
    @Extra

    /* renamed from: l  reason: collision with root package name */
    DownloadTask f28595l;
    @Extra

    /* renamed from: m  reason: collision with root package name */
    UpdateIntentDataBean f28596m;
    @Extra

    /* renamed from: n  reason: collision with root package name */
    int f28597n = 0;

    /* renamed from: o  reason: collision with root package name */
    Context f28598o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    LinearLayout f28599p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    LinearLayout f28600q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    ImageView f28601r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    RelativeLayout f28602s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    RelativeLayout f28603t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f28604b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ GameDownInfo.Addr1Bean f28605c;

        a(int i4, GameDownInfo.Addr1Bean addr1Bean) {
            this.f28604b = i4;
            this.f28605c = addr1Bean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4 = this.f28604b;
            if (i4 == 1) {
                ChociceDownActivity.this.f28595l.setUrl(this.f28605c.getUrl());
                if (ChociceDownActivity.this.f28595l.getStatus() == 9) {
                    DownloadTask downloadTask = ChociceDownActivity.this.f28595l;
                    UtilsMy.z4(downloadTask, downloadTask.getCrc_link_type_val());
                    com.php25.PDownload.d.b(ChociceDownActivity.this.f28595l);
                    ChociceDownActivity chociceDownActivity = ChociceDownActivity.this;
                    com.php25.PDownload.d.c(chociceDownActivity.f28595l, chociceDownActivity.f28598o);
                } else if (ChociceDownActivity.this.f28595l.getFileType().equals(Dtype.apk.name()) && ChociceDownActivity.this.f28596m != null) {
                    EMUUpdateTable n4 = b2.q.o().n(ChociceDownActivity.this.f28595l.getCrc_link_type_val());
                    n4.setDown_url_remote(ChociceDownActivity.this.f28595l.getUrl());
                    b2.q.o().update(n4);
                    ChociceDownActivity.this.f28596m.getDownloadTask().setUrl(ChociceDownActivity.this.f28595l.getUrl());
                    UpdateLodingActivity_.o0(ChociceDownActivity.this.f28598o).a(ChociceDownActivity.this.f28596m).start();
                } else {
                    ChociceDownActivity chociceDownActivity2 = ChociceDownActivity.this;
                    com.php25.PDownload.d.c(chociceDownActivity2.f28595l, chociceDownActivity2.f28598o);
                }
            } else if (i4 == 2) {
                ChociceDownActivity chociceDownActivity3 = ChociceDownActivity.this;
                if (chociceDownActivity3.f28596m == null) {
                    chociceDownActivity3.f28596m = new UpdateIntentDataBean();
                    ChociceDownActivity chociceDownActivity4 = ChociceDownActivity.this;
                    chociceDownActivity4.f28596m.setDownloadTask(chociceDownActivity4.f28595l);
                }
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f28605c.getUrl());
                intentDateBean.setObject(ChociceDownActivity.this.f28596m);
                intentDateBean.setFrom(com.join.mgps.Util.v.f28122v);
                if (ChociceDownActivity.this.f28597n == 11) {
                    intentDateBean.setFrom("11");
                }
                IntentUtil.getInstance().intentActivity(ChociceDownActivity.this.f28598o, intentDateBean);
            } else if (i4 == 3) {
                IntentUtil.getInstance().goBrowser(ChociceDownActivity.this.f28598o, this.f28605c.getUrl());
            }
            ChociceDownActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f28607b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ GameDownInfo.Addr1Bean f28608c;

        b(int i4, GameDownInfo.Addr1Bean addr1Bean) {
            this.f28607b = i4;
            this.f28608c = addr1Bean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4 = this.f28607b;
            if (i4 == 1) {
                ChociceDownActivity.this.f28595l.setUrl(this.f28608c.getUrl());
                if (ChociceDownActivity.this.f28595l.getStatus() == 9) {
                    DownloadTask downloadTask = ChociceDownActivity.this.f28595l;
                    UtilsMy.z4(downloadTask, downloadTask.getCrc_link_type_val());
                    com.php25.PDownload.d.b(ChociceDownActivity.this.f28595l);
                    ChociceDownActivity chociceDownActivity = ChociceDownActivity.this;
                    com.php25.PDownload.d.c(chociceDownActivity.f28595l, chociceDownActivity.f28598o);
                } else if (ChociceDownActivity.this.f28595l.getFileType().equals(Dtype.apk.name()) && ChociceDownActivity.this.f28596m != null) {
                    EMUUpdateTable n4 = b2.q.o().n(ChociceDownActivity.this.f28595l.getCrc_link_type_val());
                    n4.setDown_url_remote(ChociceDownActivity.this.f28595l.getUrl());
                    b2.q.o().update(n4);
                    ChociceDownActivity.this.f28596m.getDownloadTask().setUrl(ChociceDownActivity.this.f28595l.getUrl());
                    UpdateLodingActivity_.o0(ChociceDownActivity.this.f28598o).a(ChociceDownActivity.this.f28596m).start();
                } else {
                    ChociceDownActivity chociceDownActivity2 = ChociceDownActivity.this;
                    com.php25.PDownload.d.c(chociceDownActivity2.f28595l, chociceDownActivity2.f28598o);
                }
            } else if (i4 == 2) {
                ChociceDownActivity chociceDownActivity3 = ChociceDownActivity.this;
                if (chociceDownActivity3.f28596m == null) {
                    chociceDownActivity3.f28596m = new UpdateIntentDataBean();
                    ChociceDownActivity chociceDownActivity4 = ChociceDownActivity.this;
                    chociceDownActivity4.f28596m.setDownloadTask(chociceDownActivity4.f28595l);
                }
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f28608c.getUrl());
                intentDateBean.setObject(ChociceDownActivity.this.f28596m);
                intentDateBean.setFrom(com.join.mgps.Util.v.f28122v);
                if (ChociceDownActivity.this.f28597n == 11) {
                    intentDateBean.setFrom("11");
                }
                IntentUtil.getInstance().intentActivity(ChociceDownActivity.this.f28598o, intentDateBean);
            } else if (i4 == 3) {
                IntentUtil.getInstance().goBrowser(ChociceDownActivity.this.f28598o, this.f28608c.getUrl());
            }
            ChociceDownActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f28610b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ GameDownInfo.Addr1Bean f28611c;

        c(int i4, GameDownInfo.Addr1Bean addr1Bean) {
            this.f28610b = i4;
            this.f28611c = addr1Bean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4 = this.f28610b;
            if (i4 == 1) {
                ChociceDownActivity.this.f28595l.setUrl(this.f28611c.getUrl());
                if (ChociceDownActivity.this.f28595l.getStatus() == 9) {
                    DownloadTask downloadTask = ChociceDownActivity.this.f28595l;
                    UtilsMy.z4(downloadTask, downloadTask.getCrc_link_type_val());
                    com.php25.PDownload.d.b(ChociceDownActivity.this.f28595l);
                    ChociceDownActivity chociceDownActivity = ChociceDownActivity.this;
                    com.php25.PDownload.d.c(chociceDownActivity.f28595l, chociceDownActivity.f28598o);
                } else if (ChociceDownActivity.this.f28595l.getFileType().equals(Dtype.apk.name()) && ChociceDownActivity.this.f28596m != null) {
                    EMUUpdateTable n4 = b2.q.o().n(ChociceDownActivity.this.f28595l.getCrc_link_type_val());
                    n4.setDown_url_remote(ChociceDownActivity.this.f28595l.getUrl());
                    b2.q.o().update(n4);
                    ChociceDownActivity.this.f28596m.getDownloadTask().setUrl(ChociceDownActivity.this.f28595l.getUrl());
                    UpdateLodingActivity_.o0(ChociceDownActivity.this.f28598o).a(ChociceDownActivity.this.f28596m).start();
                } else {
                    ChociceDownActivity chociceDownActivity2 = ChociceDownActivity.this;
                    com.php25.PDownload.d.c(chociceDownActivity2.f28595l, chociceDownActivity2.f28598o);
                }
            } else if (i4 == 2) {
                ChociceDownActivity chociceDownActivity3 = ChociceDownActivity.this;
                if (chociceDownActivity3.f28596m == null) {
                    chociceDownActivity3.f28596m = new UpdateIntentDataBean();
                    ChociceDownActivity chociceDownActivity4 = ChociceDownActivity.this;
                    chociceDownActivity4.f28596m.setDownloadTask(chociceDownActivity4.f28595l);
                }
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f28611c.getUrl());
                intentDateBean.setObject(ChociceDownActivity.this.f28596m);
                intentDateBean.setFrom(com.join.mgps.Util.v.f28122v);
                if (ChociceDownActivity.this.f28597n == 11) {
                    intentDateBean.setFrom("11");
                }
                IntentUtil.getInstance().intentActivity(ChociceDownActivity.this.f28598o, intentDateBean);
            } else if (i4 == 3) {
                IntentUtil.getInstance().goBrowser(ChociceDownActivity.this.f28598o, this.f28611c.getUrl());
            }
            ChociceDownActivity.this.finish();
        }
    }

    private void l0(String str) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type_val(str);
        intentDateBean.setFrom(com.join.mgps.Util.v.f28122v);
        intentDateBean.setObject(this.f28595l);
        ShareWebActivity_.t2(this.f28598o).b(intentDateBean).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.f28598o = this;
        this.f28594k = com.join.mgps.rpc.impl.d.P1();
        if (this.f28595l == null && this.f28596m == null) {
            com.join.mgps.Util.l2.a(this.f28598o).b("下载数据为空");
            return;
        }
        try {
            if (this.f28597n == 12) {
                EMUUpdateTable n4 = b2.q.o().n(this.f28595l.getCrc_link_type_val());
                n4.setDown_url_remote(this.f28595l.getUrl());
                b2.q.o().update(n4);
                this.f28595l.setVer(n4.getVer());
                this.f28595l.setVer_name(n4.getVer_name());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        int i4 = this.f28597n;
        if (i4 != 0 && i4 != 11) {
            this.f28603t.setVisibility(0);
            this.f28600q.setVisibility(8);
            this.f28599p.setVisibility(8);
            this.f28602s.setVisibility(8);
            return;
        }
        showLoding();
        getData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getData() {
        if (com.join.android.app.common.utils.j.j(this.f28598o)) {
            try {
                ResultMainBean<GameDownInfo> C0 = this.f28594k.C0(RequestBeanUtil.getInstance(this.f28598o).getSimulatorRequest("", this.f28595l.getCrc_link_type_val(), 0));
                if (C0 != null && C0.getFlag() == 1 && C0.getMessages().getData() != null) {
                    k0(C0.getMessages().getData());
                } else {
                    showLodingFailed();
                }
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                showLodingFailed();
                return;
            }
        }
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        UpdateIntentDataBean updateIntentDataBean;
        UpdateIntentDataBean updateIntentDataBean2;
        if (this.f28595l == null && (updateIntentDataBean2 = this.f28596m) != null) {
            this.f28595l = updateIntentDataBean2.getDownloadTask();
        }
        finish();
        Intent intent = new Intent();
        intent.setAction(o1.a.f72001g0);
        this.f28598o.sendBroadcast(intent);
        if (this.f28597n == 12) {
            if (this.f28595l.getFileType().equals(Dtype.apk.name()) && (updateIntentDataBean = this.f28596m) != null) {
                updateIntentDataBean.getDownloadTask().setUrl(this.f28595l.getUrl());
                UpdateLodingActivity_.o0(this.f28598o).a(this.f28596m).start();
                return;
            }
            UtilsMy.L0(p1.f.K().F(this.f28595l.getCrc_link_type_val()));
            com.php25.PDownload.d.c(this.f28595l, this.f28598o);
            return;
        }
        com.php25.PDownload.d.c(this.f28595l, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        UpdateIntentDataBean updateIntentDataBean;
        try {
            finish();
            Intent intent = new Intent();
            intent.setAction(o1.a.f72001g0);
            this.f28598o.sendBroadcast(intent);
            if (this.f28595l == null && (updateIntentDataBean = this.f28596m) != null) {
                this.f28595l = updateIntentDataBean.getDownloadTask();
            }
            IntentUtil.getInstance().goBrowser(this.f28598o, this.f28595l.getUrl());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(GameDownInfo gameDownInfo) {
        try {
            this.f28600q.setVisibility(8);
            this.f28599p.setVisibility(8);
            this.f28602s.setVisibility(0);
            this.f28585b.setText(gameDownInfo.getTitle());
            this.f28586c.setText(gameDownInfo.getSub_title());
            int lv_type = gameDownInfo.getLv_type();
            List<GameDownInfo.Addr1Bean> down_url = gameDownInfo.getDown_url();
            this.f28588e.setVisibility(8);
            this.f28589f.setVisibility(8);
            this.f28592i.setVisibility(8);
            for (int i4 = 0; i4 < down_url.size(); i4++) {
                GameDownInfo.Addr1Bean addr1Bean = down_url.get(i4);
                if (i4 == 0) {
                    this.f28588e.setText(addr1Bean.getTitle());
                    this.f28588e.setVisibility(0);
                    this.f28588e.setOnClickListener(new a(lv_type, addr1Bean));
                }
                if (i4 == 1) {
                    this.f28589f.setText(addr1Bean.getTitle());
                    this.f28589f.setVisibility(0);
                    this.f28589f.setOnClickListener(new b(lv_type, addr1Bean));
                }
                if (i4 == 2) {
                    this.f28592i.setText(addr1Bean.getTitle());
                    this.f28592i.setVisibility(0);
                    this.f28592i.setOnClickListener(new c(lv_type, addr1Bean));
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        getData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            this.f28599p.setVisibility(0);
            this.f28600q.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        try {
            this.f28600q.setVisibility(0);
            this.f28599p.setVisibility(8);
            this.f28602s.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
