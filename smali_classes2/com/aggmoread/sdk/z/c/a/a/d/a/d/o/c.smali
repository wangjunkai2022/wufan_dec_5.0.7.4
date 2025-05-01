.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;


# instance fields
.field private a:Z


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;
    .locals 2

    const-class v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;

    if-nez v1, :cond_1

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;

    if-nez v1, :cond_0

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;

    invoke-direct {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;-><init>()V

    sput-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;

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
    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-object v1

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private b()Lcom/aggmoread/sdk/z/a/g/a;
    .locals 4

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a()Lcom/aggmoread/sdk/z/c/a/a/d/b/h;

    move-result-object v0

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c$a;

    invoke-direct {v1, p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;Lcom/aggmoread/sdk/z/c/a/a/d/b/h;)V

    :try_start_0
    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->q:Landroid/content/Context;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/p;->b(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/aggmoread/sdk/z/a/g/a;->c(I)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->q:Landroid/content/Context;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/p;->a(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/aggmoread/sdk/z/a/g/a;->a(I)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->q:Landroid/content/Context;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->c(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/aggmoread/sdk/z/a/g/a;->b(I)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->q:Landroid/content/Context;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/aggmoread/sdk/z/a/g/a;->j(Ljava/lang/String;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->q:Landroid/content/Context;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->f(Landroid/content/Context;)Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/aggmoread/sdk/z/a/g/a;->a(Z)V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->p()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/aggmoread/sdk/z/a/g/a;->g(Ljava/lang/String;)V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/aggmoread/sdk/z/a/g/a;->b(Ljava/lang/String;)V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/aggmoread/sdk/z/a/g/a;->c(Ljava/lang/String;)V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->v()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/aggmoread/sdk/z/a/g/a;->k(Ljava/lang/String;)V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->s()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/aggmoread/sdk/z/a/g/a;->c(J)V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->t()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/aggmoread/sdk/z/a/g/a;->i(Ljava/lang/String;)V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->k()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/aggmoread/sdk/z/a/g/a;->b(J)V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->h()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/aggmoread/sdk/z/a/g/a;->a(J)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->q:Landroid/content/Context;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->a(Landroid/content/Context;)F

    move-result v0

    invoke-virtual {v1, v0}, Lcom/aggmoread/sdk/z/a/g/a;->a(F)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c$b;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;)V

    invoke-virtual {v1, v0}, Lcom/aggmoread/sdk/z/a/g/a;->a(Lcom/aggmoread/sdk/z/a/g/a$a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-object v1
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 4

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->r:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/d;->a(Z)V

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;->a:Z

    if-nez v0, :cond_0

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->x()V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->A()V

    invoke-static {}, Lcom/aggmoread/sdk/z/a/h/a;->d()Lcom/aggmoread/sdk/z/a/h/a;

    move-result-object v0

    sget-object v1, Lcom/aggmoread/sdk/z/a/h/a$a;->b:Lcom/aggmoread/sdk/z/a/h/a$a;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;->b()Lcom/aggmoread/sdk/z/a/g/a;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/aggmoread/sdk/z/a/h/a;->a(Landroid/content/Context;Lcom/aggmoread/sdk/z/a/h/a$a;Lcom/aggmoread/sdk/z/a/g/a;Lcom/aggmoread/sdk/z/a/h/b;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;->a:Z

    new-instance p1, Lcom/aggmoread/sdk/z/a/g/h;

    invoke-direct {p1}, Lcom/aggmoread/sdk/z/a/g/h;-><init>()V

    const-string v0, "iVBORw0KGgoAAAANSUhEUgAAAGoAAAAkCAYAAABhc6+LAAAEgUlEQVRoge2az0sjZxjHH5M07mwybjIbpd2h2zAGyaEJXrLHCrm4oIcFD5LebI859WjRSy8iVDzFP2GDoJCDQvcSKXhKLsEcBMnMFmEuao0YaBoPUp50BnTezDi/k1nnA4HwPvO+82a+med9nud9x8AZIgDwGgBoAAgDQMCh+zwb7BZqHADeAsAEYfGxhJ1CxQAgCQBBwuJjGbuEQjf3nQNvqI+EHWvHK18k57Eq1FeSu/NFchirQrEAECJaPcDS0hJ1fn7+U6lUYp2eLd6jVqvNHR0dvSOMOrEi1AsAYIhWj5DP55mJiYnU8vLyzyiaXbMul8spZRvDMFQ6nf4QiURM38eKUAk9Lq/Vav14dXX1q/whLhiAmT5GKRaL4vHxcTkcDsd3dnaKdox5cHCQWVhYKIqiOHA8nudFolEnVoR6RbR4jMXFxaYoin9SFMXiQ7Y6+3Q63R+jUqlUCKNFzK4vIcn1jTS4JsTj8TjO8fT0lB80V57n+V6v1+10Ot1Bbmt6epoNh8P93zo7O/uJGEAC3efU1FTu4uKijm8rccGQhKKJlhFkZmYmR9N0/+FzHKc5wafsEqpCra+v/yB/bzQa8w9t0WgU80zI5XLvGo3GtLIv2imKirMsWyIGljArVJRoGVHu7u7aiUTiN6uzW11dVQ2c8G1KJpNzeC984Ph5aA+FQv0ggqbpN0obEolE2EAgoBlofNFCXV5etjiOI9yZGTY2Nq7Vum1vbxfwQW9tbf0+6Dp0qRhkVKvVSqFQaBED6MBMMIG1vJdE6zMF86NYLJbBoGSQSHZhRijPuD03wECj2+2Ka2trquuXHZhxfSMRSORyuZf1ev0fwuAyUiToqEhgUihLb5RdCeywRZLXHZACll6v9zdxkYQcTOTz+Q+iKHaJC3Ajb3z8NSbf+F0QhD+UqYBRoQL++vQ/19fXmHv1A4Pb21sRczHiosc0iZbHtBiGYYPBINVut9tKo1GholYr5Tc3N38RjQpomv46GAxqJtSZTOZFs9n8lzC4BCa1xWJRNe+xGzNCWSKVSn18qj/W+mKxWJIwPECPSHKi6QaYZ2WzWdVc6yn29vbE/f191bfSdaHcBJNL2T05DYokr1lmKBQKv2h1MyLUmHS6yDPgAq21yDvB4eFhyUhSi+UmjuPeEwYFRvKoiJeOfWFZB6MoXOgJowcx8uA95fZWVlb6paNOp0NEUF7EiFCeqJjLyHtD9XrdlTXKafQK5an1Cd1eIpH4HhNRJ/aGhoHeYIL20sFK3BvCarYgCI6XdpSo7TmpMTk5qau6r1co1/IRq+CJH4yi7u/vu5ubmzW376+256QGRqYqpkfoEQrPk+u+8bCZn5+fwymcnZ190kog7Yam6X49z+iekxye4x9My03rEeqtlbKRIAinFEV9JgwqhEKhMaN9HoKVj3K5XDO7QWcWPHOBxdSTkxNDe1K7u7v1bDbLV6tVzX5PCTAFAN8SrT6uoxX1Mb5Io4PaG/UGAL4hWn2GhlIoWjpP7qma3nNgTNoIpKXIzhdoFAGA/wDPNGiK1am5VQAAAABJRU5ErkJggg=="

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/m/j;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p1, Lcom/aggmoread/sdk/z/a/g/h;->b:Landroid/graphics/Bitmap;

    invoke-static {}, Lcom/aggmoread/sdk/z/a/h/a;->d()Lcom/aggmoread/sdk/z/a/h/a;

    move-result-object v0

    invoke-virtual {v0, v1, p1}, Lcom/aggmoread/sdk/z/a/h/a;->a(Lcom/aggmoread/sdk/z/a/h/a$a;Lcom/aggmoread/sdk/z/a/g/h;)V

    :cond_0
    return-void
.end method
