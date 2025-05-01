.class public Lcom/ss/android/download/api/model/p;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/download/api/model/p$vv;
    }
.end annotation


# instance fields
.field private final b:I

.field private final i:Z

.field private final j:Lorg/json/JSONObject;

.field private final jh:Ljava/lang/Object;

.field private final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Ljava/lang/String;

.field private final n:J

.field private final o:J

.field private final p:Ljava/lang/String;

.field private final q:Ljava/lang/String;

.field private final qv:Lorg/json/JSONObject;

.field private final r:Ljava/lang/String;

.field private final t:Z

.field private final u:Ljava/lang/String;

.field private vv:Ljava/lang/String;

.field private final wv:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lcom/ss/android/download/api/model/p$vv;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lcom/ss/android/download/api/model/p$vv;->vv(Lcom/ss/android/download/api/model/p$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/p;->vv:Ljava/lang/String;

    .line 3
    invoke-static {p1}, Lcom/ss/android/download/api/model/p$vv;->m(Lcom/ss/android/download/api/model/p$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/p;->m:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/ss/android/download/api/model/p$vv;->p(Lcom/ss/android/download/api/model/p$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/p;->p:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Lcom/ss/android/download/api/model/p$vv;->i(Lcom/ss/android/download/api/model/p$vv;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ss/android/download/api/model/p;->i:Z

    .line 6
    invoke-static {p1}, Lcom/ss/android/download/api/model/p$vv;->o(Lcom/ss/android/download/api/model/p$vv;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/download/api/model/p;->o:J

    .line 7
    invoke-static {p1}, Lcom/ss/android/download/api/model/p$vv;->u(Lcom/ss/android/download/api/model/p$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/p;->u:Ljava/lang/String;

    .line 8
    invoke-static {p1}, Lcom/ss/android/download/api/model/p$vv;->n(Lcom/ss/android/download/api/model/p$vv;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/download/api/model/p;->n:J

    .line 9
    invoke-static {p1}, Lcom/ss/android/download/api/model/p$vv;->qv(Lcom/ss/android/download/api/model/p$vv;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/p;->qv:Lorg/json/JSONObject;

    .line 10
    invoke-static {p1}, Lcom/ss/android/download/api/model/p$vv;->wv(Lcom/ss/android/download/api/model/p$vv;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/p;->wv:Lorg/json/JSONObject;

    .line 11
    invoke-static {p1}, Lcom/ss/android/download/api/model/p$vv;->k(Lcom/ss/android/download/api/model/p$vv;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/p;->k:Ljava/util/List;

    .line 12
    invoke-static {p1}, Lcom/ss/android/download/api/model/p$vv;->b(Lcom/ss/android/download/api/model/p$vv;)I

    move-result v0

    iput v0, p0, Lcom/ss/android/download/api/model/p;->b:I

    .line 13
    invoke-static {p1}, Lcom/ss/android/download/api/model/p$vv;->jh(Lcom/ss/android/download/api/model/p$vv;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/p;->jh:Ljava/lang/Object;

    .line 14
    invoke-static {p1}, Lcom/ss/android/download/api/model/p$vv;->r(Lcom/ss/android/download/api/model/p$vv;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ss/android/download/api/model/p;->t:Z

    .line 15
    invoke-static {p1}, Lcom/ss/android/download/api/model/p$vv;->t(Lcom/ss/android/download/api/model/p$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/p;->q:Ljava/lang/String;

    .line 16
    invoke-static {p1}, Lcom/ss/android/download/api/model/p$vv;->q(Lcom/ss/android/download/api/model/p$vv;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/p;->j:Lorg/json/JSONObject;

    .line 17
    invoke-static {p1}, Lcom/ss/android/download/api/model/p$vv;->j(Lcom/ss/android/download/api/model/p$vv;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/download/api/model/p;->r:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/download/api/model/p;->b:I

    return v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/download/api/model/p;->i:Z

    return v0
.end method

.method public jh()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/model/p;->jh:Ljava/lang/Object;

    return-object v0
.end method

.method public k()Ljava/util/List;
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
    iget-object v0, p0, Lcom/ss/android/download/api/model/p;->k:Ljava/util/List;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/model/p;->m:Ljava/lang/String;

    return-object v0
.end method

.method public n()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/download/api/model/p;->n:J

    return-wide v0
.end method

.method public o()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/download/api/model/p;->o:J

    return-wide v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/model/p;->p:Ljava/lang/String;

    return-object v0
.end method

.method public q()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/model/p;->j:Lorg/json/JSONObject;

    return-object v0
.end method

.method public qv()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/model/p;->qv:Lorg/json/JSONObject;

    return-object v0
.end method

.method public r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/download/api/model/p;->t:Z

    return v0
.end method

.method public t()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/model/p;->q:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "category: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/ss/android/download/api/model/p;->vv:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\ttag: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ss/android/download/api/model/p;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\tlabel: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ss/android/download/api/model/p;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nisAd: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ss/android/download/api/model/p;->i:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\tadId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ss/android/download/api/model/p;->o:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "\tlogExtra: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ss/android/download/api/model/p;->u:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\textValue: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ss/android/download/api/model/p;->n:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "\nextJson: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ss/android/download/api/model/p;->qv:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\nparamsJson: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ss/android/download/api/model/p;->wv:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\nclickTrackUrl: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ss/android/download/api/model/p;->k:Ljava/util/List;

    const-string v2, ""

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\teventSource: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ss/android/download/api/model/p;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\textraObject: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ss/android/download/api/model/p;->jh:Ljava/lang/Object;

    if-eqz v1, :cond_1

    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nisV3: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ss/android/download/api/model/p;->t:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\tV3EventName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ss/android/download/api/model/p;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\tV3EventParams: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ss/android/download/api/model/p;->j:Lorg/json/JSONObject;

    if-eqz v1, :cond_2

    .line 4
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/model/p;->u:Ljava/lang/String;

    return-object v0
.end method

.method public vv()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/model/p;->vv:Ljava/lang/String;

    return-object v0
.end method

.method public wv()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/model/p;->wv:Lorg/json/JSONObject;

    return-object v0
.end method
