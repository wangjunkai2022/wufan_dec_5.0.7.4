.class public Lcom/aggmoread/sdk/z/a/o/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/a;


# instance fields
.field private a:Lcom/aggmoread/sdk/z/a/g/b;

.field private b:Lcom/aggmoread/sdk/z/a/r/c;

.field private c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

.field private d:Lcom/aggmoread/sdk/z/a/r/a;

.field private e:Landroid/app/Activity;

.field private f:Landroid/content/Context;

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:I

.field private j:Lcom/aggmoread/sdk/z/a/o/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/a/o/b;->g:Z

    const/4 v0, -0x1

    iput v0, p0, Lcom/aggmoread/sdk/z/a/o/b;->i:I

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/o/b;Lcom/aggmoread/sdk/z/a/r/a;)Lcom/aggmoread/sdk/z/a/r/a;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/o/b;->d:Lcom/aggmoread/sdk/z/a/r/a;

    return-object p1
.end method

.method private a(Landroid/app/Activity;)V
    .locals 3

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/o/b;->d()V

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/m/a;->a(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/o/b;->b:Lcom/aggmoread/sdk/z/a/r/c;

    sget-object v0, Lcom/aggmoread/sdk/z/a/g/e;->c:Lcom/aggmoread/sdk/z/a/g/e;

    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/o/b;->a:Lcom/aggmoread/sdk/z/a/g/b;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/b;->c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/o/b;->c()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object v1

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/o/b;->b:Lcom/aggmoread/sdk/z/a/r/c;

    invoke-static {p1, v0, v1, v2}, Lcom/aggmoread/sdk/z/a/m/l;->a(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/g/c;Lcom/aggmoread/sdk/z/a/i/b;)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/o/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/o/b;->g()V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/o/b;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/a/o/b;->a(Landroid/app/Activity;)V

    return-void
.end method

.method private b(Landroid/app/Activity;)V
    .locals 3

    const-string v0, "JHInterHandler_dsp"

    const-string v1, "showAD enter "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    const v0, 0xc353

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/o/b;->b:Lcom/aggmoread/sdk/z/a/r/c;

    new-instance v1, Lcom/aggmoread/sdk/z/a/g/e;

    const-string v2, "\u5e7f\u544a\u5c55\u793a\u5931\u8d25,Activity\u7f3a\u5931!"

    invoke-direct {v1, v0, v2}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    invoke-static {p1, v1}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/o/b;->j:Lcom/aggmoread/sdk/z/a/o/a;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/a/t/a;->a(Lcom/aggmoread/sdk/z/a/t/d;)V

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/aggmoread/sdk/z/a/t/a;->a(Landroid/app/Activity;Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/o/b;->b:Lcom/aggmoread/sdk/z/a/r/c;

    new-instance v1, Lcom/aggmoread/sdk/z/a/g/e;

    const-string v2, "\u5e7f\u544a\u5c55\u793a\u5931\u8d25!"

    invoke-direct {v1, v0, v2}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    invoke-static {p1, v1}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/a/o/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/o/b;->f()V

    return-void
.end method

.method private c()Lcom/aggmoread/sdk/z/a/g/c;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/b;->d:Lcom/aggmoread/sdk/z/a/r/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/r/a;->a()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lcom/aggmoread/sdk/z/a/g/c;

    invoke-direct {v0}, Lcom/aggmoread/sdk/z/a/g/c;-><init>()V

    return-object v0
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/a/o/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/o/b;->e()V

    return-void
.end method

.method private d()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAdClick = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/o/b;->c()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JHInterHandler_dsp"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/b;->c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->p()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/o/b;->c()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object v1

    const-string v2, "onAdClick"

    invoke-static {v2, v0, v1}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/util/List;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/b;->b:Lcom/aggmoread/sdk/z/a/r/c;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/r/c;->onAdClicked()V

    return-void
.end method

.method private e()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/b;->b:Lcom/aggmoread/sdk/z/a/r/c;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/r/c;->a()V

    return-void
.end method

.method private f()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/b;->c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->q()Ljava/util/List;

    move-result-object v0

    const-string v1, "onAdExposure"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/b;->b:Lcom/aggmoread/sdk/z/a/r/c;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/r/c;->e()V

    return-void
.end method

.method private g()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/b;->b:Lcom/aggmoread/sdk/z/a/r/c;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/r/c;->onAdShow()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/b;->c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/b;->c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->f()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/b;->c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->a()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/r/c;)V
    .locals 4

    const-string v0, "JHInterHandler_dsp"

    const-string v1, "handle   enter"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/o/b;->a:Lcom/aggmoread/sdk/z/a/g/b;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/o/b;->b:Lcom/aggmoread/sdk/z/a/r/c;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/h/c;->e()Landroid/app/Activity;

    move-result-object v1

    iput-object v1, p0, Lcom/aggmoread/sdk/z/a/o/b;->e:Landroid/app/Activity;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/h/c;->j()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/aggmoread/sdk/z/a/o/b;->f:Landroid/content/Context;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/o/b;->e:Landroid/app/Activity;

    if-nez v2, :cond_0

    instance-of v2, v1, Landroid/app/Activity;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/app/Activity;

    iput-object v1, p0, Lcom/aggmoread/sdk/z/a/o/b;->e:Landroid/app/Activity;

    :cond_0
    iget-object v1, p1, Lcom/aggmoread/sdk/z/a/g/b;->e:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aggmoread/sdk/z/a/g/b$a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/b$a;->a()Lcom/aggmoread/sdk/z/a/g/b$a$a;

    move-result-object v1

    if-eqz v1, :cond_3

    iput-object v1, p0, Lcom/aggmoread/sdk/z/a/o/b;->c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    iget v2, v1, Lcom/aggmoread/sdk/z/a/g/b$a$a;->s:I

    iput v2, p0, Lcom/aggmoread/sdk/z/a/o/b;->i:I

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->i()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/aggmoread/sdk/z/a/o/b;->h:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "clickUrl = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/o/b;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/aggmoread/sdk/z/a/g/g;

    invoke-direct {v0}, Lcom/aggmoread/sdk/z/a/g/g;-><init>()V

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->j()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/aggmoread/sdk/z/a/g/g;->a:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->a()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/aggmoread/sdk/z/a/g/g;->d:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->f()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/aggmoread/sdk/z/a/g/g;->e:Ljava/lang/String;

    new-instance v1, Lcom/aggmoread/sdk/z/a/o/a;

    invoke-direct {v1}, Lcom/aggmoread/sdk/z/a/o/a;-><init>()V

    iput-object v1, p0, Lcom/aggmoread/sdk/z/a/o/b;->j:Lcom/aggmoread/sdk/z/a/o/a;

    invoke-virtual {v1, v0}, Lcom/aggmoread/sdk/z/a/o/a;->a(Lcom/aggmoread/sdk/z/a/g/g;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/a/o/b;->g:Z

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/b;->b:Lcom/aggmoread/sdk/z/a/r/c;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lcom/aggmoread/sdk/z/a/r/c;->a(Lcom/aggmoread/sdk/z/a/a;)V

    :cond_1
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/b;->j:Lcom/aggmoread/sdk/z/a/o/a;

    new-instance v1, Lcom/aggmoread/sdk/z/a/o/b$a;

    invoke-direct {v1, p0, p2}, Lcom/aggmoread/sdk/z/a/o/b$a;-><init>(Lcom/aggmoread/sdk/z/a/o/b;Lcom/aggmoread/sdk/z/a/r/c;)V

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/a/o/a;->a(Lcom/aggmoread/sdk/z/a/o/a$d;)V

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/h/c;->n()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/o/b;->e:Landroid/app/Activity;

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/a/o/b;->b(Landroid/app/Activity;)V

    :cond_2
    return-void

    :cond_3
    new-instance p1, Lcom/aggmoread/sdk/z/a/g/e;

    const v0, 0xc350

    const-string v1, "\u5e7f\u544a\u6570\u636e\u5f02\u5e38"

    invoke-direct {p1, v0, v1}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    invoke-static {p2, p1}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void
.end method

.method public a(Landroid/app/Activity;Landroid/view/ViewGroup;)Z
    .locals 1

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/o/b;->a:Lcom/aggmoread/sdk/z/a/g/b;

    invoke-virtual {p2}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/aggmoread/sdk/z/a/h/c;->n()Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    :cond_0
    iget-boolean p2, p0, Lcom/aggmoread/sdk/z/a/o/b;->g:Z

    if-eqz p2, :cond_1

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/a/o/b;->b(Landroid/app/Activity;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/z/a/o/b;->i:I

    return v0
.end method
