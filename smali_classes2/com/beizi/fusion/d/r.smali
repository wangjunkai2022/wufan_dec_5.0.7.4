.class public Lcom/beizi/fusion/d/r;
.super Lcom/beizi/fusion/d/e;
.source "NativeUnifiedAdManager.java"


# instance fields
.field private r:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/a;JI)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/beizi/fusion/d/e;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/a;J)V

    .line 2
    iput p6, p0, Lcom/beizi/fusion/d/r;->r:I

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

.method public C()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/d/e;->n()V

    return-void
.end method

.method public a(Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Ljava/lang/String;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Ljava/util/List;Lcom/beizi/fusion/work/a;)Lcom/beizi/fusion/work/a;
    .locals 10
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

    .line 4
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;->getSleepTime()J

    move-result-wide v8

    .line 5
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p4

    const/4 v0, -0x1

    sparse-switch p4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string p4, "KUAISHOU"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_1
    const-string p4, "GDT"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_2
    const-string p4, "CSJ"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 6
    :pswitch_0
    new-instance p5, Lcom/beizi/fusion/work/f/e;

    iget-object v1, p0, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget v7, p0, Lcom/beizi/fusion/d/r;->r:I

    move-object v0, p5

    move-wide v2, v8

    move-object v4, p3

    move-object v5, p1

    move-object v6, p0

    invoke-direct/range {v0 .. v7}, Lcom/beizi/fusion/work/f/e;-><init>(Landroid/content/Context;JLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;I)V

    goto :goto_1

    .line 7
    :pswitch_1
    new-instance p5, Lcom/beizi/fusion/work/f/d;

    iget-object v1, p0, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget v7, p0, Lcom/beizi/fusion/d/r;->r:I

    move-object v0, p5

    move-wide v2, v8

    move-object v4, p3

    move-object v5, p1

    move-object v6, p0

    invoke-direct/range {v0 .. v7}, Lcom/beizi/fusion/work/f/d;-><init>(Landroid/content/Context;JLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;I)V

    goto :goto_1

    .line 8
    :pswitch_2
    new-instance p5, Lcom/beizi/fusion/work/f/c;

    iget-object v1, p0, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget v7, p0, Lcom/beizi/fusion/d/r;->r:I

    move-object v0, p5

    move-wide v2, v8

    move-object v4, p3

    move-object v5, p1

    move-object v6, p0

    invoke-direct/range {v0 .. v7}, Lcom/beizi/fusion/work/f/c;-><init>(Landroid/content/Context;JLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;I)V

    .line 9
    :goto_1
    invoke-static {}, Lcom/beizi/fusion/g/au;->b()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p4, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p4

    if-nez p4, :cond_3

    const-string p4, "BEIZI"

    invoke-virtual {p4, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 10
    :cond_3
    new-instance p5, Lcom/beizi/fusion/work/f/b;

    iget-object v1, p0, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget v7, p0, Lcom/beizi/fusion/d/r;->r:I

    move-object v0, p5

    move-wide v2, v8

    move-object v4, p3

    move-object v5, p1

    move-object v6, p0

    invoke-direct/range {v0 .. v7}, Lcom/beizi/fusion/work/f/b;-><init>(Landroid/content/Context;JLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;I)V

    :cond_4
    return-object p5

    nop

    :sswitch_data_0
    .sparse-switch
        0x105da -> :sswitch_2
        0x11317 -> :sswitch_1
        0x7280590d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

.method public b()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/beizi/fusion/d/e;->a(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/fusion/d/e;->l:Z

    return v0
.end method
