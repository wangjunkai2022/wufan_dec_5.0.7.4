.class public Lcom/beizi/ad/c/d$a$a;
.super Ljava/lang/Object;
.source "CommonInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/c/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lcom/beizi/ad/c/e$e;

.field private e:Lcom/beizi/ad/c/e$b;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private s:Ljava/lang/String;

.field private t:Z

.field private u:Ljava/lang/String;

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/beizi/ad/c/e$b;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->e:Lcom/beizi/ad/c/e$b;

    return-object p0
.end method

.method public a(Lcom/beizi/ad/c/e$e;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->d:Lcom/beizi/ad/c/e$e;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public a(Z)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/beizi/ad/c/d$a$a;->t:Z

    return-object p0
.end method

.method public a()Lcom/beizi/ad/c/d$a;
    .locals 2

    .line 5
    new-instance v0, Lcom/beizi/ad/c/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/beizi/ad/c/d$a;-><init>(Lcom/beizi/ad/c/d$1;)V

    .line 6
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->e:Lcom/beizi/ad/c/e$b;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->a(Lcom/beizi/ad/c/d$a;Lcom/beizi/ad/c/e$b;)Lcom/beizi/ad/c/e$b;

    .line 7
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->d:Lcom/beizi/ad/c/e$e;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->a(Lcom/beizi/ad/c/d$a;Lcom/beizi/ad/c/e$e;)Lcom/beizi/ad/c/e$e;

    .line 8
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->m:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->a(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->k:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->b(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->l:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->c(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->g:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->d(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->e(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->i:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->f(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->j:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->g(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->h(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->i(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->n:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->j(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->o:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->k(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->l(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->f:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->m(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->r:Ljava/util/HashSet;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->a(Lcom/beizi/ad/c/d$a;Ljava/util/HashSet;)Ljava/util/HashSet;

    .line 22
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->p:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->n(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->q:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->o(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->s:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->p(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    iget-boolean v1, p0, Lcom/beizi/ad/c/d$a$a;->t:Z

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->a(Lcom/beizi/ad/c/d$a;Z)Z

    .line 26
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->u:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->q(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->v:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->r(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    iget-object v1, p0, Lcom/beizi/ad/c/d$a$a;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$a;->s(Lcom/beizi/ad/c/d$a;Ljava/lang/String;)Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->f:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->g:Ljava/lang/String;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->h:Ljava/lang/String;

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->i:Ljava/lang/String;

    return-object p0
.end method

.method public h(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->j:Ljava/lang/String;

    return-object p0
.end method

.method public i(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->k:Ljava/lang/String;

    return-object p0
.end method

.method public j(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->l:Ljava/lang/String;

    return-object p0
.end method

.method public k(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->m:Ljava/lang/String;

    return-object p0
.end method

.method public l(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->n:Ljava/lang/String;

    return-object p0
.end method

.method public m(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->o:Ljava/lang/String;

    return-object p0
.end method

.method public n(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->p:Ljava/lang/String;

    return-object p0
.end method

.method public o(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->q:Ljava/lang/String;

    return-object p0
.end method

.method public p(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->s:Ljava/lang/String;

    return-object p0
.end method

.method public q(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->u:Ljava/lang/String;

    return-object p0
.end method

.method public r(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->v:Ljava/lang/String;

    return-object p0
.end method

.method public s(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$a$a;->w:Ljava/lang/String;

    return-object p0
.end method
