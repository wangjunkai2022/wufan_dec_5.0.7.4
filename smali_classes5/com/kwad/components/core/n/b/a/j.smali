.class public final Lcom/kwad/components/core/n/b/a/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/offline/api/core/IOfflineHostApi;


# instance fields
.field private NB:Lcom/kwad/components/offline/api/core/api/IDownloader;

.field private NC:Lcom/kwad/components/offline/api/core/api/IImageLoader;

.field private ND:Lcom/kwad/components/offline/api/core/video/IVideo;

.field private NE:Lcom/kwad/components/offline/api/core/adlive/ILive;

.field private NF:Lcom/kwad/components/offline/api/core/api/ICache;

.field private NG:Lcom/kwad/components/offline/api/core/webview/IWebView;

.field private NH:Lcom/kwad/components/offline/api/core/api/IVibratorUtil;

.field private NI:Lcom/kwad/components/offline/api/core/network/IIdc;

.field private NJ:Lcom/kwad/components/offline/api/core/imageplayer/IImagePlayer;

.field private NK:Lcom/kwad/components/offline/api/core/api/ILifeCycle;

.field private NL:Lcom/kwad/components/offline/api/core/network/INetworkManager;

.field private NM:Lcom/kwad/components/offline/api/core/api/ISystemProperties;

.field private NN:Lcom/kwad/components/offline/api/core/api/IFlowUuid;

.field private Ns:Lcom/kwad/components/offline/api/core/api/IAsync;

.field private Nt:Lcom/kwad/components/offline/api/core/api/IEnvironment;

.field private Nu:Lcom/kwad/components/offline/api/core/api/IZipper;

.field private Nv:Lcom/kwad/components/offline/api/core/api/INet;

.field private Nw:Lcom/kwad/components/offline/api/core/api/IEncrypt;

.field private Nx:Lcom/kwad/components/offline/api/core/api/IOfflineCompoLogcat;

.field private Ny:Lcom/kwad/components/offline/api/core/api/ICrash;

.field private Nz:Lcom/kwad/components/offline/api/core/api/ILoggerReporter;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final async()Lcom/kwad/components/offline/api/core/api/IAsync;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Ns:Lcom/kwad/components/offline/api/core/api/IAsync;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/a/a;

    invoke-direct {v0}, Lcom/kwad/components/core/n/b/a/a;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Ns:Lcom/kwad/components/offline/api/core/api/IAsync;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Ns:Lcom/kwad/components/offline/api/core/api/IAsync;

    return-object v0
.end method

.method public final bundleService()Lcom/kwad/components/offline/api/core/api/IBundleService;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/n/b/a/j$4;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/n/b/a/j$4;-><init>(Lcom/kwad/components/core/n/b/a/j;)V

    return-object v0
.end method

.method public final cache()Lcom/kwad/components/offline/api/core/api/ICache;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NF:Lcom/kwad/components/offline/api/core/api/ICache;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/a/b;

    invoke-direct {v0}, Lcom/kwad/components/core/n/b/a/b;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NF:Lcom/kwad/components/offline/api/core/api/ICache;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NF:Lcom/kwad/components/offline/api/core/api/ICache;

    return-object v0
.end method

.method public final crash()Lcom/kwad/components/offline/api/core/api/ICrash;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Ny:Lcom/kwad/components/offline/api/core/api/ICrash;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/a/j$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/n/b/a/j$1;-><init>(Lcom/kwad/components/core/n/b/a/j;)V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Ny:Lcom/kwad/components/offline/api/core/api/ICrash;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Ny:Lcom/kwad/components/offline/api/core/api/ICrash;

    return-object v0
.end method

.method public final downloader()Lcom/kwad/components/offline/api/core/api/IDownloader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NB:Lcom/kwad/components/offline/api/core/api/IDownloader;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/a/j$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/n/b/a/j$3;-><init>(Lcom/kwad/components/core/n/b/a/j;)V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NB:Lcom/kwad/components/offline/api/core/api/IDownloader;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NB:Lcom/kwad/components/offline/api/core/api/IDownloader;

    return-object v0
.end method

.method public final encrypt()Lcom/kwad/components/offline/api/core/api/IEncrypt;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Nw:Lcom/kwad/components/offline/api/core/api/IEncrypt;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/a/c;

    invoke-direct {v0}, Lcom/kwad/components/core/n/b/a/c;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Nw:Lcom/kwad/components/offline/api/core/api/IEncrypt;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Nw:Lcom/kwad/components/offline/api/core/api/IEncrypt;

    return-object v0
.end method

.method public final env()Lcom/kwad/components/offline/api/core/api/IEnvironment;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Nt:Lcom/kwad/components/offline/api/core/api/IEnvironment;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/a/d;

    invoke-direct {v0}, Lcom/kwad/components/core/n/b/a/d;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Nt:Lcom/kwad/components/offline/api/core/api/IEnvironment;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Nt:Lcom/kwad/components/offline/api/core/api/IEnvironment;

    return-object v0
.end method

.method public final flowUuid()Lcom/kwad/components/offline/api/core/api/IFlowUuid;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NN:Lcom/kwad/components/offline/api/core/api/IFlowUuid;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/a/e;

    invoke-direct {v0}, Lcom/kwad/components/core/n/b/a/e;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NN:Lcom/kwad/components/offline/api/core/api/IFlowUuid;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NN:Lcom/kwad/components/offline/api/core/api/IFlowUuid;

    return-object v0
.end method

.method public final getAppIconId(Landroid/content/Context;)I
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/utils/at;->getAppIconId(Landroid/content/Context;)I

    move-result p1

    return p1
.end method

.method public final getDrawableId(Landroid/content/Context;Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/kwad/sdk/utils/at;->at(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final getId(Landroid/content/Context;Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/kwad/sdk/utils/at;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final getSystemTimeInMs(Landroid/content/Context;Z)J
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/kwad/sdk/utils/bl;->v(Landroid/content/Context;Z)J

    move-result-wide p1

    return-wide p1
.end method

.method public final getTKErrorDetailCount()I
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->getTKErrorDetailCount()I

    move-result v0

    return v0
.end method

.method public final getTKPreloadMemCacheTemplates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->getTKPreloadMemCacheTemplates()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final idc()Lcom/kwad/components/offline/api/core/network/IIdc;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NI:Lcom/kwad/components/offline/api/core/network/IIdc;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/a/m;

    invoke-direct {v0}, Lcom/kwad/components/core/n/b/a/m;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NI:Lcom/kwad/components/offline/api/core/network/IIdc;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NI:Lcom/kwad/components/offline/api/core/network/IIdc;

    return-object v0
.end method

.method public final imageLoader()Lcom/kwad/components/offline/api/core/api/IImageLoader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NC:Lcom/kwad/components/offline/api/core/api/IImageLoader;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/a/f;

    invoke-direct {v0}, Lcom/kwad/components/core/n/b/a/f;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NC:Lcom/kwad/components/offline/api/core/api/IImageLoader;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NC:Lcom/kwad/components/offline/api/core/api/IImageLoader;

    return-object v0
.end method

.method public final imagePlayer()Lcom/kwad/components/offline/api/core/imageplayer/IImagePlayer;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/g/d;

    invoke-direct {v0}, Lcom/kwad/components/core/g/d;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NJ:Lcom/kwad/components/offline/api/core/imageplayer/IImagePlayer;

    return-object v0
.end method

.method public final isOrientationPortrait()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/aj;->isOrientationPortrait()Z

    move-result v0

    return v0
.end method

.method public final lifeCycle()Lcom/kwad/components/offline/api/core/api/ILifeCycle;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NK:Lcom/kwad/components/offline/api/core/api/ILifeCycle;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/a/g;

    invoke-direct {v0}, Lcom/kwad/components/core/n/b/a/g;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NK:Lcom/kwad/components/offline/api/core/api/ILifeCycle;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NK:Lcom/kwad/components/offline/api/core/api/ILifeCycle;

    return-object v0
.end method

.method public final live()Lcom/kwad/components/offline/api/core/adlive/ILive;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NE:Lcom/kwad/components/offline/api/core/adlive/ILive;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/b/a;

    invoke-direct {v0}, Lcom/kwad/components/core/n/b/b/a;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NE:Lcom/kwad/components/offline/api/core/adlive/ILive;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NE:Lcom/kwad/components/offline/api/core/adlive/ILive;

    return-object v0
.end method

.method public final log()Lcom/kwad/components/offline/api/core/api/IOfflineCompoLogcat;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Nx:Lcom/kwad/components/offline/api/core/api/IOfflineCompoLogcat;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/a/k;

    invoke-direct {v0}, Lcom/kwad/components/core/n/b/a/k;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Nx:Lcom/kwad/components/offline/api/core/api/IOfflineCompoLogcat;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Nx:Lcom/kwad/components/offline/api/core/api/IOfflineCompoLogcat;

    return-object v0
.end method

.method public final loggerReporter()Lcom/kwad/components/offline/api/core/api/ILoggerReporter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Nz:Lcom/kwad/components/offline/api/core/api/ILoggerReporter;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/a/j$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/n/b/a/j$2;-><init>(Lcom/kwad/components/core/n/b/a/j;)V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Nz:Lcom/kwad/components/offline/api/core/api/ILoggerReporter;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Nz:Lcom/kwad/components/offline/api/core/api/ILoggerReporter;

    return-object v0
.end method

.method public final net()Lcom/kwad/components/offline/api/core/api/INet;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Nv:Lcom/kwad/components/offline/api/core/api/INet;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/a/h;

    invoke-direct {v0}, Lcom/kwad/components/core/n/b/a/h;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Nv:Lcom/kwad/components/offline/api/core/api/INet;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Nv:Lcom/kwad/components/offline/api/core/api/INet;

    return-object v0
.end method

.method public final networkManager()Lcom/kwad/components/offline/api/core/network/INetworkManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NL:Lcom/kwad/components/offline/api/core/network/INetworkManager;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/a/i;

    invoke-direct {v0}, Lcom/kwad/components/core/n/b/a/i;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NL:Lcom/kwad/components/offline/api/core/network/INetworkManager;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NL:Lcom/kwad/components/offline/api/core/network/INetworkManager;

    return-object v0
.end method

.method public final saveTKTemplateCache(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/h;->tf()Lcom/kwad/components/core/webview/tachikoma/h;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/kwad/components/core/webview/tachikoma/h;->b(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public final systemProperty()Lcom/kwad/components/offline/api/core/api/ISystemProperties;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NM:Lcom/kwad/components/offline/api/core/api/ISystemProperties;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/a/n;

    invoke-direct {v0}, Lcom/kwad/components/core/n/b/a/n;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NM:Lcom/kwad/components/offline/api/core/api/ISystemProperties;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NM:Lcom/kwad/components/offline/api/core/api/ISystemProperties;

    return-object v0
.end method

.method public final vibratorUtil()Lcom/kwad/components/offline/api/core/api/IVibratorUtil;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NH:Lcom/kwad/components/offline/api/core/api/IVibratorUtil;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/a/o;

    invoke-direct {v0}, Lcom/kwad/components/core/n/b/a/o;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NH:Lcom/kwad/components/offline/api/core/api/IVibratorUtil;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NH:Lcom/kwad/components/offline/api/core/api/IVibratorUtil;

    return-object v0
.end method

.method public final video()Lcom/kwad/components/offline/api/core/video/IVideo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->ND:Lcom/kwad/components/offline/api/core/video/IVideo;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/c/e;

    invoke-direct {v0}, Lcom/kwad/components/core/n/b/c/e;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->ND:Lcom/kwad/components/offline/api/core/video/IVideo;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->ND:Lcom/kwad/components/offline/api/core/video/IVideo;

    return-object v0
.end method

.method public final webview()Lcom/kwad/components/offline/api/core/webview/IWebView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NG:Lcom/kwad/components/offline/api/core/webview/IWebView;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/d/b;

    invoke-direct {v0}, Lcom/kwad/components/core/n/b/d/b;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NG:Lcom/kwad/components/offline/api/core/webview/IWebView;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->NG:Lcom/kwad/components/offline/api/core/webview/IWebView;

    return-object v0
.end method

.method public final zipper()Lcom/kwad/components/offline/api/core/api/IZipper;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Nu:Lcom/kwad/components/offline/api/core/api/IZipper;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/n/b/a/p;

    invoke-direct {v0}, Lcom/kwad/components/core/n/b/a/p;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Nu:Lcom/kwad/components/offline/api/core/api/IZipper;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/j;->Nu:Lcom/kwad/components/offline/api/core/api/IZipper;

    return-object v0
.end method
