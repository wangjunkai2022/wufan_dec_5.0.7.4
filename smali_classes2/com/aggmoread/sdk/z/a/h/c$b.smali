.class public Lcom/aggmoread/sdk/z/a/h/c$b;
.super Lcom/aggmoread/sdk/z/a/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/a/h/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private b:Ljava/lang/String;

.field private c:Landroid/app/Activity;

.field private d:Landroid/content/Context;

.field private e:I

.field private f:Landroid/view/ViewGroup;

.field private g:Landroid/view/View;

.field private h:I

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Lcom/aggmoread/sdk/z/a/s/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/e;-><init>()V

    const/16 v0, 0x1388

    iput v0, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->e:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->h:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->i:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->j:Z

    iput-boolean v1, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->k:Z

    sget-object v0, Lcom/aggmoread/sdk/z/a/s/c;->k:Lcom/aggmoread/sdk/z/a/s/c;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->l:Lcom/aggmoread/sdk/z/a/s/c;

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->c:Landroid/app/Activity;

    :cond_0
    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->d:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)Lcom/aggmoread/sdk/z/a/h/c$b;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->g:Landroid/view/View;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/aggmoread/sdk/z/a/h/c$b;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public a(Z)Lcom/aggmoread/sdk/z/a/h/c$b;
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->i:Z

    return-object p0
.end method

.method public b(I)Lcom/aggmoread/sdk/z/a/h/c$b;
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->h:I

    return-object p0
.end method

.method public b(Z)Lcom/aggmoread/sdk/z/a/h/c$b;
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->k:Z

    return-object p0
.end method

.method public c(I)Lcom/aggmoread/sdk/z/a/h/c$b;
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->e:I

    return-object p0
.end method

.method public d()Lcom/aggmoread/sdk/z/a/h/c;
    .locals 3

    new-instance v0, Lcom/aggmoread/sdk/z/a/h/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/a/h/c;-><init>(Lcom/aggmoread/sdk/z/a/h/c$a;)V

    new-instance v1, Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->c:Landroid/app/Activity;

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/h/c;->a(Lcom/aggmoread/sdk/z/a/h/c;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/h/c;->a(Lcom/aggmoread/sdk/z/a/h/c;Ljava/lang/String;)Ljava/lang/String;

    iget v1, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->e:I

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/h/c;->a(Lcom/aggmoread/sdk/z/a/h/c;I)I

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->g:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/h/c;->a(Lcom/aggmoread/sdk/z/a/h/c;Landroid/view/View;)Landroid/view/View;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->d:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/h/c;->a(Lcom/aggmoread/sdk/z/a/h/c;Landroid/content/Context;)Landroid/content/Context;

    new-instance v1, Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->f:Landroid/view/ViewGroup;

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/h/c;->b(Lcom/aggmoread/sdk/z/a/h/c;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    iget v1, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->h:I

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/h/c;->b(Lcom/aggmoread/sdk/z/a/h/c;I)I

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->i:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/h/c;->b(Lcom/aggmoread/sdk/z/a/h/c;Z)Z

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->j:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/h/c;->c(Lcom/aggmoread/sdk/z/a/h/c;Z)Z

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->l:Lcom/aggmoread/sdk/z/a/s/c;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/h/c;->a(Lcom/aggmoread/sdk/z/a/h/c;Lcom/aggmoread/sdk/z/a/s/c;)Lcom/aggmoread/sdk/z/a/s/c;

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/a/h/c$b;->k:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/h/c;->a(Lcom/aggmoread/sdk/z/a/h/c;Z)Z

    invoke-virtual {v0, p0}, Lcom/aggmoread/sdk/z/a/e;->a(Lcom/aggmoread/sdk/z/a/c;)Lcom/aggmoread/sdk/z/a/c;

    return-object v0
.end method
