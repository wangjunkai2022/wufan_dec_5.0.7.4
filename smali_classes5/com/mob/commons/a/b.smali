.class public Lcom/mob/commons/a/b;
.super Lcom/mob/commons/a/c;


# direct methods
.method public constructor <init>()V
    .locals 10

    const-string v0, "0022eeeh"

    .line 1
    invoke-static {v0}, Lcom/mob/commons/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v1, "005=eeehdi2ci"

    invoke-static {v1}, Lcom/mob/commons/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0}, Lcom/mob/commons/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mob/commons/a/c;->a(Ljava/lang/String;Ljava/lang/Long;)J

    move-result-wide v8

    const-wide/32 v6, 0x15180

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/mob/commons/a/c;-><init>(Ljava/lang/String;JLjava/lang/String;JJ)V

    return-void
.end method

.method private m()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/utils/DH;->requester(Landroid/content/Context;)Lcom/mob/tools/utils/DH$RequestBuilder;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/mob/tools/utils/DH$RequestBuilder;->getCarrier()Lcom/mob/tools/utils/DH$RequestBuilder;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/mob/tools/utils/DH$RequestBuilder;->getCarrierName()Lcom/mob/tools/utils/DH$RequestBuilder;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/mob/tools/utils/DH$RequestBuilder;->getMnbclfo()Lcom/mob/tools/utils/DH$RequestBuilder;

    move-result-object v0

    .line 5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    if-lt v1, v2, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/mob/tools/utils/DH$RequestBuilder;->getACIfo()Lcom/mob/tools/utils/DH$RequestBuilder;

    move-result-object v0

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/mob/tools/utils/DH$RequestBuilder;->getCLoc()Lcom/mob/tools/utils/DH$RequestBuilder;

    move-result-object v0

    .line 8
    :goto_0
    new-instance v2, Lcom/mob/commons/a/b$1;

    invoke-direct {v2, p0, v1}, Lcom/mob/commons/a/b$1;-><init>(Lcom/mob/commons/a/b;I)V

    invoke-virtual {v0, v2}, Lcom/mob/tools/utils/DH$RequestBuilder;->request(Lcom/mob/tools/utils/DH$DHResponder;)V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/mob/commons/a/b;->m()V

    return-void
.end method
