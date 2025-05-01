.class public Lp1/l;
.super Lp1/b;
.source "ResourceShareManager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp1/b<",
        "Lcom/join/android/app/common/db/tables/ResourceShare;",
        ">;"
    }
.end annotation


# static fields
.field private static b:Lp1/l;

.field private static c:Lcom/j256/ormlite/dao/RuntimeExceptionDao;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/j256/ormlite/dao/RuntimeExceptionDao<",
            "Lcom/join/android/app/common/db/tables/ResourceShare;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lp1/l;->c:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    invoke-direct {p0, v0}, Lp1/b;-><init>(Lcom/j256/ormlite/dao/RuntimeExceptionDao;)V

    return-void
.end method

.method public static n()Lp1/l;
    .locals 1

    .line 1
    sget-object v0, Lp1/l;->b:Lp1/l;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lp1/e;->d(Landroid/content/Context;)Lp1/e;

    move-result-object v0

    invoke-virtual {v0}, Lp1/e;->c()Lcom/join/android/app/common/db/DatabaseHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/android/app/common/db/DatabaseHelper;->l0()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    sput-object v0, Lp1/l;->c:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    .line 3
    new-instance v0, Lp1/l;

    invoke-direct {v0}, Lp1/l;-><init>()V

    sput-object v0, Lp1/l;->b:Lp1/l;

    .line 4
    :cond_0
    sget-object v0, Lp1/l;->b:Lp1/l;

    return-object v0
.end method
