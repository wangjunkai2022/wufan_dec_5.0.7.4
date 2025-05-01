.class public Lcom/aggmoread/sdk/z/a/h/c;
.super Lcom/aggmoread/sdk/z/a/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/a/h/c$b;
    }
.end annotation


# static fields
.field public static o:Ljava/lang/String; = ""


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Landroid/content/Context;

.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private f:I

.field private g:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/ViewGroup;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/aggmoread/sdk/z/a/i/a;

.field private i:I

.field private j:Landroid/view/View;

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Lcom/aggmoread/sdk/z/a/s/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/e;-><init>()V

    const/16 v0, 0x1388

    iput v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->f:I

    sget-object v0, Lcom/aggmoread/sdk/z/a/i/a;->g:Lcom/aggmoread/sdk/z/a/i/a;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->h:Lcom/aggmoread/sdk/z/a/i/a;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->k:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->l:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->m:Z

    sget-object v0, Lcom/aggmoread/sdk/z/a/s/c;->k:Lcom/aggmoread/sdk/z/a/s/c;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->n:Lcom/aggmoread/sdk/z/a/s/c;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->b:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/aggmoread/sdk/z/a/h/c$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/h/c;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/h/c;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/h/c;->f:I

    return p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/h/c;Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/h/c;->d:Landroid/content/Context;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/h/c;Landroid/view/View;)Landroid/view/View;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/h/c;->j:Landroid/view/View;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/h/c;Lcom/aggmoread/sdk/z/a/s/c;)Lcom/aggmoread/sdk/z/a/s/c;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/h/c;->n:Lcom/aggmoread/sdk/z/a/s/c;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/h/c;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/h/c;->c:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/h/c;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/h/c;->e:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/h/c;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/h/c;->m:Z

    return p1
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/a/h/c;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/h/c;->i:I

    return p1
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/a/h/c;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/h/c;->g:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/a/h/c;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/h/c;->k:Z

    return p1
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/a/h/c;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/h/c;->l:Z

    return p1
.end method

.method private d()Z
    .locals 1

    invoke-static {}, Lcom/aggmoread/sdk/z/a/h/a;->d()Lcom/aggmoread/sdk/z/a/h/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/h/a;->f()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/a/f/a;)V
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/h/c;->d()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/aggmoread/sdk/z/a/g/e;->h:Lcom/aggmoread/sdk/z/a/g/e;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/z/a/i/b;->a(Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void

    :cond_0
    sget-object v0, Lcom/aggmoread/sdk/z/a/i/a;->e:Lcom/aggmoread/sdk/z/a/i/a;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->h:Lcom/aggmoread/sdk/z/a/i/a;

    invoke-static {p0, p1}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/h/c;Lcom/aggmoread/sdk/z/a/i/b;)V

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/k/a;)V
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/h/c;->d()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/aggmoread/sdk/z/a/g/e;->h:Lcom/aggmoread/sdk/z/a/g/e;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/z/a/i/b;->a(Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void

    :cond_0
    sget-object v0, Lcom/aggmoread/sdk/z/a/i/a;->d:Lcom/aggmoread/sdk/z/a/i/a;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->h:Lcom/aggmoread/sdk/z/a/i/a;

    invoke-static {p0, p1}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/h/c;Lcom/aggmoread/sdk/z/a/i/b;)V

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/l/a;)V
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/h/c;->d()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/aggmoread/sdk/z/a/g/e;->h:Lcom/aggmoread/sdk/z/a/g/e;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/z/a/l/a;->a(Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void

    :cond_0
    sget-object v0, Lcom/aggmoread/sdk/z/a/i/a;->c:Lcom/aggmoread/sdk/z/a/i/a;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->h:Lcom/aggmoread/sdk/z/a/i/a;

    invoke-static {p0, p1}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/h/c;Lcom/aggmoread/sdk/z/a/i/b;)V

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/r/c;)V
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/h/c;->d()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/aggmoread/sdk/z/a/g/e;->h:Lcom/aggmoread/sdk/z/a/g/e;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/z/a/i/b;->a(Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void

    :cond_0
    sget-object v0, Lcom/aggmoread/sdk/z/a/i/a;->f:Lcom/aggmoread/sdk/z/a/i/a;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->h:Lcom/aggmoread/sdk/z/a/i/a;

    invoke-static {p0, p1}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/h/c;Lcom/aggmoread/sdk/z/a/i/b;)V

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/r/d;)V
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/h/c;->d()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/aggmoread/sdk/z/a/g/e;->h:Lcom/aggmoread/sdk/z/a/g/e;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/z/a/i/b;->a(Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void

    :cond_0
    sget-object v0, Lcom/aggmoread/sdk/z/a/i/a;->b:Lcom/aggmoread/sdk/z/a/i/a;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->h:Lcom/aggmoread/sdk/z/a/i/a;

    invoke-static {p0, p1}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/h/c;Lcom/aggmoread/sdk/z/a/i/b;)V

    return-void
.end method

.method public e()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->e:Ljava/lang/ref/WeakReference;

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

.method public f()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method public g()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->j:Landroid/view/View;

    return-object v0
.end method

.method public h()Lcom/aggmoread/sdk/z/a/i/a;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->h:Lcom/aggmoread/sdk/z/a/i/a;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public j()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->d:Landroid/content/Context;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public l()Lcom/aggmoread/sdk/z/a/s/c;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->n:Lcom/aggmoread/sdk/z/a/s/c;

    return-object v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->l:Z

    return v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->k:Z

    return v0
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/h/c;->m:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JuHeApiRequest{requestId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/h/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", codeId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/h/c;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", activityWeak="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/h/c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timeoutMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/aggmoread/sdk/z/a/h/c;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", adContainerWeak="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/h/c;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", adType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/h/c;->h:Lcom/aggmoread/sdk/z/a/i/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
