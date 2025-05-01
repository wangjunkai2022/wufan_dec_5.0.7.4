.class public final Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity$onCreate$1;
.super Ljava/lang/Object;
.source "VASingleGameIndexActivity.kt"

# interfaces
.implements Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity$onCreate$1;->this$0:Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCLickBack()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity$onCreate$1;->this$0:Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method
