.class public Lcom/beizi/fusion/d/o;
.super Lcom/beizi/fusion/d/e;
.source "NativeAdManager.java"


# instance fields
.field private r:F

.field private s:F

.field private t:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/a;JI)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/beizi/fusion/d/e;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/a;J)V

    .line 2
    iput p6, p0, Lcom/beizi/fusion/d/o;->t:I

    return-void
.end method


# virtual methods
.method public A()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/d/e;->n()V

    return-void
.end method

.method public a(Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Ljava/lang/String;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Ljava/util/List;Lcom/beizi/fusion/work/a;)Lcom/beizi/fusion/work/a;
    .locals 17
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

    move-object/from16 v12, p0

    move-object/from16 v13, p2

    .line 4
    invoke-virtual/range {p1 .. p1}, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;->getSleepTime()J

    move-result-wide v14

    .line 5
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "KUAISHOU"

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_1
    const-string v0, "BAIDU"

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_2
    const-string v0, "GDT"

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_3
    const-string v0, "CSJ"

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    move-object/from16 v16, p5

    goto/16 :goto_1

    .line 6
    :pswitch_0
    new-instance v16, Lcom/beizi/fusion/work/nativead/i;

    sget-object v1, Lcom/beizi/fusion/d/e;->a:Landroid/content/Context;

    iget-object v2, v12, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v12, Lcom/beizi/fusion/d/e;->f:J

    iget v10, v12, Lcom/beizi/fusion/d/o;->r:F

    iget v11, v12, Lcom/beizi/fusion/d/o;->s:F

    move-object/from16 v0, v16

    move-wide v5, v14

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p0

    invoke-direct/range {v0 .. v11}, Lcom/beizi/fusion/work/nativead/i;-><init>(Landroid/content/Context;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;FF)V

    goto/16 :goto_1

    .line 7
    :pswitch_1
    new-instance v16, Lcom/beizi/fusion/work/nativead/a;

    sget-object v1, Lcom/beizi/fusion/d/e;->a:Landroid/content/Context;

    iget-object v2, v12, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v12, Lcom/beizi/fusion/d/e;->f:J

    iget v10, v12, Lcom/beizi/fusion/d/o;->r:F

    iget v11, v12, Lcom/beizi/fusion/d/o;->s:F

    move-object/from16 v0, v16

    move-wide v5, v14

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p0

    invoke-direct/range {v0 .. v11}, Lcom/beizi/fusion/work/nativead/a;-><init>(Landroid/content/Context;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;FF)V

    goto :goto_1

    .line 8
    :pswitch_2
    iget v0, v12, Lcom/beizi/fusion/d/o;->t:I

    if-ne v0, v1, :cond_4

    .line 9
    new-instance v16, Lcom/beizi/fusion/work/nativead/h;

    iget-object v1, v12, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v12, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v12, Lcom/beizi/fusion/d/e;->f:J

    iget v10, v12, Lcom/beizi/fusion/d/o;->r:F

    iget v11, v12, Lcom/beizi/fusion/d/o;->s:F

    move-object/from16 v0, v16

    move-wide v5, v14

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p0

    invoke-direct/range {v0 .. v11}, Lcom/beizi/fusion/work/nativead/h;-><init>(Landroid/content/Context;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;FF)V

    goto :goto_1

    .line 10
    :cond_4
    new-instance v16, Lcom/beizi/fusion/work/nativead/g;

    iget-object v1, v12, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v12, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v12, Lcom/beizi/fusion/d/e;->f:J

    iget v10, v12, Lcom/beizi/fusion/d/o;->r:F

    iget v11, v12, Lcom/beizi/fusion/d/o;->s:F

    move-object/from16 v0, v16

    move-wide v5, v14

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p0

    invoke-direct/range {v0 .. v11}, Lcom/beizi/fusion/work/nativead/g;-><init>(Landroid/content/Context;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;FF)V

    goto :goto_1

    .line 11
    :pswitch_3
    new-instance v16, Lcom/beizi/fusion/work/nativead/f;

    iget-object v1, v12, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v12, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v12, Lcom/beizi/fusion/d/e;->f:J

    iget v10, v12, Lcom/beizi/fusion/d/o;->r:F

    iget v11, v12, Lcom/beizi/fusion/d/o;->s:F

    move-object/from16 v0, v16

    move-wide v5, v14

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p0

    invoke-direct/range {v0 .. v11}, Lcom/beizi/fusion/work/nativead/f;-><init>(Landroid/content/Context;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;FF)V

    .line 12
    :goto_1
    invoke-static {}, Lcom/beizi/fusion/g/au;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "BEIZI"

    invoke-virtual {v0, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 13
    :cond_5
    iget v0, v12, Lcom/beizi/fusion/d/o;->t:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_6

    .line 14
    new-instance v16, Lcom/beizi/fusion/work/nativead/c;

    iget-object v1, v12, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v12, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v12, Lcom/beizi/fusion/d/e;->f:J

    iget v10, v12, Lcom/beizi/fusion/d/o;->r:F

    iget v11, v12, Lcom/beizi/fusion/d/o;->s:F

    move-object/from16 v0, v16

    move-wide v5, v14

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p0

    invoke-direct/range {v0 .. v11}, Lcom/beizi/fusion/work/nativead/c;-><init>(Landroid/content/Context;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;FF)V

    goto :goto_2

    :cond_6
    const/4 v1, 0x5

    if-ne v0, v1, :cond_7

    .line 15
    new-instance v16, Lcom/beizi/fusion/work/nativead/d;

    iget-object v1, v12, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v12, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v12, Lcom/beizi/fusion/d/e;->f:J

    iget v10, v12, Lcom/beizi/fusion/d/o;->r:F

    iget v11, v12, Lcom/beizi/fusion/d/o;->s:F

    move-object/from16 v0, v16

    move-wide v5, v14

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p0

    invoke-direct/range {v0 .. v11}, Lcom/beizi/fusion/work/nativead/d;-><init>(Landroid/content/Context;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;FF)V

    goto :goto_2

    .line 16
    :cond_7
    new-instance v16, Lcom/beizi/fusion/work/nativead/e;

    iget-object v1, v12, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, v12, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, v12, Lcom/beizi/fusion/d/e;->f:J

    iget v10, v12, Lcom/beizi/fusion/d/o;->r:F

    iget v11, v12, Lcom/beizi/fusion/d/o;->s:F

    move-object/from16 v0, v16

    move-wide v5, v14

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p0

    invoke-direct/range {v0 .. v11}, Lcom/beizi/fusion/work/nativead/e;-><init>(Landroid/content/Context;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;FF)V

    :cond_8
    :goto_2
    return-object v16

    nop

    :sswitch_data_0
    .sparse-switch
        0x105da -> :sswitch_3
        0x11317 -> :sswitch_2
        0x3c0b5fb -> :sswitch_1
        0x7280590d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/model/AppEventId;->setAppNativeRequest(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/d/e;->c:Lcom/beizi/fusion/b/b;

    if-eqz v0, :cond_0

    const-string v1, "5"

    .line 3
    invoke-virtual {v0, v1}, Lcom/beizi/fusion/b/b;->d(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public a(FF)V
    .locals 0

    .line 17
    iput p1, p0, Lcom/beizi/fusion/d/o;->r:F

    .line 18
    iput p2, p0, Lcom/beizi/fusion/d/o;->s:F

    const/4 p1, 0x0

    .line 19
    invoke-virtual {p0, p1}, Lcom/beizi/fusion/d/e;->a(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public b()I
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

.method public c()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/d/e;->m()V

    return-void
.end method
