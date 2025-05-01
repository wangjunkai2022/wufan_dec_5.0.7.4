.class public Lb2/b;
.super Lp1/b;
.source "AppBeanTableManager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp1/b<",
        "Lcom/join/mgps/db/tables/AppBeanTable;",
        ">;"
    }
.end annotation


# static fields
.field private static b:Lb2/b;

.field private static c:Lcom/j256/ormlite/dao/RuntimeExceptionDao;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/j256/ormlite/dao/RuntimeExceptionDao<",
            "Lcom/join/mgps/db/tables/AppBeanTable;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lb2/b;->c:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    invoke-direct {p0, v0}, Lp1/b;-><init>(Lcom/j256/ormlite/dao/RuntimeExceptionDao;)V

    return-void
.end method

.method public static n()Lb2/b;
    .locals 1

    .line 1
    sget-object v0, Lb2/b;->b:Lb2/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lp1/e;->d(Landroid/content/Context;)Lp1/e;

    move-result-object v0

    invoke-virtual {v0}, Lp1/e;->c()Lcom/join/android/app/common/db/DatabaseHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/android/app/common/db/DatabaseHelper;->g()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    sput-object v0, Lb2/b;->c:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    .line 3
    new-instance v0, Lb2/b;

    invoke-direct {v0}, Lb2/b;-><init>()V

    sput-object v0, Lb2/b;->b:Lb2/b;

    .line 4
    :cond_0
    sget-object v0, Lb2/b;->b:Lb2/b;

    return-object v0
.end method
