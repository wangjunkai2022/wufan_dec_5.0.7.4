package com.join.mgps.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.BaseActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.CloudCreateInfo;
import com.join.mgps.dto.CloudInfo;
import com.join.mgps.dto.CloudStatus;
import com.join.mgps.dto.CloudUploadInfo;
import com.join.mgps.dto.GameWorldResponse;
import com.join.mgps.dto.RomArchived;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.util.LinkedMultiValueMap;
@EActivity(R.layout.cloud)
/* loaded from: classes4.dex */
public class CloudActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    ListView f28861b;

    /* renamed from: c  reason: collision with root package name */
    List<DownloadTask> f28862c;

    /* renamed from: d  reason: collision with root package name */
    List<CloudInfo> f28863d;

    /* renamed from: e  reason: collision with root package name */
    List<CloudInfo> f28864e;

    /* renamed from: f  reason: collision with root package name */
    i f28865f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    Button f28866g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f28867h;

    /* renamed from: i  reason: collision with root package name */
    com.join.mgps.rpc.l f28868i;

    /* renamed from: n  reason: collision with root package name */
    boolean f28873n;

    /* renamed from: o  reason: collision with root package name */
    com.join.mgps.dialog.z f28874o;

    /* renamed from: p  reason: collision with root package name */
    boolean f28875p;

    /* renamed from: r  reason: collision with root package name */
    int f28877r;

    /* renamed from: j  reason: collision with root package name */
    Map<Long, File> f28869j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    List<Long> f28870k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    Map<String, File> f28871l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    int f28872m = 0;

    /* renamed from: q  reason: collision with root package name */
    int f28876q = 0;

    /* renamed from: s  reason: collision with root package name */
    boolean f28878s = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ImageView f28879b;

        a(ImageView imageView) {
            this.f28879b = imageView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CloudActivity.this.f28873n) {
                this.f28879b.setImageResource(R.drawable.cloud_select_no);
            } else {
                this.f28879b.setImageResource(R.drawable.cloud_select_yes);
            }
            CloudActivity cloudActivity = CloudActivity.this;
            cloudActivity.f28873n = !cloudActivity.f28873n;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.dialog.v f28881b;

        b(com.join.mgps.dialog.v vVar) {
            this.f28881b = vVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f28881b.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.dialog.v f28883b;

        c(com.join.mgps.dialog.v vVar) {
            this.f28883b = vVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CloudActivity cloudActivity = CloudActivity.this;
            com.join.mgps.Util.e2.j(cloudActivity, "showFirst", Boolean.valueOf(cloudActivity.f28873n));
            this.f28883b.dismiss();
            CloudActivity.this.r0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CloudActivity.this.f28878s = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CloudActivity.this.f28874o.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CloudActivity.this.f28874o.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements com.join.android.app.common.http.b {
        g() {
        }

        @Override // com.join.android.app.common.http.b
        public void a(Object obj) {
            com.join.mgps.Util.v0.g("onFailed----------");
        }

        @Override // com.join.android.app.common.http.b
        public void onSuccess(Object obj) {
            try {
                if (new JSONObject((String) obj).optJSONObject("data").optString("status").equals("ok")) {
                    CloudActivity.this.f28876q++;
                    com.join.mgps.Util.v0.g("ok------------" + CloudActivity.this.f28876q);
                    CloudActivity cloudActivity = CloudActivity.this;
                    cloudActivity.k0(cloudActivity.f28876q, cloudActivity.f28871l.size());
                    CloudActivity cloudActivity2 = CloudActivity.this;
                    if (cloudActivity2.f28876q == cloudActivity2.f28871l.size()) {
                        CloudActivity.this.uploadSuccess();
                    }
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes4.dex */
    class h implements com.join.android.app.common.http.b {
        h() {
        }

        @Override // com.join.android.app.common.http.b
        public void a(Object obj) {
            System.out.println("onFailure--------------");
        }

        @Override // com.join.android.app.common.http.b
        public void onSuccess(Object obj) {
            System.out.println("onSuccess--------------");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i extends BaseAdapter {

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f28891b;

            a(int i4) {
                this.f28891b = i4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CloudRomListActivity_.g0(CloudActivity.this).a(CloudActivity.this.f28863d.get(this.f28891b).getDownloadTask()).start();
            }
        }

        /* loaded from: classes4.dex */
        class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f28893b;

            b(int i4) {
                this.f28893b = i4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CloudInfo cloudInfo = CloudActivity.this.f28863d.get(this.f28893b);
                if (cloudInfo.isSelect()) {
                    cloudInfo.setSelect(false);
                    CloudActivity.this.f28872m--;
                } else {
                    cloudInfo.setSelect(true);
                    CloudActivity.this.f28872m++;
                }
                CloudActivity.this.q0();
            }
        }

        i() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return CloudActivity.this.f28862c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return CloudActivity.this.f28862c.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(CloudActivity.this).inflate(R.layout.cloud_item, (ViewGroup) null);
            }
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.img);
            ((TextView) view.findViewById(R.id.name)).setText(CloudActivity.this.f28863d.get(i4).getDownloadTask().getShowName());
            ((TextView) view.findViewById(R.id.number)).setText("共" + CloudActivity.this.f28863d.get(i4).getRomArchivedNum() + "个存档，" + CloudActivity.this.f28862c.get(i4).getRomArchivedSize() + "MB");
            ImageView imageView = (ImageView) view.findViewById(R.id.select);
            ((LinearLayout) view.findViewById(R.id.main_lay)).setOnClickListener(new a(i4));
            if (CloudActivity.this.f28863d.get(i4).isSelect()) {
                imageView.setImageResource(R.drawable.cloud_select_yes);
            } else {
                imageView.setImageResource(R.drawable.cloud_select_no);
            }
            imageView.setOnClickListener(new b(i4));
            MyImageLoader.h(simpleDraweeView, CloudActivity.this.f28862c.get(i4).getPortraitURL());
            return view;
        }
    }

    /* loaded from: classes4.dex */
    public class j implements Comparator {
        public j() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            CloudInfo cloudInfo = (CloudInfo) obj;
            CloudInfo cloudInfo2 = (CloudInfo) obj2;
            if (cloudInfo.getDownloadTask().getFinishTime() > cloudInfo2.getDownloadTask().getFinishTime()) {
                return 1;
            }
            return cloudInfo.getDownloadTask().getFinishTime() == cloudInfo2.getDownloadTask().getFinishTime() ? 0 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.f28868i = com.join.mgps.rpc.impl.l.n0();
        q0();
        this.f28864e = new ArrayList();
        this.f28863d = new ArrayList();
        this.f28862c = p1.f.K().u();
        for (int i4 = 0; i4 < this.f28862c.size(); i4++) {
            DownloadTask downloadTask = this.f28862c.get(i4);
            CloudInfo cloudInfo = new CloudInfo();
            cloudInfo.setDownloadTask(downloadTask);
            List<RomArchived> l4 = com.join.mgps.Util.g0.l(downloadTask.getPlugin_num(), downloadTask.getGameZipPath());
            cloudInfo.setRomArchiveds(l4);
            cloudInfo.setRomArchivedNum(l4.size());
            long j4 = 0;
            for (RomArchived romArchived : l4) {
                j4 += romArchived.getSize();
            }
            cloudInfo.setRomArchivedSize(j4);
            this.f28863d.add(cloudInfo);
        }
        Collections.sort(this.f28863d, new j());
        i iVar = new i();
        this.f28865f = iVar;
        this.f28861b.setAdapter((ListAdapter) iVar);
    }

    public String g0(int i4, int i5) {
        double d5 = i4;
        Double.isNaN(d5);
        double d6 = i5;
        Double.isNaN(d6);
        return new DecimalFormat("##%").format((d5 * 1.0d) / (d6 * 1.0d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        this.f28872m = 0;
        if (this.f28867h.getText().toString().trim().equals("选择")) {
            for (CloudInfo cloudInfo : this.f28863d) {
                cloudInfo.setSelect(true);
                this.f28872m++;
            }
            this.f28867h.setText("取消");
        } else if (this.f28867h.getText().toString().trim().equals("取消")) {
            for (CloudInfo cloudInfo2 : this.f28863d) {
                cloudInfo2.setSelect(false);
            }
            this.f28872m = 0;
            this.f28867h.setText("选择");
        }
        q0();
    }

    void i0() {
        this.f28875p = true;
        boolean booleanValue = com.join.mgps.Util.e2.f(this, "showFirst", Boolean.FALSE).booleanValue();
        this.f28873n = booleanValue;
        if (booleanValue) {
            com.join.mgps.dialog.v vVar = new com.join.mgps.dialog.v(this, R.style.MyDialog);
            vVar.show();
            TextView textView = (TextView) vVar.findViewById(R.id.cancel);
            TextView textView2 = (TextView) vVar.findViewById(R.id.ok);
            ImageView imageView = (ImageView) vVar.findViewById(R.id.cloud_select_img);
            if (this.f28873n) {
                imageView.setImageResource(R.drawable.cloud_select_yes);
            } else {
                imageView.setImageResource(R.drawable.cloud_select_no);
            }
            imageView.setOnClickListener(new a(imageView));
            textView.setOnClickListener(new b(vVar));
            textView2.setOnClickListener(new c(vVar));
            return;
        }
        r0();
    }

    void j0() {
        com.join.mgps.dialog.z zVar = new com.join.mgps.dialog.z(this, R.style.MyDialog);
        this.f28874o = zVar;
        zVar.show();
        this.f28874o.a("80%");
        this.f28874o.d("中断下载");
        this.f28874o.f("存档下载中，请勿中断网络");
        this.f28874o.c(R.drawable.cloud_progress_icon);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(int i4, int i5) {
        com.join.mgps.dialog.z zVar = this.f28874o;
        if (zVar == null || !zVar.isShowing()) {
            com.join.mgps.dialog.z zVar2 = new com.join.mgps.dialog.z(this, R.style.MyDialog);
            this.f28874o = zVar2;
            zVar2.show();
        }
        this.f28874o.a(g0(i4, i5));
        this.f28874o.d("中断备份");
        this.f28874o.f("存档备份中，请勿中断网络");
        this.f28874o.c(R.drawable.cloud_progress_icon);
        this.f28874o.e(new d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0(int i4, int i5) {
        com.join.mgps.dialog.z zVar = this.f28874o;
        if (zVar == null || !zVar.isShowing()) {
            com.join.mgps.dialog.z zVar2 = new com.join.mgps.dialog.z(this, R.style.MyDialog);
            this.f28874o = zVar2;
            zVar2.show();
        }
        this.f28874o.a(g0(i4, i5));
        this.f28874o.d("完成");
        com.join.mgps.dialog.z zVar3 = this.f28874o;
        zVar3.f("传输中断，已传输" + i4 + "个存档");
        this.f28874o.c(R.drawable.cloud_pass_icon_fail);
        this.f28874o.e(new e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        this.f28874o.b(8);
        this.f28874o.c(R.drawable.cloud_pass_icon_ok);
        this.f28874o.f("成功备份存档");
        this.f28874o.d("完成");
        this.f28874o.e(new f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        if (this.f28875p) {
            return;
        }
        i0();
    }

    @Background
    public void o0(Context context, CloudUploadInfo cloudUploadInfo, File file) {
        if (file.exists()) {
            com.join.android.app.common.http.h.b().e(context, cloudUploadInfo, file, new h());
        }
    }

    void p0() {
        this.f28876q = 0;
        k0(0, this.f28871l.size());
        LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
        linkedMultiValueMap.add("uid", AccountUtil_.getInstance_(getApplicationContext()).getUid());
        linkedMultiValueMap.add("token", AccountUtil_.getInstance_(getApplicationContext()).getToken());
        linkedMultiValueMap.add("brand_name", System.currentTimeMillis() + "");
        GameWorldResponse<CloudCreateInfo> f02 = this.f28868i.f0(linkedMultiValueMap);
        if (f02.getError() == 0) {
            CloudCreateInfo data = f02.getData();
            this.f28877r = data.getRid();
            for (String str : this.f28871l.keySet()) {
                if (this.f28878s) {
                    l0(this.f28876q, this.f28871l.size());
                    return;
                }
                CloudUploadInfo cloudUploadInfo = new CloudUploadInfo();
                cloudUploadInfo.setUid(Integer.parseInt(AccountUtil_.getInstance_(getApplicationContext()).getUid()));
                cloudUploadInfo.setRid(data.getRid());
                cloudUploadInfo.setToken(AccountUtil_.getInstance_(getApplicationContext()).getToken());
                cloudUploadInfo.setGame_id(str);
                com.join.android.app.common.http.h.b().e(this, cloudUploadInfo, this.f28871l.get(str), new g());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        this.f28865f.notifyDataSetChanged();
        int i4 = 0;
        if (this.f28872m == 0) {
            this.f28866g.setEnabled(false);
            this.f28866g.setText("未选中任何存档");
            return;
        }
        this.f28866g.setEnabled(true);
        for (CloudInfo cloudInfo : this.f28863d) {
            if (cloudInfo.isSelect()) {
                i4++;
            }
        }
        Button button = this.f28866g;
        button.setText("备份存档（已选中" + i4 + "款游戏)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void r0() {
        this.f28864e.clear();
        for (CloudInfo cloudInfo : this.f28863d) {
            if (cloudInfo.isSelect()) {
                this.f28864e.add(cloudInfo);
            }
        }
        this.f28871l.clear();
        for (CloudInfo cloudInfo2 : this.f28864e) {
            DownloadTask downloadTask = cloudInfo2.getDownloadTask();
            List<RomArchived> l4 = com.join.mgps.Util.g0.l(downloadTask.getPlugin_num(), downloadTask.getGameZipPath());
            ArrayList arrayList = new ArrayList();
            File file = null;
            for (RomArchived romArchived : l4) {
                File file2 = new File(romArchived.getArchivedPath());
                File file3 = new File(romArchived.getArchivedImagePath());
                if (!this.f28870k.contains(Long.valueOf(com.join.mgps.Util.m.a(file2)))) {
                    arrayList.add(file2);
                    arrayList.add(file3);
                }
                if (file == null) {
                    file = new File(file2.getParent() + File.separator + file2.getParentFile().getName() + ".zip");
                }
            }
            if (file != null) {
                if (file.exists()) {
                    file.delete();
                }
                try {
                    if (arrayList.size() > 0) {
                        com.join.mgps.Util.w2.n(arrayList, file, "");
                        this.f28871l.put(downloadTask.getCrc_link_type_val(), file);
                    }
                    p0();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
        }
        this.f28875p = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void uploadSuccess() {
        LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
        linkedMultiValueMap.add("uid", AccountUtil_.getInstance_(getApplicationContext()).getUid());
        linkedMultiValueMap.add("token", AccountUtil_.getInstance_(getApplicationContext()).getToken());
        linkedMultiValueMap.add("rid", this.f28877r + "");
        CloudStatus data = this.f28868i.V(linkedMultiValueMap).getData();
        if (data.getStatus().equals("ok")) {
            m0();
        }
        com.join.mgps.Util.v0.g("status----" + data.getStatus());
    }
}
