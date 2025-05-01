.class public Lw3/o;
.super Ljava/lang/Object;
.source "ZipModel.java"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private b:Ljava/util/List;

.field private c:Ljava/util/List;

.field private d:Lw3/b;

.field private e:Lw3/c;

.field private f:Lw3/f;

.field private g:Lw3/l;

.field private h:Lw3/m;

.field private i:Z

.field private j:J

.field private k:Ljava/lang/String;

.field private l:Z

.field private m:Z

.field private n:J

.field private o:J

.field private p:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lw3/o;->j:J

    return-void
.end method


# virtual methods
.method public A(Lw3/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw3/o;->g:Lw3/l;

    return-void
.end method

.method public B(Lw3/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw3/o;->h:Lw3/m;

    return-void
.end method

.method public C(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lw3/o;->l:Z

    return-void
.end method

.method public D(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw3/o;->k:Ljava/lang/String;

    return-void
.end method

.method public a()Lw3/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lw3/o;->d:Lw3/b;

    return-object v0
.end method

.method public b()Lw3/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lw3/o;->e:Lw3/c;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lw3/o;->c:Ljava/util/List;

    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public d()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lw3/o;->o:J

    return-wide v0
.end method

.method public e()Lw3/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lw3/o;->f:Lw3/f;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lw3/o;->p:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lw3/o;->b:Ljava/util/List;

    return-object v0
.end method

.method public h()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lw3/o;->j:J

    return-wide v0
.end method

.method public i()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lw3/o;->n:J

    return-wide v0
.end method

.method public j()Lw3/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lw3/o;->g:Lw3/l;

    return-object v0
.end method

.method public k()Lw3/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lw3/o;->h:Lw3/m;

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lw3/o;->k:Ljava/lang/String;

    return-object v0
.end method

.method public m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lw3/o;->m:Z

    return v0
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lw3/o;->i:Z

    return v0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lw3/o;->l:Z

    return v0
.end method

.method public p(Lw3/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw3/o;->d:Lw3/b;

    return-void
.end method

.method public q(Lw3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw3/o;->e:Lw3/c;

    return-void
.end method

.method public r(Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw3/o;->c:Ljava/util/List;

    return-void
.end method

.method public s(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lw3/o;->o:J

    return-void
.end method

.method public t(Lw3/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw3/o;->f:Lw3/f;

    return-void
.end method

.method public u(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw3/o;->p:Ljava/lang/String;

    return-void
.end method

.method public v(Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw3/o;->b:Ljava/util/List;

    return-void
.end method

.method public w(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lw3/o;->m:Z

    return-void
.end method

.method public x(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lw3/o;->i:Z

    return-void
.end method

.method public y(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lw3/o;->j:J

    return-void
.end method

.method public z(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lw3/o;->n:J

    return-void
.end method
