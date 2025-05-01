.class Lcom/join/mgps/Util/a0$u;
.super Ljava/lang/Object;
.source "DialogUtil.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/Util/a0;->O(Landroid/content/Context;ILw1/c;)Lcom/join/mgps/customview/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lw1/c;

.field final synthetic c:Lcom/join/mgps/customview/o;

.field final synthetic d:Lcom/join/mgps/Util/a0;


# direct methods
.method constructor <init>(Lcom/join/mgps/Util/a0;Lw1/c;Lcom/join/mgps/customview/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/Util/a0$u;->d:Lcom/join/mgps/Util/a0;

    iput-object p2, p0, Lcom/join/mgps/Util/a0$u;->b:Lw1/c;

    iput-object p3, p0, Lcom/join/mgps/Util/a0$u;->c:Lcom/join/mgps/customview/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/Util/a0$u;->b:Lw1/c;

    invoke-interface {p1}, Lw1/c;->onClickCancle()V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/Util/a0$u;->c:Lcom/join/mgps/customview/o;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/Util/a0$u;->c:Lcom/join/mgps/customview/o;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method
