.class public final Lcom/beizi/ad/c/a$b$a;
.super Ljava/lang/Object;
.source "AdRequest.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/c/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lcom/beizi/ad/c/e$i;

.field private c:Lcom/beizi/ad/c/e$g;

.field private d:J

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:J

.field private i:J

.field private j:Lcom/beizi/ad/c/d$a;

.field private k:Lcom/beizi/ad/c/d$c;

.field private l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/beizi/ad/c/a$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/beizi/ad/c/a$b$a;->l:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a(J)Lcom/beizi/ad/c/a$b$a;
    .locals 0

    .line 4
    iput-wide p1, p0, Lcom/beizi/ad/c/a$b$a;->d:J

    return-object p0
.end method

.method public a(Lcom/beizi/ad/c/d$a;)Lcom/beizi/ad/c/a$b$a;
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/beizi/ad/c/a$b$a;->j:Lcom/beizi/ad/c/d$a;

    return-object p0
.end method

.method public a(Lcom/beizi/ad/c/d$c;)Lcom/beizi/ad/c/a$b$a;
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/beizi/ad/c/a$b$a;->k:Lcom/beizi/ad/c/d$c;

    return-object p0
.end method

.method public a(Lcom/beizi/ad/c/e$g;)Lcom/beizi/ad/c/a$b$a;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/beizi/ad/c/a$b$a;->c:Lcom/beizi/ad/c/e$g;

    return-object p0
.end method

.method public a(Lcom/beizi/ad/c/e$i;)Lcom/beizi/ad/c/a$b$a;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/c/a$b$a;->b:Lcom/beizi/ad/c/e$i;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/beizi/ad/c/a$b$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/a$b$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public a()Lcom/beizi/ad/c/a$b;
    .locals 3

    .line 7
    new-instance v0, Lcom/beizi/ad/c/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/beizi/ad/c/a$b;-><init>(Lcom/beizi/ad/c/a$1;)V

    .line 8
    iget-object v1, p0, Lcom/beizi/ad/c/a$b$a;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/a$b;->a(Lcom/beizi/ad/c/a$b;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    iget-object v1, p0, Lcom/beizi/ad/c/a$b$a;->j:Lcom/beizi/ad/c/d$a;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/a$b;->a(Lcom/beizi/ad/c/a$b;Lcom/beizi/ad/c/d$a;)Lcom/beizi/ad/c/d$a;

    .line 10
    iget-object v1, p0, Lcom/beizi/ad/c/a$b$a;->c:Lcom/beizi/ad/c/e$g;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/a$b;->a(Lcom/beizi/ad/c/a$b;Lcom/beizi/ad/c/e$g;)Lcom/beizi/ad/c/e$g;

    .line 11
    iget-wide v1, p0, Lcom/beizi/ad/c/a$b$a;->h:J

    invoke-static {v0, v1, v2}, Lcom/beizi/ad/c/a$b;->a(Lcom/beizi/ad/c/a$b;J)J

    .line 12
    iget-object v1, p0, Lcom/beizi/ad/c/a$b$a;->b:Lcom/beizi/ad/c/e$i;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/a$b;->a(Lcom/beizi/ad/c/a$b;Lcom/beizi/ad/c/e$i;)Lcom/beizi/ad/c/e$i;

    .line 13
    iget-wide v1, p0, Lcom/beizi/ad/c/a$b$a;->d:J

    invoke-static {v0, v1, v2}, Lcom/beizi/ad/c/a$b;->b(Lcom/beizi/ad/c/a$b;J)J

    .line 14
    iget-object v1, p0, Lcom/beizi/ad/c/a$b$a;->g:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/a$b;->b(Lcom/beizi/ad/c/a$b;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    iget-wide v1, p0, Lcom/beizi/ad/c/a$b$a;->i:J

    invoke-static {v0, v1, v2}, Lcom/beizi/ad/c/a$b;->c(Lcom/beizi/ad/c/a$b;J)J

    .line 16
    iget-object v1, p0, Lcom/beizi/ad/c/a$b$a;->k:Lcom/beizi/ad/c/d$c;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/a$b;->a(Lcom/beizi/ad/c/a$b;Lcom/beizi/ad/c/d$c;)Lcom/beizi/ad/c/d$c;

    .line 17
    iget-object v1, p0, Lcom/beizi/ad/c/a$b$a;->l:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/a$b;->a(Lcom/beizi/ad/c/a$b;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 18
    iget-object v1, p0, Lcom/beizi/ad/c/a$b$a;->f:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/a$b;->c(Lcom/beizi/ad/c/a$b;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    iget-object v1, p0, Lcom/beizi/ad/c/a$b$a;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/a$b;->d(Lcom/beizi/ad/c/a$b;Ljava/lang/String;)Ljava/lang/String;

    return-object v0
.end method

.method public a(Lcom/beizi/ad/c/a$a;)V
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/beizi/ad/c/a$b$a;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(J)Lcom/beizi/ad/c/a$b$a;
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/beizi/ad/c/a$b$a;->h:J

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/beizi/ad/c/a$b$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/a$b$a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public c(J)Lcom/beizi/ad/c/a$b$a;
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/beizi/ad/c/a$b$a;->i:J

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/beizi/ad/c/a$b$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/a$b$a;->f:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/beizi/ad/c/a$b$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/a$b$a;->g:Ljava/lang/String;

    return-object p0
.end method
