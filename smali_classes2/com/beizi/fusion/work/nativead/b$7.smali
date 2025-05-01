.class Lcom/beizi/fusion/work/nativead/b$7;
.super Ljava/lang/Object;
.source "BaseBeiZiNativeWorker.java"

# interfaces
.implements Lcom/beizi/fusion/g/ag$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/b;->a(Lcom/beizi/ad/NativeAdResponse;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Lcom/beizi/ad/NativeAdResponse;

.field final synthetic d:Lcom/beizi/fusion/work/nativead/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/b;IILcom/beizi/ad/NativeAdResponse;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/b$7;->d:Lcom/beizi/fusion/work/nativead/b;

    iput p2, p0, Lcom/beizi/fusion/work/nativead/b$7;->a:I

    iput p3, p0, Lcom/beizi/fusion/work/nativead/b$7;->b:I

    iput-object p4, p0, Lcom/beizi/fusion/work/nativead/b$7;->c:Lcom/beizi/ad/NativeAdResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$7;->d:Lcom/beizi/fusion/work/nativead/b;

    iget-object v0, v0, Lcom/beizi/fusion/work/nativead/b;->u:Landroid/view/View;

    invoke-static {v0}, Lcom/beizi/fusion/g/ax;->a(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 2
    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/b$7;->d:Lcom/beizi/fusion/work/nativead/b;

    iget-object v2, v2, Lcom/beizi/fusion/work/nativead/b;->u:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 3
    iget v2, p0, Lcom/beizi/fusion/work/nativead/b$7;->a:I

    div-int/2addr v2, v0

    iget v3, p0, Lcom/beizi/fusion/work/nativead/b$7;->b:I

    div-int/2addr v3, v0

    invoke-static {v2, v3}, Lcom/beizi/fusion/g/al;->a(II)[I

    move-result-object v0

    .line 4
    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/b$7;->c:Lcom/beizi/ad/NativeAdResponse;

    iget-object v3, p0, Lcom/beizi/fusion/work/nativead/b$7;->d:Lcom/beizi/fusion/work/nativead/b;

    iget-object v3, v3, Lcom/beizi/fusion/work/nativead/b;->u:Landroid/view/View;

    const/4 v9, 0x0

    aget v4, v0, v9

    .line 5
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aget v6, v0, v5

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    aget v7, v0, v9

    aget v8, v1, v9

    add-int/2addr v7, v8

    .line 6
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    aget v0, v0, v5

    aget v1, v1, v5

    add-int/2addr v0, v1

    .line 7
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v8, 0x2

    move-object v5, v6

    move-object v6, v7

    move-object v7, v0

    .line 8
    invoke-static/range {v2 .. v8}, Lcom/beizi/ad/internal/nativead/NativeAdUtil;->handleClick(Lcom/beizi/ad/NativeAdResponse;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 9
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$7;->d:Lcom/beizi/fusion/work/nativead/b;

    iget-boolean v1, v0, Lcom/beizi/fusion/work/nativead/b;->C:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/beizi/fusion/work/nativead/b;->z:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

    if-eqz v1, :cond_0

    .line 10
    iput-boolean v9, v0, Lcom/beizi/fusion/work/nativead/b;->C:Z

    .line 11
    iget-object v0, v0, Lcom/beizi/fusion/work/nativead/b;->A:Lcom/beizi/fusion/g/ag;

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/g/ag;->a(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;)V

    .line 12
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$7;->d:Lcom/beizi/fusion/work/nativead/b;

    iget-object v1, v0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    iget-object v0, v0, Lcom/beizi/fusion/work/nativead/b;->B:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    invoke-static {}, Lcom/beizi/fusion/g/aq;->a()Lcom/beizi/fusion/g/aq;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/b$7;->d:Lcom/beizi/fusion/work/nativead/b;

    iget-object v1, v1, Lcom/beizi/fusion/work/nativead/b;->B:Ljava/lang/String;

    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 15
    invoke-virtual {v0, v1, v2, v3}, Lcom/beizi/fusion/g/aq;->a(Ljava/lang/String;J)V

    :cond_0
    return-void
.end method
