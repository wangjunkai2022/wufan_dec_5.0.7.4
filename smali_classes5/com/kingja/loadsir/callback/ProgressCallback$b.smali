.class public Lcom/kingja/loadsir/callback/ProgressCallback$b;
.super Ljava/lang/Object;
.source "ProgressCallback.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kingja/loadsir/callback/ProgressCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:I

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/kingja/loadsir/callback/ProgressCallback$b;->c:I

    .line 3
    iput v0, p0, Lcom/kingja/loadsir/callback/ProgressCallback$b;->d:I

    return-void
.end method

.method static synthetic a(Lcom/kingja/loadsir/callback/ProgressCallback$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kingja/loadsir/callback/ProgressCallback$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lcom/kingja/loadsir/callback/ProgressCallback$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kingja/loadsir/callback/ProgressCallback$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lcom/kingja/loadsir/callback/ProgressCallback$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kingja/loadsir/callback/ProgressCallback$b;->c:I

    return p0
.end method

.method static synthetic d(Lcom/kingja/loadsir/callback/ProgressCallback$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kingja/loadsir/callback/ProgressCallback$b;->d:I

    return p0
.end method

.method static synthetic e(Lcom/kingja/loadsir/callback/ProgressCallback$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kingja/loadsir/callback/ProgressCallback$b;->e:Z

    return p0
.end method


# virtual methods
.method public f()Lcom/kingja/loadsir/callback/ProgressCallback;
    .locals 2

    .line 1
    new-instance v0, Lcom/kingja/loadsir/callback/ProgressCallback;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/kingja/loadsir/callback/ProgressCallback;-><init>(Lcom/kingja/loadsir/callback/ProgressCallback$b;Lcom/kingja/loadsir/callback/ProgressCallback$a;)V

    return-object v0
.end method

.method public g(Z)Lcom/kingja/loadsir/callback/ProgressCallback$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kingja/loadsir/callback/ProgressCallback$b;->e:Z

    return-object p0
.end method

.method public h(Ljava/lang/String;)Lcom/kingja/loadsir/callback/ProgressCallback$b;
    .locals 1

    const/4 v0, -0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/kingja/loadsir/callback/ProgressCallback$b;->i(Ljava/lang/String;I)Lcom/kingja/loadsir/callback/ProgressCallback$b;

    move-result-object p1

    return-object p1
.end method

.method public i(Ljava/lang/String;I)Lcom/kingja/loadsir/callback/ProgressCallback$b;
    .locals 0
    .param p2    # I
        .annotation build Landroidx/annotation/StyleRes;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/kingja/loadsir/callback/ProgressCallback$b;->b:Ljava/lang/String;

    .line 2
    iput p2, p0, Lcom/kingja/loadsir/callback/ProgressCallback$b;->c:I

    return-object p0
.end method

.method public j(Ljava/lang/String;)Lcom/kingja/loadsir/callback/ProgressCallback$b;
    .locals 1

    const/4 v0, -0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/kingja/loadsir/callback/ProgressCallback$b;->k(Ljava/lang/String;I)Lcom/kingja/loadsir/callback/ProgressCallback$b;

    move-result-object p1

    return-object p1
.end method

.method public k(Ljava/lang/String;I)Lcom/kingja/loadsir/callback/ProgressCallback$b;
    .locals 0
    .param p2    # I
        .annotation build Landroidx/annotation/StyleRes;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/kingja/loadsir/callback/ProgressCallback$b;->a:Ljava/lang/String;

    .line 2
    iput p2, p0, Lcom/kingja/loadsir/callback/ProgressCallback$b;->d:I

    return-object p0
.end method
