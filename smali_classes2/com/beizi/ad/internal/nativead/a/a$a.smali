.class Lcom/beizi/ad/internal/nativead/a/a$a;
.super Lcom/beizi/ad/internal/utilities/HTTPGet;
.source "MediationNativeAdController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/nativead/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field a:Lcom/beizi/ad/internal/e;

.field final b:I

.field final synthetic c:Lcom/beizi/ad/internal/nativead/a/a;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Z

.field private final g:J

.field private final h:J


# direct methods
.method private constructor <init>(Lcom/beizi/ad/internal/nativead/a/a;Lcom/beizi/ad/internal/e;Ljava/lang/String;ILjava/util/HashMap;ZJJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/beizi/ad/internal/e;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;ZJJ)V"
        }
    .end annotation

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/internal/nativead/a/a$a;->c:Lcom/beizi/ad/internal/nativead/a/a;

    const/4 p1, 0x1

    .line 3
    invoke-direct {p0, p1, p1}, Lcom/beizi/ad/internal/utilities/HTTPGet;-><init>(ZZ)V

    .line 4
    iput-object p2, p0, Lcom/beizi/ad/internal/nativead/a/a$a;->a:Lcom/beizi/ad/internal/e;

    .line 5
    iput-object p3, p0, Lcom/beizi/ad/internal/nativead/a/a$a;->d:Ljava/lang/String;

    .line 6
    iput p4, p0, Lcom/beizi/ad/internal/nativead/a/a$a;->b:I

    .line 7
    iput-object p5, p0, Lcom/beizi/ad/internal/nativead/a/a$a;->e:Ljava/util/HashMap;

    .line 8
    iput-boolean p6, p0, Lcom/beizi/ad/internal/nativead/a/a$a;->f:Z

    .line 9
    iput-wide p7, p0, Lcom/beizi/ad/internal/nativead/a/a$a;->g:J

    .line 10
    iput-wide p9, p0, Lcom/beizi/ad/internal/nativead/a/a$a;->h:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/beizi/ad/internal/nativead/a/a;Lcom/beizi/ad/internal/e;Ljava/lang/String;ILjava/util/HashMap;ZJJLcom/beizi/ad/internal/nativead/a/a$1;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, Lcom/beizi/ad/internal/nativead/a/a$a;-><init>(Lcom/beizi/ad/internal/nativead/a/a;Lcom/beizi/ad/internal/e;Ljava/lang/String;ILjava/util/HashMap;ZJJ)V

    return-void
.end method


# virtual methods
.method protected getUrl()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/ad/internal/nativead/a/a$a;->d:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "&reason="

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/beizi/ad/internal/nativead/a/a$a;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "&uid="

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/beizi/ad/internal/utilities/DeviceInfo;->getInstance()Lcom/beizi/ad/internal/utilities/DeviceInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/beizi/ad/internal/utilities/DeviceInfo;->sdkUID:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    iget-wide v1, p0, Lcom/beizi/ad/internal/nativead/a/a$a;->g:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    const-string v1, "&latency="

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/beizi/ad/internal/nativead/a/a$a;->g:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    :cond_0
    iget-wide v1, p0, Lcom/beizi/ad/internal/nativead/a/a$a;->h:J

    cmp-long v5, v1, v3

    if-lez v5, :cond_1

    const-string v1, "&total_latency="

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/beizi/ad/internal/nativead/a/a$a;->h:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Lcom/beizi/ad/internal/utilities/HTTPResponse;)V
    .locals 3

    .line 2
    iget-boolean v0, p0, Lcom/beizi/ad/internal/nativead/a/a$a;->f:Z

    if-eqz v0, :cond_0

    .line 3
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpRespLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->result_cb_ignored:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a/a$a;->a:Lcom/beizi/ad/internal/e;

    if-nez v0, :cond_1

    .line 5
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpRespLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->fire_cb_requester_null:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {p1}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->getSucceeded()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    new-instance v1, Lcom/beizi/ad/internal/network/ServerResponse;

    sget-object v2, Lcom/beizi/ad/internal/j;->e:Lcom/beizi/ad/internal/j;

    invoke-direct {v1, p1, v2}, Lcom/beizi/ad/internal/network/ServerResponse;-><init>(Lcom/beizi/ad/internal/utilities/HTTPResponse;Lcom/beizi/ad/internal/j;)V

    .line 8
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/a/a$a;->e:Ljava/util/HashMap;

    const-string v2, "ORIENTATION"

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 9
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/a/a$a;->e:Ljava/util/HashMap;

    .line 10
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 11
    invoke-virtual {v1, v2, p1}, Lcom/beizi/ad/internal/network/ServerResponse;->addToExtras(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 12
    :cond_2
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpRespLogTag:Ljava/lang/String;

    sget v2, Lcom/beizi/ad/R$string;->result_cb_bad_response:I

    invoke-static {v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    :cond_3
    :goto_0
    invoke-interface {v0, v1}, Lcom/beizi/ad/internal/e;->a(Lcom/beizi/ad/internal/network/ServerResponse;)V

    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/beizi/ad/internal/utilities/HTTPResponse;

    invoke-virtual {p0, p1}, Lcom/beizi/ad/internal/nativead/a/a$a;->onPostExecute(Lcom/beizi/ad/internal/utilities/HTTPResponse;)V

    return-void
.end method
