.class public Lcom/kwad/components/core/proxy/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile RD:Lcom/kwad/components/core/proxy/h;


# instance fields
.field private final mListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/core/proxy/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/proxy/h;->mListeners:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/proxy/h;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/proxy/h;->mListeners:Ljava/util/List;

    return-object p0
.end method

.method private c(Lcom/kwad/sdk/f/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/sdk/f/a<",
            "Lcom/kwad/components/core/proxy/i;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/components/core/proxy/h$5;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/core/proxy/h$5;-><init>(Lcom/kwad/components/core/proxy/h;Lcom/kwad/sdk/f/a;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->postOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static qG()Lcom/kwad/components/core/proxy/h;
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/components/core/proxy/h;->RD:Lcom/kwad/components/core/proxy/h;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/kwad/components/core/proxy/h;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/kwad/components/core/proxy/h;->RD:Lcom/kwad/components/core/proxy/h;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/kwad/components/core/proxy/h;

    invoke-direct {v1}, Lcom/kwad/components/core/proxy/h;-><init>()V

    sput-object v1, Lcom/kwad/components/core/proxy/h;->RD:Lcom/kwad/components/core/proxy/h;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/kwad/components/core/proxy/h;->RD:Lcom/kwad/components/core/proxy/h;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/proxy/c;Landroid/os/Bundle;)V
    .locals 1

    .line 2
    new-instance v0, Lcom/kwad/components/core/proxy/h$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/kwad/components/core/proxy/h$1;-><init>(Lcom/kwad/components/core/proxy/h;Lcom/kwad/components/core/proxy/c;Landroid/os/Bundle;)V

    invoke-direct {p0, v0}, Lcom/kwad/components/core/proxy/h;->c(Lcom/kwad/sdk/f/a;)V

    return-void
.end method

.method public final a(Lcom/kwad/components/core/proxy/i;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/proxy/h;->mListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final e(Lcom/kwad/components/core/proxy/c;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/proxy/h$2;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/core/proxy/h$2;-><init>(Lcom/kwad/components/core/proxy/h;Lcom/kwad/components/core/proxy/c;)V

    invoke-direct {p0, v0}, Lcom/kwad/components/core/proxy/h;->c(Lcom/kwad/sdk/f/a;)V

    return-void
.end method

.method public final f(Lcom/kwad/components/core/proxy/c;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/proxy/h$3;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/core/proxy/h$3;-><init>(Lcom/kwad/components/core/proxy/h;Lcom/kwad/components/core/proxy/c;)V

    invoke-direct {p0, v0}, Lcom/kwad/components/core/proxy/h;->c(Lcom/kwad/sdk/f/a;)V

    return-void
.end method

.method public final g(Lcom/kwad/components/core/proxy/c;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/proxy/h$4;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/core/proxy/h$4;-><init>(Lcom/kwad/components/core/proxy/h;Lcom/kwad/components/core/proxy/c;)V

    invoke-direct {p0, v0}, Lcom/kwad/components/core/proxy/h;->c(Lcom/kwad/sdk/f/a;)V

    return-void
.end method
