.class public Lcom/aggmoread/sdk/z/b/b/a$b;
.super Lcom/aggmoread/sdk/z/a/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/b/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Landroid/app/Activity;

.field private e:I

.field private f:Landroid/view/ViewGroup;

.field private g:Landroid/view/View;

.field private h:I

.field private i:Landroid/content/Context;

.field private j:Z

.field private k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/e;-><init>()V

    const/16 v0, 0x1388

    iput v0, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->e:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->h:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->j:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->k:Z

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->i:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)Lcom/aggmoread/sdk/z/b/b/a$b;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->g:Landroid/view/View;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/aggmoread/sdk/z/b/b/a$b;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public a(Z)Lcom/aggmoread/sdk/z/b/b/a$b;
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->j:Z

    return-object p0
.end method

.method public b(I)Lcom/aggmoread/sdk/z/b/b/a$b;
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->h:I

    return-object p0
.end method

.method public c(I)Lcom/aggmoread/sdk/z/b/b/a$b;
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->e:I

    return-object p0
.end method

.method public d()Lcom/aggmoread/sdk/z/b/b/a;
    .locals 3

    new-instance v0, Lcom/aggmoread/sdk/z/b/b/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/b/b/a;-><init>(Lcom/aggmoread/sdk/z/b/b/a$a;)V

    new-instance v1, Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->d:Landroid/app/Activity;

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/b/b/a;->a(Lcom/aggmoread/sdk/z/b/b/a;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/b/b/a;->a(Lcom/aggmoread/sdk/z/b/b/a;Ljava/lang/String;)Ljava/lang/String;

    iget v1, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->e:I

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/b/b/a;->a(Lcom/aggmoread/sdk/z/b/b/a;I)I

    new-instance v1, Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->f:Landroid/view/ViewGroup;

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/b/b/a;->b(Lcom/aggmoread/sdk/z/b/b/a;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    iget v1, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->h:I

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/b/b/a;->b(Lcom/aggmoread/sdk/z/b/b/a;I)I

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->g:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/b/b/a;->a(Lcom/aggmoread/sdk/z/b/b/a;Landroid/view/View;)Landroid/view/View;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->i:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/b/b/a;->a(Lcom/aggmoread/sdk/z/b/b/a;Landroid/content/Context;)Landroid/content/Context;

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->j:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/b/b/a;->b(Lcom/aggmoread/sdk/z/b/b/a;Z)Z

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/b/b/a;->b(Lcom/aggmoread/sdk/z/b/b/a;Ljava/lang/String;)Ljava/lang/String;

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/b/b/a$b;->k:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/b/b/a;->a(Lcom/aggmoread/sdk/z/b/b/a;Z)Z

    invoke-virtual {v0, p0}, Lcom/aggmoread/sdk/z/a/e;->a(Lcom/aggmoread/sdk/z/a/c;)Lcom/aggmoread/sdk/z/a/c;

    return-object v0
.end method
