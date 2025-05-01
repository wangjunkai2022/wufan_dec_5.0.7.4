.class Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;
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

.field final synthetic b:Lcom/join/mgps/customview/wheel/picker/WheelView;

.field final synthetic c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;Lcom/join/mgps/customview/wheel/picker/WheelView;Lcom/join/mgps/customview/wheel/picker/WheelView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    iput-object p2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->a:Lcom/join/mgps/customview/wheel/picker/WheelView;

    iput-object p3, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->b:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSelected(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0, p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->I0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;I)I

    .line 2
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->J0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->H0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->H0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v1

    invoke-interface {v0, v1, p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;->f(ILjava/lang/String;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Z0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;I)I

    .line 7
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0, v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->b1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;I)I

    .line 8
    :cond_1
    invoke-static {p1}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->u(Ljava/lang/String;)I

    move-result p1

    .line 9
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0, p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->c1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;I)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->a:Lcom/join/mgps/customview/wheel/picker/WheelView;

    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->d1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v2}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setItems(Ljava/util/List;I)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 12
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v1

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v2}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->d1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/util/ArrayList;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v3}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;->e(ILjava/lang/String;)V

    .line 13
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->d1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v2}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->u(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, p1, v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->e1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;II)V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->b:Lcom/join/mgps/customview/wheel/picker/WheelView;

    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->f1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->a1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setItems(Ljava/util/List;I)V

    .line 15
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 16
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->a1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->f1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;->c:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v2}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->a1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;->d(ILjava/lang/String;)V

    :cond_3
    return-void
.end method
