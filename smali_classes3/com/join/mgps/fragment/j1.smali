.class public final synthetic Lcom/join/mgps/fragment/j1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;

.field public final synthetic c:Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;

.field public final synthetic d:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/fragment/j1;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;

    iput-object p2, p0, Lcom/join/mgps/fragment/j1;->c:Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;

    iput-object p3, p0, Lcom/join/mgps/fragment/j1;->d:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;

    iput p4, p0, Lcom/join/mgps/fragment/j1;->e:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lcom/join/mgps/fragment/j1;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;

    iget-object v1, p0, Lcom/join/mgps/fragment/j1;->c:Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;

    iget-object v2, p0, Lcom/join/mgps/fragment/j1;->d:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;

    iget v3, p0, Lcom/join/mgps/fragment/j1;->e:I

    invoke-static {v0, v1, v2, v3, p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->c(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;ILandroid/view/View;)V

    return-void
.end method
