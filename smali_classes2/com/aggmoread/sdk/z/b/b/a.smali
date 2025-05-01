.class public Lcom/aggmoread/sdk/z/b/b/a;
.super Lcom/aggmoread/sdk/z/a/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/b/b/a$b;
    }
.end annotation


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Landroid/content/Context;

.field private f:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private g:I

.field private h:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/ViewGroup;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lcom/aggmoread/sdk/z/a/i/a;

.field private j:I

.field private k:Landroid/view/View;

.field private l:Z

.field private m:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/e;-><init>()V

    const/16 v0, 0x1388

    iput v0, p0, Lcom/aggmoread/sdk/z/b/b/a;->g:I

    sget-object v0, Lcom/aggmoread/sdk/z/a/i/a;->g:Lcom/aggmoread/sdk/z/a/i/a;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/b/b/a;->i:Lcom/aggmoread/sdk/z/a/i/a;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/b/b/a;->l:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/b/b/a;->m:Z

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/b/b/a;->b:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/aggmoread/sdk/z/b/b/a$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/b/b/a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/b/b/a;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/b/b/a;->g:I

    return p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/b/b/a;Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/b/a;->e:Landroid/content/Context;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/b/b/a;Landroid/view/View;)Landroid/view/View;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/b/a;->k:Landroid/view/View;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/b/b/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/b/a;->c:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/b/b/a;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/b/a;->f:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/b/b/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/b/b/a;->m:Z

    return p1
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/b/b/a;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/b/b/a;->j:I

    return p1
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/b/b/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/b/a;->d:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/b/b/a;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/b/a;->h:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/b/b/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/b/b/a;->l:Z

    return p1
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/a/l/a;)V
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/z/a/i/a;->c:Lcom/aggmoread/sdk/z/a/i/a;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/b/b/a;->i:Lcom/aggmoread/sdk/z/a/i/a;

    invoke-static {p0, p1}, Lcom/aggmoread/sdk/z/b/c/a;->a(Lcom/aggmoread/sdk/z/b/b/a;Lcom/aggmoread/sdk/z/a/i/b;)V

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/r/d;)V
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/z/a/i/a;->b:Lcom/aggmoread/sdk/z/a/i/a;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/b/b/a;->i:Lcom/aggmoread/sdk/z/a/i/a;

    if-nez p1, :cond_0

    sget-object p1, Lcom/aggmoread/sdk/z/a/r/d;->a:Lcom/aggmoread/sdk/z/a/r/d;

    :cond_0
    invoke-static {p0, p1}, Lcom/aggmoread/sdk/z/b/c/a;->a(Lcom/aggmoread/sdk/z/b/b/a;Lcom/aggmoread/sdk/z/a/i/b;)V

    return-void
.end method

.method public d()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/b/a;->f:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public e()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/b/a;->h:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method public f()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/b/a;->k:Landroid/view/View;

    return-object v0
.end method

.method public g()Lcom/aggmoread/sdk/z/a/i/a;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/b/a;->i:Lcom/aggmoread/sdk/z/a/i/a;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/b/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public i()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/b/a;->e:Landroid/content/Context;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/b/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/b/b/a;->m:Z

    return v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/b/b/a;->l:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DspRequest{requestId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/b/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", codeId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/b/b/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", sdkCodeId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/b/b/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", activityWeak="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/b/a;->f:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timeoutMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/aggmoread/sdk/z/b/b/a;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", adContainerWeak="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/b/a;->h:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", adType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/b/a;->i:Lcom/aggmoread/sdk/z/a/i/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
