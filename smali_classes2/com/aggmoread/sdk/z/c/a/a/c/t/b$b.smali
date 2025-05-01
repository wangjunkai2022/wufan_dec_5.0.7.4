.class public final Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/c/t/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:Z

.field private d:I

.field private e:I

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->a:I

    iput v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->b:I

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->c:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->f:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->g:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->h:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->i:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->j:Z

    return-void
.end method


# virtual methods
.method public a(I)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->b:I

    return-object p0
.end method

.method public a(Z)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->c:Z

    return-object p0
.end method

.method public a()Lcom/aggmoread/sdk/z/c/a/a/c/t/b;
    .locals 2

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/c/t/b$a;)V

    iget v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->b:I

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->b(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;I)I

    iget v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->a:I

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->c(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;I)I

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->c:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->a(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;Z)Z

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->g:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->b(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;Z)Z

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->f:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->c(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;Z)Z

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->h:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->d(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;Z)Z

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->i:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->e(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;Z)Z

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->j:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->f(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;Z)Z

    iget v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->d:I

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->d(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;I)I

    iget v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->e:I

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->a(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;I)I

    return-object v0
.end method

.method public b(I)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->a:I

    return-object p0
.end method

.method public b(Z)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->j:Z

    return-object p0
.end method

.method public c(Z)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->h:Z

    return-object p0
.end method

.method public d(Z)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->i:Z

    return-object p0
.end method

.method public e(Z)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->g:Z

    return-object p0
.end method

.method public f(Z)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->f:Z

    return-object p0
.end method
