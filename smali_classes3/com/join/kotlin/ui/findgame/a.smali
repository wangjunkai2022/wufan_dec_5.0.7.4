.class public final synthetic Lcom/join/kotlin/ui/findgame/a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic b:Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/a;->b:Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/a;->b:Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;

    invoke-static {v0, p1}, Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;->V(Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;Landroid/os/Message;)Z

    move-result p1

    return p1
.end method
