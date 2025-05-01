.class public Lcom/join/mgps/ad/a;
.super Ljava/lang/Object;
.source "AdManager.java"


# static fields
.field private static o:Lcom/join/mgps/ad/a; = null

.field public static final p:I = 0x1

.field public static final q:I = 0x2

.field public static final r:I = 0x3

.field public static final s:I = 0x4

.field public static final t:I = 0x5

.field public static final u:I = 0x7

.field public static final v:I = 0x8

.field public static final w:I = 0x9


# instance fields
.field private a:Lcom/join/mgps/ad/z;

.field private b:Lcom/join/mgps/ad/h;

.field private c:Lcom/join/mgps/ad/l;

.field private d:Lcom/join/mgps/ad/s;

.field private e:Landroid/content/Context;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:I

.field private m:Z

.field private n:Lcom/join/mgps/ad/n;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/ad/a;->l:I

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/ad/a;->m:Z

    .line 4
    iput-object p1, p0, Lcom/join/mgps/ad/a;->e:Landroid/content/Context;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/ad/a;)Lcom/join/mgps/ad/n;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/ad/a;->n:Lcom/join/mgps/ad/n;

    return-object p0
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 7

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/ad/a;->b:Lcom/join/mgps/ad/h;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/join/mgps/ad/a;->f:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/ad/a;->b:Lcom/join/mgps/ad/h;

    if-eqz p1, :cond_3

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/ad/d;->g()V

    goto :goto_1

    .line 5
    :cond_2
    :goto_0
    iput-object p2, p0, Lcom/join/mgps/ad/a;->f:Ljava/lang/String;

    .line 6
    new-instance v6, Lcom/join/mgps/ad/a$b;

    iget-object v2, p0, Lcom/join/mgps/ad/a;->e:Landroid/content/Context;

    move-object v0, v6

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/ad/a$b;-><init>(Lcom/join/mgps/ad/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v6, p0, Lcom/join/mgps/ad/a;->b:Lcom/join/mgps/ad/h;

    .line 7
    invoke-virtual {v6}, Lcom/join/mgps/ad/h;->e()V

    :cond_3
    :goto_1
    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 7

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/ad/a;->c:Lcom/join/mgps/ad/l;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/join/mgps/ad/a;->j:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/ad/a;->c:Lcom/join/mgps/ad/l;

    if-eqz p1, :cond_3

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/ad/d;->g()V

    goto :goto_1

    .line 5
    :cond_2
    :goto_0
    iput-object p2, p0, Lcom/join/mgps/ad/a;->j:Ljava/lang/String;

    .line 6
    new-instance v6, Lcom/join/mgps/ad/a$c;

    iget-object v2, p0, Lcom/join/mgps/ad/a;->e:Landroid/content/Context;

    move-object v0, v6

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/ad/a$c;-><init>(Lcom/join/mgps/ad/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v6, p0, Lcom/join/mgps/ad/a;->c:Lcom/join/mgps/ad/l;

    .line 7
    invoke-virtual {v6}, Lcom/join/mgps/ad/l;->e()V

    :cond_3
    :goto_1
    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 7

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/ad/a;->d:Lcom/join/mgps/ad/s;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/join/mgps/ad/a;->k:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/ad/a;->d:Lcom/join/mgps/ad/s;

    if-eqz p1, :cond_3

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/ad/d;->g()V

    goto :goto_1

    .line 5
    :cond_2
    :goto_0
    iput-object p2, p0, Lcom/join/mgps/ad/a;->k:Ljava/lang/String;

    .line 6
    new-instance v6, Lcom/join/mgps/ad/a$d;

    iget-object v2, p0, Lcom/join/mgps/ad/a;->e:Landroid/content/Context;

    move-object v0, v6

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/ad/a$d;-><init>(Lcom/join/mgps/ad/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v6, p0, Lcom/join/mgps/ad/a;->d:Lcom/join/mgps/ad/s;

    .line 7
    invoke-virtual {v6}, Lcom/join/mgps/ad/s;->e()V

    :cond_3
    :goto_1
    return-void
.end method

.method private f(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 7

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/ad/a;->a:Lcom/join/mgps/ad/z;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/join/mgps/ad/a;->g:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/ad/a;->a:Lcom/join/mgps/ad/z;

    if-eqz p1, :cond_3

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/ad/d;->g()V

    goto :goto_1

    .line 5
    :cond_2
    :goto_0
    iput-object p2, p0, Lcom/join/mgps/ad/a;->g:Ljava/lang/String;

    .line 6
    new-instance v6, Lcom/join/mgps/ad/a$a;

    iget-object v2, p0, Lcom/join/mgps/ad/a;->e:Landroid/content/Context;

    move-object v0, v6

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/ad/a$a;-><init>(Lcom/join/mgps/ad/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v6, p0, Lcom/join/mgps/ad/a;->a:Lcom/join/mgps/ad/z;

    .line 7
    invoke-virtual {v6}, Lcom/join/mgps/ad/z;->e()V

    :cond_3
    :goto_1
    return-void
.end method

.method public static g(Landroid/content/Context;)Lcom/join/mgps/ad/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/join/mgps/ad/a;->o:Lcom/join/mgps/ad/a;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/ad/a;

    invoke-direct {v0, p0}, Lcom/join/mgps/ad/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/join/mgps/ad/a;->o:Lcom/join/mgps/ad/a;

    .line 3
    :cond_0
    sget-object p0, Lcom/join/mgps/ad/a;->o:Lcom/join/mgps/ad/a;

    return-object p0
.end method


# virtual methods
.method public b()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/join/mgps/ad/a;->n:Lcom/join/mgps/ad/n;

    return-void
.end method

.method public h(ILjava/lang/String;Ljava/lang/String;Lcom/join/mgps/ad/n;)V
    .locals 1

    .line 1
    iput-object p4, p0, Lcom/join/mgps/ad/a;->n:Lcom/join/mgps/ad/n;

    const/4 p4, 0x0

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 2
    invoke-direct {p0, p2, p3, p4}, Lcom/join/mgps/ad/a;->c(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x7

    if-ne p1, v0, :cond_3

    .line 3
    invoke-direct {p0, p2, p3, p4}, Lcom/join/mgps/ad/a;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    :cond_3
    const/16 v0, 0x9

    if-ne p1, v0, :cond_4

    .line 4
    invoke-direct {p0, p2, p3, p4}, Lcom/join/mgps/ad/a;->e(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    .line 5
    :cond_4
    invoke-direct {p0, p2, p3, p4}, Lcom/join/mgps/ad/a;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 6
    :goto_0
    iput p1, p0, Lcom/join/mgps/ad/a;->l:I

    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lcom/join/mgps/ad/a;->m:Z

    return-void
.end method

.method public i(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/ad/a;->m:Z

    if-eqz v0, :cond_3

    .line 2
    iget v0, p0, Lcom/join/mgps/ad/a;->l:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v1, p0, Lcom/join/mgps/ad/a;->a:Lcom/join/mgps/ad/z;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1, p1}, Lcom/join/mgps/ad/d;->q(Landroid/app/Activity;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 4
    iget-object v1, p0, Lcom/join/mgps/ad/a;->b:Lcom/join/mgps/ad/h;

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v1, p1}, Lcom/join/mgps/ad/d;->q(Landroid/app/Activity;)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x7

    if-ne v0, v1, :cond_2

    .line 6
    iget-object v1, p0, Lcom/join/mgps/ad/a;->c:Lcom/join/mgps/ad/l;

    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {v1, p1}, Lcom/join/mgps/ad/d;->q(Landroid/app/Activity;)V

    goto :goto_0

    :cond_2
    const/16 v1, 0x9

    if-ne v0, v1, :cond_4

    .line 8
    iget-object v0, p0, Lcom/join/mgps/ad/a;->d:Lcom/join/mgps/ad/s;

    if-eqz v0, :cond_4

    .line 9
    invoke-virtual {v0, p1}, Lcom/join/mgps/ad/d;->q(Landroid/app/Activity;)V

    goto :goto_0

    .line 10
    :cond_3
    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "please call method load before show"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    :cond_4
    :goto_0
    return-void
.end method
