.class public Lcom/aggmoread/sdk/z/b/e/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/b/e/a$a;,
        Lcom/aggmoread/sdk/z/b/e/a$b;
    }
.end annotation


# instance fields
.field private a:Lcom/aggmoread/sdk/z/a/t/h;

.field private b:Lcom/aggmoread/sdk/z/b/e/a$b;

.field private c:Landroid/app/Dialog;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/b/e/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/e/a;->b:Lcom/aggmoread/sdk/z/b/e/a$b;

    return-void
.end method

.method static synthetic a(Ljava/lang/String;)I
    .locals 0

    invoke-static {p0}, Lcom/aggmoread/sdk/z/b/e/a;->b(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/b/e/a;)Landroid/app/Dialog;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/b/e/a;->c:Landroid/app/Dialog;

    return-object p0
.end method

.method private static b(Ljava/lang/String;)I
    .locals 1

    :try_start_0
    const-class v0, Lcom/aggmoread/sdk/R$style;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "AIWTAG"

    const-string v1, "RLY"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/e/a;->a:Lcom/aggmoread/sdk/z/a/t/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebView;->removeAllViews()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/e/a;->a:Lcom/aggmoread/sdk/z/a/t/h;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/b/e/a;->a:Lcom/aggmoread/sdk/z/a/t/h;

    :cond_0
    return-void
.end method

.method public a(Landroid/content/Context;Landroid/view/View;)V
    .locals 2

    const-string p1, "AIWTAG"

    const-string p2, "s d"

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object p2, p0, Lcom/aggmoread/sdk/z/b/e/a;->c:Landroid/app/Dialog;

    if-nez p2, :cond_0

    return-void

    :cond_0
    const-string p2, "sd s"

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/aggmoread/sdk/z/b/e/a;->c:Landroid/app/Dialog;

    invoke-virtual {p2}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const-string p2, "s e %s "

    invoke-static {p1, p2, v0}, Lcom/aggmoread/sdk/z/a/d;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/e/a;->b:Lcom/aggmoread/sdk/z/b/e/a$b;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/b/e/a$b;->b()V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v3, "AIWTAG"

    const-string v4, "SAD CT= %s"

    invoke-static {v3, v4, v1}, Lcom/aggmoread/sdk/z/a/d;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, "SAD R"

    invoke-static {v3, p1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    instance-of v1, p1, Landroid/app/Activity;

    if-eqz v1, :cond_1

    const-string v1, "SAD C"

    invoke-static {v3, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/aggmoread/sdk/z/b/e/a$a;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/b/e/a;->b:Lcom/aggmoread/sdk/z/b/e/a$b;

    invoke-direct {v1, p0, p1, p2, v4}, Lcom/aggmoread/sdk/z/b/e/a$a;-><init>(Lcom/aggmoread/sdk/z/b/e/a;Landroid/content/Context;Ljava/lang/String;Lcom/aggmoread/sdk/z/b/e/a$b;)V

    iput-object v1, p0, Lcom/aggmoread/sdk/z/b/e/a;->c:Landroid/app/Dialog;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-array p2, v0, [Ljava/lang/Object;

    aput-object p1, p2, v2

    const-string p1, "R E %s"

    invoke-static {v3, p1, p2}, Lcom/aggmoread/sdk/z/a/d;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/b/e/a;->a()V

    :cond_1
    :goto_0
    return-void
.end method
