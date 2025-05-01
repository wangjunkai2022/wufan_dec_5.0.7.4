.class public final Lcom/kwad/sdk/utils/ba;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/utils/ba$b;,
        Lcom/kwad/sdk/utils/ba$a;
    }
.end annotation


# static fields
.field private static aQQ:Landroid/content/Context;

.field private static aQR:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kwad/sdk/utils/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/kwad/sdk/utils/ba;->aQR:Ljava/util/Map;

    return-void
.end method

.method public static Lg()Lcom/kwad/sdk/k/a/b;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/ba;->Nm()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const-string v0, "baseStationEnable"

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/utils/ba;->gV(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/k/a/b;

    return-object v0
.end method

.method public static Lh()Lcom/kwad/sdk/k/a/f;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/ba;->Nm()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const-string v0, "simCardInfoEnable"

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/utils/ba;->gV(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/k/a/f;

    return-object v0
.end method

.method private static Nm()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/utils/ba;->aQQ:Landroid/content/Context;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static gU(Ljava/lang/String;)Lcom/kwad/sdk/utils/j;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lcom/kwad/sdk/utils/j<",
            "TT;>;"
        }
    .end annotation

    .line 1
    :try_start_0
    sget-object v0, Lcom/kwad/sdk/utils/ba;->aQR:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/kwad/sdk/utils/j;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static gV(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/ba;->gU(Ljava/lang/String;)Lcom/kwad/sdk/utils/j;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 2
    sget-object v0, Lcom/kwad/sdk/utils/ba;->aQQ:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/utils/j;->cb(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static init(Landroid/content/Context;)V
    .locals 5

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    if-nez v0, :cond_1

    const-string p0, "SensitiveInfoCollectors"

    const-string v0, "init sdkConfigProvider is null"

    .line 2
    invoke-static {p0, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/utils/ba;->Nm()Z

    move-result v1

    const-string v2, "simCardInfoEnable"

    const-string v3, "baseStationEnable"

    if-eqz v1, :cond_4

    .line 4
    sget-object p0, Lcom/kwad/sdk/utils/ba;->aQR:Ljava/util/Map;

    invoke-interface {p0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 5
    invoke-interface {v0}, Lcom/kwad/sdk/service/a/h;->zi()Z

    move-result p0

    .line 6
    invoke-static {v3}, Lcom/kwad/sdk/utils/ba;->gU(Ljava/lang/String;)Lcom/kwad/sdk/utils/j;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {v1, p0}, Lcom/kwad/sdk/utils/j;->bQ(Z)V

    .line 8
    :cond_2
    sget-object p0, Lcom/kwad/sdk/utils/ba;->aQR:Ljava/util/Map;

    invoke-interface {p0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    .line 9
    invoke-interface {v0}, Lcom/kwad/sdk/service/a/h;->zg()Z

    move-result p0

    .line 10
    invoke-static {v2}, Lcom/kwad/sdk/utils/ba;->gU(Ljava/lang/String;)Lcom/kwad/sdk/utils/j;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 11
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/utils/j;->bQ(Z)V

    :cond_3
    return-void

    .line 12
    :cond_4
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/kwad/sdk/utils/ba;->aQQ:Landroid/content/Context;

    .line 13
    sget-object p0, Lcom/kwad/sdk/utils/ba;->aQR:Ljava/util/Map;

    new-instance v1, Lcom/kwad/sdk/utils/ba$a;

    .line 14
    invoke-interface {v0}, Lcom/kwad/sdk/service/a/h;->zi()Z

    move-result v4

    invoke-direct {v1, v4}, Lcom/kwad/sdk/utils/ba$a;-><init>(Z)V

    .line 15
    invoke-interface {p0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    sget-object p0, Lcom/kwad/sdk/utils/ba;->aQR:Ljava/util/Map;

    new-instance v1, Lcom/kwad/sdk/utils/ba$b;

    .line 17
    invoke-interface {v0}, Lcom/kwad/sdk/service/a/h;->zg()Z

    move-result v0

    invoke-direct {v1, v0}, Lcom/kwad/sdk/utils/ba$b;-><init>(Z)V

    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    return-void
.end method
