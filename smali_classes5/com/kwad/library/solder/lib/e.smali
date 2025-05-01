.class public final Lcom/kwad/library/solder/lib/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/library/solder/lib/a/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/library/solder/lib/e$b;,
        Lcom/kwad/library/solder/lib/e$a;
    }
.end annotation


# instance fields
.field private final ajN:Lcom/kwad/library/solder/lib/ext/c;

.field private final ajP:Lcom/kwad/library/solder/lib/a/c;

.field private final ajQ:Lcom/kwad/library/solder/lib/a/f;

.field private final ajR:Lcom/kwad/library/solder/lib/a/b;

.field private final ajS:Lcom/kwad/library/solder/lib/ext/a;

.field private ajT:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kwad/library/solder/lib/e$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kwad/library/solder/lib/a/c;Lcom/kwad/library/solder/lib/a/f;Lcom/kwad/library/solder/lib/a/b;Lcom/kwad/library/solder/lib/ext/c;Lcom/kwad/library/solder/lib/ext/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/library/solder/lib/e;->ajP:Lcom/kwad/library/solder/lib/a/c;

    .line 3
    iput-object p2, p0, Lcom/kwad/library/solder/lib/e;->ajQ:Lcom/kwad/library/solder/lib/a/f;

    .line 4
    iput-object p3, p0, Lcom/kwad/library/solder/lib/e;->ajR:Lcom/kwad/library/solder/lib/a/b;

    .line 5
    iput-object p4, p0, Lcom/kwad/library/solder/lib/e;->ajN:Lcom/kwad/library/solder/lib/ext/c;

    .line 6
    iput-object p5, p0, Lcom/kwad/library/solder/lib/e;->ajS:Lcom/kwad/library/solder/lib/ext/a;

    return-void
.end method

.method private declared-synchronized a(Ljava/lang/String;Lcom/kwad/library/solder/lib/e$b;)V
    .locals 1

    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/kwad/library/solder/lib/e;->ajT:Ljava/util/Map;

    invoke-static {v0}, Lcom/kwad/library/solder/lib/e;->d(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/library/solder/lib/e;->ajT:Ljava/util/Map;

    if-eqz p1, :cond_0

    .line 7
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private b(Lcom/kwad/library/solder/lib/a/e;Lcom/kwad/library/solder/lib/e$a;)Lcom/kwad/library/solder/lib/e$b;
    .locals 2
    .param p1    # Lcom/kwad/library/solder/lib/a/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/kwad/library/solder/lib/e$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Lcom/kwad/library/solder/lib/a/e;->xT()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/kwad/library/solder/lib/e;->bK(Ljava/lang/String;)Lcom/kwad/library/solder/lib/e$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/library/solder/lib/e$b;->cancel()V

    .line 3
    :cond_0
    invoke-virtual {p1, p0}, Lcom/kwad/library/solder/lib/a/e;->a(Lcom/kwad/library/solder/lib/a/d;)Lcom/kwad/library/solder/lib/a/e;

    .line 4
    iget-object v0, p0, Lcom/kwad/library/solder/lib/e;->ajN:Lcom/kwad/library/solder/lib/ext/c;

    .line 5
    invoke-virtual {v0}, Lcom/kwad/library/solder/lib/ext/c;->ym()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/kwad/library/solder/lib/e$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/kwad/library/solder/lib/e$1;-><init>(Lcom/kwad/library/solder/lib/e;Lcom/kwad/library/solder/lib/a/e;Lcom/kwad/library/solder/lib/e$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p2

    .line 6
    new-instance v0, Lcom/kwad/library/solder/lib/e$b;

    invoke-direct {v0, p1, p2}, Lcom/kwad/library/solder/lib/e$b;-><init>(Lcom/kwad/library/solder/lib/a/e;Ljava/util/concurrent/Future;)V

    .line 7
    invoke-virtual {p1}, Lcom/kwad/library/solder/lib/a/e;->xT()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lcom/kwad/library/solder/lib/e;->a(Ljava/lang/String;Lcom/kwad/library/solder/lib/e$b;)V

    return-object v0
.end method

.method private declared-synchronized bK(Ljava/lang/String;)Lcom/kwad/library/solder/lib/e$b;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/library/solder/lib/e;->ajT:Ljava/util/Map;

    invoke-static {v0}, Lcom/kwad/library/solder/lib/e;->d(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/library/solder/lib/e;->ajT:Ljava/util/Map;

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/kwad/library/solder/lib/e$b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    const/4 p1, 0x0

    .line 3
    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private static d(Ljava/util/Map;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kwad/library/solder/lib/e$b;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kwad/library/solder/lib/e$b;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    if-ne p0, v0, :cond_1

    .line 2
    :cond_0
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    :cond_1
    return-object p0
.end method


# virtual methods
.method public final a(Lcom/kwad/library/solder/lib/a/e;Lcom/kwad/library/solder/lib/e$a;)Lcom/kwad/library/solder/lib/a/e;
    .locals 1
    .param p1    # Lcom/kwad/library/solder/lib/a/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/kwad/library/solder/lib/e$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Lcom/kwad/library/solder/lib/a/e;->xP()Lcom/kwad/library/solder/lib/a/d;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1, p0}, Lcom/kwad/library/solder/lib/a/e;->a(Lcom/kwad/library/solder/lib/a/d;)Lcom/kwad/library/solder/lib/a/e;

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/kwad/library/solder/lib/a/e;->xT()Ljava/lang/String;

    invoke-virtual {p1}, Lcom/kwad/library/solder/lib/a/e;->xQ()Ljava/lang/String;

    .line 4
    invoke-virtual {p2, p1}, Lcom/kwad/library/solder/lib/e$a;->j(Lcom/kwad/library/solder/lib/a/e;)V

    return-object p1
.end method

.method public final a(Lcom/kwad/library/solder/lib/a/e;I)Lcom/kwad/library/solder/lib/e$b;
    .locals 0
    .param p1    # Lcom/kwad/library/solder/lib/a/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/16 p2, 0x10

    .line 5
    invoke-static {p0, p2}, Lcom/kwad/library/solder/lib/e$a;->a(Lcom/kwad/library/solder/lib/a/d;I)Lcom/kwad/library/solder/lib/e$a;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/kwad/library/solder/lib/e;->b(Lcom/kwad/library/solder/lib/a/e;Lcom/kwad/library/solder/lib/e$a;)Lcom/kwad/library/solder/lib/e$b;

    move-result-object p1

    return-object p1
.end method

.method public final i(Lcom/kwad/library/solder/lib/a/e;)V
    .locals 1
    .param p1    # Lcom/kwad/library/solder/lib/a/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Lcom/kwad/library/solder/lib/a/e;->xT()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/kwad/library/solder/lib/e;->bK(Ljava/lang/String;)Lcom/kwad/library/solder/lib/e$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/library/solder/lib/e$b;->cancel()V

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/kwad/library/solder/lib/a/e;->xT()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/kwad/library/solder/lib/e;->a(Ljava/lang/String;Lcom/kwad/library/solder/lib/e$b;)V

    return-void
.end method

.method public final xC()Lcom/kwad/library/solder/lib/ext/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/e;->ajN:Lcom/kwad/library/solder/lib/ext/c;

    return-object v0
.end method

.method public final xD()Lcom/kwad/library/solder/lib/a/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/e;->ajP:Lcom/kwad/library/solder/lib/a/c;

    return-object v0
.end method

.method public final xE()Lcom/kwad/library/solder/lib/a/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/e;->ajQ:Lcom/kwad/library/solder/lib/a/f;

    return-object v0
.end method

.method public final xF()Lcom/kwad/library/solder/lib/a/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/e;->ajR:Lcom/kwad/library/solder/lib/a/b;

    return-object v0
.end method

.method public final xG()Lcom/kwad/library/solder/lib/ext/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/e;->ajS:Lcom/kwad/library/solder/lib/ext/a;

    return-object v0
.end method
