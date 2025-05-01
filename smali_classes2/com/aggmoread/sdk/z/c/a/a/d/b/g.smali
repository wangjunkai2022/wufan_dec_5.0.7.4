.class public final Lcom/aggmoread/sdk/z/c/a/a/d/b/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/c/a/a/d/b/g$k;,
        Lcom/aggmoread/sdk/z/c/a/a/d/b/g$l;
    }
.end annotation


# static fields
.field static b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/b;",
            ">;"
        }
    .end annotation
.end field

.field static c:Lcom/aggmoread/sdk/z/c/a/a/d/b/h;


# instance fields
.field private a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->b:Ljava/util/Map;

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/h;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/h;

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/h;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a:Z

    sput-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->q:Landroid/content/Context;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->s:Ljava/lang/Boolean;

    const/16 p1, 0x64

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(I)V

    const/16 p1, 0x2766

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(I)V

    const/16 p1, 0x69

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(I)V

    const/16 p1, 0x65

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(I)V

    const/16 p1, 0x6a

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(I)V

    const/16 p1, 0x6b

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(I)V

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(I)V

    const/16 p1, 0x1f4

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(I)V

    const/16 p1, 0x1f5

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(I)V

    const/16 p1, 0x1f6

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(I)V

    const/16 p1, 0x1f7

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(I)V

    const/16 p1, 0x1f8

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(I)V

    const/16 p1, 0x1f9

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(I)V

    const/16 p1, 0x1fa

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(I)V

    return-void
.end method

.method private a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)I
    .locals 1

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->D:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;)I

    move-result p1

    const/16 v0, 0xe10

    if-le p1, v0, :cond_0

    const/16 p1, 0xe10

    :cond_0
    return p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/b/g;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)I
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)I

    move-result p0

    return p0
.end method

.method public static a()Lcom/aggmoread/sdk/z/c/a/a/d/b/h;
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/h;

    return-object v0
.end method

.method private a(I)V
    .locals 4

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/16 v1, 0x64

    if-eq p1, v1, :cond_3

    const/16 v1, 0x69

    if-eq p1, v1, :cond_2

    const/16 v1, 0x6b

    if-eq p1, v1, :cond_1

    const/16 v1, 0x2766

    if-eq p1, v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    :try_start_0
    const-class v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/a;

    goto :goto_0

    :cond_1
    const-class v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/a;

    goto :goto_0

    :cond_2
    const-class v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/s/a;

    goto :goto_0

    :cond_3
    const-class v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/c;

    goto :goto_0

    :cond_4
    const-class v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/b;

    :goto_0
    if-eqz v1, :cond_5

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    new-array v0, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/b;

    if-eqz v1, :cond_5

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/b;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "err "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;)V

    :cond_5
    :goto_1
    return-void
.end method

.method public static a(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V
    .locals 3

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->f()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x2766

    :cond_0
    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->b:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/b;

    if-nez v1, :cond_1

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$g;

    invoke-direct {v1, p0, v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$g;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;ILcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/b;->a()Z

    move-result v2

    if-nez v2, :cond_2

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$h;

    invoke-direct {v1, p0, v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$h;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;ILcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;)Z

    return-void

    :cond_2
    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$i;

    invoke-direct {v0, v1, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$i;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/b;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/c;

    invoke-direct {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/c;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public a(Landroid/content/Context;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/c;

    invoke-direct {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/c;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public a(Landroid/os/Handler$Callback;Lcom/aggmoread/sdk/z/c/a/a/d/b/h;)Ljava/lang/Object;
    .locals 5

    const/16 v0, 0x13

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/m;->a(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    if-eqz p2, :cond_1

    sput-object p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/h;

    :cond_1
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->b()V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->q:Landroid/content/Context;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/d;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->b()V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->a()Lcom/aggmoread/sdk/z/c/a/a/e/h;

    move-result-object v0

    const-string v2, "debugFile"

    invoke-virtual {v0, v2, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->a()Lcom/aggmoread/sdk/z/c/a/a/e/h;

    move-result-object v0

    const/4 v2, 0x0

    const-string v3, "debugLog"

    invoke-virtual {v0, v3, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->a(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->r:Ljava/lang/Boolean;

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->w()V

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/e/d;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    :try_start_0
    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->q:Landroid/content/Context;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->r:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-static {v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/b;->a(Landroid/content/Context;Z)Z

    const-string v2, "UTF-8"

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "Content-type"

    const-string v4, "application/json"

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->e()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$a;

    invoke-direct {v4, p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g;Landroid/os/Handler$Callback;Lcom/aggmoread/sdk/z/c/a/a/d/b/h;)V

    invoke-static {v3, v0, v2, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/d;->a(Ljava/lang/String;[BLjava/util/Map;Lcom/aggmoread/sdk/z/c/a/a/e/d$c;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a:Z

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->s:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-object v1
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/c/g;)V
    .locals 2

    check-cast p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->a()V

    const/16 v0, 0x13

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/m;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$c;

    invoke-direct {v0, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$c;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "init "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a:Z

    if-nez v0, :cond_1

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$d;

    invoke-direct {v0, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$d;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/m;->d()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_2

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$e;

    invoke-direct {v0, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$e;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;)Z

    return-void

    :cond_2
    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;

    invoke-direct {v0, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;)V

    invoke-virtual {p0, p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/g$k;)V

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/g$k;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sc_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/b;->a(Ljava/lang/String;)Lcom/aggmoread/sdk/z/c/a/a/e/b;

    move-result-object v0

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b;

    invoke-direct {v1, p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/g$k;)V

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/b;->a(Lcom/aggmoread/sdk/z/c/a/a/e/b$c;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-interface {v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/e/b$c;->a(Lcom/aggmoread/sdk/z/c/a/a/e/b;)V

    :goto_0
    return-void
.end method

.method public b()V
    .locals 3

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/b;->a()V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->f()V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->i()V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a()V

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$l;->a:Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$l;->b:Ljava/lang/Object;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->e([Ljava/lang/Object;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->e(Ljava/lang/String;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->l:Ljava/lang/String;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->f(Ljava/lang/String;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->m(Ljava/lang/String;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->n(Ljava/lang/String;)V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->g()V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->o(Ljava/lang/String;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->n:Ljava/lang/String;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->p(Ljava/lang/String;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->j:Ljava/lang/String;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->q(Ljava/lang/String;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->f:Ljava/lang/String;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->r(Ljava/lang/String;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->o:Ljava/lang/String;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->s(Ljava/lang/String;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->h:Ljava/lang/String;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->t(Ljava/lang/String;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->i:Ljava/lang/String;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->g(Ljava/lang/String;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->g:Ljava/lang/String;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->h(Ljava/lang/String;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->m:Ljava/lang/String;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->i(Ljava/lang/String;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->k:Ljava/lang/String;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->j(Ljava/lang/String;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->d:Ljava/lang/String;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->k(Ljava/lang/String;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->p:Ljava/lang/String;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->l(Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/g$k;)V
    .locals 4

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->b()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "params is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AMGTAG"

    invoke-static {v2, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "Content-type"

    const-string v3, "application/json"

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    const-string v2, "UTF-8"

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$j;

    invoke-direct {v3, p0, p2, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$j;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g;Lcom/aggmoread/sdk/z/c/a/a/d/b/g$k;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;)V

    invoke-static {v2, v0, v1, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/d;->a(Ljava/lang/String;[BLjava/util/Map;Lcom/aggmoread/sdk/z/c/a/a/e/d$c;)V

    return-void

    :catch_0
    new-instance p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    const v0, 0x3baa1414

    const-string v1, "HTTP error, request error"

    invoke-direct {p1, v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p2, v0, v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$k;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;[BLcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method
