.class public Lcom/beizi/fusion/d/q;
.super Lcom/beizi/fusion/d/e;
.source "NativeNotificationManager.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/a;J)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/beizi/fusion/d/e;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/a;J)V

    return-void
.end method


# virtual methods
.method public a(Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Ljava/lang/String;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Ljava/util/List;Lcom/beizi/fusion/work/a;)Lcom/beizi/fusion/work/a;
    .locals 8
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

    .line 3
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    const-string p4, "FinalLink"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance p5, Lcom/beizi/fusion/work/e/a;

    iget-object v1, p0, Lcom/beizi/fusion/d/e;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/beizi/fusion/d/e;->e:Ljava/lang/String;

    iget-wide v3, p0, Lcom/beizi/fusion/d/e;->f:J

    move-object v0, p5

    move-object v5, p3

    move-object v6, p1

    move-object v7, p0

    invoke-direct/range {v0 .. v7}, Lcom/beizi/fusion/work/e/a;-><init>(Landroid/content/Context;Ljava/lang/String;JLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;)V

    :goto_0
    return-object p5
.end method

.method protected a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/d/e;->c:Lcom/beizi/fusion/b/b;

    if-eqz v0, :cond_0

    const-string v1, "8"

    .line 2
    invoke-virtual {v0, v1}, Lcom/beizi/fusion/b/b;->d(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
