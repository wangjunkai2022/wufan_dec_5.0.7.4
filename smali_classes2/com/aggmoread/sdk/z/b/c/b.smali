.class public Lcom/aggmoread/sdk/z/b/c/b;
.super Lcom/aggmoread/sdk/z/a/b;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/l/c;
.implements Lcom/aggmoread/sdk/z/a/t/c$c;


# instance fields
.field private a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

.field private b:Lcom/aggmoread/sdk/z/a/l/f;

.field private c:Lcom/aggmoread/sdk/z/b/a/a;

.field private volatile d:Z

.field private e:Z

.field private f:Lcom/aggmoread/sdk/z/a/t/c;

.field private g:Lcom/aggmoread/sdk/z/b/e/a;

.field private h:Z

.field private i:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/aggmoread/sdk/z/b/e/a$b;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/b/a/a;Lcom/aggmoread/sdk/z/b/a/a$a$a;)V
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/b;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->d:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->e:Z

    new-instance v0, Lcom/aggmoread/sdk/z/b/c/b$b;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/b/c/b$b;-><init>(Lcom/aggmoread/sdk/z/b/c/b;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->j:Lcom/aggmoread/sdk/z/b/e/a$b;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/c/b;->c:Lcom/aggmoread/sdk/z/b/a/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/b/a/a;->d()Lcom/aggmoread/sdk/z/b/b/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/b/b/a;->h()Ljava/lang/String;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/b/c/b;)Lcom/aggmoread/sdk/z/b/a/a$a$a;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    return-object p0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/b/c/b;Lcom/aggmoread/sdk/z/b/e/a;)Lcom/aggmoread/sdk/z/b/e/a;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/c/b;->g:Lcom/aggmoread/sdk/z/b/e/a;

    return-object p1
.end method

.method private a(Lcom/aggmoread/sdk/z/a/g/c;)V
    .locals 3

    invoke-static {}, Lcom/aggmoread/sdk/z/a/h/a;->d()Lcom/aggmoread/sdk/z/a/h/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/h/a;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/b/a/a$a$a;->i:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/m/d;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/m/d;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "intent = "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "DSPNVEIFACEIMPL"

    invoke-static {v2, p1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/high16 p1, 0x10000000

    invoke-virtual {v1, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/a/a$a$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/aggmoread/sdk/z/b/c/b;->a(Ljava/lang/String;Lcom/aggmoread/sdk/z/a/g/c;)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/b/c/b;Lcom/aggmoread/sdk/z/a/g/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/b/c/b;->a(Lcom/aggmoread/sdk/z/a/g/c;)V

    return-void
.end method

.method private a(Ljava/lang/String;Lcom/aggmoread/sdk/z/a/g/c;)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v1, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->i:Ljava/lang/String;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->a:Ljava/lang/String;

    new-instance v2, Lcom/aggmoread/sdk/z/a/j/b;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/b/c/b;->c:Lcom/aggmoread/sdk/z/b/a/a;

    invoke-virtual {v3}, Lcom/aggmoread/sdk/z/b/a/a;->d()Lcom/aggmoread/sdk/z/b/b/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aggmoread/sdk/z/b/b/a;->i()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/aggmoread/sdk/z/b/c/b;->c:Lcom/aggmoread/sdk/z/b/a/a;

    invoke-virtual {v4}, Lcom/aggmoread/sdk/z/b/a/a;->d()Lcom/aggmoread/sdk/z/b/b/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/aggmoread/sdk/z/b/b/a;->h()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/aggmoread/sdk/z/b/c/b$a;

    invoke-direct {v5, p0, p2}, Lcom/aggmoread/sdk/z/b/c/b$a;-><init>(Lcom/aggmoread/sdk/z/b/c/b;Lcom/aggmoread/sdk/z/a/g/c;)V

    invoke-direct {v2, v3, v4, v5}, Lcom/aggmoread/sdk/z/a/j/b;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/aggmoread/sdk/z/a/j/c;)V

    invoke-virtual {v2, p1, v1, v0}, Lcom/aggmoread/sdk/z/a/j/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private a(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->setFocusable(Z)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setClickable(Z)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/b/c/b;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/b/c/b;->h:Z

    return p1
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/b/c/b;)Lcom/aggmoread/sdk/z/b/e/a;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/b/c/b;->g:Lcom/aggmoread/sdk/z/b/e/a;

    return-object p0
.end method

.method private b(Lcom/aggmoread/sdk/z/a/g/c;)V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/c/b;->b:Lcom/aggmoread/sdk/z/a/l/f;

    new-instance v0, Lcom/aggmoread/sdk/z/a/g/e;

    const v1, 0xc358

    const-string v2, "\u8df3\u8f6c\u5730\u5740\u5f02\u5e38"

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/z/a/i/b;->a(Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "startWebActivity = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "DSPNVEIFACEIMPL"

    invoke-static {v2, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startWebActivity final = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->c:Lcom/aggmoread/sdk/z/b/a/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/a/a;->d()Lcom/aggmoread/sdk/z/b/b/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/b/a;->i()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/b/a/a$a$a;->a:Ljava/lang/String;

    sget-object v2, Lcom/aggmoread/sdk/z/a/t/b$a;->a:Lcom/aggmoread/sdk/z/a/t/b$a;

    invoke-static {v0, v1, p1, v2}, Lcom/aggmoread/sdk/z/a/t/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/aggmoread/sdk/z/a/t/b$a;)V

    return-void
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/b/c/b;)Lcom/aggmoread/sdk/z/a/t/c;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/b/c/b;->f:Lcom/aggmoread/sdk/z/a/t/c;

    return-object p0
.end method

.method private d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->d:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->e:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->i:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private f()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "retry shown = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/c/b;->f:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/view/View;)Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", has "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/b/c/b;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DSPNVEIFACEIMPL"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->f:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->b:Lcom/aggmoread/sdk/z/a/l/f;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/l/f;->onADExposed()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->l:Ljava/util/List;

    const-string v1, "onAdExposure"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->d:Z

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->f:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/t/c;->a()V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Ljava/util/List;Lcom/aggmoread/sdk/z/a/l/f;)Landroid/view/View;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Lcom/aggmoread/sdk/z/a/l/f;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->p:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/aggmoread/sdk/z/b/e/a;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/c/b;->j:Lcom/aggmoread/sdk/z/b/e/a$b;

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/b/e/a;-><init>(Lcom/aggmoread/sdk/z/b/e/a$b;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->g:Lcom/aggmoread/sdk/z/b/e/a;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/b/c/b;->e()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Landroid/app/Activity;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    :cond_0
    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/c/b;->g:Lcom/aggmoread/sdk/z/b/e/a;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/b/a/a$a$a;->p:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/aggmoread/sdk/z/b/e/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/aggmoread/sdk/z/b/c/b;->b:Lcom/aggmoread/sdk/z/a/l/f;

    const-string p3, "DSPNVEIFACEIMPL"

    if-eqz p2, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    const-string v1, "bindView enter, add clickable view"

    invoke-static {p3, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bindView enter, view = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " , clickableViews size = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p3, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-direct {p0, v0}, Lcom/aggmoread/sdk/z/b/c/b;->a(Ljava/util/ArrayList;)V

    instance-of p2, p1, Lcom/aggmoread/sdk/z/a/t/c;

    if-eqz p2, :cond_4

    move-object p2, p1

    check-cast p2, Lcom/aggmoread/sdk/z/a/t/c;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/b/c/b;->f:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-virtual {p2, p0}, Lcom/aggmoread/sdk/z/a/t/c;->a(Lcom/aggmoread/sdk/z/a/t/c$c;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "bindView abort, title = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/b/c/b;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_4
    new-instance p2, Lcom/aggmoread/sdk/z/a/t/c;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Lcom/aggmoread/sdk/z/a/t/c;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/aggmoread/sdk/z/b/c/b;->f:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-virtual {p2, p0}, Lcom/aggmoread/sdk/z/a/t/c;->a(Lcom/aggmoread/sdk/z/a/t/c$c;)V

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    instance-of p3, p2, Landroid/view/ViewGroup;

    if-eqz p3, :cond_5

    check-cast p2, Landroid/view/ViewGroup;

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_5
    iget-object p2, p0, Lcom/aggmoread/sdk/z/b/c/b;->f:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-virtual {p2, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/c/b;->f:Lcom/aggmoread/sdk/z/a/t/c;

    return-object p1
.end method

.method public a(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onWindowVisibilityChanged = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DSPNVEIFACEIMPL"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->d:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/b/c/b;->f()V

    :cond_0
    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/t/f;Lcom/aggmoread/sdk/z/a/s/c;Lcom/aggmoread/sdk/z/a/l/e$a;)V
    .locals 0

    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->g:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    return-object v0
.end method

.method public c()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "dispatchDraw enter , SdkHelper.isShown(nativeAdViewExt) = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/c/b;->f:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/view/View;)Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DSPNVEIFACEIMPL"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/b/c/b;->f()V

    return-void
.end method

.method public getDesc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->c:Ljava/lang/String;

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/b/c/b;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->g:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getVideoCurrentPosition()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getVideoDuration()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isAppAd()Z
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/a/a$a$a;->c()Z

    move-result v0

    return v0
.end method

.method public isVideoAd()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 7

    const-string v0, "onStartAppSuccess"

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/b/c/b;->d()Z

    move-result v1

    const-string v2, "DSPNVEIFACEIMPL"

    if-nez v1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "abort click , reason: hasExporsed = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->d:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " , isClicked = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->e:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/aggmoread/sdk/z/b/c/b;->e:Z

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/c/b;->b:Lcom/aggmoread/sdk/z/a/l/f;

    invoke-interface {v1}, Lcom/aggmoread/sdk/z/a/l/f;->onADClicked()V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/c/b;->f:Lcom/aggmoread/sdk/z/a/t/c;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/a/t/c;->c:Lcom/aggmoread/sdk/z/a/g/c;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "feedsListFrameLayout2 adUrlDefine = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget v3, v1, Lcom/aggmoread/sdk/z/a/g/c;->a:I

    int-to-float v3, v3

    iget v4, v1, Lcom/aggmoread/sdk/z/a/g/c;->e:I

    int-to-float v4, v4

    div-float/2addr v3, v4

    iget v4, v1, Lcom/aggmoread/sdk/z/a/g/c;->b:I

    int-to-float v4, v4

    iget v5, v1, Lcom/aggmoread/sdk/z/a/g/c;->f:I

    int-to-float v5, v5

    div-float/2addr v4, v5

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "action e x = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, " ,y = "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v3, v3, Lcom/aggmoread/sdk/z/b/a/a$a$a;->m:Ljava/util/List;

    const-string v4, "onAdClick"

    invoke-static {v4, v3, v1}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/util/List;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v3, v3, Lcom/aggmoread/sdk/z/b/a/a$a$a;->e:Ljava/lang/String;

    if-eqz v3, :cond_2

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    :try_start_0
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    iget-object v4, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v4, v4, Lcom/aggmoread/sdk/z/b/a/a$a$a;->e:Ljava/lang/String;

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/high16 v4, 0x10000000

    invoke-virtual {v3, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/b/c/b;->c:Lcom/aggmoread/sdk/z/b/a/a;

    invoke-virtual {v4}, Lcom/aggmoread/sdk/z/b/a/a;->d()Lcom/aggmoread/sdk/z/b/b/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/aggmoread/sdk/z/b/b/a;->i()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    iget-object v3, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    const/4 v4, 0x3

    invoke-virtual {v3, v4}, Lcom/aggmoread/sdk/z/b/a/a$a$a;->a(I)Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v3, v1}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/util/List;

    invoke-static {v2, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    instance-of v0, v0, Landroid/content/ActivityNotFoundException;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lcom/aggmoread/sdk/z/b/a/a$a$a;->a(I)Ljava/util/List;

    move-result-object v0

    const-string v3, "onAppNotExist"

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Lcom/aggmoread/sdk/z/b/a/a$a$a;->a(I)Ljava/util/List;

    move-result-object v0

    const-string v3, "onStartAppFailed"

    :goto_0
    invoke-static {v3, v0, v1}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/util/List;

    invoke-static {v2, v3}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/a/a$a$a;->c()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->p:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->g:Lcom/aggmoread/sdk/z/b/e/a;

    if-nez v0, :cond_4

    const-string v0, "PP null"

    invoke-static {v2, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/aggmoread/sdk/z/b/e/a;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/c/b;->j:Lcom/aggmoread/sdk/z/b/e/a$b;

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/b/e/a;-><init>(Lcom/aggmoread/sdk/z/b/e/a$b;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->g:Lcom/aggmoread/sdk/z/b/e/a;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/b/c/b;->e()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Landroid/app/Activity;

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    :cond_3
    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/c/b;->g:Lcom/aggmoread/sdk/z/b/e/a;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/b/c/b;->a:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/b/a/a$a$a;->p:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/aggmoread/sdk/z/b/e/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_4
    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b;->g:Lcom/aggmoread/sdk/z/b/e/a;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/aggmoread/sdk/z/b/e/a;->a(Landroid/content/Context;Landroid/view/View;)V

    goto :goto_1

    :cond_5
    invoke-direct {p0, v1}, Lcom/aggmoread/sdk/z/b/c/b;->a(Lcom/aggmoread/sdk/z/a/g/c;)V

    goto :goto_1

    :cond_6
    :try_start_1
    invoke-direct {p0, v1}, Lcom/aggmoread/sdk/z/b/c/b;->b(Lcom/aggmoread/sdk/z/a/g/c;)V
    :try_end_1
    .catch Lcom/aggmoread/sdk/z/a/t/e; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method public onScrollChanged()V
    .locals 2

    const-string v0, "DSPNVEIFACEIMPL"

    const-string v1, "scroll "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/b/c/b;->f()V

    return-void
.end method

.method public pauseVideo()V
    .locals 0

    return-void
.end method

.method public resume()V
    .locals 0

    return-void
.end method

.method public resumeVideo()V
    .locals 0

    return-void
.end method

.method public startVideo()V
    .locals 0

    return-void
.end method

.method public stopVideo()V
    .locals 0

    return-void
.end method
