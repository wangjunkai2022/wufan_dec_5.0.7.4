.class Lcom/join/mgps/fragment/SimulatorGoldFingerFragment$a;
.super Lcom/join/mgps/base/decoration/UniversalItemDecoration;
.source "SimulatorGoldFingerFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;->V()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

.field final synthetic b:Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

.field final synthetic c:Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment$a;->c:Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;

    iput-object p2, p0, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment$a;->a:Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    iput-object p3, p0, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment$a;->b:Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    invoke-direct {p0}, Lcom/join/mgps/base/decoration/UniversalItemDecoration;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemOffsets(I)Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;
    .locals 0

    .line 1
    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment$a;->a:Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment$a;->b:Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    :goto_0
    return-object p1
.end method
