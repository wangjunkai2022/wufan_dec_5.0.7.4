.class public Lcom/kingja/loadsir/core/c$b;
.super Ljava/lang/Object;
.source "LoadSir.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kingja/loadsir/core/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kingja/loadsir/callback/Callback;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk2/b;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lcom/kingja/loadsir/callback/Callback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kingja/loadsir/core/c$b;->a:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kingja/loadsir/core/c$b;->b:Ljava/util/List;

    .line 4
    new-instance v1, Lk2/a;

    invoke-direct {v1}, Lk2/a;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object v0, p0, Lcom/kingja/loadsir/core/c$b;->b:Ljava/util/List;

    new-instance v1, Lk2/c;

    invoke-direct {v1}, Lk2/c;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public a(Lcom/kingja/loadsir/callback/Callback;)Lcom/kingja/loadsir/core/c$b;
    .locals 1
    .param p1    # Lcom/kingja/loadsir/callback/Callback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/kingja/loadsir/core/c$b;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b(Lk2/b;)Lcom/kingja/loadsir/core/c$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kingja/loadsir/core/c$b;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c()Lcom/kingja/loadsir/core/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/kingja/loadsir/core/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/kingja/loadsir/core/c;-><init>(Lcom/kingja/loadsir/core/c$b;Lcom/kingja/loadsir/core/c$a;)V

    return-object v0
.end method

.method public d()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kingja/loadsir/core/c;->c()Lcom/kingja/loadsir/core/c;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/kingja/loadsir/core/c;->a(Lcom/kingja/loadsir/core/c;Lcom/kingja/loadsir/core/c$b;)V

    return-void
.end method

.method e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kingja/loadsir/callback/Callback;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kingja/loadsir/core/c$b;->a:Ljava/util/List;

    return-object v0
.end method

.method f()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/kingja/loadsir/callback/Callback;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kingja/loadsir/core/c$b;->c:Ljava/lang/Class;

    return-object v0
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lk2/b;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kingja/loadsir/core/c$b;->b:Ljava/util/List;

    return-object v0
.end method

.method public h(Ljava/lang/Class;)Lcom/kingja/loadsir/core/c$b;
    .locals 0
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/kingja/loadsir/callback/Callback;",
            ">;)",
            "Lcom/kingja/loadsir/core/c$b;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/kingja/loadsir/core/c$b;->c:Ljava/lang/Class;

    return-object p0
.end method
