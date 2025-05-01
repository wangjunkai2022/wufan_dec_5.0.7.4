.class Lcom/beizi/fusion/g/ap$3;
.super Ljava/lang/Object;
.source "ScrollClickUtil.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/g/ap;->a(IILcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickPositionBean;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/g/ap;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/g/ap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/g/ap$3;->a:Lcom/beizi/fusion/g/ap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/g/ap$3;->a:Lcom/beizi/fusion/g/ap;

    iget-object v0, v0, Lcom/beizi/fusion/g/ap;->a:Lcom/beizi/fusion/widget/ScrollClickView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/fusion/widget/ScrollClickView;->startAnim()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method
