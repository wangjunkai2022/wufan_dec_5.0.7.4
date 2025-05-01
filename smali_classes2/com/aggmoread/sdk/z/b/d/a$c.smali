.class Lcom/aggmoread/sdk/z/b/d/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/r/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/b/d/a;->a(Landroid/graphics/Bitmap;Landroid/widget/ImageView;Landroid/view/ViewGroup;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/b/d/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/b/d/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Lcom/aggmoread/sdk/z/a/g/c;)V
    .locals 3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->p(Lcom/aggmoread/sdk/z/b/d/a;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->b(Lcom/aggmoread/sdk/z/b/d/a;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->c(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/a/a$a$a;

    move-result-object p1

    iget-object p1, p1, Lcom/aggmoread/sdk/z/b/a/a$a$a;->e:Ljava/lang/String;

    const-string p2, "ApiSplashHandler_dsp"

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->c(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/a/a$a$a;

    move-result-object p1

    iget-object p1, p1, Lcom/aggmoread/sdk/z/b/a/a$a$a;->e:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/b/d/a;->c(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/a/a$a$a;

    move-result-object v1

    iget-object v1, v1, Lcom/aggmoread/sdk/z/b/a/a$a$a;->e:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/b/d/a;->n(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/a/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/b/a/a;->d()Lcom/aggmoread/sdk/z/b/b/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/b/b/a;->d()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string p1, "onStartAppSuccess"

    :try_start_1
    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/b/d/a;->c(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/a/a$a$a;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/aggmoread/sdk/z/b/a/a$a$a;->a(I)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v2}, Lcom/aggmoread/sdk/z/b/d/a;->d(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/a/r/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aggmoread/sdk/z/a/r/a;->a()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object v2

    invoke-static {p1, v1, v2}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/util/List;

    new-instance p1, Landroid/os/Handler;

    new-instance v1, Lcom/aggmoread/sdk/z/b/d/a$c$a;

    invoke-direct {v1, p0}, Lcom/aggmoread/sdk/z/b/d/a$c$a;-><init>(Lcom/aggmoread/sdk/z/b/d/a$c;)V

    invoke-direct {p1, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    instance-of p1, p1, Landroid/content/ActivityNotFoundException;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->c(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/a/a$a$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/z/b/a/a$a$a;->a(I)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/d/a;->d(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/a/r/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/r/a;->a()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object v0

    const-string v1, "onAppNotExist"

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->c(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/a/a$a$a;

    move-result-object p1

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/z/b/a/a$a$a;->a(I)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/d/a;->d(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/a/r/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/r/a;->a()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object v0

    const-string v1, "onStartAppFailed"

    :goto_0
    invoke-static {v1, p1, v0}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/util/List;

    invoke-static {p2, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->c(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/a/a$a$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/b/a/a$a$a;->c()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->c(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/a/a$a$a;

    move-result-object p1

    iget-object p1, p1, Lcom/aggmoread/sdk/z/b/a/a$a$a;->p:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->f(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/e/a;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "DL s"

    invoke-static {p2, p1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    new-instance p2, Lcom/aggmoread/sdk/z/b/e/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->g(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/e/a$b;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/aggmoread/sdk/z/b/e/a;-><init>(Lcom/aggmoread/sdk/z/b/e/a$b;)V

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/b/d/a;->a(Lcom/aggmoread/sdk/z/b/d/a;Lcom/aggmoread/sdk/z/b/e/a;)Lcom/aggmoread/sdk/z/b/e/a;

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->f(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/e/a;

    move-result-object p1

    iget-object p2, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p2}, Lcom/aggmoread/sdk/z/b/d/a;->h(Lcom/aggmoread/sdk/z/b/d/a;)Landroid/app/Activity;

    move-result-object p2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/d/a;->c(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/a/a$a$a;

    move-result-object v0

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->p:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lcom/aggmoread/sdk/z/b/e/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->f(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/e/a;

    move-result-object p1

    iget-object p2, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p2}, Lcom/aggmoread/sdk/z/b/d/a;->h(Lcom/aggmoread/sdk/z/b/d/a;)Landroid/app/Activity;

    move-result-object p2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/d/a;->l(Lcom/aggmoread/sdk/z/b/d/a;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/aggmoread/sdk/z/b/e/a;->a(Landroid/content/Context;Landroid/view/View;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->i(Lcom/aggmoread/sdk/z/b/d/a;)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->j(Lcom/aggmoread/sdk/z/b/d/a;)V

    :goto_1
    return-void
.end method
