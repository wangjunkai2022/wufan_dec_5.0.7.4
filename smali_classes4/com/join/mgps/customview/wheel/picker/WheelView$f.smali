.class Lcom/join/mgps/customview/wheel/picker/WheelView$f;
.super Landroid/os/Handler;
.source "WheelView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/customview/wheel/picker/WheelView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation


# static fields
.field static final b:I = 0x3e8

.field static final c:I = 0x7d0

.field static final d:I = 0xbb8


# instance fields
.field final a:Lcom/join/mgps/customview/wheel/picker/WheelView;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/wheel/picker/WheelView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$f;->a:Lcom/join/mgps/customview/wheel/picker/WheelView;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x3e8

    if-eq p1, v0, :cond_2

    const/16 v0, 0x7d0

    if-eq p1, v0, :cond_1

    const/16 v0, 0xbb8

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$f;->a:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {p1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->l(Lcom/join/mgps/customview/wheel/picker/WheelView;)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$f;->a:Lcom/join/mgps/customview/wheel/picker/WheelView;

    const/4 v0, 0x2

    invoke-static {p1, v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->k(Lcom/join/mgps/customview/wheel/picker/WheelView;I)V

    goto :goto_0

    .line 4
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$f;->a:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :goto_0
    return-void
.end method
