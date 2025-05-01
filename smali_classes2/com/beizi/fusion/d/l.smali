.class public Lcom/beizi/fusion/d/l;
.super Lcom/beizi/fusion/d/e;
.source "InterstitialAdManager.java"


# instance fields
.field private r:I

.field private s:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/a;JI)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/beizi/fusion/d/e;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/a;J)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/beizi/fusion/d/l;->s:I

    .line 3
    iput p6, p0, Lcom/beizi/fusion/d/l;->s:I

    return-void
.end method


# virtual methods
.method public A()I
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

.method public B()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/d/e;->m()V

    return-void
.end method

.method public a(Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Ljava/lang/String;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Ljava/util/List;Lcom/beizi/fusion/work/a;)Lcom/beizi/fusion/work/a;
    .locals 16
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

    move-object/from16 v10, p0

    move-object/from16 v11, p2

    .line 3
    invoke-virtual/range {p3 .. p3}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getAdType()Ljava/lang/String;

    move-result-object v12

    .line 4
    invoke-virtual/range {p1 .. p1}, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;->getSleepTime()J

    move-result-wide v13

    .line 5
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
    move-object/from16 v15, p5

    goto :goto_1

    .line 6
    :cond_1
    :goto_0
    new-instance v15, Lcom/beizi/fusion/work/interstitial/a;

    iget-object v1, v10, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v10, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v10, Lcom/beizi/fusion/d/e;->f:J

    move-object v0, v15

    move-wide v5, v13

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p0

    invoke-direct/range {v0 .. v9}, Lcom/beizi/fusion/work/interstitial/a;-><init>(Landroid/content/Context;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;)V

    :goto_1
    const-string v0, "NATIVE"

    .line 7
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "GDT"

    if-eqz v0, :cond_4

    .line 8
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "KUAISHOU"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    .line 9
    :cond_2
    new-instance v15, Lcom/beizi/fusion/work/interstitial/e;

    iget-object v1, v10, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v10, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v10, Lcom/beizi/fusion/d/e;->f:J

    move-object v0, v15

    move-wide v5, v13

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p0

    invoke-direct/range {v0 .. v9}, Lcom/beizi/fusion/work/interstitial/e;-><init>(Landroid/content/Context;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;)V

    goto :goto_2

    .line 10
    :cond_3
    new-instance v15, Lcom/beizi/fusion/work/interstitial/d;

    iget-object v1, v10, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v10, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v10, Lcom/beizi/fusion/d/e;->f:J

    move-object v0, v15

    move-wide v5, v13

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p0

    invoke-direct/range {v0 .. v9}, Lcom/beizi/fusion/work/interstitial/d;-><init>(Landroid/content/Context;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;)V

    :goto_2
    return-object v15

    .line 11
    :cond_4
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    const-string v0, "CSJ"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_3

    .line 12
    :cond_5
    new-instance v15, Lcom/beizi/fusion/work/interstitial/c;

    iget-object v1, v10, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v10, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v10, Lcom/beizi/fusion/d/e;->f:J

    move-object v0, v15

    move-wide v5, v13

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p0

    invoke-direct/range {v0 .. v9}, Lcom/beizi/fusion/work/interstitial/c;-><init>(Landroid/content/Context;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;)V

    goto :goto_3

    .line 13
    :cond_6
    new-instance v15, Lcom/beizi/fusion/work/interstitial/b;

    iget-object v1, v10, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v10, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v10, Lcom/beizi/fusion/d/e;->f:J

    move-object v0, v15

    move-wide v5, v13

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p0

    invoke-direct/range {v0 .. v9}, Lcom/beizi/fusion/work/interstitial/b;-><init>(Landroid/content/Context;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;)V

    :goto_3
    return-object v15
.end method

.method protected a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/d/e;->c:Lcom/beizi/fusion/b/b;

    if-eqz v0, :cond_0

    const-string v1, "3"

    .line 2
    invoke-virtual {v0, v1}, Lcom/beizi/fusion/b/b;->d(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public a(Landroid/app/Activity;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 14
    iget-object v0, p0, Lcom/beizi/fusion/d/e;->i:Lcom/beizi/fusion/work/a;

    if-eqz v0, :cond_0

    .line 15
    invoke-virtual {v0, p1}, Lcom/beizi/fusion/work/a;->a(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/d/l;->r:I

    return-void
.end method

.method public b()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/beizi/fusion/d/e;->l:Z

    return v0
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/beizi/fusion/d/e;->a(Landroid/view/ViewGroup;)V

    return-void
.end method
