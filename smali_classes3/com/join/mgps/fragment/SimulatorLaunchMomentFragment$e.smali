.class Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;
.super Ljava/lang/Object;
.source "SimulatorLaunchMomentFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;

.field private d:Ljava/lang/String;

.field private e:Z

.field private f:Z

.field final synthetic g:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;ILjava/util/List;Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;",
            ">;",
            "Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->g:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->a:I

    .line 3
    iput-object p3, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->b:Ljava/util/List;

    .line 4
    iput-object p4, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->c:Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;

    .line 5
    iput-object p5, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->d:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->a:I

    return p0
.end method


# virtual methods
.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->b:Ljava/util/List;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->c:Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;

    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->e:Z

    return v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->f:Z

    return v0
.end method

.method public g(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->b:Ljava/util/List;

    return-void
.end method

.method public getType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->a:I

    return v0
.end method

.method public h(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->e:Z

    return-void
.end method

.method public i(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->f:Z

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->d:Ljava/lang/String;

    return-void
.end method

.method public k(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->a:I

    return-void
.end method

.method public l(Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->c:Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;

    return-void
.end method
