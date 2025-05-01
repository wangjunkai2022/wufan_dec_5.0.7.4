.class Lcom/join/mgps/customview/wheel/picker/DateTimePicker$c;
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
.field final synthetic a:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$c;->a:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSelected(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$c;->a:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0, p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->b1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;I)I

    .line 2
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$c;->a:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$c;->a:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$c;->a:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->a1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$c;->a:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->f1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$c;->a:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v2}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->a1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;->d(ILjava/lang/String;)V

    :cond_0
    return-void
.end method
