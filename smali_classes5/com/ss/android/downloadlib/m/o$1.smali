.class Lcom/ss/android/downloadlib/m/o$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/m/o;->vv(Lcom/ss/android/downloadlib/m/i;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/m/i;

.field final synthetic p:Lcom/ss/android/downloadlib/m/o;

.field final synthetic vv:J


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/m/o;JLcom/ss/android/downloadlib/m/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/m/o$1;->p:Lcom/ss/android/downloadlib/m/o;

    iput-wide p2, p0, Lcom/ss/android/downloadlib/m/o$1;->vv:J

    iput-object p4, p0, Lcom/ss/android/downloadlib/m/o$1;->m:Lcom/ss/android/downloadlib/m/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/vv/vv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/vv/vv;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/ss/android/downloadlib/m/o$1;->p:Lcom/ss/android/downloadlib/m/o;

    invoke-static {v2}, Lcom/ss/android/downloadlib/m/o;->vv(Lcom/ss/android/downloadlib/m/o;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lcom/ss/android/downloadlib/m/o$1;->vv:J

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/m/o$1;->m:Lcom/ss/android/downloadlib/m/i;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ss/android/downloadlib/m/i;->vv(Z)V

    return-void

    .line 4
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/m/o$1;->m:Lcom/ss/android/downloadlib/m/i;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ss/android/downloadlib/m/i;->vv(Z)V

    return-void
.end method
