.class final Lcom/aggmoread/sdk/z/b/c/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/p/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/b/c/a;->a(Lcom/aggmoread/sdk/z/b/b/a;Lcom/aggmoread/sdk/z/a/i/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/i/b;

.field final synthetic b:Lcom/aggmoread/sdk/z/b/b/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/b/b/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/c/a$a;->a:Lcom/aggmoread/sdk/z/a/i/b;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/b/c/a$a;->b:Lcom/aggmoread/sdk/z/b/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILorg/json/JSONObject;Lcom/aggmoread/sdk/z/a/g/e;)V
    .locals 4

    const-string p1, ":"

    const-string v0, "\u65e0\u5e7f\u544a\u586b\u5145!"

    const v1, 0xc350

    if-eqz p3, :cond_1

    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3}, Lcom/aggmoread/sdk/z/a/g/e;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lcom/aggmoread/sdk/z/a/g/e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Lcom/aggmoread/sdk/z/a/g/e;->b()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p3, Lcom/aggmoread/sdk/z/a/g/e;

    invoke-direct {p3, v1, p1}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/c/a$a;->a:Lcom/aggmoread/sdk/z/a/i/b;

    invoke-static {p1, p3}, Lcom/aggmoread/sdk/z/b/c/a;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void

    :cond_1
    invoke-static {p2}, Lcom/aggmoread/sdk/z/b/a/a;->b(Lorg/json/JSONObject;)Lcom/aggmoread/sdk/z/b/a/a;

    move-result-object p3

    if-nez p3, :cond_2

    new-instance p1, Lcom/aggmoread/sdk/z/a/g/e;

    invoke-direct {p1, v1, v0}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    iget-object p3, p0, Lcom/aggmoread/sdk/z/b/c/a$a;->a:Lcom/aggmoread/sdk/z/a/i/b;

    invoke-static {p3, p1}, Lcom/aggmoread/sdk/z/b/c/a;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void

    :cond_2
    invoke-virtual {p3}, Lcom/aggmoread/sdk/z/b/a/a;->f()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/c/a$a;->b:Lcom/aggmoread/sdk/z/b/b/a;

    invoke-virtual {p3, p1}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lcom/aggmoread/sdk/z/b/b/a;)V

    sget-object p1, Lcom/aggmoread/sdk/z/a/i/a;->b:Lcom/aggmoread/sdk/z/a/i/a;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/a$a;->b:Lcom/aggmoread/sdk/z/b/b/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/b/a;->g()Lcom/aggmoread/sdk/z/a/i/a;

    move-result-object v0

    if-ne p1, v0, :cond_3

    invoke-static {}, Lcom/aggmoread/sdk/z/a/m/m;->a()Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lcom/aggmoread/sdk/z/b/c/a$a$a;

    invoke-direct {v0, p0, p3}, Lcom/aggmoread/sdk/z/b/c/a$a$a;-><init>(Lcom/aggmoread/sdk/z/b/c/a$a;Lcom/aggmoread/sdk/z/b/a/a;)V

    :goto_1
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_3

    :cond_3
    sget-object p1, Lcom/aggmoread/sdk/z/a/i/a;->c:Lcom/aggmoread/sdk/z/a/i/a;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/a$a;->b:Lcom/aggmoread/sdk/z/b/b/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/b/a;->g()Lcom/aggmoread/sdk/z/a/i/a;

    move-result-object v0

    if-ne p1, v0, :cond_6

    invoke-static {}, Lcom/aggmoread/sdk/z/a/m/m;->a()Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lcom/aggmoread/sdk/z/b/c/a$a$b;

    invoke-direct {v0, p0, p3}, Lcom/aggmoread/sdk/z/b/c/a$a$b;-><init>(Lcom/aggmoread/sdk/z/b/c/a$a;Lcom/aggmoread/sdk/z/b/a/a;)V

    goto :goto_1

    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, p3, Lcom/aggmoread/sdk/z/b/a/a;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p3, Lcom/aggmoread/sdk/z/b/a/a;->d:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    iget-object v0, p3, Lcom/aggmoread/sdk/z/b/a/a;->d:Ljava/lang/String;

    :goto_2
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p3, Lcom/aggmoread/sdk/z/a/g/e;

    invoke-direct {p3, v1, p1}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/c/a$a;->a:Lcom/aggmoread/sdk/z/a/i/b;

    invoke-static {p1, p3}, Lcom/aggmoread/sdk/z/b/c/a;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/c/a$a;->a:Lcom/aggmoread/sdk/z/a/i/b;

    new-instance p3, Lcom/aggmoread/sdk/z/a/g/e;

    const/16 v0, 0x2714

    const-string v1, "\u8bf7\u6c42\u6570\u636e\u89e3\u6790\u9519\u8bef"

    invoke-direct {p3, v0, v1}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    invoke-static {p1, p3}, Lcom/aggmoread/sdk/z/b/c/a;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    :cond_6
    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "onResponse: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "DSPDRTAG"

    invoke-static {p2, p1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
