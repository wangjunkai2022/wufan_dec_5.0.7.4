.class public final Lcom/kwad/components/core/f/a;
.super Lcom/kwad/sdk/components/d;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/components/g;


# instance fields
.field private LY:Ljava/lang/String;

.field private LZ:J

.field private Ma:Ljava/lang/String;

.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/components/d;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/f/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/f/a;->oU()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/f/a;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/components/core/f/a;->ak(Ljava/lang/String;)V

    return-void
.end method

.method private ai(Landroid/content/Context;)V
    .locals 4

    const-string v0, "EncryptComponentsImpl"

    const-string v1, "initGId"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "64"

    .line 3
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 4
    sget-object v2, Lcom/kwad/sdk/core/config/c;->auc:Lcom/kwad/sdk/core/config/item/d;

    invoke-static {v2}, Lcom/kwad/sdk/core/config/d;->a(Lcom/kwad/sdk/core/config/item/d;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "64_level"

    const/4 v3, 0x1

    .line 5
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 6
    :cond_0
    invoke-static {v1}, Lcom/yxcorp/kuaishou/addfp/KWEGIDDFP;->handlePolicy(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 7
    invoke-static {v1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    .line 8
    :goto_0
    invoke-static {}, Lcom/yxcorp/kuaishou/addfp/KWEGIDDFP;->instance()Lcom/yxcorp/kuaishou/addfp/KWEGIDDFP;

    move-result-object v1

    new-instance v2, Lcom/kwad/components/core/f/a$1;

    invoke-direct {v2, p0}, Lcom/kwad/components/core/f/a$1;-><init>(Lcom/kwad/components/core/f/a;)V

    invoke-virtual {v1, p1, v0, v2}, Lcom/yxcorp/kuaishou/addfp/KWEGIDDFP;->getEGidByCallback(Landroid/content/Context;ZLcom/yxcorp/kuaishou/addfp/ResponseDfpCallback;)V

    return-void
.end method

.method private ak(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/f/a;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/kwad/sdk/utils/bh;->isNullString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/f/a;->oZ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/kwad/sdk/utils/bh;->isEquals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iput-object p1, p0, Lcom/kwad/components/core/f/a;->Ma:Ljava/lang/String;

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/f/a;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/kwad/sdk/utils/y;->ag(Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private oU()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/f/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/y;->co(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NI()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/f/a;->mContext:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/y;->Y(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    .line 5
    :cond_0
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ""

    .line 6
    iput-object v0, p0, Lcom/kwad/components/core/f/a;->LY:Ljava/lang/String;

    const-wide/16 v2, 0x0

    .line 7
    iput-wide v2, p0, Lcom/kwad/components/core/f/a;->LZ:J

    .line 8
    iput-object v0, p0, Lcom/kwad/components/core/f/a;->Ma:Ljava/lang/String;

    .line 9
    iget-object v2, p0, Lcom/kwad/components/core/f/a;->mContext:Landroid/content/Context;

    invoke-static {v2, v0}, Lcom/kwad/sdk/utils/y;->X(Landroid/content/Context;Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/core/f/a;->mContext:Landroid/content/Context;

    iget-wide v2, p0, Lcom/kwad/components/core/f/a;->LZ:J

    invoke-static {v0, v2, v3}, Lcom/kwad/sdk/utils/y;->d(Landroid/content/Context;J)V

    .line 11
    iget-object v0, p0, Lcom/kwad/components/core/f/a;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/kwad/components/core/f/a;->Ma:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/kwad/sdk/utils/y;->ag(Landroid/content/Context;Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lcom/kwad/components/core/f/a;->mContext:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/y;->Y(Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private oX()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/f/a;->LY:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/f/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/y;->cl(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/f/a;->LY:Ljava/lang/String;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/f/a;->LY:Ljava/lang/String;

    return-object v0
.end method

.method private oY()J
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/core/f/a;->LZ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/f/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/y;->cm(Landroid/content/Context;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/core/f/a;->LZ:J

    .line 3
    :cond_0
    iget-wide v0, p0, Lcom/kwad/components/core/f/a;->LZ:J

    return-wide v0
.end method

.method private oZ()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/f/a;->Ma:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/f/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/y;->cr(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/f/a;->Ma:Ljava/lang/String;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/f/a;->Ma:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final al(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/f/a;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/kwad/sdk/utils/bh;->isNullString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/f/a;->oX()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/kwad/sdk/utils/bh;->isEquals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    :try_start_0
    iput-object p1, p0, Lcom/kwad/components/core/f/a;->LY:Ljava/lang/String;

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/f/a;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/kwad/sdk/utils/y;->X(Landroid/content/Context;Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lcom/yxcorp/kuaishou/addfp/KWEGIDDFP;->instance()Lcom/yxcorp/kuaishou/addfp/KWEGIDDFP;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/f/a;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Lcom/yxcorp/kuaishou/addfp/KWEGIDDFP;->setEgid(Landroid/content/Context;Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setEGid error : "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "EncryptComponentsImpl"

    invoke-static {v0, p1}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final getComponentsType()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lcom/kwad/sdk/components/g;

    return-object v0
.end method

.method public final init(Landroid/content/Context;)V
    .locals 2

    .line 1
    :try_start_0
    iput-object p1, p0, Lcom/kwad/components/core/f/a;->mContext:Landroid/content/Context;

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/components/core/f/a;->ai(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "initGId error : "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "EncryptComponentsImpl"

    invoke-static {v0, p1}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final oV()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->CG()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0}, Lcom/kwad/components/core/f/a;->oY()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/core/f/a;->oX()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, ""

    return-object v0

    .line 4
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/kwad/components/core/f/a;->oZ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final oW()Lcom/kwad/sdk/core/a/g;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/a/a;

    invoke-direct {v0}, Lcom/kwad/sdk/core/a/a;-><init>()V

    return-object v0
.end method

.method public final priority()I
    .locals 1

    const/16 v0, -0xc8

    return v0
.end method

.method public final x(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/f/a;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_1

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/f/a;->oY()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iput-wide p1, p0, Lcom/kwad/components/core/f/a;->LZ:J

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/f/a;->mContext:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lcom/kwad/sdk/utils/y;->d(Landroid/content/Context;J)V

    :cond_1
    :goto_0
    return-void
.end method
