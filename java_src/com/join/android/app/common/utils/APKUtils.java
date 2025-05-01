package com.join.android.app.common.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Service;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import com.MApplication;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.servcie.r;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.StartGameMeta;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.q1;
import com.join.mgps.Util.v0;
import com.join.mgps.Util.w0;
import com.join.mgps.activity.MiniGameLoadingActivity_;
import com.join.mgps.activity.ModGameIndexActivity;
import com.join.mgps.activity.ModGameIndexActivity_;
import com.join.mgps.db.tables.DownloadHistoryTable;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dialog.p2;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.SingleGameModInfoBean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.mod.bean.ModMeta;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.va.overmind.d;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.p;
import com.papa91.arc.ext.ThreadManager;
import com.vuaukou.vco.hykiiuy.plugin.InstrumentationProxy;
import com.xinzhu.overmind.Overmind;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.androidannotations.annotations.EBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: APKUtils.kt */
@EBean(scope = EBean.Scope.Singleton)
@SourceDebugExtension({"SMAP\nAPKUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 APKUtils.kt\ncom/join/android/app/common/utils/APKUtils\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1748:1\n107#2:1749\n79#2,22:1750\n1#3:1772\n37#4,2:1773\n*S KotlinDebug\n*F\n+ 1 APKUtils.kt\ncom/join/android/app/common/utils/APKUtils\n*L\n536#1:1749\n536#1:1750,22\n741#1:1773,2\n*E\n"})
/* loaded from: classes3.dex */
public class APKUtils {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f14829a = new Companion(null);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final String f14830b = "APKUtils";

    /* compiled from: APKUtils.kt */
    @SourceDebugExtension({"SMAP\nAPKUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 APKUtils.kt\ncom/join/android/app/common/utils/APKUtils$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1748:1\n37#2,2:1749\n37#2,2:1751\n37#2,2:1753\n*S KotlinDebug\n*F\n+ 1 APKUtils.kt\ncom/join/android/app/common/utils/APKUtils$Companion\n*L\n1331#1:1749,2\n1476#1:1751,2\n1495#1:1753,2\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void J(Companion companion, Context context, ModInfoBean modInfoBean, String str, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                str = "";
            }
            companion.F(context, modInfoBean, str);
        }

        public static /* synthetic */ void K(Companion companion, Context context, String str, String str2, String str3, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                str2 = "";
            }
            if ((i4 & 8) != 0) {
                str3 = "";
            }
            companion.I(context, str, str2, str3);
        }

        private final void N(Context context, DownloadTask downloadTask, ModMeta modMeta) {
            int i4;
            try {
                d.a aVar = com.join.mgps.va.overmind.d.f54937g;
                String packageName = downloadTask.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "downloadTask.packageName");
                aVar.i(packageName, downloadTask.getResource_path());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            com.join.mgps.va.overmind.d.f54937g.d().W(context, modMeta, downloadTask);
            if (v(downloadTask)) {
                i4 = 1;
            } else {
                i4 = z(downloadTask) ? 2 : 0;
            }
            p.l(context).h1(downloadTask.getCrc_link_type_val(), AccountUtil_.getInstance_(context).getUid(), i4, downloadTask.get_from(), downloadTask.get_from_type(), downloadTask.getExt());
            UtilsMy.t4(context, downloadTask.getCrc_link_type_val());
            UtilsMy.T1(context, 12, downloadTask.getCrc_link_type_val());
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final void O(Context context, DownloadTask downloadTask) {
            if (downloadTask == null || context == null) {
                return;
            }
            downloadTask.setStatus(5);
            if (downloadTask.getRomType() != null && !Intrinsics.areEqual(downloadTask.getFileType(), Dtype.chajian.name())) {
                DownloadHistoryTable p4 = b2.k.n().p(downloadTask.getCrc_link_type_val());
                if (p4 != null) {
                    p4.setCreate_time(System.currentTimeMillis());
                } else {
                    p4 = new DownloadHistoryTable();
                    p4.setCrc_link_type_val(downloadTask.getCrc_link_type_val());
                    p4.setCreate_time(System.currentTimeMillis());
                }
                b2.k.n().m(p4);
                UtilsMy.N2(context, downloadTask.getCrc_link_type_val());
                new PrefDef_(context).lastInstallApp().g("");
            } else {
                try {
                    e l02 = e.l0(context);
                    String packageName = downloadTask.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "downloadTask.packageName");
                    a l4 = l02.l(context, packageName);
                    if (l4 != null) {
                        downloadTask.setVer(l4.d() + "");
                        downloadTask.setVer_name(l4.e());
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            try {
                DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                if (f5 != null) {
                    f5.setStatus(5);
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            p1.f.K().j0(downloadTask, downloadTask.getStatus());
            downloadTask.setStatus(5);
            r.b(context, downloadTask, Event.installAndroidCompleted);
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 5));
            try {
                File file = new File(downloadTask.getPath());
                if (file.exists()) {
                    UtilsMy.delete(file);
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Q(com.join.mgps.customview.o mDialog, CheckBox checkBox, EMUApkTable emuApkTable, Function0 callback, View view) {
            Intrinsics.checkNotNullParameter(mDialog, "$mDialog");
            Intrinsics.checkNotNullParameter(emuApkTable, "$emuApkTable");
            Intrinsics.checkNotNullParameter(callback, "$callback");
            mDialog.dismiss();
            if (checkBox.isChecked()) {
                try {
                    String ver = emuApkTable.getVer();
                    Intrinsics.checkNotNullExpressionValue(ver, "emuApkTable.ver");
                    emuApkTable.setNotUpdateversion(Integer.parseInt(((String[]) new Regex("_").split(ver, 0).toArray(new String[0]))[0]));
                    b2.p.o().update(emuApkTable);
                } catch (NumberFormatException e5) {
                    e5.printStackTrace();
                }
            }
            callback.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void R(com.join.mgps.customview.o mDialog, EMUApkTable emuApkTable, Context context, CheckBox checkBox, View view) {
            Intrinsics.checkNotNullParameter(mDialog, "$mDialog");
            Intrinsics.checkNotNullParameter(emuApkTable, "$emuApkTable");
            if (mDialog.isShowing()) {
                mDialog.dismiss();
            }
            UtilsMy.q1(emuApkTable, context);
            if (checkBox.isChecked()) {
                try {
                    String ver = emuApkTable.getVer();
                    Intrinsics.checkNotNullExpressionValue(ver, "emuApkTable.ver");
                    emuApkTable.setNotUpdateversion(Integer.parseInt(((String[]) new Regex("_").split(ver, 0).toArray(new String[0]))[0]));
                    b2.p.o().update(emuApkTable);
                } catch (NumberFormatException e5) {
                    e5.printStackTrace();
                }
            }
        }

        private final boolean T(PackageInfo packageInfo) {
            try {
                Intrinsics.checkNotNull(packageInfo);
                return packageInfo.applicationInfo.metaData.getInt("PA_APP_USE_CHANNEL_WRITER", 1) == 1;
            } catch (Exception e5) {
                e5.printStackTrace();
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00d7 A[Catch: Exception -> 0x011c, TryCatch #1 {Exception -> 0x011c, blocks: (B:15:0x005b, B:17:0x00d7, B:24:0x00e5, B:26:0x00f2, B:25:0x00e8), top: B:34:0x005b }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00e5 A[Catch: Exception -> 0x011c, TryCatch #1 {Exception -> 0x011c, blocks: (B:15:0x005b, B:17:0x00d7, B:24:0x00e5, B:26:0x00f2, B:25:0x00e8), top: B:34:0x005b }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00e8 A[Catch: Exception -> 0x011c, TryCatch #1 {Exception -> 0x011c, blocks: (B:15:0x005b, B:17:0x00d7, B:24:0x00e5, B:26:0x00f2, B:25:0x00e8), top: B:34:0x005b }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void X(java.io.File r5, java.lang.String r6, java.lang.String r7, kotlin.jvm.functions.Function1 r8) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.utils.APKUtils.Companion.X(java.io.File, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1):void");
        }

        public static /* synthetic */ void k(Companion companion, DownloadTask downloadTask, long j4, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                j4 = 86400000;
            }
            companion.j(downloadTask, j4);
        }

        private final boolean s(PackageInfo packageInfo) {
            try {
                Intrinsics.checkNotNull(packageInfo);
                Bundle bundle = packageInfo.applicationInfo.metaData;
                if (bundle.getInt("PA_APP_KEY", 0) == 0) {
                    if (bundle.getInt("PA_GAME_ID", 0) == 0) {
                        return false;
                    }
                }
                return true;
            } catch (Exception e5) {
                e5.printStackTrace();
                return false;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x001a A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:6:0x0006, B:8:0x000c, B:13:0x001a, B:15:0x001e, B:17:0x002e, B:19:0x0036, B:21:0x003c), top: B:26:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x001e A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:6:0x0006, B:8:0x000c, B:13:0x001a, B:15:0x001e, B:17:0x002e, B:19:0x0036, B:21:0x003c), top: B:26:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean A(@org.jetbrains.annotations.Nullable android.content.Context r3, @org.jetbrains.annotations.Nullable com.join.mgps.db.tables.EMUApkTable r4) {
            /*
                r2 = this;
                r0 = 0
                if (r4 == 0) goto L49
                r1 = 0
                if (r3 == 0) goto L17
                android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Exception -> L15
                if (r3 == 0) goto L17
                java.lang.String r4 = r4.getPackage_name()     // Catch: java.lang.Exception -> L15
                android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r0)     // Catch: java.lang.Exception -> L15
                goto L18
            L15:
                r3 = move-exception
                goto L46
            L17:
                r3 = r1
            L18:
                if (r3 == 0) goto L1c
                android.content.pm.ApplicationInfo r1 = r3.applicationInfo     // Catch: java.lang.Exception -> L15
            L1c:
                if (r1 == 0) goto L49
                com.join.mgps.va.overmind.b$a r4 = com.join.mgps.va.overmind.b.f54935a     // Catch: java.lang.Exception -> L15
                android.content.pm.ApplicationInfo r3 = r3.applicationInfo     // Catch: java.lang.Exception -> L15
                java.lang.String r3 = r3.sourceDir     // Catch: java.lang.Exception -> L15
                java.util.Set r3 = r4.d(r3)     // Catch: java.lang.Exception -> L15
                boolean r1 = r4.a(r3)     // Catch: java.lang.Exception -> L15
                if (r1 == 0) goto L36
                com.join.mgps.va.overmind.d$a r1 = com.join.mgps.va.overmind.d.f54937g     // Catch: java.lang.Exception -> L15
                boolean r1 = r1.g()     // Catch: java.lang.Exception -> L15
                if (r1 == 0) goto L44
            L36:
                boolean r3 = r4.b(r3)     // Catch: java.lang.Exception -> L15
                if (r3 == 0) goto L49
                com.join.mgps.va.overmind.d$a r3 = com.join.mgps.va.overmind.d.f54937g     // Catch: java.lang.Exception -> L15
                boolean r3 = r3.g()     // Catch: java.lang.Exception -> L15
                if (r3 == 0) goto L49
            L44:
                r0 = 1
                goto L49
            L46:
                r3.getLocalizedMessage()
            L49:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.utils.APKUtils.Companion.A(android.content.Context, com.join.mgps.db.tables.EMUApkTable):boolean");
        }

        @JvmStatic
        public final void B(@NotNull final Context context, @NotNull final ArchiveData archiveData, @NotNull final String fingerSwitch, @NotNull final String introdSwitch, @NotNull final DownloadTask downloadTask) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(archiveData, "archiveData");
            Intrinsics.checkNotNullParameter(fingerSwitch, "fingerSwitch");
            Intrinsics.checkNotNullParameter(introdSwitch, "introdSwitch");
            Intrinsics.checkNotNullParameter(downloadTask, "downloadTask");
            if (com.join.mgps.va.overmind.d.f54937g.d().N(downloadTask.getPackageName()) && (e(context, downloadTask) || g(context, new Function0<Unit>() { // from class: com.join.android.app.common.utils.APKUtils$Companion$openCloudVmApp$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    APKUtils.f14829a.C(context, archiveData, downloadTask, fingerSwitch, introdSwitch);
                }
            }))) {
                return;
            }
            C(context, archiveData, downloadTask, fingerSwitch, introdSwitch);
        }

        public final void C(@NotNull Context context, @NotNull ArchiveData archiveData, @NotNull DownloadTask downloadTask, @NotNull String fingerSwitch, @NotNull String introdSwitch) {
            int i4;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(archiveData, "archiveData");
            Intrinsics.checkNotNullParameter(downloadTask, "downloadTask");
            Intrinsics.checkNotNullParameter(fingerSwitch, "fingerSwitch");
            Intrinsics.checkNotNullParameter(introdSwitch, "introdSwitch");
            d.a aVar = com.join.mgps.va.overmind.d.f54937g;
            com.join.mgps.va.overmind.d d5 = aVar.d();
            String packageName = archiveData.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "archiveData.packageName");
            String mainArchiveLocalPath = archiveData.getMainArchiveLocalPath();
            Intrinsics.checkNotNullExpressionValue(mainArchiveLocalPath, "archiveData.mainArchiveLocalPath");
            String mainArchiveLocalPath2 = archiveData.getMainArchiveLocalPath2();
            String id = archiveData.getId();
            Intrinsics.checkNotNullExpressionValue(id, "archiveData.id");
            d5.A(packageName, mainArchiveLocalPath, mainArchiveLocalPath2, id);
            try {
                if (Build.VERSION.SDK_INT >= 21) {
                    String packageName2 = downloadTask.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName2, "downloadTask.getPackageName()");
                    aVar.i(packageName2, downloadTask.getResource_path());
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            ModMeta modMeta = new ModMeta();
            if (v(downloadTask)) {
                ModInfoBean modInfoBean = downloadTask.getModInfoBean();
                if (modInfoBean != null) {
                    int ver = modInfoBean.getVer();
                    modMeta.setModVersion(String.valueOf(ver));
                    modMeta.setModCode(ver);
                }
                i4 = 1;
            } else if (z(downloadTask)) {
                SingleGameModInfoBean singleGameModInfoBean = downloadTask.getSingleGameModInfoBean();
                if (singleGameModInfoBean != null) {
                    Integer version = singleGameModInfoBean.getVersion();
                    Intrinsics.checkNotNullExpressionValue(version, "modInfo.version");
                    int intValue = version.intValue();
                    modMeta.setModVersion(String.valueOf(intValue));
                    modMeta.setModCode(intValue);
                }
                i4 = 2;
            } else {
                i4 = 0;
            }
            modMeta.setPackageName(downloadTask.getPackageName());
            modMeta.setModPath(downloadTask.getResource_path());
            modMeta.setGameId(downloadTask.getCrc_link_type_val());
            modMeta.setGoldFingerSwitch(fingerSwitch);
            modMeta.setIntroductionSwitch(introdSwitch);
            modMeta.setArchiveCloudSwitch("1");
            modMeta.setTypeId(UtilsMy.a2(downloadTask));
            com.join.mgps.va.overmind.d.f54937g.d().V(context, modMeta, archiveData.getUserId(), downloadTask.getMod_info());
            p.l(context).h1(downloadTask.getCrc_link_type_val(), AccountUtil_.getInstance_(context).getUid(), i4, downloadTask.get_from(), downloadTask.get_from_type(), downloadTask.getExt());
            UtilsMy.t4(context, downloadTask.getCrc_link_type_val());
            if (downloadTask.getModInfoBean() != null) {
                UtilsMy.t4(context, downloadTask.getModInfoBean().getMain_game_id());
                UtilsMy.T1(context, 12, downloadTask.getModInfoBean().getMain_game_id());
                return;
            }
            UtilsMy.T1(context, 12, downloadTask.getCrc_link_type_val());
        }

        @JvmStatic
        public final void D(@NotNull Context context, @NotNull DownloadTask downloadTask) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(downloadTask, "downloadTask");
            if (downloadTask.isMiniGame()) {
                ((MiniGameLoadingActivity_.d) MiniGameLoadingActivity_.T0(context).flags(268435456)).b(downloadTask.getStatus() == 5).a(downloadTask.getCrc_link_type_val()).start();
            }
        }

        @JvmStatic
        @JvmOverloads
        public final void E(@Nullable Context context, @NotNull ModInfoBean bean) {
            Intrinsics.checkNotNullParameter(bean, "bean");
            J(this, context, bean, null, 4, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void F(@Nullable Context context, @NotNull ModInfoBean bean, @Nullable String str) {
            Intrinsics.checkNotNullParameter(bean, "bean");
            ModGameIndexActivity_.o2(context).b(bean.getMod_game_id()).a(str).c(bean.getMain_game_id()).start();
            if (context instanceof ModGameIndexActivity_) {
                ((ModGameIndexActivity_) context).finish();
            }
        }

        @JvmStatic
        @JvmOverloads
        public final void G(@Nullable Context context, @NotNull String gameId) {
            Intrinsics.checkNotNullParameter(gameId, "gameId");
            K(this, context, gameId, null, null, 12, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void H(@Nullable Context context, @NotNull String gameId, @NotNull String modGameId) {
            Intrinsics.checkNotNullParameter(gameId, "gameId");
            Intrinsics.checkNotNullParameter(modGameId, "modGameId");
            K(this, context, gameId, modGameId, null, 8, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void I(@Nullable Context context, @NotNull String gameId, @NotNull String modGameId, @Nullable String str) {
            Intrinsics.checkNotNullParameter(gameId, "gameId");
            Intrinsics.checkNotNullParameter(modGameId, "modGameId");
            ModGameIndexActivity_.o2(context).b(modGameId).a(str).c(gameId).start();
            if (context instanceof ModGameIndexActivity_) {
                ((ModGameIndexActivity_) context).finish();
            }
        }

        @JvmStatic
        public final boolean L(@NotNull Context context, @NotNull String packageName) {
            Intent intent;
            DownloadTask downloadTask;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            List<DownloadTask> H = p1.f.K().H(packageName);
            if (H != null && H.size() > 0 && (downloadTask = H.get(0)) != null) {
                MApplication.f1497x.l().lastLaunchModGameId().g(downloadTask.getCrc_link_type_val());
                UtilsMy.T1(context, 12, downloadTask.getCrc_link_type_val());
            }
            PackageManager packageManager = context.getPackageManager();
            try {
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage != null) {
                    context.startActivity(launchIntentForPackage);
                    MApplication.f1497x.G(true);
                    return true;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            String str = null;
            try {
                intent = new Intent("android.intent.action.MAIN");
                intent.setPackage(packageName);
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 1);
                Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "pkgMag.queryIntentActivi…IVITIES\n                )");
                int size = queryIntentActivities.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    ResolveInfo resolveInfo = queryIntentActivities.get(i4);
                    if (Intrinsics.areEqual(resolveInfo.activityInfo.packageName, packageName)) {
                        str = resolveInfo.activityInfo.name;
                        break;
                    }
                    i4++;
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Intrinsics.checkNotNull(str);
            intent.setComponent(new ComponentName(packageName, str));
            context.startActivity(intent);
            MApplication.f1497x.G(true);
            return true;
        }

        @JvmStatic
        public final void M(@NotNull Context context, @NotNull DownloadTask downloadTask) {
            SingleGameModInfoBean singleGameModInfoBean;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(downloadTask, "downloadTask");
            ModMeta modMeta = new ModMeta();
            modMeta.setPackageName(downloadTask.getPackageName());
            modMeta.setModPath(downloadTask.getResource_path());
            if (y(downloadTask) && (singleGameModInfoBean = downloadTask.getSingleGameModInfoBean()) != null) {
                modMeta.setModVersion(singleGameModInfoBean.getVersion().intValue() + "");
                Integer version = singleGameModInfoBean.getVersion();
                Intrinsics.checkNotNullExpressionValue(version, "singleGameModInfoBean.version");
                modMeta.setModCode(version.intValue());
            }
            modMeta.setGameId(downloadTask.getCrc_link_type_val());
            modMeta.setModType(1);
            modMeta.setTypeId(UtilsMy.a2(downloadTask));
            N(context, downloadTask, modMeta);
        }

        public final void P(@Nullable final Context context, @NotNull final EMUApkTable emuApkTable, @NotNull final Function0<Unit> callback) {
            Intrinsics.checkNotNullParameter(emuApkTable, "emuApkTable");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Activity activity = MApplication.f1497x.getActivity();
            if (activity == null) {
                activity = context;
            }
            final com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(activity, R.style.MyDialog);
            oVar.setContentView(R.layout.plug_update_dialog_layout);
            final CheckBox checkBox = (CheckBox) oVar.findViewById(R.id.checkbox);
            ((TextView) oVar.findViewById(R.id.title)).setText(emuApkTable.getApk_name());
            ((TextView) oVar.findViewById(R.id.content)).setText(Html.fromHtml(emuApkTable.getVer_info()));
            View findViewById = oVar.findViewById(R.id.dialog_button_ok);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.Button");
            View findViewById2 = oVar.findViewById(R.id.dialog_button_cancle);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.Button");
            ((Button) findViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.join.android.app.common.utils.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    APKUtils.Companion.Q(com.join.mgps.customview.o.this, checkBox, emuApkTable, callback, view);
                }
            });
            ((Button) findViewById).setOnClickListener(new View.OnClickListener() { // from class: com.join.android.app.common.utils.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    APKUtils.Companion.R(com.join.mgps.customview.o.this, emuApkTable, context, checkBox, view);
                }
            });
            oVar.setCancelable(true);
            oVar.show();
        }

        @JvmStatic
        public final boolean S(@Nullable DownloadTask downloadTask, @NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            boolean z4 = false;
            if (downloadTask != null && !g2.h(type)) {
                Iterator<TipBean> it2 = downloadTask.getTipBeans().iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.areEqual(type, it2.next().getId())) {
                        z4 = true;
                    }
                }
            }
            return z4;
        }

        @JvmStatic
        public final boolean U(@Nullable String str) {
            return true;
        }

        @JvmStatic
        public final void V(@NotNull final File apkFile, @NotNull final String from, @NotNull final String p4, @NotNull final Function1<? super String, Unit> callback) {
            Intrinsics.checkNotNullParameter(apkFile, "apkFile");
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(p4, "p");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ThreadManager.runOnWriteThread(new Runnable() { // from class: com.join.android.app.common.utils.d
                @Override // java.lang.Runnable
                public final void run() {
                    APKUtils.Companion.X(apkFile, from, p4, callback);
                }
            });
        }

        @JvmStatic
        public final void W(@NotNull String apkPath, @Nullable DownloadTask downloadTask, @NotNull Function1<? super String, Unit> callback) {
            String str;
            Intrinsics.checkNotNullParameter(apkPath, "apkPath");
            Intrinsics.checkNotNullParameter(callback, "callback");
            File file = new File(apkPath);
            if (file.exists()) {
                String str2 = "";
                if (downloadTask != null) {
                    str2 = String.valueOf(downloadTask.get_from());
                    str = String.valueOf(downloadTask.get_from_type());
                } else {
                    str = "";
                }
                APKUtils.f14829a.V(file, str2, str, callback);
                return;
            }
            callback.invoke(apkPath);
        }

        @JvmStatic
        public final boolean e(@Nullable Context context, @Nullable DownloadTask downloadTask) {
            EMUApkTable n4;
            if (context == null) {
                context = MApplication.f1497x.getActivity();
            }
            if (!com.join.mgps.va.overmind.d.f54937g.g()) {
                b2.p o4 = b2.p.o();
                n4 = o4.n(ConstantIntEnum.VA64.value() + "");
            } else {
                b2.p o5 = b2.p.o();
                n4 = o5.n(ConstantIntEnum.VA32.value() + "");
            }
            if (!Overmind.isPluginPkgInstalled() || A(context, n4)) {
                if (n4 == null || context == null) {
                    return true;
                }
                new p2(context).a(downloadTask, n4);
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean f(@Nullable Context context, @Nullable CommonGameInfoBean commonGameInfoBean) {
            EMUApkTable n4;
            if (context == null) {
                context = MApplication.f1497x.getActivity();
            }
            if (!com.join.mgps.va.overmind.d.f54937g.g()) {
                b2.p o4 = b2.p.o();
                n4 = o4.n(ConstantIntEnum.VA64.value() + "");
            } else {
                b2.p o5 = b2.p.o();
                n4 = o5.n(ConstantIntEnum.VA32.value() + "");
            }
            if (!Overmind.isPluginPkgInstalled() || A(context, n4)) {
                if (n4 == null || context == null) {
                    return true;
                }
                new p2(context).b(commonGameInfoBean, n4);
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean g(@Nullable Context context, @NotNull Function0<Unit> callback) {
            EMUApkTable n4;
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (!com.join.mgps.va.overmind.d.f54937g.g()) {
                b2.p o4 = b2.p.o();
                n4 = o4.n(ConstantIntEnum.VA64.value() + "");
            } else {
                b2.p o5 = b2.p.o();
                n4 = o5.n(ConstantIntEnum.VA32.value() + "");
            }
            if (UtilsMy.B0(context, n4)) {
                UtilsMy.q1(n4, context);
                return true;
            } else if (n4.isCanUpdate()) {
                P(context, n4, callback);
                return true;
            } else {
                return false;
            }
        }

        @JvmStatic
        public final void h(@Nullable DownloadTask downloadTask) {
            boolean z4;
            if (downloadTask != null) {
                try {
                    boolean z5 = true;
                    boolean z6 = false;
                    if (downloadTask.isMod()) {
                        ModInfoBean modInfoBean = downloadTask.getModInfoBean();
                        if (modInfoBean != null && g2.i(modInfoBean.getCompatible_version()) && g2.i(modInfoBean.getCompatible_version())) {
                            String compatible_version = modInfoBean.getCompatible_version();
                            Intrinsics.checkNotNullExpressionValue(compatible_version, "modInfoBean.compatible_version");
                            for (String str : (String[]) StringsKt.split$default((CharSequence) compatible_version, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0])) {
                                if (Intrinsics.areEqual(str, modInfoBean.getMain_game_ver())) {
                                    z4 = true;
                                    break;
                                }
                            }
                        }
                        z4 = false;
                        Iterator<TipBean> it2 = downloadTask.getTipBeans().iterator();
                        while (it2.hasNext()) {
                            TipBean next = it2.next();
                            if (!Intrinsics.areEqual(next.getId(), ConstantIntEnum.DATA.value() + "")) {
                                if (!Intrinsics.areEqual(next.getId(), ConstantIntEnum.OBB.value() + "")) {
                                    if (Intrinsics.areEqual(next.getId(), ConstantIntEnum.OBBDATA.value() + "")) {
                                    }
                                }
                            }
                            z6 = true;
                        }
                        z5 = z4;
                    } else if (!z(downloadTask)) {
                        z5 = false;
                    }
                    if (g2.i(downloadTask.getPath())) {
                        File file = new File(downloadTask.getPath());
                        if ((file.exists() && !z5) || (z6 && Build.VERSION.SDK_INT >= 30)) {
                            UtilsMy.delete(file);
                        }
                    }
                    if (g2.i(downloadTask.getGameZipPath())) {
                        File file2 = new File(downloadTask.getGameZipPath());
                        if ((!file2.exists() || z5) && (!z6 || Build.VERSION.SDK_INT < 30)) {
                            return;
                        }
                        UtilsMy.delete(file2);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        @JvmStatic
        @JvmOverloads
        public final void i(@Nullable DownloadTask downloadTask) {
            k(this, downloadTask, 0L, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void j(@Nullable DownloadTask downloadTask, long j4) {
            if (downloadTask == null || System.currentTimeMillis() - downloadTask.getFinishTime() < j4) {
                return;
            }
            if (g2.i(downloadTask.getPath())) {
                File file = new File(downloadTask.getPath());
                if (file.exists()) {
                    UtilsMy.delete(file);
                }
            }
            if (g2.i(downloadTask.getGameZipPath())) {
                File file2 = new File(downloadTask.getGameZipPath());
                if (file2.exists()) {
                    UtilsMy.delete(file2);
                }
            }
        }

        @JvmStatic
        @Nullable
        public final String l(@NotNull Context context, @NotNull String packageName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(64);
            Intrinsics.checkNotNullExpressionValue(installedPackages, "pm\n                .getI…geManager.GET_SIGNATURES)");
            for (PackageInfo packageInfo : installedPackages) {
                if (Intrinsics.areEqual(packageInfo.packageName, packageName)) {
                    return packageInfo.signatures[0].toCharsString();
                }
            }
            return null;
        }

        @Nullable
        public final Context m(@NotNull Context context, @NotNull String packageName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            if (Intrinsics.areEqual(context.getPackageName(), packageName)) {
                return context;
            }
            try {
                return context.createPackageContext(packageName, 3);
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                return null;
            }
        }

        @JvmStatic
        public final void n(@NotNull Context context, @NotNull DownloadTask task) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(task, "task");
            e l02 = e.l0(context);
            Intrinsics.checkNotNullExpressionValue(l02, "getInstance_(context)");
            if (APKUtils.f(l02, context, task.getPackageName(), null, 4, null)) {
                String packageName = task.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "task.packageName");
                L(context, packageName);
                UtilsMy.t4(context, task.getCrc_link_type_val());
                UtilsMy.T1(context, 12, task.getCrc_link_type_val());
                return;
            }
            File file = new File(task.getPath());
            PrefDef_ prefDef_ = new PrefDef_(context);
            if (g2.i(prefDef_.lastLaunchModGameId().d()) && prefDef_.lastLaunchModGameId().d().equals(task.getCrc_link_type_val())) {
                prefDef_.lastLaunchModGameId().g("");
            }
            com.join.mgps.va.overmind.d.f54937g.d().l0(task.getPackageName());
            if (g2.i(task.getPackageName())) {
                com.join.mgps.va.overmind.f fVar = com.join.mgps.va.overmind.f.f54952a;
                String packageName2 = task.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName2, "task.packageName");
                UtilsMy.delete(new File(fVar.M(packageName2)));
            }
            if (g2.i(task.getPackageName())) {
                com.join.mgps.va.overmind.f fVar2 = com.join.mgps.va.overmind.f.f54952a;
                String packageName3 = task.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName3, "task.packageName");
                UtilsMy.delete(new File(com.join.mgps.va.overmind.f.x(fVar2, packageName3, 0, 2, null)));
            }
            if (g2.i(task.getResource_path())) {
                File file2 = new File(task.getResource_path());
                String absolutePath = file2.getParentFile().getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "modFile.parentFile.absolutePath");
                String packageName4 = task.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName4, "task.packageName");
                if (StringsKt.endsWith$default(absolutePath, packageName4, false, 2, (Object) null)) {
                    UtilsMy.delete(file2.getParentFile());
                } else {
                    UtilsMy.delete(file2);
                }
            }
            task.setStatus(11);
            task.setInstall_type(DEVICE_TYPE.REAL.value());
            p1.f.K().m(task);
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(task, 11));
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 30 && file.exists()) {
                if (!Intrinsics.areEqual(task.getRomType(), Dtype.androidobb.name()) && !Intrinsics.areEqual(task.getRomType(), Dtype.androiddata.name()) && !Intrinsics.areEqual(task.getRomType(), Dtype.androidobbdata.name())) {
                    e.l0(context).w(context, file);
                } else {
                    com.join.android.app.common.servcie.i.e().r(context, task, false);
                }
            } else if (i4 < 30) {
                if (task.getDown_status() == 5) {
                    UtilsMy.l1(context, task);
                } else {
                    com.php25.PDownload.d.c(task, context);
                }
            } else if (!Intrinsics.areEqual(task.getRomType(), Dtype.androidobb.name()) && !Intrinsics.areEqual(task.getRomType(), Dtype.androiddata.name()) && !Intrinsics.areEqual(task.getRomType(), Dtype.androidobbdata.name())) {
                if (task.getDown_status() == 5) {
                    UtilsMy.l1(context, task);
                } else {
                    com.php25.PDownload.d.c(task, context);
                }
            } else {
                task.setPath("");
                task.setGameZipPath("");
                p1.f.K().m(task);
                UtilsMy.i1(context, task);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void o(@org.jetbrains.annotations.NotNull android.content.Context r7) {
            /*
                r6 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                com.xinzhu.overmind.Overmind r0 = com.xinzhu.overmind.Overmind.get()
                r1 = 0
                java.util.List r0 = r0.getInstalledPackages(r1, r1)
                java.util.Iterator r0 = r0.iterator()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L69
                java.lang.Object r1 = r0.next()
                android.content.pm.PackageInfo r1 = (android.content.pm.PackageInfo) r1
                java.lang.String r1 = r1.packageName
                com.xinzhu.overmind.client.frameworks.g r2 = com.xinzhu.overmind.Overmind.getMindPackageManager()
                com.xinzhu.overmind.server.pm.MindPackageSettings r2 = r2.k(r1)
                if (r2 == 0) goto L30
                boolean r2 = r2.k()
                if (r2 == 0) goto L12
            L30:
                r2 = 0
                p1.f r3 = p1.f.K()
                java.util.List r1 = r3.H(r1)
                if (r1 == 0) goto L5a
                java.util.Iterator r1 = r1.iterator()
            L3f:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L5a
                java.lang.Object r3 = r1.next()
                com.github.snowdream.android.app.downloader.DownloadTask r3 = (com.github.snowdream.android.app.downloader.DownloadTask) r3
                com.join.android.app.common.utils.APKUtils$Companion r4 = com.join.android.app.common.utils.APKUtils.f14829a
                boolean r5 = r4.v(r3)
                if (r5 != 0) goto L59
                boolean r4 = r4.z(r3)
                if (r4 == 0) goto L3f
            L59:
                r2 = r3
            L5a:
                if (r2 == 0) goto L12
                int r1 = r2.getStatus()
                r3 = 48
                if (r1 != r3) goto L65
                return
            L65:
                com.join.mgps.Util.UtilsMy.O0(r7, r2)
                goto L12
            L69:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.utils.APKUtils.Companion.o(android.content.Context):void");
        }

        @JvmStatic
        public final void p(@Nullable Context context, @Nullable DownloadTask downloadTask) {
            Intrinsics.checkNotNull(downloadTask);
            if (downloadTask.getTask_down_type() != 0 && downloadTask.getTask_down_type() != 2 && !z(downloadTask)) {
                if (downloadTask.getTask_down_type() == 1) {
                    downloadTask.setStatus(5);
                    p1.f.K().j0(downloadTask, downloadTask.getStatus());
                    O(context, downloadTask);
                    return;
                } else if (downloadTask.getTask_down_type() == 3) {
                    q(context, downloadTask, true);
                    return;
                } else {
                    return;
                }
            }
            q(context, downloadTask, false);
        }

        @JvmStatic
        public final void q(@Nullable Context context, @Nullable DownloadTask downloadTask, boolean z4) {
            if (downloadTask != null) {
                com.join.mgps.mod.utils.a.a().b(context, downloadTask, z4);
            }
        }

        @JvmStatic
        public final boolean r(@NotNull Context context, @NotNull String packageName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Object systemService = context.getSystemService(TTDownloadField.TT_ACTIVITY);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) systemService).getRunningTasks(150);
            if (runningTasks.size() <= 0) {
                return false;
            }
            for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                ComponentName componentName = runningTaskInfo.baseActivity;
                Intrinsics.checkNotNull(componentName);
                if (Intrinsics.areEqual(componentName.getPackageName(), packageName)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean t(@NotNull Context context, @NotNull String pkg) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(pkg, "pkg");
            try {
                context.getPackageManager().getPackageInfo(pkg, 1);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        @JvmStatic
        public final boolean u(@Nullable DownloadTask downloadTask) {
            return downloadTask != null && downloadTask.isMiniGame();
        }

        @JvmStatic
        public final boolean v(@Nullable DownloadTask downloadTask) {
            ModInfoBean modInfoBean;
            if (downloadTask == null || !g2.i(downloadTask.getMod_info()) || (modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(downloadTask.getMod_info(), ModInfoBean.class)) == null) {
                return false;
            }
            return Intrinsics.areEqual(downloadTask.getCrc_link_type_val(), modInfoBean.getMod_game_id());
        }

        @JvmStatic
        public final boolean w(@Nullable DownloadTask downloadTask) {
            return (downloadTask == null || downloadTask.getSp_tag_info() == null || downloadTask.getSp_tag_info().getNet_game_vm() == null || !Intrinsics.areEqual("157", downloadTask.getSp_tag_info().getNet_game_vm().getId()) || downloadTask.getInstall_type() == DEVICE_TYPE.REAL.value()) ? false : true;
        }

        @JvmStatic
        @Nullable
        public final String x(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
            Intrinsics.checkNotNullExpressionValue(installedPackages, "packageManager.getInstalledPackages(0)");
            int size = installedPackages.size();
            for (int i4 = 0; i4 < size; i4++) {
                String str = installedPackages.get(i4).packageName;
                if (StringsKt.equals(str, "com.tencent.qqlite", true)) {
                    return "com.tencent.qqlite";
                }
                if (StringsKt.equals(str, "com.tencent.mobileqq", true)) {
                    return "com.tencent.mobileqq";
                }
            }
            return null;
        }

        @JvmStatic
        public final boolean y(@Nullable DownloadTask downloadTask) {
            return (downloadTask == null || downloadTask.getSp_tag_info() == null || downloadTask.getSp_tag_info().getSingle_game_vm() == null || !Intrinsics.areEqual("163", downloadTask.getSp_tag_info().getSingle_game_vm().getId()) || downloadTask.getInstall_type() == DEVICE_TYPE.REAL.value()) ? false : true;
        }

        @JvmStatic
        public final boolean z(@Nullable DownloadTask downloadTask) {
            return w(downloadTask) || y(downloadTask) || (y(downloadTask) && u(downloadTask));
        }
    }

    /* compiled from: APKUtils.kt */
    /* loaded from: classes3.dex */
    public enum DEVICE_TYPE {
        ALL(0, "全类型"),
        REAL(1, "真机"),
        VM(2, "虚拟机");
        
        @NotNull
        private final String mDesc;
        private final int mType;

        DEVICE_TYPE(int i4, String str) {
            this.mType = i4;
            this.mDesc = str;
        }

        @NotNull
        public final String desc() {
            return this.mDesc;
        }

        public final int value() {
            return this.mType;
        }
    }

    /* compiled from: APKUtils.kt */
    /* loaded from: classes3.dex */
    public final class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        private String f14836a;

        /* renamed from: b  reason: collision with root package name */
        private int f14837b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        private String f14838c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        private String f14839d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        private Drawable f14840e;

        public a() {
        }

        @Nullable
        public final String a() {
            return this.f14838c;
        }

        @Nullable
        public final Drawable b() {
            return this.f14840e;
        }

        @Nullable
        public final String c() {
            return this.f14839d;
        }

        public final int d() {
            return this.f14837b;
        }

        @Nullable
        public final String e() {
            return this.f14836a;
        }

        public final void f(@Nullable String str) {
            this.f14838c = str;
        }

        public final void g(@Nullable Drawable drawable) {
            this.f14840e = drawable;
        }

        public final void h(@Nullable String str) {
            this.f14839d = str;
        }

        public final void i(int i4) {
            this.f14837b = i4;
        }

        public final void j(@Nullable String str) {
            this.f14836a = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(APKUtils this$0, Context context, File file) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PrefDef_ prefDef_ = new PrefDef_(context);
        DownloadTask E = p1.f.K().E(file.getAbsolutePath());
        if (E == null || (MApplication.f1497x.getActivity() instanceof ModGameIndexActivity)) {
            return;
        }
        prefDef_.lastInstallApp().g(E.getCrc_link_type_val());
    }

    @JvmStatic
    public static final void C(@Nullable Context context, @Nullable DownloadTask downloadTask) {
        f14829a.p(context, downloadTask);
    }

    @JvmStatic
    public static final void D(@Nullable Context context, @Nullable DownloadTask downloadTask, boolean z4) {
        f14829a.q(context, downloadTask, z4);
    }

    @JvmStatic
    public static final boolean E(@NotNull Context context, @NotNull String str) {
        return f14829a.r(context, str);
    }

    @JvmStatic
    public static final boolean F(@Nullable DownloadTask downloadTask) {
        return f14829a.u(downloadTask);
    }

    @JvmStatic
    public static final boolean G(@Nullable DownloadTask downloadTask) {
        return f14829a.v(downloadTask);
    }

    @JvmStatic
    public static final boolean H(@Nullable DownloadTask downloadTask) {
        return f14829a.w(downloadTask);
    }

    @JvmStatic
    @Nullable
    public static final String I(@NotNull Context context) {
        return f14829a.x(context);
    }

    @JvmStatic
    public static final boolean K(@Nullable DownloadTask downloadTask) {
        return f14829a.y(downloadTask);
    }

    @JvmStatic
    public static final boolean L(@Nullable DownloadTask downloadTask) {
        return f14829a.z(downloadTask);
    }

    @JvmStatic
    public static final boolean M(@Nullable Context context, @Nullable EMUApkTable eMUApkTable) {
        return f14829a.A(context, eMUApkTable);
    }

    public static /* synthetic */ void R(APKUtils aPKUtils, Context context, StartGameMeta startGameMeta, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: open");
        }
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        aPKUtils.O(context, startGameMeta, z4);
    }

    @JvmStatic
    public static final void S(@NotNull Context context, @NotNull ArchiveData archiveData, @NotNull String str, @NotNull String str2, @NotNull DownloadTask downloadTask) {
        f14829a.B(context, archiveData, str, str2, downloadTask);
    }

    @JvmStatic
    public static final void U(@NotNull Context context, @NotNull DownloadTask downloadTask) {
        f14829a.D(context, downloadTask);
    }

    @JvmStatic
    @JvmOverloads
    public static final void V(@Nullable Context context, @NotNull ModInfoBean modInfoBean) {
        f14829a.E(context, modInfoBean);
    }

    @JvmStatic
    @JvmOverloads
    public static final void W(@Nullable Context context, @NotNull ModInfoBean modInfoBean, @Nullable String str) {
        f14829a.F(context, modInfoBean, str);
    }

    @JvmStatic
    @JvmOverloads
    public static final void X(@Nullable Context context, @NotNull String str) {
        f14829a.G(context, str);
    }

    @JvmStatic
    @JvmOverloads
    public static final void Y(@Nullable Context context, @NotNull String str, @NotNull String str2) {
        f14829a.H(context, str, str2);
    }

    @JvmStatic
    @JvmOverloads
    public static final void Z(@Nullable Context context, @NotNull String str, @NotNull String str2, @Nullable String str3) {
        f14829a.I(context, str, str2, str3);
    }

    @JvmStatic
    public static final boolean a0(@NotNull Context context, @NotNull String str) {
        return f14829a.L(context, str);
    }

    @JvmStatic
    public static final boolean b(@Nullable Context context, @Nullable DownloadTask downloadTask) {
        return f14829a.e(context, downloadTask);
    }

    @JvmStatic
    public static final void b0(@NotNull Context context, @NotNull DownloadTask downloadTask) {
        f14829a.M(context, downloadTask);
    }

    @JvmStatic
    public static final boolean c(@Nullable Context context, @Nullable CommonGameInfoBean commonGameInfoBean) {
        return f14829a.f(context, commonGameInfoBean);
    }

    @JvmStatic
    private static final void d0(Context context, DownloadTask downloadTask) {
        f14829a.O(context, downloadTask);
    }

    @JvmStatic
    public static final boolean e0(@Nullable DownloadTask downloadTask, @NotNull String str) {
        return f14829a.S(downloadTask, str);
    }

    public static /* synthetic */ boolean f(APKUtils aPKUtils, Context context, String str, DEVICE_TYPE device_type, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 4) != 0) {
                device_type = DEVICE_TYPE.REAL;
            }
            return aPKUtils.e(context, str, device_type);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkInstall");
    }

    @JvmStatic
    public static final boolean g(@Nullable Context context, @NotNull Function0<Unit> function0) {
        return f14829a.g(context, function0);
    }

    @JvmStatic
    public static final boolean g0(@Nullable String str) {
        return f14829a.U(str);
    }

    private final void h0(Context context, StartGameMeta startGameMeta, boolean z4, Intent intent) {
        startGameMeta.setUserID(AccountUtil_.getInstance_(context).getUid());
        startGameMeta.setPa_package_name(context.getPackageName());
        startGameMeta.setTourist(AccountUtil_.getInstance_(context).isTourist());
        boolean z5 = false;
        w0.e("GameMeta:", JsonMapper.getInstance().toJson(startGameMeta));
        String str = MApplication.K;
        if ((str == null || str.length() == 0) ? true : true) {
            startGameMeta.setDnsJson(context.getSharedPreferences("Papa_Stat_SharedPreferences", 4).getString("DNSHttpUrl", ""));
        } else {
            startGameMeta.setDnsJson(MApplication.K);
        }
        if (intent != null) {
            intent.putExtra("jsonData", JsonMapper.getInstance().toJson(startGameMeta));
            if (z4 || startGameMeta.getTagId() != ConstantIntEnum.NDS.value()) {
                return;
            }
            intent.putExtra("GAMEPATH", startGameMeta.getRomPath() + ".nds");
        }
    }

    @JvmStatic
    public static final void i(@Nullable DownloadTask downloadTask) {
        f14829a.h(downloadTask);
    }

    static /* synthetic */ void i0(APKUtils aPKUtils, Context context, StartGameMeta startGameMeta, boolean z4, Intent intent, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: wrapGameMeta");
        }
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        if ((i4 & 8) != 0) {
            intent = null;
        }
        aPKUtils.h0(context, startGameMeta, z4, intent);
    }

    @JvmStatic
    @JvmOverloads
    public static final void j(@Nullable DownloadTask downloadTask) {
        f14829a.i(downloadTask);
    }

    @JvmStatic
    public static final void j0(@NotNull File file, @NotNull String str, @NotNull String str2, @NotNull Function1<? super String, Unit> function1) {
        f14829a.V(file, str, str2, function1);
    }

    @JvmStatic
    @JvmOverloads
    public static final void k(@Nullable DownloadTask downloadTask, long j4) {
        f14829a.j(downloadTask, j4);
    }

    @JvmStatic
    public static final void k0(@NotNull String str, @Nullable DownloadTask downloadTask, @NotNull Function1<? super String, Unit> function1) {
        f14829a.W(str, downloadTask, function1);
    }

    @JvmStatic
    @Nullable
    public static final String o(@NotNull Context context, @NotNull String str) {
        return f14829a.l(context, str);
    }

    private final Class<?>[] r(Class<?> cls, String str) {
        Class<?>[] clsArr = (Class[]) new ArrayList().toArray(new Class[0]);
        Method[] methods = cls.getMethods();
        int length = methods.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (Intrinsics.areEqual(methods[i4].getName(), str)) {
                clsArr = methods[i4].getParameterTypes();
                Intrinsics.checkNotNullExpressionValue(clsArr, "mtd[i].parameterTypes");
            }
        }
        return clsArr;
    }

    @JvmStatic
    public static final void t(@NotNull Context context, @NotNull DownloadTask downloadTask) {
        f14829a.n(context, downloadTask);
    }

    @JvmStatic
    public static final void u(@NotNull Context context) {
        f14829a.o(context);
    }

    public final void B(@Nullable File file) {
        try {
            Class<?> cls = Class.forName(InstrumentationProxy.f64868d);
            Intrinsics.checkNotNullExpressionValue(cls, "forName(\"android.app.ActivityThread\")");
            Class<?>[] r4 = r(cls, "getPackageManager");
            Method method = cls.getMethod("getPackageManager", (Class[]) Arrays.copyOf(r4, r4.length));
            Intrinsics.checkNotNullExpressionValue(method, "activityTherad.getMethod…ageManager\", *paramTypes)");
            Object invoke = method.invoke(cls, new Object[0]);
            Class<?> cls2 = invoke.getClass();
            Class<?>[] r5 = r(cls2, "installPackage");
            Method method2 = cls2.getMethod("installPackage", (Class[]) Arrays.copyOf(r5, r5.length));
            Intrinsics.checkNotNullExpressionValue(method2, "pmService.getMethod(\"ins…llPackage\", *paramTypes1)");
            method2.invoke(invoke, Uri.fromFile(file), null, 0, null);
        } catch (ClassNotFoundException e5) {
            e5.printStackTrace();
        } catch (IllegalAccessException e6) {
            e6.printStackTrace();
        } catch (IllegalArgumentException e7) {
            e7.printStackTrace();
        } catch (NoSuchMethodException e8) {
            e8.printStackTrace();
        } catch (InvocationTargetException e9) {
            e9.printStackTrace();
        }
    }

    public final boolean J(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return com.join.mgps.va.overmind.d.H(com.join.mgps.va.overmind.d.f54937g.d(), q1.f27991b, 0, 2, null);
    }

    @JvmOverloads
    public final void N(@NotNull Context context, @NotNull StartGameMeta startGameMeta) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(startGameMeta, "startGameMeta");
        R(this, context, startGameMeta, false, 4, null);
    }

    @JvmOverloads
    public void O(@NotNull Context context, @NotNull StartGameMeta startGameMeta, boolean z4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(startGameMeta, "startGameMeta");
        try {
            Class.forName(startGameMeta.getActivityName());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (z4) {
                intent.setFlags(8388608);
            } else {
                intent.setFlags(131072);
            }
            intent.setComponent(new ComponentName(startGameMeta.getPackageName(), startGameMeta.getActivityName()));
            h0(context, startGameMeta, z4, intent);
            ContextCompat.startActivity(context, intent, null);
            MApplication.f1497x.G(true);
        } catch (Exception e6) {
            e6.printStackTrace();
            if (startGameMeta.getTagId() == ConstantIntEnum.PS2.value()) {
                if ((e6 instanceof ClassNotFoundException) || (e6 instanceof ActivityNotFoundException)) {
                    UtilsMy.N3(context);
                }
            }
        }
    }

    public final void P(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNull(str);
            context.startActivity(packageManager.getLaunchIntentForPackage(str));
            MApplication.f1497x.G(true);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public final void Q(@NotNull Context context, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent();
        intent.addFlags(8388608);
        intent.setFlags(270532608);
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(str2);
        intent.setComponent(new ComponentName(str, str2));
        intent.setAction("android.intent.action.VIEW");
        context.startActivity(intent);
        MApplication.f1497x.G(true);
    }

    public final void T(@NotNull Context context, @NotNull StartGameMeta startGameMeta) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(startGameMeta, "startGameMeta");
        O(context, startGameMeta, true);
    }

    public final void c0(@Nullable byte[] bArr) {
        try {
            Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
            Intrinsics.checkNotNull(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) generateCertificate;
            String obj = x509Certificate.getPublicKey().toString();
            String bigInteger = x509Certificate.getSerialNumber().toString();
            Intrinsics.checkNotNullExpressionValue(bigInteger, "cert.serialNumber.toString()");
            System.out.println((Object) ("signName:" + x509Certificate.getSigAlgName()));
            System.out.println((Object) ("pubKey:" + obj));
            System.out.println((Object) ("signNumber:" + bigInteger));
            System.out.println((Object) ("subjectDN:" + x509Certificate.getSubjectDN()));
        } catch (CertificateException e5) {
            e5.printStackTrace();
        }
    }

    @JvmOverloads
    public final boolean d(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f(this, context, str, null, 4, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:35|(6:37|6|(6:24|25|26|27|11|(2:13|14)(2:16|(2:18|19)(1:(1:23)(1:22))))|10|11|(0)(0)))|5|6|(1:8)|24|25|26|27|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
        kotlin.jvm.internal.Intrinsics.checkNotNull(r7);
        r6 = r1.getPackageInfo(r7, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
        if (r6 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
        if (r6.activities.length > 0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    @kotlin.jvm.JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(@org.jetbrains.annotations.NotNull android.content.Context r6, @org.jetbrains.annotations.Nullable java.lang.String r7, @org.jetbrains.annotations.NotNull com.join.android.app.common.utils.APKUtils.DEVICE_TYPE r8) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r8.value()
            com.join.android.app.common.utils.APKUtils$DEVICE_TYPE r1 = com.join.android.app.common.utils.APKUtils.DEVICE_TYPE.VM
            int r1 = r1.value()
            r2 = 0
            if (r0 == r1) goto L24
            int r0 = r8.value()
            com.join.android.app.common.utils.APKUtils$DEVICE_TYPE r1 = com.join.android.app.common.utils.APKUtils.DEVICE_TYPE.ALL
            int r1 = r1.value()
            if (r0 != r1) goto L3e
        L24:
            com.join.mgps.va.overmind.d$a r0 = com.join.mgps.va.overmind.d.f54937g
            com.join.mgps.va.overmind.d r1 = r0.d()
            boolean r1 = r1.O()
            if (r1 == 0) goto L3e
            com.join.mgps.va.overmind.d r0 = r0.d()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            r1 = 2
            r3 = 0
            boolean r0 = com.join.mgps.va.overmind.d.H(r0, r7, r2, r1, r3)
            goto L3f
        L3e:
            r0 = 0
        L3f:
            int r1 = r8.value()
            com.join.android.app.common.utils.APKUtils$DEVICE_TYPE r3 = com.join.android.app.common.utils.APKUtils.DEVICE_TYPE.REAL
            int r3 = r3.value()
            r4 = 1
            if (r1 == r3) goto L58
            int r1 = r8.value()
            com.join.android.app.common.utils.APKUtils$DEVICE_TYPE r3 = com.join.android.app.common.utils.APKUtils.DEVICE_TYPE.ALL
            int r3 = r3.value()
            if (r1 != r3) goto L7f
        L58:
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L70
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L70
            r3 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo(r7, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L70
            java.lang.String r3 = "context.packageManager.g…ACKAGES\n                )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L70
        L6e:
            r6 = 1
            goto L80
        L70:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            android.content.pm.PackageInfo r6 = r1.getPackageInfo(r7, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            if (r6 == 0) goto L7f
            android.content.pm.ActivityInfo[] r6 = r6.activities     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            int r6 = r6.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            if (r6 <= 0) goto L7f
            goto L6e
        L7f:
            r6 = 0
        L80:
            int r7 = r8.value()
            com.join.android.app.common.utils.APKUtils$DEVICE_TYPE r1 = com.join.android.app.common.utils.APKUtils.DEVICE_TYPE.VM
            int r1 = r1.value()
            if (r7 != r1) goto L8e
            r2 = r0
            goto La1
        L8e:
            int r7 = r8.value()
            com.join.android.app.common.utils.APKUtils$DEVICE_TYPE r8 = com.join.android.app.common.utils.APKUtils.DEVICE_TYPE.REAL
            int r8 = r8.value()
            if (r7 != r8) goto L9c
            r2 = r6
            goto La1
        L9c:
            if (r6 != 0) goto La0
            if (r0 == 0) goto La1
        La0:
            r2 = 1
        La1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.utils.APKUtils.e(android.content.Context, java.lang.String, com.join.android.app.common.utils.APKUtils$DEVICE_TYPE):boolean");
    }

    public final void f0(@NotNull Context context, @NotNull String pak) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pak, "pak");
        context.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:" + pak)));
    }

    public final boolean h(@NotNull Context context, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            AssetManager assets = context.getAssets();
            Intrinsics.checkNotNull(str);
            InputStream open = assets.open(str);
            Intrinsics.checkNotNullExpressionValue(open, "context.assets.open(fileName!!)");
            File file = new File(str2);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    open.close();
                    return true;
                }
            }
        } catch (IOException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @NotNull
    public final a l(@NotNull Context ctx, @NotNull String pak) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(pak, "pak");
        return m(ctx, pak, DEVICE_TYPE.REAL);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.join.android.app.common.utils.APKUtils.a m(@org.jetbrains.annotations.NotNull android.content.Context r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull com.join.android.app.common.utils.APKUtils.DEVICE_TYPE r14) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.utils.APKUtils.m(android.content.Context, java.lang.String, com.join.android.app.common.utils.APKUtils$DEVICE_TYPE):com.join.android.app.common.utils.APKUtils$a");
    }

    @NotNull
    public final List<a> n(@NotNull Context ctx) {
        int i4;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        ArrayList arrayList = new ArrayList();
        try {
            PackageManager packageManager = ctx.getPackageManager();
            List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
            Intrinsics.checkNotNullExpressionValue(installedPackages, "packageManager.getInstalledPackages(0)");
            int size = installedPackages.size();
            for (int i5 = 0; i5 < size; i5++) {
                try {
                    PackageInfo packageInfo = installedPackages.get(i5);
                    try {
                        i4 = packageInfo.applicationInfo.flags;
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    if ((i4 & 1) == 0) {
                        if ((i4 & 128) != 0) {
                        }
                        a aVar = new a();
                        aVar.f(packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
                        aVar.h(packageInfo.packageName);
                        aVar.j(packageInfo.versionName);
                        aVar.i(packageInfo.versionCode);
                        aVar.g(null);
                        arrayList.add(aVar);
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        return arrayList;
    }

    @NotNull
    public final List<a> p(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        ArrayList arrayList = new ArrayList();
        try {
            PackageManager packageManager = ctx.getPackageManager();
            List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
            Intrinsics.checkNotNullExpressionValue(installedPackages, "packageManager.getInstalledPackages(0)");
            int size = installedPackages.size();
            for (int i4 = 0; i4 < size; i4++) {
                try {
                    PackageInfo packageInfo = installedPackages.get(i4);
                    try {
                        int i5 = packageInfo.applicationInfo.flags;
                        if ((i5 & 1) != 0 || (i5 & 128) != 0) {
                            a aVar = new a();
                            aVar.f(packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
                            aVar.h(packageInfo.packageName);
                            aVar.j(packageInfo.versionName);
                            aVar.i(packageInfo.versionCode);
                            aVar.g(null);
                            arrayList.add(aVar);
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        return arrayList;
    }

    @Nullable
    public final String q(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNull(str);
        PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(str, 1);
        if (packageArchiveInfo != null) {
            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
            packageManager.getApplicationLabel(applicationInfo).toString();
            String str2 = applicationInfo.packageName;
            StringBuilder sb = new StringBuilder();
            sb.append("包名是：");
            sb.append(str2);
            String str3 = packageArchiveInfo.versionName;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("版本信息：");
            sb2.append(str3);
            return str2;
        }
        return null;
    }

    @NotNull
    public final a s(@NotNull Context ctx, @NotNull File apkFile) {
        String str;
        String str2;
        Drawable drawable;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(apkFile, "apkFile");
        a aVar = new a();
        PackageManager packageManager = ctx.getPackageManager();
        PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(apkFile.getAbsolutePath(), 1);
        String str3 = null;
        if (packageArchiveInfo != null) {
            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
            String str4 = packageArchiveInfo.versionName;
            drawable = packageManager.getApplicationIcon(applicationInfo);
            CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
            Intrinsics.checkNotNull(applicationLabel, "null cannot be cast to non-null type kotlin.String");
            str = (String) applicationLabel;
            String str5 = applicationInfo.packageName;
            str3 = str4;
            str2 = str5;
        } else {
            str = null;
            str2 = null;
            drawable = null;
        }
        aVar.j(str3);
        aVar.f(str);
        aVar.h(str2);
        aVar.g(drawable);
        return aVar;
    }

    public final void v(@NotNull Context context, @Nullable Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        UtilsMy.O2(context, "android.permission.REQUEST_INSTALL_PACKAGES");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        if (Build.VERSION.SDK_INT >= 24) {
            intent.setFlags(1);
            intent.setDataAndType(uri, "application/vnd.android.package-archive");
        } else {
            intent.setDataAndType(uri, "application/vnd.android.package-archive");
        }
        try {
            context.startActivity(intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public final void w(@Nullable Context context, @Nullable File file) {
        if (context == null || file == null || !file.exists()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            y(context, file);
        } else if (!context.getPackageManager().canRequestPackageInstalls()) {
            UtilsMy.P2(context, "android.permission.REQUEST_INSTALL_PACKAGES", file.getAbsolutePath());
        } else {
            y(context, file);
        }
    }

    public final void x(@Nullable Context context, @Nullable String str) {
        String str2 = Build.BRAND;
        DownloadTask E = p1.f.K().E(str);
        if (E != null && (Intrinsics.areEqual(Dtype.MOD.name(), E.getFileType()) || f14829a.z(E))) {
            if (!(MApplication.f1497x.getActivity() instanceof ModGameIndexActivity)) {
                new PrefDef_(context).lastInstallApp().g(E.getCrc_link_type_val());
            }
            f14829a.p(context, E);
            return;
        }
        w(context, new File(str));
    }

    public final void y(@Nullable Context context, @Nullable File file) {
        z(context, file);
    }

    public final void z(@Nullable final Context context, @Nullable final File file) {
        Uri uriForFile;
        MApplication.f1497x.G(true);
        if (file == null || !file.exists()) {
            return;
        }
        v0.c(" permissxx   installApk4");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 24) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
            try {
                Intrinsics.checkNotNull(context);
                context.startActivity(intent);
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.addFlags(268435456);
        if (i4 >= 24) {
            intent2.setFlags(1);
            if (context != null) {
                uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
                Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(\n         …apkFile\n                )");
            } else {
                Intrinsics.checkNotNull(context);
                uriForFile = FileProvider.getUriForFile(context, "com.join.android.app.mgsim.wufun.fileprovider", file);
                Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(\n         …apkFile\n                )");
            }
            intent2.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        } else {
            intent2.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
        }
        try {
            if (context instanceof Service) {
                intent2.addFlags(268435456);
            }
            if (context instanceof Activity) {
                ((Activity) context).startActivityForResult(intent2, 1);
            } else {
                Intrinsics.checkNotNull(context);
                context.startActivity(intent2);
            }
            new Handler().postDelayed(new Runnable() { // from class: com.join.android.app.common.utils.a
                @Override // java.lang.Runnable
                public final void run() {
                    APKUtils.A(APKUtils.this, context, file);
                }
            }, 500L);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }
}
