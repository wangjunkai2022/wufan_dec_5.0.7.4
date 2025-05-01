package com.join.mgps.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.BaseActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.album.MyAlbumActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.adapter.e6;
import com.join.mgps.dto.UploadDialogBean;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.UpLoadGameConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.upload_layout)
/* loaded from: classes4.dex */
public class UploadActivity extends BaseActivity {
    private static final String H = Environment.getExternalStorageDirectory().getPath() + "/wufan91/upload";
    private static final String I = Environment.getExternalStorageDirectory().getPath() + "/wufan91/upload/img";
    @Pref
    static PrefDef_ J = null;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = -1;
    public static final String N = "upload";
    public static final String O = "upload_result";
    @ViewById
    ScrollView A;
    @ViewById
    LinearLayout B;
    @ViewById
    LinearLayout C;
    @ViewById
    LinearLayout D;
    @ViewById
    TextView E;
    @ViewById
    TextView F;
    @ViewById
    TextView G;

    /* renamed from: b  reason: collision with root package name */
    private File f38307b;

    /* renamed from: c  reason: collision with root package name */
    List<UploadDialogBean> f38308c;

    /* renamed from: d  reason: collision with root package name */
    List<UploadDialogBean> f38309d;

    /* renamed from: e  reason: collision with root package name */
    UploadDialogBean f38310e;

    /* renamed from: f  reason: collision with root package name */
    UploadDialogBean f38311f;

    /* renamed from: g  reason: collision with root package name */
    c f38312g;

    /* renamed from: h  reason: collision with root package name */
    b f38313h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f38314i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f38315j;

    /* renamed from: k  reason: collision with root package name */
    File f38316k;

    /* renamed from: l  reason: collision with root package name */
    File f38317l;

    /* renamed from: m  reason: collision with root package name */
    File f38318m;

    /* renamed from: n  reason: collision with root package name */
    File f38319n;

    /* renamed from: o  reason: collision with root package name */
    File f38320o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    TextView f38321p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    TextView f38322q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    SimpleDraweeView f38323r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    SimpleDraweeView f38324s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    SimpleDraweeView f38325t;

    /* renamed from: u  reason: collision with root package name */
    File f38326u;

    /* renamed from: v  reason: collision with root package name */
    File f38327v;

    /* renamed from: w  reason: collision with root package name */
    UpLoadGameConfig f38328w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    EditText f38329x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    EditText f38330y;

    /* renamed from: z  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f38331z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.android.app.common.http.b {
        a() {
        }

        @Override // com.join.android.app.common.http.b
        public void a(Object obj) {
            System.out.println("onFailure--------------");
            if (UploadActivity.J.upLoadState().d().equals(1)) {
                UploadActivity.J.upLoadState().g(-1);
                Intent intent = new Intent(UploadActivity.N);
                intent.putExtra("upload_result", -1);
                UploadActivity.this.sendBroadcast(intent);
            }
        }

        @Override // com.join.android.app.common.http.b
        public void onSuccess(Object obj) {
            System.out.println("onSuccess--------------");
            if (UploadActivity.J.upLoadState().d().equals(1)) {
                UploadActivity.J.upLoadState().g(0);
                UploadActivity.J.upLoadConfig().i();
                File file = new File(UploadActivity.J.upLoadFileName().d());
                if (file.exists()) {
                    file.delete();
                }
                UploadActivity.J.upLoadFileName().i();
                Intent intent = new Intent(UploadActivity.N);
                intent.putExtra("upload_result", 0);
                UploadActivity.this.sendBroadcast(intent);
                UploadActivity.this.A0();
            }
        }
    }

    private boolean h0() {
        if (TextUtils.isEmpty(this.f38329x.getText().toString())) {
            com.join.mgps.Util.l2.a(this).b("游戏名称不能为空");
            return false;
        } else if (this.f38310e == null) {
            com.join.mgps.Util.l2.a(this).b("游戏分类不能为空");
            return false;
        } else if (this.f38311f == null) {
            com.join.mgps.Util.l2.a(this).b("平台类型不能为空");
            return false;
        } else if (this.f38316k == null) {
            com.join.mgps.Util.l2.a(this).b("请选择游戏");
            return false;
        } else if (this.f38317l == null) {
            com.join.mgps.Util.l2.a(this).b("请选择图标");
            return false;
        } else if (this.f38318m == null) {
            com.join.mgps.Util.l2.a(this).b("请选择截图");
            return false;
        } else if (TextUtils.isEmpty(this.f38330y.getText().toString())) {
            com.join.mgps.Util.l2.a(this).b("游戏说明不能为空");
            return false;
        } else {
            return true;
        }
    }

    private void init() {
        t0();
        s0();
        c cVar = new c(this);
        this.f38312g = cVar;
        cVar.a(this.f38308c);
        this.f38312g.b("选择游戏分类");
        b bVar = new b(this);
        this.f38313h = bVar;
        bVar.a(this.f38309d);
        this.f38313h.b("选择游戏平台");
        this.f38328w = new UpLoadGameConfig();
        J.upLoadConfig().i();
        File file = new File(J.upLoadFileName().d());
        if (file.exists()) {
            file.delete();
        }
        J.upLoadFileName().i();
    }

    private boolean j0(File file, File file2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return true;
                }
            }
        } catch (IOException unused) {
            return false;
        }
    }

    private boolean k0(File file) {
        if (file.isDirectory()) {
            for (String str : file.list()) {
                if (!k0(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    private String o0() {
        String str = ".zip";
        try {
            if (!TextUtils.isEmpty(this.f38329x.getText().toString().trim())) {
                str = this.f38329x.getText().toString().trim() + "-" + this.f38331z.getAccount() + "-" + System.currentTimeMillis() + ".zip";
            } else {
                String[] split = J.upLoadConfig().d().split(m.a.f71490d);
                str = split[2] + "-" + this.f38331z.getAccount() + "-" + System.currentTimeMillis() + ".zip";
            }
        } catch (Exception unused) {
            str = this.f38331z.getAccount() + "-" + System.currentTimeMillis() + str;
        }
        return Environment.getExternalStorageDirectory().getPath() + "/wufan91/upload/" + str;
    }

    private void s0() {
        this.f38309d = new ArrayList();
        UploadDialogBean uploadDialogBean = new UploadDialogBean();
        Boolean bool = Boolean.FALSE;
        uploadDialogBean.setIsSelect(bool);
        uploadDialogBean.setName("街机");
        uploadDialogBean.setCode(31);
        this.f38309d.add(uploadDialogBean);
        UploadDialogBean uploadDialogBean2 = new UploadDialogBean();
        uploadDialogBean2.setIsSelect(bool);
        uploadDialogBean2.setName("gba");
        uploadDialogBean2.setCode(33);
        this.f38309d.add(uploadDialogBean2);
        UploadDialogBean uploadDialogBean3 = new UploadDialogBean();
        uploadDialogBean3.setIsSelect(bool);
        uploadDialogBean3.setName("psp");
        uploadDialogBean3.setCode(34);
        this.f38309d.add(uploadDialogBean3);
        UploadDialogBean uploadDialogBean4 = new UploadDialogBean();
        uploadDialogBean4.setIsSelect(bool);
        uploadDialogBean4.setName("fc");
        uploadDialogBean4.setCode(35);
        this.f38309d.add(uploadDialogBean4);
        UploadDialogBean uploadDialogBean5 = new UploadDialogBean();
        uploadDialogBean5.setIsSelect(bool);
        uploadDialogBean5.setName("nds");
        uploadDialogBean5.setCode(32);
        this.f38309d.add(uploadDialogBean5);
        UploadDialogBean uploadDialogBean6 = new UploadDialogBean();
        uploadDialogBean6.setIsSelect(bool);
        uploadDialogBean6.setName("sfc");
        uploadDialogBean6.setCode(43);
        this.f38309d.add(uploadDialogBean6);
        UploadDialogBean uploadDialogBean7 = new UploadDialogBean();
        uploadDialogBean7.setIsSelect(bool);
        uploadDialogBean7.setName(q.a.f73126a);
        uploadDialogBean7.setCode(46);
        this.f38309d.add(uploadDialogBean7);
        UploadDialogBean uploadDialogBean8 = new UploadDialogBean();
        uploadDialogBean8.setIsSelect(bool);
        uploadDialogBean8.setName("md");
        uploadDialogBean8.setCode(51);
        this.f38309d.add(uploadDialogBean8);
    }

    private void t0() {
        this.f38308c = new ArrayList();
        UploadDialogBean uploadDialogBean = new UploadDialogBean();
        Boolean bool = Boolean.FALSE;
        uploadDialogBean.setIsSelect(bool);
        uploadDialogBean.setName("格斗游戏");
        uploadDialogBean.setCode(18);
        this.f38308c.add(uploadDialogBean);
        UploadDialogBean uploadDialogBean2 = new UploadDialogBean();
        uploadDialogBean2.setIsSelect(bool);
        uploadDialogBean2.setName("策略游戏");
        uploadDialogBean2.setCode(19);
        this.f38308c.add(uploadDialogBean2);
        UploadDialogBean uploadDialogBean3 = new UploadDialogBean();
        uploadDialogBean3.setIsSelect(bool);
        uploadDialogBean3.setName("角色扮演");
        uploadDialogBean3.setCode(20);
        this.f38308c.add(uploadDialogBean3);
        UploadDialogBean uploadDialogBean4 = new UploadDialogBean();
        uploadDialogBean4.setIsSelect(bool);
        uploadDialogBean4.setName("竞速游戏");
        uploadDialogBean4.setCode(21);
        this.f38308c.add(uploadDialogBean4);
        UploadDialogBean uploadDialogBean5 = new UploadDialogBean();
        uploadDialogBean5.setIsSelect(bool);
        uploadDialogBean5.setName("体育游戏");
        uploadDialogBean5.setCode(22);
        this.f38308c.add(uploadDialogBean5);
        UploadDialogBean uploadDialogBean6 = new UploadDialogBean();
        uploadDialogBean6.setIsSelect(bool);
        uploadDialogBean6.setName("休闲益智");
        uploadDialogBean6.setCode(23);
        this.f38308c.add(uploadDialogBean6);
        UploadDialogBean uploadDialogBean7 = new UploadDialogBean();
        uploadDialogBean7.setIsSelect(bool);
        uploadDialogBean7.setName("动作游戏");
        uploadDialogBean7.setCode(24);
        this.f38308c.add(uploadDialogBean7);
        UploadDialogBean uploadDialogBean8 = new UploadDialogBean();
        uploadDialogBean8.setIsSelect(bool);
        uploadDialogBean8.setName("射击飞行");
        uploadDialogBean8.setCode(25);
        this.f38308c.add(uploadDialogBean8);
    }

    private boolean u0(File file) {
        return new BigDecimal(file.length()).divide(new BigDecimal(1048576), 2, 0).floatValue() <= 2.0f;
    }

    private boolean v0(String str) {
        return str.contains("jpg") || str.contains("png");
    }

    private void x0() {
        File file = new File(I);
        this.f38326u = file;
        if (file.exists()) {
            k0(this.f38326u);
        }
        this.f38326u.mkdirs();
        File file2 = this.f38317l;
        if (file2 != null && file2.exists()) {
            if (this.f38317l.getName().contains("png")) {
                File file3 = this.f38317l;
                j0(file3, new File(this.f38326u.getAbsolutePath() + "/icon.png"));
            } else if (this.f38317l.getName().contains("jpg")) {
                File file4 = this.f38317l;
                j0(file4, new File(this.f38326u.getAbsolutePath() + "/icon.jpg"));
            }
        }
        File file5 = this.f38318m;
        if (file5 != null && file5.exists()) {
            if (this.f38318m.getName().contains("png")) {
                File file6 = this.f38318m;
                j0(file6, new File(this.f38326u.getAbsolutePath() + "/img_1.png"));
            } else if (this.f38317l.getName().contains("jpg")) {
                File file7 = this.f38318m;
                j0(file7, new File(this.f38326u.getAbsolutePath() + "/img_1.jpg"));
            }
        }
        File file8 = this.f38319n;
        if (file8 != null && file8.exists()) {
            if (this.f38319n.getName().contains("png")) {
                File file9 = this.f38319n;
                j0(file9, new File(this.f38326u.getAbsolutePath() + "/img_2.png"));
            } else if (this.f38317l.getName().contains("jpg")) {
                File file10 = this.f38319n;
                j0(file10, new File(this.f38326u.getAbsolutePath() + "/img_2.jpg"));
            }
        }
        File file11 = this.f38320o;
        if (file11 == null || !file11.exists()) {
            return;
        }
        if (this.f38320o.getName().contains("png")) {
            File file12 = this.f38320o;
            j0(file12, new File(this.f38326u.getAbsolutePath() + "/img_3.png"));
        } else if (this.f38317l.getName().contains("jpg")) {
            File file13 = this.f38320o;
            j0(file13, new File(this.f38326u.getAbsolutePath() + "/img_3.jpg"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A0() {
        Toast.makeText(getApplicationContext(), "上传完成", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void B0() {
        try {
            com.join.android.app.common.http.h.b().a(this.f38327v.getName());
            J.upLoadState().g(-1);
            Intent intent = new Intent(N);
            intent.putExtra("upload_result", 1);
            sendBroadcast(intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Background
    public void C0(Context context, UpLoadGameConfig upLoadGameConfig, File file) {
        if (file.exists()) {
            com.join.android.app.common.http.h.b().h(context, upLoadGameConfig, file, new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D0() {
        com.join.mgps.Util.l2.a(this).b("开始上传");
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {N}, registerAt = Receiver.RegisterAt.OnResumeOnPause)
    public void E0(@Receiver.Extra("upload_result") int i4) {
        if (i4 == 0) {
            I0();
        } else if (i4 == -1) {
            H0();
        } else if (i4 == 1) {
            H0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void F0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            if (h0()) {
                J0();
                D0();
                return;
            }
            return;
        }
        com.join.mgps.Util.l2.a(this).b("网络异常");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void G0() {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(8);
        intentDateBean.setLink_type_val("12449");
        IntentUtil.getInstance().intentActivity(this, intentDateBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void H0() {
        this.A.setVisibility(8);
        this.B.setVisibility(8);
        this.C.setVisibility(8);
        this.D.setVisibility(8);
        File file = new File(J.upLoadFileName().d());
        String d5 = J.upLoadConfig().d();
        if (file.exists() && !TextUtils.isEmpty(d5)) {
            this.C.setVisibility(0);
            TextView textView = this.F;
            textView.setText("你的游戏 " + J.upLoadGame().d() + " 上传已终止");
            return;
        }
        J.upLoadState().g(0);
        this.A.setVisibility(0);
        init();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void I0() {
        this.D.setVisibility(0);
        this.A.setVisibility(8);
        this.B.setVisibility(8);
        this.C.setVisibility(8);
        TextView textView = this.G;
        textView.setText("游戏 " + J.upLoadGame().d() + " 已上传成功，感谢分享");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void J0() {
        this.f38328w.setUid(this.f38331z.getUid());
        this.f38328w.setToken(this.f38331z.getToken());
        this.f38328w.setGame_name(this.f38329x.getText().toString());
        this.f38328w.setGame_type(this.f38310e.getCode());
        this.f38328w.setGame_platform_type(this.f38311f.getCode());
        this.f38328w.setGame_explain(this.f38330y.getText().toString());
        x0();
        String o02 = o0();
        File file = new File(o02);
        this.f38327v = file;
        if (file.exists()) {
            this.f38327v.delete();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f38316k);
        arrayList.add(this.f38326u);
        J.upLoadFileName().g(o02);
        if (J.upLoadState().d().intValue() != 1) {
            J.upLoadState().g(1);
            J.upLoadGame().g(this.f38329x.getText().toString());
            J.upLoadConfig().i();
            if (this.f38328w != null) {
                J.upLoadConfig().g(this.f38328w.toString());
            }
            try {
                com.join.mgps.Util.w2.m(arrayList, this.f38327v, "");
                C0(this, this.f38328w, this.f38327v);
            } catch (IOException unused) {
                J.upLoadState().g(-1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.f38331z = AccountUtil_.getInstance_(this).getAccountData();
        if (J.upLoadState().d().intValue() == 0) {
            String d5 = J.upLoadGame().d();
            if (TextUtils.isEmpty(d5)) {
                this.A.setVisibility(0);
                init();
                return;
            }
            this.D.setVisibility(0);
            TextView textView = this.G;
            textView.setText("游戏 " + d5 + " 已上传成功，感谢分享");
        } else if (J.upLoadState().d().intValue() == 1) {
            this.B.setVisibility(0);
            TextView textView2 = this.E;
            textView2.setText("你的游戏 " + J.upLoadGame().d() + " 正在上传中");
        } else if (J.upLoadState().d().intValue() == -1) {
            File file = new File(J.upLoadFileName().d());
            String d6 = J.upLoadConfig().d();
            if (file.exists() && !TextUtils.isEmpty(d6)) {
                this.C.setVisibility(0);
                TextView textView3 = this.F;
                textView3.setText("你的游戏 " + J.upLoadGame().d() + " 上传已中止");
                return;
            }
            J.upLoadState().g(0);
            this.A.setVisibility(0);
            init();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            J.upLoadGame().i();
            this.D.setVisibility(8);
            this.A.setVisibility(0);
            init();
            return;
        }
        com.join.mgps.Util.l2.a(this).b("网络异常");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        startActivityForResult(new Intent(this, SDCardFileExplorerActivity_.class), 100);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        p0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        this.f38312g.show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        ArrayList<String> stringArrayListExtra;
        ArrayList<String> stringArrayListExtra2;
        super.onActivityResult(i4, i5, intent);
        if (i5 == 100) {
            File file = (File) intent.getSerializableExtra("srcFile");
            this.f38316k = file;
            this.f38321p.setText(file.getName());
        } else if (i4 == 200) {
            if (intent == null || (stringArrayListExtra2 = intent.getStringArrayListExtra(MyAlbumActivity.f14984x)) == null || stringArrayListExtra2.size() <= 0) {
                return;
            }
            if (v0(stringArrayListExtra2.get(0))) {
                File file2 = new File(stringArrayListExtra2.get(0));
                this.f38317l = file2;
                this.f38322q.setText(file2.getName());
                return;
            }
            com.join.mgps.Util.l2.a(this).b("请选择PNG或JPG格式图片");
        } else if (i4 != 300 || intent == null || (stringArrayListExtra = intent.getStringArrayListExtra(MyAlbumActivity.f14984x)) == null || stringArrayListExtra.size() <= 0) {
        } else {
            if (stringArrayListExtra.size() == 1) {
                if (v0(stringArrayListExtra.get(0))) {
                    this.f38323r.setVisibility(0);
                    this.f38324s.setVisibility(8);
                    this.f38325t.setVisibility(8);
                    File file3 = new File(stringArrayListExtra.get(0));
                    this.f38318m = file3;
                    this.f38319n = null;
                    this.f38320o = null;
                    if (u0(file3)) {
                        MyImageLoader.h(this.f38323r, stringArrayListExtra.get(0));
                        return;
                    }
                    com.join.mgps.Util.l2.a(this).b("为了你的流量，上传图片不能超过2M哦");
                    this.f38318m.delete();
                    this.f38318m = null;
                    return;
                }
                com.join.mgps.Util.l2.a(this).b("请选择PNG或JPG格式图片");
            } else if (stringArrayListExtra.size() == 2) {
                if (v0(stringArrayListExtra.get(0)) && v0(stringArrayListExtra.get(1))) {
                    this.f38323r.setVisibility(0);
                    this.f38324s.setVisibility(0);
                    this.f38325t.setVisibility(8);
                    this.f38318m = new File(stringArrayListExtra.get(0));
                    this.f38319n = new File(stringArrayListExtra.get(1));
                    this.f38320o = null;
                    if (u0(this.f38318m) && u0(this.f38319n)) {
                        MyImageLoader.h(this.f38323r, stringArrayListExtra.get(0));
                        MyImageLoader.h(this.f38324s, stringArrayListExtra.get(1));
                        return;
                    }
                    com.join.mgps.Util.l2.a(this).b("为了你的流量，上传图片不能超过2M哦");
                    this.f38318m.delete();
                    this.f38319n.delete();
                    this.f38318m = null;
                    this.f38319n = null;
                    return;
                }
                com.join.mgps.Util.l2.a(this).b("请选择PNG或JPG格式图片");
            } else if (stringArrayListExtra.size() >= 3) {
                if (v0(stringArrayListExtra.get(0)) && v0(stringArrayListExtra.get(1)) && v0(stringArrayListExtra.get(2))) {
                    this.f38323r.setVisibility(0);
                    this.f38324s.setVisibility(0);
                    this.f38325t.setVisibility(0);
                    this.f38318m = new File(stringArrayListExtra.get(0));
                    this.f38319n = new File(stringArrayListExtra.get(1));
                    this.f38320o = new File(stringArrayListExtra.get(2));
                    if (u0(this.f38318m) && u0(this.f38319n) && u0(this.f38320o)) {
                        MyImageLoader.h(this.f38323r, stringArrayListExtra.get(0));
                        MyImageLoader.h(this.f38324s, stringArrayListExtra.get(1));
                        MyImageLoader.h(this.f38325t, stringArrayListExtra.get(2));
                        return;
                    }
                    com.join.mgps.Util.l2.a(this).b("为了你的流量，上传图片不能超过2M哦");
                    this.f38318m.delete();
                    this.f38319n.delete();
                    this.f38320o.delete();
                    this.f38318m = null;
                    this.f38319n = null;
                    this.f38320o = null;
                    return;
                }
                com.join.mgps.Util.l2.a(this).b("请选择PNG或JPG格式图片");
            }
        }
    }

    public void p0() {
        Intent intent = new Intent(this, MyAlbumActivity.class);
        intent.putExtra("MAX_PICK_SIZE", 1);
        startActivityForResult(intent, 200);
    }

    public void q0() {
        Intent intent = new Intent(this, MyAlbumActivity.class);
        intent.putExtra("MAX_PICK_SIZE", 3);
        startActivityForResult(intent, 300);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void r0() {
        q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void w0() {
        this.f38313h.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void y0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            J.upLoadGame().i();
            this.D.setVisibility(8);
            this.C.setVisibility(8);
            this.B.setVisibility(8);
            this.A.setVisibility(0);
            init();
            return;
        }
        com.join.mgps.Util.l2.a(this).b("网络异常");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void z0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                File file = new File(J.upLoadFileName().d());
                String[] split = J.upLoadConfig().d().split(m.a.f71490d);
                UpLoadGameConfig upLoadGameConfig = new UpLoadGameConfig();
                upLoadGameConfig.setUid(Integer.parseInt(split[0]));
                upLoadGameConfig.setToken(split[1]);
                upLoadGameConfig.setGame_name(split[2]);
                upLoadGameConfig.setGame_type(Integer.parseInt(split[3]));
                upLoadGameConfig.setGame_platform_type(Integer.parseInt(split[4]));
                upLoadGameConfig.setGame_explain(split[5]);
                C0(this, upLoadGameConfig, file);
                com.join.mgps.Util.l2.a(this).b("开始上传");
                J.upLoadState().g(1);
            } catch (Exception unused) {
                com.join.mgps.Util.l2.a(this).b("上传失败");
                J.upLoadState().g(0);
            }
            finish();
            return;
        }
        com.join.mgps.Util.l2.a(this).b("网络异常");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends Dialog {

        /* renamed from: b  reason: collision with root package name */
        ListView f38333b;

        /* renamed from: c  reason: collision with root package name */
        Context f38334c;

        /* renamed from: d  reason: collision with root package name */
        e6 f38335d;

        /* renamed from: e  reason: collision with root package name */
        TextView f38336e;

        /* renamed from: f  reason: collision with root package name */
        UploadDialogBean f38337f;

        /* loaded from: classes4.dex */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ UploadActivity f38339b;

            a(UploadActivity uploadActivity) {
                this.f38339b = uploadActivity;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                UploadDialogBean uploadDialogBean = (UploadDialogBean) adapterView.getItemAtPosition(i4);
                uploadDialogBean.setIsSelect(Boolean.TRUE);
                UploadDialogBean uploadDialogBean2 = UploadActivity.this.f38311f;
                if (uploadDialogBean2 != null) {
                    uploadDialogBean2.setIsSelect(Boolean.FALSE);
                }
                b.this.f38335d.notifyDataSetChanged();
                UploadActivity uploadActivity = UploadActivity.this;
                uploadActivity.f38311f = uploadDialogBean;
                uploadActivity.f38315j.setText(uploadDialogBean.getName());
                b.this.dismiss();
            }
        }

        public b(Context context) {
            super(context, R.style.dialog_error);
            this.f38334c = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_upload, (ViewGroup) null);
            setContentView(inflate);
            ListView listView = (ListView) inflate.findViewById(R.id.listView);
            this.f38333b = listView;
            listView.setOnItemClickListener(new a(UploadActivity.this));
            this.f38336e = (TextView) inflate.findViewById(R.id.name);
            setCancelable(true);
            setCanceledOnTouchOutside(true);
        }

        public void a(List<UploadDialogBean> list) {
            e6 e6Var = new e6(this.f38334c, list);
            this.f38335d = e6Var;
            this.f38333b.setAdapter((ListAdapter) e6Var);
        }

        public void b(String str) {
            this.f38336e.setText(str);
        }

        public b(Context context, int i4) {
            super(context, i4);
            this.f38334c = context;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends Dialog {

        /* renamed from: b  reason: collision with root package name */
        ListView f38341b;

        /* renamed from: c  reason: collision with root package name */
        Context f38342c;

        /* renamed from: d  reason: collision with root package name */
        e6 f38343d;

        /* renamed from: e  reason: collision with root package name */
        TextView f38344e;

        /* renamed from: f  reason: collision with root package name */
        UploadDialogBean f38345f;

        /* loaded from: classes4.dex */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ UploadActivity f38347b;

            a(UploadActivity uploadActivity) {
                this.f38347b = uploadActivity;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                UploadDialogBean uploadDialogBean = (UploadDialogBean) adapterView.getItemAtPosition(i4);
                uploadDialogBean.setIsSelect(Boolean.TRUE);
                UploadDialogBean uploadDialogBean2 = UploadActivity.this.f38310e;
                if (uploadDialogBean2 != null) {
                    uploadDialogBean2.setIsSelect(Boolean.FALSE);
                }
                c.this.f38343d.notifyDataSetChanged();
                UploadActivity uploadActivity = UploadActivity.this;
                uploadActivity.f38310e = uploadDialogBean;
                uploadActivity.f38314i.setText(uploadDialogBean.getName());
                c.this.dismiss();
            }
        }

        public c(Context context) {
            super(context, R.style.dialog_error);
            this.f38342c = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_upload, (ViewGroup) null);
            setContentView(inflate);
            ListView listView = (ListView) inflate.findViewById(R.id.listView);
            this.f38341b = listView;
            listView.setOnItemClickListener(new a(UploadActivity.this));
            this.f38344e = (TextView) inflate.findViewById(R.id.name);
            setCancelable(true);
            setCanceledOnTouchOutside(true);
        }

        public void a(List<UploadDialogBean> list) {
            e6 e6Var = new e6(this.f38342c, list);
            this.f38343d = e6Var;
            this.f38341b.setAdapter((ListAdapter) e6Var);
        }

        public void b(String str) {
            this.f38344e.setText(str);
        }

        public c(Context context, int i4) {
            super(context, i4);
            this.f38342c = context;
        }
    }
}
