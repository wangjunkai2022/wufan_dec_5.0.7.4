package com.join.mgps.activity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseAppCompatActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathDataV2;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.CleanSpaceActivity;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dialog.l2;
import com.join.mgps.dto.ArchievePathMultiArgs;
import com.join.mgps.dto.ArchievePathMultiBean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.arc.util.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_clean_space)
/* loaded from: classes4.dex */
public class CleanSpaceActivity extends BaseAppCompatActivity {
    private boolean E;
    private boolean F;
    private com.join.mgps.dialog.l2 G;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f28785b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f28786c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f28787d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    RecyclerView f28788e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Group f28789f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    Group f28790g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f28791h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    RecyclerView f28792i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    Group f28793j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    FrameLayout f28794k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f28795l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f28796m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    LinearLayout f28797n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    LinearLayout f28798o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    LinearLayout f28799p;

    /* renamed from: r  reason: collision with root package name */
    private com.join.mgps.rpc.k f28801r;

    /* renamed from: s  reason: collision with root package name */
    private Context f28802s;

    /* renamed from: t  reason: collision with root package name */
    private ArrayList<DownloadTask> f28803t;

    /* renamed from: v  reason: collision with root package name */
    private List<ModGameArchivePathDataV2> f28805v;

    /* renamed from: w  reason: collision with root package name */
    private int f28806w;

    /* renamed from: x  reason: collision with root package name */
    private ArrayList<String> f28807x;

    /* renamed from: y  reason: collision with root package name */
    private ArrayList<DownloadTask> f28808y;

    /* renamed from: q  reason: collision with root package name */
    private ArrayList<String> f28800q = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<DownloadTask> f28804u = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    private ArrayList<DownloadTask> f28809z = new ArrayList<>();
    private ArrayList<DownloadTask> A = new ArrayList<>();
    private ArrayList<String> B = new ArrayList<>();
    ArrayList<c> C = new ArrayList<>();
    ArrayList<c> D = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends UniversalItemDecoration {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UniversalItemDecoration.a f28816a;

        a(UniversalItemDecoration.a aVar) {
            this.f28816a = aVar;
        }

        @Override // com.join.mgps.base.decoration.UniversalItemDecoration
        public UniversalItemDecoration.b getItemOffsets(int i4) {
            return this.f28816a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends UniversalItemDecoration {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UniversalItemDecoration.a f28818a;

        b(UniversalItemDecoration.a aVar) {
            this.f28818a = aVar;
        }

        @Override // com.join.mgps.base.decoration.UniversalItemDecoration
        public UniversalItemDecoration.b getItemOffsets(int i4) {
            return this.f28818a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        private int f28820a;

        /* renamed from: b  reason: collision with root package name */
        private DownloadTask f28821b;

        /* renamed from: c  reason: collision with root package name */
        private List<String> f28822c;

        /* renamed from: d  reason: collision with root package name */
        private List<String> f28823d;

        /* renamed from: e  reason: collision with root package name */
        private long f28824e;

        /* renamed from: f  reason: collision with root package name */
        private long f28825f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f28826g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f28827h;

        c() {
        }

        public List<String> a() {
            return this.f28822c;
        }

        public long b() {
            return this.f28825f;
        }

        public List<String> c() {
            return this.f28823d;
        }

        public long d() {
            return this.f28824e;
        }

        public DownloadTask e() {
            return this.f28821b;
        }

        public boolean f() {
            return this.f28827h;
        }

        public boolean g() {
            return this.f28826g;
        }

        public int getType() {
            return this.f28820a;
        }

        public boolean h() {
            return this.f28825f > 0;
        }

        public boolean i() {
            return this.f28824e > 0;
        }

        public void j(List<String> list) {
            this.f28822c = list;
        }

        public void k(boolean z4) {
            this.f28827h = z4;
        }

        public void l(boolean z4) {
            this.f28826g = z4;
        }

        public void m(long j4) {
            this.f28825f = j4;
        }

        public void n(List<String> list) {
            this.f28823d = list;
        }

        public void o(long j4) {
            this.f28824e = j4;
        }

        public void p(DownloadTask downloadTask) {
            this.f28821b = downloadTask;
        }

        public void q(int i4) {
            this.f28820a = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends BaseQuickAdapter<c, BaseViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        private int f28829a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements CompoundButton.OnCheckedChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ImageView f28831a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f28832b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ DownloadTask f28833c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ CheckBox f28834d;

            a(ImageView imageView, c cVar, DownloadTask downloadTask, CheckBox checkBox) {
                this.f28831a = imageView;
                this.f28832b = cVar;
                this.f28833c = downloadTask;
                this.f28834d = checkBox;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                if (z4) {
                    this.f28831a.setSelected(true);
                    this.f28832b.l(true);
                    CleanSpaceActivity.f0(CleanSpaceActivity.this);
                    if (this.f28832b.getType() == 1) {
                        CleanSpaceActivity.this.A.add(this.f28833c);
                    } else {
                        CleanSpaceActivity.this.f28809z.add(this.f28833c);
                    }
                    if (this.f28832b.c() != null) {
                        for (String str : this.f28832b.c()) {
                            CleanSpaceActivity.this.k0(str);
                        }
                        return;
                    }
                    return;
                }
                if (!this.f28834d.isChecked()) {
                    this.f28831a.setSelected(false);
                }
                this.f28832b.l(false);
                CleanSpaceActivity.g0(CleanSpaceActivity.this);
                if (this.f28832b.getType() == 1) {
                    CleanSpaceActivity.this.A.remove(this.f28833c);
                } else {
                    CleanSpaceActivity.this.f28809z.remove(this.f28833c);
                }
                if (this.f28832b.c() != null) {
                    for (String str2 : this.f28832b.c()) {
                        CleanSpaceActivity.this.A0(str2);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class b implements CompoundButton.OnCheckedChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ImageView f28836a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f28837b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ CheckBox f28838c;

            b(ImageView imageView, c cVar, CheckBox checkBox) {
                this.f28836a = imageView;
                this.f28837b = cVar;
                this.f28838c = checkBox;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                if (z4) {
                    this.f28836a.setSelected(true);
                    this.f28837b.k(true);
                    CleanSpaceActivity.f0(CleanSpaceActivity.this);
                    if (this.f28837b.a() != null) {
                        for (String str : this.f28837b.a()) {
                            CleanSpaceActivity.this.k0(str);
                        }
                    }
                } else {
                    if (!this.f28838c.isChecked()) {
                        this.f28836a.setSelected(false);
                    }
                    this.f28837b.k(false);
                    CleanSpaceActivity.g0(CleanSpaceActivity.this);
                    if (this.f28837b.a() != null) {
                        for (String str2 : this.f28837b.a()) {
                            CleanSpaceActivity.this.A0(str2);
                        }
                    }
                }
                CleanSpaceActivity.this.n0();
            }
        }

        public d(@Nullable List<c> list, int i4) {
            super(R.layout.item_clean_space_list, list);
            this.f28829a = i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void c(CheckBox checkBox, CheckBox checkBox2, ImageView imageView, View view) {
            if (checkBox.isEnabled() || checkBox2.isEnabled()) {
                if (imageView.isSelected()) {
                    imageView.setSelected(false);
                    if (checkBox.isEnabled()) {
                        checkBox.setChecked(false);
                    }
                    if (checkBox2.isEnabled()) {
                        checkBox2.setChecked(false);
                        return;
                    }
                    return;
                }
                imageView.setSelected(true);
                if (checkBox.isEnabled()) {
                    checkBox.setChecked(true);
                }
                if (checkBox2.isEnabled()) {
                    checkBox2.setChecked(true);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: b */
        public void convert(@NonNull BaseViewHolder baseViewHolder, c cVar) {
            DownloadTask e5 = cVar.e();
            if (e5 == null) {
                return;
            }
            MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.gameIcon), e5.getPortraitURL());
            baseViewHolder.setText(R.id.gameName, e5.getShowName()).setText(R.id.tvGameSpace, UtilsMy.e(cVar.d() + cVar.b(), "0.0")).setGone(R.id.llPkgAndData, cVar.getType() == 0).setVisible(R.id.tvSimulatorSize, cVar.getType() == 1).setText(R.id.tvSimulatorSize, UtilsMy.e(cVar.d(), "0.0"));
            final CheckBox checkBox = (CheckBox) baseViewHolder.getView(R.id.checkboxPkg);
            final CheckBox checkBox2 = (CheckBox) baseViewHolder.getView(R.id.checkboxData);
            final ImageView imageView = (ImageView) baseViewHolder.getView(R.id.checkbox);
            checkBox2.setVisibility(this.f28829a != 0 ? 8 : 0);
            checkBox.setEnabled(cVar.i());
            checkBox2.setEnabled(cVar.h());
            checkBox.setText("游戏包 " + UtilsMy.e(cVar.d(), "0.0"));
            checkBox2.setText("数据与进度 " + UtilsMy.e(cVar.b(), "0.0"));
            checkBox.setTextColor(cVar.i() ? Color.parseColor("#646464") : Color.parseColor("#DEDEDE"));
            checkBox2.setTextColor(cVar.h() ? Color.parseColor("#646464") : Color.parseColor("#DEDEDE"));
            checkBox.setOnCheckedChangeListener(new a(imageView, cVar, e5, checkBox2));
            checkBox2.setOnCheckedChangeListener(new b(imageView, cVar, checkBox));
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CleanSpaceActivity.d.c(checkBox2, checkBox, imageView, view);
                }
            });
        }
    }

    static /* synthetic */ int f0(CleanSpaceActivity cleanSpaceActivity) {
        int i4 = cleanSpaceActivity.f28806w;
        cleanSpaceActivity.f28806w = i4 + 1;
        return i4;
    }

    static /* synthetic */ int g0(CleanSpaceActivity cleanSpaceActivity) {
        int i4 = cleanSpaceActivity.f28806w;
        cleanSpaceActivity.f28806w = i4 - 1;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0() {
        Iterator<c> it2 = this.C.iterator();
        while (it2.hasNext()) {
            if (it2.next().f()) {
                this.F = true;
                return;
            }
        }
        this.F = false;
    }

    private void p0(DownloadTask downloadTask) {
        if (downloadTask.isMod()) {
            UtilsMy.O0(this.f28802s, downloadTask);
            return;
        }
        boolean z4 = false;
        String fileType = downloadTask.getFileType();
        if (!TextUtils.isEmpty(fileType) && fileType.equals(Dtype.android.name())) {
            z4 = true;
        }
        if (z4) {
            if (com.join.android.app.common.utils.e.l0(this.f28802s).d(this.f28802s, downloadTask.getPackageName())) {
                if (downloadTask.getStatus() != 5 && downloadTask.getStatus() != 9) {
                    UtilsMy.J0(downloadTask);
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f28802s).l(this.f28802s, downloadTask.getPackageName());
                    if (l4 != null) {
                        downloadTask.setVer(l4.d() + "");
                    }
                    UtilsMy.S2(downloadTask, 5);
                    return;
                }
                com.join.android.app.common.utils.e.l0(this.f28802s).f0(this.f28802s, downloadTask.getPackageName());
                return;
            }
            UtilsMy.M0(downloadTask);
            UtilsMy.x4(downloadTask);
            return;
        }
        UtilsMy.M0(downloadTask);
        UtilsMy.x4(downloadTask);
    }

    private void r0() {
        if (this.E) {
            setResult(10001);
        }
        finish();
    }

    private long s0(List<String> list) {
        long j4 = 0;
        if (list != null && list.size() > 0) {
            for (String str : list) {
                File file = new File(str);
                if (file.exists()) {
                    j4 += file.length();
                }
            }
        }
        return j4;
    }

    private List<String> u0(DownloadTask downloadTask) {
        File[] listFiles;
        File[] listFiles2;
        ArrayList arrayList = new ArrayList();
        String X1 = UtilsMy.X1(Integer.parseInt(downloadTask.getPlugin_num()));
        if (TextUtils.isEmpty(X1)) {
            return arrayList;
        }
        Pattern compile = Pattern.compile("\\.\\d+$");
        Pattern compile2 = Pattern.compile("\\.\\d+\\.png$");
        StringBuilder sb = new StringBuilder();
        sb.append(getExternalFilesDir("papa91"));
        String str = File.separator;
        sb.append(str);
        sb.append(X1);
        sb.append(str);
        sb.append(downloadTask.getPackageName());
        File file = new File(sb.toString());
        if (file.exists() && file.isDirectory() && file.listFiles() != null && file.listFiles().length > 0) {
            for (File file2 : file.listFiles()) {
                if (compile.matcher(file2.getName()).find() || compile2.matcher(file2.getName()).find()) {
                    arrayList.add(file2.getAbsolutePath());
                }
            }
        }
        File file3 = new File(getFilesDir() + "/emus/" + UtilsMy.X1(Integer.parseInt(downloadTask.getPlugin_num())) + File.separator + downloadTask.getPackageName());
        if (file3.exists() && file3.isDirectory() && file3.listFiles() != null && file3.listFiles().length > 0) {
            for (File file4 : file3.listFiles()) {
                if (compile.matcher(file4.getName()).find() || compile2.matcher(file4.getName()).find()) {
                    arrayList.add(file4.getAbsolutePath());
                }
            }
        }
        return arrayList;
    }

    private void x0() {
        this.f28786c.setSelected(false);
        long fileSize = FileUtils.fileSize(getExternalCacheDir().getAbsolutePath()) + FileUtils.fileSize(getCacheDir().getAbsolutePath());
        TextView textView = this.f28785b;
        textView.setText(UtilsMy.e(fileSize, "0.0") + " | 图片、视频等临时数据");
    }

    private boolean y0(DownloadTask downloadTask) {
        Iterator<c> it2 = this.C.iterator();
        while (it2.hasNext()) {
            c next = it2.next();
            if (TextUtils.equals(next.e().getCrc_link_type_val(), downloadTask.getCrc_link_type_val())) {
                return next.f();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A0(String str) {
        ArrayList<String> arrayList = this.f28800q;
        if (arrayList != null) {
            arrayList.remove(str);
            l0();
        }
    }

    void B0(DownloadTask downloadTask) {
        c cVar = null;
        try {
            try {
                Iterator<c> it2 = this.C.iterator();
                while (it2.hasNext()) {
                    c next = it2.next();
                    if (TextUtils.equals(next.e().getCrc_link_type_val(), downloadTask.getCrc_link_type_val())) {
                        cVar = next;
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (cVar == null) {
                return;
            }
            String str = getExternalFilesDir("backup") + File.separator + cVar.e().getCrc_link_type_val();
            for (String str2 : cVar.a()) {
                File file = new File(str2);
                if (file.exists()) {
                    String substring = str2.substring(str2.lastIndexOf(net.lingala.zip4j.util.e.F0));
                    if (file.isFile()) {
                        com.join.mgps.Util.h0.c(str2, str + File.separator + substring);
                    } else if (file.isDirectory()) {
                        com.join.mgps.Util.h0.d(str2, str);
                    }
                }
            }
        } finally {
            p0(downloadTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C0() {
        com.join.mgps.Util.v0.c("显示主界面main");
        LinearLayout linearLayout = this.f28798o;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f28797n;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        Group group = this.f28790g;
        if (group != null) {
            group.setVisibility(0);
        }
        LinearLayout linearLayout3 = this.f28799p;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D0() {
        LinearLayout linearLayout = this.f28798o;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f28797n;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        Group group = this.f28790g;
        if (group != null) {
            group.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f28799p;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void E0() {
        if (this.F) {
            if (this.G == null) {
                this.G = new com.join.mgps.dialog.l2(this);
            }
            this.G.e(new l2.a() { // from class: com.join.mgps.activity.b
                @Override // com.join.mgps.dialog.l2.a
                public final void a() {
                    CleanSpaceActivity.this.o0();
                }
            });
            this.G.show();
            return;
        }
        o0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F0() {
        File[] listFiles;
        if (this.f28805v != null) {
            Iterator<DownloadTask> it2 = this.f28808y.iterator();
            while (it2.hasNext()) {
                DownloadTask next = it2.next();
                String str = null;
                Iterator<ModGameArchivePathDataV2> it3 = this.f28805v.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    ModGameArchivePathDataV2 next2 = it3.next();
                    if (TextUtils.equals(next.getCrc_link_type_val(), next2.getGameId())) {
                        str = next2.getMainLocalPath();
                        break;
                    }
                }
                c cVar = new c();
                String b02 = com.join.mgps.va.overmind.f.f54952a.b0();
                String str2 = "";
                if (str != null) {
                    if (str.startsWith("/data/data")) {
                        str = str.replace("/data/data", "/data/user/0");
                        b02 = b02.replace("/sdcard", "");
                    }
                    String str3 = b02 + str;
                    File file = new File(str3);
                    if (file.exists()) {
                        cVar.m(FileUtils.fileSize(file.getAbsolutePath()));
                    } else {
                        cVar.m(0L);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str3);
                    cVar.j(arrayList);
                }
                if (next.isMod() || next.isSingleGame()) {
                    if (b02.endsWith("sdcard")) {
                        b02 = b02.replace("/sdcard", "");
                    }
                    if (next.isMod() && next.getModInfoBean() != null) {
                        str2 = next.getModInfoBean().getMod_package_name();
                    } else if (next.isSingleGame()) {
                        str2 = next.getPackageName();
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        String str4 = b02 + "/data/user/0/" + str2;
                        String str5 = b02 + "/data/app/" + str2;
                        String str6 = b02 + "/data/user_de/0/" + str2;
                        String str7 = b02 + "/sdcard/Android/data/" + str2;
                        String str8 = b02 + "/sdcard/Android/obb/" + str2;
                        cVar.o(FileUtils.fileSize(str4) + FileUtils.fileSize(str5) + FileUtils.fileSize(str6) + FileUtils.fileSize(str7) + FileUtils.fileSize(str8));
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(str4);
                        arrayList2.add(str5);
                        arrayList2.add(str6);
                        arrayList2.add(str7);
                        arrayList2.add(str8);
                        cVar.n(arrayList2);
                    }
                }
                cVar.p(next);
                this.C.add(cVar);
            }
        }
        Iterator<DownloadTask> it4 = this.f28808y.iterator();
        while (it4.hasNext()) {
            DownloadTask next3 = it4.next();
            String plugin_num = next3.getPlugin_num();
            if (TextUtils.equals(plugin_num, String.valueOf(ConstantIntEnum.FC.value())) || TextUtils.equals(plugin_num, String.valueOf(ConstantIntEnum.GBA.value())) || TextUtils.equals(plugin_num, String.valueOf(ConstantIntEnum.FBA.value())) || TextUtils.equals(plugin_num, String.valueOf(ConstantIntEnum.MD.value())) || TextUtils.equals(plugin_num, String.valueOf(ConstantIntEnum.SFC.value())) || TextUtils.equals(plugin_num, String.valueOf(ConstantIntEnum.PSP.value())) || TextUtils.equals(plugin_num, String.valueOf(ConstantIntEnum.PS.value())) || TextUtils.equals(plugin_num, String.valueOf(ConstantIntEnum.WSC.value())) || TextUtils.equals(plugin_num, String.valueOf(ConstantIntEnum.GBC.value()))) {
                List<String> u02 = u0(next3);
                Iterator<c> it5 = this.C.iterator();
                while (it5.hasNext()) {
                    c next4 = it5.next();
                    if (TextUtils.equals(next4.e().getCrc_link_type_val(), next3.getCrc_link_type_val())) {
                        next4.j(u02);
                        next4.m(s0(u02));
                        StringBuilder sb = new StringBuilder();
                        sb.append(getExternalFilesDir("wufan91"));
                        String str9 = File.separator;
                        sb.append(str9);
                        sb.append(next3.getPlugin_num());
                        sb.append(str9);
                        sb.append("roms");
                        sb.append(str9);
                        sb.append(next3.getPackageName());
                        String sb2 = sb.toString();
                        next4.o(FileUtils.fileSize(sb2));
                        next4.n(new ArrayList<String>(sb2) { // from class: com.join.mgps.activity.CleanSpaceActivity.1

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ String f28810b;

                            {
                                this.f28810b = sb2;
                                add(sb2);
                            }
                        });
                    }
                }
            }
        }
        Iterator<DownloadTask> it6 = this.f28804u.iterator();
        while (it6.hasNext()) {
            DownloadTask next5 = it6.next();
            c cVar2 = new c();
            cVar2.q(1);
            cVar2.p(next5);
            String plugin_num2 = next5.getPlugin_num();
            if (TextUtils.equals(plugin_num2, String.valueOf(ConstantIntEnum.FC.value())) || TextUtils.equals(plugin_num2, String.valueOf(ConstantIntEnum.GBA.value())) || TextUtils.equals(plugin_num2, String.valueOf(ConstantIntEnum.FBA.value())) || TextUtils.equals(plugin_num2, String.valueOf(ConstantIntEnum.MD.value())) || TextUtils.equals(plugin_num2, String.valueOf(ConstantIntEnum.SFC.value())) || TextUtils.equals(plugin_num2, String.valueOf(ConstantIntEnum.PSP.value())) || TextUtils.equals(plugin_num2, String.valueOf(ConstantIntEnum.PS.value())) || TextUtils.equals(plugin_num2, String.valueOf(ConstantIntEnum.WSC.value())) || TextUtils.equals(plugin_num2, String.valueOf(ConstantIntEnum.GBC.value()))) {
                cVar2.n(new ArrayList<String>(next5) { // from class: com.join.mgps.activity.CleanSpaceActivity.2

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ DownloadTask f28812b;

                    {
                        this.f28812b = next5;
                        add(next5.getPath());
                    }
                });
                cVar2.o(FileUtils.fileSize(next5.getPath()));
            }
            this.D.add(cVar2);
        }
        File externalFilesDir = getExternalFilesDir("backup");
        if (externalFilesDir.exists() && externalFilesDir.isDirectory() && externalFilesDir.listFiles() != null && externalFilesDir.listFiles().length > 0) {
            for (File file2 : externalFilesDir.listFiles()) {
                if (file2.exists() && file2.isDirectory()) {
                    this.B.add(file2.getName());
                }
            }
            ArrayList<String> arrayList3 = this.B;
            if (arrayList3 != null && arrayList3.size() > 0) {
                t0(0);
                return;
            } else {
                w0();
                return;
            }
        }
        w0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.f28802s = this;
        this.f28801r = com.join.mgps.rpc.impl.i.D0();
        this.f28803t = p1.f.K().C();
        Iterator<DownloadTask> it2 = p1.f.K().D().iterator();
        while (it2.hasNext()) {
            DownloadTask next = it2.next();
            if (TextUtils.equals(next.getPlugin_num(), String.valueOf(ConstantIntEnum.FBA.value())) || TextUtils.equals(next.getPlugin_num(), String.valueOf(ConstantIntEnum.FC.value())) || TextUtils.equals(next.getPlugin_num(), String.valueOf(ConstantIntEnum.GBA.value())) || TextUtils.equals(next.getPlugin_num(), String.valueOf(ConstantIntEnum.MD.value())) || TextUtils.equals(next.getPlugin_num(), String.valueOf(ConstantIntEnum.SFC.value())) || TextUtils.equals(next.getPlugin_num(), String.valueOf(ConstantIntEnum.PSP.value())) || TextUtils.equals(next.getPlugin_num(), String.valueOf(ConstantIntEnum.PS.value())) || TextUtils.equals(next.getPlugin_num(), String.valueOf(ConstantIntEnum.WSC.value())) || TextUtils.equals(next.getPlugin_num(), String.valueOf(ConstantIntEnum.GBC.value()))) {
                this.f28804u.add(next);
            }
        }
        ArrayList<DownloadTask> arrayList = this.f28804u;
        if (arrayList != null && arrayList.size() > 0) {
            this.f28793j.setVisibility(0);
            TextView textView = this.f28791h;
            textView.setText("我的插件(" + this.f28804u.size() + ")");
        } else {
            this.f28793j.setVisibility(8);
        }
        x0();
        this.f28807x = new ArrayList<>();
        this.f28808y = new ArrayList<>();
        Iterator<DownloadTask> it3 = this.f28803t.iterator();
        while (it3.hasNext()) {
            DownloadTask next2 = it3.next();
            if ((next2.isMod() && next2.getModInfoBean() != null && TextUtils.equals(next2.getModInfoBean().getMod_game_id(), next2.getCrc_link_type_val())) || next2.isSingleGame()) {
                this.f28807x.add(next2.getCrc_link_type_val());
                this.f28808y.add(next2);
            } else if (TextUtils.equals(next2.getPlugin_num(), String.valueOf(ConstantIntEnum.FBA.value())) || TextUtils.equals(next2.getPlugin_num(), String.valueOf(ConstantIntEnum.FC.value())) || TextUtils.equals(next2.getPlugin_num(), String.valueOf(ConstantIntEnum.GBA.value())) || TextUtils.equals(next2.getPlugin_num(), String.valueOf(ConstantIntEnum.MD.value())) || TextUtils.equals(next2.getPlugin_num(), String.valueOf(ConstantIntEnum.SFC.value())) || TextUtils.equals(next2.getPlugin_num(), String.valueOf(ConstantIntEnum.PSP.value())) || TextUtils.equals(next2.getPlugin_num(), String.valueOf(ConstantIntEnum.PS.value())) || TextUtils.equals(next2.getPlugin_num(), String.valueOf(ConstantIntEnum.WSC.value())) || TextUtils.equals(next2.getPlugin_num(), String.valueOf(ConstantIntEnum.GBC.value()))) {
                this.f28808y.add(next2);
            }
        }
        v0(this.f28807x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        r0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(String str) {
        ArrayList<String> arrayList = this.f28800q;
        if (arrayList == null || arrayList.contains(str)) {
            return;
        }
        this.f28800q.add(str);
        l0();
    }

    void l0() {
        ArrayList<String> arrayList = this.f28800q;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<String> it2 = this.f28800q.iterator();
            long j4 = 0;
            while (it2.hasNext()) {
                j4 += FileUtils.fileSize(it2.next());
            }
            String e5 = UtilsMy.e(j4, "0.0");
            TextView textView = this.f28795l;
            textView.setText("已选" + this.f28806w + "个，共" + e5);
            this.f28796m.setBackgroundResource(R.drawable.shape_46c1ff_r8);
            return;
        }
        this.f28795l.setText("未选中");
        this.f28796m.setBackgroundResource(R.drawable.shape_e6e6e6_r8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        ImageView imageView;
        this.f28786c.setSelected(!imageView.isSelected());
        if (this.f28786c.isSelected()) {
            this.f28806w++;
            k0(getExternalCacheDir().getAbsolutePath());
            k0(getCacheDir().getAbsolutePath());
            return;
        }
        this.f28806w--;
        A0(getExternalCacheDir().getAbsolutePath());
        A0(getCacheDir().getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        ArrayList<String> arrayList = this.f28800q;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList<DownloadTask> arrayList2 = this.f28809z;
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator<DownloadTask> it2 = this.f28809z.iterator();
            while (it2.hasNext()) {
                DownloadTask next = it2.next();
                if (!y0(next)) {
                    B0(next);
                } else {
                    p0(next);
                }
            }
        }
        ArrayList<DownloadTask> arrayList3 = this.A;
        if (arrayList3 != null && arrayList3.size() > 0) {
            Iterator<DownloadTask> it3 = this.A.iterator();
            while (it3.hasNext()) {
                DownloadTask next2 = it3.next();
                if (next2 != null) {
                    try {
                        String crc_link_type_val = next2.getCrc_link_type_val();
                        EMUApkTable n4 = b2.p.o().n(crc_link_type_val);
                        if (n4 == null) {
                            return;
                        }
                        DownloadTask Z = p1.f.K().Z(Integer.parseInt(crc_link_type_val));
                        if (Z != null) {
                            if (Z.getDown_type() != 2) {
                                if (com.join.android.app.common.utils.e.l0(this).d(this, Z.getPackageName())) {
                                    com.join.android.app.common.utils.e.l0(this).f0(this, Z.getPackageName());
                                } else {
                                    q0(Z);
                                }
                            } else {
                                com.join.mgps.Util.h0.h(Z.getGameZipPath(), true);
                                q0(Z);
                                if (com.join.android.app.common.utils.l.i(n4)) {
                                    com.join.android.app.common.utils.l.delete(crc_link_type_val);
                                }
                                com.join.mgps.Util.h0.h(n4.getApkPath(), true);
                                n4.setApkPath("");
                                b2.p.o().m(n4);
                            }
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
        }
        Iterator<String> it4 = this.f28800q.iterator();
        while (it4.hasNext()) {
            com.join.mgps.Util.h0.i(it4.next());
        }
        this.E = true;
        this.F = false;
        if (this.f28786c.isSelected()) {
            com.papa.sim.statistic.p.l(this.f28802s).O1(Event.clearSystemStoreSuccess, new Ext());
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(this.C);
        arrayList4.addAll(this.D);
        Iterator it5 = arrayList4.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            } else if (((c) it5.next()).g()) {
                com.papa.sim.statistic.p.l(this.f28802s).O1(Event.clearGameBagSuccess, new Ext());
                break;
            }
        }
        Iterator it6 = arrayList4.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            } else if (((c) it6.next()).f()) {
                com.papa.sim.statistic.p.l(this.f28802s).O1(Event.clearDataProgressSuccess, new Ext());
                break;
            }
        }
        z0();
        new com.join.mgps.dialog.i2(this).show();
    }

    @Override // com.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        r0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.papa.sim.statistic.p.l(this.f28802s).O1(Event.visitMemoryClearPage, new Ext());
    }

    public void q0(DownloadTask downloadTask) {
        com.php25.PDownload.d.a(downloadTask);
        try {
            if (downloadTask.getRomType().equals(Dtype.androidobb.name()) || downloadTask.getRomType().equals(Dtype.androiddata.name()) || downloadTask.getRomType().equals(Dtype.androidobbdata.name())) {
                UtilsMy.delete(new File(com.join.mgps.Util.v.f28116p, downloadTask.getPackageName()));
                UtilsMy.delete(new File(com.join.mgps.Util.v.f28117q, downloadTask.getPackageName()));
                UtilsMy.delete(new File(downloadTask.getGameZipPath()));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.php25.PDownload.d.a(downloadTask);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        v0(this.f28807x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f28802s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        com.join.mgps.Util.v0.c("显示加载中");
        LinearLayout linearLayout = this.f28797n;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f28798o;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        Group group = this.f28790g;
        if (group != null) {
            group.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f28799p;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f28798o;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f28797n;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        Group group = this.f28790g;
        if (group != null) {
            group.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f28799p;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void t0(int i4) {
        if (com.join.android.app.common.utils.j.j(this.f28802s)) {
            try {
                if (i4 <= this.B.size() - 1) {
                    String str = this.B.get(i4);
                    com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f28802s).getAccountData();
                    if (accountData == null) {
                        accountData = com.wufan.user.service.protobuf.n0.f5().build();
                    }
                    RequestModel requestModel = new RequestModel();
                    requestModel.setDefault(this.f28802s);
                    RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs(str, 1, accountData.getUid());
                    requestGameIdArgs.setDownloadedGameIdList(p1.f.K().A());
                    requestModel.setArgs(requestGameIdArgs);
                    ResponseModel<GamedetialModleFourBean> body = com.join.mgps.rpc.impl.i.D0().B0().p(requestModel.makeSign()).execute().body();
                    if (body != null && body.getCode() == 200) {
                        c cVar = new c();
                        cVar.p(body.getData().getDownloadtaskDown());
                        File file = new File(getExternalFilesDir("backup").getAbsolutePath() + File.separator + str);
                        if (file.exists()) {
                            cVar.j(new ArrayList<String>(file) { // from class: com.join.mgps.activity.CleanSpaceActivity.3

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ File f28814b;

                                {
                                    this.f28814b = file;
                                    add(file.getAbsolutePath());
                                }
                            });
                            cVar.m(FileUtils.fileSize(file.getAbsolutePath()));
                            this.C.add(cVar);
                        }
                    }
                    t0(i4 + 1);
                    return;
                }
                w0();
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                w0();
                return;
            }
        }
        w0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void v0(List<String> list) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                if (accountData == null) {
                    accountData = com.wufan.user.service.protobuf.n0.b5();
                }
                RequestModel requestModel = new RequestModel();
                ArchievePathMultiArgs archievePathMultiArgs = new ArchievePathMultiArgs();
                archievePathMultiArgs.setUid(String.valueOf(accountData.getUid()));
                archievePathMultiArgs.setDownloadedGameIdList(list);
                requestModel.setArgs(archievePathMultiArgs);
                requestModel.setDefault(this);
                ResponseModel<ArchievePathMultiBean> r4 = this.f28801r.r(requestModel.makeSign());
                if (r4 == null || r4.getCode() != 200 || r4.getData() == null) {
                    return;
                }
                this.f28805v = r4.getData().getCloud_archive_path_list();
                F0();
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0() {
        C0();
        ArrayList<c> arrayList = this.C;
        if (arrayList != null && arrayList.size() > 0) {
            this.f28789f.setVisibility(0);
            TextView textView = this.f28787d;
            textView.setText("我的游戏(" + this.C.size() + ")");
        } else {
            this.f28789f.setVisibility(8);
        }
        UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
        aVar.f46233f = 0;
        aVar.f46237d = (int) getResources().getDimension(R.dimen.wdp20);
        this.f28788e.setLayoutManager(new LinearLayoutManager(this));
        this.f28788e.setAdapter(new d(this.C, 0));
        if (this.f28788e.getItemDecorationCount() <= 0) {
            this.f28788e.addItemDecoration(new a(aVar));
        }
        this.f28792i.setLayoutManager(new LinearLayoutManager(this));
        this.f28792i.setAdapter(new d(this.D, 1));
        if (this.f28792i.getItemDecorationCount() <= 0) {
            this.f28792i.addItemDecoration(new b(aVar));
        }
    }

    void z0() {
        this.f28800q = new ArrayList<>();
        this.f28809z = new ArrayList<>();
        this.f28806w = 0;
        this.f28795l.setText("未选中");
        this.f28796m.setBackgroundResource(R.drawable.shape_e6e6e6_r8);
        this.f28803t = new ArrayList<>();
        this.f28804u = new ArrayList<>();
        this.C = new ArrayList<>();
        this.D = new ArrayList<>();
        this.B = new ArrayList<>();
        afterviews();
    }
}
