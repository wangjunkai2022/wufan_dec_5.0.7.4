.class Lcom/beizi/fusion/d/a/a$1;
.super Ljava/lang/Object;
.source "BidS2SRequest.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/d/a/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:I

.field final synthetic g:Lcom/beizi/fusion/d/a/a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/d/a/a;Ljava/util/List;Ljava/util/List;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/d/a/a$1;->g:Lcom/beizi/fusion/d/a/a;

    iput-object p2, p0, Lcom/beizi/fusion/d/a/a$1;->a:Ljava/util/List;

    iput-object p3, p0, Lcom/beizi/fusion/d/a/a$1;->b:Ljava/util/List;

    iput-object p4, p0, Lcom/beizi/fusion/d/a/a$1;->c:Landroid/content/Context;

    iput-object p5, p0, Lcom/beizi/fusion/d/a/a$1;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/beizi/fusion/d/a/a$1;->e:Ljava/lang/String;

    iput p7, p0, Lcom/beizi/fusion/d/a/a$1;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 1
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 3
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 4
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/d/a/a$1;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;

    .line 6
    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;->getBuyerId()Ljava/lang/String;

    move-result-object v2

    .line 7
    iget-object v3, p0, Lcom/beizi/fusion/d/a/a$1;->b:Ljava/util/List;

    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;->getBuyerSpaceUuId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v2, v3, v8}, Lcom/beizi/fusion/f/b;->a(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    .line 8
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getBidType()Ljava/lang/String;

    move-result-object v8

    const-string v9, "S2S"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 9
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getId()Ljava/lang/String;

    move-result-object v8

    const-string v9, "GDT"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 10
    iget-object v3, p0, Lcom/beizi/fusion/d/a/a$1;->c:Landroid/content/Context;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getAppId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Lcom/beizi/fusion/d/k;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 11
    iget-object v8, p0, Lcom/beizi/fusion/d/a/a$1;->c:Landroid/content/Context;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getAppId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getSpaceId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v9, v10}, Lcom/beizi/fusion/d/k;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    .line 12
    :cond_1
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getId()Ljava/lang/String;

    move-result-object v8

    const-string v9, "KUAISHOU"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 13
    iget-object v8, p0, Lcom/beizi/fusion/d/a/a$1;->c:Landroid/content/Context;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getAppId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/beizi/fusion/d/n;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object v11, v8

    move-object v8, v3

    move-object v3, v11

    goto :goto_1

    :cond_2
    move-object v8, v3

    .line 14
    :goto_1
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_0

    .line 15
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getBuyerSpaceUuId()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    new-instance v1, Lcom/beizi/fusion/d/a/b$k;

    invoke-direct {v1}, Lcom/beizi/fusion/d/a/b$k;-><init>()V

    .line 19
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/beizi/fusion/f/b;->a(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, ""

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Lcom/beizi/fusion/d/a/b$k;->a(Ljava/lang/String;)V

    .line 20
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Lcom/beizi/fusion/d/a/b$k;->b(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getAppId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Lcom/beizi/fusion/d/a/b$k;->c(Ljava/lang/String;)V

    .line 22
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getSpaceId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/d/a/b$k;->d(Ljava/lang/String;)V

    .line 23
    invoke-virtual {v1, v3}, Lcom/beizi/fusion/d/a/b$k;->e(Ljava/lang/String;)V

    .line 24
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 25
    invoke-virtual {v1, v8}, Lcom/beizi/fusion/d/a/b$k;->f(Ljava/lang/String;)V

    .line 26
    :cond_3
    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 27
    :cond_4
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "BeiZis"

    const-string v1, "S2S\u7ade\u4ef7\u5931\u8d25--token or buyerId is null"

    .line 28
    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    iget-object v0, p0, Lcom/beizi/fusion/d/a/a$1;->g:Lcom/beizi/fusion/d/a/a;

    invoke-static {v0}, Lcom/beizi/fusion/d/a/a;->a(Lcom/beizi/fusion/d/a/a;)Lcom/beizi/fusion/d/a/a$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/fusion/d/a/a$a;->a()V

    return-void

    .line 30
    :cond_5
    iget-object v0, p0, Lcom/beizi/fusion/d/a/a$1;->g:Lcom/beizi/fusion/d/a/a;

    iget-object v1, p0, Lcom/beizi/fusion/d/a/a$1;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/beizi/fusion/d/a/a$1;->d:Ljava/lang/String;

    iget-object v3, p0, Lcom/beizi/fusion/d/a/a$1;->e:Ljava/lang/String;

    iget v8, p0, Lcom/beizi/fusion/d/a/a$1;->f:I

    invoke-static/range {v0 .. v8}, Lcom/beizi/fusion/d/a/a;->a(Lcom/beizi/fusion/d/a/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)V

    return-void
.end method
