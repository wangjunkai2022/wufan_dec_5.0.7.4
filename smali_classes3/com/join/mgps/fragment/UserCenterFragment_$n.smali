.class Lcom/join/mgps/fragment/UserCenterFragment_$n;
.super Ljava/lang/Object;
.source "UserCenterFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/UserCenterFragment_;->updateAdapterByNewMsgCount(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/fragment/UserCenterFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/UserCenterFragment_;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/UserCenterFragment_$n;->c:Lcom/join/mgps/fragment/UserCenterFragment_;

    iput p2, p0, Lcom/join/mgps/fragment/UserCenterFragment_$n;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment_$n;->c:Lcom/join/mgps/fragment/UserCenterFragment_;

    iget v1, p0, Lcom/join/mgps/fragment/UserCenterFragment_$n;->b:I

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/UserCenterFragment_;->j0(Lcom/join/mgps/fragment/UserCenterFragment_;I)V

    return-void
.end method
