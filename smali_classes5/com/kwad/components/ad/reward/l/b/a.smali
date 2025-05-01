.class public final Lcom/kwad/components/ad/reward/l/b/a;
.super Lcom/kwad/components/ad/reward/l/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/reward/l/b/a$b;,
        Lcom/kwad/components/ad/reward/l/b/a$a;,
        Lcom/kwad/components/ad/reward/l/b/a$c;
    }
.end annotation


# instance fields
.field private xI:Lcom/kwad/components/ad/reward/l/b/a$c;

.field private xJ:Lcom/kwad/components/ad/reward/l/b/a$a;

.field private final xK:Lcom/kwad/components/ad/reward/l/b/a$b;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/l/a;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/ad/reward/l/b/a$c;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/l/b/a$c;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/l/b/a;->xI:Lcom/kwad/components/ad/reward/l/b/a$c;

    .line 3
    new-instance v0, Lcom/kwad/components/ad/reward/l/b/a$a;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/l/b/a$a;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/l/b/a;->xJ:Lcom/kwad/components/ad/reward/l/b/a$a;

    .line 4
    new-instance v0, Lcom/kwad/components/ad/reward/l/b/a$b;

    invoke-static {}, Lcom/kwad/components/ad/reward/a/b;->gs()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/kwad/components/ad/reward/l/b/a$b;-><init>(I)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/l/b/a;->xK:Lcom/kwad/components/ad/reward/l/b/a$b;

    return-void
.end method

.method public static a(Lcom/kwad/components/ad/reward/l/b/a;Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 0

    .line 1
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p2

    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->ax(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p2

    .line 2
    invoke-static {p1, p2}, Lcom/kwad/sdk/utils/al;->an(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/l/b/a;->jE()V

    return-void

    .line 4
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/l/b/a;->jF()V

    return-void
.end method

.method private jD()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/l/b/a;->xI:Lcom/kwad/components/ad/reward/l/b/a$c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/l/b;->isCompleted()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/reward/l/b/a;->xJ:Lcom/kwad/components/ad/reward/l/b/a$a;

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/l/b;->isCompleted()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/reward/l/b/a;->xK:Lcom/kwad/components/ad/reward/l/b/a$b;

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/l/b;->isCompleted()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/l/b;->jt()V

    return-void

    .line 5
    :cond_1
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/l/b;->ju()V

    return-void
.end method

.method private jF()V
    .locals 2

    const-string v0, "LaunchAppTask"

    const-string v1, "markInstallUncompleted"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/l/b/a;->xJ:Lcom/kwad/components/ad/reward/l/b/a$a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/l/b;->ju()V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/l/b/a;->jD()V

    return-void
.end method


# virtual methods
.method public final isCompleted()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/l/b/a;->xJ:Lcom/kwad/components/ad/reward/l/b/a$a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/l/b;->isCompleted()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/reward/l/b/a;->xK:Lcom/kwad/components/ad/reward/l/b/a$b;

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/l/b;->isCompleted()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final jB()V
    .locals 2

    const-string v0, "LaunchAppTask"

    const-string v1, "markWatchVideoCompleted"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/l/b/a;->xI:Lcom/kwad/components/ad/reward/l/b/a$c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/l/b;->jt()V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/l/b/a;->jD()V

    return-void
.end method

.method public final jC()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/l/b/a;->xI:Lcom/kwad/components/ad/reward/l/b/a$c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/l/b;->isCompleted()Z

    move-result v0

    return v0
.end method

.method public final jE()V
    .locals 2

    const-string v0, "LaunchAppTask"

    const-string v1, "markInstallCompleted"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/l/b/a;->xJ:Lcom/kwad/components/ad/reward/l/b/a$a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/l/b;->jt()V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/l/b/a;->jD()V

    return-void
.end method

.method public final jG()V
    .locals 2

    const-string v0, "LaunchAppTask"

    const-string v1, "markUseAppCompleted"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/l/b/a;->xK:Lcom/kwad/components/ad/reward/l/b/a$b;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/l/b;->jt()V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/l/b/a;->jD()V

    return-void
.end method

.method public final jH()Z
    .locals 2

    const-string v0, "LaunchAppTask"

    const-string v1, "isInstallCompleted"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/l/b/a;->xJ:Lcom/kwad/components/ad/reward/l/b/a$a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/l/b;->isCompleted()Z

    move-result v0

    return v0
.end method

.method public final jr()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kwad/components/ad/reward/l/c;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/reward/l/b/a;->xI:Lcom/kwad/components/ad/reward/l/b/a$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/reward/l/b/a;->xK:Lcom/kwad/components/ad/reward/l/b/a$b;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final js()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/l/b/a;->jr()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/components/ad/reward/l/c;

    .line 3
    invoke-interface {v2}, Lcom/kwad/components/ad/reward/l/c;->isCompleted()Z

    move-result v2

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final parseJson(Lorg/json/JSONObject;)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    :try_start_0
    const-string v0, "mWatchVideoTask"

    .line 1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/reward/l/b/a;->xI:Lcom/kwad/components/ad/reward/l/b/a$c;

    invoke-virtual {v1, v0}, Lcom/kwad/components/ad/reward/l/b;->parseJson(Lorg/json/JSONObject;)V

    const-string v0, "mUseAppTask"

    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/l/b/a;->xK:Lcom/kwad/components/ad/reward/l/b/a$b;

    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/reward/l/b;->parseJson(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public final toJson()Lorg/json/JSONObject;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/reward/l/b/a;->xI:Lcom/kwad/components/ad/reward/l/b/a$c;

    const-string v2, "mWatchVideoTask"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/reward/l/b/a;->xJ:Lcom/kwad/components/ad/reward/l/b/a$a;

    const-string v2, "mInstallAppTask"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/reward/l/b/a;->xK:Lcom/kwad/components/ad/reward/l/b/a$b;

    const-string v2, "mUseAppTask"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    return-object v0
.end method
