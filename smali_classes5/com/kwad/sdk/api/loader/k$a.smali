.class final Lcom/kwad/sdk/api/loader/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/api/loader/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private anN:I

.field private anO:I

.field private anP:Ljava/lang/String;

.field private anQ:Ljava/lang/String;

.field private anR:J

.field private anS:I

.field private anT:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/kwad/sdk/api/loader/k$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/sdk/api/loader/k$a;I)Lcom/kwad/sdk/api/loader/k$a;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/api/loader/k$a;->bX(I)Lcom/kwad/sdk/api/loader/k$a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/sdk/api/loader/k$a;J)Lcom/kwad/sdk/api/loader/k$a;
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/api/loader/k$a;->ah(J)Lcom/kwad/sdk/api/loader/k$a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/sdk/api/loader/k$a;Ljava/lang/String;)Lcom/kwad/sdk/api/loader/k$a;
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/kwad/sdk/api/loader/k$a;->cm(Ljava/lang/String;)Lcom/kwad/sdk/api/loader/k$a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/sdk/api/loader/k$a;)Lorg/json/JSONObject;
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/kwad/sdk/api/loader/k$a;->toJson()Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method private ah(J)Lcom/kwad/sdk/api/loader/k$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/api/loader/k$a;->anR:J

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/sdk/api/loader/k$a;I)Lcom/kwad/sdk/api/loader/k$a;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/api/loader/k$a;->bY(I)Lcom/kwad/sdk/api/loader/k$a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/sdk/api/loader/k$a;Ljava/lang/String;)Lcom/kwad/sdk/api/loader/k$a;
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/sdk/api/loader/k$a;->cn(Ljava/lang/String;)Lcom/kwad/sdk/api/loader/k$a;

    move-result-object p0

    return-object p0
.end method

.method private bX(I)Lcom/kwad/sdk/api/loader/k$a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/api/loader/k$a;->anN:I

    return-object p0
.end method

.method private bY(I)Lcom/kwad/sdk/api/loader/k$a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/api/loader/k$a;->anO:I

    return-object p0
.end method

.method private bZ(I)Lcom/kwad/sdk/api/loader/k$a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/api/loader/k$a;->anS:I

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/sdk/api/loader/k$a;I)Lcom/kwad/sdk/api/loader/k$a;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/api/loader/k$a;->bZ(I)Lcom/kwad/sdk/api/loader/k$a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/sdk/api/loader/k$a;Ljava/lang/String;)Lcom/kwad/sdk/api/loader/k$a;
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/sdk/api/loader/k$a;->co(Ljava/lang/String;)Lcom/kwad/sdk/api/loader/k$a;

    move-result-object p0

    return-object p0
.end method

.method private cm(Ljava/lang/String;)Lcom/kwad/sdk/api/loader/k$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/api/loader/k$a;->anP:Ljava/lang/String;

    return-object p0
.end method

.method private cn(Ljava/lang/String;)Lcom/kwad/sdk/api/loader/k$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/api/loader/k$a;->anQ:Ljava/lang/String;

    return-object p0
.end method

.method private co(Ljava/lang/String;)Lcom/kwad/sdk/api/loader/k$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/api/loader/k$a;->anT:Ljava/lang/String;

    return-object p0
.end method

.method private toJson()Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "load_status"

    .line 2
    iget v2, p0, Lcom/kwad/sdk/api/loader/k$a;->anN:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "update_count"

    .line 3
    iget v2, p0, Lcom/kwad/sdk/api/loader/k$a;->anO:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "dynamic_version"

    .line 4
    iget-object v2, p0, Lcom/kwad/sdk/api/loader/k$a;->anP:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "download_url"

    .line 5
    iget-object v2, p0, Lcom/kwad/sdk/api/loader/k$a;->anQ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "duration_ms"

    .line 6
    iget-wide v2, p0, Lcom/kwad/sdk/api/loader/k$a;->anR:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "error_code"

    .line 7
    iget v2, p0, Lcom/kwad/sdk/api/loader/k$a;->anS:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "error_msg"

    .line 8
    iget-object v2, p0, Lcom/kwad/sdk/api/loader/k$a;->anT:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MonitorInfo{load_status="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/kwad/sdk/api/loader/k$a;->anN:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", update_count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/kwad/sdk/api/loader/k$a;->anO:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", dynamic_version=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/kwad/sdk/api/loader/k$a;->anP:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", download_url=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/kwad/sdk/api/loader/k$a;->anQ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", duration_ms="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/kwad/sdk/api/loader/k$a;->anR:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", error_code="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/kwad/sdk/api/loader/k$a;->anS:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", error_msg=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/kwad/sdk/api/loader/k$a;->anT:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
