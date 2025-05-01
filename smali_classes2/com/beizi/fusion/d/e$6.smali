.class Lcom/beizi/fusion/d/e$6;
.super Ljava/lang/Object;
.source "BaseManager.java"

# interfaces
.implements Lcom/beizi/fusion/d/a/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/d/e;->b(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/d/e;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/d/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 29
    iget-object v0, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/d/e;Z)Z

    .line 30
    iget-object v0, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    const/4 v1, 0x0

    const-string v2, "S2S"

    const/4 v3, 0x1

    const/16 v4, 0x27b0

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/model/AdSpacesBean$ComponentBean;Ljava/lang/String;ZI)V

    return-void
.end method

.method public a(Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Ljava/lang/String;D)V
    .locals 10

    .line 2
    iget-object p3, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    invoke-static {p3}, Lcom/beizi/fusion/d/e;->h(Lcom/beizi/fusion/d/e;)I

    move-result p3

    iget-object v0, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v0}, Lcom/beizi/fusion/d/e;->i(Lcom/beizi/fusion/d/e;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne p3, v0, :cond_1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    iget-object p3, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    iget-object v0, p3, Lcom/beizi/fusion/d/e;->i:Lcom/beizi/fusion/work/a;

    invoke-static {p3, v0}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/d/e;Lcom/beizi/fusion/work/a;)D

    move-result-wide v4

    cmpg-double p3, v4, p4

    if-gez p3, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;->getBuyerId()Ljava/lang/String;

    move-result-object p3

    .line 4
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;->getBuyerSpaceUuId()Ljava/lang/String;

    move-result-object p4

    .line 5
    iget-object p5, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    invoke-static {p5}, Lcom/beizi/fusion/d/e;->e(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/a;

    move-result-object p5

    invoke-virtual {p5, p2, p1}, Lcom/beizi/fusion/b/a;->a(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;)V

    .line 6
    iget-object p5, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    invoke-static {p5}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object p5

    iget-object p5, p5, Lcom/beizi/fusion/b/d;->e:Lcom/beizi/fusion/b/a$d;

    invoke-virtual {p5, p4, v3}, Lcom/beizi/fusion/b/a$l;->a(Ljava/lang/String;I)V

    .line 7
    iget-object p5, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    invoke-static {p5, p1, p2, p4}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/d/e;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Ljava/lang/String;)Z

    move-result p5

    if-nez p5, :cond_0

    .line 8
    iget-object p1, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    invoke-static {p1, v2}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/d/e;Z)Z

    .line 9
    iget-object p1, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    invoke-virtual {p2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getBidType()Ljava/lang/String;

    move-result-object p2

    const/16 p3, 0x2792

    invoke-virtual {p1, v1, p2, v3, p3}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/model/AdSpacesBean$ComponentBean;Ljava/lang/String;ZI)V

    return-void

    .line 10
    :cond_0
    iget-object p5, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    invoke-virtual {p2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getRenderView()Ljava/util/List;

    move-result-object v8

    const/4 v9, 0x0

    move-object v4, p5

    move-object v5, p1

    move-object v6, p3

    move-object v7, p2

    invoke-virtual/range {v4 .. v9}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Ljava/lang/String;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Ljava/util/List;Lcom/beizi/fusion/work/a;)Lcom/beizi/fusion/work/a;

    move-result-object v0

    iput-object v0, p5, Lcom/beizi/fusion/d/e;->p:Lcom/beizi/fusion/work/a;

    .line 11
    iget-object p5, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    iget-object p5, p5, Lcom/beizi/fusion/d/e;->p:Lcom/beizi/fusion/work/a;

    if-eqz p5, :cond_1

    .line 12
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;->getSleepTime()J

    move-result-wide v0

    invoke-virtual {p5, v0, v1}, Lcom/beizi/fusion/work/a;->a(J)V

    .line 13
    iget-object p5, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    iget-object p5, p5, Lcom/beizi/fusion/d/e;->p:Lcom/beizi/fusion/work/a;

    invoke-virtual {p5, p1}, Lcom/beizi/fusion/work/a;->a(Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;)V

    .line 14
    iget-object p1, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    iget-object p1, p1, Lcom/beizi/fusion/d/e;->p:Lcom/beizi/fusion/work/a;

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/work/a;->a(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;)V

    .line 15
    iget-object p1, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    iget-object p1, p1, Lcom/beizi/fusion/d/e;->p:Lcom/beizi/fusion/work/a;

    invoke-virtual {p2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getBidType()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/work/a;->a(Ljava/lang/String;)V

    .line 16
    iget-object p1, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    iget-object p2, p1, Lcom/beizi/fusion/d/e;->p:Lcom/beizi/fusion/work/a;

    invoke-static {p1, p3, p4, p2}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/d/e;Ljava/lang/String;Ljava/lang/String;Lcom/beizi/fusion/work/a;)V

    .line 17
    iget-object p1, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    iget-object p1, p1, Lcom/beizi/fusion/d/e;->p:Lcom/beizi/fusion/work/a;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/a;->d()V

    .line 18
    iget-object p1, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    iget-object p1, p1, Lcom/beizi/fusion/d/e;->p:Lcom/beizi/fusion/work/a;

    invoke-virtual {p1, v3}, Lcom/beizi/fusion/work/a;->a(Z)V

    return-void

    .line 19
    :cond_1
    iget-object p1, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    invoke-static {p1, v2}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/d/e;Z)Z

    .line 20
    iget-object p1, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    invoke-virtual {p2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getBidType()Ljava/lang/String;

    move-result-object p2

    const/16 p3, 0x27b0

    invoke-virtual {p1, v1, p2, v3, p3}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/model/AdSpacesBean$ComponentBean;Ljava/lang/String;ZI)V

    return-void
.end method

.method public a(Ljava/lang/String;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v0}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v0

    iget-object v0, v0, Lcom/beizi/fusion/b/d;->g:Lcom/beizi/fusion/b/a$f;

    invoke-virtual {v0, p1, p2}, Lcom/beizi/fusion/b/a$l;->a(Ljava/lang/String;I)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 5

    .line 21
    iget-object v0, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/d/e;Z)Z

    .line 22
    iget-object v0, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    const/4 v1, 0x0

    const-string v2, "S2S"

    const/4 v3, 0x1

    const/16 v4, 0x27b0

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/model/AdSpacesBean$ComponentBean;Ljava/lang/String;ZI)V

    .line 23
    iget-object v0, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    iget-object v0, v0, Lcom/beizi/fusion/d/e;->c:Lcom/beizi/fusion/b/b;

    if-eqz v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 24
    iget-object v0, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    iget-object v0, v0, Lcom/beizi/fusion/d/e;->c:Lcom/beizi/fusion/b/b;

    invoke-virtual {v0, p2}, Lcom/beizi/fusion/b/b;->i(Ljava/lang/String;)V

    .line 25
    iget-object p2, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    iget-object p2, p2, Lcom/beizi/fusion/d/e;->c:Lcom/beizi/fusion/b/b;

    invoke-virtual {p2, p1}, Lcom/beizi/fusion/b/b;->m(Ljava/lang/String;)V

    .line 26
    iget-object p1, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    invoke-static {p1}, Lcom/beizi/fusion/d/e;->e(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/a;

    move-result-object p1

    iget-object p2, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    iget-object p2, p2, Lcom/beizi/fusion/d/e;->c:Lcom/beizi/fusion/b/b;

    invoke-virtual {p1, p3, p2}, Lcom/beizi/fusion/b/a;->a(Ljava/lang/String;Lcom/beizi/fusion/b/b;)V

    .line 27
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    invoke-static {p1}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    invoke-static {p1}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object p1

    iget-object p1, p1, Lcom/beizi/fusion/b/d;->g:Lcom/beizi/fusion/b/a$f;

    if-eqz p1, :cond_1

    .line 28
    iget-object p1, p0, Lcom/beizi/fusion/d/e$6;->a:Lcom/beizi/fusion/d/e;

    invoke-static {p1}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object p1

    iget-object p1, p1, Lcom/beizi/fusion/b/d;->g:Lcom/beizi/fusion/b/a$f;

    invoke-virtual {p1, p3, p4}, Lcom/beizi/fusion/b/a$l;->a(Ljava/lang/String;I)V

    :cond_1
    return-void
.end method
