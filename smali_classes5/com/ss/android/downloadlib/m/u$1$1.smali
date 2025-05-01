.class Lcom/ss/android/downloadlib/m/u$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/m/u$1;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/downloadlib/m/u$1;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/m/u$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/m/u$1$1;->vv:Lcom/ss/android/downloadlib/m/u$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/m/u$1$1;->vv:Lcom/ss/android/downloadlib/m/u$1;

    iget-object v0, v0, Lcom/ss/android/downloadlib/m/u$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/vv/m;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/downloadlib/n/jh;->p(Ljava/lang/String;)Z

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/ss/android/downloadlib/m/u$1$1;->vv:Lcom/ss/android/downloadlib/m/u$1;

    iget-object v1, v1, Lcom/ss/android/downloadlib/m/u$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-static {v1}, Lcom/ss/android/downloadlib/m/u;->o(Lcom/ss/android/downloadad/api/vv/m;)J

    move-result-wide v1

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v0, p0, Lcom/ss/android/downloadlib/m/u$1$1;->vv:Lcom/ss/android/downloadlib/m/u$1;

    iget-wide v5, v0, Lcom/ss/android/downloadlib/m/u$1;->m:J

    sub-long/2addr v3, v5

    cmp-long v0, v1, v3

    if-ltz v0, :cond_2

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/m/u$1$1;->vv:Lcom/ss/android/downloadlib/m/u$1;

    iget-object v0, v0, Lcom/ss/android/downloadlib/m/u$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-static {v0}, Lcom/ss/android/downloadlib/m/u;->u(Lcom/ss/android/downloadad/api/vv/m;)J

    move-result-wide v0

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v4, p0, Lcom/ss/android/downloadlib/m/u$1$1;->vv:Lcom/ss/android/downloadlib/m/u$1;

    iget-wide v5, v4, Lcom/ss/android/downloadlib/m/u$1;->m:J

    sub-long/2addr v2, v5

    cmp-long v5, v2, v0

    if-lez v5, :cond_1

    .line 6
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/m/u$1$1;->vv:Lcom/ss/android/downloadlib/m/u$1;

    iget-object v1, v1, Lcom/ss/android/downloadlib/m/u$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    const-string v2, "deeplink_delay_timeout"

    invoke-virtual {v0, v2, v1}, Lcom/ss/android/downloadlib/i/vv;->vv(Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/vv;)V

    return-void

    .line 7
    :cond_1
    iget-object v0, v4, Lcom/ss/android/downloadlib/m/u$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->jh(Z)V

    .line 8
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    iget-object v2, p0, Lcom/ss/android/downloadlib/m/u$1$1;->vv:Lcom/ss/android/downloadlib/m/u$1;

    iget-object v2, v2, Lcom/ss/android/downloadlib/m/u$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    const-string v3, "deeplink_delay_invoke"

    invoke-virtual {v0, v3, v2}, Lcom/ss/android/downloadlib/i/vv;->vv(Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 9
    iget-object v0, p0, Lcom/ss/android/downloadlib/m/u$1$1;->vv:Lcom/ss/android/downloadlib/m/u$1;

    iget-object v0, v0, Lcom/ss/android/downloadlib/m/u$1;->p:Lcom/ss/android/downloadlib/m/qv;

    invoke-interface {v0, v1}, Lcom/ss/android/downloadlib/m/qv;->vv(Z)V

    .line 10
    iget-object v0, p0, Lcom/ss/android/downloadlib/m/u$1$1;->vv:Lcom/ss/android/downloadlib/m/u$1;

    iget-object v0, v0, Lcom/ss/android/downloadlib/m/u$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-static {v0}, Lcom/ss/android/downloadlib/m/u;->n(Lcom/ss/android/downloadad/api/vv/m;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/m/u;->vv(Lcom/ss/android/downloadad/api/vv/m;I)V

    :cond_2
    return-void
.end method
