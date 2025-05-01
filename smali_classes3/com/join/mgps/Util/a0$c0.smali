.class Lcom/join/mgps/Util/a0$c0;
.super Ljava/lang/Object;
.source "DialogUtil.java"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/Util/a0;->W(Landroid/content/Context;Lcom/join/mgps/dto/OnlineCouponConfigBean;ILcom/join/mgps/Util/a0$n0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/Util/a0$n0;

.field final synthetic c:Lcom/join/mgps/Util/a0;


# direct methods
.method constructor <init>(Lcom/join/mgps/Util/a0;Lcom/join/mgps/Util/a0$n0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/Util/a0$c0;->c:Lcom/join/mgps/Util/a0;

    iput-object p2, p0, Lcom/join/mgps/Util/a0$c0;->b:Lcom/join/mgps/Util/a0$n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/Util/a0$c0;->c:Lcom/join/mgps/Util/a0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/a0;->b(Lcom/join/mgps/Util/a0;Lcom/join/mgps/dialog/u1;)Lcom/join/mgps/dialog/u1;

    .line 2
    iget-object p1, p0, Lcom/join/mgps/Util/a0$c0;->b:Lcom/join/mgps/Util/a0$n0;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/join/mgps/Util/a0$n0;->onDismiss()V

    :cond_0
    return-void
.end method
