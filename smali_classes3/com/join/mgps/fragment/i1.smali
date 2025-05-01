.class public final synthetic Lcom/join/mgps/fragment/i1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;

.field public final synthetic c:Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/fragment/i1;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;

    iput-object p2, p0, Lcom/join/mgps/fragment/i1;->c:Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;

    iput p3, p0, Lcom/join/mgps/fragment/i1;->d:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/join/mgps/fragment/i1;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;

    iget-object v1, p0, Lcom/join/mgps/fragment/i1;->c:Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;

    iget v2, p0, Lcom/join/mgps/fragment/i1;->d:I

    invoke-static {v0, v1, v2, p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->b(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;ILandroid/view/View;)V

    return-void
.end method
