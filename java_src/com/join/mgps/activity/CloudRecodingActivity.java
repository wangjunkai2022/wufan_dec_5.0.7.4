package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.db.tables.CloudBackupsDataTable;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.CloudBackupsCanUseBean;
import com.join.mgps.dto.CloudBackupsDataBean;
import com.join.mgps.dto.CloudBackupsRecoverListBean;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.cloud_recoding_layout)
/* loaded from: classes4.dex */
public class CloudRecodingActivity extends BaseActivity {
    @Extra

    /* renamed from: b  reason: collision with root package name */
    boolean f28958b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f28959c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f28960d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f28961e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f28962f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f28963g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f28964h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f28965i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ImageView f28966j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ImageView f28967k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    ImageView f28968l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    ProgressBar f28969m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    ProgressBar f28970n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    ProgressBar f28971o;

    /* renamed from: p  reason: collision with root package name */
    private Context f28972p;

    /* renamed from: q  reason: collision with root package name */
    private com.wufan.user.service.protobuf.n0 f28973q;

    /* renamed from: r  reason: collision with root package name */
    com.join.mgps.rpc.b f28974r;
    @Extra

    /* renamed from: s  reason: collision with root package name */
    CloudBackupsCanUseBean f28975s;

    private void g0(CloudBackupsDataBean cloudBackupsDataBean, String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        String str2 = str + File.separator + cloudBackupsDataBean.getGame_id() + ".zip";
        File file2 = new File(str2);
        if (file2.exists()) {
            UtilsMy.delete(file2);
        }
        try {
            URLConnection openConnection = new URL(cloudBackupsDataBean.getFile()).openConnection();
            openConnection.getContentLength();
            InputStream inputStream = openConnection.getInputStream();
            byte[] bArr = new byte[10240];
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    inputStream.close();
                    CloudBackupsDataTable cloudBackupsDataTable = new CloudBackupsDataTable();
                    cloudBackupsDataTable.setDownFinish(true);
                    cloudBackupsDataTable.setFilePath(str2);
                    cloudBackupsDataTable.setGameId(cloudBackupsDataBean.getGame_id());
                    b2.h.o().m(cloudBackupsDataTable);
                    return;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f28974r = com.join.mgps.rpc.impl.a.c0();
        this.f28972p = this;
        h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void h0() {
        String str = com.join.mgps.pref.h.n(this.f28972p).g() + "recoverdata";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f28973q = AccountUtil_.getInstance_(this.f28972p).getAccountData();
        AccountResultMainBean<CloudBackupsRecoverListBean> K = this.f28974r.K(this.f28973q.getUid() + "", this.f28973q.getToken(), this.f28975s.getRid());
        if (K == null || K.getError() != 0) {
            return;
        }
        for (CloudBackupsDataBean cloudBackupsDataBean : K.getData().getGame_list()) {
            String game_id = cloudBackupsDataBean.getGame_id();
            cloudBackupsDataBean.getFile();
            if (p1.f.K().F(game_id) == null) {
                g0(cloudBackupsDataBean, str);
                Intent intent = new Intent();
                intent.setAction(o1.a.f72018p);
                intent.putExtra("gameId", game_id);
                this.f28972p.sendBroadcast(intent);
            }
        }
    }
}
