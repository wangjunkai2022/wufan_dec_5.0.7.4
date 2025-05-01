.class public Lcom/beizi/fusion/b/d;
.super Ljava/lang/Object;
.source "ObserverAdStatus.java"

# interfaces
.implements Ljava/util/Observer;


# instance fields
.field public a:Lcom/beizi/fusion/b/a$i;

.field public b:Lcom/beizi/fusion/b/a$h;

.field public c:Lcom/beizi/fusion/b/a$k;

.field public d:Lcom/beizi/fusion/b/a$g;

.field public e:Lcom/beizi/fusion/b/a$d;

.field public f:Lcom/beizi/fusion/b/a$e;

.field public g:Lcom/beizi/fusion/b/a$f;

.field public h:Lcom/beizi/fusion/b/a$c;

.field public i:Lcom/beizi/fusion/b/a$b;

.field public j:Lcom/beizi/fusion/b/a$j;

.field public k:Lcom/beizi/fusion/b/a$a;

.field private final l:Lcom/beizi/fusion/b/a;

.field private m:Lcom/beizi/fusion/b/b;

.field private n:Z


# direct methods
.method public constructor <init>(Lcom/beizi/fusion/b/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/beizi/fusion/b/d;->n:Z

    .line 3
    iput-object p1, p0, Lcom/beizi/fusion/b/d;->m:Lcom/beizi/fusion/b/b;

    .line 4
    new-instance p1, Lcom/beizi/fusion/b/a;

    invoke-direct {p1}, Lcom/beizi/fusion/b/a;-><init>()V

    iput-object p1, p0, Lcom/beizi/fusion/b/d;->l:Lcom/beizi/fusion/b/a;

    .line 5
    new-instance v0, Lcom/beizi/fusion/b/a$i;

    invoke-direct {v0, p1}, Lcom/beizi/fusion/b/a$i;-><init>(Lcom/beizi/fusion/b/a;)V

    iput-object v0, p0, Lcom/beizi/fusion/b/d;->a:Lcom/beizi/fusion/b/a$i;

    .line 6
    new-instance v0, Lcom/beizi/fusion/b/a$h;

    invoke-direct {v0, p1}, Lcom/beizi/fusion/b/a$h;-><init>(Lcom/beizi/fusion/b/a;)V

    iput-object v0, p0, Lcom/beizi/fusion/b/d;->b:Lcom/beizi/fusion/b/a$h;

    .line 7
    new-instance v0, Lcom/beizi/fusion/b/a$k;

    invoke-direct {v0, p1}, Lcom/beizi/fusion/b/a$k;-><init>(Lcom/beizi/fusion/b/a;)V

    iput-object v0, p0, Lcom/beizi/fusion/b/d;->c:Lcom/beizi/fusion/b/a$k;

    .line 8
    new-instance v0, Lcom/beizi/fusion/b/a$g;

    invoke-direct {v0, p1}, Lcom/beizi/fusion/b/a$g;-><init>(Lcom/beizi/fusion/b/a;)V

    iput-object v0, p0, Lcom/beizi/fusion/b/d;->d:Lcom/beizi/fusion/b/a$g;

    .line 9
    new-instance v0, Lcom/beizi/fusion/b/a$d;

    invoke-direct {v0, p1}, Lcom/beizi/fusion/b/a$d;-><init>(Lcom/beizi/fusion/b/a;)V

    iput-object v0, p0, Lcom/beizi/fusion/b/d;->e:Lcom/beizi/fusion/b/a$d;

    .line 10
    new-instance v0, Lcom/beizi/fusion/b/a$e;

    invoke-direct {v0, p1}, Lcom/beizi/fusion/b/a$e;-><init>(Lcom/beizi/fusion/b/a;)V

    iput-object v0, p0, Lcom/beizi/fusion/b/d;->f:Lcom/beizi/fusion/b/a$e;

    .line 11
    new-instance v0, Lcom/beizi/fusion/b/a$f;

    invoke-direct {v0, p1}, Lcom/beizi/fusion/b/a$f;-><init>(Lcom/beizi/fusion/b/a;)V

    iput-object v0, p0, Lcom/beizi/fusion/b/d;->g:Lcom/beizi/fusion/b/a$f;

    .line 12
    new-instance v0, Lcom/beizi/fusion/b/a$c;

    invoke-direct {v0, p1}, Lcom/beizi/fusion/b/a$c;-><init>(Lcom/beizi/fusion/b/a;)V

    iput-object v0, p0, Lcom/beizi/fusion/b/d;->h:Lcom/beizi/fusion/b/a$c;

    .line 13
    new-instance v0, Lcom/beizi/fusion/b/a$b;

    invoke-direct {v0, p1}, Lcom/beizi/fusion/b/a$b;-><init>(Lcom/beizi/fusion/b/a;)V

    iput-object v0, p0, Lcom/beizi/fusion/b/d;->i:Lcom/beizi/fusion/b/a$b;

    .line 14
    new-instance v0, Lcom/beizi/fusion/b/a$j;

    invoke-direct {v0, p1}, Lcom/beizi/fusion/b/a$j;-><init>(Lcom/beizi/fusion/b/a;)V

    iput-object v0, p0, Lcom/beizi/fusion/b/d;->j:Lcom/beizi/fusion/b/a$j;

    .line 15
    new-instance v0, Lcom/beizi/fusion/b/a$a;

    invoke-direct {v0, p1}, Lcom/beizi/fusion/b/a$a;-><init>(Lcom/beizi/fusion/b/a;)V

    iput-object v0, p0, Lcom/beizi/fusion/b/d;->k:Lcom/beizi/fusion/b/a$a;

    return-void
.end method


# virtual methods
.method public a()Lcom/beizi/fusion/b/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/b/d;->l:Lcom/beizi/fusion/b/a;

    return-object v0
.end method

.method public a(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/b/d;->n:Z

    return-void
.end method

.method public b()Lcom/beizi/fusion/b/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/b/d;->m:Lcom/beizi/fusion/b/b;

    return-object v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/fusion/b/d;->n:Z

    return v0
.end method

.method public update(Ljava/util/Observable;Ljava/lang/Object;)V
    .locals 7

    .line 1
    instance-of p1, p1, Lcom/beizi/fusion/b/a$l;

    if-eqz p1, :cond_0

    .line 2
    instance-of p1, p2, Lcom/beizi/fusion/b/b;

    if-eqz p1, :cond_0

    .line 3
    check-cast p2, Lcom/beizi/fusion/b/b;

    .line 4
    invoke-virtual {p2}, Lcom/beizi/fusion/b/b;->k()Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-virtual {p2}, Lcom/beizi/fusion/b/b;->d()Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-virtual {p2}, Lcom/beizi/fusion/b/b;->O()I

    move-result v1

    .line 7
    invoke-virtual {p2}, Lcom/beizi/fusion/b/b;->P()Ljava/lang/String;

    move-result-object v2

    .line 8
    invoke-virtual {p2}, Lcom/beizi/fusion/b/b;->Q()Ljava/lang/String;

    move-result-object v3

    .line 9
    invoke-virtual {p2}, Lcom/beizi/fusion/b/b;->c()Ljava/lang/String;

    move-result-object v4

    .line 10
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "channel == "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ",eventCode = "

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ";buyerSpaceId:"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/beizi/fusion/b/b;->s()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ",srcType = "

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ",price = "

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ",bidPrice = "

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ",eventId = "

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ",buyerSpaceId = "

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    invoke-virtual {p2}, Lcom/beizi/fusion/b/b;->m()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "BeiZis"

    .line 12
    invoke-static {v0, p1}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/b;->e()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/b/c;->a(Lcom/beizi/fusion/b/b;)V

    :cond_0
    return-void
.end method
