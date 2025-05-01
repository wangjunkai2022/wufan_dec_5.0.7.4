.class public Lcom/bytedance/sdk/openadsdk/CSJConfig;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/AdConfig;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;
    }
.end annotation


# instance fields
.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;

.field private i:Ljava/lang/String;

.field private j:Z

.field private jh:Lcom/bytedance/sdk/openadsdk/TTCustomController;

.field private k:Z

.field private m:Ljava/lang/String;

.field private n:Z

.field private o:Ljava/lang/String;

.field private p:Z

.field private q:I

.field private qv:Z

.field private r:I

.field private t:I

.field private u:I

.field private vv:Ljava/lang/String;

.field private wv:[I


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->p:Z

    .line 3
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->u:I

    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->n:Z

    .line 5
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->qv:Z

    .line 6
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->k:Z

    .line 7
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->vv(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->vv:Ljava/lang/String;

    .line 8
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->m(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->m:Ljava/lang/String;

    .line 9
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->p(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->p:Z

    .line 10
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->i(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->i:Ljava/lang/String;

    .line 11
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->o(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->o:Ljava/lang/String;

    .line 12
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->u(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;)I

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->u:I

    .line 13
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->n(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->n:Z

    .line 14
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->qv(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->qv:Z

    .line 15
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->wv(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;)[I

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->wv:[I

    .line 16
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->k(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->k:Z

    .line 17
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->b(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;)Lcom/bytedance/sdk/openadsdk/TTCustomController;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->jh:Lcom/bytedance/sdk/openadsdk/TTCustomController;

    .line 18
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->jh(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;)I

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->r:I

    .line 19
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->r(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;)I

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->q:I

    .line 20
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->t(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;)I

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->t:I

    .line 21
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->q(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->j:Z

    .line 22
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->j(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;)Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->d:Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;

    .line 23
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->d(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getAgeGroup()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->q:I

    return v0
.end method

.method public getAppId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->vv:Ljava/lang/String;

    return-object v0
.end method

.method public getAppName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->m:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomController()Lcom/bytedance/sdk/openadsdk/TTCustomController;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->jh:Lcom/bytedance/sdk/openadsdk/TTCustomController;

    return-object v0
.end method

.method public getData()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->o:Ljava/lang/String;

    return-object v0
.end method

.method public getDirectDownloadNetworkType()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->wv:[I

    return-object v0
.end method

.method public getExtra(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->b:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getInitExtra()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->b:Ljava/util/Map;

    return-object v0
.end method

.method public getKeywords()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->i:Ljava/lang/String;

    return-object v0
.end method

.method public getMediationConfig()Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->d:Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;

    return-object v0
.end method

.method public getPluginUpdateConfig()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->t:I

    return v0
.end method

.method public getThemeStatus()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->r:I

    return v0
.end method

.method public getTitleBarTheme()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->u:I

    return v0
.end method

.method public isAllowShowNotify()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->n:Z

    return v0
.end method

.method public isDebug()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->qv:Z

    return v0
.end method

.method public isPaid()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->p:Z

    return v0
.end method

.method public isSupportMultiProcess()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->k:Z

    return v0
.end method

.method public isUseMediation()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->j:Z

    return v0
.end method

.method public setAgeGroup(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->q:I

    return-void
.end method

.method public setAllowShowNotify(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->n:Z

    return-void
.end method

.method public setAppId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->vv:Ljava/lang/String;

    return-void
.end method

.method public setAppName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->m:Ljava/lang/String;

    return-void
.end method

.method public setCustomController(Lcom/bytedance/sdk/openadsdk/TTCustomController;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->jh:Lcom/bytedance/sdk/openadsdk/TTCustomController;

    return-void
.end method

.method public setData(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->o:Ljava/lang/String;

    return-void
.end method

.method public setDebug(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->qv:Z

    return-void
.end method

.method public varargs setDirectDownloadNetworkType([I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->wv:[I

    return-void
.end method

.method public setKeywords(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->i:Ljava/lang/String;

    return-void
.end method

.method public setPaid(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->p:Z

    return-void
.end method

.method public setSupportMultiProcess(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->k:Z

    return-void
.end method

.method public setThemeStatus(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->r:I

    return-void
.end method

.method public setTitleBarTheme(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/CSJConfig;->u:I

    return-void
.end method
