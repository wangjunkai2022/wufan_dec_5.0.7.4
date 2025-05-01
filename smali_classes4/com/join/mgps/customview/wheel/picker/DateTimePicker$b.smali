.class Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;
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
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    iput-object p2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->a:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSelected(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0, p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Z0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;I)I

    .line 2
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->d1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v1

    invoke-interface {v0, v1, p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;->e(ILjava/lang/String;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->K0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->K0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->b1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;I)I

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->K0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v0

    if-nez v0, :cond_3

    .line 9
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-virtual {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->q1()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->u(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    .line 10
    :cond_3
    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 11
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {p1}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->u(Ljava/lang/String;)I

    move-result p1

    invoke-static {v1, v0, p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->e1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;II)V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->a:Lcom/join/mgps/customview/wheel/picker/WheelView;

    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->f1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->a1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setItems(Ljava/util/List;I)V

    .line 13
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 14
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->a1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->f1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;->b:Lcom/join/mgps/customview/wheel/picker/DateTimePicker;

    invoke-static {v2}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->a1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;->d(ILjava/lang/String;)V

    :cond_4
    return-void
.end method
