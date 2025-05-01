.class public final Lcom/kwad/sdk/kgeo/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static aKd:Ljava/lang/String;

.field private static aKe:Lcom/kwad/sdk/kgeo/KGeoInfo;

.field private static final aKf:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    sput-object v0, Lcom/kwad/sdk/kgeo/a;->aKf:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static JD()Lcom/kwad/sdk/kgeo/KGeoInfo;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    sget-object v0, Lcom/kwad/sdk/kgeo/a;->aKe:Lcom/kwad/sdk/kgeo/KGeoInfo;

    return-object v0
.end method

.method private static JE()V
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Lcom/kwad/sdk/kgeo/a;->aKf:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lw()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/kwad/sdk/kgeo/a$2;

    invoke-direct {v1}, Lcom/kwad/sdk/kgeo/a$2;-><init>()V

    invoke-static {v0, v1}, Lcom/kwad/sdk/kgeo/c;->a(Landroid/content/Context;Lcom/kwad/sdk/kgeo/c$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private static JF()V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lcom/kwad/sdk/kgeo/a$3;

    invoke-direct {v0}, Lcom/kwad/sdk/kgeo/a$3;-><init>()V

    .line 2
    new-instance v1, Lcom/kwad/sdk/kgeo/a$4;

    invoke-direct {v1}, Lcom/kwad/sdk/kgeo/a$4;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/network/l;->request(Lcom/kwad/sdk/core/network/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method static synthetic a(Lcom/kwad/sdk/kgeo/KGeoInfo;)Lcom/kwad/sdk/kgeo/KGeoInfo;
    .locals 0

    .line 1
    sput-object p0, Lcom/kwad/sdk/kgeo/a;->aKe:Lcom/kwad/sdk/kgeo/KGeoInfo;

    return-object p0
.end method

.method static synthetic access$102(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    sput-object p0, Lcom/kwad/sdk/kgeo/a;->aKd:Ljava/lang/String;

    return-object p0
.end method

.method public static dC(I)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/kgeo/a;->JE()V

    return-void

    :cond_1
    const/4 v0, 0x2

    if-ne p0, v0, :cond_2

    .line 2
    invoke-static {}, Lcom/kwad/components/core/request/b;->qN()Lcom/kwad/components/core/request/b;

    move-result-object p0

    new-instance v0, Lcom/kwad/sdk/kgeo/a$1;

    invoke-direct {v0}, Lcom/kwad/sdk/kgeo/a$1;-><init>()V

    .line 3
    invoke-virtual {p0, v0}, Lcom/kwad/components/core/request/b;->a(Lcom/kwad/components/core/request/b$a;)V

    :cond_2
    return-void
.end method

.method static synthetic nx()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/kwad/sdk/kgeo/a;->JF()V

    return-void
.end method

.method static synthetic qT()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/kwad/sdk/kgeo/a;->JE()V

    return-void
.end method

.method public static yZ()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    sget-object v0, Lcom/kwad/sdk/kgeo/a;->aKd:Ljava/lang/String;

    return-object v0
.end method
