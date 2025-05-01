.class public final Lcom/beizi/ad/internal/network/a$a;
.super Ljava/lang/Object;
.source "AdRequestImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/network/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroid/os/Bundle;

.field private final c:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/Date;

.field private e:Ljava/lang/String;

.field private f:I

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:I

.field private j:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/beizi/ad/internal/network/a$a;->a:Ljava/util/HashSet;

    .line 3
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/beizi/ad/internal/network/a$a;->b:Landroid/os/Bundle;

    .line 4
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/beizi/ad/internal/network/a$a;->c:Ljava/util/HashSet;

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/beizi/ad/internal/network/a$a;->f:I

    const/4 v1, 0x0

    .line 6
    iput-boolean v1, p0, Lcom/beizi/ad/internal/network/a$a;->g:Z

    .line 7
    iput v0, p0, Lcom/beizi/ad/internal/network/a$a;->i:I

    return-void
.end method

.method static synthetic a(Lcom/beizi/ad/internal/network/a$a;)Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/network/a$a;->d:Ljava/util/Date;

    return-object p0
.end method

.method static synthetic b(Lcom/beizi/ad/internal/network/a$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/network/a$a;->e:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lcom/beizi/ad/internal/network/a$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/beizi/ad/internal/network/a$a;->f:I

    return p0
.end method

.method static synthetic d(Lcom/beizi/ad/internal/network/a$a;)Ljava/util/HashSet;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/network/a$a;->a:Ljava/util/HashSet;

    return-object p0
.end method

.method static synthetic e(Lcom/beizi/ad/internal/network/a$a;)Landroid/os/Bundle;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/network/a$a;->b:Landroid/os/Bundle;

    return-object p0
.end method

.method static synthetic f(Lcom/beizi/ad/internal/network/a$a;)Ljava/util/HashSet;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/network/a$a;->c:Ljava/util/HashSet;

    return-object p0
.end method

.method static synthetic g(Lcom/beizi/ad/internal/network/a$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/beizi/ad/internal/network/a$a;->g:Z

    return p0
.end method

.method static synthetic h(Lcom/beizi/ad/internal/network/a$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/network/a$a;->h:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic i(Lcom/beizi/ad/internal/network/a$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/beizi/ad/internal/network/a$a;->i:I

    return p0
.end method

.method static synthetic j(Lcom/beizi/ad/internal/network/a$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/beizi/ad/internal/network/a$a;->j:Z

    return p0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Landroid/os/Bundle;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/beizi/ad/b/b;",
            ">;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    .line 8
    iget-object v0, p0, Lcom/beizi/ad/internal/network/a$a;->b:Landroid/os/Bundle;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public a()Ljava/util/Date;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/beizi/ad/internal/network/a$a;->d:Ljava/util/Date;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 5
    iput p1, p0, Lcom/beizi/ad/internal/network/a$a;->f:I

    return-void
.end method

.method public a(Ljava/lang/Class;Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/beizi/ad/b/b;",
            ">;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/network/a$a;->b:Landroid/os/Bundle;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/network/a$a;->a:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a(Ljava/util/Date;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/beizi/ad/internal/network/a$a;->d:Ljava/util/Date;

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 6
    iput p1, p0, Lcom/beizi/ad/internal/network/a$a;->i:I

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/network/a$a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/network/a$a;->c:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/beizi/ad/internal/network/a$a;->j:Z

    return-void
.end method

.method public c()I
    .locals 1

    .line 3
    iget v0, p0, Lcom/beizi/ad/internal/network/a$a;->f:I

    return v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/internal/network/a$a;->e:Ljava/lang/String;

    return-void
.end method

.method public d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/network/a$a;->a:Ljava/util/HashSet;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/internal/network/a$a;->h:Ljava/lang/String;

    return-void
.end method

.method public e()Lcom/beizi/ad/b/a;
    .locals 5

    .line 2
    new-instance v0, Lcom/beizi/ad/b/a;

    iget-object v1, p0, Lcom/beizi/ad/internal/network/a$a;->d:Ljava/util/Date;

    iget v2, p0, Lcom/beizi/ad/internal/network/a$a;->f:I

    iget-object v3, p0, Lcom/beizi/ad/internal/network/a$a;->a:Ljava/util/HashSet;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/beizi/ad/b/a;-><init>(Ljava/util/Date;ILjava/util/Set;Z)V

    return-object v0
.end method
