.class public Lcom/kingja/loadsir/core/c;
.super Ljava/lang/Object;
.source "LoadSir.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kingja/loadsir/core/c$b;
    }
.end annotation


# static fields
.field private static volatile b:Lcom/kingja/loadsir/core/c;


# instance fields
.field private a:Lcom/kingja/loadsir/core/c$b;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/kingja/loadsir/core/c$b;

    invoke-direct {v0}, Lcom/kingja/loadsir/core/c$b;-><init>()V

    iput-object v0, p0, Lcom/kingja/loadsir/core/c;->a:Lcom/kingja/loadsir/core/c$b;

    return-void
.end method

.method private constructor <init>(Lcom/kingja/loadsir/core/c$b;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/kingja/loadsir/core/c;->a:Lcom/kingja/loadsir/core/c$b;

    return-void
.end method

.method synthetic constructor <init>(Lcom/kingja/loadsir/core/c$b;Lcom/kingja/loadsir/core/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kingja/loadsir/core/c;-><init>(Lcom/kingja/loadsir/core/c$b;)V

    return-void
.end method

.method static synthetic a(Lcom/kingja/loadsir/core/c;Lcom/kingja/loadsir/core/c$b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kingja/loadsir/core/c;->g(Lcom/kingja/loadsir/core/c$b;)V

    return-void
.end method

.method public static b()Lcom/kingja/loadsir/core/c$b;
    .locals 1

    .line 1
    new-instance v0, Lcom/kingja/loadsir/core/c$b;

    invoke-direct {v0}, Lcom/kingja/loadsir/core/c$b;-><init>()V

    return-object v0
.end method

.method public static c()Lcom/kingja/loadsir/core/c;
    .locals 2

    .line 1
    sget-object v0, Lcom/kingja/loadsir/core/c;->b:Lcom/kingja/loadsir/core/c;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/kingja/loadsir/core/c;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/kingja/loadsir/core/c;->b:Lcom/kingja/loadsir/core/c;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/kingja/loadsir/core/c;

    invoke-direct {v1}, Lcom/kingja/loadsir/core/c;-><init>()V

    sput-object v1, Lcom/kingja/loadsir/core/c;->b:Lcom/kingja/loadsir/core/c;

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
    sget-object v0, Lcom/kingja/loadsir/core/c;->b:Lcom/kingja/loadsir/core/c;

    return-object v0
.end method

.method private g(Lcom/kingja/loadsir/core/c$b;)V
    .locals 0
    .param p1    # Lcom/kingja/loadsir/core/c$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/kingja/loadsir/core/c;->a:Lcom/kingja/loadsir/core/c$b;

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;)Lcom/kingja/loadsir/core/b;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, v0}, Lcom/kingja/loadsir/core/c;->f(Ljava/lang/Object;Lcom/kingja/loadsir/callback/Callback$OnReloadListener;Lcom/kingja/loadsir/core/a;)Lcom/kingja/loadsir/core/b;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/Object;Lcom/kingja/loadsir/callback/Callback$OnReloadListener;)Lcom/kingja/loadsir/core/b;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lcom/kingja/loadsir/core/c;->f(Ljava/lang/Object;Lcom/kingja/loadsir/callback/Callback$OnReloadListener;Lcom/kingja/loadsir/core/a;)Lcom/kingja/loadsir/core/b;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/Object;Lcom/kingja/loadsir/callback/Callback$OnReloadListener;Lcom/kingja/loadsir/core/a;)Lcom/kingja/loadsir/core/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lcom/kingja/loadsir/callback/Callback$OnReloadListener;",
            "Lcom/kingja/loadsir/core/a<",
            "TT;>;)",
            "Lcom/kingja/loadsir/core/b;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kingja/loadsir/core/c;->a:Lcom/kingja/loadsir/core/c$b;

    invoke-virtual {v0}, Lcom/kingja/loadsir/core/c$b;->g()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Lj2/b;->a(Ljava/lang/Object;Ljava/util/List;)Lk2/b;

    move-result-object v0

    .line 2
    invoke-interface {v0, p1, p2}, Lk2/b;->a(Ljava/lang/Object;Lcom/kingja/loadsir/callback/Callback$OnReloadListener;)Lcom/kingja/loadsir/core/LoadLayout;

    move-result-object p1

    .line 3
    new-instance p2, Lcom/kingja/loadsir/core/b;

    iget-object v0, p0, Lcom/kingja/loadsir/core/c;->a:Lcom/kingja/loadsir/core/c$b;

    invoke-direct {p2, p3, p1, v0}, Lcom/kingja/loadsir/core/b;-><init>(Lcom/kingja/loadsir/core/a;Lcom/kingja/loadsir/core/LoadLayout;Lcom/kingja/loadsir/core/c$b;)V

    return-object p2
.end method
