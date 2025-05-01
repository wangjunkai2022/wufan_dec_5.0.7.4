.class public Lcom/kwad/sdk/core/adlog/c/a;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public LJ:J

.field public Lg:I

.field public Lh:Ljava/lang/String;

.field public Li:Lcom/kwad/sdk/core/adlog/a$a;

.field public Lj:I

.field public Lk:I

.field public OP:I

.field public adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public adnName:Ljava/lang/String;

.field public adnType:I

.field public adxResult:I

.field public apT:I

.field public aqN:Lorg/json/JSONObject;

.field public aqO:I

.field public aqP:I

.field public aqQ:I

.field public aqR:I

.field public aqS:Ljava/lang/String;

.field public aqT:J

.field public aqU:I

.field public aqV:J

.field public aqW:I

.field public aqX:I

.field public aqY:Ljava/lang/String;

.field public aqZ:I

.field public ara:I

.field public arb:Ljava/lang/String;

.field public arc:Ljava/lang/String;

.field public ard:I

.field public are:I

.field public arf:Ljava/lang/String;

.field public arg:Ljava/lang/String;

.field public arh:I

.field public ari:I

.field public arj:J

.field public ark:J

.field public arl:I

.field public arm:I

.field public arn:I

.field public aro:I

.field public arp:I

.field public arq:Ljava/lang/String;

.field public arr:I

.field public ars:I

.field public art:I

.field public aru:I

.field public arv:I

.field public arw:Ljava/lang/String;

.field public downloadSource:I

.field public downloadStatus:I

.field public kl:I

.field public kn:Lcom/kwad/sdk/utils/ac$a;

.field public ko:D

.field public vA:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqT:J

    const/4 v2, -0x1

    .line 3
    iput v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqU:I

    .line 4
    iput-wide v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqV:J

    .line 5
    iput v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqW:I

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->Lj:I

    const-string v1, ""

    .line 7
    iput-object v1, p0, Lcom/kwad/sdk/core/adlog/c/a;->arb:Ljava/lang/String;

    .line 8
    iput v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->arl:I

    .line 9
    iput v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->arm:I

    .line 10
    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->downloadStatus:I

    .line 11
    iput v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->arp:I

    .line 12
    iput v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->Lg:I

    .line 13
    iput v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->arr:I

    .line 14
    iput v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->adxResult:I

    .line 15
    iput v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->Lk:I

    .line 16
    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arv:I

    return-void
.end method

.method public static BZ()Lcom/kwad/sdk/core/adlog/c/a;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/adlog/c/a;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/c/a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/core/adlog/a$a;)Lcom/kwad/sdk/core/adlog/c/a;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/core/adlog/c/a;->Li:Lcom/kwad/sdk/core/adlog/a$a;

    return-object p0
.end method

.method public final a(Lcom/kwad/sdk/core/report/h;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/core/report/h;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Lcom/kwad/sdk/core/report/h;->Fv()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/core/adlog/c/a;->arw:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public final am(J)Lcom/kwad/sdk/core/adlog/c/a;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/core/adlog/c/a;->vA:J

    return-object p0
.end method

.method public final an(J)Lcom/kwad/sdk/core/adlog/c/a;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/core/adlog/c/a;->LJ:J

    return-object p0
.end method

.method public final cD(I)V
    .locals 2

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    const/4 v1, 0x2

    if-eq p1, v0, :cond_1

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/adlog/c/a;->art:I

    :goto_0
    return-void

    .line 2
    :cond_1
    iput v1, p0, Lcom/kwad/sdk/core/adlog/c/a;->art:I

    return-void

    .line 3
    :cond_2
    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->art:I

    return-void
.end method

.method public final cE(I)Lcom/kwad/sdk/core/adlog/c/a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/adlog/c/a;->kl:I

    return-object p0
.end method

.method public final cF(I)Lcom/kwad/sdk/core/adlog/c/a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/adlog/c/a;->Lj:I

    return-object p0
.end method

.method public final cG(I)Lcom/kwad/sdk/core/adlog/c/a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/adlog/c/a;->Lk:I

    return-object p0
.end method

.method public final cH(I)Lcom/kwad/sdk/core/adlog/c/a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/adlog/c/a;->Lg:I

    return-object p0
.end method

.method public final cI(I)Lcom/kwad/sdk/core/adlog/c/a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/adlog/c/a;->OP:I

    return-object p0
.end method

.method public final cJ(I)Lcom/kwad/sdk/core/adlog/c/a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/adlog/c/a;->ard:I

    return-object p0
.end method

.method public final dl(Ljava/lang/String;)Lcom/kwad/sdk/core/adlog/c/a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/adlog/c/a;->Lh:Ljava/lang/String;

    return-object p0
.end method

.method public final e(Lcom/kwad/sdk/utils/ac$a;)Lcom/kwad/sdk/core/adlog/c/a;
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/kwad/sdk/core/adlog/c/a;->kn:Lcom/kwad/sdk/utils/ac$a;

    return-object p0
.end method

.method public final e(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/kwad/sdk/core/adlog/c/a;->Li:Lcom/kwad/sdk/core/adlog/a$a;

    const/4 p3, 0x0

    if-nez p2, :cond_0

    .line 2
    new-instance p2, Lcom/kwad/sdk/core/adlog/a$a;

    invoke-direct {p2}, Lcom/kwad/sdk/core/adlog/a$a;-><init>()V

    iput-object p2, p0, Lcom/kwad/sdk/core/adlog/c/a;->Li:Lcom/kwad/sdk/core/adlog/a$a;

    .line 3
    invoke-virtual {p2, p1, p3, p3, p3}, Lcom/kwad/sdk/core/adlog/a$a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/f/a;)Lcom/kwad/sdk/core/track/AdTrackLog;

    return-void

    .line 4
    :cond_0
    iget-object v0, p2, Lcom/kwad/sdk/core/adlog/a$a;->aqq:Lcom/kwad/sdk/core/track/AdTrackLog;

    if-nez v0, :cond_1

    .line 5
    invoke-virtual {p2, p1, p3, p3, p3}, Lcom/kwad/sdk/core/adlog/a$a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/f/a;)Lcom/kwad/sdk/core/track/AdTrackLog;

    :cond_1
    return-void
.end method
