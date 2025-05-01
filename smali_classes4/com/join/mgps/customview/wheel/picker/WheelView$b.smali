.class Lcom/join/mgps/customview/wheel/picker/WheelView$b;
.super Ljava/lang/Object;
.source "WheelView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/wheel/picker/WheelView;->t()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/wheel/picker/WheelView;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/wheel/picker/WheelView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$b;->b:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$b;->b:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->g(Lcom/join/mgps/customview/wheel/picker/WheelView;)Lcom/join/mgps/customview/wheel/picker/WheelView$g;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$b;->b:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->g(Lcom/join/mgps/customview/wheel/picker/WheelView;)Lcom/join/mgps/customview/wheel/picker/WheelView$g;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$b;->b:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->h(Lcom/join/mgps/customview/wheel/picker/WheelView;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView$g;->onSelected(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$b;->b:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->i(Lcom/join/mgps/customview/wheel/picker/WheelView;)Lcom/join/mgps/customview/wheel/picker/WheelView$h;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$b;->b:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->i(Lcom/join/mgps/customview/wheel/picker/WheelView;)Lcom/join/mgps/customview/wheel/picker/WheelView$h;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$b;->b:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v2}, Lcom/join/mgps/customview/wheel/picker/WheelView;->h(Lcom/join/mgps/customview/wheel/picker/WheelView;)I

    move-result v2

    iget-object v3, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$b;->b:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v3}, Lcom/join/mgps/customview/wheel/picker/WheelView;->j(Lcom/join/mgps/customview/wheel/picker/WheelView;)Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$b;->b:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v4}, Lcom/join/mgps/customview/wheel/picker/WheelView;->h(Lcom/join/mgps/customview/wheel/picker/WheelView;)I

    move-result v4

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/customview/wheel/picker/entity/WheelItem;

    invoke-interface {v3}, Lcom/join/mgps/customview/wheel/picker/entity/WheelItem;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lcom/join/mgps/customview/wheel/picker/WheelView$h;->a(ZILjava/lang/String;)V

    :cond_1
    return-void
.end method
