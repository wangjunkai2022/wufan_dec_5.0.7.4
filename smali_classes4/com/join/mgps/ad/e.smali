.class public Lcom/join/mgps/ad/e;
.super Lcom/join/mgps/ad/c;
.source "GDTInfoStreamVideo.java"

# interfaces
.implements Lcom/qq/e/ads/nativ/NativeExpressAD$NativeExpressADListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/ad/c<",
        "Lcom/qq/e/ads/nativ/NativeExpressADView;",
        ">;",
        "Lcom/qq/e/ads/nativ/NativeExpressAD$NativeExpressADListener;"
    }
.end annotation


# static fields
.field public static k:Z


# instance fields
.field private g:Lcom/qq/e/ads/nativ/NativeExpressAD;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qq/e/ads/nativ/NativeExpressADView;",
            ">;"
        }
    .end annotation
.end field

.field private i:Z

.field protected j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "GDT"

    .line 1
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/join/mgps/ad/c;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/ad/e;->h:Ljava/util/List;

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/join/mgps/ad/e;->i:Z

    .line 4
    iput-boolean p1, p0, Lcom/join/mgps/ad/e;->j:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    :try_start_0
    sget-boolean v0, Lcom/join/mgps/ad/e;->k:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/c;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/ad/c;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qq/e/comm/managers/GDTAdSdk;->init(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 3
    invoke-static {v0}, Lcom/qq/e/comm/managers/setting/GlobalSetting;->setChannel(I)V

    .line 4
    invoke-static {v0}, Lcom/qq/e/comm/managers/setting/GlobalSetting;->setEnableMediationTool(Z)V

    .line 5
    sput-boolean v0, Lcom/join/mgps/ad/e;->k:Z

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/ad/o;->onInitSuccess()V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/ad/o;->onInitSuccess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public b(III)V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/ad/e;->i:Z

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/join/mgps/ad/e;->j:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/ad/e;->j:Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/ad/e;->g:Lcom/qq/e/ads/nativ/NativeExpressAD;

    if-nez v0, :cond_1

    .line 5
    new-instance v0, Lcom/qq/e/ads/nativ/NativeExpressAD;

    iget-object v1, p0, Lcom/join/mgps/ad/c;->a:Landroid/content/Context;

    new-instance v2, Lcom/qq/e/ads/nativ/ADSize;

    invoke-direct {v2, p2, p3}, Lcom/qq/e/ads/nativ/ADSize;-><init>(II)V

    iget-object p2, p0, Lcom/join/mgps/ad/c;->c:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2, p0}, Lcom/qq/e/ads/nativ/NativeExpressAD;-><init>(Landroid/content/Context;Lcom/qq/e/ads/nativ/ADSize;Ljava/lang/String;Lcom/qq/e/ads/nativ/NativeExpressAD$NativeExpressADListener;)V

    iput-object v0, p0, Lcom/join/mgps/ad/e;->g:Lcom/qq/e/ads/nativ/NativeExpressAD;

    .line 6
    :cond_1
    iget-object p2, p0, Lcom/join/mgps/ad/e;->g:Lcom/qq/e/ads/nativ/NativeExpressAD;

    invoke-virtual {p2, p1}, Lcom/qq/e/ads/nativ/NativeExpressAD;->loadAD(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p1, -0x1

    const-string p2, "\u5e7f\u544a\u521d\u59cb\u5316\u9519\u8bef"

    .line 8
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/ad/e;->onError(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/e;->h:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qq/e/ads/nativ/NativeExpressADView;

    .line 3
    invoke-virtual {v1}, Lcom/qq/e/ads/nativ/NativeExpressADView;->destroy()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/join/mgps/ad/e;->h:Ljava/util/List;

    return-void
.end method

.method public onADClicked(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/ad/c;->e:Lcom/join/mgps/ad/c$a;

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Lcom/join/mgps/ad/c$a;->onAdClick()V

    :cond_0
    return-void
.end method

.method public onADClosed(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/c;->e:Lcom/join/mgps/ad/c$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/join/mgps/ad/c$a;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onADExposure(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/ad/c;->e:Lcom/join/mgps/ad/c$a;

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Lcom/join/mgps/ad/c$a;->onAdShow()V

    :cond_0
    return-void
.end method

.method public onADLeftApplication(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 0

    return-void
.end method

.method public onADLoaded(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qq/e/ads/nativ/NativeExpressADView;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/ad/e;->i:Z

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/ad/e;->j:Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/e;->h:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 5
    iget-object v0, p0, Lcom/join/mgps/ad/c;->e:Lcom/join/mgps/ad/c$a;

    if-eqz v0, :cond_0

    .line 6
    invoke-interface {v0, p1}, Lcom/join/mgps/ad/c$a;->onADLoaded(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/ad/o;->onError(ILjava/lang/String;)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/join/mgps/ad/e;->i:Z

    .line 3
    iput-boolean p1, p0, Lcom/join/mgps/ad/e;->j:Z

    return-void
.end method

.method public onNoAD(Lcom/qq/e/comm/util/AdError;)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/ad/e;->i:Z

    .line 2
    iput-boolean p1, p0, Lcom/join/mgps/ad/e;->j:Z

    return-void
.end method

.method public onRenderFail(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 0

    return-void
.end method

.method public onRenderSuccess(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 0

    return-void
.end method
