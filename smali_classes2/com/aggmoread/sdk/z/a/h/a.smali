.class public Lcom/aggmoread/sdk/z/a/h/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/a/h/a$a;
    }
.end annotation


# static fields
.field private static h:Lcom/aggmoread/sdk/z/a/h/a;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/aggmoread/sdk/z/a/g/a;

.field private c:Lcom/aggmoread/sdk/z/a/g/h;

.field private d:Z

.field private e:Lcom/aggmoread/sdk/z/a/h/b;

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/aggmoread/sdk/z/a/h/a$a;",
            "Lcom/aggmoread/sdk/z/a/g/a;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/aggmoread/sdk/z/a/h/a$a;",
            "Lcom/aggmoread/sdk/z/a/g/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/aggmoread/sdk/z/a/g/h;->d:Lcom/aggmoread/sdk/z/a/g/h;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/h/a;->c:Lcom/aggmoread/sdk/z/a/g/h;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/h/a;->f:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/h/a;->g:Ljava/util/Map;

    return-void
.end method

.method public static declared-synchronized d()Lcom/aggmoread/sdk/z/a/h/a;
    .locals 2

    const-class v0, Lcom/aggmoread/sdk/z/a/h/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/aggmoread/sdk/z/a/h/a;->h:Lcom/aggmoread/sdk/z/a/h/a;

    if-nez v1, :cond_1

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v1, Lcom/aggmoread/sdk/z/a/h/a;->h:Lcom/aggmoread/sdk/z/a/h/a;

    if-nez v1, :cond_0

    new-instance v1, Lcom/aggmoread/sdk/z/a/h/a;

    invoke-direct {v1}, Lcom/aggmoread/sdk/z/a/h/a;-><init>()V

    sput-object v1, Lcom/aggmoread/sdk/z/a/h/a;->h:Lcom/aggmoread/sdk/z/a/h/a;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1

    :cond_1
    :goto_0
    sget-object v1, Lcom/aggmoread/sdk/z/a/h/a;->h:Lcom/aggmoread/sdk/z/a/h/a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-object v1

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/h/a;->a:Landroid/content/Context;

    return-object v0
.end method

.method public a(Lcom/aggmoread/sdk/z/a/h/a$a;)Lcom/aggmoread/sdk/z/a/g/a;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/h/a;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/h/a;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/aggmoread/sdk/z/a/g/a;

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/h/a;->b:Lcom/aggmoread/sdk/z/a/g/a;

    return-object p1
.end method

.method public a(Lcom/aggmoread/sdk/z/a/h/a$a;Lcom/aggmoread/sdk/z/a/g/h;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/h/a;->g:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Landroid/content/Context;Lcom/aggmoread/sdk/z/a/h/a$a;Lcom/aggmoread/sdk/z/a/g/a;Lcom/aggmoread/sdk/z/a/h/b;)Z
    .locals 2

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/h/a;->d:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/h/a;->f:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/h/a;->f:Ljava/util/Map;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return v1

    :cond_1
    if-eqz p1, :cond_4

    if-nez p3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/h/a;->a:Landroid/content/Context;

    if-eqz p2, :cond_3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/h/a;->f:Ljava/util/Map;

    invoke-interface {v0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/h/a;->f:Ljava/util/Map;

    sget-object v0, Lcom/aggmoread/sdk/z/a/h/a$a;->b:Lcom/aggmoread/sdk/z/a/h/a$a;

    invoke-interface {p2, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, Lcom/aggmoread/sdk/z/a/h/a;->b:Lcom/aggmoread/sdk/z/a/g/a;

    :goto_0
    iput-object p4, p0, Lcom/aggmoread/sdk/z/a/h/a;->e:Lcom/aggmoread/sdk/z/a/h/b;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/m/f;->a(Landroid/content/Context;)V

    iput-boolean v1, p0, Lcom/aggmoread/sdk/z/a/h/a;->d:Z

    return v1

    :cond_4
    :goto_1
    iget-boolean p1, p0, Lcom/aggmoread/sdk/z/a/h/a;->d:Z

    return p1
.end method

.method public b()Lcom/aggmoread/sdk/z/a/g/a;
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/z/a/h/a$a;->b:Lcom/aggmoread/sdk/z/a/h/a$a;

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/a/h/a;->a(Lcom/aggmoread/sdk/z/a/h/a$a;)Lcom/aggmoread/sdk/z/a/g/a;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/aggmoread/sdk/z/a/h/a$a;)Lcom/aggmoread/sdk/z/a/g/h;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/h/a;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/h/a;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/aggmoread/sdk/z/a/g/h;

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/h/a;->c:Lcom/aggmoread/sdk/z/a/g/h;

    return-object p1
.end method

.method public c()Lcom/aggmoread/sdk/z/a/h/b;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/h/a;->e:Lcom/aggmoread/sdk/z/a/h/b;

    return-object v0
.end method

.method public e()Lcom/aggmoread/sdk/z/a/g/h;
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/z/a/h/a$a;->b:Lcom/aggmoread/sdk/z/a/h/a$a;

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/a/h/a;->b(Lcom/aggmoread/sdk/z/a/h/a$a;)Lcom/aggmoread/sdk/z/a/g/h;

    move-result-object v0

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/h/a;->d:Z

    return v0
.end method
