.class public Lcom/join/mgps/customview/wheel/picker/DateTimePicker;
.super Lcom/join/mgps/customview/wheel/picker/c;
.source "DateTimePicker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/customview/wheel/picker/DateTimePicker$k;,
        Lcom/join/mgps/customview/wheel/picker/DateTimePicker$i;,
        Lcom/join/mgps/customview/wheel/picker/DateTimePicker$j;,
        Lcom/join/mgps/customview/wheel/picker/DateTimePicker$n;,
        Lcom/join/mgps/customview/wheel/picker/DateTimePicker$o;,
        Lcom/join/mgps/customview/wheel/picker/DateTimePicker$m;,
        Lcom/join/mgps/customview/wheel/picker/DateTimePicker$h;,
        Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;,
        Lcom/join/mgps/customview/wheel/picker/DateTimePicker$TimeMode;,
        Lcom/join/mgps/customview/wheel/picker/DateTimePicker$DateMode;
    }
.end annotation


# static fields
.field public static final c2:I = -0x1

.field public static final d2:I = 0x0

.field public static final e2:I = 0x1

.field public static final f2:I = 0x2

.field public static final g2:I = 0x3

.field public static final h2:I = 0x4


# instance fields
.field private A1:Ljava/lang/String;

.field private B1:Ljava/lang/String;

.field private C1:Ljava/lang/String;

.field private D1:Ljava/lang/String;

.field private E1:I

.field private F1:I

.field private G1:I

.field private H1:Ljava/lang/String;

.field private I1:Ljava/lang/String;

.field private J1:Ljava/lang/String;

.field private K1:Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

.field private L1:Lcom/join/mgps/customview/wheel/picker/DateTimePicker$h;

.field private M1:I

.field private N1:I

.field private O1:I

.field private P1:I

.field private Q1:I

.field private R1:I

.field private S1:I

.field private T1:I

.field private U1:I

.field private V:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private V1:I

.field private W:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private W1:I

.field private X:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private X1:I

.field private Y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private Y1:I

.field private Z:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private Z1:I

.field private a2:I

.field private b2:Z

.field private p0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private p1:Ljava/lang/String;

.field private v1:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0, p2}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;-><init>(Landroid/app/Activity;II)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;II)V
    .locals 4

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/wheel/picker/c;-><init>(Landroid/app/Activity;)V

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V:Ljava/util/ArrayList;

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X:Ljava/util/ArrayList;

    .line 6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y:Ljava/util/ArrayList;

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Z:Ljava/util/ArrayList;

    .line 8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->p0:Ljava/util/ArrayList;

    const-string p1, "\u5e74"

    .line 9
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->p1:Ljava/lang/String;

    const-string p1, "\u6708"

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->v1:Ljava/lang/String;

    const-string p1, "\u65e5"

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->A1:Ljava/lang/String;

    const-string p1, "\u65f6"

    .line 10
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->B1:Ljava/lang/String;

    const-string p1, "\u5206"

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->C1:Ljava/lang/String;

    const-string p1, "\u79d2"

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->D1:Ljava/lang/String;

    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->E1:I

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->F1:I

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->G1:I

    const-string v0, ""

    .line 12
    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->H1:Ljava/lang/String;

    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->I1:Ljava/lang/String;

    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->J1:Ljava/lang/String;

    .line 13
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->N1:I

    const/16 v0, 0x7da

    .line 14
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->O1:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->P1:I

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Q1:I

    const/16 v1, 0x7e4

    .line 15
    iput v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->R1:I

    const/16 v1, 0xc

    iput v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->S1:I

    const/16 v2, 0x1f

    iput v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->T1:I

    .line 16
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W1:I

    const/16 v2, 0x3b

    .line 17
    iput v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y1:I

    iput v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Z1:I

    const/16 v2, 0x10

    .line 18
    iput v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->a2:I

    .line 19
    iput-boolean v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->b2:Z

    const/4 v2, -0x1

    if-ne p2, v2, :cond_1

    if-eq p3, v2, :cond_0

    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The modes are NONE at the same time"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-nez p2, :cond_3

    if-eq p3, v2, :cond_3

    .line 21
    iget v2, p0, Lcom/join/mgps/customview/popup/a;->c:I

    const/16 v3, 0x2d0

    if-ge v2, v3, :cond_2

    const/16 v2, 0xe

    .line 22
    iput v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->a2:I

    goto :goto_1

    :cond_2
    const/16 v3, 0x1e0

    if-ge v2, v3, :cond_3

    .line 23
    iput v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->a2:I

    .line 24
    :cond_3
    :goto_1
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    const/4 p2, 0x4

    if-ne p3, p2, :cond_4

    .line 25
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->U1:I

    .line 26
    iput v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X1:I

    goto :goto_2

    .line 27
    :cond_4
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->U1:I

    const/16 p1, 0x17

    .line 28
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X1:I

    .line 29
    :goto_2
    iput p3, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->N1:I

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->E1:I

    return p0
.end method

.method static synthetic I0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->E1:I

    return p1
.end method

.method static synthetic J0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic K0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    return p0
.end method

.method static synthetic L0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->H1:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic M0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->H1:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic N0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic O0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->h1(I)V

    return-void
.end method

.method static synthetic P0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Z:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic Q0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->I1:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic R0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->I1:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic S0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->J1:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic T0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->J1:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic U0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->j1(I)V

    return-void
.end method

.method static synthetic V0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->p0:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic W0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->K1:Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

    return-object p0
.end method

.method static synthetic X0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->b2:Z

    return p0
.end method

.method static synthetic Y0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->F1:I

    return p0
.end method

.method static synthetic Z0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->F1:I

    return p1
.end method

.method static synthetic a1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->G1:I

    return p0
.end method

.method static synthetic b1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->G1:I

    return p1
.end method

.method static synthetic c1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->i1(I)V

    return-void
.end method

.method static synthetic d1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic e1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->g1(II)V

    return-void
.end method

.method static synthetic f1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X:Ljava/util/ArrayList;

    return-object p0
.end method

.method private g1(II)V
    .locals 4

    .line 1
    invoke-static {p1, p2}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->b(II)I

    move-result v0

    .line 2
    iget-boolean v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->b2:Z

    if-nez v1, :cond_2

    .line 3
    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->G1:I

    if-lt v1, v0, :cond_0

    add-int/lit8 v1, v0, -0x1

    .line 4
    iput v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->G1:I

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->G1:I

    if-le v1, v2, :cond_1

    .line 6
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const-string v1, ""

    .line 8
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 9
    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->O1:I

    if-ne p1, v2, :cond_3

    iget v3, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->P1:I

    if-ne p2, v3, :cond_3

    iget v3, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->R1:I

    if-ne p1, v3, :cond_3

    iget v3, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->S1:I

    if-ne p2, v3, :cond_3

    .line 10
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Q1:I

    :goto_1
    iget p2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->T1:I

    if-gt p1, p2, :cond_6

    .line 11
    iget-object p2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X:Ljava/util/ArrayList;

    invoke-static {p1}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_3
    if-ne p1, v2, :cond_4

    .line 12
    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->P1:I

    if-ne p2, v2, :cond_4

    .line 13
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Q1:I

    :goto_2
    if-gt p1, v0, :cond_6

    .line 14
    iget-object p2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X:Ljava/util/ArrayList;

    invoke-static {p1}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    .line 15
    :cond_4
    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->R1:I

    const/4 v3, 0x1

    if-ne p1, v2, :cond_5

    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->S1:I

    if-ne p2, p1, :cond_5

    .line 16
    :goto_3
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->T1:I

    if-gt v3, p1, :cond_6

    .line 17
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X:Ljava/util/ArrayList;

    invoke-static {v3}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_5
    :goto_4
    if-gt v3, v0, :cond_6

    .line 18
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X:Ljava/util/ArrayList;

    invoke-static {v3}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 19
    :cond_6
    iget-boolean p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->b2:Z

    if-nez p1, :cond_8

    .line 20
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_7

    const/4 p1, 0x0

    .line 21
    :cond_7
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->G1:I

    :cond_8
    return-void
.end method

.method private h1(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->U1:I

    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X1:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    .line 3
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V1:I

    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y1:I

    if-le p1, v0, :cond_0

    .line 4
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V1:I

    .line 5
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y1:I

    .line 6
    :cond_0
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V1:I

    :goto_0
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y1:I

    if-gt p1, v0, :cond_4

    .line 7
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Z:Ljava/util/ArrayList;

    invoke-static {p1}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/16 v3, 0x3b

    if-ne p1, v0, :cond_2

    .line 8
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V1:I

    :goto_1
    if-gt p1, v3, :cond_4

    .line 9
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Z:Ljava/util/ArrayList;

    invoke-static {p1}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    if-ne p1, v1, :cond_3

    const/4 p1, 0x0

    .line 10
    :goto_2
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y1:I

    if-gt p1, v0, :cond_4

    .line 11
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Z:Ljava/util/ArrayList;

    invoke-static {p1}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    :goto_3
    if-gt p1, v3, :cond_4

    .line 12
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Z:Ljava/util/ArrayList;

    invoke-static {p1}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    .line 13
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Z:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->I1:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_5

    .line 14
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Z:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->I1:Ljava/lang/String;

    :cond_5
    return-void
.end method

.method private i1(I)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->b2:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->F1:I

    if-le v0, v2, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/2addr v0, v1

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v0, ""

    .line 5
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 6
    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->P1:I

    if-lt v2, v1, :cond_9

    iget v3, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->S1:I

    if-lt v3, v1, :cond_9

    const/16 v4, 0xc

    if-gt v2, v4, :cond_9

    if-gt v3, v4, :cond_9

    .line 7
    iget v5, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->O1:I

    iget v6, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->R1:I

    if-ne v5, v6, :cond_3

    if-le v2, v3, :cond_2

    .line 8
    :goto_1
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->P1:I

    if-lt v3, p1, :cond_6

    .line 9
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    invoke-static {v3}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    .line 10
    :cond_2
    :goto_2
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->S1:I

    if-gt v2, p1, :cond_6

    .line 11
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    invoke-static {v2}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    if-ne p1, v5, :cond_4

    :goto_3
    if-gt v2, v4, :cond_6

    .line 12
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    invoke-static {v2}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_4
    if-ne p1, v6, :cond_5

    .line 13
    :goto_4
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->S1:I

    if-gt v1, p1, :cond_6

    .line 14
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_5
    :goto_5
    if-gt v1, v4, :cond_6

    .line 15
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 16
    :cond_6
    iget-boolean p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->b2:Z

    if-nez p1, :cond_8

    .line 17
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_7

    const/4 p1, 0x0

    .line 18
    :cond_7
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->F1:I

    :cond_8
    return-void

    .line 19
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Month out of range [1-12]"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_7

    :goto_6
    throw p1

    :goto_7
    goto :goto_6
.end method

.method private j1(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->p0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x3b

    if-gt v1, v2, :cond_0

    .line 2
    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->p0:Ljava/util/ArrayList;

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->p0:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->p0:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->J1:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method private k1(Ljava/util/ArrayList;I)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;I)I"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$g;

    invoke-direct {v1, p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$g;-><init>(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)V

    invoke-static {p1, v0, v1}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1

    if-ltz p1, :cond_0

    return p1

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Item["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "] out of range"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private r1()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->b2:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 3
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->N1:I

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    .line 4
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/16 v2, 0xb

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v0

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/16 v2, 0xa

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->U1:I

    :goto_1
    iget v3, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X1:I

    if-gt v2, v3, :cond_3

    .line 7
    invoke-static {v2}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object v3

    .line 8
    iget-boolean v4, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->b2:Z

    if-nez v4, :cond_2

    if-ne v2, v0, :cond_2

    .line 9
    iput-object v3, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->H1:Ljava/lang/String;

    .line 10
    :cond_2
    iget-object v4, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->H1:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_4

    .line 12
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->H1:Ljava/lang/String;

    .line 13
    :cond_4
    iget-boolean v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->b2:Z

    if-nez v0, :cond_5

    .line 14
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->I1:Ljava/lang/String;

    :cond_5
    return-void
.end method

.method private s1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->O1:I

    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->R1:I

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_0
    if-ge v0, v1, :cond_1

    .line 4
    :goto_0
    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->R1:I

    if-gt v0, v1, :cond_2

    .line 5
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6
    :cond_1
    :goto_1
    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->R1:I

    if-lt v0, v1, :cond_2

    .line 7
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 8
    :cond_2
    :goto_2
    iget-boolean v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->b2:Z

    if-nez v0, :cond_5

    .line 9
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    if-ne v0, v1, :cond_5

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V:Ljava/util/ArrayList;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    const/4 v0, 0x0

    .line 11
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->E1:I

    goto :goto_3

    .line 12
    :cond_4
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->E1:I

    :cond_5
    :goto_3
    return-void
.end method


# virtual methods
.method public A1(II)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 2
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->O1:I

    .line 3
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->R1:I

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->s1()V

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Date mode invalid"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public B1(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->b2:Z

    return-void
.end method

.method public C1(IIII)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    if-eqz v0, :cond_3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 3
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->R1:I

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->O1:I

    .line 4
    invoke-direct {p0, v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->i1(I)V

    .line 5
    invoke-direct {p0, v0, p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->g1(II)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->k1(Ljava/util/ArrayList;I)I

    move-result p1

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->F1:I

    .line 7
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X:Ljava/util/ArrayList;

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->k1(Ljava/util/ArrayList;I)I

    move-result p1

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->G1:I

    goto :goto_0

    :cond_0
    if-ne v0, v2, :cond_1

    .line 8
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->i1(I)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->k1(Ljava/util/ArrayList;I)I

    move-result p1

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->E1:I

    .line 10
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->k1(Ljava/util/ArrayList;I)I

    move-result p1

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->F1:I

    .line 11
    :cond_1
    :goto_0
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->N1:I

    const/4 p2, -0x1

    if-eq p1, p2, :cond_2

    .line 12
    invoke-static {p3}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->H1:Ljava/lang/String;

    .line 13
    invoke-static {p4}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->I1:Ljava/lang/String;

    :cond_2
    return-void

    .line 14
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Date mode invalid"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public D1(IIIII)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    if-nez v0, :cond_1

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->i1(I)V

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->g1(II)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p1}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->k1(Ljava/util/ArrayList;I)I

    move-result p1

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->E1:I

    .line 5
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->k1(Ljava/util/ArrayList;I)I

    move-result p1

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->F1:I

    .line 6
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X:Ljava/util/ArrayList;

    invoke-direct {p0, p1, p3}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->k1(Ljava/util/ArrayList;I)I

    move-result p1

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->G1:I

    .line 7
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->N1:I

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    .line 8
    invoke-static {p4}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->H1:Ljava/lang/String;

    .line 9
    invoke-static {p5}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->o(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->I1:Ljava/lang/String;

    :cond_0
    return-void

    .line 10
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Date mode invalid"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public E1(III)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->N1:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    const/16 v3, 0x3b

    if-le p2, v3, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    const/4 v3, 0x4

    if-ne v0, v3, :cond_3

    if-eqz p1, :cond_2

    const/16 v3, 0xc

    if-le p1, v3, :cond_3

    :cond_2
    const/4 v1, 0x1

    :cond_3
    const/4 v3, 0x3

    if-ne v0, v3, :cond_4

    const/16 v0, 0x18

    if-lt p1, v0, :cond_4

    goto :goto_0

    :cond_4
    move v2, v1

    :goto_0
    if-nez v2, :cond_5

    .line 2
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X1:I

    .line 3
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y1:I

    .line 4
    iput p3, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Z1:I

    .line 5
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->r1()V

    return-void

    .line 6
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Time out of range"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Time mode invalid"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public F1(III)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->N1:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    const/16 v3, 0x3b

    if-le p2, v3, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    const/4 v3, 0x4

    if-ne v0, v3, :cond_3

    if-eqz p1, :cond_2

    const/16 v3, 0xc

    if-le p1, v3, :cond_3

    :cond_2
    const/4 v1, 0x1

    :cond_3
    const/4 v3, 0x3

    if-ne v0, v3, :cond_4

    const/16 v0, 0x18

    if-lt p1, v0, :cond_4

    goto :goto_0

    :cond_4
    move v2, v1

    :goto_0
    if-nez v2, :cond_5

    .line 2
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->U1:I

    .line 3
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V1:I

    .line 4
    iput p3, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W1:I

    .line 5
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->r1()V

    return-void

    .line 6
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Time out of range"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Time mode invalid"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected G()Landroid/view/View;
    .locals 14
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    if-ne v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->s1()V

    .line 3
    :cond_1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_2

    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->q1()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->u(Ljava/lang/String;)I

    move-result v0

    .line 5
    invoke-direct {p0, v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->i1(I)V

    .line 6
    :cond_2
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    const/4 v3, 0x2

    if-eqz v0, :cond_3

    if-ne v0, v3, :cond_5

    :cond_3
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_5

    .line 7
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    if-nez v0, :cond_4

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->q1()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->u(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    .line 9
    :cond_4
    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 10
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->o1()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->u(Ljava/lang/String;)I

    move-result v4

    .line 11
    invoke-direct {p0, v0, v4}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->g1(II)V

    .line 12
    :cond_5
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->N1:I

    if-eq v0, v2, :cond_6

    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_6

    .line 13
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->r1()V

    .line 14
    :cond_6
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->N1:I

    if-eq v0, v2, :cond_7

    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_7

    .line 15
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->H1:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->u(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->h1(I)V

    .line 16
    :cond_7
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->N1:I

    if-eq v0, v2, :cond_8

    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->p0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_8

    .line 17
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->I1:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->u(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->j1(I)V

    .line 18
    :cond_8
    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v4, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    invoke-direct {v0, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v4, 0x0

    .line 19
    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v5, 0x11

    .line 20
    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 21
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/c;->l0()Lcom/join/mgps/customview/wheel/picker/WheelView;

    move-result-object v5

    .line 22
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/c;->l0()Lcom/join/mgps/customview/wheel/picker/WheelView;

    move-result-object v6

    .line 23
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/c;->l0()Lcom/join/mgps/customview/wheel/picker/WheelView;

    move-result-object v7

    .line 24
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/c;->l0()Lcom/join/mgps/customview/wheel/picker/WheelView;

    move-result-object v8

    .line 25
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/c;->l0()Lcom/join/mgps/customview/wheel/picker/WheelView;

    move-result-object v9

    .line 26
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/c;->l0()Lcom/join/mgps/customview/wheel/picker/WheelView;

    move-result-object v10

    .line 27
    iget v11, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v13, -0x2

    if-eqz v11, :cond_9

    if-ne v11, v1, :cond_a

    .line 28
    :cond_9
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v4, v13, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v5, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 29
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V:Ljava/util/ArrayList;

    iget v11, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->E1:I

    invoke-virtual {v5, v1, v11}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setItems(Ljava/util/List;I)V

    .line 30
    new-instance v1, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;

    invoke-direct {v1, p0, v6, v7}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$a;-><init>(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;Lcom/join/mgps/customview/wheel/picker/WheelView;Lcom/join/mgps/customview/wheel/picker/WheelView;)V

    invoke-virtual {v5, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setOnItemSelectListener(Lcom/join/mgps/customview/wheel/picker/WheelView$g;)V

    .line 31
    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 32
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->p1:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_a

    .line 33
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/c;->k0()Landroid/widget/TextView;

    move-result-object v1

    .line 34
    iget v5, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->a2:I

    int-to-float v5, v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 35
    iget-object v5, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->p1:Ljava/lang/String;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 37
    :cond_a
    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    if-eq v1, v2, :cond_b

    .line 38
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v4, v13, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v6, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 39
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    iget v5, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->F1:I

    invoke-virtual {v6, v1, v5}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setItems(Ljava/util/List;I)V

    .line 40
    new-instance v1, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;

    invoke-direct {v1, p0, v7}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$b;-><init>(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;Lcom/join/mgps/customview/wheel/picker/WheelView;)V

    invoke-virtual {v6, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setOnItemSelectListener(Lcom/join/mgps/customview/wheel/picker/WheelView$g;)V

    .line 41
    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 42
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->v1:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 43
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/c;->k0()Landroid/widget/TextView;

    move-result-object v1

    .line 44
    iget v5, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->a2:I

    int-to-float v5, v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 45
    iget-object v5, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->v1:Ljava/lang/String;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 47
    :cond_b
    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    if-eqz v1, :cond_c

    if-ne v1, v3, :cond_d

    .line 48
    :cond_c
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v4, v13, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v7, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X:Ljava/util/ArrayList;

    iget v3, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->G1:I

    invoke-virtual {v7, v1, v3}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setItems(Ljava/util/List;I)V

    .line 50
    new-instance v1, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$c;

    invoke-direct {v1, p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$c;-><init>(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)V

    invoke-virtual {v7, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setOnItemSelectListener(Lcom/join/mgps/customview/wheel/picker/WheelView$g;)V

    .line 51
    invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 52
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->A1:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_d

    .line 53
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/c;->k0()Landroid/widget/TextView;

    move-result-object v1

    .line 54
    iget v3, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->a2:I

    int-to-float v3, v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 55
    iget-object v3, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->A1:Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 57
    :cond_d
    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->N1:I

    if-eq v1, v2, :cond_10

    .line 58
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v4, v13, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v8, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 59
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Y:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->H1:Ljava/lang/String;

    invoke-virtual {v8, v1, v2}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setItems(Ljava/util/List;Ljava/lang/String;)V

    .line 60
    new-instance v1, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$d;

    invoke-direct {v1, p0, v9}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$d;-><init>(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;Lcom/join/mgps/customview/wheel/picker/WheelView;)V

    invoke-virtual {v8, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setOnItemSelectListener(Lcom/join/mgps/customview/wheel/picker/WheelView$g;)V

    .line 61
    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 62
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->B1:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_e

    .line 63
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/c;->k0()Landroid/widget/TextView;

    move-result-object v1

    .line 64
    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->a2:I

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 65
    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->B1:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 67
    :cond_e
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v4, v13, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v9, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 68
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Z:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->I1:Ljava/lang/String;

    invoke-virtual {v9, v1, v2}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setItems(Ljava/util/List;Ljava/lang/String;)V

    .line 69
    new-instance v1, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$e;

    invoke-direct {v1, p0, v10}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$e;-><init>(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;Lcom/join/mgps/customview/wheel/picker/WheelView;)V

    invoke-virtual {v9, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setOnItemSelectListener(Lcom/join/mgps/customview/wheel/picker/WheelView$g;)V

    .line 70
    invoke-virtual {v0, v9}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 71
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->C1:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_f

    .line 72
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/c;->k0()Landroid/widget/TextView;

    move-result-object v1

    .line 73
    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->a2:I

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 74
    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->C1:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 76
    :cond_f
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v4, v13, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v10, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 77
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->p0:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->J1:Ljava/lang/String;

    invoke-virtual {v10, v1, v2}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setItems(Ljava/util/List;Ljava/lang/String;)V

    .line 78
    new-instance v1, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$f;

    invoke-direct {v1, p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$f;-><init>(Lcom/join/mgps/customview/wheel/picker/DateTimePicker;)V

    invoke-virtual {v10, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setOnItemSelectListener(Lcom/join/mgps/customview/wheel/picker/WheelView$g;)V

    .line 79
    invoke-virtual {v0, v10}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 80
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->D1:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_10

    .line 81
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/c;->k0()Landroid/widget/TextView;

    move-result-object v1

    .line 82
    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->a2:I

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 83
    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->D1:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    :cond_10
    return-object v0
.end method

.method protected K()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->L1:Lcom/join/mgps/customview/wheel/picker/DateTimePicker$h;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->q1()Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->o1()Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->l1()Ljava/lang/String;

    move-result-object v4

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->m1()Ljava/lang/String;

    move-result-object v5

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->n1()Ljava/lang/String;

    move-result-object v6

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->p1()Ljava/lang/String;

    move-result-object v0

    .line 8
    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    const/4 v7, -0x1

    if-eq v1, v7, :cond_4

    if-eqz v1, :cond_3

    const/4 v0, 0x1

    if-eq v1, v0, :cond_2

    const/4 v0, 0x2

    if-eq v1, v0, :cond_1

    goto :goto_0

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->L1:Lcom/join/mgps/customview/wheel/picker/DateTimePicker$h;

    check-cast v0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$j;

    invoke-interface {v0, v3, v4, v5, v6}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->L1:Lcom/join/mgps/customview/wheel/picker/DateTimePicker$h;

    check-cast v0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$o;

    invoke-interface {v0, v2, v3, v5, v6}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->L1:Lcom/join/mgps/customview/wheel/picker/DateTimePicker$h;

    move-object v1, v0

    check-cast v1, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$m;

    invoke-interface/range {v1 .. v6}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 12
    :cond_4
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->L1:Lcom/join/mgps/customview/wheel/picker/DateTimePicker$h;

    check-cast v1, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$k;

    invoke-interface {v1, v5, v6, v0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker$k;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public l1()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, ""

    return-object v0

    .line 2
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->G1:I

    if-gt v0, v1, :cond_2

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->G1:I

    .line 4
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->X:Ljava/util/ArrayList;

    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->G1:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public m1()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->N1:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->H1:Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public n1()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->N1:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->I1:Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public o1()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->F1:I

    if-gt v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->F1:I

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->W:Ljava/util/ArrayList;

    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->F1:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method public p1()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->N1:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->J1:Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public q1()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, ""

    return-object v0

    .line 2
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->E1:I

    if-gt v0, v2, :cond_2

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->E1:I

    .line 4
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->V:Ljava/util/ArrayList;

    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->E1:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public t1(II)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->R1:I

    .line 3
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->S1:I

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 4
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->S1:I

    .line 5
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->T1:I

    .line 6
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->s1()V

    return-void

    .line 7
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Not support year/month/day mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Date mode invalid"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public u1(III)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 2
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->R1:I

    .line 3
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->S1:I

    .line 4
    iput p3, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->T1:I

    .line 5
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->s1()V

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Date mode invalid"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public v1(II)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->O1:I

    .line 3
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->P1:I

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    .line 4
    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 5
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->R1:I

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->O1:I

    .line 6
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->P1:I

    .line 7
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Q1:I

    .line 8
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->s1()V

    return-void

    .line 9
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Not support year/month/day mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Date mode invalid"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public w1(III)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->M1:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 2
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->O1:I

    .line 3
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->P1:I

    .line 4
    iput p3, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->Q1:I

    .line 5
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->s1()V

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Date mode invalid"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public x1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->p1:Ljava/lang/String;

    .line 2
    iput-object p2, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->v1:Ljava/lang/String;

    .line 3
    iput-object p3, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->A1:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->B1:Ljava/lang/String;

    .line 5
    iput-object p5, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->C1:Ljava/lang/String;

    .line 6
    iput-object p6, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->D1:Ljava/lang/String;

    return-void
.end method

.method public y1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker$h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->L1:Lcom/join/mgps/customview/wheel/picker/DateTimePicker$h;

    return-void
.end method

.method public z1(Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/DateTimePicker;->K1:Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

    return-void
.end method
