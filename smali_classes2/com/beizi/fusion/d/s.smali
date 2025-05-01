.class public Lcom/beizi/fusion/d/s;
.super Lcom/beizi/fusion/d/e;
.source "RewardedVideoManager.java"


# instance fields
.field private r:I

.field private s:Ljava/lang/String;

.field private t:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/a;JI)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/beizi/fusion/d/e;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/a;J)V

    .line 2
    iput p6, p0, Lcom/beizi/fusion/d/s;->r:I

    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/fusion/d/e;->l:Z

    return v0
.end method

.method public B()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/beizi/fusion/d/e;->a(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public C()I
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

.method public D()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/d/e;->m()V

    return-void
.end method

.method public a(Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Ljava/lang/String;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Ljava/util/List;Lcom/beizi/fusion/work/a;)Lcom/beizi/fusion/work/a;
    .locals 14
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

    move-object v12, p0

    move-object/from16 v0, p2

    .line 4
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;->getSleepTime()J

    move-result-wide v7

    .line 5
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "HUAWEI"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_1
    const-string v1, "KUAISHOU"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_2
    const-string v1, "BAIDU"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_3
    const-string v1, "GDT"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_4
    const-string v1, "CSJ"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    move-object/from16 v13, p5

    goto/16 :goto_2

    .line 6
    :pswitch_0
    new-instance v10, Lcom/beizi/fusion/work/g/d;

    sget-object v1, Lcom/beizi/fusion/d/e;->a:Landroid/content/Context;

    iget-object v2, v12, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v12, Lcom/beizi/fusion/d/e;->f:J

    move-object v0, v10

    move-wide v5, v7

    move-object/from16 v7, p3

    move-object v8, p1

    move-object v9, p0

    invoke-direct/range {v0 .. v9}, Lcom/beizi/fusion/work/g/d;-><init>(Landroid/content/Context;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;)V

    goto :goto_1

    .line 7
    :pswitch_1
    new-instance v13, Lcom/beizi/fusion/work/g/e;

    sget-object v1, Lcom/beizi/fusion/d/e;->a:Landroid/content/Context;

    iget-object v2, v12, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/beizi/fusion/d/s;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/beizi/fusion/d/s;->c()Ljava/lang/String;

    move-result-object v4

    iget-wide v5, v12, Lcom/beizi/fusion/d/e;->f:J

    move-object v0, v13

    move-object/from16 v9, p3

    move-object v10, p1

    move-object v11, p0

    invoke-direct/range {v0 .. v11}, Lcom/beizi/fusion/work/g/e;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;)V

    goto :goto_2

    .line 8
    :pswitch_2
    new-instance v10, Lcom/beizi/fusion/work/g/a;

    sget-object v1, Lcom/beizi/fusion/d/e;->a:Landroid/content/Context;

    iget-object v2, v12, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v12, Lcom/beizi/fusion/d/e;->f:J

    move-object v0, v10

    move-wide v5, v7

    move-object/from16 v7, p3

    move-object v8, p1

    move-object v9, p0

    invoke-direct/range {v0 .. v9}, Lcom/beizi/fusion/work/g/a;-><init>(Landroid/content/Context;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;)V

    :goto_1
    move-object v13, v10

    goto :goto_2

    .line 9
    :pswitch_3
    new-instance v13, Lcom/beizi/fusion/work/g/c;

    sget-object v1, Lcom/beizi/fusion/d/e;->a:Landroid/content/Context;

    iget-object v2, v12, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/beizi/fusion/d/s;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/beizi/fusion/d/s;->c()Ljava/lang/String;

    move-result-object v4

    iget-wide v5, v12, Lcom/beizi/fusion/d/e;->f:J

    move-object v0, v13

    move-object/from16 v9, p3

    move-object v10, p1

    move-object v11, p0

    invoke-direct/range {v0 .. v11}, Lcom/beizi/fusion/work/g/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;)V

    goto :goto_2

    .line 10
    :pswitch_4
    new-instance v13, Lcom/beizi/fusion/work/g/b;

    sget-object v1, Lcom/beizi/fusion/d/e;->a:Landroid/content/Context;

    iget-object v2, v12, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/beizi/fusion/d/s;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/beizi/fusion/d/s;->c()Ljava/lang/String;

    move-result-object v4

    iget-wide v5, v12, Lcom/beizi/fusion/d/e;->f:J

    move-object v0, v13

    move-object/from16 v9, p3

    move-object v10, p1

    move-object v11, p0

    invoke-direct/range {v0 .. v11}, Lcom/beizi/fusion/work/g/b;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;)V

    :goto_2
    return-object v13

    :sswitch_data_0
    .sparse-switch
        0x105da -> :sswitch_4
        0x11317 -> :sswitch_3
        0x3c0b5fb -> :sswitch_2
        0x7280590d -> :sswitch_1
        0x7fa995e7 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/model/AppEventId;->setAppRewardedVideoRequest(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/d/e;->c:Lcom/beizi/fusion/b/b;

    if-eqz v0, :cond_0

    const-string v1, "1"

    .line 3
    invoke-virtual {v0, v1}, Lcom/beizi/fusion/b/b;->d(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public a(Landroid/app/Activity;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 11
    iget-object v0, p0, Lcom/beizi/fusion/d/e;->i:Lcom/beizi/fusion/work/a;

    if-eqz v0, :cond_0

    .line 12
    invoke-virtual {v0, p1}, Lcom/beizi/fusion/work/a;->a(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/d/s;->s:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/d/s;->t:Ljava/lang/String;

    return-object v0
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/d/s;->s:Ljava/lang/String;

    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/d/s;->t:Ljava/lang/String;

    return-void
.end method
