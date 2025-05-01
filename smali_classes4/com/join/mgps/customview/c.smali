.class public final Lcom/join/mgps/customview/c;
.super Lcom/join/mgps/customview/b;
.source "ForumExtFuncPopWindow_.java"


# instance fields
.field private A:Ljava/lang/Object;

.field private z:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/b;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/customview/c;->z:Landroid/content/Context;

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/customview/c;->B()V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/b;-><init>(Landroid/content/Context;)V

    .line 5
    iput-object p1, p0, Lcom/join/mgps/customview/c;->z:Landroid/content/Context;

    .line 6
    iput-object p2, p0, Lcom/join/mgps/customview/c;->A:Ljava/lang/Object;

    .line 7
    invoke-direct {p0}, Lcom/join/mgps/customview/c;->B()V

    return-void
.end method

.method public static A(Landroid/content/Context;Ljava/lang/Object;)Lcom/join/mgps/customview/c;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/customview/c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/customview/c;-><init>(Landroid/content/Context;Ljava/lang/Object;)V

    return-object v0
.end method

.method private B()V
    .locals 0

    return-void
.end method

.method static synthetic s(Lcom/join/mgps/customview/c;Lcom/join/mgps/dto/ForumBean$ForumPostsBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/customview/b;->j(Lcom/join/mgps/dto/ForumBean$ForumPostsBean;)V

    return-void
.end method

.method static synthetic t(Lcom/join/mgps/customview/c;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/customview/b;->r(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic u(Lcom/join/mgps/customview/c;IZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/customview/b;->i(IZ)V

    return-void
.end method

.method static synthetic v(Lcom/join/mgps/customview/c;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/customview/b;->e()V

    return-void
.end method

.method static synthetic w(Lcom/join/mgps/customview/c;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/customview/b;->d()V

    return-void
.end method

.method static synthetic x(Lcom/join/mgps/customview/c;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/customview/b;->f()V

    return-void
.end method

.method static synthetic y(Lcom/join/mgps/customview/c;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/customview/b;->c()V

    return-void
.end method

.method public static z(Landroid/content/Context;)Lcom/join/mgps/customview/c;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/customview/c;

    invoke-direct {v0, p0}, Lcom/join/mgps/customview/c;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public C(Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/c;->z:Landroid/content/Context;

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/customview/c;->B()V

    return-void
.end method

.method c()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/customview/c$g;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/customview/c$g;-><init>(Lcom/join/mgps/customview/c;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method d()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/customview/c$e;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/customview/c$e;-><init>(Lcom/join/mgps/customview/c;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method e()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/customview/c$d;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/customview/c$d;-><init>(Lcom/join/mgps/customview/c;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method f()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/customview/c$f;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/customview/c$f;-><init>(Lcom/join/mgps/customview/c;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method i(IZ)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/customview/c$c;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/customview/c$c;-><init>(Lcom/join/mgps/customview/c;IZ)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method j(Lcom/join/mgps/dto/ForumBean$ForumPostsBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/customview/c$a;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/customview/c$a;-><init>(Lcom/join/mgps/customview/c;Lcom/join/mgps/dto/ForumBean$ForumPostsBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method r(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/customview/c$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/customview/c$b;-><init>(Lcom/join/mgps/customview/c;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
