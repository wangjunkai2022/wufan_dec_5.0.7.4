.class public Lcom/join/mgps/customview/wheel/picker/b;
.super Lcom/join/mgps/customview/wheel/picker/DateTimePicker;
.source "TimePicker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/customview/wheel/picker/b$d;,
        Lcom/join/mgps/customview/wheel/picker/b$c;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x3

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/customview/wheel/picker/b;-><init>(Landroid/app/Activity;I)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;I)V
    .locals 1

    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, p1, v0, p2}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;-><init>(Landroid/app/Activity;II)V

    return-void
.end method


# virtual methods
.method public final C1(IIII)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->C1(IIII)V

    return-void
.end method

.method public final D1(IIIII)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-super/range {p0 .. p5}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->D1(IIIII)V

    return-void
.end method

.method public E1(III)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->E1(III)V

    return-void
.end method

.method public F1(III)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->F1(III)V

    return-void
.end method

.method public G1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const-string v1, ""

    const-string v2, ""

    const-string v3, ""

    move-object v0, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    .line 1
    invoke-super/range {v0 .. v6}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->x1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public H1(Lcom/join/mgps/customview/wheel/picker/b$c;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Lcom/join/mgps/customview/wheel/picker/b$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/customview/wheel/picker/b$b;-><init>(Lcom/join/mgps/customview/wheel/picker/b;Lcom/join/mgps/customview/wheel/picker/b$c;)V

    invoke-super {p0, v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->y1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker$h;)V

    return-void
.end method

.method public I1(Lcom/join/mgps/customview/wheel/picker/b$d;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Lcom/join/mgps/customview/wheel/picker/b$a;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/customview/wheel/picker/b$a;-><init>(Lcom/join/mgps/customview/wheel/picker/b;Lcom/join/mgps/customview/wheel/picker/b$d;)V

    invoke-super {p0, v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->z1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;)V

    return-void
.end method

.method public J1(III)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-super {p0, p1, v0, v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->F1(III)V

    const/16 p1, 0x3b

    .line 2
    invoke-super {p0, p2, p1, p3}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->E1(III)V

    return-void
.end method

.method public K1(III)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->E1(III)V

    return-void
.end method

.method public L1(III)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->F1(III)V

    return-void
.end method

.method public M1(II)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-super {p0, v0, v0, p1, p2}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->C1(IIII)V

    return-void
.end method

.method public final t1(II)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Data range nonsupport"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final u1(III)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Date range nonsupport"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final v1(II)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Date range nonsupport"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final w1(III)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Date range nonsupport"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final x1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-super/range {p0 .. p6}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->x1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final y1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker$h;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->y1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker$h;)V

    return-void
.end method

.method public final z1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->z1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;)V

    return-void
.end method
