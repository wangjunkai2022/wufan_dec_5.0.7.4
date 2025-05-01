package com.join.mgps.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.CloudBackupsCanUseBean;
import com.join.mgps.dto.CloudBackupsListBean;
import java.io.File;
import java.sql.Date;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.mycloud_backups_layout)
/* loaded from: classes4.dex */
public class MYCloudBackupsActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    ListView f35092b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f35093c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ImageView f35094d;

    /* renamed from: e  reason: collision with root package name */
    private Context f35095e;

    /* renamed from: f  reason: collision with root package name */
    private com.wufan.user.service.protobuf.n0 f35096f;

    /* renamed from: g  reason: collision with root package name */
    com.join.mgps.rpc.b f35097g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f35098b;

        a(b bVar) {
            this.f35098b = bVar;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            CloudBackupsDetialActivity_.i0(MYCloudBackupsActivity.this.f35095e).a(this.f35098b.getItem(i4)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        List<CloudBackupsCanUseBean> f35100b;

        /* renamed from: c  reason: collision with root package name */
        private LayoutInflater f35101c;

        public b(List<CloudBackupsCanUseBean> list) {
            this.f35100b = list;
            this.f35101c = LayoutInflater.from(MYCloudBackupsActivity.this.f35095e);
        }

        @Override // android.widget.Adapter
        /* renamed from: a */
        public CloudBackupsCanUseBean getItem(int i4) {
            return this.f35100b.get(i4);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f35100b.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.f35101c.inflate(R.layout.cloudbackups_can_list, (ViewGroup) null);
            }
            ((TextView) com.join.mgps.Util.s2.a(view, R.id.phoneType)).setText(this.f35100b.get(i4).getBrand_name());
            ((TextView) com.join.mgps.Util.s2.a(view, R.id.upTime)).setText(com.join.mgps.Util.y.e(new Date(Long.parseLong(this.f35100b.get(i4).getAdd_time()) * 1000), "yyyy-MM.dd HH:mm:ss"));
            ((TextView) com.join.mgps.Util.s2.a(view, R.id.handOrAuto)).setText("自动");
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f35097g = com.join.mgps.rpc.impl.a.c0();
        this.f35095e = this;
        this.f35093c.setText("我的云备份");
        this.f35094d.setImageResource(R.drawable.settingicon);
        this.f35094d.setVisibility(0);
        h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void h0() {
        File file = new File(com.join.mgps.pref.h.n(this.f35095e).g() + "recoverdata");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f35096f = AccountUtil_.getInstance_(this.f35095e).getAccountData();
        com.join.mgps.rpc.b bVar = this.f35097g;
        AccountResultMainBean<CloudBackupsListBean> T = bVar.T(this.f35096f.getUid() + "", this.f35096f.getToken());
        if (T == null || T.getError() != 0) {
            return;
        }
        j0(T.getData().getBackup_list());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0(List<CloudBackupsCanUseBean> list) {
        b bVar = new b(list);
        this.f35092b.setAdapter((ListAdapter) bVar);
        this.f35092b.setOnItemClickListener(new a(bVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
    }
}
