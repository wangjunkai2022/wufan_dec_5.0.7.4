.class public final Lcom/kwad/sdk/utils/a/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static aKH:Ljava/util/concurrent/ExecutorService;

.field static aQk:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/kwad/sdk/utils/a/e;->aKH:Ljava/util/concurrent/ExecutorService;

    .line 2
    invoke-static {}, Lcom/kwad/sdk/utils/a/e;->OA()Z

    move-result v0

    sput-boolean v0, Lcom/kwad/sdk/utils/a/e;->aQk:Z

    return-void
.end method

.method private static OA()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/utils/a/e;->aKH:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, Lcom/kwad/sdk/utils/a/d;->setExecutor(Ljava/util/concurrent/Executor;)V

    .line 2
    new-instance v0, Lcom/kwad/sdk/utils/a/e$1;

    invoke-direct {v0}, Lcom/kwad/sdk/utils/a/e$1;-><init>()V

    invoke-static {v0}, Lcom/kwad/sdk/utils/a/d;->a(Lcom/kwad/sdk/utils/a/c$d;)V

    const/4 v0, 0x1

    .line 3
    sput-boolean v0, Lcom/kwad/sdk/utils/a/e;->aQk:Z

    return v0
.end method

.method public static av(Landroid/content/Context;Ljava/lang/String;)Lcom/kwad/sdk/utils/a/c;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget-boolean v0, Lcom/kwad/sdk/utils/a/e;->aQk:Z

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/kwad/sdk/utils/a/e;->OA()Z

    :cond_0
    const-string v0, "ks_union"

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/utils/q;->O(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 4
    new-instance v0, Lcom/kwad/sdk/utils/a/c$a;

    invoke-direct {v0, p0, p1}, Lcom/kwad/sdk/utils/a/c$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0}, Lcom/kwad/sdk/utils/a/c$a;->Oy()Lcom/kwad/sdk/utils/a/c;

    move-result-object p0

    return-object p0
.end method
