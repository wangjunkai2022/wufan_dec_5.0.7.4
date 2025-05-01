.class Lcom/join/mgps/fragment/CommonWebviewFragment$m$z$a;
.super Ljava/lang/Object;
.source "CommonWebviewFragment.java"

# interfaces
.implements Lcom/join/mgps/activity/arena/GameRoomActivity$x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CommonWebviewFragment$m$z;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/CommonWebviewFragment$m$z;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CommonWebviewFragment$m$z;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$z$a;->a:Lcom/join/mgps/fragment/CommonWebviewFragment$m$z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFail(I)V
    .locals 0

    return-void
.end method

.method public onSuccess(II)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$z$a;->a:Lcom/join/mgps/fragment/CommonWebviewFragment$m$z;

    iget-object p2, p1, Lcom/join/mgps/fragment/CommonWebviewFragment$m$z;->c:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iget-object p2, p2, Lcom/join/mgps/fragment/CommonWebviewFragment$m;->a:Lcom/join/mgps/fragment/CommonWebviewFragment;

    iget-object p1, p1, Lcom/join/mgps/fragment/CommonWebviewFragment$m$z;->b:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->Y0(Ljava/lang/String;)V

    return-void
.end method

.method public onSuccess(IILcom/papa91/arc/bean/ButtonBean;)V
    .locals 0

    return-void
.end method
