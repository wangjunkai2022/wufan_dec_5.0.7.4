.class public abstract Lcom/kwad/components/ad/reward/l/b;
.super Ljava/util/Observable;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/reward/l/c;
.implements Lcom/kwad/sdk/core/b;


# instance fields
.field private xD:Z

.field protected xE:Ljava/lang/String;

.field protected xF:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/Observable;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/l/b;->xD:Z

    return-void
.end method

.method private jx()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/l/b;->xD:Z

    return v0
.end method

.method private jy()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/util/Observable;->setChanged()V

    .line 2
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/l/b;->xD:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/Observable;->notifyObservers(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public isCompleted()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/l/b;->jx()Z

    move-result v0

    return v0
.end method

.method public final jt()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/l/b;->xD:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/l/b;->xD:Z

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/l/b;->jy()V

    :cond_0
    return-void
.end method

.method public final ju()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/l/b;->xD:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/l/b;->xD:Z

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/l/b;->jy()V

    :cond_0
    return-void
.end method

.method public final jv()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/l/b;->xE:Ljava/lang/String;

    return-object v0
.end method

.method public final jw()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/l/b;->xF:Ljava/lang/String;

    return-object v0
.end method

.method public parseJson(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    :try_start_0
    const-string v0, "selfCompleted"

    .line 1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/l/b;->xD:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    iget-boolean v1, p0, Lcom/kwad/components/ad/reward/l/b;->xD:Z

    const-string v2, "selfCompleted"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Z)V

    return-object v0
.end method
