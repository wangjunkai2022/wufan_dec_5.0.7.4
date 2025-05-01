.class Lcom/umeng/analytics/pro/cf$a;
.super Lcom/umeng/analytics/pro/de;
.source "TUnion.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/analytics/pro/cf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/umeng/analytics/pro/de<",
        "Lcom/umeng/analytics/pro/cf;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/umeng/analytics/pro/de;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/umeng/analytics/pro/cf$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/umeng/analytics/pro/cf$a;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/umeng/analytics/pro/cu;Lcom/umeng/analytics/pro/bv;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    .line 1
    check-cast p2, Lcom/umeng/analytics/pro/cf;

    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/cf$a;->b(Lcom/umeng/analytics/pro/cu;Lcom/umeng/analytics/pro/cf;)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/cu;Lcom/umeng/analytics/pro/cf;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    iput-object v0, p2, Lcom/umeng/analytics/pro/cf;->b:Lcom/umeng/analytics/pro/cc;

    .line 3
    iput-object v0, p2, Lcom/umeng/analytics/pro/cf;->a:Ljava/lang/Object;

    .line 4
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->j()Lcom/umeng/analytics/pro/cz;

    .line 5
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->l()Lcom/umeng/analytics/pro/cp;

    move-result-object v0

    .line 6
    invoke-virtual {p2, p1, v0}, Lcom/umeng/analytics/pro/cf;->a(Lcom/umeng/analytics/pro/cu;Lcom/umeng/analytics/pro/cp;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p2, Lcom/umeng/analytics/pro/cf;->a:Ljava/lang/Object;

    if-eqz v1, :cond_0

    .line 7
    iget-short v0, v0, Lcom/umeng/analytics/pro/cp;->c:S

    invoke-virtual {p2, v0}, Lcom/umeng/analytics/pro/cf;->a(S)Lcom/umeng/analytics/pro/cc;

    move-result-object v0

    iput-object v0, p2, Lcom/umeng/analytics/pro/cf;->b:Lcom/umeng/analytics/pro/cc;

    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->m()V

    .line 9
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->l()Lcom/umeng/analytics/pro/cp;

    .line 10
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->k()V

    return-void
.end method

.method public synthetic b(Lcom/umeng/analytics/pro/cu;Lcom/umeng/analytics/pro/bv;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    .line 1
    check-cast p2, Lcom/umeng/analytics/pro/cf;

    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/cf$a;->a(Lcom/umeng/analytics/pro/cu;Lcom/umeng/analytics/pro/cf;)V

    return-void
.end method

.method public b(Lcom/umeng/analytics/pro/cu;Lcom/umeng/analytics/pro/cf;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    .line 2
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cf;->a()Lcom/umeng/analytics/pro/cc;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cf;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cf;->d()Lcom/umeng/analytics/pro/cz;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Lcom/umeng/analytics/pro/cz;)V

    .line 4
    iget-object v0, p2, Lcom/umeng/analytics/pro/cf;->b:Lcom/umeng/analytics/pro/cc;

    invoke-virtual {p2, v0}, Lcom/umeng/analytics/pro/cf;->c(Lcom/umeng/analytics/pro/cc;)Lcom/umeng/analytics/pro/cp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Lcom/umeng/analytics/pro/cp;)V

    .line 5
    invoke-virtual {p2, p1}, Lcom/umeng/analytics/pro/cf;->a(Lcom/umeng/analytics/pro/cu;)V

    .line 6
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->c()V

    .line 7
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->d()V

    .line 8
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->b()V

    return-void

    .line 9
    :cond_0
    new-instance p1, Lcom/umeng/analytics/pro/cv;

    const-string p2, "Cannot write a TUnion with no set value!"

    invoke-direct {p1, p2}, Lcom/umeng/analytics/pro/cv;-><init>(Ljava/lang/String;)V

    throw p1
.end method
