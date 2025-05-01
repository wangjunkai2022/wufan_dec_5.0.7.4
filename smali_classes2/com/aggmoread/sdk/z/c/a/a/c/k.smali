.class public Lcom/aggmoread/sdk/z/c/a/a/c/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/c/a/a/c/k$d;,
        Lcom/aggmoread/sdk/z/c/a/a/c/k$e;,
        Lcom/aggmoread/sdk/z/c/a/a/c/k$f;
    }
.end annotation


# direct methods
.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)I
    .locals 0

    invoke-static {p0}, Lcom/aggmoread/sdk/z/c/a/a/c/k;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)I

    move-result p0

    return p0
.end method

.method static synthetic a(Ljava/util/Map;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Lcom/aggmoread/sdk/z/c/a/a/c/k$f;
    .locals 0

    invoke-static {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/k;->b(Ljava/util/Map;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Lcom/aggmoread/sdk/z/c/a/a/c/k$f;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/c/k$d;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/k;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/c/k$d;)V

    return-void
.end method

.method private static a(Ljava/lang/String;Lcom/aggmoread/sdk/z/c/a/a/c/k$d;)V
    .locals 2

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    invoke-direct {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;-><init>()V

    iput-object p0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->i:Ljava/lang/String;

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sc_"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->i:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/aggmoread/sdk/z/c/a/a/e/b;->a(Ljava/lang/String;)Lcom/aggmoread/sdk/z/c/a/a/e/b;

    move-result-object p0

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/c/k$c;

    invoke-direct {v1, v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/k$c;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/c/k$d;)V

    if-eqz p0, :cond_0

    invoke-virtual {p0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/b;->a(Lcom/aggmoread/sdk/z/c/a/a/e/b$c;)V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    invoke-interface {v1, p0}, Lcom/aggmoread/sdk/z/c/a/a/e/b$c;->a(Lcom/aggmoread/sdk/z/c/a/a/e/b;)V

    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/util/Map;Lcom/aggmoread/sdk/z/c/a/a/c/k$e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/aggmoread/sdk/z/c/a/a/c/k$e;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->s:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    invoke-interface {p2, p0}, Lcom/aggmoread/sdk/z/c/a/a/c/k$e;->callback(Lcom/aggmoread/sdk/z/c/a/a/c/k$f;)V

    return-void

    :cond_0
    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/c/k$a;

    invoke-direct {v0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/k$a;-><init>(Ljava/util/Map;Lcom/aggmoread/sdk/z/c/a/a/c/k$e;)V

    invoke-static {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/c/k;->a(Ljava/lang/String;Lcom/aggmoread/sdk/z/c/a/a/c/k$d;)V

    return-void
.end method

.method private static b(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)I
    .locals 1

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->D:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;)I

    move-result p0

    const/16 v0, 0xe10

    if-le p0, v0, :cond_0

    const/16 p0, 0xe10

    :cond_0
    return p0
.end method

.method private static b(Ljava/util/Map;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Lcom/aggmoread/sdk/z/c/a/a/c/k$f;
    .locals 6

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/c/k$f;

    invoke-direct {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/k$f;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d()Z

    iget-object v2, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->T:Ljava/lang/Object;

    const-string v4, ""

    invoke-virtual {v2, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v5, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->X:Ljava/lang/Object;

    invoke-virtual {v3, v5, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v5, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->Y:Ljava/lang/Object;

    invoke-virtual {v4, v5}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;)I

    move-result v4

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/e/m;->j(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v5, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->a0:Ljava/lang/Object;

    invoke-virtual {p1, v5}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;)I

    :cond_0
    const/16 p1, 0x64

    if-eq v4, p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a()Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;

    move-result-object p1

    invoke-virtual {p1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a()Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;

    move-result-object v2

    invoke-virtual {v2, p0, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/aggmoread/sdk/z/c/a/a/c/k$f;->a:Ljava/lang/String;

    iput-object p0, v0, Lcom/aggmoread/sdk/z/c/a/a/c/k$f;->b:Ljava/lang/String;

    :goto_0
    return-object v0
.end method

.method private static b(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/c/k$d;)V
    .locals 5

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/f;

    const/4 v1, 0x0

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/e/d;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;-><init>(Ljava/util/Map;)V

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/d$d;->a:Ljava/lang/Object;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->c:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/d$d;->b:Ljava/lang/Object;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->i:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a:Ljava/util/Map;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "Content-type"

    const-string v4, "application/json"

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    const-string v3, "UTF-8"

    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/aggmoread/sdk/z/c/a/a/c/k$b;

    invoke-direct {v3, p1, p0}, Lcom/aggmoread/sdk/z/c/a/a/c/k$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/c/k$d;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;)V

    invoke-static {v1, v0, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/d;->a(Ljava/lang/String;[BLjava/util/Map;Lcom/aggmoread/sdk/z/c/a/a/e/d$c;)V

    return-void

    :catch_0
    new-instance p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    const v0, 0x3baa1414

    const-string v2, "HTTP error, request error"

    invoke-direct {p0, v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, v1, v1, p0}, Lcom/aggmoread/sdk/z/c/a/a/c/k$d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;[BLcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method
