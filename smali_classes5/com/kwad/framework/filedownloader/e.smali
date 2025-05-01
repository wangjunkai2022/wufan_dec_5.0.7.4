.class public abstract Lcom/kwad/framework/filedownloader/e;
.super Lcom/kwad/framework/filedownloader/event/c;
.source "SourceFile"


# instance fields
.field private afo:Lcom/kwad/framework/filedownloader/event/DownloadServiceConnectChangedEvent$ConnectStatus;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/event/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/framework/filedownloader/event/b;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/kwad/framework/filedownloader/event/DownloadServiceConnectChangedEvent;

    if-eqz v0, :cond_1

    .line 2
    check-cast p1, Lcom/kwad/framework/filedownloader/event/DownloadServiceConnectChangedEvent;

    .line 3
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/event/DownloadServiceConnectChangedEvent;->wx()Lcom/kwad/framework/filedownloader/event/DownloadServiceConnectChangedEvent$ConnectStatus;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/framework/filedownloader/e;->afo:Lcom/kwad/framework/filedownloader/event/DownloadServiceConnectChangedEvent$ConnectStatus;

    .line 4
    sget-object v0, Lcom/kwad/framework/filedownloader/event/DownloadServiceConnectChangedEvent$ConnectStatus;->connected:Lcom/kwad/framework/filedownloader/event/DownloadServiceConnectChangedEvent$ConnectStatus;

    if-ne p1, v0, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/e;->va()V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/e;->vb()V

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract va()V
.end method

.method public abstract vb()V
.end method

.method public final vc()Lcom/kwad/framework/filedownloader/event/DownloadServiceConnectChangedEvent$ConnectStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/e;->afo:Lcom/kwad/framework/filedownloader/event/DownloadServiceConnectChangedEvent$ConnectStatus;

    return-object v0
.end method
