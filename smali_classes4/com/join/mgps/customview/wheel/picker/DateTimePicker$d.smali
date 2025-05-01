.class Lcom/join/mgps/customview/wheel/picker/DateTimePicker$d;
.super Ljava/lang/Object;
.source "DateTimePicker.java"

# interfaces
.implements Lcom/join/mgps/customview/wheel/picker/WheelView$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->G()Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/customview/wheel/picker/WheelView;

.field final synthetic b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;Lcom/join/mgps/customview/wheel/picker/WheelView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$d;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    iput-object p2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$d;->a:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSelected(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$d;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->N0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$d;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$d;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$d;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->L0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;->c(ILjava/lang/String;)V

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$d;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->L0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->u(Ljava/lang/String;)I

    move-result v0

    invoke-static {p1, v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->O0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;I)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$d;->a:Lcom/join/mgps/customview/wheel/picker/WheelView;

    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$d;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->P0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$d;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Q0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setItems(Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method
