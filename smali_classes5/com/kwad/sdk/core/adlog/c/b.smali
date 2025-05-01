.class public final Lcom/kwad/sdk/core/adlog/c/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final arx:Lcom/kwad/sdk/core/adlog/c/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/sdk/core/adlog/c/a;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/c/a;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    return-void
.end method


# virtual methods
.method public final Ca()Lcom/kwad/sdk/core/adlog/c/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    return-object v0
.end method

.method public final ao(J)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput-wide p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->vA:J

    return-object p0
.end method

.method public final b(Lcom/kwad/sdk/core/adlog/a$a;)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput-object p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->Li:Lcom/kwad/sdk/core/adlog/a$a;

    return-object p0
.end method

.method public final b(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/f/a;)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/sdk/core/response/model/AdTemplate;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/kwad/sdk/f/a<",
            "Lcom/kwad/sdk/core/track/AdTrackLog;",
            ">;)",
            "Lcom/kwad/sdk/core/adlog/c/b;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iget-object v1, v0, Lcom/kwad/sdk/core/adlog/c/a;->Li:Lcom/kwad/sdk/core/adlog/a$a;

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Lcom/kwad/sdk/core/adlog/a$a;

    invoke-direct {v1}, Lcom/kwad/sdk/core/adlog/a$a;-><init>()V

    iput-object v1, v0, Lcom/kwad/sdk/core/adlog/c/a;->Li:Lcom/kwad/sdk/core/adlog/a$a;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iget-object v0, v0, Lcom/kwad/sdk/core/adlog/c/a;->Li:Lcom/kwad/sdk/core/adlog/a$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/kwad/sdk/core/adlog/a$a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/f/a;)Lcom/kwad/sdk/core/track/AdTrackLog;

    return-object p0
.end method

.method public final cK(I)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->kl:I

    return-object p0
.end method

.method public final cL(I)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->aqQ:I

    return-object p0
.end method

.method public final cM(I)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->aqR:I

    return-object p0
.end method

.method public final cN(I)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->downloadSource:I

    return-object p0
.end method

.method public final cO(I)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->are:I

    return-object p0
.end method

.method public final cP(I)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->arh:I

    return-object p0
.end method

.method public final cQ(I)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->ari:I

    return-object p0
.end method

.method public final cR(I)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->aqW:I

    return-object p0
.end method

.method public final cS(I)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->aro:I

    return-object p0
.end method

.method public final cT(I)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->ars:I

    return-object p0
.end method

.method public final cU(I)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    invoke-virtual {v0, p1}, Lcom/kwad/sdk/core/adlog/c/a;->cD(I)V

    return-object p0
.end method

.method public final cV(I)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->aru:I

    return-object p0
.end method

.method public final cW(I)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->Lk:I

    return-object p0
.end method

.method public final cX(I)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->arv:I

    return-object p0
.end method

.method public final cY(I)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->Lj:I

    return-object p0
.end method

.method public final dm(Ljava/lang/String;)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput-object p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->Lh:Ljava/lang/String;

    return-object p0
.end method

.method public final dn(Ljava/lang/String;)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput-object p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->arf:Ljava/lang/String;

    return-object p0
.end method

.method public final do(Ljava/lang/String;)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput-object p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->arg:Ljava/lang/String;

    return-object p0
.end method

.method public final dp(Ljava/lang/String;)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput-object p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->arq:Ljava/lang/String;

    return-object p0
.end method

.method public final f(Lcom/kwad/sdk/utils/ac$a;)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput-object p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->kn:Lcom/kwad/sdk/utils/ac$a;

    return-object p0
.end method

.method public final l(D)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    iput-wide p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->ko:D

    return-object p0
.end method

.method public final v(II)Lcom/kwad/sdk/core/adlog/c/b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/b;->arx:Lcom/kwad/sdk/core/adlog/c/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ","

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/kwad/sdk/core/adlog/c/a;->aqS:Ljava/lang/String;

    return-object p0
.end method
