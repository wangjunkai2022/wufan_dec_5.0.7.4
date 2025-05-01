.class final Lcom/ss/android/downloadlib/m/p$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/vv/vv$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/m/p;->vv(Lcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/guide/install/vv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/guide/install/vv;

.field final synthetic vv:Lcom/ss/android/downloadad/api/vv/m;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/guide/install/vv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/m/p$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    iput-object p2, p0, Lcom/ss/android/downloadlib/m/p$1;->m:Lcom/ss/android/downloadlib/guide/install/vv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public m()V
    .locals 3

    const-string v0, "AppInstallOptimiseHelper"

    const-string v1, "AppInstallOptimiseHelper-->onAppForeground"

    .line 1
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/vv/vv;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ss/android/socialbase/downloader/vv/vv;->m(Lcom/ss/android/socialbase/downloader/vv/vv$vv;)V

    .line 3
    iget-object v0, p0, Lcom/ss/android/downloadlib/m/p$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-static {v0}, Lcom/ss/android/downloadlib/n/jh;->m(Lcom/ss/android/downloadad/api/vv/m;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/ss/android/downloadlib/m/p$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->r(Z)V

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/m/p$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    const-string v2, "install_delay_invoke"

    invoke-virtual {v0, v2, v1}, Lcom/ss/android/downloadlib/i/vv;->vv(Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 6
    iget-object v0, p0, Lcom/ss/android/downloadlib/m/p$1;->m:Lcom/ss/android/downloadlib/guide/install/vv;

    invoke-interface {v0}, Lcom/ss/android/downloadlib/guide/install/vv;->vv()V

    :cond_0
    return-void
.end method

.method public p()V
    .locals 0

    return-void
.end method
