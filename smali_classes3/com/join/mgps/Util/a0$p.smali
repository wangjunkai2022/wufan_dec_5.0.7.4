.class Lcom/join/mgps/Util/a0$p;
.super Ljava/lang/Object;
.source "DialogUtil.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/Util/a0;->c0(Landroid/content/Context;)Lcom/join/mgps/customview/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/o;

.field final synthetic c:Lcom/join/mgps/Util/a0;


# direct methods
.method constructor <init>(Lcom/join/mgps/Util/a0;Lcom/join/mgps/customview/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/Util/a0$p;->c:Lcom/join/mgps/Util/a0;

    iput-object p2, p0, Lcom/join/mgps/Util/a0$p;->b:Lcom/join/mgps/customview/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/IntentUtil;->goSvip(Landroid/content/Context;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/Util/a0$p;->b:Lcom/join/mgps/customview/o;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/Util/a0$p;->b:Lcom/join/mgps/customview/o;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method
