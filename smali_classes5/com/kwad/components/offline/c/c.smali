.class public final Lcom/kwad/components/offline/c/c;
.super Lcom/kwad/components/core/n/b/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/offline/c/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kwad/components/core/n/b/a<",
        "Lcom/kwad/components/offline/api/tk/ITkOfflineCompo;",
        ">;"
    }
.end annotation


# static fields
.field private static adG:J


# instance fields
.field private final adF:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/core/n/a/d/a;",
            ">;"
        }
    .end annotation
.end field

.field private final adH:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/n/b/a;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/offline/c/c;->adF:Ljava/util/List;

    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/kwad/components/offline/c/c;->adH:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/offline/c/c;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/offline/c/c;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/offline/c/c;->adH:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method private a(Landroid/content/Context;ZLcom/kwad/components/offline/api/tk/ITkOfflineCompo;)V
    .locals 11

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    .line 6
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sget-wide v2, Lcom/kwad/components/offline/c/c;->adG:J

    sub-long v6, v0, v2

    .line 7
    new-instance v9, Lcom/kwad/components/offline/c/d;

    invoke-direct {v9}, Lcom/kwad/components/offline/c/d;-><init>()V

    new-instance v10, Lcom/kwad/components/offline/c/c$1;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p3

    move v3, p2

    move-object v8, p1

    invoke-direct/range {v0 .. v8}, Lcom/kwad/components/offline/c/c$1;-><init>(Lcom/kwad/components/offline/c/c;Lcom/kwad/components/offline/api/tk/ITkOfflineCompo;ZJJLandroid/content/Context;)V

    invoke-interface {p3, p1, v9, v10}, Lcom/kwad/components/offline/api/IOfflineCompo;->init(Landroid/content/Context;Lcom/kwad/components/offline/api/IOfflineCompoInitConfig;Lcom/kwad/components/offline/api/InitCallBack;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/offline/c/c;I)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/kwad/components/core/n/b/a;->au(I)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/offline/c/c;IIJJ)V
    .locals 0

    .line 4
    invoke-direct/range {p0 .. p6}, Lcom/kwad/components/offline/c/c;->b(IIJJ)V

    return-void
.end method

.method public static au(Landroid/content/Context;)V
    .locals 2
    .annotation build Lcom/ksad/annotation/invoker/InvokeBy;
        invokerClass = Lcom/kwad/components/core/n/b/b;
        methodId = "initOC"
    .end annotation

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sput-wide v0, Lcom/kwad/components/offline/c/c;->adG:J

    .line 2
    invoke-static {}, Lcom/kwad/components/offline/c/c;->un()Lcom/kwad/components/offline/c/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/n/b/a;->init(Landroid/content/Context;)V

    return-void
.end method

.method private b(IIJJ)V
    .locals 9

    .line 3
    iget-object v0, p0, Lcom/kwad/components/offline/c/c;->adF:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/kwad/components/core/n/a/d/a;

    move v3, p1

    move v4, p2

    move-wide v5, p3

    move-wide v7, p5

    .line 4
    :try_start_0
    invoke-interface/range {v2 .. v8}, Lcom/kwad/components/core/n/a/d/a;->a(IIJJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 5
    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/kwad/components/offline/c/c;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/n/b/a;->pm()V

    return-void
.end method

.method public static un()Lcom/kwad/components/offline/c/c;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/offline/c/c$a;->uo()Lcom/kwad/components/offline/c/c;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/content/Context;ZLcom/kwad/components/offline/api/IOfflineCompo;)V
    .locals 0

    .line 2
    check-cast p3, Lcom/kwad/components/offline/api/tk/ITkOfflineCompo;

    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/components/offline/c/c;->a(Landroid/content/Context;ZLcom/kwad/components/offline/api/tk/ITkOfflineCompo;)V

    return-void
.end method

.method public final a(Lcom/kwad/components/core/n/a/d/a;)V
    .locals 8

    if-nez p1, :cond_0

    return-void

    .line 8
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/offline/c/c;->adH:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    move-object v1, p1

    .line 9
    invoke-interface/range {v1 .. v7}, Lcom/kwad/components/core/n/a/d/a;->a(IIJJ)V

    .line 10
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/offline/c/c;->adF:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 11
    invoke-static {p1}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b(Lcom/kwad/components/core/n/a/d/a;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/offline/c/c;->adF:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final getTag()Ljava/lang/String;
    .locals 1

    const-string v0, "TkInitModule"

    return-object v0
.end method

.method public final isEnabled()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/config/c;->asN:Lcom/kwad/sdk/core/config/item/d;

    invoke-static {v0}, Lcom/kwad/sdk/core/config/d;->b(Lcom/kwad/sdk/core/config/item/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final pn()Ljava/lang/String;
    .locals 1

    const-string v0, "TK"

    return-object v0
.end method

.method public final po()Ljava/lang/String;
    .locals 1

    const-string v0, "com.kwad.components.tachikoma"

    return-object v0
.end method

.method public final pp()Ljava/lang/String;
    .locals 1

    const-string v0, "3.3.64.1"

    return-object v0
.end method

.method public final pq()Ljava/lang/String;
    .locals 1

    const-string v0, " https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/offline_components/tk/ks_so-tachikomaNoSoRelease-3.3.64.1-30279a11a9-537.zip"

    return-object v0
.end method

.method public final pr()Ljava/lang/String;
    .locals 1

    const-string v0, "83a61ff3bc9f6b8f92b6336d6430be8d"

    return-object v0
.end method

.method public final ps()Ljava/lang/String;
    .locals 1

    const-string v0, "ks_tk_33641"

    return-object v0
.end method

.method public final pt()Ljava/lang/String;
    .locals 1

    const-string v0, "com.kwad.tachikoma.TkOfflineCompoImpl"

    return-object v0
.end method
