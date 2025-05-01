.class public Lcom/aggmoread/sdk/z/a/k/b;
.super Lcom/aggmoread/sdk/z/a/k/c;
.source "SourceFile"


# instance fields
.field private l:Lcom/aggmoread/sdk/z/a/k/a;

.field private m:Lcom/aggmoread/sdk/z/a/g/b$a$a;

.field private n:Lcom/aggmoread/sdk/z/a/g/b;

.field private o:Lcom/aggmoread/sdk/z/a/r/a;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/k/a;)V
    .locals 1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/h/c;->j()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/aggmoread/sdk/z/a/k/c;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lcom/aggmoread/sdk/z/a/k/b;->l:Lcom/aggmoread/sdk/z/a/k/a;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/k/b;->m:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/k/b;->n:Lcom/aggmoread/sdk/z/a/g/b;

    invoke-direct {p0, p2}, Lcom/aggmoread/sdk/z/a/k/b;->a(Lcom/aggmoread/sdk/z/a/g/b$a$a;)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/k/b;)Lcom/aggmoread/sdk/z/a/k/a;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/k/b;->l:Lcom/aggmoread/sdk/z/a/k/a;

    return-object p0
.end method

.method private a(Lcom/aggmoread/sdk/z/a/g/b$a$a;)V
    .locals 2

    if-eqz p1, :cond_0

    new-instance v0, Lcom/aggmoread/sdk/z/a/g/g;

    invoke-direct {v0}, Lcom/aggmoread/sdk/z/a/g/g;-><init>()V

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->j()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/aggmoread/sdk/z/a/g/g;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->f()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/aggmoread/sdk/z/a/g/g;->e:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/aggmoread/sdk/z/a/g/g;->d:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/a/k/c;->a(Lcom/aggmoread/sdk/z/a/g/g;)V

    :cond_0
    new-instance v0, Lcom/aggmoread/sdk/z/a/k/b$a;

    invoke-direct {v0, p0, p1}, Lcom/aggmoread/sdk/z/a/k/b$a;-><init>(Lcom/aggmoread/sdk/z/a/k/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;)V

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/a/k/c;->a(Lcom/aggmoread/sdk/z/a/k/c$k;)V

    return-void
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/a/k/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/k/b;->j()V

    return-void
.end method

.method private i()Lcom/aggmoread/sdk/z/a/g/c;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/b;->o:Lcom/aggmoread/sdk/z/a/r/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/r/a;->a()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lcom/aggmoread/sdk/z/a/g/c;

    invoke-direct {v0}, Lcom/aggmoread/sdk/z/a/g/c;-><init>()V

    return-object v0
.end method

.method private j()V
    .locals 4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/b;->m:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->p()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/k/b;->i()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object v1

    const-string v2, "onAdClick"

    invoke-static {v2, v0, v1}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/util/List;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/b;->n:Lcom/aggmoread/sdk/z/a/g/b;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/k/b;->m:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/k/b;->i()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object v2

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/k/b;->l:Lcom/aggmoread/sdk/z/a/k/a;

    invoke-static {v0, v1, v2, v3}, Lcom/aggmoread/sdk/z/a/m/l;->a(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/g/c;Lcom/aggmoread/sdk/z/a/i/b;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 2

    invoke-super {p0}, Lcom/aggmoread/sdk/z/a/k/c;->a()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/r/a;->a(Landroid/view/View;Lcom/aggmoread/sdk/z/a/r/a$a;)Lcom/aggmoread/sdk/z/a/r/a;

    move-result-object v1

    iput-object v1, p0, Lcom/aggmoread/sdk/z/a/k/b;->o:Lcom/aggmoread/sdk/z/a/r/a;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/b;->m:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    iget v0, v0, Lcom/aggmoread/sdk/z/a/g/b$a$a;->s:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/b;->m:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
