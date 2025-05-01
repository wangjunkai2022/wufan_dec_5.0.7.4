.class public Lcom/mob/commons/a/e;
.super Lcom/mob/commons/a/c;


# direct methods
.method public constructor <init>()V
    .locals 10

    const-string v0, "004h7fkGek"

    .line 1
    invoke-static {v0}, Lcom/mob/commons/a/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "l"

    invoke-static {v1, v0}, Lcom/mob/commons/a/c;->a(Ljava/lang/String;Ljava/lang/Long;)J

    move-result-wide v8

    const-string v2, "l"

    const-wide/16 v3, 0x0

    const-wide/32 v6, 0x15180

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/mob/commons/a/c;-><init>(Ljava/lang/String;JLjava/lang/String;JJ)V

    return-void
.end method

.method static synthetic a(Lcom/mob/commons/a/e;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/mob/commons/a/e;->a(Ljava/util/ArrayList;)V

    return-void
.end method

.method private a(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    const/4 v0, 0x2

    .line 8
    :try_start_0
    invoke-direct {p0, p1, v0}, Lcom/mob/commons/a/e;->a(Ljava/util/ArrayList;I)V

    const/4 v0, 0x1

    .line 9
    invoke-direct {p0, p1, v0}, Lcom/mob/commons/a/e;->a(Ljava/util/ArrayList;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 10
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mob/tools/log/NLog;->w(Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method private a(Ljava/util/ArrayList;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;I)V"
        }
    .end annotation

    .line 11
    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/utils/DH;->requester(Landroid/content/Context;)Lcom/mob/tools/utils/DH$RequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mob/tools/utils/DH$RequestBuilder;->getMcdi()Lcom/mob/tools/utils/DH$RequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mob/tools/utils/DH$RequestBuilder;->getMbcdi()Lcom/mob/tools/utils/DH$RequestBuilder;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p2, v1, :cond_0

    const/16 v3, 0x1e

    .line 12
    invoke-virtual {v0, v3, v2, v1, v2}, Lcom/mob/tools/utils/DH$RequestBuilder;->getPosCommForce(IIZZ)Lcom/mob/tools/utils/DH$RequestBuilder;

    goto :goto_0

    :cond_0
    const/16 v3, 0xf

    .line 13
    invoke-virtual {v0, v2, v3, v1, v2}, Lcom/mob/tools/utils/DH$RequestBuilder;->getPosCommForce(IIZZ)Lcom/mob/tools/utils/DH$RequestBuilder;

    .line 14
    :goto_0
    new-instance v1, Lcom/mob/commons/a/e$2;

    invoke-direct {v1, p0, p2, p1}, Lcom/mob/commons/a/e$2;-><init>(Lcom/mob/commons/a/e;ILjava/util/ArrayList;)V

    invoke-virtual {v0, v1}, Lcom/mob/tools/utils/DH$RequestBuilder;->request(Lcom/mob/tools/utils/DH$DHResponder;)V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 2
    invoke-static {}, Lcom/mob/commons/ab;->a()Lcom/mob/commons/ab;

    move-result-object v0

    const-string v1, "key_lgwst"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/mob/commons/ab;->b(Ljava/lang/String;J)J

    move-result-wide v0

    const-string v2, "036ef.edekelejedemZkg.ekegejgjgjejelFfWemfeglgefhjehjeihgffhdffeifmgdgegdhj"

    .line 3
    invoke-static {v2}, Lcom/mob/commons/a/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/mob/tools/utils/DH$SyncMtd;->checkPermission(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "036efNedekelejedemZkg^ekegejgjgjejelHf9emgefefehjfmfmeihgffhdffeifmgdgegdhj"

    .line 4
    invoke-static {v2}, Lcom/mob/commons/a/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/mob/tools/utils/DH$SyncMtd;->checkPermission(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    const-wide/32 v0, 0x1b7740

    cmp-long v4, v2, v0

    if-ltz v4, :cond_0

    .line 6
    new-instance v0, Lcom/mob/commons/a/e$1;

    invoke-direct {v0, p0}, Lcom/mob/commons/a/e$1;-><init>(Lcom/mob/commons/a/e;)V

    invoke-static {v0}, Lcom/mob/commons/v;->a(Lcom/mob/tools/utils/e;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Lcom/mob/commons/a/e;->a(Ljava/util/ArrayList;)V

    :goto_0
    return-void
.end method
