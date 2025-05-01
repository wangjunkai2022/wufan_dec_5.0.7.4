package com.join.android.app.common.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.join.android.app.common.db.tables.Account;
import com.join.android.app.common.db.tables.Chapter;
import com.join.android.app.common.db.tables.Course;
import com.join.android.app.common.db.tables.Live;
import com.join.android.app.common.db.tables.LocalCourse;
import com.join.android.app.common.db.tables.Notice;
import com.join.android.app.common.db.tables.Order;
import com.join.android.app.common.db.tables.Reference;
import com.join.android.app.common.db.tables.ResourceShare;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.db.tables.AppBeanMainTable;
import com.join.mgps.db.tables.AppBeanTable;
import com.join.mgps.db.tables.AppMoreBeanTable;
import com.join.mgps.db.tables.AppTimeDataTable;
import com.join.mgps.db.tables.BannerAndTablesTable;
import com.join.mgps.db.tables.CacheTable;
import com.join.mgps.db.tables.CategoryRecordTable;
import com.join.mgps.db.tables.CloudArchiveTable;
import com.join.mgps.db.tables.CloudBackupsDataTable;
import com.join.mgps.db.tables.CloudDownRecoderTable;
import com.join.mgps.db.tables.DownloadFileTable;
import com.join.mgps.db.tables.DownloadHistoryTable;
import com.join.mgps.db.tables.DownloadUrlTable;
import com.join.mgps.db.tables.DownlodTaskCopyTable;
import com.join.mgps.db.tables.EMUApkArenaTable;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.db.tables.EMUUpdateTable;
import com.join.mgps.db.tables.FightMainTable;
import com.join.mgps.db.tables.ForumSearchRecordTable;
import com.join.mgps.db.tables.ForumTable;
import com.join.mgps.db.tables.GameMainTable;
import com.join.mgps.db.tables.GamePaiWeiUpTaskTable;
import com.join.mgps.db.tables.H5GameAccountDataTable;
import com.join.mgps.db.tables.HandShankTable;
import com.join.mgps.db.tables.HeadPortraitTable;
import com.join.mgps.db.tables.InformatonPointTable;
import com.join.mgps.db.tables.JPushRecordTable;
import com.join.mgps.db.tables.JoystickTable;
import com.join.mgps.db.tables.LatestGameFileTable;
import com.join.mgps.db.tables.ModleBeanTable;
import com.join.mgps.db.tables.PAPARecentlyTable;
import com.join.mgps.db.tables.PlayGameTimeTable;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.db.tables.RecomDatabeanTable;
import com.join.mgps.db.tables.RewardBananaTable;
import com.join.mgps.db.tables.SearchRecordTable;
import com.join.mgps.db.tables.ShowViewDataBeanTable;
import com.join.mgps.db.tables.StatisticTable;
import com.join.mgps.db.tables.TipBeanTable;
import com.join.mgps.db.tables.TokenTable;
import com.join.mgps.db.tables.UserPurchaseInfo;
import com.join.mgps.db.tables.VideoWatchLogTable;
import com.join.mgps.db.tables.WarMatchAndLocalTable;
import java.sql.SQLException;
/* loaded from: classes.dex */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {
    private static String B1 = "helloAndroid.db";
    private static final int C1 = 53;
    private RuntimeExceptionDao<ModleBeanTable, Integer> A;
    private RuntimeExceptionDao<VideoWatchLogTable, Integer> A1;
    private RuntimeExceptionDao<AppBeanMainTable, Integer> B;
    private RuntimeExceptionDao<AppBeanTable, Integer> C;
    private RuntimeExceptionDao<PurchasedListTable, Integer> D;
    private RuntimeExceptionDao<JPushRecordTable, Integer> E;
    private RuntimeExceptionDao<CacheTable, Integer> F;
    private RuntimeExceptionDao<TokenTable, Integer> G;
    private RuntimeExceptionDao<HandShankTable, Integer> H;
    private RuntimeExceptionDao<ShowViewDataBeanTable, Integer> I;
    private RuntimeExceptionDao<JoystickTable, Integer> J;
    private RuntimeExceptionDao<PAPARecentlyTable, Integer> K;
    private RuntimeExceptionDao<ForumTable, Integer> L;
    private RuntimeExceptionDao<InformatonPointTable, Integer> M;
    private RuntimeExceptionDao<WarMatchAndLocalTable, Integer> N;
    private RuntimeExceptionDao<AppMoreBeanTable, Integer> O;
    private RuntimeExceptionDao<DownloadUrlTable, Integer> P;
    private RuntimeExceptionDao<CloudBackupsDataTable, Integer> Q;
    private RuntimeExceptionDao<CategoryRecordTable, Integer> R;
    private RuntimeExceptionDao<FightMainTable, Integer> S;
    private RuntimeExceptionDao<UserPurchaseInfo, Integer> T;
    private RuntimeExceptionDao<HeadPortraitTable, Integer> U;
    private RuntimeExceptionDao<DownloadHistoryTable, Integer> V;
    private RuntimeExceptionDao<ForumSearchRecordTable, Integer> W;
    private RuntimeExceptionDao<GameMainTable, Integer> X;
    private RuntimeExceptionDao<H5GameAccountDataTable, Integer> Y;
    private RuntimeExceptionDao<CloudDownRecoderTable, Integer> Z;

    /* renamed from: b  reason: collision with root package name */
    String f14498b;

    /* renamed from: c  reason: collision with root package name */
    private Context f14499c;

    /* renamed from: d  reason: collision with root package name */
    private RuntimeExceptionDao<Order, Integer> f14500d;

    /* renamed from: e  reason: collision with root package name */
    private RuntimeExceptionDao<Account, Integer> f14501e;

    /* renamed from: f  reason: collision with root package name */
    private RuntimeExceptionDao<Course, Integer> f14502f;

    /* renamed from: g  reason: collision with root package name */
    private RuntimeExceptionDao<Live, Integer> f14503g;

    /* renamed from: h  reason: collision with root package name */
    private RuntimeExceptionDao<Notice, Integer> f14504h;

    /* renamed from: i  reason: collision with root package name */
    private RuntimeExceptionDao<ResourceShare, Integer> f14505i;

    /* renamed from: j  reason: collision with root package name */
    private RuntimeExceptionDao<LocalCourse, Integer> f14506j;

    /* renamed from: k  reason: collision with root package name */
    private RuntimeExceptionDao<Chapter, Integer> f14507k;

    /* renamed from: l  reason: collision with root package name */
    private RuntimeExceptionDao<Reference, Integer> f14508l;

    /* renamed from: m  reason: collision with root package name */
    private RuntimeExceptionDao<TipBeanTable, Integer> f14509m;

    /* renamed from: n  reason: collision with root package name */
    private RuntimeExceptionDao<BannerAndTablesTable, Integer> f14510n;

    /* renamed from: o  reason: collision with root package name */
    private RuntimeExceptionDao<EMUApkTable, Integer> f14511o;

    /* renamed from: p  reason: collision with root package name */
    private RuntimeExceptionDao<EMUApkArenaTable, Integer> f14512p;

    /* renamed from: p0  reason: collision with root package name */
    private RuntimeExceptionDao<PlayGameTimeTable, Integer> f14513p0;

    /* renamed from: p1  reason: collision with root package name */
    private RuntimeExceptionDao<RewardBananaTable, Integer> f14514p1;

    /* renamed from: q  reason: collision with root package name */
    private RuntimeExceptionDao<GamePaiWeiUpTaskTable, Integer> f14515q;

    /* renamed from: r  reason: collision with root package name */
    private RuntimeExceptionDao<AppTimeDataTable, Integer> f14516r;

    /* renamed from: s  reason: collision with root package name */
    private RuntimeExceptionDao<StatisticTable, Integer> f14517s;

    /* renamed from: t  reason: collision with root package name */
    private RuntimeExceptionDao<SearchRecordTable, Integer> f14518t;

    /* renamed from: u  reason: collision with root package name */
    private RuntimeExceptionDao<DownloadFileTable, Integer> f14519u;

    /* renamed from: v  reason: collision with root package name */
    private RuntimeExceptionDao<EMUUpdateTable, Integer> f14520v;

    /* renamed from: v1  reason: collision with root package name */
    private RuntimeExceptionDao<CloudArchiveTable, Integer> f14521v1;

    /* renamed from: w  reason: collision with root package name */
    private RuntimeExceptionDao<LatestGameFileTable, Integer> f14522w;

    /* renamed from: x  reason: collision with root package name */
    private RuntimeExceptionDao<DownloadTask, Integer> f14523x;

    /* renamed from: y  reason: collision with root package name */
    private RuntimeExceptionDao<DownlodTaskCopyTable, Integer> f14524y;

    /* renamed from: z  reason: collision with root package name */
    private RuntimeExceptionDao<RecomDatabeanTable, Integer> f14525z;

    public DatabaseHelper(Context context) {
        super(context, B1, (SQLiteDatabase.CursorFactory) null, 53, (int) R.raw.ormlite_config);
        this.f14498b = getClass().getSimpleName();
        this.f14500d = null;
        this.f14501e = null;
        this.f14502f = null;
        this.f14503g = null;
        this.f14504h = null;
        this.f14505i = null;
        this.f14506j = null;
        this.f14507k = null;
        this.f14508l = null;
        this.f14509m = null;
        this.f14510n = null;
        this.f14511o = null;
        this.f14512p = null;
        this.f14515q = null;
        this.f14516r = null;
        this.f14517s = null;
        this.f14518t = null;
        this.f14519u = null;
        this.f14520v = null;
        this.f14522w = null;
        this.f14523x = null;
        this.f14524y = null;
        this.f14525z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.f14513p0 = null;
        this.f14514p1 = null;
        this.f14521v1 = null;
        this.A1 = null;
        this.f14499c = context;
    }

    public static String a() {
        return B1;
    }

    private boolean x0(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        String str3 = null;
        Cursor rawQuery = sQLiteDatabase.rawQuery(String.format("select sql from sqlite_master where type = 'table' and name = '%s'", str), null);
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToFirst()) {
                    str3 = rawQuery.getString(rawQuery.getColumnIndex("sql"));
                }
            } finally {
                rawQuery.close();
            }
        }
        if (rawQuery != null) {
        }
        return str3 != null && str3.contains(str2);
    }

    public static void y0(String str) {
        B1 = str;
    }

    public RuntimeExceptionDao<DownloadHistoryTable, Integer> A() {
        if (this.V == null) {
            this.V = getRuntimeExceptionDao(DownloadHistoryTable.class);
        }
        return this.V;
    }

    public RuntimeExceptionDao<DownloadUrlTable, Integer> B() {
        if (this.P == null) {
            this.P = getRuntimeExceptionDao(DownloadUrlTable.class);
        }
        return this.P;
    }

    public RuntimeExceptionDao<DownlodTaskCopyTable, Integer> C() {
        if (this.f14524y == null) {
            this.f14524y = getRuntimeExceptionDao(DownlodTaskCopyTable.class);
        }
        return this.f14524y;
    }

    public RuntimeExceptionDao<EMUUpdateTable, Integer> D() {
        if (this.f14520v == null) {
            try {
                this.f14520v = getRuntimeExceptionDao(EMUUpdateTable.class);
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
        return this.f14520v;
    }

    public RuntimeExceptionDao<EMUApkArenaTable, Integer> E() {
        if (this.f14512p == null) {
            try {
                this.f14512p = getRuntimeExceptionDao(EMUApkArenaTable.class);
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
        return this.f14512p;
    }

    public RuntimeExceptionDao<EMUApkTable, Integer> J() {
        if (this.f14511o == null) {
            try {
                this.f14511o = getRuntimeExceptionDao(EMUApkTable.class);
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
        return this.f14511o;
    }

    public RuntimeExceptionDao<FightMainTable, Integer> K() {
        if (this.S == null) {
            this.S = getRuntimeExceptionDao(FightMainTable.class);
        }
        return this.S;
    }

    public RuntimeExceptionDao<ForumSearchRecordTable, Integer> N() {
        if (this.W == null) {
            this.W = getRuntimeExceptionDao(ForumSearchRecordTable.class);
        }
        return this.W;
    }

    public RuntimeExceptionDao<ForumTable, Integer> P() {
        if (this.L == null) {
            this.L = getRuntimeExceptionDao(ForumTable.class);
        }
        return this.L;
    }

    public RuntimeExceptionDao<GameMainTable, Integer> S() {
        if (this.X == null) {
            this.X = getRuntimeExceptionDao(GameMainTable.class);
        }
        return this.X;
    }

    public RuntimeExceptionDao<GamePaiWeiUpTaskTable, Integer> T() {
        if (this.f14515q == null) {
            try {
                this.f14515q = getRuntimeExceptionDao(GamePaiWeiUpTaskTable.class);
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
        return this.f14515q;
    }

    public RuntimeExceptionDao<HandShankTable, Integer> V() {
        if (this.H == null) {
            this.H = getRuntimeExceptionDao(HandShankTable.class);
        }
        return this.H;
    }

    public RuntimeExceptionDao<HeadPortraitTable, Integer> W() {
        if (this.U == null) {
            this.U = getRuntimeExceptionDao(HeadPortraitTable.class);
        }
        return this.U;
    }

    public RuntimeExceptionDao<InformatonPointTable, Integer> X() {
        if (this.M == null) {
            this.M = getRuntimeExceptionDao(InformatonPointTable.class);
        }
        return this.M;
    }

    public RuntimeExceptionDao<JPushRecordTable, Integer> Y() {
        if (this.E == null) {
            this.E = getRuntimeExceptionDao(JPushRecordTable.class);
        }
        return this.E;
    }

    public RuntimeExceptionDao<JoystickTable, Integer> Z() {
        if (this.J == null) {
            this.J = getRuntimeExceptionDao(JoystickTable.class);
        }
        return this.J;
    }

    public RuntimeExceptionDao<LatestGameFileTable, Integer> a0() {
        if (this.f14522w == null) {
            this.f14522w = getRuntimeExceptionDao(LatestGameFileTable.class);
        }
        return this.f14522w;
    }

    public RuntimeExceptionDao<Account, Integer> b() {
        if (this.f14501e == null) {
            this.f14501e = getRuntimeExceptionDao(Account.class);
        }
        return this.f14501e;
    }

    public RuntimeExceptionDao<Live, Integer> b0() {
        if (this.f14503g == null) {
            this.f14503g = getRuntimeExceptionDao(Live.class);
        }
        return this.f14503g;
    }

    public RuntimeExceptionDao<LocalCourse, Integer> c0() {
        if (this.f14506j == null) {
            this.f14506j = getRuntimeExceptionDao(LocalCourse.class);
        }
        return this.f14506j;
    }

    @Override // com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper, android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.T = null;
        this.f14500d = null;
        this.f14501e = null;
        this.f14502f = null;
        this.f14503g = null;
        this.f14504h = null;
        this.f14505i = null;
        this.f14506j = null;
        this.f14507k = null;
        this.f14508l = null;
        this.f14509m = null;
        this.f14510n = null;
        this.f14511o = null;
        this.f14512p = null;
        this.f14517s = null;
        this.f14518t = null;
        this.E = null;
        this.f14523x = null;
        this.f14524y = null;
        this.f14525z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.U = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.f14515q = null;
        this.f14513p0 = null;
        this.f14514p1 = null;
        this.D = null;
        this.Z = null;
        this.f14516r = null;
        this.f14521v1 = null;
    }

    public RuntimeExceptionDao<AppBeanMainTable, Integer> d() {
        if (this.B == null) {
            this.B = getRuntimeExceptionDao(AppBeanMainTable.class);
        }
        return this.B;
    }

    public RuntimeExceptionDao<ModleBeanTable, Integer> d0() {
        if (this.A == null) {
            this.A = getRuntimeExceptionDao(ModleBeanTable.class);
        }
        return this.A;
    }

    public RuntimeExceptionDao<Notice, Integer> e0() {
        if (this.f14504h == null) {
            this.f14504h = getRuntimeExceptionDao(Notice.class);
        }
        return this.f14504h;
    }

    public RuntimeExceptionDao<Order, Integer> f0() {
        if (this.f14500d == null) {
            this.f14500d = getRuntimeExceptionDao(Order.class);
        }
        return this.f14500d;
    }

    public RuntimeExceptionDao<AppBeanTable, Integer> g() {
        if (this.C == null) {
            this.C = getRuntimeExceptionDao(AppBeanTable.class);
        }
        return this.C;
    }

    public RuntimeExceptionDao<PAPARecentlyTable, Integer> g0() {
        if (this.K == null) {
            this.K = getRuntimeExceptionDao(PAPARecentlyTable.class);
        }
        return this.K;
    }

    public RuntimeExceptionDao<AppMoreBeanTable, Integer> h() {
        if (this.O == null) {
            this.O = getRuntimeExceptionDao(AppMoreBeanTable.class);
        }
        return this.O;
    }

    public RuntimeExceptionDao<PlayGameTimeTable, Integer> h0() {
        if (this.f14513p0 == null) {
            try {
                this.f14513p0 = getRuntimeExceptionDao(PlayGameTimeTable.class);
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
        return this.f14513p0;
    }

    public RuntimeExceptionDao<PurchasedListTable, Integer> i0() {
        if (this.D == null) {
            this.D = getRuntimeExceptionDao(PurchasedListTable.class);
        }
        return this.D;
    }

    public RuntimeExceptionDao<AppTimeDataTable, Integer> j() {
        if (this.f14516r == null) {
            try {
                this.f14516r = getRuntimeExceptionDao(AppTimeDataTable.class);
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
        return this.f14516r;
    }

    public RuntimeExceptionDao<RecomDatabeanTable, Integer> j0() {
        if (this.f14525z == null) {
            this.f14525z = getRuntimeExceptionDao(RecomDatabeanTable.class);
        }
        return this.f14525z;
    }

    public RuntimeExceptionDao<BannerAndTablesTable, Integer> k() {
        if (this.f14510n == null) {
            this.f14510n = getRuntimeExceptionDao(BannerAndTablesTable.class);
        }
        return this.f14510n;
    }

    public RuntimeExceptionDao<Reference, Integer> k0() {
        if (this.f14508l == null) {
            this.f14508l = getRuntimeExceptionDao(Reference.class);
        }
        return this.f14508l;
    }

    public RuntimeExceptionDao<CacheTable, Integer> l() {
        if (this.F == null) {
            this.F = getRuntimeExceptionDao(CacheTable.class);
        }
        return this.F;
    }

    public RuntimeExceptionDao<ResourceShare, Integer> l0() {
        if (this.f14505i == null) {
            this.f14505i = getRuntimeExceptionDao(ResourceShare.class);
        }
        return this.f14505i;
    }

    public RuntimeExceptionDao<RewardBananaTable, Integer> m0() {
        if (this.f14514p1 == null) {
            try {
                this.f14514p1 = getRuntimeExceptionDao(RewardBananaTable.class);
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
        return this.f14514p1;
    }

    public RuntimeExceptionDao<SearchRecordTable, Integer> n0() {
        if (this.f14518t == null) {
            this.f14518t = getRuntimeExceptionDao(SearchRecordTable.class);
        }
        return this.f14518t;
    }

    public RuntimeExceptionDao<ShowViewDataBeanTable, Integer> o0() {
        if (this.I == null) {
            this.I = getRuntimeExceptionDao(ShowViewDataBeanTable.class);
        }
        return this.I;
    }

    @Override // com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Order.class);
            TableUtils.createTable(connectionSource, Account.class);
            TableUtils.createTable(connectionSource, Course.class);
            TableUtils.createTable(connectionSource, Live.class);
            TableUtils.createTable(connectionSource, Notice.class);
            TableUtils.createTable(connectionSource, ResourceShare.class);
            TableUtils.createTable(connectionSource, LocalCourse.class);
            TableUtils.createTable(connectionSource, Chapter.class);
            TableUtils.createTable(connectionSource, Reference.class);
            TableUtils.createTable(connectionSource, TipBeanTable.class);
            TableUtils.createTable(connectionSource, BannerAndTablesTable.class);
            TableUtils.createTable(connectionSource, EMUApkTable.class);
            TableUtils.createTable(connectionSource, StatisticTable.class);
            TableUtils.createTable(connectionSource, SearchRecordTable.class);
            TableUtils.createTable(connectionSource, DownloadFileTable.class);
            TableUtils.createTable(connectionSource, EMUUpdateTable.class);
            TableUtils.createTable(connectionSource, LatestGameFileTable.class);
            TableUtils.createTable(connectionSource, DownloadTask.class);
            TableUtils.createTable(connectionSource, DownlodTaskCopyTable.class);
            TableUtils.createTable(connectionSource, RecomDatabeanTable.class);
            TableUtils.createTable(connectionSource, ModleBeanTable.class);
            TableUtils.createTable(connectionSource, AppBeanMainTable.class);
            TableUtils.createTable(connectionSource, AppBeanTable.class);
            TableUtils.createTable(connectionSource, JPushRecordTable.class);
            TableUtils.createTable(connectionSource, CacheTable.class);
            TableUtils.createTable(connectionSource, TokenTable.class);
            TableUtils.createTable(connectionSource, HandShankTable.class);
            TableUtils.createTable(connectionSource, ShowViewDataBeanTable.class);
            TableUtils.createTable(connectionSource, JoystickTable.class);
            TableUtils.createTable(connectionSource, PAPARecentlyTable.class);
            TableUtils.createTable(connectionSource, ForumTable.class);
            TableUtils.createTable(connectionSource, InformatonPointTable.class);
            TableUtils.createTable(connectionSource, WarMatchAndLocalTable.class);
            TableUtils.createTable(connectionSource, AppMoreBeanTable.class);
            TableUtils.createTable(connectionSource, DownloadUrlTable.class);
            TableUtils.createTable(connectionSource, CloudBackupsDataTable.class);
            TableUtils.createTable(connectionSource, CategoryRecordTable.class);
            TableUtils.createTable(connectionSource, FightMainTable.class);
            TableUtils.createTable(connectionSource, UserPurchaseInfo.class);
            TableUtils.createTable(connectionSource, HeadPortraitTable.class);
            TableUtils.createTable(connectionSource, DownloadHistoryTable.class);
            TableUtils.createTable(connectionSource, ForumSearchRecordTable.class);
            TableUtils.createTable(connectionSource, GameMainTable.class);
            TableUtils.createTable(connectionSource, H5GameAccountDataTable.class);
            TableUtils.createTable(connectionSource, EMUApkArenaTable.class);
            TableUtils.createTable(connectionSource, GamePaiWeiUpTaskTable.class);
            TableUtils.createTable(connectionSource, PurchasedListTable.class);
            TableUtils.createTable(connectionSource, CloudDownRecoderTable.class);
            TableUtils.createTable(connectionSource, PlayGameTimeTable.class);
            TableUtils.createTable(connectionSource, AppTimeDataTable.class);
            TableUtils.createTable(connectionSource, RewardBananaTable.class);
            TableUtils.createTable(connectionSource, CloudArchiveTable.class);
            TableUtils.createTable(connectionSource, VideoWatchLogTable.class);
        } catch (SQLException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        super.onDowngrade(sQLiteDatabase, i4, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x03a9, code lost:
        if (r26 <= 18) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0330 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0346 A[Catch: SQLException -> 0x0a94, TryCatch #54 {SQLException -> 0x0a94, blocks: (B:3:0x001c, B:18:0x0098, B:23:0x00a1, B:28:0x00ac, B:34:0x00b7, B:35:0x00cb, B:37:0x00d1, B:49:0x0101, B:51:0x010c, B:65:0x0125, B:69:0x0130, B:72:0x0146, B:89:0x029e, B:107:0x02c3, B:111:0x02d9, B:129:0x02f9, B:131:0x0316, B:145:0x0332, B:150:0x0346, B:156:0x0357, B:159:0x0377, B:163:0x0384, B:165:0x0398, B:178:0x03af, B:180:0x03cc, B:193:0x03e4, B:195:0x03f8, B:206:0x040c, B:225:0x046c, B:228:0x047f, B:234:0x04a2, B:233:0x0494, B:237:0x04b5, B:243:0x04d8, B:242:0x04ca, B:246:0x04eb, B:248:0x04ff, B:261:0x0517, B:263:0x052b, B:276:0x0543, B:278:0x0557, B:290:0x056c, B:297:0x058e, B:309:0x05a3, B:327:0x0614, B:341:0x0652, B:354:0x066a, B:357:0x0675, B:383:0x06ca, B:403:0x0702, B:417:0x072e, B:431:0x0748, B:452:0x07ad, B:466:0x07eb, B:480:0x0829, B:502:0x0881, B:524:0x08d0, B:538:0x08fc, B:555:0x092e, B:566:0x0942, B:568:0x0a35, B:570:0x0a3b, B:571:0x0a3f, B:573:0x0a45, B:575:0x0a55, B:577:0x0a5b, B:578:0x0a5f, B:580:0x0a65, B:581:0x0a73, B:519:0x08a1, B:497:0x0849, B:447:0x076c, B:439:0x075b, B:322:0x05ca, B:210:0x0421, B:212:0x042b, B:214:0x044c, B:224:0x045d, B:13:0x008f, B:443:0x0764, B:286:0x0564, B:479:0x0803, B:486:0x0832, B:262:0x051a, B:269:0x0534, B:451:0x0775, B:458:0x07b6, B:554:0x091a, B:561:0x0937, B:416:0x071a, B:423:0x0737, B:96:0x02aa, B:435:0x0753, B:6:0x005a, B:7:0x006b, B:9:0x0071, B:14:0x0092, B:361:0x0680, B:362:0x0689, B:367:0x0697, B:371:0x06a4, B:372:0x06a7, B:376:0x06b4, B:377:0x06b7, B:381:0x06c4, B:382:0x06c7, B:366:0x0694, B:389:0x06d3, B:229:0x048c, B:213:0x043b, B:220:0x0455, B:179:0x03b2, B:186:0x03d5, B:523:0x08aa, B:530:0x08d9, B:340:0x062c, B:347:0x065b, B:277:0x0546, B:284:0x0560, B:108:0x02c6, B:110:0x02d1, B:120:0x02e6, B:24:0x00a4, B:465:0x07c5, B:472:0x07f4, B:515:0x0899, B:19:0x009b, B:194:0x03e7, B:201:0x0401, B:305:0x059b, B:537:0x08e8, B:544:0x0905, B:247:0x04ee, B:254:0x0508, B:501:0x0852, B:508:0x088a, B:402:0x06ee, B:409:0x070b, B:50:0x0104, B:296:0x057a, B:303:0x0597, B:326:0x05de, B:333:0x061d, B:318:0x05c2, B:238:0x04c2, B:493:0x0841, B:130:0x02fc, B:137:0x031f, B:164:0x0387, B:171:0x03a1), top: B:659:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0351 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0377 A[Catch: SQLException -> 0x0a94, TryCatch #54 {SQLException -> 0x0a94, blocks: (B:3:0x001c, B:18:0x0098, B:23:0x00a1, B:28:0x00ac, B:34:0x00b7, B:35:0x00cb, B:37:0x00d1, B:49:0x0101, B:51:0x010c, B:65:0x0125, B:69:0x0130, B:72:0x0146, B:89:0x029e, B:107:0x02c3, B:111:0x02d9, B:129:0x02f9, B:131:0x0316, B:145:0x0332, B:150:0x0346, B:156:0x0357, B:159:0x0377, B:163:0x0384, B:165:0x0398, B:178:0x03af, B:180:0x03cc, B:193:0x03e4, B:195:0x03f8, B:206:0x040c, B:225:0x046c, B:228:0x047f, B:234:0x04a2, B:233:0x0494, B:237:0x04b5, B:243:0x04d8, B:242:0x04ca, B:246:0x04eb, B:248:0x04ff, B:261:0x0517, B:263:0x052b, B:276:0x0543, B:278:0x0557, B:290:0x056c, B:297:0x058e, B:309:0x05a3, B:327:0x0614, B:341:0x0652, B:354:0x066a, B:357:0x0675, B:383:0x06ca, B:403:0x0702, B:417:0x072e, B:431:0x0748, B:452:0x07ad, B:466:0x07eb, B:480:0x0829, B:502:0x0881, B:524:0x08d0, B:538:0x08fc, B:555:0x092e, B:566:0x0942, B:568:0x0a35, B:570:0x0a3b, B:571:0x0a3f, B:573:0x0a45, B:575:0x0a55, B:577:0x0a5b, B:578:0x0a5f, B:580:0x0a65, B:581:0x0a73, B:519:0x08a1, B:497:0x0849, B:447:0x076c, B:439:0x075b, B:322:0x05ca, B:210:0x0421, B:212:0x042b, B:214:0x044c, B:224:0x045d, B:13:0x008f, B:443:0x0764, B:286:0x0564, B:479:0x0803, B:486:0x0832, B:262:0x051a, B:269:0x0534, B:451:0x0775, B:458:0x07b6, B:554:0x091a, B:561:0x0937, B:416:0x071a, B:423:0x0737, B:96:0x02aa, B:435:0x0753, B:6:0x005a, B:7:0x006b, B:9:0x0071, B:14:0x0092, B:361:0x0680, B:362:0x0689, B:367:0x0697, B:371:0x06a4, B:372:0x06a7, B:376:0x06b4, B:377:0x06b7, B:381:0x06c4, B:382:0x06c7, B:366:0x0694, B:389:0x06d3, B:229:0x048c, B:213:0x043b, B:220:0x0455, B:179:0x03b2, B:186:0x03d5, B:523:0x08aa, B:530:0x08d9, B:340:0x062c, B:347:0x065b, B:277:0x0546, B:284:0x0560, B:108:0x02c6, B:110:0x02d1, B:120:0x02e6, B:24:0x00a4, B:465:0x07c5, B:472:0x07f4, B:515:0x0899, B:19:0x009b, B:194:0x03e7, B:201:0x0401, B:305:0x059b, B:537:0x08e8, B:544:0x0905, B:247:0x04ee, B:254:0x0508, B:501:0x0852, B:508:0x088a, B:402:0x06ee, B:409:0x070b, B:50:0x0104, B:296:0x057a, B:303:0x0597, B:326:0x05de, B:333:0x061d, B:318:0x05c2, B:238:0x04c2, B:493:0x0841, B:130:0x02fc, B:137:0x031f, B:164:0x0387, B:171:0x03a1), top: B:659:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03a9  */
    @Override // com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r24, com.j256.ormlite.support.ConnectionSource r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 2720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.db.DatabaseHelper.onUpgrade(android.database.sqlite.SQLiteDatabase, com.j256.ormlite.support.ConnectionSource, int, int):void");
    }

    public RuntimeExceptionDao<CategoryRecordTable, Integer> p() {
        if (this.R == null) {
            this.R = getRuntimeExceptionDao(CategoryRecordTable.class);
        }
        return this.R;
    }

    public RuntimeExceptionDao<StatisticTable, Integer> p0() {
        if (this.f14517s == null) {
            this.f14517s = getRuntimeExceptionDao(StatisticTable.class);
        }
        return this.f14517s;
    }

    public RuntimeExceptionDao<DownloadTask, Integer> q0() {
        if (this.f14523x == null) {
            this.f14523x = getRuntimeExceptionDao(DownloadTask.class);
        }
        return this.f14523x;
    }

    public RuntimeExceptionDao<Chapter, Integer> r() {
        if (this.f14507k == null) {
            this.f14507k = getRuntimeExceptionDao(Chapter.class);
        }
        return this.f14507k;
    }

    public RuntimeExceptionDao<TipBeanTable, Integer> r0() {
        if (this.f14509m == null) {
            this.f14509m = getRuntimeExceptionDao(TipBeanTable.class);
        }
        return this.f14509m;
    }

    public RuntimeExceptionDao<TokenTable, Integer> s0() {
        if (this.G == null) {
            this.G = getRuntimeExceptionDao(TokenTable.class);
        }
        return this.G;
    }

    public RuntimeExceptionDao<CloudArchiveTable, Integer> t() {
        if (this.f14521v1 == null) {
            this.f14521v1 = getRuntimeExceptionDao(CloudArchiveTable.class);
        }
        return this.f14521v1;
    }

    public RuntimeExceptionDao<UserPurchaseInfo, Integer> t0() {
        if (this.T == null) {
            this.T = getRuntimeExceptionDao(UserPurchaseInfo.class);
        }
        return this.T;
    }

    public RuntimeExceptionDao<CloudBackupsDataTable, Integer> u() {
        if (this.Q == null) {
            this.Q = getRuntimeExceptionDao(CloudBackupsDataTable.class);
        }
        return this.Q;
    }

    public RuntimeExceptionDao<VideoWatchLogTable, Integer> u0() {
        if (this.A1 == null) {
            try {
                this.A1 = getRuntimeExceptionDao(VideoWatchLogTable.class);
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
        return this.A1;
    }

    public RuntimeExceptionDao<CloudDownRecoderTable, Integer> v() {
        if (this.Z == null) {
            this.Z = getRuntimeExceptionDao(CloudDownRecoderTable.class);
        }
        return this.Z;
    }

    public RuntimeExceptionDao<WarMatchAndLocalTable, Integer> v0() {
        if (this.N == null) {
            this.N = getRuntimeExceptionDao(WarMatchAndLocalTable.class);
        }
        return this.N;
    }

    public RuntimeExceptionDao<H5GameAccountDataTable, Integer> w0() {
        if (this.Y == null) {
            this.Y = getRuntimeExceptionDao(H5GameAccountDataTable.class);
        }
        return this.Y;
    }

    public RuntimeExceptionDao<Course, Integer> y() {
        if (this.f14502f == null) {
            this.f14502f = getRuntimeExceptionDao(Course.class);
        }
        return this.f14502f;
    }

    public RuntimeExceptionDao<DownloadFileTable, Integer> z() {
        if (this.f14519u == null) {
            this.f14519u = getRuntimeExceptionDao(DownloadFileTable.class);
        }
        return this.f14519u;
    }
}
