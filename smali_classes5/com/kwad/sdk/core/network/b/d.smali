.class public final Lcom/kwad/sdk/core/network/b/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/network/b/b;


# static fields
.field private static aya:Z = true

.field public static ayb:D = 1.0

.field private static volatile ayf:Z = false

.field private static ayg:Ljava/lang/String; = ""


# instance fields
.field private ayc:J

.field private ayd:J

.field private aye:J

.field private ayh:Lcom/kwad/sdk/core/network/j;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayc:J

    .line 3
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayd:J

    .line 4
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/b/d;->aye:J

    .line 5
    new-instance v0, Lcom/kwad/sdk/core/network/j;

    invoke-direct {v0}, Lcom/kwad/sdk/core/network/j;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    .line 6
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0}, Ljava/util/Random;->nextDouble()D

    move-result-wide v0

    sput-wide v0, Lcom/kwad/sdk/core/network/b/d;->ayb:D

    return-void
.end method

.method private EU()Lcom/kwad/sdk/core/network/b/d;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/kwad/sdk/core/network/j;->axl:J

    return-object p0
.end method

.method private EV()Lcom/kwad/sdk/core/network/b/d;
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayd:J

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "this.responseReceiveTime:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/kwad/sdk/core/network/b/d;->ayd:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/network/b/d;->em(Ljava/lang/String;)V

    return-object p0
.end method

.method private EW()Lcom/kwad/sdk/core/network/b/d;
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayc:J

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/network/b/d;->as(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayd:J

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/network/b/d;->as(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iget-wide v1, p0, Lcom/kwad/sdk/core/network/b/d;->ayd:J

    iget-wide v3, p0, Lcom/kwad/sdk/core/network/b/d;->ayc:J

    sub-long/2addr v1, v3

    iput-wide v1, v0, Lcom/kwad/sdk/core/network/j;->axs:J

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "info.waiting_response_cost:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iget-wide v1, v1, Lcom/kwad/sdk/core/network/j;->axs:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/network/b/d;->em(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method private EX()Lcom/kwad/sdk/core/network/b/d;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iget-wide v0, v0, Lcom/kwad/sdk/core/network/j;->axl:J

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/network/b/d;->as(J)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayc:J

    .line 3
    iget-object v2, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iget-wide v3, v2, Lcom/kwad/sdk/core/network/j;->axl:J

    sub-long/2addr v0, v3

    iput-wide v0, v2, Lcom/kwad/sdk/core/network/j;->axf:J

    .line 4
    iget-wide v0, v2, Lcom/kwad/sdk/core/network/j;->axd:J

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/network/b/d;->as(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iget-wide v1, v0, Lcom/kwad/sdk/core/network/j;->axf:J

    iget-wide v3, v0, Lcom/kwad/sdk/core/network/j;->axd:J

    sub-long/2addr v1, v3

    iput-wide v1, v0, Lcom/kwad/sdk/core/network/j;->axe:J

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "info.request_create_cost:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iget-wide v1, v1, Lcom/kwad/sdk/core/network/j;->axf:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/network/b/d;->em(Ljava/lang/String;)V

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "info.requestAddParamsCost:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iget-wide v1, v1, Lcom/kwad/sdk/core/network/j;->axe:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/network/b/d;->em(Ljava/lang/String;)V

    :cond_1
    return-object p0
.end method

.method private EY()Lcom/kwad/sdk/core/network/b/d;
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayd:J

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/network/b/d;->as(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/b/d;->aye:J

    .line 3
    iget-object v2, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iget-wide v3, p0, Lcom/kwad/sdk/core/network/b/d;->ayd:J

    sub-long/2addr v0, v3

    iput-wide v0, v2, Lcom/kwad/sdk/core/network/j;->axq:J

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "info.response_parse_cost:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iget-wide v1, v1, Lcom/kwad/sdk/core/network/j;->axq:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/network/b/d;->em(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method private EZ()Lcom/kwad/sdk/core/network/b/d;
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/b/d;->aye:J

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/network/b/d;->as(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/kwad/sdk/core/network/b/d;->aye:J

    sub-long/2addr v1, v3

    iput-wide v1, v0, Lcom/kwad/sdk/core/network/j;->axx:J

    .line 3
    invoke-direct {p0}, Lcom/kwad/sdk/core/network/b/d;->Fa()V

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "info.response_done_cost:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iget-wide v1, v1, Lcom/kwad/sdk/core/network/j;->axx:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/network/b/d;->em(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method private Fa()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    if-eqz v0, :cond_0

    iget v1, v0, Lcom/kwad/sdk/core/network/j;->axw:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 2
    iget-wide v0, v0, Lcom/kwad/sdk/core/network/j;->axx:J

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/network/b/d;->av(J)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    const-wide/16 v1, -0x1

    iput-wide v1, v0, Lcom/kwad/sdk/core/network/j;->axx:J

    :cond_0
    return-void
.end method

.method private Fb()Lcom/kwad/sdk/core/network/b/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->Ji()F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Lcom/kwad/sdk/core/network/j;->axA:I

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->Jj()F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Lcom/kwad/sdk/core/network/j;->axB:I

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->Jk()F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Lcom/kwad/sdk/core/network/j;->axC:I

    return-object p0
.end method

.method private Fc()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    invoke-static {v0}, Lcom/kwad/sdk/core/network/b/d;->c(Lcom/kwad/sdk/core/network/j;)Lcom/kwad/sdk/core/network/i;

    move-result-object v0

    .line 2
    const-class v1, Lcom/kwad/sdk/core/network/k;

    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/core/network/k;

    if-eqz v1, :cond_0

    .line 3
    invoke-interface {v1, v0}, Lcom/kwad/sdk/core/network/k;->a(Lcom/kwad/sdk/core/network/i;)V

    .line 4
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "reportError"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NetworkMonitorRecorder"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static as(J)Z
    .locals 3

    const-wide/16 v0, -0x1

    cmp-long v2, p0, v0

    if-eqz v2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private at(J)Lcom/kwad/sdk/core/network/b/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iput-wide p1, v0, Lcom/kwad/sdk/core/network/j;->axr:J

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "responseSize:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/core/network/b/d;->em(Ljava/lang/String;)V

    return-object p0
.end method

.method private au(J)Lcom/kwad/sdk/core/network/b/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iput-wide p1, v0, Lcom/kwad/sdk/core/network/j;->axt:J

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "totalCost:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/core/network/b/d;->em(Ljava/lang/String;)V

    return-object p0
.end method

.method private static av(J)Z
    .locals 3

    const-wide/16 v0, 0x32

    cmp-long v2, p0, v0

    if-ltz v2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static c(Lcom/kwad/sdk/core/network/j;)Lcom/kwad/sdk/core/network/i;
    .locals 2

    .line 4
    new-instance v0, Lcom/kwad/sdk/core/network/i;

    invoke-direct {v0}, Lcom/kwad/sdk/core/network/i;-><init>()V

    .line 5
    iget-object v1, p0, Lcom/kwad/sdk/commercial/c/a;->errorMsg:Ljava/lang/String;

    iput-object v1, v0, Lcom/kwad/sdk/commercial/c/a;->errorMsg:Ljava/lang/String;

    .line 6
    iget-object v1, p0, Lcom/kwad/sdk/core/network/i;->host:Ljava/lang/String;

    iput-object v1, v0, Lcom/kwad/sdk/core/network/i;->host:Ljava/lang/String;

    .line 7
    iget v1, p0, Lcom/kwad/sdk/core/network/i;->httpCode:I

    iput v1, v0, Lcom/kwad/sdk/core/network/i;->httpCode:I

    .line 8
    iget-object v1, p0, Lcom/kwad/sdk/core/network/i;->axb:Ljava/lang/String;

    iput-object v1, v0, Lcom/kwad/sdk/core/network/i;->axb:Ljava/lang/String;

    .line 9
    iget-object v1, p0, Lcom/kwad/sdk/core/network/i;->url:Ljava/lang/String;

    iput-object v1, v0, Lcom/kwad/sdk/core/network/i;->url:Ljava/lang/String;

    .line 10
    iget p0, p0, Lcom/kwad/sdk/core/network/i;->axc:I

    iput p0, v0, Lcom/kwad/sdk/core/network/i;->axc:I

    return-object v0
.end method

.method private static c(Lcom/kwad/sdk/core/network/i;)Z
    .locals 2
    .param p0    # Lcom/kwad/sdk/core/network/i;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/i;->url:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object p0, p0, Lcom/kwad/sdk/core/network/i;->url:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    const-string v0, "beta"

    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "test"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "staging"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_0
    return v1
.end method

.method private dj(I)Lcom/kwad/sdk/core/network/b/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iput p1, v0, Lcom/kwad/sdk/core/network/i;->httpCode:I

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "http_code:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/core/network/b/d;->em(Ljava/lang/String;)V

    return-object p0
.end method

.method private dk(I)Lcom/kwad/sdk/core/network/b/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iput p1, v0, Lcom/kwad/sdk/core/network/j;->axw:I

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "hasData:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/core/network/b/d;->em(Ljava/lang/String;)V

    return-object p0
.end method

.method private dl(I)Lcom/kwad/sdk/core/network/b/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iput p1, v0, Lcom/kwad/sdk/core/network/j;->result:I

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "result:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/core/network/b/d;->em(Ljava/lang/String;)V

    return-object p0
.end method

.method private static em(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/kwad/sdk/core/network/b/d;->aya:Z

    if-eqz v0, :cond_0

    const-string v0, "NetworkMonitorRecorder"

    .line 2
    invoke-static {v0, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private en(Ljava/lang/String;)Lcom/kwad/sdk/core/network/b/d;
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iput-object p1, v0, Lcom/kwad/sdk/core/network/i;->url:Ljava/lang/String;

    const-string v0, "?"

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "\\?"

    .line 4
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 5
    array-length v1, v0

    if-lez v1, :cond_1

    const/4 p1, 0x0

    .line 6
    aget-object p1, v0, p1

    .line 7
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "url:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/core/network/b/d;->em(Ljava/lang/String;)V

    :cond_2
    return-object p0
.end method

.method private eo(Ljava/lang/String;)Lcom/kwad/sdk/core/network/b/d;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/kwad/sdk/core/network/i;->host:Ljava/lang/String;

    .line 3
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "host:"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iget-object v0, v0, Lcom/kwad/sdk/core/network/i;->host:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/core/network/b/d;->em(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "NetworkMonitorRecorder"

    invoke-static {v0, p1}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object p0
.end method

.method private ep(Ljava/lang/String;)Lcom/kwad/sdk/core/network/b/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iput-object p1, v0, Lcom/kwad/sdk/commercial/c/a;->errorMsg:Ljava/lang/String;

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/core/network/b/d;->em(Ljava/lang/String;)V

    return-object p0
.end method

.method private eq(Ljava/lang/String;)Lcom/kwad/sdk/core/network/b/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iput-object p1, v0, Lcom/kwad/sdk/core/network/i;->axb:Ljava/lang/String;

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "reqType:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/core/network/b/d;->em(Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->Jh()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/network/b/d;->es(Ljava/lang/String;)Lcom/kwad/sdk/core/network/b/d;

    .line 4
    invoke-direct {p0}, Lcom/kwad/sdk/core/network/b/d;->Fb()Lcom/kwad/sdk/core/network/b/d;

    return-object p0
.end method

.method private er(Ljava/lang/String;)Lcom/kwad/sdk/core/network/b/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iput-object p1, v0, Lcom/kwad/sdk/core/network/j;->axv:Ljava/lang/String;

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "requestId:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/core/network/b/d;->em(Ljava/lang/String;)V

    return-object p0
.end method

.method private es(Ljava/lang/String;)Lcom/kwad/sdk/core/network/b/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iput-object p1, v0, Lcom/kwad/sdk/core/network/j;->axy:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final synthetic EM()Lcom/kwad/sdk/core/network/b/b;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/network/b/d;->EU()Lcom/kwad/sdk/core/network/b/d;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic EN()Lcom/kwad/sdk/core/network/b/b;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/network/b/d;->EV()Lcom/kwad/sdk/core/network/b/d;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic EO()Lcom/kwad/sdk/core/network/b/b;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/network/b/d;->EW()Lcom/kwad/sdk/core/network/b/d;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic EP()Lcom/kwad/sdk/core/network/b/b;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/network/b/d;->EX()Lcom/kwad/sdk/core/network/b/d;

    move-result-object v0

    return-object v0
.end method

.method public final EQ()Lcom/kwad/sdk/core/network/b/b;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iget-wide v0, v0, Lcom/kwad/sdk/core/network/j;->axl:J

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/network/b/d;->as(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-object v3, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iget-wide v3, v3, Lcom/kwad/sdk/core/network/j;->axl:J

    sub-long/2addr v1, v3

    iput-wide v1, v0, Lcom/kwad/sdk/core/network/j;->axd:J

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "info.request_prepare_cost:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iget-wide v1, v1, Lcom/kwad/sdk/core/network/j;->axd:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/network/b/d;->em(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public final synthetic ER()Lcom/kwad/sdk/core/network/b/b;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/network/b/d;->EY()Lcom/kwad/sdk/core/network/b/d;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ES()Lcom/kwad/sdk/core/network/b/b;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/network/b/d;->EZ()Lcom/kwad/sdk/core/network/b/d;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ar(J)Lcom/kwad/sdk/core/network/b/b;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/core/network/b/d;->at(J)Lcom/kwad/sdk/core/network/b/d;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic df(I)Lcom/kwad/sdk/core/network/b/b;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/network/b/d;->dj(I)Lcom/kwad/sdk/core/network/b/d;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic dg(I)Lcom/kwad/sdk/core/network/b/b;
    .locals 0

    const/4 p1, 0x1

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/network/b/d;->dk(I)Lcom/kwad/sdk/core/network/b/d;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic dh(I)Lcom/kwad/sdk/core/network/b/b;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/network/b/d;->dl(I)Lcom/kwad/sdk/core/network/b/d;

    move-result-object p1

    return-object p1
.end method

.method public final di(I)Lcom/kwad/sdk/core/network/b/b;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iput p1, v0, Lcom/kwad/sdk/core/network/j;->axz:I

    int-to-long v1, p1

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 2
    iput p1, v0, Lcom/kwad/sdk/core/network/i;->axc:I

    :cond_0
    return-object p0
.end method

.method public final synthetic eh(Ljava/lang/String;)Lcom/kwad/sdk/core/network/b/b;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/network/b/d;->en(Ljava/lang/String;)Lcom/kwad/sdk/core/network/b/d;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic ei(Ljava/lang/String;)Lcom/kwad/sdk/core/network/b/b;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/network/b/d;->eo(Ljava/lang/String;)Lcom/kwad/sdk/core/network/b/d;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic ej(Ljava/lang/String;)Lcom/kwad/sdk/core/network/b/b;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/network/b/d;->ep(Ljava/lang/String;)Lcom/kwad/sdk/core/network/b/d;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic ek(Ljava/lang/String;)Lcom/kwad/sdk/core/network/b/b;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/network/b/d;->eq(Ljava/lang/String;)Lcom/kwad/sdk/core/network/b/d;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic el(Ljava/lang/String;)Lcom/kwad/sdk/core/network/b/b;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/network/b/d;->er(Ljava/lang/String;)Lcom/kwad/sdk/core/network/b/d;

    move-result-object p1

    return-object p1
.end method

.method public final report()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    invoke-static {v0}, Lcom/kwad/sdk/core/network/b/d;->c(Lcom/kwad/sdk/core/network/i;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iget v0, v0, Lcom/kwad/sdk/core/network/i;->httpCode:I

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/kwad/sdk/core/network/b/d;->Fc()V

    return-void

    .line 4
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 5
    iget-object v2, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iget-wide v2, v2, Lcom/kwad/sdk/core/network/j;->axl:J

    invoke-static {v2, v3}, Lcom/kwad/sdk/core/network/b/d;->as(J)Z

    move-result v2

    const-wide/16 v3, -0x1

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    iget-wide v5, v2, Lcom/kwad/sdk/core/network/j;->axl:J

    sub-long/2addr v0, v5

    goto :goto_0

    :cond_2
    move-wide v0, v3

    .line 6
    :goto_0
    invoke-direct {p0, v0, v1}, Lcom/kwad/sdk/core/network/b/d;->au(J)Lcom/kwad/sdk/core/network/b/d;

    const-wide/16 v5, 0x7530

    cmp-long v2, v0, v5

    if-gtz v2, :cond_5

    cmp-long v2, v0, v3

    if-gtz v2, :cond_3

    goto :goto_1

    .line 7
    :cond_3
    const-class v0, Lcom/kwad/sdk/core/network/k;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/network/k;

    if-eqz v0, :cond_4

    .line 8
    iget-object v1, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/network/k;->a(Lcom/kwad/sdk/core/network/j;)V

    .line 9
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "report normal"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/sdk/core/network/b/d;->ayh:Lcom/kwad/sdk/core/network/j;

    invoke-virtual {v1}, Lcom/kwad/sdk/core/network/j;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/network/b/d;->em(Ljava/lang/String;)V

    :cond_5
    :goto_1
    return-void
.end method
