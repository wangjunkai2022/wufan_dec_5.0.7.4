.class Lcom/beizi/fusion/work/splash/b$10;
.super Ljava/lang/Object;
.source "BeiZiSplashWorker.java"

# interfaces
.implements Lcom/beizi/fusion/g/an$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/b;->aT()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/beizi/fusion/work/splash/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/b;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/b$10;->b:Lcom/beizi/fusion/work/splash/b;

    iput p2, p0, Lcom/beizi/fusion/work/splash/b$10;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$10;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->ad(Lcom/beizi/fusion/work/splash/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$10;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->ae(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolRollViewBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$10;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->u(Lcom/beizi/fusion/work/splash/b;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/b$10;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v1}, Lcom/beizi/fusion/work/splash/b;->af(Lcom/beizi/fusion/work/splash/b;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$10;->b:Lcom/beizi/fusion/work/splash/b;

    const-string v1, "roll"

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$10;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->ag(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/b/b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/b/b;->O(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$10;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->ah(Lcom/beizi/fusion/work/splash/b;)V

    const-string v0, "BeiZis"

    const-string v1, "enter onRollHappened  "

    .line 6
    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/b$10;->b:Lcom/beizi/fusion/work/splash/b;

    const/4 v11, 0x5

    const-string v3, ""

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    const-string v8, ""

    const-string v9, ""

    const-string v10, ""

    invoke-static/range {v2 .. v11}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    move-object v0, p0

    .line 8
    iget v1, v0, Lcom/beizi/fusion/work/splash/b$10;->a:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 9
    iget-object v1, v0, Lcom/beizi/fusion/work/splash/b$10;->b:Lcom/beizi/fusion/work/splash/b;

    const-string v2, "regionalClick"

    invoke-static {v1, v2}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    iget-object v1, v0, Lcom/beizi/fusion/work/splash/b$10;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v1}, Lcom/beizi/fusion/work/splash/b;->ai(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/b/b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/b/b;->O(Ljava/lang/String;)V

    .line 11
    iget-object v1, v0, Lcom/beizi/fusion/work/splash/b$10;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v1}, Lcom/beizi/fusion/work/splash/b;->aj(Lcom/beizi/fusion/work/splash/b;)V

    const-string v1, "BeiZis"

    const-string v2, "enter onClickHappened  "

    .line 12
    invoke-static {v1, v2}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    iget-object v3, v0, Lcom/beizi/fusion/work/splash/b$10;->b:Lcom/beizi/fusion/work/splash/b;

    const/4 v12, 0x0

    move-object v4, p1

    move-object v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    invoke-static/range {v3 .. v12}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 14
    iget-object v1, v0, Lcom/beizi/fusion/work/splash/b$10;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v1}, Lcom/beizi/fusion/work/splash/b;->s(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/g/an;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/fusion/g/an;->c()V

    :cond_0
    return-void
.end method
