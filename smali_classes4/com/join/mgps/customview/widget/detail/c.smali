.class public final synthetic Lcom/join/mgps/customview/widget/detail/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic b:Lcom/join/mgps/customview/widget/detail/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/join/mgps/customview/widget/detail/c;

    invoke-direct {v0}, Lcom/join/mgps/customview/widget/detail/c;-><init>()V

    sput-object v0, Lcom/join/mgps/customview/widget/detail/c;->b:Lcom/join/mgps/customview/widget/detail/c;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/join/mgps/dto/TipBean;

    check-cast p2, Lcom/join/mgps/dto/TipBean;

    invoke-static {p1, p2}, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView;->b(Lcom/join/mgps/dto/TipBean;Lcom/join/mgps/dto/TipBean;)I

    move-result p1

    return p1
.end method
