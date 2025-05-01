.class public Lcom/ss/android/downloadlib/m/o;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/vv/vv$vv;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/downloadlib/m/o$vv;
    }
.end annotation


# instance fields
.field private vv:J


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lcom/ss/android/downloadlib/m/o;->vv:J

    .line 4
    invoke-static {}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/vv/vv;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv(Lcom/ss/android/socialbase/downloader/vv/vv$vv;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ss/android/downloadlib/m/o$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/downloadlib/m/o;-><init>()V

    return-void
.end method

.method static synthetic vv(Lcom/ss/android/downloadlib/m/o;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/downloadlib/m/o;->vv:J

    return-wide v0
.end method

.method public static vv()Lcom/ss/android/downloadlib/m/o;
    .locals 1

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/m/o$vv;->vv()Lcom/ss/android/downloadlib/m/o;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public m()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/downloadlib/m/o;->vv:J

    return-void
.end method

.method public m(Lcom/ss/android/downloadlib/m/i;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->wv()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "check_an_result_delay"

    const/16 v2, 0x4b0

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    if-lez v0, :cond_1

    move v2, v0

    :cond_1
    int-to-long v0, v2

    .line 3
    invoke-virtual {p0, p1, v0, v1}, Lcom/ss/android/downloadlib/m/o;->vv(Lcom/ss/android/downloadlib/m/i;J)V

    return-void
.end method

.method public p()V
    .locals 0

    return-void
.end method

.method public vv(Lcom/ss/android/downloadlib/m/i;)V
    .locals 2

    const-wide/16 v0, 0x1388

    .line 4
    invoke-virtual {p0, p1, v0, v1}, Lcom/ss/android/downloadlib/m/o;->vv(Lcom/ss/android/downloadlib/m/i;J)V

    return-void
.end method

.method public vv(Lcom/ss/android/downloadlib/m/i;J)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/i;->vv()Lcom/ss/android/downloadlib/i;

    move-result-object v0

    new-instance v1, Lcom/ss/android/downloadlib/m/o$1;

    invoke-direct {v1, p0, p2, p3, p1}, Lcom/ss/android/downloadlib/m/o$1;-><init>(Lcom/ss/android/downloadlib/m/o;JLcom/ss/android/downloadlib/m/i;)V

    invoke-virtual {v0, v1, p2, p3}, Lcom/ss/android/downloadlib/i;->vv(Ljava/lang/Runnable;J)V

    return-void
.end method
