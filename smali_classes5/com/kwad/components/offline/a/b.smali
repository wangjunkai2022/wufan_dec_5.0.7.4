.class public final Lcom/kwad/components/offline/a/b;
.super Lcom/kwad/components/core/n/b/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/offline/a/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kwad/components/core/n/b/a<",
        "Lcom/kwad/components/offline/api/adLive/IAdLiveOfflineCompo;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/n/b/a;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/offline/a/b;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Context;Lcom/kwad/components/offline/api/adLive/IAdLiveOfflineCompo;)V
    .locals 2

    .line 4
    new-instance v0, Lcom/kwad/components/offline/a/c;

    invoke-direct {v0}, Lcom/kwad/components/offline/a/c;-><init>()V

    new-instance v1, Lcom/kwad/components/offline/a/b$1;

    invoke-direct {v1, p0, p2}, Lcom/kwad/components/offline/a/b$1;-><init>(Lcom/kwad/components/offline/a/b;Lcom/kwad/components/offline/api/adLive/IAdLiveOfflineCompo;)V

    invoke-interface {p2, p1, v0, v1}, Lcom/kwad/components/offline/api/IOfflineCompo;->init(Landroid/content/Context;Lcom/kwad/components/offline/api/IOfflineCompoInitConfig;Lcom/kwad/components/offline/api/InitCallBack;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/offline/a/b;)V
    .locals 0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/core/n/b/a;->pm()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/offline/a/b;I)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/kwad/components/core/n/b/a;->au(I)V

    return-void
.end method

.method public static au(Landroid/content/Context;)V
    .locals 1
    .annotation build Lcom/ksad/annotation/invoker/InvokeBy;
        invokerClass = Lcom/kwad/components/core/n/b/b;
        methodId = "initOC"
    .end annotation

    .line 1
    invoke-static {}, Lcom/kwad/components/offline/a/b;->ui()Lcom/kwad/components/offline/a/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/n/b/a;->init(Landroid/content/Context;)V

    return-void
.end method

.method private static ui()Lcom/kwad/components/offline/a/b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/offline/a/b$a;->uj()Lcom/kwad/components/offline/a/b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/content/Context;ZLcom/kwad/components/offline/api/IOfflineCompo;)V
    .locals 0

    .line 1
    check-cast p3, Lcom/kwad/components/offline/api/adLive/IAdLiveOfflineCompo;

    invoke-direct {p0, p1, p3}, Lcom/kwad/components/offline/a/b;->a(Landroid/content/Context;Lcom/kwad/components/offline/api/adLive/IAdLiveOfflineCompo;)V

    return-void
.end method

.method public final getTag()Ljava/lang/String;
    .locals 1

    const-string v0, "AdLiveInitModule"

    return-object v0
.end method

.method public final isEnabled()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/config/c;->asM:Lcom/kwad/sdk/core/config/item/d;

    invoke-static {v0}, Lcom/kwad/sdk/core/config/d;->b(Lcom/kwad/sdk/core/config/item/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final pn()Ljava/lang/String;
    .locals 1

    const-string v0, "LIVE"

    return-object v0
.end method

.method public final po()Ljava/lang/String;
    .locals 1

    const-string v0, "com.kwad.components.adLive"

    return-object v0
.end method

.method public final pp()Ljava/lang/String;
    .locals 1

    const-string v0, "3.3.59"

    return-object v0
.end method

.method public final pq()Ljava/lang/String;
    .locals 1

    const-string v0, "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/offline_components/adLive/ks_so-adLiveNoSoRelease-3.3.59-5a16210b94-483.zip"

    return-object v0
.end method

.method public final pr()Ljava/lang/String;
    .locals 1

    const-string v0, "d4d7aede5bd01c9eaf4bf3cf50b001ef"

    return-object v0
.end method

.method public final ps()Ljava/lang/String;
    .locals 1

    const-string v0, "ks_live_3359"

    return-object v0
.end method

.method public final pt()Ljava/lang/String;
    .locals 1

    const-string v0, "com.kwad.sdk.AdLiveOfflineCompoImpl"

    return-object v0
.end method
