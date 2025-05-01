.class public Lcom/kwad/framework/filedownloader/services/FileDownloadServiceProxy;
.super Lcom/kwad/sdk/l/a;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "Registered"
    }
.end annotation

.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lcom/kwad/sdk/api/core/KsAdSdkDynamicImpl;
    value = Lcom/kwad/sdk/api/proxy/app/FileDownloadService;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/framework/filedownloader/services/FileDownloadServiceProxy$SeparateProcessServiceProxy;,
        Lcom/kwad/framework/filedownloader/services/FileDownloadServiceProxy$SharedMainProcessServiceProxy;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "filedownloader"


# instance fields
.field public context:Landroid/app/Service;

.field private handler:Lcom/kwad/framework/filedownloader/services/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/l/a;-><init>()V

    return-void
.end method

.method public static register()V
    .locals 2
    .annotation build Lcom/ksad/annotation/invoker/InvokeBy;
        invokerClass = Lcom/kwad/sdk/service/b;
        methodId = "initComponentProxyForInvoker"
    .end annotation

    .line 1
    const-class v0, Lcom/kwad/sdk/api/proxy/app/FileDownloadService$SeparateProcessService;

    const-class v1, Lcom/kwad/framework/filedownloader/services/FileDownloadServiceProxy$SeparateProcessServiceProxy;

    invoke-static {v0, v1}, Lcom/kwad/sdk/service/b;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 2
    const-class v0, Lcom/kwad/sdk/api/proxy/app/FileDownloadService$SharedMainProcessService;

    const-class v1, Lcom/kwad/framework/filedownloader/services/FileDownloadServiceProxy$SharedMainProcessServiceProxy;

    invoke-static {v0, v1}, Lcom/kwad/sdk/service/b;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/app/Service;Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/kwad/framework/filedownloader/services/FileDownloadServiceProxy;->handler:Lcom/kwad/framework/filedownloader/services/i;

    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/services/i;->xg()Landroid/os/IBinder;

    move-result-object p1

    return-object p1
.end method

.method public onCreate(Landroid/app/Service;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/services/FileDownloadServiceProxy;->context:Landroid/app/Service;

    .line 2
    invoke-static {p1}, Lcom/kwad/framework/filedownloader/f/c;->ax(Landroid/content/Context;)V

    .line 3
    :try_start_0
    invoke-static {}, Lcom/kwad/framework/filedownloader/f/e;->xr()Lcom/kwad/framework/filedownloader/f/e;

    move-result-object p1

    iget p1, p1, Lcom/kwad/framework/filedownloader/f/e;->ajc:I

    .line 4
    invoke-static {p1}, Lcom/kwad/framework/filedownloader/f/f;->bM(I)V

    .line 5
    invoke-static {}, Lcom/kwad/framework/filedownloader/f/e;->xr()Lcom/kwad/framework/filedownloader/f/e;

    move-result-object p1

    iget-wide v0, p1, Lcom/kwad/framework/filedownloader/f/e;->ajd:J

    .line 6
    invoke-static {v0, v1}, Lcom/kwad/framework/filedownloader/f/f;->V(J)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    .line 8
    :goto_0
    new-instance p1, Lcom/kwad/framework/filedownloader/services/g;

    invoke-direct {p1}, Lcom/kwad/framework/filedownloader/services/g;-><init>()V

    .line 9
    invoke-static {}, Lcom/kwad/framework/filedownloader/f/e;->xr()Lcom/kwad/framework/filedownloader/f/e;

    move-result-object v0

    iget-boolean v0, v0, Lcom/kwad/framework/filedownloader/f/e;->ajf:Z

    if-eqz v0, :cond_1

    .line 10
    new-instance v0, Lcom/kwad/framework/filedownloader/services/e;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1, p1}, Lcom/kwad/framework/filedownloader/services/e;-><init>(Ljava/lang/ref/WeakReference;Lcom/kwad/framework/filedownloader/services/g;)V

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/services/FileDownloadServiceProxy;->handler:Lcom/kwad/framework/filedownloader/services/i;

    return-void

    .line 11
    :cond_1
    new-instance v0, Lcom/kwad/framework/filedownloader/services/d;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1, p1}, Lcom/kwad/framework/filedownloader/services/d;-><init>(Ljava/lang/ref/WeakReference;Lcom/kwad/framework/filedownloader/services/g;)V

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/services/FileDownloadServiceProxy;->handler:Lcom/kwad/framework/filedownloader/services/i;

    return-void
.end method

.method public onDestroy(Landroid/app/Service;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/kwad/framework/filedownloader/services/FileDownloadServiceProxy;->handler:Lcom/kwad/framework/filedownloader/services/i;

    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/services/i;->onDestroy()V

    return-void
.end method

.method public onStartCommand(Landroid/app/Service;Landroid/content/Intent;II)I
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/kwad/framework/filedownloader/services/FileDownloadServiceProxy;->handler:Lcom/kwad/framework/filedownloader/services/i;

    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/services/i;->xf()V

    const/4 p1, 0x2

    return p1
.end method
