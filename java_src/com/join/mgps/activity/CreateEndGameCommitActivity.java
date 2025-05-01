package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.provider.MediaStore;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.BaseAppCompatActivity;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.data.ArchiveArgs;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.screenshot.ImageFactory;
import com.join.mgps.dto.ArchiveListBean;
import com.join.mgps.dto.BossBean;
import com.join.mgps.dto.RequestCreateEndGameArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.papa91.arc.interfaces.DialogListenerWrap;
import com.vincent.videocompressor.h;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_create_end_game_commit)
/* loaded from: classes4.dex */
public class CreateEndGameCommitActivity extends BaseAppCompatActivity {
    public static final int B = 1001;
    @Extra

    /* renamed from: b  reason: collision with root package name */
    String f29713b;
    @Extra

    /* renamed from: c  reason: collision with root package name */
    BossBean f29714c;
    @Extra

    /* renamed from: d  reason: collision with root package name */
    ArchiveListBean f29715d;

    /* renamed from: e  reason: collision with root package name */
    String f29716e;
    @Extra

    /* renamed from: f  reason: collision with root package name */
    Long f29717f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    EditText f29718g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    EditText f29719h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    StandardVideoView f29720i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f29721j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ImageView f29722k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    RelativeLayout f29723l;

    /* renamed from: m  reason: collision with root package name */
    String f29724m;

    /* renamed from: n  reason: collision with root package name */
    String f29725n;

    /* renamed from: o  reason: collision with root package name */
    String f29726o;

    /* renamed from: p  reason: collision with root package name */
    String f29727p;

    /* renamed from: q  reason: collision with root package name */
    String f29728q;

    /* renamed from: t  reason: collision with root package name */
    com.join.mgps.rpc.k f29731t;

    /* renamed from: x  reason: collision with root package name */
    com.join.mgps.dialog.b0 f29735x;

    /* renamed from: y  reason: collision with root package name */
    com.join.mgps.dialog.m2 f29736y;

    /* renamed from: z  reason: collision with root package name */
    com.join.mgps.dialog.h2 f29737z;

    /* renamed from: r  reason: collision with root package name */
    boolean f29729r = false;

    /* renamed from: s  reason: collision with root package name */
    boolean f29730s = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f29732u = false;

    /* renamed from: v  reason: collision with root package name */
    private boolean f29733v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f29734w = false;
    boolean A = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.android.app.common.http.g {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29738b;

        a(int i4) {
            this.f29738b = i4;
        }

        @Override // com.join.android.app.common.http.g
        public void onRequestProgress(long j4, long j5, boolean z4, String str) {
            if (z4) {
                int i4 = this.f29738b;
                if (i4 == 1) {
                    CreateEndGameCommitActivity.this.f29733v = true;
                    return;
                } else if (i4 == 2) {
                    CreateEndGameCommitActivity.this.f29734w = true;
                    return;
                } else {
                    return;
                }
            }
            CreateEndGameCommitActivity.this.w0((int) ((j4 * 100) / j5));
        }

        @Override // com.join.android.app.common.http.g
        public void onUploadFailed(String str) {
            CreateEndGameCommitActivity.this.showToast(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends DialogListenerWrap {
        b() {
        }

        @Override // com.papa91.arc.interfaces.DialogListenerWrap, com.papa91.arc.interfaces.IDialogListener
        public void onClose() {
            CreateEndGameCommitActivity.this.u0();
        }

        @Override // com.papa91.arc.interfaces.DialogListenerWrap, com.papa91.arc.interfaces.IDialogListener
        public void onConfirm() {
            CreateEndGameCommitActivity.this.u0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements h.a {
        c() {
        }

        @Override // com.vincent.videocompressor.h.a
        public void onFail() {
            CreateEndGameCommitActivity.this.showToast("压缩失败，请重试");
        }

        @Override // com.vincent.videocompressor.h.a
        public void onProgress(float f5) {
            CreateEndGameCommitActivity.this.v0((int) f5);
        }

        @Override // com.vincent.videocompressor.h.a
        public void onStart() {
            CreateEndGameCommitActivity.this.o0();
        }

        @Override // com.vincent.videocompressor.h.a
        public void onSuccess() {
            CreateEndGameCommitActivity.this.p0();
            CreateEndGameCommitActivity.this.showToast("压缩完成");
            PrintStream printStream = System.out;
            printStream.println("压缩完成:" + CreateEndGameCommitActivity.this.f29724m);
        }
    }

    private String j0(Context context, String str) {
        String replace = str.replace("file://", "");
        String str2 = com.join.mgps.Util.v.f28111k + "uploadCoverFile" + replace.substring(replace.lastIndexOf(com.join.mgps.Util.h0.f27805a), replace.length());
        File file = new File(str2);
        try {
            if (!file.exists()) {
                file.getParentFile().mkdirs();
            }
            new ImageFactory().compressAndGenImage(replace, str2, 500, false, context);
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        return str2;
    }

    private String n0(String str) {
        return com.join.mgps.Util.g2.h(str) ? "" : str.substring(str.lastIndexOf(com.join.mgps.Util.h0.f27805a) + 1);
    }

    private void x0(String str) {
        this.f29732u = false;
        showToast(str);
        m0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void A0(String str, int i4) {
        if (this.f29732u) {
            return;
        }
        this.f29732u = true;
        if (i4 == 1) {
            this.f29733v = true;
        } else if (i4 == 2) {
            this.f29734w = true;
        }
        if (com.join.android.app.common.utils.j.j(this)) {
            RequestModel requestModel = new RequestModel();
            requestModel.setDefault(this);
            ArchiveArgs archiveArgs = new ArchiveArgs();
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
            archiveArgs.setGameId(this.f29713b);
            archiveArgs.setUid(accountData.getUid());
            requestModel.setArgs(archiveArgs);
            String a5 = com.papa.sim.statistic.k.a(this);
            y0(i4);
            com.join.android.app.common.http.h b5 = com.join.android.app.common.http.h.b();
            String g4 = b5.g(str, accountData.getUid() + "", accountData.getToken(), requestModel, a5, new File(str).getName(), i4 == 2 ? 1 : 0, i4 == 1 ? 1 : 0, new a(i4));
            try {
                if (com.join.mgps.Util.g2.i(g4)) {
                    JsonObject asJsonObject = JsonParser.parseString(g4).getAsJsonObject();
                    if (asJsonObject != null && asJsonObject.has("code") && asJsonObject.get("code").getAsInt() == 200) {
                        if (asJsonObject.has("data")) {
                            JsonArray asJsonArray = asJsonObject.get("data").getAsJsonArray();
                            if (asJsonArray.size() > 0) {
                                JsonObject asJsonObject2 = asJsonArray.get(0).getAsJsonObject();
                                if (asJsonObject2.has("remoteUrl")) {
                                    if (i4 == 1) {
                                        this.f29726o = asJsonObject2.get("remoteUrl").getAsString();
                                        if (asJsonObject2.has(InstallAppDialogV2Activity_.f34088m) && asJsonObject2.get(InstallAppDialogV2Activity_.f34088m) != null && !asJsonObject2.get(InstallAppDialogV2Activity_.f34088m).isJsonNull()) {
                                            this.f29727p = asJsonObject2.get(InstallAppDialogV2Activity_.f34088m).getAsString();
                                        }
                                        this.f29729r = true;
                                    } else if (i4 == 2) {
                                        this.f29728q = asJsonObject2.get("remoteUrl").getAsString();
                                        this.f29730s = true;
                                    }
                                    this.f29732u = false;
                                    z0();
                                    if (this.f29729r && this.f29730s) {
                                        i0();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            x0("上传失败，请重试");
                            return;
                        } else if (asJsonObject.has("message") && !asJsonObject.get("message").isJsonNull() && com.join.mgps.Util.g2.i(asJsonObject.get("message").getAsString())) {
                            x0(asJsonObject.get("message").getAsString());
                            return;
                        } else {
                            x0("上传失败，请重试");
                            return;
                        }
                    }
                    x0("上传失败，请重试");
                    return;
                }
                x0("上传失败，请重试");
                return;
            } catch (Exception unused) {
                x0("上传失败，请重试");
                return;
            }
        }
        x0("网络连接异常");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f29731t = com.join.mgps.rpc.impl.i.D0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.iv_back})
    public void back() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.ll_choose_video})
    public void h0() {
        Intent intent;
        if (ContextCompat.checkSelfPermission(this, com.kuaishou.weapon.p0.g.f55589i) != 0) {
            UtilsMy.O2(this, com.kuaishou.weapon.p0.g.f55589i);
            return;
        }
        if (!com.join.mgps.Util.r1.B() && !com.join.mgps.Util.r1.t()) {
            intent = new Intent();
            if (Build.VERSION.SDK_INT < 19) {
                intent.setAction("android.intent.action.GET_CONTENT");
            } else {
                intent.setAction("android.intent.action.OPEN_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
            }
            intent.setType("video/*");
        } else {
            intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "video/*");
        }
        startActivityForResult(Intent.createChooser(intent, "选择挑战视频"), 1001);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i0() {
        if (this.A) {
            return;
        }
        this.A = true;
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                if (IntentUtil.getInstance().isNotLogin(this)) {
                    showToast("请先登录");
                    this.A = false;
                    return;
                }
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                RequestModel requestModel = new RequestModel(this);
                RequestCreateEndGameArgs requestCreateEndGameArgs = new RequestCreateEndGameArgs();
                requestCreateEndGameArgs.setUid(accountData.getUid() + "");
                requestCreateEndGameArgs.setArchive(this.f29728q);
                requestCreateEndGameArgs.setVideo(this.f29726o);
                requestCreateEndGameArgs.setCover(this.f29727p);
                requestCreateEndGameArgs.setIndex(this.f29714c.getIndex());
                requestCreateEndGameArgs.setGameId(this.f29714c.getGameId());
                requestCreateEndGameArgs.setDuration(this.f29717f.longValue());
                requestCreateEndGameArgs.setTitle(this.f29718g.getText().toString());
                requestCreateEndGameArgs.setSubTitle(this.f29719h.getText().toString());
                requestModel.setArgs(requestCreateEndGameArgs);
                ResponseModel<Boolean> Q = this.f29731t.Q(requestModel.makeSign());
                this.A = false;
                if (Q != null) {
                    try {
                        if (Q.getData().booleanValue()) {
                            m0();
                            q0();
                            t0();
                            return;
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        m0();
                        showToast("创建失败请重试");
                        return;
                    }
                }
                if (Q != null && com.join.mgps.Util.g2.i(Q.getMessage())) {
                    showToast(Q.getMessage());
                } else {
                    showToast("创建失败请重试");
                }
                return;
            } catch (Exception e6) {
                e6.printStackTrace();
                m0();
                showToast("创建失败请重试");
                return;
            }
        }
        this.A = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0(String str) {
        String str2 = com.join.mgps.Util.v.f28112l + "compress/video";
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        String str3 = str2 + File.separator + com.join.mgps.Util.x0.d(str) + com.join.mgps.Util.h0.f27805a + n0(str);
        this.f29724m = str3;
        com.vincent.videocompressor.h.b(str, str3, new c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.tv_commit})
    public void l0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            if (IntentUtil.getInstance().isNotLogin(this)) {
                showToast("请先登录");
                IntentUtil.getInstance().goLogin(this);
                return;
            } else if (com.join.mgps.Util.g2.h(this.f29716e)) {
                showToast("请选择挑战视频");
                return;
            } else if (!com.join.mgps.Util.g2.h(this.f29718g.getText().toString()) && this.f29718g.getText().length() >= 6) {
                if (com.join.mgps.Util.g2.h(this.f29719h.getText().toString())) {
                    showToast("请输入残局说明");
                    return;
                }
                this.f29734w = false;
                this.f29733v = false;
                if (com.join.mgps.Util.g2.h(this.f29724m)) {
                    k0(this.f29716e);
                    return;
                } else {
                    p0();
                    return;
                }
            } else {
                showToast("请输入标题（6～20字）");
                return;
            }
        }
        showToast("网络连接异常");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        com.join.mgps.dialog.m2 m2Var = this.f29736y;
        if (m2Var != null) {
            m2Var.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        if (this.f29735x == null) {
            this.f29735x = new com.join.mgps.dialog.b0(this);
        }
        this.f29735x.a("视频");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == 1001 && i5 == -1) {
            this.f29716e = com.join.mgps.Util.o2.b(this, intent.getData());
            if (this.f29720i != null) {
                this.f29723l.setVisibility(0);
                this.f29721j.setVisibility(8);
                this.f29720i.f15277b.setImageBitmap(ThumbnailUtils.createVideoThumbnail(this.f29716e, 1));
                this.f29720i.setPlayTag("CreateEndGameActivity_Video");
                this.f29720i.setMuteWhenPlay(false);
                this.f29720i.setShowCoverWhenPause(false);
                StandardVideoView standardVideoView = this.f29720i;
                standardVideoView.setUpLazy("file://" + this.f29716e, 0, new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.f().y(this);
        StandardVideoView standardVideoView = this.f29720i;
        if (standardVideoView != null) {
            standardVideoView.release();
        }
        com.join.android.app.component.video.a.n0("CreateEndGameActivity_Video");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        StandardVideoView standardVideoView = this.f29720i;
        if (standardVideoView != null) {
            standardVideoView.onVideoPause();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        com.join.mgps.dialog.b0 b0Var = this.f29735x;
        if (b0Var != null) {
            b0Var.dismiss();
        }
        if (this.f29729r) {
            return;
        }
        A0(this.f29724m, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        if (this.f29737z == null) {
            this.f29737z = new com.join.mgps.dialog.h2(this);
        }
        this.f29737z.a(new b());
        this.f29737z.b("上传成功，我们将在3个工作日内完成审核");
    }

    void r0() {
        if (com.join.mgps.Util.g2.i(this.f29725n)) {
            com.join.mgps.Util.h0.i(this.f29725n);
            this.f29725n = "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.iv_delete_video})
    public void s0() {
        this.f29716e = "";
        this.f29721j.setVisibility(0);
        this.f29723l.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    void t0() {
        if (com.join.mgps.Util.g2.i(this.f29724m)) {
            com.join.mgps.Util.h0.i(this.f29724m);
            this.f29724m = "";
        }
    }

    void u0() {
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.p(CreateEndGameActivity.G));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v0(int i4) {
        com.join.mgps.dialog.b0 b0Var = this.f29735x;
        if (b0Var == null || !b0Var.isShowing()) {
            return;
        }
        this.f29735x.update(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0(int i4) {
        com.join.mgps.dialog.m2 m2Var = this.f29736y;
        if (m2Var == null || !m2Var.isShowing()) {
            return;
        }
        this.f29736y.update(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y0(int i4) {
        if (this.f29736y == null) {
            this.f29736y = new com.join.mgps.dialog.m2(this);
        }
        this.f29736y.b(i4 == 1 ? "视频" : "存档");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z0() {
        if (!this.f29730s || !this.f29734w) {
            m0();
        }
        if (this.f29730s || this.f29734w) {
            return;
        }
        A0(this.f29715d.getArchiveFilePath(), 2);
    }
}
