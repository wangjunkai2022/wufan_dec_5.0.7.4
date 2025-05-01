.class public final Lcom/kwad/sdk/utils/aw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static aQN:Ljava/lang/String; = ""


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static Lg()Lcom/kwad/sdk/k/a/b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/k/a/b;->Lg()Lcom/kwad/sdk/k/a/b;

    move-result-object v0

    return-object v0
.end method

.method public static Lh()Lcom/kwad/sdk/k/a/f;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/k/a/f;->Lh()Lcom/kwad/sdk/k/a/f;

    move-result-object v0

    return-object v0
.end method

.method private static Ng()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Lcom/kwad/sdk/k/a/f;->Lh()Lcom/kwad/sdk/k/a/f;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget v0, v0, Lcom/kwad/sdk/k/a/f;->aOl:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    const/4 v1, 0x0

    if-ltz v0, :cond_1

    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-static {v1, v0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 5
    :cond_1
    const-class v2, Lcom/kwad/sdk/service/a/h;

    invoke-static {v2}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/sdk/service/a/h;

    invoke-interface {v2}, Lcom/kwad/sdk/service/a/h;->zg()Z

    move-result v2

    if-nez v2, :cond_2

    .line 6
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    .line 7
    invoke-static {v1, v0, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 8
    :cond_2
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x2

    .line 9
    invoke-static {v1, v0, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static Nh()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Lcom/kwad/sdk/k/a/b;->Lg()Lcom/kwad/sdk/k/a/b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/sdk/k/a/b;->toJson()Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v1, v0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/h;->zi()Z

    move-result v0

    const-string v2, ""

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 4
    invoke-static {v1, v2, v0}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x2

    .line 5
    invoke-static {v1, v2, v0}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static Ni()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    const-string v1, "1"

    .line 1
    invoke-static {v0, v1, v0}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static Nj()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->getSdkVersion()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static Nk()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->getAppId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static bS(Z)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/bj;->cd(Z)Ljava/lang/String;

    move-result-object v0

    if-nez p0, :cond_1

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    return-object v0

    .line 3
    :cond_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p0, :cond_3

    .line 4
    invoke-static {}, Lcom/kwad/sdk/utils/av;->Na()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 5
    invoke-static {}, Lcom/kwad/sdk/utils/av;->Nb()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 6
    :goto_0
    invoke-static {v1, v0, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 7
    :cond_3
    invoke-static {}, Lcom/kwad/sdk/utils/av;->Na()Z

    move-result p0

    if-nez p0, :cond_5

    invoke-static {}, Lcom/kwad/sdk/utils/o;->LS()Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_1

    :cond_4
    const/4 p0, 0x5

    .line 8
    invoke-static {v2, v0, p0}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 9
    :cond_5
    :goto_1
    invoke-static {v2, v0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static bT(Z)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lcom/kwad/framework/a/a;->md:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/kwad/sdk/utils/bk;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/kwad/sdk/utils/bk;->getDeviceId()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    if-nez p0, :cond_2

    .line 4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, ""

    return-object p0

    :cond_1
    return-object v0

    .line 5
    :cond_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p0, :cond_4

    .line 6
    invoke-static {}, Lcom/kwad/sdk/utils/av;->usePhoneStateDisable()Z

    move-result p0

    if-eqz p0, :cond_3

    .line 7
    invoke-static {}, Lcom/kwad/sdk/utils/av;->MX()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-static {v1, v0, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 9
    :cond_4
    invoke-static {}, Lcom/kwad/sdk/utils/av;->usePhoneStateDisable()Z

    move-result p0

    if-nez p0, :cond_6

    invoke-static {}, Lcom/kwad/sdk/utils/o;->LQ()Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_1

    :cond_5
    const/4 p0, 0x5

    .line 10
    invoke-static {v2, v0, p0}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 11
    :cond_6
    :goto_1
    invoke-static {v2, v0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static bU(Z)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NV()Ljava/lang/String;

    move-result-object v0

    if-nez p0, :cond_1

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    return-object v0

    .line 3
    :cond_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    const/4 v1, 0x0

    if-nez p0, :cond_2

    .line 4
    invoke-static {}, Lcom/kwad/sdk/utils/av;->Nc()Z

    move-result p0

    .line 5
    invoke-static {p0, v0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 6
    :cond_2
    invoke-static {}, Lcom/kwad/sdk/utils/av;->Nc()Z

    move-result p0

    if-nez p0, :cond_4

    const-class p0, Lcom/kwad/sdk/service/a/h;

    .line 7
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/kwad/sdk/service/a/h;

    const-wide/16 v2, 0x8

    invoke-interface {p0, v2, v3}, Lcom/kwad/sdk/service/a/h;->ab(J)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 p0, 0x2

    .line 8
    invoke-static {v1, v0, p0}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_0
    const/4 p0, 0x1

    .line 9
    invoke-static {v1, v0, p0}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic bV(Z)Ljava/lang/String;
    .locals 0

    const/4 p0, 0x1

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/aw;->bS(Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic bW(Z)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->Ng()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic bX(Z)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->Nh()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic bY(Z)Ljava/lang/String;
    .locals 0

    const/4 p0, 0x1

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/aw;->bT(Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic bZ(Z)Ljava/lang/String;
    .locals 0

    const/4 p0, 0x1

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/aw;->bU(Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static c(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/bj;->u(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object v0

    if-nez p1, :cond_1

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    return-object v0

    .line 3
    :cond_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_3

    .line 4
    invoke-static {}, Lcom/kwad/sdk/utils/av;->usePhoneStateDisable()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 5
    invoke-static {}, Lcom/kwad/sdk/utils/av;->MV()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 6
    :goto_0
    invoke-static {v1, v0, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 7
    :cond_3
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt p1, v3, :cond_4

    const/4 p0, 0x4

    .line 8
    invoke-static {v2, v0, p0}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 9
    :cond_4
    invoke-static {}, Lcom/kwad/sdk/utils/av;->usePhoneStateDisable()Z

    move-result p1

    if-nez p1, :cond_7

    invoke-static {}, Lcom/kwad/sdk/utils/o;->LW()Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    .line 10
    :cond_5
    invoke-static {p0}, Lcom/kwad/sdk/utils/SystemUtil;->di(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_6

    const/4 v1, 0x3

    .line 11
    :cond_6
    invoke-static {v2, v0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 12
    :cond_7
    :goto_1
    invoke-static {v2, v0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static cI(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Lcom/kwad/sdk/utils/aw;->c(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static cJ(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Lcom/kwad/sdk/utils/aw;->d(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static cK(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Lcom/kwad/sdk/utils/aw;->e(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static cL(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Lcom/kwad/sdk/utils/aw;->f(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static cM(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Lcom/kwad/sdk/utils/aw;->g(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static cN(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Lcom/kwad/sdk/utils/aw;->h(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static cO(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Lcom/kwad/sdk/utils/aw;->i(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static cP(Landroid/content/Context;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/bj;->dp(Landroid/content/Context;)I

    move-result p0

    return p0
.end method

.method private static cQ(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/bj;->dp(Landroid/content/Context;)I

    move-result p0

    const/4 v0, 0x0

    if-lez p0, :cond_0

    .line 2
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0, v0}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 3
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-ge v1, v2, :cond_1

    .line 4
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x1

    invoke-static {v0, p0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 5
    :cond_1
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x3

    invoke-static {v0, p0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static cR(Landroid/content/Context;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/bj;->dq(Landroid/content/Context;)I

    move-result p0

    return p0
.end method

.method private static cS(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    const/16 v0, 0xf

    .line 1
    invoke-static {p0, v0}, Lcom/kwad/sdk/utils/aw;->o(Landroid/content/Context;I)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 3
    invoke-static {}, Lcom/kwad/sdk/utils/av;->Nc()Z

    move-result p0

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/utils/t;->O(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v0

    .line 5
    invoke-static {p0, v0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 6
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/av;->Nc()Z

    move-result v0

    const/4 v2, 0x1

    const-string v3, ""

    if-nez v0, :cond_3

    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    const-wide/16 v4, 0x20

    .line 7
    invoke-interface {v0, v4, v5}, Lcom/kwad/sdk/service/a/h;->ab(J)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 8
    :cond_1
    invoke-static {p0}, Lcom/kwad/sdk/utils/bv;->dx(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x3

    .line 9
    :goto_0
    invoke-static {v1, v3, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 10
    :cond_3
    :goto_1
    invoke-static {v1, v3, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static cT(Landroid/content/Context;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kwad/sdk/app/AppPackageInfo;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lcom/kwad/sdk/components/n;

    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/components/n;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/kwad/sdk/utils/o;->LU()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-interface {v0, p0}, Lcom/kwad/sdk/components/n;->K(Landroid/content/Context;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    .line 4
    :cond_0
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    return-object p0
.end method

.method private static cU(Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    invoke-static {}, Lcom/kwad/sdk/core/c/b;->isAppOnForeground()Z

    move-result v0

    const-string v1, ""

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 p0, 0x5

    .line 2
    invoke-static {v2, v1, p0}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/kwad/sdk/utils/aw;->cT(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v0

    .line 4
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    const/4 v4, 0x1

    if-lez v3, :cond_2

    .line 5
    invoke-static {}, Lcom/kwad/sdk/utils/av;->Ne()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 6
    invoke-static {}, Lcom/kwad/sdk/utils/av;->Nf()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 7
    :goto_0
    const-class v5, Lcom/kwad/sdk/components/n;

    invoke-static {v5}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object v5

    check-cast v5, Lcom/kwad/sdk/components/n;

    if-eqz v5, :cond_2

    .line 8
    invoke-static {}, Lcom/kwad/sdk/utils/o;->LU()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 9
    invoke-interface {v5, v0}, Lcom/kwad/sdk/components/n;->c(Ljava/util/Map;)Lorg/json/JSONArray;

    move-result-object p0

    .line 10
    invoke-static {v3, p0, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 11
    :cond_2
    invoke-static {}, Lcom/kwad/sdk/utils/av;->Ne()Z

    move-result v0

    if-nez v0, :cond_5

    .line 12
    invoke-static {}, Lcom/kwad/sdk/utils/o;->LU()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    .line 13
    :cond_3
    invoke-static {p0}, Lcom/kwad/sdk/utils/bj;->dw(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 v4, 0x3

    .line 14
    :cond_4
    invoke-static {v2, v1, v4}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 15
    :cond_5
    :goto_1
    invoke-static {v2, v1, v4}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static cV(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/r;->ci(Landroid/content/Context;)Lcom/kwad/sdk/utils/c/a;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 2
    iget-object v3, v0, Lcom/kwad/sdk/utils/c/a;->aTt:Landroid/location/Location;

    if-eqz v3, :cond_1

    .line 3
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 4
    iget-object v3, v0, Lcom/kwad/sdk/utils/c/a;->aTt:Landroid/location/Location;

    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    const-string v4, "latitude"

    invoke-virtual {p0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v0, v0, Lcom/kwad/sdk/utils/c/a;->aTt:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    const-string v3, "longitude"

    invoke-virtual {p0, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-static {}, Lcom/kwad/sdk/utils/av;->MT()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/kwad/sdk/utils/av;->MU()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-static {p0}, Lcom/kwad/sdk/utils/t;->parseMap2JSON(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object p0

    .line 8
    invoke-static {v1, p0, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 9
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/utils/av;->MT()Z

    move-result v0

    const-string v3, ""

    if-nez v0, :cond_5

    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    const-wide/16 v4, 0x40

    .line 10
    invoke-interface {v0, v4, v5}, Lcom/kwad/sdk/service/a/h;->ab(J)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    .line 11
    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_3

    const/4 p0, 0x1

    goto :goto_1

    :cond_3
    const/4 p0, 0x0

    :goto_1
    if-eqz p0, :cond_4

    const/4 v1, 0x3

    .line 12
    :cond_4
    invoke-static {v2, v3, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 13
    :cond_5
    :goto_2
    invoke-static {v2, v3, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static cW(Landroid/content/Context;)Lcom/kwad/sdk/e/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/sdk/utils/aw$1;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/utils/aw$1;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method static synthetic ca(Z)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->Ni()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic cb(Z)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->Nj()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic cc(Z)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->Nk()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ci(Landroid/content/Context;)Lcom/kwad/sdk/utils/c/a;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/r;->ci(Landroid/content/Context;)Lcom/kwad/sdk/utils/c/a;

    move-result-object p0

    return-object p0
.end method

.method private static d(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/bj;->cJ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    if-nez p1, :cond_1

    .line 2
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p0, ""

    :cond_0
    return-object p0

    .line 3
    :cond_1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_3

    .line 4
    invoke-static {}, Lcom/kwad/sdk/utils/av;->usePhoneStateDisable()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 5
    invoke-static {}, Lcom/kwad/sdk/utils/av;->MX()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-static {v0, p0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 7
    :cond_3
    invoke-static {}, Lcom/kwad/sdk/utils/av;->usePhoneStateDisable()Z

    move-result p1

    if-nez p1, :cond_5

    invoke-static {}, Lcom/kwad/sdk/utils/o;->LQ()Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    const/4 p1, 0x5

    .line 8
    invoke-static {v1, p0, p1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 9
    :cond_5
    :goto_1
    invoke-static {v1, p0, v0}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static e(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/bj;->du(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez p1, :cond_1

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    return-object v0

    .line 3
    :cond_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_3

    .line 4
    invoke-static {}, Lcom/kwad/sdk/utils/av;->MY()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 5
    invoke-static {}, Lcom/kwad/sdk/utils/av;->MZ()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 6
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 7
    :cond_3
    invoke-static {}, Lcom/kwad/sdk/utils/av;->MY()Z

    move-result p1

    if-nez p1, :cond_6

    invoke-static {}, Lcom/kwad/sdk/utils/o;->LR()Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    const-string p1, "android.permission.ACCESS_WIFI_STATE"

    .line 8
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/an;->aq(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_5

    const/4 v1, 0x3

    .line 9
    :cond_5
    invoke-static {v2, v0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 10
    :cond_6
    :goto_1
    invoke-static {v2, v0, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static f(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/bj;->do(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    array-length v2, v0

    if-lez v2, :cond_0

    .line 3
    aget-object v0, v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez p1, :cond_2

    .line 4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, ""

    return-object p0

    :cond_1
    return-object v0

    .line 5
    :cond_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v2, 0x1

    if-nez p1, :cond_4

    .line 6
    invoke-static {}, Lcom/kwad/sdk/utils/av;->usePhoneStateDisable()Z

    move-result p0

    if-eqz p0, :cond_3

    .line 7
    invoke-static {}, Lcom/kwad/sdk/utils/av;->MV()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    .line 8
    :goto_1
    invoke-static {v2, v0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 9
    :cond_4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt p1, v3, :cond_5

    const/4 p0, 0x4

    .line 10
    invoke-static {v1, v0, p0}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 11
    :cond_5
    invoke-static {}, Lcom/kwad/sdk/utils/av;->usePhoneStateDisable()Z

    move-result p1

    if-nez p1, :cond_8

    invoke-static {}, Lcom/kwad/sdk/utils/o;->LW()Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_2

    .line 12
    :cond_6
    invoke-static {p0}, Lcom/kwad/sdk/utils/SystemUtil;->di(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_7

    const/4 v2, 0x3

    .line 13
    :cond_7
    invoke-static {v1, v0, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 14
    :cond_8
    :goto_2
    invoke-static {v1, v0, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static g(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/bj;->do(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 2
    array-length v2, v0

    if-le v2, v1, :cond_0

    .line 3
    aget-object v0, v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez p1, :cond_2

    .line 4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, ""

    return-object p0

    :cond_1
    return-object v0

    .line 5
    :cond_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v2, 0x0

    if-nez p1, :cond_4

    .line 6
    invoke-static {}, Lcom/kwad/sdk/utils/av;->usePhoneStateDisable()Z

    move-result p0

    if-eqz p0, :cond_3

    .line 7
    invoke-static {}, Lcom/kwad/sdk/utils/av;->MV()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    .line 8
    :goto_1
    invoke-static {v1, v0, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 9
    :cond_4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt p1, v3, :cond_5

    const/4 p0, 0x4

    .line 10
    invoke-static {v2, v0, p0}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 11
    :cond_5
    invoke-static {}, Lcom/kwad/sdk/utils/av;->usePhoneStateDisable()Z

    move-result p1

    if-nez p1, :cond_8

    invoke-static {}, Lcom/kwad/sdk/utils/o;->LW()Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_2

    .line 12
    :cond_6
    invoke-static {p0}, Lcom/kwad/sdk/utils/SystemUtil;->di(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_7

    const/4 v1, 0x3

    .line 13
    :cond_7
    invoke-static {v2, v0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 14
    :cond_8
    :goto_2
    invoke-static {v2, v0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getAppId()Ljava/lang/String;
    .locals 1

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/h;->getAppId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getDeviceId()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Lcom/kwad/sdk/utils/aw;->bT(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getOaid()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Lcom/kwad/sdk/utils/aw;->bS(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static getSdkVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "3.3.63"

    return-object v0
.end method

.method private static h(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/bj;->cN(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez p1, :cond_1

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    return-object v0

    .line 3
    :cond_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_2

    .line 4
    invoke-static {}, Lcom/kwad/sdk/utils/av;->usePhoneStateDisable()Z

    move-result p0

    .line 5
    invoke-static {p0, v0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 6
    :cond_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt p1, v2, :cond_3

    const/4 p0, 0x4

    .line 7
    invoke-static {v1, v0, p0}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 8
    :cond_3
    invoke-static {}, Lcom/kwad/sdk/utils/av;->usePhoneStateDisable()Z

    move-result p1

    const/4 v2, 0x1

    if-nez p1, :cond_6

    invoke-static {}, Lcom/kwad/sdk/utils/o;->LX()Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    .line 9
    :cond_4
    invoke-static {p0}, Lcom/kwad/sdk/utils/SystemUtil;->di(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_5

    const/4 v2, 0x3

    .line 10
    :cond_5
    invoke-static {v1, v0, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 11
    :cond_6
    :goto_0
    invoke-static {v1, v0, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static i(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/bj;->dr(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez p1, :cond_1

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    return-object v0

    .line 3
    :cond_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_2

    .line 4
    invoke-static {}, Lcom/kwad/sdk/utils/av;->usePhoneStateDisable()Z

    move-result p0

    .line 5
    invoke-static {p0, v0, v1}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 6
    :cond_2
    invoke-static {}, Lcom/kwad/sdk/utils/av;->usePhoneStateDisable()Z

    move-result p1

    const/4 v2, 0x1

    if-nez p1, :cond_5

    invoke-static {}, Lcom/kwad/sdk/utils/o;->LY()Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    .line 7
    :cond_3
    invoke-static {p0}, Lcom/kwad/sdk/utils/SystemUtil;->di(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 v2, 0x3

    .line 8
    :cond_4
    invoke-static {v1, v0, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 9
    :cond_5
    :goto_0
    invoke-static {v1, v0, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static init(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/aw;->cW(Landroid/content/Context;)Lcom/kwad/sdk/e/c;

    move-result-object p0

    invoke-static {p0}, Lcom/kwad/sdk/e/b;->a(Lcom/kwad/sdk/e/c;)V

    return-void
.end method

.method static synthetic j(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x1

    .line 1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/aw;->c(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic k(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x1

    .line 1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/aw;->d(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic l(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x1

    .line 1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/aw;->e(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic m(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x1

    .line 1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/aw;->f(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic n(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x1

    .line 1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/aw;->g(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic o(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x1

    .line 1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/aw;->h(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static o(Landroid/content/Context;I)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I)",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/utils/bv$a;",
            ">;"
        }
    .end annotation

    const/16 p1, 0xf

    .line 2
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/bv;->o(Landroid/content/Context;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic p(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x1

    .line 1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/aw;->i(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic q(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/aw;->cQ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic r(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/aw;->cS(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic s(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/aw;->cV(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic t(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/aw;->cU(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
