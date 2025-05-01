.class public Lb2/d;
.super Lp1/b;
.source "BannerAndTanlesTableManager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp1/b<",
        "Lcom/join/mgps/db/tables/BannerAndTablesTable;",
        ">;"
    }
.end annotation


# static fields
.field private static b:Lb2/d;

.field private static c:Lcom/j256/ormlite/dao/RuntimeExceptionDao;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/j256/ormlite/dao/RuntimeExceptionDao<",
            "Lcom/join/mgps/db/tables/BannerAndTablesTable;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lb2/d;->c:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    invoke-direct {p0, v0}, Lp1/b;-><init>(Lcom/j256/ormlite/dao/RuntimeExceptionDao;)V

    return-void
.end method

.method public static n()Lb2/d;
    .locals 1

    .line 1
    sget-object v0, Lb2/d;->b:Lb2/d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lp1/e;->d(Landroid/content/Context;)Lp1/e;

    move-result-object v0

    invoke-virtual {v0}, Lp1/e;->c()Lcom/join/android/app/common/db/DatabaseHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/android/app/common/db/DatabaseHelper;->k()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    sput-object v0, Lb2/d;->c:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    .line 3
    new-instance v0, Lb2/d;

    invoke-direct {v0}, Lb2/d;-><init>()V

    sput-object v0, Lb2/d;->b:Lb2/d;

    .line 4
    :cond_0
    sget-object v0, Lb2/d;->b:Lb2/d;

    return-object v0
.end method
