.class Lcom/beizi/fusion/work/nativead/e$2;
.super Ljava/lang/Object;
.source "BeiZiNativeWorker.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/e;->f(Lcom/beizi/ad/NativeAdResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/NativeAdResponse;

.field final synthetic b:Lcom/beizi/fusion/work/nativead/e;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/e;Lcom/beizi/ad/NativeAdResponse;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/e$2;->b:Lcom/beizi/fusion/work/nativead/e;

    iput-object p2, p0, Lcom/beizi/fusion/work/nativead/e$2;->a:Lcom/beizi/ad/NativeAdResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/e$2;->b:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/e;->V(Lcom/beizi/fusion/work/nativead/e;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/e$2;->b:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/e;->W(Lcom/beizi/fusion/work/nativead/e;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/e$2;->b:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/e;->c(Lcom/beizi/fusion/work/nativead/e;)Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/e$2;->b:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/e;->X(Lcom/beizi/fusion/work/nativead/e;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/e$2;->a:Lcom/beizi/ad/NativeAdResponse;

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/e$2;->b:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/e;->o(Lcom/beizi/fusion/work/nativead/e;)Landroid/view/View;

    move-result-object v3

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/e$2;->b:Lcom/beizi/fusion/work/nativead/e;

    .line 5
    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/e;->Y(Lcom/beizi/fusion/work/nativead/e;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v4

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/e$2;->b:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/e;->Z(Lcom/beizi/fusion/work/nativead/e;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v5

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/e$2;->b:Lcom/beizi/fusion/work/nativead/e;

    .line 6
    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/e;->aa(Lcom/beizi/fusion/work/nativead/e;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v6

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/e$2;->b:Lcom/beizi/fusion/work/nativead/e;

    .line 7
    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/e;->ab(Lcom/beizi/fusion/work/nativead/e;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    .line 8
    invoke-static/range {v2 .. v8}, Lcom/beizi/ad/internal/nativead/NativeAdUtil;->handleClick(Lcom/beizi/ad/NativeAdResponse;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/e$2;->b:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/e;->ac(Lcom/beizi/fusion/work/nativead/e;)V

    goto :goto_0

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/e$2;->b:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/e;->ac(Lcom/beizi/fusion/work/nativead/e;)V

    :goto_0
    return-void
.end method
