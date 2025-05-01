.class public final Lcom/aggmoread/sdk/z/c/a/a/c/t/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    invoke-direct {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;-><init>()V

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->a()Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/c/t/b$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->b:I

    return p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->e:Z

    return p1
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->d:I

    return p1
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->g:Z

    return p1
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->c:I

    return p1
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->f:Z

    return p1
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->a:I

    return p1
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->h:Z

    return p1
.end method

.method static synthetic e(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->i:Z

    return p1
.end method

.method static synthetic f(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->j:Z

    return p1
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->d:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->a:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->b:I

    return v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->e:Z

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->j:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->h:Z

    return v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->g:Z

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->f:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->j:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->f:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->g:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->h:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->i:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "{\u6700\u5927\u89c6\u9891\u65f6\u95f4=%s, \u6700\u5c0f\u89c6\u9891\u65f6\u95f4=%s, \u89c6\u9891\u64ad\u653e\u8bbe\u7f6e=%s, \u9759\u97f3\u64ad\u653e=%s, \u81ea\u52a8\u64ad\u653e\u8bbe\u7f6e=%s, \u662f\u5426\u81ea\u52a8\u9759\u97f3\u64ad\u653e=%s, \u8fdb\u5ea6\u6761=%s, \u5c01\u9762=%s, \u8be6\u60c5\u9875=%s, \u662f\u5426\u70b9\u51fb\u63a7\u5236\u6682\u505c=%s}"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
