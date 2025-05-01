.class public Lcom/ss/android/download/api/download/p;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/download/api/download/DownloadEventConfig;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/download/api/download/p$vv;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private b:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private jh:Ljava/lang/Object;

.field private k:Ljava/lang/String;

.field private m:Z

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Z

.field private qv:Ljava/lang/String;

.field private r:Z

.field private t:Z

.field private u:Ljava/lang/String;

.field private vv:Ljava/lang/String;

.field private wv:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/ss/android/download/api/download/p$vv;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-static {p1}, Lcom/ss/android/download/api/download/p$vv;->vv(Lcom/ss/android/download/api/download/p$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/download/p;->vv:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Lcom/ss/android/download/api/download/p$vv;->m(Lcom/ss/android/download/api/download/p$vv;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ss/android/download/api/download/p;->m:Z

    .line 6
    invoke-static {p1}, Lcom/ss/android/download/api/download/p$vv;->p(Lcom/ss/android/download/api/download/p$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/download/p;->p:Ljava/lang/String;

    .line 7
    invoke-static {p1}, Lcom/ss/android/download/api/download/p$vv;->i(Lcom/ss/android/download/api/download/p$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/download/p;->i:Ljava/lang/String;

    .line 8
    invoke-static {p1}, Lcom/ss/android/download/api/download/p$vv;->o(Lcom/ss/android/download/api/download/p$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/download/p;->o:Ljava/lang/String;

    .line 9
    invoke-static {p1}, Lcom/ss/android/download/api/download/p$vv;->u(Lcom/ss/android/download/api/download/p$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/download/p;->u:Ljava/lang/String;

    .line 10
    invoke-static {p1}, Lcom/ss/android/download/api/download/p$vv;->n(Lcom/ss/android/download/api/download/p$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/download/p;->n:Ljava/lang/String;

    .line 11
    invoke-static {p1}, Lcom/ss/android/download/api/download/p$vv;->qv(Lcom/ss/android/download/api/download/p$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/download/p;->qv:Ljava/lang/String;

    .line 12
    invoke-static {p1}, Lcom/ss/android/download/api/download/p$vv;->wv(Lcom/ss/android/download/api/download/p$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/download/p;->wv:Ljava/lang/String;

    .line 13
    invoke-static {p1}, Lcom/ss/android/download/api/download/p$vv;->k(Lcom/ss/android/download/api/download/p$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/download/p;->k:Ljava/lang/String;

    .line 14
    invoke-static {p1}, Lcom/ss/android/download/api/download/p$vv;->b(Lcom/ss/android/download/api/download/p$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/download/p;->b:Ljava/lang/String;

    .line 15
    invoke-static {p1}, Lcom/ss/android/download/api/download/p$vv;->jh(Lcom/ss/android/download/api/download/p$vv;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/download/p;->jh:Ljava/lang/Object;

    .line 16
    invoke-static {p1}, Lcom/ss/android/download/api/download/p$vv;->r(Lcom/ss/android/download/api/download/p$vv;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ss/android/download/api/download/p;->r:Z

    .line 17
    invoke-static {p1}, Lcom/ss/android/download/api/download/p$vv;->t(Lcom/ss/android/download/api/download/p$vv;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ss/android/download/api/download/p;->t:Z

    .line 18
    invoke-static {p1}, Lcom/ss/android/download/api/download/p$vv;->q(Lcom/ss/android/download/api/download/p$vv;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ss/android/download/api/download/p;->q:Z

    .line 19
    invoke-static {p1}, Lcom/ss/android/download/api/download/p$vv;->j(Lcom/ss/android/download/api/download/p$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/download/p;->j:Ljava/lang/String;

    .line 20
    invoke-static {p1}, Lcom/ss/android/download/api/download/p$vv;->d(Lcom/ss/android/download/api/download/p$vv;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/download/api/download/p;->d:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ss/android/download/api/download/p$vv;Lcom/ss/android/download/api/download/p$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/ss/android/download/api/download/p;-><init>(Lcom/ss/android/download/api/download/p$vv;)V

    return-void
.end method


# virtual methods
.method public getClickButtonTag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/download/p;->vv:Ljava/lang/String;

    return-object v0
.end method

.method public getClickContinueLabel()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/download/p;->u:Ljava/lang/String;

    return-object v0
.end method

.method public getClickInstallLabel()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/download/p;->n:Ljava/lang/String;

    return-object v0
.end method

.method public getClickItemTag()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getClickLabel()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/download/p;->p:Ljava/lang/String;

    return-object v0
.end method

.method public getClickPauseLabel()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/download/p;->o:Ljava/lang/String;

    return-object v0
.end method

.method public getClickStartLabel()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/download/p;->i:Ljava/lang/String;

    return-object v0
.end method

.method public getDownloadScene()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getExtraEventObject()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/download/p;->jh:Ljava/lang/Object;

    return-object v0
.end method

.method public getExtraJson()Lorg/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getParamsJson()Lorg/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getRefer()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/download/p;->d:Ljava/lang/String;

    return-object v0
.end method

.method public getStorageDenyLabel()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/download/p;->k:Ljava/lang/String;

    return-object v0
.end method

.method public isEnableClickEvent()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/download/api/download/p;->m:Z

    return v0
.end method

.method public isEnableV3Event()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/download/api/download/p;->r:Z

    return v0
.end method

.method public setDownloadScene(I)V
    .locals 0

    return-void
.end method

.method public setRefer(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
