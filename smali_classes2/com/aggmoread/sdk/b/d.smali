.class public Lcom/aggmoread/sdk/b/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/aggmoread/sdk/client/IAMAdLoadListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/aggmoread/sdk/client/IAMAdLoadListener<",
            "*>;"
        }
    .end annotation
.end field

.field private b:Lcom/aggmoread/sdk/client/IAMAdInteractionListener;

.field private c:Lcom/aggmoread/sdk/client/AMAdType;

.field private d:Z

.field private e:Z


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/client/AMAdType;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/b/d;->d:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/aggmoread/sdk/b/d;->e:Z

    iput-object p1, p0, Lcom/aggmoread/sdk/b/d;->c:Lcom/aggmoread/sdk/client/AMAdType;

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/b/d;)Lcom/aggmoread/sdk/client/IAMAdLoadListener;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/b/d;->a:Lcom/aggmoread/sdk/client/IAMAdLoadListener;

    return-object p0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/b/d;Lcom/aggmoread/sdk/z/c/a/a/c/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/b/d;->a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V

    return-void
.end method

.method private a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V
    .locals 3

    iget-boolean v0, p0, Lcom/aggmoread/sdk/b/d;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/d;->b:Lcom/aggmoread/sdk/client/IAMAdInteractionListener;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/aggmoread/sdk/client/AMError;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/d;->a()I

    move-result v2

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/d;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/aggmoread/sdk/client/AMError;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/client/IAMAdInteractionListener;->onAdError(Lcom/aggmoread/sdk/client/AMError;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/b/d;->a:Lcom/aggmoread/sdk/client/IAMAdLoadListener;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/aggmoread/sdk/client/AMError;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/d;->a()I

    move-result v2

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/d;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/aggmoread/sdk/client/AMError;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/client/IAMAdLoadListener;->onAdLoadFail(Lcom/aggmoread/sdk/client/AMError;)V

    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/b/d;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/b/d;->d:Z

    return p1
.end method

.method private b()Lcom/aggmoread/sdk/z/c/a/a/c/s/b;
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/b/d$c;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/b/d$c;-><init>(Lcom/aggmoread/sdk/b/d;)V

    return-object v0
.end method

.method static synthetic b(Lcom/aggmoread/sdk/b/d;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/aggmoread/sdk/b/d;->e:Z

    return p0
.end method

.method static synthetic c(Lcom/aggmoread/sdk/b/d;)Lcom/aggmoread/sdk/client/IAMAdInteractionListener;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/b/d;->b:Lcom/aggmoread/sdk/client/IAMAdInteractionListener;

    return-object p0
.end method

.method private c()Lcom/aggmoread/sdk/z/c/a/a/c/o/f;
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/b/d$d;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/b/d$d;-><init>(Lcom/aggmoread/sdk/b/d;)V

    return-object v0
.end method

.method private d()Lcom/aggmoread/sdk/z/c/a/a/c/f;
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/b/d$a;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/b/d$a;-><init>(Lcom/aggmoread/sdk/b/d;)V

    return-object v0
.end method

.method private e()Lcom/aggmoread/sdk/z/c/a/a/c/n/c;
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/b/d$h;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/b/d$h;-><init>(Lcom/aggmoread/sdk/b/d;)V

    return-object v0
.end method

.method private f()Lcom/aggmoread/sdk/z/c/a/a/c/o/d;
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lcom/aggmoread/sdk/b/d$e;

    invoke-direct {v1, p0, v0}, Lcom/aggmoread/sdk/b/d$e;-><init>(Lcom/aggmoread/sdk/b/d;Ljava/util/HashMap;)V

    return-object v1
.end method

.method private g()Lcom/aggmoread/sdk/z/c/a/a/c/f;
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/b/d$b;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/b/d$b;-><init>(Lcom/aggmoread/sdk/b/d;)V

    return-object v0
.end method

.method private h()Lcom/aggmoread/sdk/z/c/a/a/c/q/c;
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/b/d$g;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/b/d$g;-><init>(Lcom/aggmoread/sdk/b/d;)V

    return-object v0
.end method

.method private i()Lcom/aggmoread/sdk/z/c/a/a/c/f;
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/b/d$f;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/b/d$f;-><init>(Lcom/aggmoread/sdk/b/d;)V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/aggmoread/sdk/z/c/a/a/c/f;
    .locals 2

    sget-object v0, Lcom/aggmoread/sdk/b/d$i;->a:[I

    iget-object v1, p0, Lcom/aggmoread/sdk/b/d;->c:Lcom/aggmoread/sdk/client/AMAdType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return-object v0

    :pswitch_0
    invoke-direct {p0}, Lcom/aggmoread/sdk/b/d;->e()Lcom/aggmoread/sdk/z/c/a/a/c/n/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-direct {p0}, Lcom/aggmoread/sdk/b/d;->d()Lcom/aggmoread/sdk/z/c/a/a/c/f;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-direct {p0}, Lcom/aggmoread/sdk/b/d;->g()Lcom/aggmoread/sdk/z/c/a/a/c/f;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-direct {p0}, Lcom/aggmoread/sdk/b/d;->h()Lcom/aggmoread/sdk/z/c/a/a/c/q/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-direct {p0}, Lcom/aggmoread/sdk/b/d;->i()Lcom/aggmoread/sdk/z/c/a/a/c/f;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-direct {p0}, Lcom/aggmoread/sdk/b/d;->f()Lcom/aggmoread/sdk/z/c/a/a/c/o/d;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-direct {p0}, Lcom/aggmoread/sdk/b/d;->c()Lcom/aggmoread/sdk/z/c/a/a/c/o/f;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-direct {p0}, Lcom/aggmoread/sdk/b/d;->b()Lcom/aggmoread/sdk/z/c/a/a/c/s/b;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a(Lcom/aggmoread/sdk/client/IAMAdInteractionListener;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/b/d;->b:Lcom/aggmoread/sdk/client/IAMAdInteractionListener;

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/client/IAMAdLoadListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/aggmoread/sdk/client/IAMAdLoadListener<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/aggmoread/sdk/b/d;->a:Lcom/aggmoread/sdk/client/IAMAdLoadListener;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/b/d;->e:Z

    return-void
.end method
