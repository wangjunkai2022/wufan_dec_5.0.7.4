.class Lcom/beizi/fusion/d/e$3;
.super Landroid/os/Handler;
.source "BaseManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/d/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/d/e;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/d/e;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget v1, v1, Landroid/os/Message;->what:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v1, v2, :cond_11

    const/4 v4, 0x4

    if-eq v1, v3, :cond_8

    const/4 v6, 0x3

    if-eq v1, v6, :cond_0

    goto/16 :goto_2

    .line 2
    :cond_0
    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/fusion/d/b;->f()Lcom/beizi/fusion/b/d;

    move-result-object v1

    .line 3
    iget-object v7, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    new-instance v8, Lcom/beizi/fusion/b/d;

    new-instance v15, Lcom/beizi/fusion/b/b;

    sget-object v10, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v9

    invoke-virtual {v9}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v14

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v17

    const-string v11, ""

    const-string v12, ""

    const-string v13, ""

    const-string v16, ""

    const-string v18, ""

    const-string v19, ""

    move-object v9, v15

    move-object v5, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v18

    move-object/from16 v18, v19

    invoke-direct/range {v9 .. v18}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v8, v5}, Lcom/beizi/fusion/b/d;-><init>(Lcom/beizi/fusion/b/b;)V

    .line 5
    invoke-static {v7, v8}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/d/e;Lcom/beizi/fusion/b/d;)Lcom/beizi/fusion/b/d;

    .line 6
    iget-object v5, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v5}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v7

    invoke-virtual {v7}, Lcom/beizi/fusion/b/d;->a()Lcom/beizi/fusion/b/a;

    move-result-object v7

    invoke-static {v5, v7}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/d/e;Lcom/beizi/fusion/b/a;)Lcom/beizi/fusion/b/a;

    .line 7
    iget-object v5, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v5}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v7

    invoke-virtual {v7}, Lcom/beizi/fusion/b/d;->b()Lcom/beizi/fusion/b/b;

    move-result-object v7

    iput-object v7, v5, Lcom/beizi/fusion/d/e;->c:Lcom/beizi/fusion/b/b;

    .line 8
    iget-object v5, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v5}, Lcom/beizi/fusion/d/e;->d(Lcom/beizi/fusion/d/e;)V

    .line 9
    iget-object v5, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v5}, Lcom/beizi/fusion/d/e;->e(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/a;

    move-result-object v5

    iget-object v7, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    iget-object v7, v7, Lcom/beizi/fusion/d/e;->c:Lcom/beizi/fusion/b/b;

    invoke-virtual {v5, v7}, Lcom/beizi/fusion/b/a;->a(Lcom/beizi/fusion/b/b;)V

    .line 10
    iget-object v5, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v5}, Lcom/beizi/fusion/d/e;->f(Lcom/beizi/fusion/d/e;)V

    if-eqz v1, :cond_7

    .line 11
    iget-object v1, v1, Lcom/beizi/fusion/b/d;->a:Lcom/beizi/fusion/b/a$i;

    invoke-virtual {v1}, Lcom/beizi/fusion/b/a$l;->a()I

    move-result v1

    if-ne v1, v3, :cond_7

    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v1}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v1

    iget-object v1, v1, Lcom/beizi/fusion/b/d;->b:Lcom/beizi/fusion/b/a$h;

    invoke-virtual {v1}, Lcom/beizi/fusion/b/a$l;->a()I

    move-result v1

    if-nez v1, :cond_7

    .line 12
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v1}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v1

    iget-object v1, v1, Lcom/beizi/fusion/b/d;->b:Lcom/beizi/fusion/b/a$h;

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/b/a$l;->a(I)V

    .line 13
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v1}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v1

    iget-object v1, v1, Lcom/beizi/fusion/b/d;->b:Lcom/beizi/fusion/b/a$h;

    invoke-virtual {v1}, Lcom/beizi/fusion/b/a$l;->a()I

    move-result v1

    const-string v5, "kGetLocalConfigStatusInternalError"

    const/4 v7, -0x2

    if-ne v1, v2, :cond_6

    .line 14
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v1}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v1

    iget-object v1, v1, Lcom/beizi/fusion/b/d;->b:Lcom/beizi/fusion/b/a$h;

    invoke-virtual {v1, v3}, Lcom/beizi/fusion/b/a$l;->a(I)V

    .line 15
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    iget-object v8, v1, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v9, v1, Lcom/beizi/fusion/d/e;->m:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/beizi/fusion/d/e;->f()Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v9, v10}, Lcom/beizi/fusion/c/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/beizi/fusion/model/AdSpacesBean;

    move-result-object v8

    invoke-static {v1, v8}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/d/e;Lcom/beizi/fusion/model/AdSpacesBean;)Lcom/beizi/fusion/model/AdSpacesBean;

    .line 16
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v1}, Lcom/beizi/fusion/d/e;->g(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/model/AdSpacesBean;

    move-result-object v1

    if-nez v1, :cond_5

    .line 17
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v1}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v1

    iget-object v1, v1, Lcom/beizi/fusion/b/d;->b:Lcom/beizi/fusion/b/a$h;

    invoke-virtual {v1}, Lcom/beizi/fusion/b/a$l;->a()I

    move-result v1

    if-ne v1, v3, :cond_4

    .line 18
    invoke-static {}, Lcom/beizi/fusion/c/a;->a()I

    move-result v1

    if-ne v1, v2, :cond_1

    .line 19
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v1}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v1

    iget-object v1, v1, Lcom/beizi/fusion/b/d;->b:Lcom/beizi/fusion/b/a$h;

    invoke-virtual {v1, v4}, Lcom/beizi/fusion/b/a$l;->a(I)V

    .line 20
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    const/16 v2, 0x2711

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/d/e;->a(I)V

    goto/16 :goto_2

    :cond_1
    if-ne v1, v3, :cond_2

    .line 21
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v1}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v1

    iget-object v1, v1, Lcom/beizi/fusion/b/d;->b:Lcom/beizi/fusion/b/a$h;

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/b/a$l;->a(I)V

    .line 22
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    const/16 v2, 0x2774

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/d/e;->a(I)V

    goto/16 :goto_2

    :cond_2
    if-ne v1, v6, :cond_3

    .line 23
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v1}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v1

    iget-object v1, v1, Lcom/beizi/fusion/b/d;->b:Lcom/beizi/fusion/b/a$h;

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/b/a$l;->a(I)V

    .line 24
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    const/16 v2, 0x277e

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/d/e;->a(I)V

    goto/16 :goto_2

    .line 25
    :cond_3
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    const/16 v2, 0x270f

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/d/e;->a(I)V

    goto/16 :goto_2

    .line 26
    :cond_4
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v1}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v1

    iget-object v1, v1, Lcom/beizi/fusion/b/d;->b:Lcom/beizi/fusion/b/a$h;

    invoke-virtual {v1, v7}, Lcom/beizi/fusion/b/a$l;->a(I)V

    .line 27
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-virtual {v1, v5}, Lcom/beizi/fusion/d/e;->a(Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_5
    const/16 v2, 0x270f

    .line 28
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/d/e;->a(I)V

    goto/16 :goto_2

    .line 29
    :cond_6
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v1}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v1

    iget-object v1, v1, Lcom/beizi/fusion/b/d;->b:Lcom/beizi/fusion/b/a$h;

    invoke-virtual {v1, v7}, Lcom/beizi/fusion/b/a$l;->a(I)V

    .line 30
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-virtual {v1, v5}, Lcom/beizi/fusion/d/e;->a(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 31
    :cond_7
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    const/16 v2, 0x2710

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/d/e;->a(I)V

    goto/16 :goto_2

    .line 32
    :cond_8
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v1}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v1

    if-nez v1, :cond_9

    return-void

    .line 33
    :cond_9
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    iget-object v5, v1, Lcom/beizi/fusion/d/e;->i:Lcom/beizi/fusion/work/a;

    const/4 v6, -0x1

    const-string v7, ",mManagerObserver.mChannelResultStatus.getStatus(channel) = "

    const-string v8, "AdRequest timeout channel = "

    const-string v9, "BeiZis"

    if-eqz v5, :cond_e

    .line 34
    invoke-virtual {v5}, Lcom/beizi/fusion/work/a;->q()V

    .line 35
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    iget-object v4, v1, Lcom/beizi/fusion/d/e;->i:Lcom/beizi/fusion/work/a;

    invoke-virtual {v4}, Lcom/beizi/fusion/work/a;->g()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    iget-object v5, v5, Lcom/beizi/fusion/d/e;->i:Lcom/beizi/fusion/work/a;

    invoke-virtual {v5}, Lcom/beizi/fusion/work/a;->o()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lcom/beizi/fusion/d/e;->a(Ljava/lang/String;Landroid/view/View;)V

    .line 36
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-virtual {v1}, Lcom/beizi/fusion/d/e;->f()Ljava/lang/String;

    move-result-object v1

    const-string v4, "4"

    .line 37
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 38
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    iget-boolean v4, v1, Lcom/beizi/fusion/d/e;->n:Z

    if-nez v4, :cond_a

    .line 39
    iget-object v1, v1, Lcom/beizi/fusion/d/e;->i:Lcom/beizi/fusion/work/a;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/a;->f()V

    .line 40
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    iput-boolean v2, v1, Lcom/beizi/fusion/d/e;->n:Z

    .line 41
    :cond_a
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-virtual {v1}, Lcom/beizi/fusion/d/e;->q()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_12

    .line 42
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_b
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/beizi/fusion/work/a;

    .line 43
    invoke-virtual {v2}, Lcom/beizi/fusion/work/a;->k()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    move-result-object v4

    .line 44
    iget-object v5, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    iget-object v5, v5, Lcom/beizi/fusion/d/e;->i:Lcom/beizi/fusion/work/a;

    invoke-virtual {v5}, Lcom/beizi/fusion/work/a;->k()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    move-result-object v5

    if-eqz v4, :cond_b

    if-nez v5, :cond_c

    goto :goto_0

    .line 45
    :cond_c
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getBuyerSpaceUuId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    invoke-virtual {v5}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getBuyerSpaceUuId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getBuyerSpaceUuId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getBuyerSpaceUuId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    goto :goto_0

    .line 46
    :cond_d
    iget-object v5, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v5, v2, v3}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/d/e;Lcom/beizi/fusion/work/a;I)V

    .line 47
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    .line 48
    invoke-static {v10}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v10

    iget-object v10, v10, Lcom/beizi/fusion/b/d;->g:Lcom/beizi/fusion/b/a$f;

    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getBuyerSpaceUuId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/beizi/fusion/b/a$l;->a(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 49
    invoke-static {v9, v5}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    invoke-virtual {v2}, Lcom/beizi/fusion/work/a;->i()Lcom/beizi/fusion/f/a;

    move-result-object v2

    sget-object v5, Lcom/beizi/fusion/f/a;->a:Lcom/beizi/fusion/f/a;

    if-ne v2, v5, :cond_b

    .line 51
    iget-object v2, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v2}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v2

    iget-object v2, v2, Lcom/beizi/fusion/b/d;->g:Lcom/beizi/fusion/b/a$f;

    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getBuyerSpaceUuId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v6}, Lcom/beizi/fusion/b/a$l;->a(Ljava/lang/String;I)V

    goto/16 :goto_0

    :cond_e
    const/16 v2, 0x270f

    .line 52
    invoke-virtual {v1, v2}, Lcom/beizi/fusion/d/e;->a(I)V

    .line 53
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-virtual {v1}, Lcom/beizi/fusion/d/e;->q()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_12

    .line 54
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_f
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/beizi/fusion/work/a;

    .line 55
    invoke-virtual {v2}, Lcom/beizi/fusion/work/a;->k()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    move-result-object v5

    if-nez v5, :cond_10

    goto :goto_1

    .line 56
    :cond_10
    iget-object v10, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v10, v2, v3}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/d/e;Lcom/beizi/fusion/work/a;I)V

    .line 57
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    .line 58
    invoke-static {v10}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v10

    iget-object v10, v10, Lcom/beizi/fusion/b/d;->g:Lcom/beizi/fusion/b/a$f;

    invoke-virtual {v5}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getBuyerSpaceUuId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/beizi/fusion/b/a$l;->a(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 59
    invoke-static {v9, v2}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    iget-object v2, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v2}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v2

    iget-object v2, v2, Lcom/beizi/fusion/b/d;->g:Lcom/beizi/fusion/b/a$f;

    invoke-virtual {v5}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getBuyerSpaceUuId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Lcom/beizi/fusion/b/a$l;->a(Ljava/lang/String;)I

    move-result v2

    if-ge v2, v4, :cond_f

    .line 61
    iget-object v2, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v2}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v2

    iget-object v2, v2, Lcom/beizi/fusion/b/d;->g:Lcom/beizi/fusion/b/a$f;

    invoke-virtual {v5}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getBuyerSpaceUuId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5, v6}, Lcom/beizi/fusion/b/a$l;->a(Ljava/lang/String;I)V

    goto :goto_1

    .line 62
    :cond_11
    iget-object v1, v0, Lcom/beizi/fusion/d/e$3;->a:Lcom/beizi/fusion/d/e;

    iget-object v2, v1, Lcom/beizi/fusion/d/e;->i:Lcom/beizi/fusion/work/a;

    if-eqz v2, :cond_12

    .line 63
    invoke-static {v1, v3}, Lcom/beizi/fusion/d/e;->b(Lcom/beizi/fusion/d/e;I)V

    :cond_12
    :goto_2
    return-void
.end method
