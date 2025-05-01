.class public Lcom/aggmoread/sdk/z/a/m/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/a/m/l$c;
    }
.end annotation


# direct methods
.method public static a(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/g/c;Lcom/aggmoread/sdk/z/a/i/b;)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-static/range {v0 .. v5}, Lcom/aggmoread/sdk/z/a/m/l;->a(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/g/c;Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/t/b$a;Lcom/aggmoread/sdk/z/a/m/l$c;)V

    return-void
.end method

.method private static a(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/g/c;Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/t/b$a;)V
    .locals 2

    iget-object v0, p1, Lcom/aggmoread/sdk/z/a/g/b$a$a;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p0, Lcom/aggmoread/sdk/z/a/g/e;

    const p1, 0xc358

    const-string p2, "\u8df3\u8f6c\u5730\u5740\u5f02\u5e38"

    invoke-direct {p0, p1, p2}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    invoke-static {p3, p0}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void

    :cond_0
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startWebActivity = "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v1, "JHAPIHTAG"

    invoke-static {v1, p3}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, p2}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "startWebActivity final = "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {v1, p3}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object p0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/h/c;->j()Landroid/content/Context;

    move-result-object p0

    iget-object p1, p1, Lcom/aggmoread/sdk/z/a/g/b$a$a;->c:Ljava/lang/String;

    if-nez p4, :cond_1

    sget-object p4, Lcom/aggmoread/sdk/z/a/t/b$a;->a:Lcom/aggmoread/sdk/z/a/t/b$a;

    :cond_1
    invoke-static {p0, p1, p2, p4}, Lcom/aggmoread/sdk/z/a/t/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/aggmoread/sdk/z/a/t/b$a;)V

    return-void
.end method

.method public static a(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/g/c;Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/t/b$a;Lcom/aggmoread/sdk/z/a/m/l$c;)V
    .locals 7

    const-string v0, "onStartAppSuccess"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "metaGroupBean.deeplink = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p1, Lcom/aggmoread/sdk/z/a/g/b$a$a;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "JHAPIHTAG"

    invoke-static {v2, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p1, Lcom/aggmoread/sdk/z/a/g/b$a$a;->d:Ljava/lang/String;

    const/high16 v3, 0x10000000

    const/4 v4, 0x2

    if-eqz v1, :cond_3

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    :try_start_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    iget-object v5, p1, Lcom/aggmoread/sdk/z/a/g/b$a$a;->d:Ljava/lang/String;

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {v1, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object v5

    invoke-virtual {v5}, Lcom/aggmoread/sdk/z/a/h/c;->e()Landroid/app/Activity;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object v5

    invoke-virtual {v5}, Lcom/aggmoread/sdk/z/a/h/c;->e()Landroid/app/Activity;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object v5

    invoke-virtual {v5}, Lcom/aggmoread/sdk/z/a/h/c;->j()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :goto_0
    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->a(I)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1, p2}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/util/List;

    invoke-static {v2, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p5, :cond_1

    invoke-interface {p5}, Lcom/aggmoread/sdk/z/a/m/l$c;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v1, v5

    const-string v6, "e %s"

    invoke-static {v2, v6, v1}, Lcom/aggmoread/sdk/z/a/d;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    instance-of v0, v0, Landroid/content/ActivityNotFoundException;

    if-eqz v0, :cond_2

    invoke-virtual {p1, v5}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->a(I)Ljava/util/List;

    move-result-object v0

    const-string v1, "onAppNotExist"

    goto :goto_1

    :cond_2
    invoke-virtual {p1, v4}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->a(I)Ljava/util/List;

    move-result-object v0

    const-string v1, "onStartAppFailed"

    :goto_1
    invoke-static {v1, v0, p2}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/util/List;

    invoke-static {v2, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->r()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object p3

    invoke-virtual {p3}, Lcom/aggmoread/sdk/z/a/h/c;->j()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->m()Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4}, Lcom/aggmoread/sdk/z/a/m/d;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p3, p4}, Lcom/aggmoread/sdk/z/a/m/d;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p4

    if-eqz p4, :cond_5

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "intent = "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p4, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p3, p4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    if-eqz p5, :cond_4

    invoke-interface {p5}, Lcom/aggmoread/sdk/z/a/m/l$c;->e()V

    :cond_4
    return-void

    :cond_5
    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->h()I

    move-result p3

    if-ne p3, v4, :cond_6

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->e()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, p2}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/lang/String;

    move-result-object p3

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "rClickUrl = "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {v2, p4}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p4, Lcom/aggmoread/sdk/z/a/m/l$a;

    invoke-direct {p4, p2, p0, p1, p5}, Lcom/aggmoread/sdk/z/a/m/l$a;-><init>(Lcom/aggmoread/sdk/z/a/g/c;Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/m/l$c;)V

    invoke-static {p3, p4}, Lcom/aggmoread/sdk/z/a/r/g;->a(Ljava/lang/String;Lcom/aggmoread/sdk/z/a/r/g$c;)V

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->i()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, p0, p1, p2}, Lcom/aggmoread/sdk/z/a/m/l;->b(Ljava/lang/String;Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/g/c;)V

    if-eqz p5, :cond_8

    invoke-interface {p5}, Lcom/aggmoread/sdk/z/a/m/l$c;->c()V

    goto :goto_2

    :cond_7
    :try_start_1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/aggmoread/sdk/z/a/m/l;->a(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/g/c;Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/t/b$a;)V

    if-eqz p5, :cond_8

    invoke-interface {p5}, Lcom/aggmoread/sdk/z/a/m/l$c;->d()V
    :try_end_1
    .catch Lcom/aggmoread/sdk/z/a/t/e; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_8
    :goto_2
    return-void
.end method

.method static synthetic a(Ljava/lang/String;Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/g/c;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/aggmoread/sdk/z/a/m/l;->b(Ljava/lang/String;Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/g/c;)V

    return-void
.end method

.method private static b(Ljava/lang/String;Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/g/c;)V
    .locals 5

    :try_start_0
    iget-object v0, p2, Lcom/aggmoread/sdk/z/a/g/b$a$a;->a:Ljava/lang/String;

    iget-object v1, p2, Lcom/aggmoread/sdk/z/a/g/b$a$a;->c:Ljava/lang/String;

    new-instance v2, Lcom/aggmoread/sdk/z/a/j/b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aggmoread/sdk/z/a/h/c;->j()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/h/c;->i()Ljava/lang/String;

    move-result-object p1

    new-instance v4, Lcom/aggmoread/sdk/z/a/m/l$b;

    invoke-direct {v4, p2, p3}, Lcom/aggmoread/sdk/z/a/m/l$b;-><init>(Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/g/c;)V

    invoke-direct {v2, v3, p1, v4}, Lcom/aggmoread/sdk/z/a/j/b;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/aggmoread/sdk/z/a/j/c;)V

    invoke-virtual {v2, p0, v0, v1}, Lcom/aggmoread/sdk/z/a/j/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method
