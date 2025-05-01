.class Lcom/join/mgps/Util/a0$j;
.super Ljava/lang/Object;
.source "DialogUtil.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/Util/a0;->B(Landroid/content/Context;Lcom/join/mgps/Util/a0$o0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/o;

.field final synthetic c:Lcom/join/mgps/Util/a0$o0;

.field final synthetic d:Lcom/join/mgps/Util/a0;


# direct methods
.method constructor <init>(Lcom/join/mgps/Util/a0;Lcom/join/mgps/customview/o;Lcom/join/mgps/Util/a0$o0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/Util/a0$j;->d:Lcom/join/mgps/Util/a0;

    iput-object p2, p0, Lcom/join/mgps/Util/a0$j;->b:Lcom/join/mgps/customview/o;

    iput-object p3, p0, Lcom/join/mgps/Util/a0$j;->c:Lcom/join/mgps/Util/a0$o0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/Util/a0$j;->b:Lcom/join/mgps/customview/o;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/Util/a0$j;->b:Lcom/join/mgps/customview/o;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/Util/a0$j;->c:Lcom/join/mgps/Util/a0$o0;

    if-eqz p1, :cond_1

    .line 4
    invoke-interface {p1}, Lcom/join/mgps/Util/a0$o0;->a()V

    :cond_1
    return-void
.end method
