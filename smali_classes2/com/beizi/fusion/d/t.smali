.class public Lcom/beizi/fusion/d/t;
.super Lcom/beizi/fusion/d/e;
.source "SplashManager.java"


# instance fields
.field private r:I

.field private s:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Lcom/beizi/fusion/a;J)V
    .locals 6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p4

    move-wide v4, p5

    .line 1
    invoke-direct/range {v0 .. v5}, Lcom/beizi/fusion/d/e;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/a;J)V

    .line 2
    iput-object p3, p0, Lcom/beizi/fusion/d/e;->g:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public A()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/beizi/fusion/d/e;->o:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/d/e;->i:Lcom/beizi/fusion/work/a;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lcom/beizi/fusion/d/e;->n:Z

    if-nez v1, :cond_1

    .line 3
    invoke-virtual {v0}, Lcom/beizi/fusion/work/a;->aF()V

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/d/e;->i:Lcom/beizi/fusion/work/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/a;->f()V

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/beizi/fusion/d/e;->n:Z

    :cond_1
    return-void
.end method

.method public B()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/d/e;->i:Lcom/beizi/fusion/work/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/fusion/work/a;->j()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public C()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/beizi/fusion/g/h;->b()Lcom/beizi/fusion/g/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/g/h;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/beizi/fusion/d/t$1;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/d/t$1;-><init>(Lcom/beizi/fusion/d/t;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Ljava/lang/String;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Ljava/util/List;Lcom/beizi/fusion/work/a;)Lcom/beizi/fusion/work/a;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;",
            "Ljava/lang/String;",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;",
            ">;",
            "Lcom/beizi/fusion/work/a;",
            ")",
            "Lcom/beizi/fusion/work/a;"
        }
    .end annotation

    move-object v13, p0

    move-object/from16 v11, p2

    .line 4
    invoke-static {}, Lcom/beizi/fusion/g/au;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "BEIZI"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object/from16 v12, p5

    goto :goto_1

    .line 5
    :cond_1
    :goto_0
    new-instance v12, Lcom/beizi/fusion/work/splash/b;

    iget-object v1, v13, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v13, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v13, Lcom/beizi/fusion/d/e;->f:J

    iget-object v5, v13, Lcom/beizi/fusion/d/e;->g:Landroid/view/View;

    iget-object v6, v13, Lcom/beizi/fusion/d/e;->d:Landroid/view/ViewGroup;

    move-object v0, v12

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p4

    move-object v10, p0

    invoke-direct/range {v0 .. v10}, Lcom/beizi/fusion/work/splash/b;-><init>(Landroid/content/Context;Ljava/lang/String;JLandroid/view/View;Landroid/view/ViewGroup;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Ljava/util/List;Lcom/beizi/fusion/d/e;)V

    .line 6
    :goto_1
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    const/4 v0, -0x1

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v1, "HUAWEI"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_2

    :cond_2
    const/16 v0, 0x9

    goto/16 :goto_2

    :sswitch_1
    const-string v1, "KUAISHOU"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto/16 :goto_2

    :cond_3
    const/16 v0, 0x8

    goto/16 :goto_2

    :sswitch_2
    const-string v1, "CSJ_NST"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x7

    goto :goto_2

    :sswitch_3
    const-string v1, "BAIDU"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    const/4 v0, 0x6

    goto :goto_2

    :sswitch_4
    const-string v1, "MTG"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    const/4 v0, 0x5

    goto :goto_2

    :sswitch_5
    const-string v1, "GDT"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_2

    :cond_7
    const/4 v0, 0x4

    goto :goto_2

    :sswitch_6
    const-string v1, "CSJ"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_2

    :cond_8
    const/4 v0, 0x3

    goto :goto_2

    :sswitch_7
    const-string v1, "GM"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_2

    :cond_9
    const/4 v0, 0x2

    goto :goto_2

    :sswitch_8
    const-string v1, "JADYUN"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_2

    :cond_a
    const/4 v0, 0x1

    goto :goto_2

    :sswitch_9
    const-string v1, "INMOBI"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_2

    :cond_b
    const/4 v0, 0x0

    :goto_2
    packed-switch v0, :pswitch_data_0

    goto/16 :goto_4

    .line 7
    :pswitch_0
    new-instance v12, Lcom/beizi/fusion/work/splash/h;

    iget-object v1, v13, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v13, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v13, Lcom/beizi/fusion/d/e;->f:J

    iget-object v5, v13, Lcom/beizi/fusion/d/e;->d:Landroid/view/ViewGroup;

    move-object v0, v12

    move-object/from16 v6, p3

    move-object/from16 v7, p1

    move-object v8, p0

    invoke-direct/range {v0 .. v8}, Lcom/beizi/fusion/work/splash/h;-><init>(Landroid/content/Context;Ljava/lang/String;JLandroid/view/ViewGroup;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;)V

    goto/16 :goto_4

    .line 8
    :pswitch_1
    new-instance v12, Lcom/beizi/fusion/work/splash/k;

    iget-object v1, v13, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v13, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v13, Lcom/beizi/fusion/d/e;->f:J

    iget-object v5, v13, Lcom/beizi/fusion/d/e;->d:Landroid/view/ViewGroup;

    move-object v0, v12

    move-object/from16 v6, p3

    move-object/from16 v7, p1

    move-object/from16 v8, p4

    move-object v9, p0

    invoke-direct/range {v0 .. v9}, Lcom/beizi/fusion/work/splash/k;-><init>(Landroid/content/Context;Ljava/lang/String;JLandroid/view/ViewGroup;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Ljava/util/List;Lcom/beizi/fusion/d/e;)V

    goto/16 :goto_4

    .line 9
    :pswitch_2
    new-instance v12, Lcom/beizi/fusion/work/splash/d;

    iget-object v1, v13, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v13, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v13, Lcom/beizi/fusion/d/e;->f:J

    iget-object v5, v13, Lcom/beizi/fusion/d/e;->g:Landroid/view/View;

    iget-object v6, v13, Lcom/beizi/fusion/d/e;->d:Landroid/view/ViewGroup;

    move-object v0, v12

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p4

    move-object v10, p0

    invoke-direct/range {v0 .. v10}, Lcom/beizi/fusion/work/splash/d;-><init>(Landroid/content/Context;Ljava/lang/String;JLandroid/view/View;Landroid/view/ViewGroup;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Ljava/util/List;Lcom/beizi/fusion/d/e;)V

    goto/16 :goto_4

    .line 10
    :pswitch_3
    new-instance v12, Lcom/beizi/fusion/work/splash/a;

    iget-object v1, v13, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v13, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v13, Lcom/beizi/fusion/d/e;->f:J

    iget-object v5, v13, Lcom/beizi/fusion/d/e;->g:Landroid/view/View;

    iget-object v6, v13, Lcom/beizi/fusion/d/e;->d:Landroid/view/ViewGroup;

    move-object v0, v12

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p4

    move-object v10, p0

    invoke-direct/range {v0 .. v10}, Lcom/beizi/fusion/work/splash/a;-><init>(Landroid/content/Context;Ljava/lang/String;JLandroid/view/View;Landroid/view/ViewGroup;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Ljava/util/List;Lcom/beizi/fusion/d/e;)V

    goto/16 :goto_4

    .line 11
    :pswitch_4
    new-instance v12, Lcom/beizi/fusion/work/splash/l;

    iget-object v1, v13, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v13, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v13, Lcom/beizi/fusion/d/e;->f:J

    iget-object v5, v13, Lcom/beizi/fusion/d/e;->d:Landroid/view/ViewGroup;

    move-object v0, v12

    move-object/from16 v6, p3

    move-object/from16 v7, p1

    move-object v8, p0

    invoke-direct/range {v0 .. v8}, Lcom/beizi/fusion/work/splash/l;-><init>(Landroid/content/Context;Ljava/lang/String;JLandroid/view/ViewGroup;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;)V

    goto/16 :goto_4

    .line 12
    :pswitch_5
    new-instance v12, Lcom/beizi/fusion/work/splash/f;

    iget-object v1, v13, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v13, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v13, Lcom/beizi/fusion/d/e;->f:J

    iget-object v5, v13, Lcom/beizi/fusion/d/e;->g:Landroid/view/View;

    iget-object v6, v13, Lcom/beizi/fusion/d/e;->d:Landroid/view/ViewGroup;

    move-object v0, v12

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p4

    move-object v10, p0

    invoke-direct/range {v0 .. v10}, Lcom/beizi/fusion/work/splash/f;-><init>(Landroid/content/Context;Ljava/lang/String;JLandroid/view/View;Landroid/view/ViewGroup;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Ljava/util/List;Lcom/beizi/fusion/d/e;)V

    goto/16 :goto_4

    .line 13
    :pswitch_6
    new-instance v14, Lcom/beizi/fusion/work/splash/e;

    iget-object v1, v13, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v13, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v13, Lcom/beizi/fusion/d/e;->f:J

    iget-object v5, v13, Lcom/beizi/fusion/d/e;->g:Landroid/view/View;

    iget-object v6, v13, Lcom/beizi/fusion/d/e;->d:Landroid/view/ViewGroup;

    .line 14
    invoke-virtual {p0}, Lcom/beizi/fusion/d/t;->b()I

    move-result v10

    invoke-virtual {p0}, Lcom/beizi/fusion/d/t;->c()I

    move-result v11

    move-object v0, v14

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p4

    move-object v12, p0

    invoke-direct/range {v0 .. v12}, Lcom/beizi/fusion/work/splash/e;-><init>(Landroid/content/Context;Ljava/lang/String;JLandroid/view/View;Landroid/view/ViewGroup;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Ljava/util/List;IILcom/beizi/fusion/d/e;)V

    :goto_3
    move-object v12, v14

    goto :goto_4

    .line 15
    :pswitch_7
    new-instance v14, Lcom/beizi/fusion/work/splash/g;

    iget-object v1, v13, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v13, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v13, Lcom/beizi/fusion/d/e;->f:J

    iget-object v5, v13, Lcom/beizi/fusion/d/e;->g:Landroid/view/View;

    iget-object v6, v13, Lcom/beizi/fusion/d/e;->d:Landroid/view/ViewGroup;

    invoke-virtual {p0}, Lcom/beizi/fusion/d/t;->b()I

    move-result v10

    invoke-virtual {p0}, Lcom/beizi/fusion/d/t;->c()I

    move-result v11

    move-object v0, v14

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p4

    move-object v12, p0

    invoke-direct/range {v0 .. v12}, Lcom/beizi/fusion/work/splash/g;-><init>(Landroid/content/Context;Ljava/lang/String;JLandroid/view/View;Landroid/view/ViewGroup;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Ljava/util/List;IILcom/beizi/fusion/d/e;)V

    goto :goto_3

    .line 16
    :pswitch_8
    new-instance v14, Lcom/beizi/fusion/work/splash/j;

    iget-object v1, v13, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v13, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v13, Lcom/beizi/fusion/d/e;->f:J

    iget-object v5, v13, Lcom/beizi/fusion/d/e;->g:Landroid/view/View;

    iget-object v6, v13, Lcom/beizi/fusion/d/e;->d:Landroid/view/ViewGroup;

    invoke-virtual {p0}, Lcom/beizi/fusion/d/t;->b()I

    move-result v10

    invoke-virtual {p0}, Lcom/beizi/fusion/d/t;->c()I

    move-result v11

    move-object v0, v14

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p4

    move-object v12, p0

    invoke-direct/range {v0 .. v12}, Lcom/beizi/fusion/work/splash/j;-><init>(Landroid/content/Context;Ljava/lang/String;JLandroid/view/View;Landroid/view/ViewGroup;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Ljava/util/List;IILcom/beizi/fusion/d/e;)V

    goto :goto_3

    .line 17
    :pswitch_9
    new-instance v12, Lcom/beizi/fusion/work/splash/i;

    iget-object v1, v13, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v13, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v13, Lcom/beizi/fusion/d/e;->f:J

    iget-object v5, v13, Lcom/beizi/fusion/d/e;->g:Landroid/view/View;

    iget-object v6, v13, Lcom/beizi/fusion/d/e;->d:Landroid/view/ViewGroup;

    move-object v0, v12

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p4

    move-object v10, p0

    invoke-direct/range {v0 .. v10}, Lcom/beizi/fusion/work/splash/i;-><init>(Landroid/content/Context;Ljava/lang/String;JLandroid/view/View;Landroid/view/ViewGroup;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Ljava/util/List;Lcom/beizi/fusion/d/e;)V

    :goto_4
    return-object v12

    :sswitch_data_0
    .sparse-switch
        -0x7efedff2 -> :sswitch_9
        -0x7e05285b -> :sswitch_8
        0x8e6 -> :sswitch_7
        0x105da -> :sswitch_6
        0x11317 -> :sswitch_5
        0x12b80 -> :sswitch_4
        0x3c0b5fb -> :sswitch_3
        0x6a22e74a -> :sswitch_2
        0x7280590d -> :sswitch_1
        0x7fa995e7 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected a()V
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/fusion/d/e;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/model/AppEventId;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/AppEventId;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/d/e;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/model/AppEventId;->setAppSplashRequest(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/d/e;->c:Lcom/beizi/fusion/b/b;

    if-eqz v0, :cond_0

    const-string v1, "2"

    .line 3
    invoke-virtual {v0, v1}, Lcom/beizi/fusion/b/b;->d(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/d/t;->r:I

    return v0
.end method

.method public b(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/beizi/fusion/d/t;->r:I

    return-void
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/d/t;->s:I

    return v0
.end method

.method public c(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/beizi/fusion/d/t;->s:I

    return-void
.end method
