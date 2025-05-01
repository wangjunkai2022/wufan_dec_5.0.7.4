.class final Lcom/kwad/sdk/h/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/h/b;


# instance fields
.field public aKI:Lorg/json/JSONObject;

.field public actionId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/h/i;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/h/k;->aKI:Lorg/json/JSONObject;

    .line 3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/h/k;->actionId:Ljava/lang/String;

    .line 4
    invoke-static {}, Lcom/kwad/sdk/h/h;->JN()Lcom/kwad/sdk/h/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/h/h;->JR()Lcom/kwad/sdk/h/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/h/g;->JJ()Lorg/json/JSONObject;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 6
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 7
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/kwad/sdk/h/c;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/h/k;->aKI:Lorg/json/JSONObject;

    const-string v1, "customKey"

    invoke-static {v0, v1, p1}, Lcom/kwad/sdk/h/c;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lcom/kwad/sdk/h/k;->aKI:Lorg/json/JSONObject;

    const-string v0, "customValue"

    invoke-static {p1, v0, p2}, Lcom/kwad/sdk/h/c;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Lcom/kwad/sdk/h/k;->aKI:Lorg/json/JSONObject;

    iget-wide p2, p3, Lcom/kwad/sdk/h/i;->aKF:J

    const-string v0, "timestamp"

    invoke-static {p1, v0, p2, p3}, Lcom/kwad/sdk/h/c;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 11
    iget-object p1, p0, Lcom/kwad/sdk/h/k;->aKI:Lorg/json/JSONObject;

    iget-object p2, p0, Lcom/kwad/sdk/h/k;->actionId:Ljava/lang/String;

    const-string p3, "actionId"

    invoke-static {p1, p3, p2}, Lcom/kwad/sdk/h/c;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final toJson()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/k;->aKI:Lorg/json/JSONObject;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/k;->aKI:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
