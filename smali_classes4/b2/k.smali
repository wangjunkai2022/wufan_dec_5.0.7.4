.class public Lb2/k;
.super Lp1/b;
.source "DownloadHistoryTableManager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp1/b<",
        "Lcom/join/mgps/db/tables/DownloadHistoryTable;",
        ">;"
    }
.end annotation


# static fields
.field private static b:Lb2/k;

.field private static c:Lcom/j256/ormlite/dao/RuntimeExceptionDao;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/j256/ormlite/dao/RuntimeExceptionDao<",
            "Lcom/join/mgps/db/tables/DownloadHistoryTable;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lb2/k;->c:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    invoke-direct {p0, v0}, Lp1/b;-><init>(Lcom/j256/ormlite/dao/RuntimeExceptionDao;)V

    return-void
.end method

.method public static n()Lb2/k;
    .locals 1

    .line 1
    sget-object v0, Lb2/k;->b:Lb2/k;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lp1/e;->d(Landroid/content/Context;)Lp1/e;

    move-result-object v0

    invoke-virtual {v0}, Lp1/e;->c()Lcom/join/android/app/common/db/DatabaseHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/android/app/common/db/DatabaseHelper;->A()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    sput-object v0, Lb2/k;->c:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    .line 3
    new-instance v0, Lb2/k;

    invoke-direct {v0}, Lb2/k;-><init>()V

    sput-object v0, Lb2/k;->b:Lb2/k;

    .line 4
    :cond_0
    sget-object v0, Lb2/k;->b:Lb2/k;

    return-object v0
.end method


# virtual methods
.method public o()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/db/tables/DownloadHistoryTable;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lb2/k;->c:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    invoke-virtual {v0}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;

    move-result-object v0

    :try_start_0
    const-string v1, "create_time"

    const/4 v2, 0x0

    .line 2
    invoke-virtual {v0, v1, v2}, Lcom/j256/ormlite/stmt/QueryBuilder;->orderBy(Ljava/lang/String;Z)Lcom/j256/ormlite/stmt/QueryBuilder;

    .line 3
    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->query()Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public p(Ljava/lang/String;)Lcom/join/mgps/db/tables/DownloadHistoryTable;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 1
    :cond_0
    sget-object v1, Lb2/k;->c:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    const-string v2, "crc_link_type_val"

    invoke-virtual {v1, v2, p1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->queryForEq(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    const/4 v0, 0x0

    .line 3
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/db/tables/DownloadHistoryTable;

    return-object p1

    :cond_1
    return-object v0
.end method
