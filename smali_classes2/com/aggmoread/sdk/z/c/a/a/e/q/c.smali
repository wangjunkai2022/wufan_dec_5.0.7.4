.class public abstract Lcom/aggmoread/sdk/z/c/a/a/e/q/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/e/q/f;


# instance fields
.field protected c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

.field protected d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/e/q/c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public varargs a(Landroid/content/ContextWrapper;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;[Ljava/lang/Object;)Z
    .locals 3

    const/4 p3, 0x0

    if-eqz p2, :cond_3

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Lcom/aggmoread/sdk/z/c/a/a/e/q/c;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    return p3

    :cond_1
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/e/q/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    return p3

    :cond_2
    :try_start_0
    invoke-static {p1, v0, v1, p2}, Lcom/aggmoread/sdk/z/c/a/a/e/q/a;->a(Landroid/content/ContextWrapper;Ljava/lang/String;Ljava/lang/String;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Z

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/e/q/c;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/q/c;->d:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_3
    :goto_0
    return p3
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->q:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/e/m;->a(Landroid/content/Context;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Z

    move-result p1

    return p1
.end method

.method protected b(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_1

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->b0:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/q/c;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/q/c;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected abstract c()Ljava/lang/String;
.end method
