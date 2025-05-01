.class public final synthetic Lcom/join/mgps/activity/z2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/activity/SimulatorExitPlayActivity;

.field public final synthetic c:Lcom/join/mgps/dto/AppBeanMain;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/activity/SimulatorExitPlayActivity;Lcom/join/mgps/dto/AppBeanMain;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/z2;->b:Lcom/join/mgps/activity/SimulatorExitPlayActivity;

    iput-object p2, p0, Lcom/join/mgps/activity/z2;->c:Lcom/join/mgps/dto/AppBeanMain;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/activity/z2;->b:Lcom/join/mgps/activity/SimulatorExitPlayActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/z2;->c:Lcom/join/mgps/dto/AppBeanMain;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/activity/SimulatorExitPlayActivity;->f0(Lcom/join/mgps/activity/SimulatorExitPlayActivity;Lcom/join/mgps/dto/AppBeanMain;Landroid/view/View;)V

    return-void
.end method
