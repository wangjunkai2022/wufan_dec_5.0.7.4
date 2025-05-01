.class public final synthetic Lcom/join/mgps/activity/m2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/join/mgps/activity/PapaMainFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/activity/PapaMainFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/m2;->b:Lcom/join/mgps/activity/PapaMainFragment;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/join/mgps/activity/m2;->b:Lcom/join/mgps/activity/PapaMainFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/PapaMainFragment;->W(Lcom/join/mgps/activity/PapaMainFragment;)V

    return-void
.end method
