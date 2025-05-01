package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.beizi.fusion.widget.TwistView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.mygame.dialog.WufunGameDownFirstNotPermissDialog_;
import com.join.mgps.adapter.o2;
import com.join.mgps.customview.XListView2;
import com.join.mgps.customview.v;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.enums.Dtype;
import com.join.mgps.fragment.BaseFragment;
import com.join.mgps.pref.PrefDef_;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.fragment_my_game_papa_fav)
/* loaded from: classes.dex */
public class MyGamePapaFavFragment extends BaseFragment implements o2.e, AbsListView.OnScrollListener {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    XListView2 f35697b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f35698c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f35699d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f35700e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    View f35701f;
    @FragmentArg

    /* renamed from: g  reason: collision with root package name */
    String f35702g;
    @FragmentArg

    /* renamed from: h  reason: collision with root package name */
    String f35703h;

    /* renamed from: j  reason: collision with root package name */
    private Context f35705j;

    /* renamed from: k  reason: collision with root package name */
    private com.wufan.user.service.protobuf.n0 f35706k;

    /* renamed from: l  reason: collision with root package name */
    private com.join.mgps.rpc.k f35707l;

    /* renamed from: m  reason: collision with root package name */
    com.join.mgps.adapter.o2 f35708m;

    /* renamed from: s  reason: collision with root package name */
    com.join.mgps.rpc.e f35714s;
    @Pref

    /* renamed from: t  reason: collision with root package name */
    PrefDef_ f35715t;

    /* renamed from: i  reason: collision with root package name */
    private int f35704i = 1;

    /* renamed from: n  reason: collision with root package name */
    HashMap<String, Boolean> f35709n = new HashMap<>();

    /* renamed from: o  reason: collision with root package name */
    private List<DownloadTask> f35710o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    private List<CommonGameInfoBean> f35711p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    private List<GamedetialModleFourBean> f35712q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    private int f35713r = 0;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<String> f35716u = new ArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<DownloadTask> f35717v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    private boolean f35718w = true;

    /* renamed from: x  reason: collision with root package name */
    private int f35719x = 0;

    /* renamed from: y  reason: collision with root package name */
    private long f35720y = 0;

    /* renamed from: z  reason: collision with root package name */
    private int f35721z = 0;
    private int A = 0;

    /* loaded from: classes4.dex */
    class a implements com.join.mgps.customview.g {
        a() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            MyGamePapaFavFragment myGamePapaFavFragment = MyGamePapaFavFragment.this;
            myGamePapaFavFragment.t0(myGamePapaFavFragment.f35703h, myGamePapaFavFragment.f35702g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Comparator<DownloadTask> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(DownloadTask downloadTask, DownloadTask downloadTask2) {
            if (b(downloadTask.getStatus())) {
                return (!b(downloadTask2.getStatus()) || downloadTask2.getStartTime() <= downloadTask.getStartTime()) ? -1 : 1;
            } else if (b(downloadTask2.getStatus())) {
                return 1;
            } else {
                if (c(downloadTask.getStatus()) && !d(downloadTask)) {
                    return (!c(downloadTask2.getStatus()) || d(downloadTask2) || downloadTask2.getFinishTime() <= downloadTask.getFinishTime()) ? -1 : 1;
                } else if (!c(downloadTask2.getStatus()) || d(downloadTask2)) {
                    return c(downloadTask.getStatus()) ? (!c(downloadTask2.getStatus()) || downloadTask2.getOpenTime() < downloadTask.getOpenTime()) ? -1 : 1 : c(downloadTask2.getStatus()) ? 1 : 0;
                } else {
                    return 1;
                }
            }
        }

        boolean b(int i4) {
            return i4 == 2 || i4 == 3 || i4 == 12 || i4 == 13 || i4 == 36 || i4 == 11 || i4 == 6 || i4 == 10 || i4 == 48;
        }

        boolean c(int i4) {
            return i4 == 5 || e(i4);
        }

        boolean d(DownloadTask downloadTask) {
            return downloadTask.isOpen();
        }

        boolean e(int i4) {
            return i4 == 9;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements v.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f35724a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f35725b;

        c(String str, DownloadTask downloadTask) {
            this.f35724a = str;
            this.f35725b = downloadTask;
        }

        @Override // com.join.mgps.customview.v.a
        public void a(String str) {
            p1.f.K().F(this.f35724a);
            DownloadTask downloadTask = null;
            for (DownloadTask downloadTask2 : MyGamePapaFavFragment.this.f35710o) {
                if (TextUtils.equals(str, downloadTask2.getCrc_link_type_val()) || (downloadTask2.getModInfoBean() != null && (TextUtils.equals(str, downloadTask2.getModInfoBean().getMod_game_id()) || TextUtils.equals(str, downloadTask2.getModInfoBean().getMain_game_id())))) {
                    downloadTask = downloadTask2;
                }
            }
            if (downloadTask == null) {
                IntentUtil.getInstance().goGameDetialActivity(MyGamePapaFavFragment.this.f35705j, this.f35724a, 0);
            } else {
                IntentUtil.getInstance().goGameDetialActivityBYDownloadTaskForFav(MyGamePapaFavFragment.this.getContext(), downloadTask);
            }
        }

        @Override // com.join.mgps.customview.v.a
        public void b(String str) {
        }

        @Override // com.join.mgps.customview.v.a
        public void c(String str) {
            if (p1.f.K().F(this.f35724a) == null) {
                MyGamePapaFavFragment.this.m0(this.f35725b);
            } else {
                MyGamePapaFavFragment.this.o0(str);
            }
        }

        @Override // com.join.mgps.customview.v.a
        public void d(String str) {
            new com.join.mgps.customview.n(MyGamePapaFavFragment.this.getContext()).a(MyGamePapaFavFragment.this.f35701f, str);
        }

        @Override // com.join.mgps.customview.v.a
        public void e(String str) {
            File externalFilesDir = MyGamePapaFavFragment.this.f35705j.getExternalFilesDir("backup");
            if (!externalFilesDir.exists() || externalFilesDir.listFiles() == null) {
                return;
            }
            File[] listFiles = externalFilesDir.listFiles();
            int length = listFiles.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                File file = listFiles[i4];
                if (TextUtils.equals(str, file.getName())) {
                    UtilsMy.delete(file);
                    file.delete();
                    break;
                }
                i4++;
            }
            MyGamePapaFavVpFragment_ i02 = MyGamePapaFavFragment.this.i0();
            if (i02 != null) {
                i02.d0(str);
            }
        }
    }

    private List<DownloadTask> f0() {
        return this.f35710o;
    }

    private DownloadTask h0(CommonGameInfoBean commonGameInfoBean) {
        if (commonGameInfoBean == null || commonGameInfoBean.getG_info() == null) {
            return null;
        }
        GInfoBean g_info = commonGameInfoBean.getG_info();
        DownloadTask downloadTask = new DownloadTask();
        downloadTask.setPortraitURL(TextUtils.isEmpty(g_info.getGif_ico()) ? g_info.getIco() : g_info.getGif_ico());
        downloadTask.setShowName(g_info.getName());
        downloadTask.setStatus(0);
        downloadTask.setCrc_link_type_val(g_info.getId());
        downloadTask.setRef_crc_sign_id(g_info.getMod_id());
        downloadTask.setPlugin_num(g_info.getPlugin_num());
        downloadTask.setTipBeans(new ArrayList<>(g_info.getTag_info()));
        downloadTask.setAd_info(commonGameInfoBean);
        return downloadTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public MyGamePapaFavVpFragment_ i0() {
        for (Fragment fragment : getParentFragmentManager().getFragments()) {
            if (fragment instanceof MyGamePapaFavVpFragment_) {
                return (MyGamePapaFavVpFragment_) fragment;
            }
        }
        return null;
    }

    private boolean j0(DownloadTask downloadTask, DownloadTask downloadTask2) {
        ModInfoBean modInfoBean;
        boolean z4 = true;
        if (!com.join.mgps.Util.g2.i(downloadTask.getMod_info()) ? TextUtils.isEmpty(downloadTask2.getCrc_link_type_val()) || !downloadTask2.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val()) : (modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(downloadTask.getMod_info(), ModInfoBean.class)) == null || TextUtils.isEmpty(downloadTask2.getCrc_link_type_val()) || (!downloadTask2.getCrc_link_type_val().equals(modInfoBean.getMod_game_id()) && !downloadTask2.getCrc_link_type_val().equals(modInfoBean.getMain_game_id()))) {
            z4 = false;
        }
        if (z4) {
            if (downloadTask2.getStatus() == 5 && downloadTask.getStatus() != 7) {
                return false;
            }
            downloadTask2.setStatus(downloadTask.getStatus());
        }
        return z4;
    }

    private void p0(DownloadTask downloadTask) {
        for (int i4 = 0; i4 < this.f35710o.size(); i4++) {
            DownloadTask downloadTask2 = this.f35710o.get(i4);
            if (j0(downloadTask, downloadTask2)) {
                for (DownloadTask downloadTask3 : p1.f.K().d()) {
                    if (TextUtils.equals(downloadTask.getCrc_link_type_val(), downloadTask3.getCrc_link_type_val()) || (downloadTask3.getModInfoBean() != null && (TextUtils.equals(downloadTask3.getModInfoBean().getMod_game_id(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(downloadTask3.getModInfoBean().getMain_game_id(), downloadTask.getCrc_link_type_val())))) {
                        this.f35710o.set(i4, downloadTask3);
                        l0();
                        return;
                    }
                }
                downloadTask2.setStatus(0);
                for (CommonGameInfoBean commonGameInfoBean : this.f35711p) {
                    if (commonGameInfoBean.getG_info() != null) {
                        String id = commonGameInfoBean.getG_info().getId();
                        String mod_id = commonGameInfoBean.getG_info().getMod_id();
                        if (TextUtils.equals(id, downloadTask.getCrc_link_type_val()) || TextUtils.equals(mod_id, downloadTask.getCrc_link_type_val())) {
                            this.f35710o.set(i4, h0(commonGameInfoBean));
                        }
                    }
                }
                for (GamedetialModleFourBean gamedetialModleFourBean : this.f35712q) {
                    String game_id = gamedetialModleFourBean.getGame_id();
                    ModInfoBean modInfoBean = downloadTask.getModInfoBean();
                    if (TextUtils.equals(game_id, downloadTask.getCrc_link_type_val()) || (modInfoBean != null && (TextUtils.equals(game_id, modInfoBean.getMain_game_id()) || TextUtils.equals(game_id, modInfoBean.getMod_game_id())))) {
                        this.f35710o.set(i4, gamedetialModleFourBean.getDownloadtaskDown());
                    }
                }
                l0();
                return;
            }
        }
    }

    private void q0(DownloadTask downloadTask) {
        if (this.f35710o == null || downloadTask == null) {
            return;
        }
        for (int i4 = 0; i4 < this.f35710o.size(); i4++) {
            if (j0(downloadTask, this.f35710o.get(i4))) {
                l0();
                return;
            }
        }
    }

    private void r0(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        if (!TextUtils.isEmpty(downloadTask.getFileType()) && downloadTask.getFileType().equals(Dtype.chajian.name())) {
            l0();
            return;
        }
        UtilsMy.A4(this.f35710o);
        for (int i4 = 0; i4 < this.f35710o.size(); i4++) {
            if (j0(downloadTask, this.f35710o.get(i4))) {
                this.f35710o.set(i4, downloadTask);
                l0();
                return;
            }
        }
    }

    private void s0(DownloadTask downloadTask) {
        List<DownloadTask> list = this.f35710o;
        if (list == null || downloadTask == null) {
            return;
        }
        UtilsMy.A4(list);
        l0();
    }

    private void y0() {
        DownloadTask downloadTask;
        View childAt;
        if (this.A < 0 || this.f35721z >= this.f35697b.getCount()) {
            return;
        }
        for (int i4 = this.A; i4 <= this.f35721z; i4++) {
            if (this.f35697b.getAdapter().getItemViewType(i4) == 2 && this.f35697b.getItemAtPosition(i4) != null && (this.f35697b.getItemAtPosition(i4) instanceof DownloadTask) && (downloadTask = (DownloadTask) this.f35697b.getItemAtPosition(i4)) != null && ((downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12) && (childAt = this.f35697b.getChildAt(i4 - this.A)) != null && childAt.getTag() != null && (childAt.getTag() instanceof o2.h))) {
                o2.h hVar = (o2.h) childAt.getTag();
                try {
                    DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                    if (f5 == null) {
                        f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getRef_crc_sign_id());
                    }
                    if (f5 == null) {
                        return;
                    }
                    String str = "";
                    if (!TextUtils.isEmpty(f5.getShowSize())) {
                        long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                        str = downloadTask.getSize() == 0 ? UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble) : UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble);
                    }
                    if (downloadTask.getStatus() == 12) {
                        hVar.f45059b.setProgress((int) f5.getProgress());
                    } else {
                        hVar.f45059b.setProgress((int) f5.getProgress());
                    }
                    if (downloadTask.getStatus() == 2) {
                        hVar.f45060c.setText(str + " · " + f5.getSpeed() + "/S");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    @Override // com.join.mgps.adapter.o2.e
    public void S(DownloadTask downloadTask) {
    }

    @Override // com.join.mgps.adapter.o2.e
    public void T(String str, DownloadTask downloadTask) {
        Y(str, downloadTask);
    }

    @Override // com.join.mgps.adapter.o2.e
    public void Y(String str, DownloadTask downloadTask) {
        ExtBean extBean;
        com.join.mgps.customview.v vVar = new com.join.mgps.customview.v(getContext());
        vVar.b(new c(str, downloadTask));
        vVar.d(this.f35701f, str, (downloadTask.getExt() == null || (extBean = (ExtBean) JsonMapper.getInstance().fromJson(downloadTask.getExt(), ExtBean.class)) == null || !TextUtils.equals("存档", extBean.getWhere())) ? false : true, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void Z() {
        this.f35705j = getContext();
        com.join.mgps.Util.d0.a().d(this);
        if (Build.VERSION.SDK_INT > 28 && this.f35715t.needShowPermissdialog().d().booleanValue() && !UtilsMy.m0(this.f35705j)) {
            ((WufunGameDownFirstNotPermissDialog_.IntentBuilder_) WufunGameDownFirstNotPermissDialog_.intent(this.f35705j).from(2).flags(268435456)).start();
        }
        this.f35706k = AccountUtil_.getInstance_(this.f35705j).getAccountData();
        this.f35707l = com.join.mgps.rpc.impl.i.D0();
        this.f35714s = com.join.mgps.rpc.impl.d.P1();
        com.join.mgps.adapter.o2 o2Var = new com.join.mgps.adapter.o2(getContext());
        this.f35708m = o2Var;
        o2Var.S(this);
        this.f35697b.setAdapter((ListAdapter) this.f35708m);
        this.f35697b.setOnScrollListener(this);
        this.f35697b.setPullRefreshEnable(new a());
        if (this.f35701f == null) {
            this.f35701f = ((Activity) getContext()).getWindow().getDecorView().findViewById(R.id.root);
        }
        if (this.f35702g == null && TextUtils.equals("存档", this.f35703h)) {
            e0();
        } else {
            g0();
        }
    }

    void a0(DownloadTask downloadTask) {
        for (DownloadTask downloadTask2 : this.f35710o) {
            if (!TextUtils.isEmpty(downloadTask2.getCrc_link_type_val()) && downloadTask2.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                downloadTask2.setStatus(0);
            }
        }
    }

    void b0(String str) {
        DownloadTask F = p1.f.K().F(str);
        Context context = getContext();
        if (F == null) {
            return;
        }
        boolean z4 = false;
        String fileType = F.getFileType();
        if (!TextUtils.isEmpty(fileType) && fileType.equals(Dtype.android.name())) {
            z4 = true;
        }
        if (z4) {
            if (com.join.android.app.common.utils.e.l0(context).d(context, F.getPackageName())) {
                if (F.getStatus() != 5 && F.getStatus() != 9) {
                    UtilsMy.J0(F);
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, F.getPackageName());
                    if (l4 != null) {
                        F.setVer(l4.d() + "");
                    }
                    UtilsMy.S2(F, 5);
                    l0();
                    return;
                }
                com.join.android.app.common.utils.e.l0(context).f0(context, F.getPackageName());
                return;
            }
            UtilsMy.M0(F);
            a0(F);
            UtilsMy.x4(F);
            l0();
            return;
        }
        UtilsMy.M0(F);
        a0(F);
        UtilsMy.x4(F);
        l0();
    }

    void c0(String str) {
        DownloadTask F = p1.f.K().F(str);
        if (F.getStatus() == 48) {
            com.join.mgps.Util.l2.a(getContext()).b("游戏安装中无法删除");
            return;
        }
        UtilsMy.O0(getContext(), F);
        a0(F);
        f0();
        l0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void d0(int i4) {
        if (com.join.android.app.common.utils.j.j(this.f35705j)) {
            try {
                if (i4 <= this.f35716u.size() - 1) {
                    String str = this.f35716u.get(i4);
                    com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f35705j).getAccountData();
                    if (accountData == null) {
                        accountData = com.wufan.user.service.protobuf.n0.f5().build();
                    }
                    RequestModel requestModel = new RequestModel();
                    requestModel.setDefault(this.f35705j);
                    RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs(str, 1, accountData.getUid());
                    requestGameIdArgs.setDownloadedGameIdList(p1.f.K().A());
                    requestModel.setArgs(requestGameIdArgs);
                    ResponseModel<GamedetialModleFourBean> body = com.join.mgps.rpc.impl.i.D0().B0().p(requestModel.makeSign()).execute().body();
                    if (body != null && body.getCode() == 200) {
                        GamedetialModleFourBean data = body.getData();
                        this.f35712q.add(data);
                        if (data != null) {
                            DownloadTask F = p1.f.K().F(str);
                            if (F == null) {
                                F = data.getDownloadtaskDown();
                            }
                            ExtBean extBean = new ExtBean();
                            extBean.setWhere("存档");
                            extBean.setFrom("169");
                            extBean.set_from_type(169);
                            F.set_from(169);
                            F.set_from_type(169);
                            F.setExt(JsonMapper.getInstance().toJson(extBean));
                            data.set_from(169);
                            data.set_from_type(169);
                            this.f35717v.add(F);
                        }
                    }
                    d0(i4 + 1);
                    return;
                }
                showMain();
                if (TextUtils.equals("存档", this.f35703h)) {
                    w0();
                }
                l0();
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
    @UiThread
    public void e0() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList(this.f35716u);
        this.f35716u = new ArrayList<>();
        File externalFilesDir = this.f35705j.getExternalFilesDir("backup");
        if (externalFilesDir.exists() && externalFilesDir.isDirectory() && externalFilesDir.listFiles().length > 0) {
            for (File file : externalFilesDir.listFiles()) {
                if (file.exists() && file.isDirectory()) {
                    this.f35716u.add(file.getName());
                }
            }
            if ((this.f35716u.size() > 0 && !this.f35716u.equals(arrayList)) || this.f35699d.getVisibility() == 0) {
                this.f35717v = new ArrayList<>();
                d0(0);
                return;
            }
            l0();
        } else if (TextUtils.equals("存档", this.f35703h)) {
            x0();
        }
    }

    @Override // com.join.mgps.adapter.o2.e
    public void g(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
        if (r4.getStatus() == 5) goto L30;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g0() {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MyGamePapaFavFragment.g0():void");
    }

    @Override // com.join.mgps.adapter.o2.e
    public void i(String str) {
        UninstallWufunGameActivity_.R0(this.f35705j).a(str).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0() {
        XListView2 xListView2 = this.f35697b;
        if (xListView2 == null) {
            return;
        }
        xListView2.v();
        this.f35697b.u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        com.join.mgps.adapter.o2 o2Var = this.f35708m;
        if (o2Var == null || o2Var.o() == null) {
            return;
        }
        this.f35708m.o().clear();
        ArrayList arrayList = new ArrayList();
        List<DownloadTask> f02 = f0();
        Iterator<DownloadTask> it2 = this.f35717v.iterator();
        while (it2.hasNext()) {
            DownloadTask next = it2.next();
            Iterator<DownloadTask> it3 = this.f35710o.iterator();
            while (it3.hasNext()) {
                DownloadTask next2 = it3.next();
                ModInfoBean modInfoBean = next.getModInfoBean();
                if (TextUtils.equals(next2.getCrc_link_type_val(), next.getCrc_link_type_val())) {
                    it3.remove();
                } else if (modInfoBean != null && (TextUtils.equals(next2.getCrc_link_type_val(), modInfoBean.getMod_game_id()) || TextUtils.equals(next2.getCrc_link_type_val(), modInfoBean.getMain_game_id()))) {
                    it3.remove();
                }
            }
            this.f35710o.add(0, next);
        }
        try {
            Collections.sort(f02, new b());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (f02 != null && f02.size() > 0) {
            for (DownloadTask downloadTask : f02) {
                if (downloadTask != null) {
                    arrayList.add(new o2.f(2, downloadTask, false));
                }
            }
            if (!this.f35718w) {
                arrayList.add(new o2.f(3, Integer.valueOf(this.f35710o.size())));
            }
        }
        this.f35708m.R(arrayList);
        this.f35708m.notifyDataSetChanged();
        if (arrayList.size() <= 0) {
            x0();
        } else {
            showMain();
        }
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    public void m0(DownloadTask downloadTask) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72008k})
    public void n0(@Receiver.Extra String str) {
        List<DownloadTask> list = this.f35710o;
        if (list == null || list.size() < 1) {
            return;
        }
        for (DownloadTask downloadTask : this.f35710o) {
            DownloadTask F = p1.f.K().F(downloadTask.getCrc_link_type_val());
            if (F != null) {
                downloadTask.setOpen(F.isOpen());
            }
        }
        l0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = TwistView.DELAY_TIME_TWIST)
    public void o0(String str) {
        i(str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        org.greenrobot.eventbus.c.f().y(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDownloadSpeed(com.join.mgps.event.m mVar) {
        if (mVar == null || TextUtils.isEmpty(mVar.a())) {
            return;
        }
        l0();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            z0(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    z0(a5, 6);
                    return;
                } else if (c5 == 7) {
                    z0(a5, 3);
                    return;
                } else if (c5 == 8) {
                    List<DownloadTask> list = this.f35710o;
                    if (list == null || list.size() <= 0) {
                        return;
                    }
                    y0();
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            z0(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            z0(a5, 8);
                            return;
                        case 13:
                            z0(a5, 9);
                            return;
                        default:
                            return;
                    }
                }
            }
            z0(a5, 5);
        } else {
            z0(a5, 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.join.mgps.adapter.o2 o2Var = this.f35708m;
        if (o2Var != null) {
            o2Var.K(true);
            l0();
        }
        if (this.f35702g == null) {
            e0();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f35721z = (i5 + i4) - 1;
        this.A = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        int lastVisiblePosition = this.f35697b.getLastVisiblePosition();
        if (System.currentTimeMillis() - lastVisiblePosition <= 500 || lastVisiblePosition < this.f35710o.size() - 5 || !this.f35718w) {
            return;
        }
        this.f35720y = System.currentTimeMillis();
        this.f35704i++;
        g0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        t0(this.f35703h, this.f35702g);
        MyGamePapaFavVpFragment_ i02 = i0();
        if (i02 != null) {
            i02.Z(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f35705j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        com.join.mgps.Util.v0.c("显示加载中");
        LinearLayout linearLayout = this.f35698c;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f35699d;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XListView2 xListView2 = this.f35697b;
        if (xListView2 != null) {
            xListView2.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f35700e;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f35699d;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f35698c;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XListView2 xListView2 = this.f35697b;
        if (xListView2 != null) {
            xListView2.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f35700e;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain() {
        com.join.mgps.Util.v0.c("显示主界面main");
        LinearLayout linearLayout = this.f35699d;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f35698c;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XListView2 xListView2 = this.f35697b;
        if (xListView2 != null) {
            xListView2.setVisibility(0);
        }
        LinearLayout linearLayout3 = this.f35700e;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this.f35705j).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0(String str, String str2) {
        this.f35704i = 1;
        this.f35718w = true;
        this.f35703h = str;
        this.f35702g = str2;
        this.f35706k = AccountUtil_.getInstance_(this.f35705j).getAccountData();
        this.f35710o.clear();
        this.f35711p.clear();
        this.f35712q.clear();
        this.f35716u.clear();
        this.f35717v.clear();
        if (str2 == null && TextUtils.equals("存档", str)) {
            e0();
        } else {
            g0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0(String str) {
        if (TextUtils.isEmpty(this.f35702g)) {
            Iterator<DownloadTask> it2 = this.f35717v.iterator();
            while (it2.hasNext()) {
                DownloadTask next = it2.next();
                if (TextUtils.equals(next.getCrc_link_type_val(), str) || (next.getModInfoBean() != null && (TextUtils.equals(str, next.getModInfoBean().getMain_game_id()) || TextUtils.equals(str, next.getModInfoBean().getMod_game_id())))) {
                    it2.remove();
                }
            }
            Iterator<DownloadTask> it3 = this.f35710o.iterator();
            while (it3.hasNext()) {
                DownloadTask next2 = it3.next();
                if (TextUtils.equals(next2.getCrc_link_type_val(), str) || (next2.getModInfoBean() != null && (TextUtils.equals(str, next2.getModInfoBean().getMain_game_id()) || TextUtils.equals(str, next2.getModInfoBean().getMod_game_id())))) {
                    it3.remove();
                }
            }
            l0();
        }
    }

    public void v0() {
        com.join.mgps.adapter.o2 o2Var = this.f35708m;
        if (o2Var != null) {
            o2Var.K(true);
            l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0() {
        XListView2 xListView2 = this.f35697b;
        if (xListView2 == null) {
            return;
        }
        this.f35718w = false;
        xListView2.u();
        this.f35697b.v();
        this.f35697b.setNoMore(6);
        l0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x0() {
        LinearLayout linearLayout = this.f35699d;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f35698c;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XListView2 xListView2 = this.f35697b;
        if (xListView2 != null) {
            xListView2.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f35700e;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
    }

    void z0(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    r0(downloadTask);
                    return;
                case 3:
                    p0(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    s0(downloadTask);
                    return;
                case 6:
                    q0(downloadTask);
                    return;
            }
        }
    }
}
