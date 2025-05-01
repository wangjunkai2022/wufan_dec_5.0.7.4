.class public Lcom/aggmoread/sdk/z/a/s/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/a/s/e$b;,
        Lcom/aggmoread/sdk/z/a/s/e$c;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/view/OrientationEventListener;

.field private c:I

.field private d:J

.field private e:J

.field private f:Lcom/aggmoread/sdk/z/a/s/e$b;

.field private g:I

.field private h:Lcom/aggmoread/sdk/z/a/s/e$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x14

    iput v0, p0, Lcom/aggmoread/sdk/z/a/s/e;->c:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/aggmoread/sdk/z/a/s/e;->d:J

    iput-wide v0, p0, Lcom/aggmoread/sdk/z/a/s/e;->e:J

    sget-object v0, Lcom/aggmoread/sdk/z/a/s/e$b;->b:Lcom/aggmoread/sdk/z/a/s/e$b;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e;->f:Lcom/aggmoread/sdk/z/a/s/e$b;

    const/4 v0, 0x1

    iput v0, p0, Lcom/aggmoread/sdk/z/a/s/e;->g:I

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/e;->a:Landroid/content/Context;

    return-void
.end method

.method private a(I)Lcom/aggmoread/sdk/z/a/s/e$b;
    .locals 2

    iget v0, p0, Lcom/aggmoread/sdk/z/a/s/e;->c:I

    if-le p1, v0, :cond_4

    rsub-int v0, v0, 0x168

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit16 v0, p1, -0xb4

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Lcom/aggmoread/sdk/z/a/s/e;->c:I

    if-gt v0, v1, :cond_1

    sget-object p1, Lcom/aggmoread/sdk/z/a/s/e$b;->c:Lcom/aggmoread/sdk/z/a/s/e$b;

    return-object p1

    :cond_1
    add-int/lit8 v0, p1, -0x5a

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Lcom/aggmoread/sdk/z/a/s/e;->c:I

    if-gt v0, v1, :cond_2

    sget-object p1, Lcom/aggmoread/sdk/z/a/s/e$b;->e:Lcom/aggmoread/sdk/z/a/s/e$b;

    return-object p1

    :cond_2
    add-int/lit16 p1, p1, -0x10e

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    iget v0, p0, Lcom/aggmoread/sdk/z/a/s/e;->c:I

    if-gt p1, v0, :cond_3

    sget-object p1, Lcom/aggmoread/sdk/z/a/s/e$b;->d:Lcom/aggmoread/sdk/z/a/s/e$b;

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1

    :cond_4
    :goto_0
    sget-object p1, Lcom/aggmoread/sdk/z/a/s/e$b;->b:Lcom/aggmoread/sdk/z/a/s/e$b;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/s/e;)Lcom/aggmoread/sdk/z/a/s/e$b;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/s/e;->f:Lcom/aggmoread/sdk/z/a/s/e$b;

    return-object p0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/s/e;I)Lcom/aggmoread/sdk/z/a/s/e$b;
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/a/s/e;->a(I)Lcom/aggmoread/sdk/z/a/s/e$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/s/e;Lcom/aggmoread/sdk/z/a/s/e$b;)Lcom/aggmoread/sdk/z/a/s/e$b;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/e;->f:Lcom/aggmoread/sdk/z/a/s/e$b;

    return-object p1
.end method

.method private a()V
    .locals 7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/aggmoread/sdk/z/a/s/e;->e:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    iput-wide v0, p0, Lcom/aggmoread/sdk/z/a/s/e;->e:J

    :cond_0
    iget-wide v2, p0, Lcom/aggmoread/sdk/z/a/s/e;->d:J

    iget-wide v4, p0, Lcom/aggmoread/sdk/z/a/s/e;->e:J

    sub-long v4, v0, v4

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/aggmoread/sdk/z/a/s/e;->d:J

    iput-wide v0, p0, Lcom/aggmoread/sdk/z/a/s/e;->e:J

    return-void
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/a/s/e;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/s/e;->g:I

    return p1
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/a/s/e;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/e;->d()V

    return-void
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/a/s/e;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/e;->a()V

    return-void
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/a/s/e;)J
    .locals 2

    iget-wide v0, p0, Lcom/aggmoread/sdk/z/a/s/e;->d:J

    return-wide v0
.end method

.method private d()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/aggmoread/sdk/z/a/s/e;->e:J

    iput-wide v0, p0, Lcom/aggmoread/sdk/z/a/s/e;->d:J

    return-void
.end method

.method static synthetic e(Lcom/aggmoread/sdk/z/a/s/e;)I
    .locals 0

    iget p0, p0, Lcom/aggmoread/sdk/z/a/s/e;->g:I

    return p0
.end method

.method static synthetic f(Lcom/aggmoread/sdk/z/a/s/e;)Lcom/aggmoread/sdk/z/a/s/e$c;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/s/e;->h:Lcom/aggmoread/sdk/z/a/s/e$c;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/a/s/e$c;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/e;->h:Lcom/aggmoread/sdk/z/a/s/e$c;

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e;->b:Landroid/view/OrientationEventListener;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->disable()V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e;->b:Landroid/view/OrientationEventListener;

    if-nez v0, :cond_0

    new-instance v0, Lcom/aggmoread/sdk/z/a/s/e$a;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/e;->a:Landroid/content/Context;

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2}, Lcom/aggmoread/sdk/z/a/s/e$a;-><init>(Lcom/aggmoread/sdk/z/a/s/e;Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e;->b:Landroid/view/OrientationEventListener;

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e;->b:Landroid/view/OrientationEventListener;

    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->enable()V

    return-void
.end method
