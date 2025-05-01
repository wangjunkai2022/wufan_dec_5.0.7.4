.class public Lcom/ss/android/downloadlib/addownload/u$vv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/downloadlib/addownload/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "vv"
.end annotation


# static fields
.field private static vv:Lcom/ss/android/downloadlib/addownload/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/ss/android/downloadlib/addownload/u;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ss/android/downloadlib/addownload/u;-><init>(Lcom/ss/android/downloadlib/addownload/u$1;)V

    sput-object v0, Lcom/ss/android/downloadlib/addownload/u$vv;->vv:Lcom/ss/android/downloadlib/addownload/u;

    return-void
.end method

.method static synthetic vv()Lcom/ss/android/downloadlib/addownload/u;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/u$vv;->vv:Lcom/ss/android/downloadlib/addownload/u;

    return-object v0
.end method
